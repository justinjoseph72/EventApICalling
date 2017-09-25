package com.jusitn.app.service;

import com.jusitn.app.model.InputModel;
import com.jusitn.app.model.OutPutModel;

import java.io.IOException;

public interface EventService {

    public OutPutModel getEventsByLocationAndKeyWors(InputModel inputModel) throws IOException;
}
