package com.company;

public class DoughnutFactory {
    private static int cherryDoughnutCount;
    private static int chocolateDoughnutCount;
    private static int almondDoughnutCount;

    public Doughnut getDoughnut(DoughnutTypes types){
        Doughnut toReturn;
        switch (types) {
            case CHERRY:
                cherryDoughnutCount++;
                toReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                chocolateDoughnutCount++;
                toReturn = new ChocolateDoughnut();
                break;
            case ALMOND:
                almondDoughnutCount++;
                toReturn = new AlmondDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + types);
        }
        return toReturn;
    }
    public void printCount(){
        System.out.println("Number of doughnuts produced (by type):");
        System.out.println("Cherry doughnuts: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnuts: " + chocolateDoughnutCount);
        System.out.println("Almond doughnuts: " + almondDoughnutCount);
        System.out.println("Total: " + (cherryDoughnutCount + chocolateDoughnutCount + almondDoughnutCount));

    }
}
