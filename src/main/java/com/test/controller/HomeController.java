package com.test.controller;

/**
 * Created by Antonella on 7/21/17.
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {

        String name = "Antonella";


        return new
                ModelAndView("index", "developerName", name);

    }

    @RequestMapping("/form")
    // the String method returns the jsp page that we want to show
    public String htmlForm() {

        return "htmlform";
    }

    @RequestMapping("/success")
    // model is a parameter that allows us to add stuff to our jsp
    // RequestParam allows us to take in data from the form -- we must assign a type and a variable with it
    public String formSuccess(Model model, @RequestParam("c_name") String name,
                              @RequestParam("c_type") String coffeeType,
                              @RequestParam("options") String option,
                              @RequestParam("gender") String gender) {


        // add the values to the jsp using the model and addAttribute method
        model.addAttribute("userName", name);
        model.addAttribute("coffeeChoice", coffeeType);
        model.addAttribute("coffeeOption", option);
        model.addAttribute("genderSelected", gender);


        return "formsuccess";
    }

}
