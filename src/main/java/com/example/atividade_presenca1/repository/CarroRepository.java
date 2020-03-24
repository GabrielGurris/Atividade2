package com.example.atividade_presenca1.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.atividade_presenca1.model.Carro;

import org.springframework.stereotype.Repository;

/**
 * CarroRepository
 */
@Repository
public class CarroRepository {
    
    public HashMap <Integer, Carro> carros = new HashMap<Integer, Carro>();
    
    public CarroRepository()
    {
        carros.put(1, new Carro(1,"Ford", "Focus", 2019, 10000, "Flex",63000));
        carros.put(2, new Carro(2,"Fiat", "Uno", 2014, 84000, "Flex",20000));
        carros.put(3, new Carro(3,"Chevrolet", "Monza", 1994, 230000, "Alcool",5000));
        carros.put(4, new Carro(4,"Toyota", "Hilux", 2015, 150000, "Diesel",78000));
        carros.put(5, new Carro(5,"Audi", "A1", 2017, 21000, "Flex",35000));
        carros.put(6, new Carro(6,"BMW", "X5", 2015, 145000, "flex",85000));
    }

    public Carro getCarroByID(int id)
    {
        Carro c = new Carro();

        for(int i = 1; i < carros.size()+1; i++)
        {
            if(carros.get(i).getId() == id)
            {
                c = carros.get(i);
                return c;
            }
        }
        return null;
    }

    public Collection <Carro> getCarros()
    {
        return carros.values();
    }
}