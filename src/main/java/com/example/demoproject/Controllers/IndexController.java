package com.example.demoproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")  // URL Mapping
    public String indexView() {
        return "index";
    }

}
