package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RestDao;

@Service
public class RestServiceImpl implements RestService{

	@Autowired
	RestDao restDao;
	
}
