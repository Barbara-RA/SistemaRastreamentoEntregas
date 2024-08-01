package br.edu.iftm.rastreamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.rastreamento.model.Endereco;
import br.edu.iftm.rastreamento.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    public EnderecoService enderecoService;

    // - GET /enderecos - Consulta todos os endereços.
    @GetMapping("/{id}")
    public Endereco buscar(@PathVariable Long id) {
        return enderecoService.buscar(id);
    }

    // - POST /enderecos - Adiciona um novo endereço.

}
