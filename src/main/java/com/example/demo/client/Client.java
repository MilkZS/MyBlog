package com.example.demo.client;

import com.example.demo.util.MarkDown2HtmlWrapper;
import com.example.demo.util.MarkdownEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.HashMap;

@Controller
public class Client {

    @RequestMapping("/about")
    public String helloHtml(HashMap<String, Object> map, Model model) throws IOException {
        String file = "files/test.md";
        MarkdownEntity html = MarkDown2HtmlWrapper.ofFile(file);
        System.out.println(html.toString());
        model.addAttribute("htmlText", html.toString());
        map.put("hello", "欢迎进入HTML页面");
        return "index-about";
    }

}
