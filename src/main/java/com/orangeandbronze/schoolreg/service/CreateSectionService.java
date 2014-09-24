package com.orangeandbronze.schoolreg.service;

import java.util.List;

import com.orangeandbronze.schoolreg.dao.FacultyDao;
import com.orangeandbronze.schoolreg.domain.Faculty;

public class CreateSectionService {
	
	private FacultyDao facultyDao = new FacultyDao();
	
	public List<Faculty> getAllFaculty() {
		return facultyDao.getAll();
	}

}
