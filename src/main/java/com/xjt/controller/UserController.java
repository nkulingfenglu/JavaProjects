package com.xjt.controller;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
shdjadkjajfwhjhfscls
fsfsfs
fsfsf
*/
@Controller
@RequestMapping("/se")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/select")
    public ModelAndView selectUser(){
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user", user);
        mv.setViewName("user");
        return mv;
    }
}
