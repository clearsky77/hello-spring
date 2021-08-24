package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("aisatsu") //hello라고 들어오면 이 메서드를 호출
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "aisatsuPage"; //aisatsuPage.html로 연결한다.

    }
}
