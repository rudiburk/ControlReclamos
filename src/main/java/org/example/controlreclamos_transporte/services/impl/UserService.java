package org.example.controlreclamos_transporte.services.impl;


import org.example.controlreclamos_transporte.entitys.Rol;
import org.example.controlreclamos_transporte.entitys.Usuario;
import org.example.controlreclamos_transporte.repositories.UserRepository;
import org.example.controlreclamos_transporte.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Usuario register(Usuario user) {
        Rol role = new Rol();
        role.setId(2L); // Asume que el rol de usuario regular tiene ID 2
        user.setRoles(Collections.singleton(role));
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    @Override
    public List<Usuario> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario create(Usuario user) {
        return userRepository.save(user);
    }

    @Override
    public Usuario update(Usuario user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}