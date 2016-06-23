package com.test.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class PersonRowmapper implements RowMapper<PersonDTO>{

	@Override
	public PersonDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersonDTO dto=new PersonDTO();
		dto.setPid(rs.getInt("pid"));
		dto.setFname(rs.getString("fname"));
		dto.setLname(rs.getString("lname"));
		dto.setCity(rs.getString("city"));
		dto.setAddress(rs.getString("address"));
		return dto;
	}
	
	
}
