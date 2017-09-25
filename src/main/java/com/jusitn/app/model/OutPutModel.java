package com.jusitn.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OutPutModel implements Serializable {
    private static final long serialVersionUid = 2L;

    @Getter
    @Setter
    private String status;
    @Getter
    @Setter
    private EventObj events;
    @Getter
    @Setter
    private String total_items;
    @Getter
    @Setter
    private Integer page_number;
    @Getter
    @Setter
    private Integer page_size;
    @Getter
    @Setter
    private double search_time;
}

