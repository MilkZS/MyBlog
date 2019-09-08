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

    @RequestMapping("/")
    public ModelAndView doIndex(){
        return new ModelAndView("/index");
    }

//    @RequestMapping("/about")
//    public String helloHtml(HashMap<String, Object> map, Model model) {
//        model.addAttribute("htmlText","欢迎欢迎,热烈欢迎");
//        map.put("hello", "欢迎进入HTML页面");
//        return "index-about";
//    }

//    @RequestMapping("/about")
//    public ModelAndView doAbout() throws IOException {
//        ModelAndView view = new ModelAndView("/index-about");
//        String file = "files/test.md";
//        MarkdownEntity html = MarkDown2HtmlWrapper.ofFile(file);
//        System.out.println(html.toString());
//        ModelMap modelMap = new ModelMap();
//        modelMap.addAttribute("htmlText",html.toString());
//        view.addAllObjects(modelMap);
//        return view;
//    }

    @RequestMapping("/archives")
    public ModelAndView doArchives(){
        return new ModelAndView("/index-archives");
    }

//    @RequestMapping("/category")
//    public ModelAndView doCategory(){
//        return new ModelAndView("/index-category");
//    }
}