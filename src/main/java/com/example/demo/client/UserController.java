package com.example.demo.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @RequestMapping("/")
    public ModelAndView doIndex(){
        return new ModelAndView("/index");
    }
}