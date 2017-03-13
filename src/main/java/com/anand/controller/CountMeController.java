package com.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountMeController {

	@RequestMapping(value="/")
	public String index() {
		return("index");
	}
}
