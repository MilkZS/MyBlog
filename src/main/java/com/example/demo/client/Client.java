package com.example.demo.client;

import com.example.demo.bean.CategoryBean;
import com.example.demo.bean.CategoryContentBean;
import com.example.demo.bean.CategoryTitleBean;
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
        String file = "files/about.md";
        List<CategoryBean> beanList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CategoryBean titleBean = new CategoryBean();
//            titleBean.setCount(10);
//            titleBean.setTitle("测试标题");
            titleBean.setCategory("Android");
            List<CategoryContentBean> contentBeans = new ArrayList<>();
            CategoryContentBean categoryContentBean1 = new CategoryContentBean();
            categoryContentBean1.setTitle("Android 测试");
            contentBeans.add(categoryContentBean1);
            CategoryContentBean categoryContentBean2 = new CategoryContentBean();
            categoryContentBean2.setTitle("Android 测试2");
            contentBeans.add(categoryContentBean2);
            titleBean.setContentList(contentBeans);
            beanList.add(titleBean);
        }
        model.addAttribute("categoryTitle","Android");
        model.addAttribute("categoryCount",beanList.size());
        model.addAttribute("beans",beanList);
        return "index-category";
    }

}
