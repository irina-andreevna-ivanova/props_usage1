package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String start(ModelMap model){

        model.addAttribute("model_attr1","aaa");


        return "start";
    }
}
