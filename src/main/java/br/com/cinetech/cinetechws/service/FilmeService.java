package br.com.cinetech.cinetechws.service;

import java.util.List;
import java.util.Optional;

import br.com.cinetech.cinetechws.shared.FilmeDto;

public interface FilmeService {
    List<FilmeDto> listarFilmes();
    FilmeDto criarFilme(FilmeDto filme);
    Optional<FilmeDto> atualizarFilme(String id, FilmeDto filme);
}
