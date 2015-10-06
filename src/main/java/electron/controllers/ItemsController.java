package electron.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemsController {

    @RequestMapping("/allItems")
    public String allItems( Model model) {
        model.addAttribute("name", "abc");
        return "greeting";
    }

}