package com.example.springcashier;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="generated_orders")
@Data
@RequiredArgsConstructor
class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String drink ;
    private String milk ;
    private String size ;
    private String total ;
    private String register ;
    private String status ;
    
    public static Order GetNewOrder() {
        Order o = new Order() ;

        DrinkGenerator.generateDrink(o);

        return o ;
    }


}
