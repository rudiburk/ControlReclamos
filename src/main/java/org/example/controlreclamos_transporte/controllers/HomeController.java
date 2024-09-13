package org.example.controlreclamos_transporte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login";  // Devuelve la vista login.html
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";  // Devuelve la vista registro.html
    }

    @GetMapping("/home")
    public String home() {
        return "home";  // Devuelve la vista home.html
    }
}
