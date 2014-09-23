package com.everest.sim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		ModelAndView mav = new ModelAndView("main");
		mav.addObject("msg", "hello world!");

		return mav;
	}

	@RequestMapping(value="/board", method = RequestMethod.GET)
	public ModelAndView boardList() {
		ModelAndView mav = new ModelAndView("boardList");

		mav.addObject("title", "testTitle");
		mav.addObject("writer", "testWriter");
		return mav;
	}

	@RequestMapping(value="/read", method = RequestMethod.GET)
	public ModelAndView readPost() {
		ModelAndView mav = new ModelAndView("readPost");

		return mav;
	}

	@RequestMapping(value="/read", method = RequestMethod.GET)
	public ModelAndView writePost() {
		ModelAndView mav = new ModelAndView("readPost");

		return mav;
	}

	@RequestMapping(value="/mod", method = RequestMethod.GET)
	public ModelAndView modPost() {
		ModelAndView mav = new ModelAndView("modifyPost");

		return mav;
	}
}