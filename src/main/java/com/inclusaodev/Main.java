package com.inclusaodev;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    static int ANO=2021;
    public static void main(String[] args) {
        Collection<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Gol",2021,new BigDecimal("12000")));
        carros.add(new Carro("Uno",2020,new BigDecimal("2000")));
        carros.add(new Carro("Jetta",2021,new BigDecimal("22000")));
        carros.add(new Carro("Jetta",2021,new BigDecimal("22000")));
        carros.add(new Carro("Jetta",2021,new BigDecimal("22000")));
        carros.add(new Carro("Jetta",2021,new BigDecimal("22000")));
        carros.add(new Carro("Jetta",2021,new BigDecimal("22000")));

        carros.stream().filter(carro -> carro.getAno().equals(ANO))
                .map(carro -> carro.getNome()).collect(Collectors.toList())
                .forEach(AnuncioBO::anunciar);

    }
}
