
package com.Cultureguide.uulab.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "readme",
    "total",
    "offset",
    "limit",
    "events"
})
public class OpenAgendaItem {

    @JsonProperty("readme")
    private String readme;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("events")
    private List<EventItem> events = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenAgendaItem() {
    }

    /**
     * 
     * @param limit
     * @param total
     * @param events
     * @param readme
     * @param offset
     */
    public OpenAgendaItem(String readme, Integer total, Integer offset, Integer limit, List<EventItem> events) {
        super();
        this.readme = readme;
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.events = events;
    }

    @JsonProperty("readme")
    public String getReadme() {
        return readme;
    }

    @JsonProperty("readme")
    public void setReadme(String readme) {
        this.readme = readme;
    }

    public OpenAgendaItem withReadme(String readme) {
        this.readme = readme;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public OpenAgendaItem withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public OpenAgendaItem withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public OpenAgendaItem withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("events")
    public List<EventItem> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<EventItem> events) {
        this.events = events;
    }

    public OpenAgendaItem withEvents(List<EventItem> events) {
        this.events = events;
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

    public OpenAgendaItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
