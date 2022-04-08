package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
    @GetMapping("/example")
    public String example(){
        return "example";
    }
    @GetMapping("/example2")
    public String example2() {
        return "nibba.jpg";
    }
}
