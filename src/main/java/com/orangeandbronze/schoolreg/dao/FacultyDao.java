package com.orangeandbronze.schoolreg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.orangeandbronze.schoolreg.domain.Faculty;

public class FacultyDao extends Dao {
	
	public List<Faculty> getAll() {
		List<Faculty> facultyList = new ArrayList<Faculty>();
		Faculty faculty = null;
		String sql = "SELECT * FROM faculty";
		
		try (Connection conn = getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				faculty = new Faculty(rs.getInt("faculty_number"));
				facultyList.add(faculty);
			}
		}
		
		catch (SQLException e) {
			handleException(faculty, e);
		}
		
		return facultyList;
	}

}
