package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String getHelloWorld(ModelMap modelMap) {
        modelMap.addAttribute("message", "Hi");
        modelMap.addAttribute("message1", "goodbye");

        return "view";
    }

}
