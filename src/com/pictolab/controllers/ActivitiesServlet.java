package com.pictolab.controllers;

import java.io.IOException;
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
	private Activity activity1;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivitiesServlet() {
        super();
        activityManager = new ActivityManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlName="mental";
		activity1=this.activityManager.getActivityByTag(urlName);
		String title1=this.activity1.getTitle();
		
		request.setAttribute("activity1Title", title1);
	
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/activities.jsp").forward(request,response);
	}

}
