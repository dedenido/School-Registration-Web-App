package com.orangeandbronze.schoolreg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.orangeandbronze.schoolreg.dao.FacultyDao;
import com.orangeandbronze.schoolreg.dao.SubjectDao;

import com.orangeandbronze.schoolreg.domain.Faculty;

import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.Period;

import com.orangeandbronze.schoolreg.domain.Subject;

public class CreateSectionService {
	
	private FacultyDao facultyDao = new FacultyDao();
	private SubjectDao subjectDao = new SubjectDao();
	private Days days = null;

	public List<Faculty> getAllFaculty() {
		return facultyDao.getAll();
	}
	
	public List<Subject> getSubjects() {
		return subjectDao.getAll();
	}

	public List<Subject> getAllSubjects() {
		return subjectDao.getAll();
	}

	public List<Days> getAllDays() {
//		
		List<Days> daysList = new ArrayList<Days>(Arrays.asList(Days.values()));
		
		Days MTH = Days.MTH;
		Days TF = Days.TF;
		Days WS = Days.WS;
		String[] daysArray = null;
	
		daysList.addAll(Days.MTH.getDayName());
		daysArray[0] = Days.MTH.getDayName();
		daysArray[1] = Days.TF.getDayName();
		daysArray[2] = Days.WS.getDayName();
		
		for (int i = 0; i <= daysArray.length; i++) {
			daysList.add(daysArray[i]);
		}
		System.out.println(daysArray);
		return daysList;
	}

	public Object getAllPeriod() {
		List<Period> period = new ArrayList<Period>(Arrays.asList(Period.values()));
		return period;
	}


}
