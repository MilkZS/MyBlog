package com.example.demo.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class WriteClient {

    @RequestMapping("/write")
    public String doWriteFile(HashMap<String, Object> map, Model model){
        return "index-write-file";
    }
}
