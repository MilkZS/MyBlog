package com.example.demo.client;

import com.example.demo.util.MarkDown2HtmlWrapper;
import com.example.demo.util.MarkdownEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;

@RestController
public class UserController {

    @RequestMapping("/archives")
    public ModelAndView doArchives(){
        return new ModelAndView("/index-archives");
    }

}