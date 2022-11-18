package com.project.patterns.abstractfactory.factories;

import com.project.patterns.abstractfactory.Roda;
import com.project.patterns.abstractfactory.Som;

public abstract class CarroFactory {
    public abstract Roda montarRoda();
    public abstract Som montarSom();
}
