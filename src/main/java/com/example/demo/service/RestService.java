package com.example.demo.service;

/*
 * Nombre Clase: RestService.java
 * Descripcion: Clase que contiene los métodos de la capa Service.
 * Fecha: 11/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

import java.util.List;

import com.example.demo.model.Project;

public interface RestService {

	public List<Project> getProjects();

	public Project findById(Integer id);

}
