package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class OneOhTwoControl {
    public String homepage(Model model){
        model.addAttribute("variableone", "On August 19, 2019 we began the Java Boot Camp in Gaithersburg, MD");
        return "index";
    }
    public String homePage (Model model) {
        model.addAttribute("variabletwo", "It is very cold in the classroom today. I need a snowsuit to stay warm.");
        return "index";
    }
}
