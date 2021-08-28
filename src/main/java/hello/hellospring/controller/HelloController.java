package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("aisatsu") //hello라고 들어오면 이 메서드를 호출
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "aisatsuHtmlFile"; //resources에서 aisatsuHtmlFile.htmldmf 찾아서 반환한다.
    }

    @GetMapping("hello-mvc") //name값은 Get 방식으로 넘겨준다 예시: http://localhost:8080/hello-mvc?name=clearksy77
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //http의 body에 data를 직접 입력하겠다. (html의 body가 아님) Spring이 templates에서 찾지 않는다.
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; //여기 문자열 자체가 그대로 반환된다. (template 사용 없이)
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // 리턴값은 json방식으로 보여진다.
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
