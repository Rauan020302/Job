package com.company;

public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1;
        int guessP2;
        int guessP3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9 ");

        while (true){
            System.out.println("Число которое тебе нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessP1);
            guessP2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessP2);
            guessP3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessP3);

            if (guessP1 == targetNumber){
                p1isRight = true;
            }
            if (guessP2 == targetNumber){
                p2isRight = true;
            }
            if (guessP3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры.");
                break;
            }else{
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}
