package br.com.maximasistemas.maxnps.api.dto;

import lombok.Getter;

@Getter
public class CursoDTO {
    private int id;
    private String nome;
    private String categoria;
    private String professor;

    public CursoDTO(int id, String nome, String categoria, String professor){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.professor = professor;
    }
}
