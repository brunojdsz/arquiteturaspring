package com.project.brunojdsz.arquiteturaspring.automaker;

public class Key {
    private Automaker automaker;
    private String type;

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
