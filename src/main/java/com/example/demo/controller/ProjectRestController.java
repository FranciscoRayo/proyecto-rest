package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Project;
import com.example.demo.service.RestService;

/*
 * Nombre Clase: ProjectRestController.java
 * Descripcin: Clase que representa al controlador rest del proyecto 
 * Fecha: 13/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

@RestController
public class ProjectRestController {

	@Autowired
	RestService restServ;
	
	@GetMapping(path="/backoffice/proyectos")
	public List<Project> listProjectRest() {
		return restServ.getProjects();
	}
	
	@GetMapping(path="/backoffice/proyectos/{id}")
	public Project detailProject(@PathVariable Integer id) {
		Project project = restServ.findById(id);
		return project;
	}
	
	
	
}

