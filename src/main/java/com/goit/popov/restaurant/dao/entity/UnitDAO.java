package com.goit.popov.restaurant.dao.entity;

import com.goit.popov.restaurant.model.Unit;

import java.util.List;

/**
 * Created by Andrey on 11/28/2016.
 */
public interface UnitDAO {
        List<Unit> getAll();
        Unit getById(int id);
}
