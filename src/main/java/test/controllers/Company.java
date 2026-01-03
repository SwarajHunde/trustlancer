package test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Company {

	@RequestMapping("/RegisterCompany")
	public String registerPage()
	{
		return "RegisterCompany";
	}
}
