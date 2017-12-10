package ru.misha.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Tire {

    @Id
    @GeneratedValue
    private Long id;

    private String size;
    private String price;
    private String season;

    public Tire(String size, String price, String season) {
        this.size = size;
        this.price = price;
        this.season = season;
    }
}
