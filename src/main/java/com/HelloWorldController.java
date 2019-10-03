package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public ModelAndView getHelloWorld() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("view");
        modelAndView.addObject("message", "Hello, World!");

        return modelAndView;
    }

}
