package com.example.demo.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryBean {

    private String category;
    private List<CategoryContentBean> contentList = new ArrayList<>();

}
