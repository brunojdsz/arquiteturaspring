package com.project.brunojdsz.arquiteturaspring.automaker;


import java.awt.Color;

public class HondaHRV extends Car{

    public HondaHRV(Engine engine) {
        super(engine);
        setModel("HRV");
        setColor(Color.BLACK);
        setAutomaker(Automaker.HONDA);
    }
}
