package com.dgrm.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dgrm.test.service.IMyService;

@Controller
public class MyController {

	@Autowired
	IMyService service;
	
	@RequestMapping("/")
	public String start() {
		
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		
		model.addAttribute("list", service.list());
		return "list";
	}
}
