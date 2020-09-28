package com.eandbsolutions;

public class KafkaService {
    private String taco = "thing";

    public KafkaService() {
    }

    public KafkaService(String taco) {
        this.taco = taco;
    }

    public String getTaco() {
        return taco;
    }

    public void setTaco(String taco) {
        this.taco = taco;
    }
}
