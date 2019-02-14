
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
    "uid",
    "name",
    "slug",
    "address",
    "image",
    "imageCredits",
    "postalCode",
    "city",
    "district",
    "department",
    "region",
    "latitude",
    "longitude",
    "description",
    "access",
    "countryCode",
    "website",
    "links",
    "insee",
    "phone",
    "tags",
    "timezone",
    "updatedAt",
    "extId",
    "country"
})
public class LocationItem {

    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("address")
    private String address;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("imageCredits")
    private Object imageCredits;
    @JsonProperty("postalCode")
    private Object postalCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("district")
    private Object district;
    @JsonProperty("department")
    private String department;
    @JsonProperty("region")
    private String region;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("description")
    private DescriptionItem_ description;
    @JsonProperty("access")
    private AccessItem access;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("website")
    private Object website;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonProperty("insee")
    private String insee;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("extId")
    private Object extId;
    @JsonProperty("country")
    private CountryItem country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LocationItem() {
    }

    /**
     * 
     * @param region
     * @param uid
     * @param phone
     * @param department
     * @param city
     * @param timezone
     * @param postalCode
     * @param description
     * @param name
     * @param longitude
     * @param district
     * @param tags
     * @param website
     * @param countryCode
     * @param image
     * @param links
     * @param access
     * @param extId
     * @param country
     * @param updatedAt
     * @param insee
     * @param address
     * @param imageCredits
     * @param slug
     * @param latitude
     */
    public LocationItem(Integer uid, String name, String slug, String address, Object image, Object imageCredits, Object postalCode, String city, Object district, String department, String region, Double latitude, Double longitude, DescriptionItem_ description, AccessItem access, String countryCode, Object website, List<Object> links, String insee, Object phone, Object tags, String timezone, String updatedAt, Object extId, CountryItem country) {
        super();
        this.uid = uid;
        this.name = name;
        this.slug = slug;
        this.address = address;
        this.image = image;
        this.imageCredits = imageCredits;
        this.postalCode = postalCode;
        this.city = city;
        this.district = district;
        this.department = department;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.access = access;
        this.countryCode = countryCode;
        this.website = website;
        this.links = links;
        this.insee = insee;
        this.phone = phone;
        this.tags = tags;
        this.timezone = timezone;
        this.updatedAt = updatedAt;
        this.extId = extId;
        this.country = country;
    }

    @JsonProperty("uid")
    public Integer getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public LocationItem withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public LocationItem withName(String name) {
        this.name = name;
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

    public LocationItem withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public LocationItem withAddress(String address) {
        this.address = address;
        return this;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    public LocationItem withImage(Object image) {
        this.image = image;
        return this;
    }

    @JsonProperty("imageCredits")
    public Object getImageCredits() {
        return imageCredits;
    }

    @JsonProperty("imageCredits")
    public void setImageCredits(Object imageCredits) {
        this.imageCredits = imageCredits;
    }

    public LocationItem withImageCredits(Object imageCredits) {
        this.imageCredits = imageCredits;
        return this;
    }

    @JsonProperty("postalCode")
    public Object getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public LocationItem withPostalCode(Object postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public LocationItem withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("district")
    public Object getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(Object district) {
        this.district = district;
    }

    public LocationItem withDistrict(Object district) {
        this.district = district;
        return this;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    public LocationItem withDepartment(String department) {
        this.department = department;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public LocationItem withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public LocationItem withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocationItem withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("description")
    public DescriptionItem_ getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(DescriptionItem_ description) {
        this.description = description;
    }

    public LocationItem withDescription(DescriptionItem_ description) {
        this.description = description;
        return this;
    }

    @JsonProperty("access")
    public AccessItem getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(AccessItem access) {
        this.access = access;
    }

    public LocationItem withAccess(AccessItem access) {
        this.access = access;
        return this;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public LocationItem withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("website")
    public Object getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(Object website) {
        this.website = website;
    }

    public LocationItem withWebsite(Object website) {
        this.website = website;
        return this;
    }

    @JsonProperty("links")
    public List<Object> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public LocationItem withLinks(List<Object> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("insee")
    public String getInsee() {
        return insee;
    }

    @JsonProperty("insee")
    public void setInsee(String insee) {
        this.insee = insee;
    }

    public LocationItem withInsee(String insee) {
        this.insee = insee;
        return this;
    }

    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public LocationItem withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("tags")
    public Object getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public LocationItem withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public LocationItem withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocationItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("extId")
    public Object getExtId() {
        return extId;
    }

    @JsonProperty("extId")
    public void setExtId(Object extId) {
        this.extId = extId;
    }

    public LocationItem withExtId(Object extId) {
        this.extId = extId;
        return this;
    }

    @JsonProperty("country")
    public CountryItem getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(CountryItem country) {
        this.country = country;
    }

    public LocationItem withCountry(CountryItem country) {
        this.country = country;
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

    public LocationItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
