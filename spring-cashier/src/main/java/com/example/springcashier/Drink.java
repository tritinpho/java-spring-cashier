package com.example.springcashier;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="drinks")
@Data
@RequiredArgsConstructor
class Drink {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String drink ;
    private String milk ;
    private String size ;
    private String register ;

}
