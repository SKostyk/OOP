package com.company;
public class LightOn implements IComand {
    private Lamp lamp;
    @Override
    public void execute() {
        lamp.On();
    }

    LightOn(Lamp lamp){
        this.lamp = lamp;
    }
}
