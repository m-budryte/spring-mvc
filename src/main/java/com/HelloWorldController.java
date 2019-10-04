package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/getNames")
    public ModelAndView getNames(ModelAndView modelAndView) {
        List<String> names = Arrays.asList("bob", "bill", "matt");

        modelAndView.setViewName("view");
        modelAndView.addObject("names", names);

        return modelAndView;
    }

}
