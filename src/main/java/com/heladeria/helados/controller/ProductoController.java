package com.heladeria.helados.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProductoController {

    @GetMapping("/hola/{nombre}")
    public ResponseEntity<String> holaMundo(@PathVariable String nombre) {

        return new  ResponseEntity<>("Hola mundo "+nombre, HttpStatus.OK);
    }
}