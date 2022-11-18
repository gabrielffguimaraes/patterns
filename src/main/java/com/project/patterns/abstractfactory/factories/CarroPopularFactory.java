package com.project.patterns.abstractfactory.factories;

import com.project.patterns.abstractfactory.Roda;
import com.project.patterns.abstractfactory.RodaSimples;
import com.project.patterns.abstractfactory.Som;
import com.project.patterns.abstractfactory.TocaFitas;

public class CarroPopularFactory extends CarroFactory {
    public Roda montarRoda() {
        return new RodaSimples();
    }
    public Som montarSom() {
        return new TocaFitas();
    }
}
