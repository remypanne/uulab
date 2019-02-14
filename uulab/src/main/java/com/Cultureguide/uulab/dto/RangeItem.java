
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
    "fr",
    "en"
})
public class RangeItem {

    @JsonProperty("fr")
    private String fr;
    @JsonProperty("en")
    private String en;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RangeItem() {
    }

    /**
     * 
     * @param fr
     * @param en
     */
    public RangeItem(String fr, String en) {
        super();
        this.fr = fr;
        this.en = en;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    public RangeItem withFr(String fr) {
        this.fr = fr;
        return this;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    public RangeItem withEn(String en) {
        this.en = en;
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

    public RangeItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
