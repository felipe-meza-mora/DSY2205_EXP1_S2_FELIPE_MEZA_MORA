package com.tienda.tienda.service;

import com.tienda.tienda.model.User;
import java.util.Optional;
import java.util.List;

public interface UserService {

    // Método para guardar un usuario
    User saveUser(User user);
    // Método para obtener un usuario por su username
    Optional<User> findByUsername(String username);
    // Método para obtener todos los usuarios
    List<User> getAllUsers();
    // Método para eliminar un usuario
    void deleteUser(Long id);
    // Método para el login
    Optional<User> login(String username, String password);
}