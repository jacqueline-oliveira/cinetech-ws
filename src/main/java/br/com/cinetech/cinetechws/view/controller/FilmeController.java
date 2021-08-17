package br.com.cinetech.cinetechws.view.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cinetech.cinetechws.service.FilmeService;
import br.com.cinetech.cinetechws.shared.FilmeDto;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    @Autowired
    FilmeService servico; 

    @GetMapping
    public List<FilmeDto> listarFilmes(){
        return servico.listarFilmes();
    }

    @PostMapping
    public FilmeDto criarFilme(@RequestBody FilmeDto filme) {
        return servico.criarFilme(filme);
    }

    @PutMapping(value = "/{id}")
    public FilmeDto atualizarFilme(@PathVariable String id, @RequestBody FilmeDto filme) {
        Optional<FilmeDto> filmeParaAtualizar = servico.atualizarFilme(id, filme);

        if (filmeParaAtualizar.isPresent()) {
            return filmeParaAtualizar;
        }


    }

    
}
