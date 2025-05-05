package com.exemplo.projeto.controller;

import com.exemplo.projeto.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {

    private final List<Usuario> usuarios = List.of(
        new Usuario(1, "João", "joao@email.com", "99999-1111"),
        new Usuario(2, "Maria", "maria@email.com", "99999-2222"),
        new Usuario(3, "Carlos", "carlos@email.com", "99999-3333"),
        new Usuario(4, "Ana", "ana@email.com", "99999-4444")
    );

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @ResponseBody
    @GetMapping("/getAll")
    public List<Usuario> getAllUsuarios() {
        return usuarios;
    }
}
