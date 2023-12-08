package com.alumnione.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: cambiar el valor de retorno por el valor correcto (DTO)
// TODO: agregar la validacion de los datos de entrada
// TODO: implementar la logica de negocio (crear un usuario) 
// TODO: implementar la logica de persistencia (guardar el usuario en la base de datos)
// TODO: implementar la logica de respuesta (retornar el usuario creado)
// TODO: agregar el manejo de excepciones
// TODO: agregar el manejo de errores

@RestController
@RequestMapping("/users") // TODO: cambiar el nombre del recurso
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllUsers() { // TODO: logicamente no es String V:
        return null;
    }

}
