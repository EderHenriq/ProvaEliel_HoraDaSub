package com.prova.demo.Service;

import com.prova.demo.Model.Curso;
import com.prova.demo.Repository.CursoRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private CursoRepository cursoRepository;

    public Curso criarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public List<Curso> ListarCurso(Curso curso){
        return cursoRepository.findAllById(Long curso);
    }

    public Curso DeletarCurso(Long id){
        return cursoRepository.deleteById(Long id);
    }
}

