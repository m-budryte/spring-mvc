package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/getNumbers")
    public ModelAndView getNames(ModelAndView modelAndView) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        modelAndView.setViewName("view");
        modelAndView.addObject("numbers", numbers);

        return modelAndView;
    }

}
