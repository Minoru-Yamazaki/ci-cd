package br.com.cicd.inbound.controller;

import br.com.cicd.core.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        User user = new User("Teste", 30);
        model.addAttribute("user", user);
        return "greeting"; // Nome do template (greeting.html)
    }

}
