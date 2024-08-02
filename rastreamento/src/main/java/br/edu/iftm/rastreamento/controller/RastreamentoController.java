package br.edu.iftm.rastreamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.rastreamento.model.Rastreamento;
import br.edu.iftm.rastreamento.service.RastreamentoService;

@RestController
@RequestMapping("/rastreamento")
public class RastreamentoController {
    @Autowired
    public RastreamentoService rastreamentoService;

    // - POST /rastreamentos - Adiciona um novo rastreamento.
    @PostMapping
    public Rastreamento criar(@RequestBody Rastreamento rastreamento){
        return rastreamentoService.criar(rastreamento);
    }

    // - GET /rastreamentos/{id} - Consulta todos os rastreamentos de um pacote específico.
    @GetMapping("/{id}")
    public Rastreamento buscar(@PathVariable Long id){
        return rastreamentoService.buscar(id);
    }

}
