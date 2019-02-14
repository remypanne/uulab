
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
    "uid",
    "title",
    "url",
    "slug",
    "oaUrl"
})
public class OriginItem {

    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("oaUrl")
    private String oaUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginItem() {
    }

    /**
     * 
     * @param uid
     * @param title
     * @param oaUrl
     * @param slug
     * @param url
     */
    public OriginItem(Integer uid, String title, String url, String slug, String oaUrl) {
        super();
        this.uid = uid;
        this.title = title;
        this.url = url;
        this.slug = slug;
        this.oaUrl = oaUrl;
    }

    @JsonProperty("uid")
    public Integer getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public OriginItem withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public OriginItem withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public OriginItem withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public OriginItem withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("oaUrl")
    public String getOaUrl() {
        return oaUrl;
    }

    @JsonProperty("oaUrl")
    public void setOaUrl(String oaUrl) {
        this.oaUrl = oaUrl;
    }

    public OriginItem withOaUrl(String oaUrl) {
        this.oaUrl = oaUrl;
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

    public OriginItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
