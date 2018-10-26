package com.stackroute.controller;


import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {
    @RequestMapping(value="/employeeForm",method= RequestMethod.GET)
    public ModelAndView employee(){
        ModelAndView model = new ModelAndView("employeeForm");
        return model;
    }

    @RequestMapping(value="/addEmployee",method = RequestMethod.POST)
    public ModelAndView addEmployee(@ModelAttribute("employee")User employee){

        ModelAndView modelAndView = new ModelAndView("employeeDetails");
        return modelAndView;

    }


}
