package com.orangeandbronze.schoolreg.service;

import java.util.Arrays;
import java.util.List;

import com.orangeandbronze.schoolreg.dao.FacultyDao;
import com.orangeandbronze.schoolreg.dao.SectionDao;
import com.orangeandbronze.schoolreg.dao.SubjectDao;
import com.orangeandbronze.schoolreg.domain.Faculty;
import com.orangeandbronze.schoolreg.domain.Days;
import com.orangeandbronze.schoolreg.domain.Period;
import com.orangeandbronze.schoolreg.domain.Schedule;
import com.orangeandbronze.schoolreg.domain.Section;
import com.orangeandbronze.schoolreg.domain.Subject;

public class CreateSectionService {
	
	private FacultyDao facultyDao = new FacultyDao();
	private SubjectDao subjectDao = new SubjectDao();
	private SectionDao sectionDao = new SectionDao();
	
	Section section = null;
	Schedule schedule = null;
	
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
		List<Days> daysList = Arrays.asList(Days.values());
		return daysList;
	}
	
	public List<Period> getAllPeriod() {
		List<Period> period = Arrays.asList(Period.values());
		return period;
	}

//	public void createSection () {
//		sectionDao.createSection(sectionsectionNumber, subject, schedule, faculty)
//	}
}
