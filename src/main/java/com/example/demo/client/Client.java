package com.example.demo.client;

import com.example.demo.bean.CategoryBean;
import com.example.demo.bean.CategoryContentBean;
import com.example.demo.bean.CategoryTitleBean;
import com.example.demo.impl.MDCategory;
import com.example.demo.util.MarkDown2HtmlWrapper;
import com.example.demo.util.MarkdownEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class Client {

    @RequestMapping("/about")
    public String aboutHtml(HashMap<String, Object> map, Model model) throws IOException {
        String file = "files/about.md";
        MarkdownEntity html = MarkDown2HtmlWrapper.ofFile(file);
        model.addAttribute("htmlText", html.toString());
        return "index-about";
    }

    @RequestMapping("/category")
    public String categoryHtml(HashMap<String, Object> map, Model model) {
        MDCategory category = new MDCategory();
        List<CategoryBean> beanList = category.getFile();
        model.addAttribute("beans", beanList);
        return "index-category";
    }

    @RequestMapping("/categoryPage")
    public String doIndexCategoryPage(String child,String parent, HashMap<String, Object> map, Model model) throws IOException {
        String file = "files/" + parent + "/" + child;
        System.out.println("receive file = " + file);
        MarkdownEntity html = MarkDown2HtmlWrapper.ofFile(file);
        model.addAttribute("pageContent",html);
        return "index-category-page";
    }

}





















