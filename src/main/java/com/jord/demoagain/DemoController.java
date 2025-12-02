package com.jord.demoagain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String greeting(Model mod){
        String name = "Jordan";
        mod.addAttribute("name", name);
        mod.addAttribute("className", "Java");
        mod.addAttribute("classCode", 2545);
        return "Hello";
    }

    @GetMapping("/about")
    public String about(Model mod){
        mod.addAttribute("age", 18);
        return "About";
    }

}
