package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// http://localhost:8080 -> / (root)
	@RequestMapping("/")  // 주소줄에 요청
	public String home() {
		return "home";
		// return "/WEB-INF/views/home.jsp";   // home.jsp , Old ver.
		
	}
}