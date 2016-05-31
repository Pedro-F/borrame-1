package com.meccano.MicroservicioB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MicroservicioBService {
	private static RestTemplate restTemplate;
    private Integer respuestaMicroservicioB = 0;

    static {
        restTemplate = new RestTemplate();
    }

    @Autowired
    public MicroservicioBService(Integer sumando1, Integer Sumando2) {
        this.respuestaMicroservicioB = sumando1 + Sumando2;
    }
    
//    public MicroservicioBBeanRestTemplate getMicroservicioBBeanRestTemplate(Integer sumando1, Integer sumando2) {
//    	respuestaMicroservicioB = sumando1 + sumando2;
//        return restTemplate.getForObject(respuestaMicroservicioB, MicroservicioBBeanRestTemplate.class);
//    }

    
}
