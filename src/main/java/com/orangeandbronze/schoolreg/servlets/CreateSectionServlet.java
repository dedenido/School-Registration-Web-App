package com.orangeandbronze.schoolreg.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.orangeandbronze.schoolreg.service.CreateSectionService;


/**
 * Servlet implementation class CreateSectionServlet
 */
@WebServlet("/createSection")
public class CreateSectionServlet extends HttpServlet {
	
	private CreateSectionService service = new CreateSectionService();
		
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("faculty", service.getAllFaculty());
		session.setAttribute("subject", service.getAllSubjects());
		session.setAttribute("days", service.getAllDays());
		session.setAttribute("period", service.getAllPeriod());
		getServletContext().getRequestDispatcher("/WEB-INF/sectioncreation.jsp").forward(request, response);

	}

	
}
