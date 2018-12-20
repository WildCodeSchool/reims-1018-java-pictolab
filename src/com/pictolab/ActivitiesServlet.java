package com.pictolab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pictolabjava.ActivityManager;

/**
 * Servlet implementation class activites
 */
@WebServlet("/activites")
public class ActivitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ActivityManager activityManager;
	
       
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
		int id=1;
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/activites.jsp").forward(request,response);
	}

}
