package za.ac.cput.Group19CarWash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping(value= "/")
    public String index(){
        return "index";
    }
}
