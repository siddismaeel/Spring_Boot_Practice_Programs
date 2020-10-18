package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		
		session.setAttribute("name", name);
		return "home.jsp";
		
	}

}
