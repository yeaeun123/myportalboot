package com.himedia.myportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mainController {

	@GetMapping
	public String mainpage() {
		return "/WEB-INF/NewFile.jsp";
	}
}
