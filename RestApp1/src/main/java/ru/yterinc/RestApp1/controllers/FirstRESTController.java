package ru.yterinc.RestApp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FirstRESTController {

    @ResponseBody // без этой анотации Spring искал такой шаблон в каталоге
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";

    }


}
