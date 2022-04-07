package soy.LOLI.sumador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


@RestController

class SumadorController {

     @Autowired

     private Sumador sumador;


     @RequestMapping("/suma")

     String suma(@RequestParam("a") Integer a, 

                @RequestParam("b") Integer b) {

          return String.valueOf(sumador.suma(a, b));

     }

}


