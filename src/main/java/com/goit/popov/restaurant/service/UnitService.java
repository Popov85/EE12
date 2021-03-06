package com.goit.popov.restaurant.service;

import com.goit.popov.restaurant.dao.entity.UnitDAO;
import com.goit.popov.restaurant.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Andrey on 11/28/2016.
 */
public class UnitService {

        @Autowired
        private UnitDAO unitDAO;

        public void setUnitDAO(UnitDAO unitDAO) {
                this.unitDAO = unitDAO;
        }

        public List<Unit> getAll() {
                return unitDAO.getAll();
        }

        public Unit getById(int id) {
                System.out.println("Unit service in use!");
                return unitDAO.getById(id);
        }
}
