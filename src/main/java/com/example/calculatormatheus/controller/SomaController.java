package com.example.calculatormatheus.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculatormatheus.model.Greeting;
import com.example.calculatormatheus.model.Resultado;;


@RestController
@RequestMapping(value = "/greeting")
public class SomaController {
     
    @PostMapping(value = "")
    public Resultado Soma(@RequestBody Greeting soma){
        Resultado resultado = new Resultado();
        resultado.setResultado(soma.getNum1() + soma.getNum2());
        return resultado;
    }
}

