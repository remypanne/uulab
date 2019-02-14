
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
    "en",
    "fr",
    "code"
})
public class CountryItem {

    @JsonProperty("en")
    private String en;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("code")
    private String code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CountryItem() {
    }

    /**
     * 
     * @param fr
     * @param en
     * @param code
     */
    public CountryItem(String en, String fr, String code) {
        super();
        this.en = en;
        this.fr = fr;
        this.code = code;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    public CountryItem withEn(String en) {
        this.en = en;
        return this;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    public CountryItem withFr(String fr) {
        this.fr = fr;
        return this;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CountryItem withCode(String code) {
        this.code = code;
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

    public CountryItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
