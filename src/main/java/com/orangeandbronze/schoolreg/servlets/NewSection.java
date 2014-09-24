package com.orangeandbronze.schoolreg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	
//		HttpSession session = request.getSession();
//		
//		String sectionName = (String)session.getAttribute("section");
//		String teacher = (String)session.getAttribute("teacher");
//		String subject = (String)session.getAttribute("subject");
//		String subjectprerequisite = (String)session.getAttribute("subprerequisite");
//		String schedule = (String)session.getAttribute("schedule");
		
		String sectionName = request.getParameter("sectionname");
		String teacher = request.getParameter("teacher");
		String subject = request.getParameter("subject");
		String subjectPrerequisite = request.getParameter("subjectprerequisite");
		String schedule = request.getParameter("schedule");
		
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println(sectionName + " was successfully added with the following details: " );
		writer.println("Teacher: " + teacher);
		writer.println("Subject: " + subject);
		writer.println("subjectprerequisite: " + subjectPrerequisite);
		writer.println("Schedule" + schedule);
		
		writer.flush();
	
	
	}

}
