
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
    "name",
    "access",
    "slug",
    "tags"
})
public class TagGroup {

    @JsonProperty("name")
    private String name;
    @JsonProperty("access")
    private String access;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tags")
    private List<TagItem_> tags = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TagGroup() {
    }

    /**
     * 
     * @param tags
     * @param name
     * @param slug
     * @param access
     */
    public TagGroup(String name, String access, String slug, List<TagItem_> tags) {
        super();
        this.name = name;
        this.access = access;
        this.slug = slug;
        this.tags = tags;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TagGroup withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("access")
    public String getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(String access) {
        this.access = access;
    }

    public TagGroup withAccess(String access) {
        this.access = access;
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

    public TagGroup withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("tags")
    public List<TagItem_> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<TagItem_> tags) {
        this.tags = tags;
    }

    public TagGroup withTags(List<TagItem_> tags) {
        this.tags = tags;
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

    public TagGroup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
