package com.admin.newpdfprd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.admin.newpdfprd.test.vo.TestVo;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class TestController {
	
	@RequestMapping(value = "/home")
	public String home() {		
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest() {
		String value = "테스트 String";
		return value;
	}
	
	// test.jsp 와 연동된 부분 START
	@RequestMapping("/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "new_pdf_admin_prd");
		
		List<String> testList = new ArrayList<String>();
		testList.add("Project_LifeCycle_STEP01_Requirement_Analysis");
		testList.add("Project_LifeCycle_STEP02_Design");
		testList.add("Project_LifeCycle_STEP03_Coding");
		testList.add("Project_LifeCycle_STEP04_Test");
		testList.add("Project_LifeCycle_STEP05_Maintenance");
		
		mav.addObject("list", testList);
		return mav;
	}
	// test.jsp 와 연동된 부분 END
	
	// TestVo.java 와 연동된 부분 START	
	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model) {
		
		TestVo testModel = new TestVo("new_pdf_admin_prd", "lkconvergence_chchoi");
		model.addAttribute("testModel", testModel);
		return "thymeleaf/thymeleafTest";
	}
	
	// TestVo.java 와 연동된 부분 END
}
