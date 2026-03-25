package com.trabalho.trabalho.controller;

import com.trabalho.trabalho.entity.Livro;
import com.trabalho.trabalho.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService service;

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}