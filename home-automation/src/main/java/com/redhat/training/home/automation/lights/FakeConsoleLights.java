package com.redhat.training.home.automation.lights;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FakeConsoleLights implements Lights {

    private Boolean on = true;

    public void switchOff() {
        System.out.println("Lights OFF!");
        on = false;
    }

    public void switchOn() {
        System.out.println("💡💡💡💡 Lights ON! 💡💡💡💡");
        on = true;
    }

    public boolean areOn() {
        return on;
    }

}