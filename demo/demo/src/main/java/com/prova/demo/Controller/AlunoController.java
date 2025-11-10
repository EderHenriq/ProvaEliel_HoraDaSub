package com.prova.demo.Controller;

import com.prova.demo.Model.Aluno;
import com.prova.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping()
    public ResponseEntity<Aluno> CriarALuno(@RequestBody Aluno aluno){
        Aluno novoAluno = alunoService.criarAluno(aluno);
    }

    @GetMapping("api/id")
    public List<Aluno> ListarAluno(@RequestBody Aluno aluno){
        Aluno  = alunoService.ListarTodos();
        return ListarAluno();
    }

    @DeleteMapping
    public List<Aluno> DeletarAluno<@RequestParam Long id>





}
