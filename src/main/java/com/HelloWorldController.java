package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String getHelloWorld(Model model) {
        Map map = new HashMap();
        map.put("message1", "goodbyeWorld");

        model.addAttribute("message", "helloWorld");

        model.mergeAttributes(map);
        return "view";
    }

}
