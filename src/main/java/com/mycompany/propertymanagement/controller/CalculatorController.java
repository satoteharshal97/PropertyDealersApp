package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.model.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    //localhost:8080/api/v1/calculator/add?num1=3.5&num2=3.5
    @GetMapping("/add") //Here we are using request param for testing
    public double add(@RequestParam("num1") double num1, @RequestParam("num2") double num2){
        return num1+num2;
    }

    @GetMapping("/subtract/{num1}/{num2}") //Here we are using path variable for
    public double subtract (@PathVariable("num1") double num1, @PathVariable("num2") double num2){
        if (num1>num2) {
            return num1-num2;
        }
        else{
            return num2-num1;
        }
    }
    @PostMapping("/mul")
    public Double multi(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3();
        return result;
    }
}
