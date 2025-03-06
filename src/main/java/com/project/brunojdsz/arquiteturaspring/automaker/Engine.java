package com.project.brunojdsz.arquiteturaspring.automaker;

public class Engine {
    private String model;
    private Integer horse;
    private Integer cylinders;
    private Double literage;
    private EngineType type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorse() {
        return horse;
    }

    public void setHorse(Integer horse) {
        this.horse = horse;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getLiterage() {
        return literage;
    }

    public void setLiterage(Double literage) {
        this.literage = literage;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horse=" + horse +
                ", cylinders=" + cylinders +
                ", literage=" + literage +
                ", type=" + type +
                '}';
    }
}
