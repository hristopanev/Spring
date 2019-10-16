package essentials.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    @GetMapping("/login")
    public ModelAttribute login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginConfirm(@ModelAttribute User user) {
        return "redirect:/home?name=" + user.getUsername();
    }
}
