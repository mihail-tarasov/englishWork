package ru.mihail.tarasov.englishWork.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","Главная страница");
        return "home";
    }
}
