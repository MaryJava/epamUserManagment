package com.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sahak_Babayan on 3/29/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("pages/login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void doLogin() {

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        return new ModelAndView("pages/register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void doRegister() {

    }




}
