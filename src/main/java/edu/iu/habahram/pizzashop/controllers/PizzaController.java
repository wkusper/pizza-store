package edu.iu.habahram.pizzashop.controllers;

import edu.iu.habahram.pizzashop.model.OrderData;
import edu.iu.habahram.pizzashop.repository.PizzaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @PostMapping
    public String order(@RequestBody OrderData orderData) {
        return pizzaRepository.prepareTheOrder(orderData);
    }
}
