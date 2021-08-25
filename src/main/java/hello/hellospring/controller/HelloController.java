package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("aisatsu") //aisatsu라고 들어오면 이 메서드를 호출
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "aisatsuHtmlFile"; //resources에서 aisatsuHtmlFile.html을 찾아서 반환한다.

    }
}
