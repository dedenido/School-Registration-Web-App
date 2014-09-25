package com.orangeandbronze.schoolreg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.orangeandbronze.schoolreg.domain.Subject;

public class SubjectDao extends Dao {
	
	public List<Subject> getAll() {
		List<Subject> subjectList = new ArrayList<Subject>();
		Subject subject = null;
		String sql = "SELECT * FROM subjects";
		
		try (Connection conn = getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				subject = new Subject(rs.getString("subject_id"));
				subjectList.add(subject);

			}
		}
		
		catch (SQLException e) {
			handleException(subject, e);
		}
		
		return subjectList;
	}

}

