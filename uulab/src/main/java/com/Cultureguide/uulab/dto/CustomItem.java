
package com.Cultureguide.uulab.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entreelibre"
})
public class CustomItem {

    @JsonProperty("entreelibre")
    private Boolean entreelibre;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomItem() {
    }

    /**
     * 
     * @param entreelibre
     */
    public CustomItem(Boolean entreelibre) {
        super();
        this.entreelibre = entreelibre;
    }

    @JsonProperty("entreelibre")
    public Boolean getEntreelibre() {
        return entreelibre;
    }

    @JsonProperty("entreelibre")
    public void setEntreelibre(Boolean entreelibre) {
        this.entreelibre = entreelibre;
    }

    public CustomItem withEntreelibre(Boolean entreelibre) {
        this.entreelibre = entreelibre;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CustomItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
