package com.trabalho.trabalho.service;


import com.trabalho.trabalho.entity.Livro;
import com.trabalho.trabalho.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public Livro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}