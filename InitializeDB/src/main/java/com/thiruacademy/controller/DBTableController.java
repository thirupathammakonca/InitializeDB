package com.thiruacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiruacademy.entity.DBTable;
import com.thiruacademy.service.DBTableService;

@RestController
@RequestMapping("/data")
public class DBTableController {
	@Autowired
	private DBTableService service;
	
	@GetMapping
	public List<DBTable> fetchALl(){
		return service.getAll();
	}
}
