package edu.iu.habahram.pizzashop.repository;

import edu.iu.habahram.pizzashop.model.OrderData;

public interface PizzaRepository {
    String prepareTheOrder(OrderData orderData);
}
