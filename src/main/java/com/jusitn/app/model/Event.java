package com.jusitn.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

    @Getter
    @Setter
    private String id;
    @Getter @Setter
    private String url;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String venue_name;
    @Getter @Setter
    private String venue_address;
    @Getter @Setter
    private String city_name;
    @Getter @Setter
    private String region_name;
    @Getter @Setter
    private String region_abbr;
    @Getter @Setter
    private String postal_code;
    @Getter @Setter
    private String country_name;
}
