package com.example.springcashier;

import java.util.HashMap;
import java.util.Random;

public class DrinkGenerator {

    //Array for mapping purposes
    private static HashMap<String, Double> tall = new HashMap<String, Double>();
    private static HashMap<String, Double> grande = new HashMap<String, Double>();
    private static HashMap<String, Double> venti = new HashMap<String, Double>();
    private static HashMap<String, Double> shortSize = new HashMap<String, Double>();

    //Array from the Sample Code
    private static String[] DRINK_OPTIONS = { "Caffe Latte", "Caffe Americano", "Caffe Mocha", "Espresso", "Cappuccino" };
    private static String[] MILK_OPTIONS  = { "Whole Milk", "2% Milk", "Nonfat Milk", "Almond Milk", "Soy Milk" };
    private static String[] SIZE_OPTIONS  = { "Short", "Tall", "Grande", "Venti", "Your Own Cup" };

    static{
        tall.put("Caffe Latte", 2.95);
        grande.put("Caffe Latte", 3.65);
        venti.put("Caffe Latte", 3.95);

        tall.put("Caffe Americano", 2.25);
        grande.put("Caffe Americano", 2.65);
        venti.put("Caffe Americano", 2.95);

        tall.put("Caffe Mocha", 3.45);
        grande.put("Caffe Mocha", 4.15);
        venti.put("Caffe Mocha", 4.45);

        tall.put("Cappuccino", 1.95);
        grande.put("Cappuccino", 3.65);
        venti.put("Cappuccino", 3.95);

        shortSize.put("Espresso", 1.75);
        tall.put("Espresso", 1.95);
    }


    public static void generateDrink(Order o) {
        Random random = new Random();

        o.setDrink(DRINK_OPTIONS[random.nextInt(DRINK_OPTIONS.length)]) ;
        o.setMilk(MILK_OPTIONS[random.nextInt(MILK_OPTIONS.length)]) ;
        if (o.getDrink().equals("Espresso")) { 
            o.setSize(SIZE_OPTIONS[random.nextInt(2)]);
        } else {
            o.setSize(SIZE_OPTIONS[random.nextInt(SIZE_OPTIONS.length-1) + 1]);
        }

        switch (o.getSize()){
            case "Tall":
                o.setTotal(tall.get(o.getDrink()).toString()) ;
                break;
            case "Grande":
                o.setTotal(grande.get(o.getDrink()).toString()) ;
                break;
            case "Venti":
                o.setTotal(venti.get(o.getDrink()).toString()) ;
                break;
            default:
                o.setTotal(shortSize.get(o.getDrink()).toString()) ;
                break;
        }

        o.setStatus("Ready for Payment") ;
    }

}