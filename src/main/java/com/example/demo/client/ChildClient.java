package com.example.demo.client;

import com.example.demo.bean.SearchBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChildClient {

    @ResponseBody
    @RequestMapping(value="/search",method= RequestMethod.POST)
    public String doSearch(@ModelAttribute SearchBean bean){
        System.out.println("search article = " + bean.getArticle());
        return "还在搭建中";
    }

}
