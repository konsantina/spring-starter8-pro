package gr.aueb.cf.spring_starter8_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starter") // base url toi controller
public class HelloController {

    @GetMapping("/hello")
    public String SayHello(Model model) {
        model.addAttribute("message", "HelloCoding");
            return "index";

    }
}
