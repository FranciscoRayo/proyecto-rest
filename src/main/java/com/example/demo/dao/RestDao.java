package com.example.demo.dao;
/*
 * Nombre Clase: RestDao.java
 * Descripcion: Clase que representa la clase que conecta con la base de datos. 
 * Fecha: 13/05/2021
 * Version: 1.0
 * Autor: Rocio Jimenez Moreno  **/

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Project;

public interface RestDao extends JpaRepository<Project, Integer> {

}
