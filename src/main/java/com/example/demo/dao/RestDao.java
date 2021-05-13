package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Project;

public interface RestDao extends JpaRepository<Project, Integer> {

	//public List<Project> getProjects();
}
