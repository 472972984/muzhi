package com.muzhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * 商品列表Controller
 * @author 陈汇奇
 *
 */
@Controller
public class ItemController {

	@RequestMapping("/add/item")
	public String createItem(String menuId,String names , String price, double discount,Integer nums ,MultipartFile uploadPic,String desc){
		/**
		 * 商品类别数据库同步：读取
		 * desc:需要同步kindeditor
		 * 数据校验
		 */
		System.out.println("来过了");
		return null;
	}
	
}
