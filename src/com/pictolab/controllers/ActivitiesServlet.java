package com.pictolab.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pictolab.beans.Activity;
import com.pictolab.models.ActivityManager;
import com.pictolab.models.ActivityTagManager;

/**
 * Servlet implementation class activites
 */
@WebServlet("/activites")
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivityManager activityManager;
	private ActivityTagManager activityTagManager;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivitiesServlet() {
        super();
        this.activityManager = new ActivityManager();
        this.activityTagManager = new ActivityTagManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tagId = Integer.parseInt(request.getParameter("tag"));
		
        ArrayList<Activity> activitiesByTag=new ArrayList<Activity>();
        for(var join : this.activityTagManager.getJoins().get(tagId)) {
    		activitiesByTag.add(this.activityManager.getActivityById(join));
        }

		request.setAttribute("activities", activitiesByTag);
	
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/activities.jsp").forward(request,response);
	}

}
