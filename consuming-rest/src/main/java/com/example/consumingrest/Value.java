package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote1;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    @JsonProperty("quote")
    public String getQuote1() {
        return this.quote1;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("quote")
    public void setQuote1(String quote) {
        this.quote1 = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote1 + '\'' +
                '}';
    }
}