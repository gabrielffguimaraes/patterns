package com.project.patterns.abstractfactory;

public class Carro {
    Roda roda;
    Som som;

    public Carro(Roda roda, Som som) {
        this.roda = roda;
        this.som = som;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
