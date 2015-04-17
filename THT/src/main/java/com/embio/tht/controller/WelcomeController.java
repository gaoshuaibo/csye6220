package com.embio.tht.controller;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.embio.tht.beans.*;
import com.embio.tht.common.Checker;
import com.embio.tht.common.DaoPool;
import com.embio.tht.common.ModelFactory;
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class WelcomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(Locale locale, Model model) {

		return "redirect:welcome";
	}
	
	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String homeLoggedIn(
			@RequestParam(value="userid", required=false) String _userid,
			Locale locale,
			Model model) {
		
		if(_userid != null){
			int userid = Integer.parseInt(_userid);
			UserInfo ui = Checker.isUserLoggedIn(userid);
			if(ui!=null)
				model.addAttribute("user", ui );
		}
		
		List<Dish> temps = DaoPool.getDishDao().getAll();
		List<Dish> dishes = new ArrayList<Dish>();
		for(Dish temp:temps){
			dishes.add(ModelFactory.getDish(temp.getId()));
		}
		
		model.addAttribute("dishes", dishes );

		
		return "view_welcome";
	}
}