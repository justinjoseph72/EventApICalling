package com.jusitn.app.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jusitn.app.EventConstants;
import com.jusitn.app.model.InputModel;
import com.jusitn.app.model.OutPutModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class EventServiceImpl implements EventService {

    private final Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${app-key}")
    private String app_key;



    @Override
    public OutPutModel getEventsByLocationAndKeyWors(InputModel inputModel) throws IOException {
        if(inputModel!=null){
            StringBuilder urlBuilder = new StringBuilder(EventConstants.BASE_URL);
            urlBuilder.append(app_key);
            urlBuilder.append(EventConstants.PARAM_CHAR);
            if(StringUtils.isNotBlank(inputModel.getLocation())){
                urlBuilder.append(EventConstants.LOCATION);
                urlBuilder.append(EventConstants.EQUAL_CHAR);
                urlBuilder.append(inputModel.getLocation());
            }
            if(StringUtils.isNotBlank(inputModel.getKeyword())){
                urlBuilder.append(EventConstants.PARAM_CHAR);
                urlBuilder.append(EventConstants.KEYWORDS);
                urlBuilder.append(EventConstants.EQUAL_CHAR);
                urlBuilder.append(inputModel.getKeyword());
            }
            logger.info(urlBuilder.toString());

            ResponseEntity<String> responseEntity = restTemplate.getForEntity(urlBuilder.toString(),String.class);
            HttpHeaders headers = new HttpHeaders();
            logger.info(responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();

            OutPutModel outPutModel =mapper.readValue(responseEntity.getBody(),OutPutModel.class);
            return outPutModel;

        }
        return null;
    }
}
