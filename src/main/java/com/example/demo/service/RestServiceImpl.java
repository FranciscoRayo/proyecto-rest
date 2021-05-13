package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.RestDao;
import java.util.List;
import com.example.demo.model.Project;

@Service
public class RestServiceImpl implements RestService{

	@Autowired
	RestDao restDao;
	
	@Override
	public List<Project> getProjects() {
		return restDao.findAll();
	}
}
