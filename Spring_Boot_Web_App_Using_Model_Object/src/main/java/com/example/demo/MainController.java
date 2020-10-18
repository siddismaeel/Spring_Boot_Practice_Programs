package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("home")
	public ModelAndView home(Student st)
	{
		System.out.println("Studnet Information" + st);
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", st);
		mv.setViewName("home.jsp");
	
		
		
		return mv;
	}
}
