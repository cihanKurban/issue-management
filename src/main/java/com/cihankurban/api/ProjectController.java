package com.cihankurban.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cihankurban.dto.ProjectDto;
import com.cihankurban.service.impl.ProjectServiceImpl;

@RestController
@RequestMapping("/project")
public class ProjectController {

	/*
	 * Http Metodları GET POST PUT DELETE
	 */

	private final ProjectServiceImpl projectServiceImpl;

	public ProjectController(ProjectServiceImpl projectServiceImpl) {
		this.projectServiceImpl = projectServiceImpl;
	}

	// Normalde entity dönmemiz gerekirdi fakat biz dış dünya ile güvenlik açısından
	// dto'lar ile iletişime geçicez.
	// ResponseEntity bizim api metodlarımızın yada tüm web servislerimizde
	// geliştireceğimiz metodlarımızın api'larımızın dışarıda ortak bir imzaya sahip
	// olması için kullanıyoruz.
	@GetMapping("/{id}") // /localhost:8080/project/3 -> dendiğinde id numrasını path variable olarak
							// alacak bunuda getById'ye parametre olarak anotation ekleyerek yapacağız.
	public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id) { // @PathVariable ile id alınır
		ProjectDto projectDto = projectServiceImpl.getById(id);
		return ResponseEntity.ok(projectDto);
	}
}
