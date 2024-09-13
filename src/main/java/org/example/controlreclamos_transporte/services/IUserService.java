package org.example.controlreclamos_transporte.services;

import org.example.controlreclamos_transporte.entitys.Usuario;

import java.util.List;

public interface IUserService {
    Usuario register(Usuario user);
    List<Usuario> getAll();
    Usuario getById(Long id);
    Usuario create(Usuario user);
    Usuario update(Usuario user);
    void delete(Long id);
}
