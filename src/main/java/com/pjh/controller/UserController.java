package com.pjh.controller;

import com.pjh.entity.Emp;
import com.pjh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getuser")
    @ResponseBody
    public ModelAndView getuser(){
        ArrayList<Emp> emps = userService.getuser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("empinfo",emps);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @ResponseBody
    public ModelAndView getpassword(){
        
        return null;
    }
}
