package com.meccano.MicroservicioB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meccano.MicroservicioB.service.MicroservicioBService;

@Controller
@RequestMapping("/github/user")
public class MicroservicioBController {
	private MicroservicioBService msBService;
	
	@Autowired
    public MicroservicioBController(MicroservicioBService service) {
        this.msBService = service;
    }
	
//	@RequestMapping(value = "/{sumando1,sumando2}")
//    @ResponseBody
//    public MicroservicioBBeanRestTemplate getMicroservicioBBeanRestTemplate(@PathVariable(value = "sumando1") Integer sumando1,
//    		@PathVariable(value = "sumando2") Integer sumando2) {
//        return MicroservicioBService.;
//    }
}
