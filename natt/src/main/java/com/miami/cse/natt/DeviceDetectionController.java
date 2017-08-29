package com.miami.cse.natt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeviceDetectionController {

    @RequestMapping("/deviceDetection")
    public String deviceDetection(){
        
        return "deviceDetection";
    }
}
