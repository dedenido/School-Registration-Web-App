package com.orangeandbronze.schoolreg.service;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.orangeandbronze.schoolreg.dao.FacultyDao;
import com.orangeandbronze.schoolreg.dao.SubjectDao;
<<<<<<< HEAD

import com.orangeandbronze.schoolreg.domain.Faculty;

import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.Period;

=======
import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.EnlistmentConflictException;
import com.orangeandbronze.schoolreg.domain.Faculty;
import com.orangeandbronze.schoolreg.domain.MissingPrerequisitesException;
import com.orangeandbronze.schoolreg.domain.Period;
import com.orangeandbronze.schoolreg.domain.Section;
>>>>>>> a1c9d743673c339d6dca7aae0f572530d0f87bcb
import com.orangeandbronze.schoolreg.domain.Subject;

public class CreateSectionService {
	
	private FacultyDao facultyDao = new FacultyDao();
	private SubjectDao subjectDao = new SubjectDao();
<<<<<<< HEAD
	private Days days = null;

=======
	
>>>>>>> a1c9d743673c339d6dca7aae0f572530d0f87bcb
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
<<<<<<< HEAD
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
=======
		List<Days> daysList = Arrays.asList(Days.values());
>>>>>>> a1c9d743673c339d6dca7aae0f572530d0f87bcb
		return daysList;
	}
	
	public List<Period> getAllPeriod() {
		List<Period> period = Arrays.asList(Period.values());
		return period;
	}


}
