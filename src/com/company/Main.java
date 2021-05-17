package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DoughnutFactory factory1 = new DoughnutFactory();

//        Doughnut cherry = factory1.getDoughnut(DoughnutTypes.CHERRY);
//        Doughnut chocolate = factory1.getDoughnut(DoughnutTypes.CHOCOLATE);
//        Doughnut almond = factory1.getDoughnut(DoughnutTypes.ALMOND);
//
//        cherry.eat();
//        chocolate.eat();
//        almond.eat();

        DoughnutFactory factory = new DoughnutFactory();
        for(int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }
        factory.printCount();
    }

    public static void eatRandomDoughnut(DoughnutFactory factory) {
        Doughnut randomDougnut = getRandomDougnut(factory);
        System.out.print("What a surprise! ");
        randomDougnut.eat();
    }

    public static Doughnut getRandomDougnut(DoughnutFactory factory){
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];

        return(factory.getDoughnut(type));
    }

}
