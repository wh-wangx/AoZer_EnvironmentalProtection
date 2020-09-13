package com.aozer.airproducts.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/V1")
public class AirEnergyProductsController {

    @Value("${spring.datasource.url}")
    private String dataBaseUrl;

    @GetMapping("/getProductsName")
    public String getProductsName() {
        return "双志空调压缩机" + dataBaseUrl + "**************";
    }

}
