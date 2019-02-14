
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
    "slug",
    "canonicalUrl",
    "title",
    "description",
    "longDescription",
    "keywords",
    "html",
    "image",
    "thumbnail",
    "originalImage",
    "age",
    "accessibility",
    "updatedAt",
    "range",
    "imageCredits",
    "origin",
    "conditions",
    "registrationUrl",
    "locationName",
    "locationUid",
    "address",
    "postalCode",
    "city",
    "district",
    "department",
    "region",
    "latitude",
    "longitude",
    "timings",
    "location",
    "registration",
    "firstDate",
    "firstTimeStart",
    "firstTimeEnd",
    "lastDate",
    "lastTimeStart",
    "lastTimeEnd",
    "featured",
    "hasPrivateCustomFields",
    "custom",
    "contributor",
    "category",
    "tags",
    "tagGroups"
})
public class EventItem {

    @JsonProperty("uid")
    private Integer uid;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("canonicalUrl")
    private String canonicalUrl;
    @JsonProperty("title")
    private TitleItem title;
    @JsonProperty("description")
    private DescriptionItem description;
    @JsonProperty("longDescription")
    private LongDescriptionItem longDescription;
    @JsonProperty("keywords")
    private Object keywords;
    @JsonProperty("html")
    private HtmlItem html;
    @JsonProperty("image")
    private String image;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("originalImage")
    private String originalImage;
    @JsonProperty("age")
    private Object age;
    @JsonProperty("accessibility")
    private List<Object> accessibility = null;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("range")
    private RangeItem range;
    @JsonProperty("imageCredits")
    private Object imageCredits;
    @JsonProperty("origin")
    private OriginItem origin;
    @JsonProperty("conditions")
    private Object conditions;
    @JsonProperty("registrationUrl")
    private Object registrationUrl;
    @JsonProperty("locationName")
    private String locationName;
    @JsonProperty("locationUid")
    private Integer locationUid;
    @JsonProperty("address")
    private String address;
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
    @JsonProperty("timings")
    private List<TimingItem> timings = null;
    @JsonProperty("location")
    private LocationItem location;
    @JsonProperty("registration")
    private List<Object> registration = null;
    @JsonProperty("firstDate")
    private String firstDate;
    @JsonProperty("firstTimeStart")
    private String firstTimeStart;
    @JsonProperty("firstTimeEnd")
    private String firstTimeEnd;
    @JsonProperty("lastDate")
    private String lastDate;
    @JsonProperty("lastTimeStart")
    private String lastTimeStart;
    @JsonProperty("lastTimeEnd")
    private String lastTimeEnd;
    @JsonProperty("featured")
    private Integer featured;
    @JsonProperty("hasPrivateCustomFields")
    private Boolean hasPrivateCustomFields;
    @JsonProperty("custom")
    private CustomItem custom;
    @JsonProperty("contributor")
    private ContributorItem contributor;
    @JsonProperty("category")
    private Object category;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("tagGroups")
    private List<TagGroup> tagGroups = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EventItem() {
    }

    /**
     * 
     * @param region
     * @param uid
     * @param range
     * @param location
     * @param department
     * @param lastDate
     * @param featured
     * @param locationName
     * @param city
     * @param title
     * @param locationUid
     * @param postalCode
     * @param originalImage
     * @param firstTimeEnd
     * @param contributor
     * @param description
     * @param canonicalUrl
     * @param age
     * @param longDescription
     * @param longitude
     * @param firstTimeStart
     * @param district
     * @param registrationUrl
     * @param custom
     * @param accessibility
     * @param tags
     * @param lastTimeEnd
     * @param firstDate
     * @param keywords
     * @param timings
     * @param hasPrivateCustomFields
     * @param origin
     * @param image
     * @param registration
     * @param lastTimeStart
     * @param updatedAt
     * @param conditions
     * @param category
     * @param thumbnail
     * @param address
     * @param html
     * @param slug
     * @param imageCredits
     * @param latitude
     * @param tagGroups
     */
    public EventItem(Integer uid, String slug, String canonicalUrl, TitleItem title, DescriptionItem description, LongDescriptionItem longDescription, Object keywords, HtmlItem html, String image, String thumbnail, String originalImage, Object age, List<Object> accessibility, String updatedAt, RangeItem range, Object imageCredits, OriginItem origin, Object conditions, Object registrationUrl, String locationName, Integer locationUid, String address, Object postalCode, String city, Object district, String department, String region, Double latitude, Double longitude, List<TimingItem> timings, LocationItem location, List<Object> registration, String firstDate, String firstTimeStart, String firstTimeEnd, String lastDate, String lastTimeStart, String lastTimeEnd, Integer featured, Boolean hasPrivateCustomFields, CustomItem custom, ContributorItem contributor, Object category, List<Tag> tags, List<TagGroup> tagGroups) {
        super();
        this.uid = uid;
        this.slug = slug;
        this.canonicalUrl = canonicalUrl;
        this.title = title;
        this.description = description;
        this.longDescription = longDescription;
        this.keywords = keywords;
        this.html = html;
        this.image = image;
        this.thumbnail = thumbnail;
        this.originalImage = originalImage;
        this.age = age;
        this.accessibility = accessibility;
        this.updatedAt = updatedAt;
        this.range = range;
        this.imageCredits = imageCredits;
        this.origin = origin;
        this.conditions = conditions;
        this.registrationUrl = registrationUrl;
        this.locationName = locationName;
        this.locationUid = locationUid;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.district = district;
        this.department = department;
        this.region = region;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timings = timings;
        this.location = location;
        this.registration = registration;
        this.firstDate = firstDate;
        this.firstTimeStart = firstTimeStart;
        this.firstTimeEnd = firstTimeEnd;
        this.lastDate = lastDate;
        this.lastTimeStart = lastTimeStart;
        this.lastTimeEnd = lastTimeEnd;
        this.featured = featured;
        this.hasPrivateCustomFields = hasPrivateCustomFields;
        this.custom = custom;
        this.contributor = contributor;
        this.category = category;
        this.tags = tags;
        this.tagGroups = tagGroups;
    }

    @JsonProperty("uid")
    public Integer getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public EventItem withUid(Integer uid) {
        this.uid = uid;
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

    public EventItem withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("canonicalUrl")
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    @JsonProperty("canonicalUrl")
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public EventItem withCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
        return this;
    }

    @JsonProperty("title")
    public TitleItem getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(TitleItem title) {
        this.title = title;
    }

    public EventItem withTitle(TitleItem title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public DescriptionItem getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(DescriptionItem description) {
        this.description = description;
    }

    public EventItem withDescription(DescriptionItem description) {
        this.description = description;
        return this;
    }

    @JsonProperty("longDescription")
    public LongDescriptionItem getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(LongDescriptionItem longDescription) {
        this.longDescription = longDescription;
    }

    public EventItem withLongDescription(LongDescriptionItem longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    @JsonProperty("keywords")
    public Object getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(Object keywords) {
        this.keywords = keywords;
    }

    public EventItem withKeywords(Object keywords) {
        this.keywords = keywords;
        return this;
    }

    @JsonProperty("html")
    public HtmlItem getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(HtmlItem html) {
        this.html = html;
    }

    public EventItem withHtml(HtmlItem html) {
        this.html = html;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public EventItem withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public EventItem withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @JsonProperty("originalImage")
    public String getOriginalImage() {
        return originalImage;
    }

    @JsonProperty("originalImage")
    public void setOriginalImage(String originalImage) {
        this.originalImage = originalImage;
    }

    public EventItem withOriginalImage(String originalImage) {
        this.originalImage = originalImage;
        return this;
    }

    @JsonProperty("age")
    public Object getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Object age) {
        this.age = age;
    }

    public EventItem withAge(Object age) {
        this.age = age;
        return this;
    }

    @JsonProperty("accessibility")
    public List<Object> getAccessibility() {
        return accessibility;
    }

    @JsonProperty("accessibility")
    public void setAccessibility(List<Object> accessibility) {
        this.accessibility = accessibility;
    }

    public EventItem withAccessibility(List<Object> accessibility) {
        this.accessibility = accessibility;
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

    public EventItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("range")
    public RangeItem getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(RangeItem range) {
        this.range = range;
    }

    public EventItem withRange(RangeItem range) {
        this.range = range;
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

    public EventItem withImageCredits(Object imageCredits) {
        this.imageCredits = imageCredits;
        return this;
    }

    @JsonProperty("origin")
    public OriginItem getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(OriginItem origin) {
        this.origin = origin;
    }

    public EventItem withOrigin(OriginItem origin) {
        this.origin = origin;
        return this;
    }

    @JsonProperty("conditions")
    public Object getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Object conditions) {
        this.conditions = conditions;
    }

    public EventItem withConditions(Object conditions) {
        this.conditions = conditions;
        return this;
    }

    @JsonProperty("registrationUrl")
    public Object getRegistrationUrl() {
        return registrationUrl;
    }

    @JsonProperty("registrationUrl")
    public void setRegistrationUrl(Object registrationUrl) {
        this.registrationUrl = registrationUrl;
    }

    public EventItem withRegistrationUrl(Object registrationUrl) {
        this.registrationUrl = registrationUrl;
        return this;
    }

    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public EventItem withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    @JsonProperty("locationUid")
    public Integer getLocationUid() {
        return locationUid;
    }

    @JsonProperty("locationUid")
    public void setLocationUid(Integer locationUid) {
        this.locationUid = locationUid;
    }

    public EventItem withLocationUid(Integer locationUid) {
        this.locationUid = locationUid;
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

    public EventItem withAddress(String address) {
        this.address = address;
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

    public EventItem withPostalCode(Object postalCode) {
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

    public EventItem withCity(String city) {
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

    public EventItem withDistrict(Object district) {
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

    public EventItem withDepartment(String department) {
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

    public EventItem withRegion(String region) {
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

    public EventItem withLatitude(Double latitude) {
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

    public EventItem withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("timings")
    public List<TimingItem> getTimings() {
        return timings;
    }

    @JsonProperty("timings")
    public void setTimings(List<TimingItem> timings) {
        this.timings = timings;
    }

    public EventItem withTimings(List<TimingItem> timings) {
        this.timings = timings;
        return this;
    }

    @JsonProperty("location")
    public LocationItem getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(LocationItem location) {
        this.location = location;
    }

    public EventItem withLocation(LocationItem location) {
        this.location = location;
        return this;
    }

    @JsonProperty("registration")
    public List<Object> getRegistration() {
        return registration;
    }

    @JsonProperty("registration")
    public void setRegistration(List<Object> registration) {
        this.registration = registration;
    }

    public EventItem withRegistration(List<Object> registration) {
        this.registration = registration;
        return this;
    }

    @JsonProperty("firstDate")
    public String getFirstDate() {
        return firstDate;
    }

    @JsonProperty("firstDate")
    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public EventItem withFirstDate(String firstDate) {
        this.firstDate = firstDate;
        return this;
    }

    @JsonProperty("firstTimeStart")
    public String getFirstTimeStart() {
        return firstTimeStart;
    }

    @JsonProperty("firstTimeStart")
    public void setFirstTimeStart(String firstTimeStart) {
        this.firstTimeStart = firstTimeStart;
    }

    public EventItem withFirstTimeStart(String firstTimeStart) {
        this.firstTimeStart = firstTimeStart;
        return this;
    }

    @JsonProperty("firstTimeEnd")
    public String getFirstTimeEnd() {
        return firstTimeEnd;
    }

    @JsonProperty("firstTimeEnd")
    public void setFirstTimeEnd(String firstTimeEnd) {
        this.firstTimeEnd = firstTimeEnd;
    }

    public EventItem withFirstTimeEnd(String firstTimeEnd) {
        this.firstTimeEnd = firstTimeEnd;
        return this;
    }

    @JsonProperty("lastDate")
    public String getLastDate() {
        return lastDate;
    }

    @JsonProperty("lastDate")
    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public EventItem withLastDate(String lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    @JsonProperty("lastTimeStart")
    public String getLastTimeStart() {
        return lastTimeStart;
    }

    @JsonProperty("lastTimeStart")
    public void setLastTimeStart(String lastTimeStart) {
        this.lastTimeStart = lastTimeStart;
    }

    public EventItem withLastTimeStart(String lastTimeStart) {
        this.lastTimeStart = lastTimeStart;
        return this;
    }

    @JsonProperty("lastTimeEnd")
    public String getLastTimeEnd() {
        return lastTimeEnd;
    }

    @JsonProperty("lastTimeEnd")
    public void setLastTimeEnd(String lastTimeEnd) {
        this.lastTimeEnd = lastTimeEnd;
    }

    public EventItem withLastTimeEnd(String lastTimeEnd) {
        this.lastTimeEnd = lastTimeEnd;
        return this;
    }

    @JsonProperty("featured")
    public Integer getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Integer featured) {
        this.featured = featured;
    }

    public EventItem withFeatured(Integer featured) {
        this.featured = featured;
        return this;
    }

    @JsonProperty("hasPrivateCustomFields")
    public Boolean getHasPrivateCustomFields() {
        return hasPrivateCustomFields;
    }

    @JsonProperty("hasPrivateCustomFields")
    public void setHasPrivateCustomFields(Boolean hasPrivateCustomFields) {
        this.hasPrivateCustomFields = hasPrivateCustomFields;
    }

    public EventItem withHasPrivateCustomFields(Boolean hasPrivateCustomFields) {
        this.hasPrivateCustomFields = hasPrivateCustomFields;
        return this;
    }

    @JsonProperty("custom")
    public CustomItem getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(CustomItem custom) {
        this.custom = custom;
    }

    public EventItem withCustom(CustomItem custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("contributor")
    public ContributorItem getContributor() {
        return contributor;
    }

    @JsonProperty("contributor")
    public void setContributor(ContributorItem contributor) {
        this.contributor = contributor;
    }

    public EventItem withContributor(ContributorItem contributor) {
        this.contributor = contributor;
        return this;
    }

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public EventItem withCategory(Object category) {
        this.category = category;
        return this;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public EventItem withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("tagGroups")
    public List<TagGroup> getTagGroups() {
        return tagGroups;
    }

    @JsonProperty("tagGroups")
    public void setTagGroups(List<TagGroup> tagGroups) {
        this.tagGroups = tagGroups;
    }

    public EventItem withTagGroups(List<TagGroup> tagGroups) {
        this.tagGroups = tagGroups;
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

    public EventItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
