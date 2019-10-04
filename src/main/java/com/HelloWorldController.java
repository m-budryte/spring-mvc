package com;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class HelloWorldController {

    public static List<ArrayList<String>> students = new ArrayList<ArrayList<String>>();

    @RequestMapping(value = "/init")
    @ResponseBody
    public void init() {
        ArrayList<String> h = new ArrayList<String>();
        h.addAll(Arrays.asList("masha", "sasha", "pasha"));
        students.add(h);

        h = new ArrayList<String>();
        h.addAll(Arrays.asList("xi", "jin", "pin"));
        students.add(h);

        h = new ArrayList<String>();
        h.addAll(Arrays.asList("john", "andrew", "scott"));
        students.add(h);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST )
    @ResponseBody
    public String getStudents(@RequestParam Integer classID) {
        return students.get(classID-1).toString();
    }

    @RequestMapping(value = "/students", method = RequestMethod.DELETE )
    @ResponseBody
    public void delStudents(@RequestParam Integer classID) {
        students.remove(classID-1);
        System.out.println(students);
    }


}
