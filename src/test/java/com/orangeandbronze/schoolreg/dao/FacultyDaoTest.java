package com.orangeandbronze.schoolreg.dao;

import static org.junit.Assert.assertNotNull;

import java.io.FileReader;
import java.util.List;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;

import com.orangeandbronze.schoolreg.domain.Faculty;

public class FacultyDaoTest extends DBTestCase {
	
	private FacultyDao facultyDao;

	public FacultyDaoTest() {
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS,"com.mysql.jdbc.Driver");
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL,"jdbc:mysql://localhost:3306/school_registration"); 
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME,"root");
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD,"");
	}
	
	public void testGetAll() {
		FacultyDao dao = new FacultyDao();
		List<Faculty> facultyList = dao.getAll();
		
		assertNotNull(dao.getAll());
		assertNotNull(facultyList.size());
	
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileReader("src/test/SectionDaoTest.xml"));
	}
	
//	public void testConnection() {
//		assertNotNull(System.getProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL));
//	}
}
