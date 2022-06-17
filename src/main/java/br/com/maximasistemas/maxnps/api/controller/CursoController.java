package br.com.maximasistemas.maxnps.api.controller;

import br.com.maximasistemas.maxnps.api.dto.CursoDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @CrossOrigin
    @GetMapping("/listar")
    public List<CursoDTO> listarCursos() {
        var teste = new ArrayList<CursoDTO>();
        teste.add(new CursoDTO(1, "Programação", "A", "Natália"));
        return teste;
    }
}
