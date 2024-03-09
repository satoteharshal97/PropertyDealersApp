package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.model.PropertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class PropertyController {
    @GetMapping("/hello")
    public String sayHi(){
        return "First Git commit after long time";
    }

    @PostMapping("/save")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO) {
        System.out.println(propertyDTO);
        return propertyDTO;
    }

}
