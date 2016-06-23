package com.test.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




@Component
public class PersonJDBCDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PersonRowmapper rowmapper;
	
	
	public void save(PersonDTO persondto) {
			jdbcTemplate.update("INSERT INTO Person VALUES(?,?,?,?,?)", 
					persondto.getPid(),persondto.getFname(),persondto.getLname(),persondto.getCity(),persondto.getAddress());
	}
	
	public List<PersonDTO> getAllPersons() {
		List<PersonDTO> plist = jdbcTemplate.query("Select * from Person",rowmapper);
		return plist;
	}
}
