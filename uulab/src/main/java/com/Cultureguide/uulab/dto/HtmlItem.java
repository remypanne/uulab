
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
    "fr"
})
public class HtmlItem {

    @JsonProperty("fr")
    private String fr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HtmlItem() {
    }

    /**
     * 
     * @param fr
     */
    public HtmlItem(String fr) {
        super();
        this.fr = fr;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    public HtmlItem withFr(String fr) {
        this.fr = fr;
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

    public HtmlItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
