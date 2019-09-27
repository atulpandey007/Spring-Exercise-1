package com.stackroute.controller;




import com.stackroute.controller.User;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RequestMapping("")
@Controller
public class UserController {

    @RequestMapping("")
    public String display(ModelMap model)
    {
        User user = new User("Atul");
        model.addAttribute("output", user.getName());
        return "index";
    }

}