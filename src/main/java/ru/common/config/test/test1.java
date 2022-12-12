package ru.common.config.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test1 {

    @GetMapping("/hello")
    public String say() {
        return "Hello";
    }
}
