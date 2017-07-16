package com.lkc.ssm.controller1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lkc.ssm.po.Items;



/*
 * 实现注解开发Handler
 */
@Controller
public class ItemsController2{
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception{
		List<Items> itemsList=new ArrayList<Items>();
		//向itemsList中添加数据
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		//指定视图
		//配置了前缀和后缀
		//modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("/items/itemsList");

		return modelAndView;
	}
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		List<Items> itemsList=new ArrayList<Items>();
//		//向itemsList中添加数据
//		Items items_1 = new Items();
//		items_1.setName("联想笔记本");
//		items_1.setPrice(6000f);
//		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//		
//		Items items_2 = new Items();
//		items_2.setName("苹果手机");
//		items_2.setPrice(5000f);
//		items_2.setDetail("iphone6苹果手机！");
//		
//		itemsList.add(items_1);
//		itemsList.add(items_2);
//		//返回ModelAndView
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("itemsList", itemsList);
//		//指定视图
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//		return modelAndView;
//	}

}
