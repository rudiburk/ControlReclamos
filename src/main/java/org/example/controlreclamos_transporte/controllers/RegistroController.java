package org.example.controlreclamos_transporte.controllers;

import org.example.controlreclamos_transporte.entitys.Usuario;
import org.example.controlreclamos_transporte.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public String registrarUsuario(Usuario usuario) {
        userService.register(usuario);
        return "redirect:/login";
    }
}
