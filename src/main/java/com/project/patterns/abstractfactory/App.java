package com.project.patterns.abstractfactory;


import com.project.patterns.abstractfactory.enums.TipoCarro;
import com.project.patterns.abstractfactory.factories.MontadorDeCarroFactory;

public class App {
    public static void main(String[] args) {
        Carro fiatMobi = MontadorDeCarroFactory.montarCarro(TipoCarro.POPULAR);
        Carro bmwSerie3 = MontadorDeCarroFactory.montarCarro(TipoCarro.LUXO);

        System.out.println(fiatMobi);
        System.out.println(bmwSerie3);
    }
}
