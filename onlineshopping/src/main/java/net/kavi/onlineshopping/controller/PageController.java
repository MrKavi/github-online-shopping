package net.kavi.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		
		//mv.addObject("greeting","welcome to spring web MVC");
		
		return mv;
	}
	
	@RequestMapping(value={"about"})
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		
		//mv.addObject("greeting","welcome to spring web MVC");
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
/*	//@RequestParam
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting)
	{
		if(greeting== null){greeting ="hi there";}
		
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting",greeting);
     
	return mv;	
	}
*/
	
	//@PathVariable
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting)
	{
		if(greeting== null){greeting ="hi there";}
		
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("greeting",greeting);
     
	return mv;	
	}



}