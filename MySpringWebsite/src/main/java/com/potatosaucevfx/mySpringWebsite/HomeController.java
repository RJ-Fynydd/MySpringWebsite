package com.potatosaucevfx.mySpringWebsite;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/serverInfo", method = RequestMethod.GET)
	public String serverInfo(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String serverDate = dateFormat.format(date);
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, locale);
		String serverTime = dateFormat.format(date);
		
		long serverRAM = Runtime.getRuntime().freeMemory();
				
		long serverDiskSize = new File("/").getTotalSpace();
		
		
		model.addAttribute("serverDate", serverDate);
		model.addAttribute("serverTime", serverTime);
		model.addAttribute("serverRAM", serverRAM + " bytes");
		model.addAttribute("serverDiskSize", serverDiskSize + " bytes");
		
		return "serverInfo";
	}
	
}
