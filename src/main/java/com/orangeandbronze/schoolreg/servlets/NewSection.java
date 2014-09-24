package com.orangeandbronze.schoolreg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orangeandbronze.schoolreg.auth.User;
import com.orangeandbronze.schoolreg.service.EnlistService.EnlistmentResult;

/**
 * Servlet implementation class NewSection
 */
@WebServlet("/newSection")
public class NewSection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		HttpSession session = request.getSession();

		String sectionName = (String)request.getAttribute("sectionname");
		String faculty = (String)request.getAttribute("teacher");
		String subject = (String)request.getAttribute("subject");
		String days = (String)request.getAttribute("days");
		String period = (String)request.getAttribute("period");
		
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println(sectionName + " was successfully added with the following details: " );
		writer.println("Teacher: " + faculty);
		writer.println("Subject: " + subject);
		writer.println("Schedule: " + days + " " + period);
		
		writer.flush();
	
//	
//		session.setAttribute("result", result);
//		response.sendRedirect(getServletContext().getContextPath() + "/enlistmentResult.jsp");
//			
//		}
		
		
		
	}

}
