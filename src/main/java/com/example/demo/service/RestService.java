package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface RestService {

	public List<Project> getProjects();

	public Project findById(Integer id);

}
