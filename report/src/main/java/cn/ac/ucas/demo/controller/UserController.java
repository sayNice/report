package cn.ac.ucas.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value="demoJump")
	public String demoJump(){
		return "test1";
	}
}
