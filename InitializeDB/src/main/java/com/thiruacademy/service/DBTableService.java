package com.thiruacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiruacademy.entity.DBTable;
import com.thiruacademy.repository.DBTableRepository;

@Service
public class DBTableService {
	@Autowired
	private DBTableRepository repo;
	
	public List<DBTable> getAll(){
		return repo.findAll();
	}
}
