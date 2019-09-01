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

    @RequestMapping("/about")
    public ModelAndView doAbout(){
        return new ModelAndView("/index-about");
    }

    @RequestMapping("/archives")
    public ModelAndView doArchives(){
        return new ModelAndView("/index-archives");
    }

    @RequestMapping("/category")
    public ModelAndView doCategory(){
        return new ModelAndView("/index-category");
    }
}