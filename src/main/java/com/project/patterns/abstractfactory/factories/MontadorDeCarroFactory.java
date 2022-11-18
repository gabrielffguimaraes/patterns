package com.project.patterns.abstractfactory.factories;

import com.project.patterns.abstractfactory.Carro;
import com.project.patterns.abstractfactory.enums.TipoCarro;

public class MontadorDeCarroFactory {
    public static Carro montarCarro(TipoCarro tipoCarro) {
        CarroFactory carroFactory = null;
        switch (tipoCarro) {
            case POPULAR -> {
                carroFactory = new CarroPopularFactory();
            }
            case LUXO -> {
                carroFactory = new CarroLuxoFactory();
            }
        }
        Carro carro = new Carro(carroFactory.montarRoda(), carroFactory.montarSom());
        return carro;
    }
}
