package com.jusitn.app.model;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class InputModel implements Serializable {

    private static final long serialVersionUID =1L;
    @Getter @Setter
    private String location;
    @Getter @Setter
    private String keyword;
}
