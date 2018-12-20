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

/**
 * Servlet implementation class activites
 */
@WebServlet("/activites")
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivityManager activityManager;
	private ArrayList<Activity> activitiesByTag;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivitiesServlet() {
        super();
        this.activityManager = new ActivityManager();
        this.activitiesByTag=new ArrayList<Activity>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlName = request.getParameter("tag");
		this.activitiesByTag=this.activityManager.getActivityByTag(urlName);
				
		request.setAttribute("activities", this.activitiesByTag);
	
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/activities.jsp").forward(request,response);
	}

}
