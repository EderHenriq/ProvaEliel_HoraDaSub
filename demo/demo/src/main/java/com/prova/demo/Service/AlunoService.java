package com.prova.demo.Service;

import com.prova.demo.Model.Aluno;
import com.prova.demo.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;


    public Aluno criarAluno (Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public List<Aluno> ListarTodos(){
        return alunoRepository.findAll();
    }

    public boolean DeletarAluno(Aluno aluno){
        return alunoRepository.deleteById();
    }

    public List<Aluno> EditarAluno (Aluno aluno){
        return alunoRepository
    }
}
