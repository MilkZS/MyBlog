package com.example.demo.client;


import com.example.demo.util.MarkDown2HtmlWrapper;
import com.example.demo.util.MarkdownEntity;

import java.io.IOException;

public class tes {

    public static void main(String[] args) throws IOException {
        String file = "files/test.md";
        MarkdownEntity html = MarkDown2HtmlWrapper.ofFile(file);
        System.out.println(html.toString());
    }

}
