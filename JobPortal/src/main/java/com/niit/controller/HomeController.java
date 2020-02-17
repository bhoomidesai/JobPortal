package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.JobsDAO;
import com.niit.model.Jobs;

@Controller
public class HomeController {
	@Autowired
	JobsDAO jobDAO ;

	@RequestMapping(value = "/")
	public String gotoHome(Model model){
		model.addAttribute("job", new Jobs());
		return "index";
	}
	@PostMapping(value = "/insert")
	public String go(@ModelAttribute ("job") Jobs job1,BindingResult bindingResult, Model model){
		jobDAO.insertJob(job1);	
		
		return "/";
	}


}
