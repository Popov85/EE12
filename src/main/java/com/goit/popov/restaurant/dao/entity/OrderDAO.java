package com.goit.popov.restaurant.dao.entity;

import com.goit.popov.restaurant.model.Dish;
import com.goit.popov.restaurant.model.Order;

import java.util.List;

/**
 * Created by Andrey on 10/14/2016.
 */
public interface OrderDAO extends GenericDAO<Order> {
        void addDish(Order order, Dish dish, int quantity);
        void deleteDish(Order order, Dish dish, int quantity);
        void close(Order order);
        List<Order> getAllClosed();
        List<Order> getAllOpened();
}
