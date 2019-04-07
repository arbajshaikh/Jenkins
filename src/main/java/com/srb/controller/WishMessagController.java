package com.srb.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessagController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	System.out.println("Hi");

System.out.println("Hi");	
	int hour=0;
		String msg=null;
		Calendar cal=null;
		ModelAndView mav=null;
		//get calender
		cal=Calendar.getInstance();
		//get current hour
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12) 
			msg="Good Morning..!!";
		else if(hour<16)
			msg="Good Afternoon..!";
		else if(hour<20)
			msg="Good Evening.";
		else
			msg="Good Night..!!!";
		//create mav object to add more model objects
		mav=new ModelAndView();
		mav.addObject("WishMsg", msg);
		mav.addObject("sysDate",new Date());
		mav.setViewName("wish");
		return mav;
		//return new ModelAndView("wish","WishMsg",msg);
	}

}
