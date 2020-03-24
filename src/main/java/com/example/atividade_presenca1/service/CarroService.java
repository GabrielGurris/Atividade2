package com.example.atividade_presenca1.service;

import java.util.ArrayList;

import com.example.atividade_presenca1.model.Carro;
import com.example.atividade_presenca1.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarroService
 */
@Service
public class CarroService {

    @Autowired
    CarroRepository cr;

    public Carro getCarroID(int id)
    {
        return cr.getCarroByID(id);
    }

    public ArrayList <Carro> getCarros()
    {
        ArrayList <Carro> carros = new ArrayList<Carro>();

        for(Carro a : cr.getCarros())
        {
            carros.add(a);
        }
        return carros;
    }
    
}