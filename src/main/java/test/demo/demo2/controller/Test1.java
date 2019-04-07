package test.demo.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1 {
    @RequestMapping("/hello")
    @ResponseBody
   public  String test1(){

       return "hello";
   }

}
