package com.orangeandbronze.schoolreg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.orangeandbronze.schoolreg.auth.User;
import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.Period;
import com.orangeandbronze.schoolreg.domain.Schedule;
import com.orangeandbronze.schoolreg.domain.Section;
import com.orangeandbronze.schoolreg.service.CreateSectionService;
import com.orangeandbronze.schoolreg.service.EnlistService.EnlistmentResult;

/**
 * Servlet implementation class NewSection
 */
@WebServlet("/newSection")
public class NewSection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CreateSectionService service = new CreateSectionService();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Section section = null;
				
		String sectionName = request.getParameter("sectionName");
		Integer faculty = Integer.parseInt(request.getParameter("teacher"));
		String subject = request.getParameter("subject");
		String days = request.getParameter("days");
		String period = request.getParameter("period");
		String schedule = days + " " + period;

		try {
			section = service.createSection(sectionName, subject, schedule, faculty);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println(sectionName + " was successfully added with the following details: " );
		writer.println("Teacher: " + faculty);
		writer.println("Subject: " + subject);
		writer.println("Schedule: " + days + " " + period);
		
		writer.flush();
	}

}
