package com;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class HelloWorldController {

    public static List<List<String>> students = Arrays.asList(
            Arrays.asList("masha", "sasha", "pasha"), Arrays.asList("xi", "jin", "pin"), Arrays.asList("john", "andrew", "scott"));

    @RequestMapping(value = "/getStudents", method = RequestMethod.POST )
    @ResponseBody
    public String getStudents(@RequestParam Integer classID) {
        return students.get(classID-1).toString();
    }


}
