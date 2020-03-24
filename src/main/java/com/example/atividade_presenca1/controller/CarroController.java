package com.example.atividade_presenca1.controller;
import java.util.ArrayList;

import com.example.atividade_presenca1.model.Carro;
import com.example.atividade_presenca1.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * CarroController
 */
@Controller
public class CarroController {

    @Autowired
    CarroService cs;

    @GetMapping("/carro/{codigo}")
    public ModelAndView mostrarCarro(
        @PathVariable("codigo") int id
    ){
        ModelAndView mv = new ModelAndView("viewCarro");

        Carro c = cs.getCarroID(id);

        mv.addObject("carro", c);

        return mv;
    }

    @GetMapping("/carros")
    public ModelAndView mostrarCarros()
    {
        ModelAndView mv = new ModelAndView("viewCarros");

        ArrayList<Carro> carros = cs.getCarros();

        mv.addObject("carros", carros);

        return mv;
    }

}