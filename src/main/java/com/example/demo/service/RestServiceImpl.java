package com.example.demo.service;

/*
 * Nombre Clase: RestServiceImpl.java
 * Descripcion: Clase que implementa los métodos de la capa Service.
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.RestDao;
import java.util.List;
import com.example.demo.model.Project;

@Service
public class RestServiceImpl implements RestService {

	@Autowired
	RestDao restDao;

	@Override
	public List<Project> getProjects() {
		return restDao.findAll();
	}

	@Override
	public Project findById(Integer id) {
		return restDao.findById(id).orElse(null);
	}

}
