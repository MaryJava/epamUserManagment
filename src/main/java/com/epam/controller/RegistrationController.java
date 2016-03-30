package com.epam.controller;

import com.epam.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Sahak_Babayan on 3/30/2016.
 */
@Controller
public class RegistrationController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(User user) {
        return "pages/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("confirmPassword") String confirmPassword,
                           @Valid User user,
                           BindingResult result) {
        if(result.hasErrors()) {
            return "pages/register";
        }
        return null;
    }

}
