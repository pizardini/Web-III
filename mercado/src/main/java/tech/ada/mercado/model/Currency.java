package tech.ada.mercado.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("high")
    private Double high;

    public Double getHigh() {
        return high;
    }
}
