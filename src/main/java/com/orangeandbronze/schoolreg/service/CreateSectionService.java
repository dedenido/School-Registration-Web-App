package com.orangeandbronze.schoolreg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.orangeandbronze.schoolreg.dao.FacultyDao;
import com.orangeandbronze.schoolreg.dao.SubjectDao;
import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.Faculty;
import com.orangeandbronze.schoolreg.domain.Period;
import com.orangeandbronze.schoolreg.domain.Subject;

public class CreateSectionService {
	
	private FacultyDao facultyDao = new FacultyDao();
	private SubjectDao subjectDao = new SubjectDao();
//	private Days days;
	
	public List<Faculty> getAllFaculty() {
		return facultyDao.getAll();
	}

	public List<Subject> getAllSubjects() {
		return subjectDao.getAll();
	}

	public Object getAllDays() {
		List<Days> daysList = new ArrayList<Days>(Arrays.asList(Days.values()));
		return daysList;
	}

	public Object getAllPeriod() {
		List<Period> period = new ArrayList<Period>(Arrays.asList(Period.values()));
		return period;
	}


}
