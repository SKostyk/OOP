package com.company;

public class LightOff implements IComand {
    private Lamp lamp;
    @Override
    public void execute() {
        lamp.Off();
    }
    LightOff(Lamp lamp){
        this.lamp = lamp;
    }
}
