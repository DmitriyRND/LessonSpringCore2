package org.example.lessonspringcore2;

import lombok.Data;

@Data
public class Auto {
    private int id;
    private Engine engine;
    private String model;

    public Auto(int id, Engine engine, String model) {
        this.id = id;
        this.engine = engine;
        this.model = model;

    }
}
