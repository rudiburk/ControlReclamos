package org.example.controlreclamos_transporte.repositories;

import org.example.controlreclamos_transporte.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}