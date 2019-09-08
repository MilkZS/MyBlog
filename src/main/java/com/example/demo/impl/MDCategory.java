package com.example.demo.impl;

import com.example.demo.bean.CategoryBean;
import com.example.demo.bean.CategoryContentBean;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MDCategory {

    public List<CategoryBean> getFile() {
        List<CategoryBean> categoryBeans = new ArrayList<>();

        File file = new File("G:\\Github\\blog\\MyBlog\\src\\main\\resources\\files");
        if (!file.exists()) {
            return categoryBeans;
        }

        String[] files = file.list();
        if (files == null || files.length == 0) return categoryBeans;

        System.out.println("size = " + files.length);

        for (String f : files) {
            System.out.println("file name = " + f);
            File fChild = new File(file.getPath(), f);
            if (fChild.isDirectory()){
                CategoryBean bean = new CategoryBean();
                bean.setCategory(fChild.getName());
                List<CategoryContentBean> beanList = getChildContent(fChild.getPath());
                bean.setContentList(beanList);
                categoryBeans.add(bean);
            }
        }
        return categoryBeans;
    }

    private List<CategoryContentBean> getChildContent(String path){
        List<CategoryContentBean> contentBeans = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()){
            return contentBeans;
        }

        String[] files = file.list();
        if (files == null || files.length == 0) return contentBeans;

        for (String f:files) {
            File fChild = new File(file.getPath(),f);
            if (fChild.isFile()){
                CategoryContentBean contentBean = new CategoryContentBean();
                contentBean.setTitle(fChild.getName());
                contentBean.setUrl(fChild.getName());
                contentBeans.add(contentBean);
            }
        }
        return contentBeans;
    }
}
