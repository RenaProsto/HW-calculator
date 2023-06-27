package com.example.hwcalculator1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final Service service;

    public CalculatorController(Service service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор)";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return service.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return service.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return service.multiply(num1, num2);
    }


    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return service.divide(num1, num2);
    }
}
