package com.jusitn.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EventObj {
private final long serialVersionUID = 3L;
    @Getter @Setter
    private List<Event> event;
}
