package com.estudos.anotacoes.exemplos;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private LocalDate localDate = LocalDate.now();

    public void setLocalDate() {
    }
}
