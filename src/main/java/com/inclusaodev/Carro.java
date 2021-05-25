package com.inclusaodev;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Carro {
    private String nome;
    private Integer ano;
    private BigDecimal valor;
}
