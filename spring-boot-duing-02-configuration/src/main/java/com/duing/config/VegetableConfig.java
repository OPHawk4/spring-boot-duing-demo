package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetable")
@PropertySource("classpath:vegetable.properties")
public class VegetableConfig {
    private String potato;
    private String greenPepper;
    private String eggPlant;

    public VegetableConfig() {
    }

    public VegetableConfig(String potato, String greenPepper, String eggPlant) {
        this.potato = potato;
        this.greenPepper = greenPepper;
        this.eggPlant = eggPlant;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getGreenPepper() {
        return greenPepper;
    }

    public void setGreenPepper(String greenPepper) {
        this.greenPepper = greenPepper;
    }

    public String getEggPlant() {
        return eggPlant;
    }

    public void setEggPlant(String eggPlant) {
        this.eggPlant = eggPlant;
    }
}
