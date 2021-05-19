package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Nombre Clase: SwaggerConfig.java Descripcion: Clase que configura Swagger
 * Fecha: 19/05/2021 Version: 1.0 Autor: Francisco Rayo
 * 
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	/**
	 * Swagger es un framework para describir y documentar una API REST La
	 * herramienta Swagger UI Tool permite describir de forma visual esa
	 * documentacion
	 * 
	 **/

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).paths(PathSelectors.any()).build();
	}
}