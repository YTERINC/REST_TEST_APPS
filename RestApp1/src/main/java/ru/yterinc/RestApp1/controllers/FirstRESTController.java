package ru.yterinc.RestApp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // тоже самое, что @Controller +  @ResponseBody на каждым методом
@RequestMapping("/api")
public class FirstRESTController {

    //    @ResponseBody // без этой анотации Spring искал такой шаблон в каталоге
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";

    }


}
