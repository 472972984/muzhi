package com.muzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页展示Controller
 * @author 陈汇奇
 *
 */
@Controller
public class PageController {

	@RequestMapping("/login")
	public String showPageLogin(){
		return "login";
	}
	@RequestMapping("/about_editor")
	public String showPageAbout_editor(){
		return "about_editor";
	}
	@RequestMapping("/about")
	public String showPageAbout(){
		return "about";
	}
	@RequestMapping("/index")
	public String showPageIndex(){
		return "index";
	}
	
}
