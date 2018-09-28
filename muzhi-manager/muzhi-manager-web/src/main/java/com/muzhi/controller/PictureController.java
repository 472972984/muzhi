package com.muzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传Controller
 * @author 陈汇奇
 *
 */
@Controller
public class PictureController {
	
	
	@RequestMapping("/pic/uploadPic")
	public String uploadPicture(MultipartFile uploadFile){
		System.out.println("上传图片");
		return "login";
	}
	

}
