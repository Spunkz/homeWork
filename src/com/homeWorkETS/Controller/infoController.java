package com.homeWorkETS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homeWorkETS.Model.infoModel;
import com.homeWorkETS.Service.infoService;

@Controller
public class infoController{
	@Autowired
	infoService infoservice;
	
	@RequestMapping(value = "/getAllInfo", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllInfo(Model model) {
		
		List<infoModel> infoModelList = infoservice.getAllInfo();
		model.addAttribute("infoModel", new infoModel());
		model.addAttribute("infoModelList", infoModelList);
		return "infoDetails";
	}


	@RequestMapping(value = "/addInfo", method = RequestMethod.GET, headers = "Accept=application/json")
	public String addInfo(@ModelAttribute("infoModel") infoModel infoModel) {	
			
		infoservice.addInfo(infoModel);		
		
		return "redirect:/getAllInfo";
	}

}