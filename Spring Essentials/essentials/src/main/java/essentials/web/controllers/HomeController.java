package essentials.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(ModelAndView model) {
        model.addObject("user", new User("pesho", "pesho@mail.com", 33));

        model.setViewName("index");

        return model;
    }

    @GetMapping("home")
    @ResponseBody
    public String home(@RequestParam(name = "name") String name) {
        return "Hi, " + name;
    }
}
