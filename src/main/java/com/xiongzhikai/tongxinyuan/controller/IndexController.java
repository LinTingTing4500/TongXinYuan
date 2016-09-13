package com.xiongzhikai.tongxinyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="")
	public String init(){
		return "index";
	}
}
