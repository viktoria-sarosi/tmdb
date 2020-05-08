package com.tmdbproject.models.dtos;

public class ForeignResponse {
    private String name;
    private String capital;
    private String region;
    private Long population;

    public ForeignResponse(String country, String capital, String region, Long population) {
        this.name = country;
        this.capital = capital;
        this.region = region;
        this.population = population;
    }

    public ForeignResponse() {
    }

    public String getCountry() {
        return name;
    }

    public void setCountry(String country) {
        this.name = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
