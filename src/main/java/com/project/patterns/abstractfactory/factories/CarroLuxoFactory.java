package com.project.patterns.abstractfactory.factories;

import com.project.patterns.abstractfactory.Cdplayer;
import com.project.patterns.abstractfactory.Roda;
import com.project.patterns.abstractfactory.RodaLigaLeve;
import com.project.patterns.abstractfactory.Som;

public class CarroLuxoFactory extends CarroFactory {
    Integer nome;

    public Roda montarRoda() {
        return new RodaLigaLeve();
    }
    public Som montarSom() {
        return new Cdplayer();
    }
}
