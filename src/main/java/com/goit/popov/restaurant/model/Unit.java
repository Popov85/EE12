package com.goit.popov.restaurant.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Andrey on 24.11.2016.
 */
@Entity
@Table(name = "unit")
public class Unit {
        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        @Column(name = "U_ID")
        protected int id;

        @NotEmpty(message = "Please, provide name for a unit")
        //@Size(min=1, max=15)
        @Length(min = 1, max = 15)
        @Column(name = "U_NAME")
        protected String name;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Unit unit = (Unit) o;
                return name.equals(unit.name);
        }

        @Override
        public int hashCode() {
                return name.hashCode();
        }

        @Override
        public String toString() {
                return "Unit{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
        }
}
