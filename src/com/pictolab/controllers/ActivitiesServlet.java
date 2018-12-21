package com.pictolab.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pictolab.beans.Activity;
import com.pictolab.beans.Tag;
import com.pictolab.models.ActivityManager;
import com.pictolab.models.ActivityTagManager;
import com.pictolab.models.TagManager;

/**
 * Servlet implementation class activites
 */
@WebServlet("/activites")
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivityManager activityManager;
	private ActivityTagManager activityTagManager;
	private TagManager tagManager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivitiesServlet() {
        super();
        this.activityManager = new ActivityManager();
        this.activityTagManager = new ActivityTagManager();
        this.tagManager= new TagManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tagId = Integer.parseInt(request.getParameter("tag"));
		if (tagId!=7) {
			ArrayList<Activity> activitiesByTag=new ArrayList<Activity>();
			for(var join : this.activityTagManager.getJoins().get(tagId)) {
				activitiesByTag.add(this.activityManager.getActivityById(join));
			}
			Tag tag= this.tagManager.getTagById(tagId);
			String tagTitle=tag.getTitle();
			request.setAttribute("activities", activitiesByTag);
			request.setAttribute("tag", tagTitle);
				
			this.getServletContext().getRequestDispatcher("/WEB-INF/activities.jsp").forward(request,response);
		}
		else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/contact.jsp").forward(request,response);
		}
	}

}
