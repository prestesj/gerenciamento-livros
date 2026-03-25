package com.trabalho.trabalho.repository;

import com.trabalho.trabalho.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
