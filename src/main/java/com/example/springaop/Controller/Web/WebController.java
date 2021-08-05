package com.example.springaop.Controller.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class WebController {

    @GetMapping("")
    public ModelAndView redirectSwaggerUi(){
        return new ModelAndView("redirect:/swagger-ui.html");
    }
}
