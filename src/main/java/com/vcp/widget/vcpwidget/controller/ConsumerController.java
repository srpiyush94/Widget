package com.vcp.widget.vcpwidget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.vcp.widget.vcpwidget.model.Consumer;

@Controller
public class ConsumerController {
	
	     @GetMapping("/greeting")
	     public String greeting( @ModelAttribute("consumer")Consumer consumer,Model model) {
	    	 
	    	 model.addAttribute("consumer", consumer);
	       
	        return "consumer";
	    }
	

}
