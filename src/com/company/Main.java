package com.company;

public class Main {

    private String[] tokens;
    private int pos;

    public static void main(String[] args) {
        String expr = "1 + ( 2 / 3 ) * 4 - 5 + 6 * 7";
        Main main = new Main(expr);
        System.out.println(main.calculator());
        System.out.println(1 + ( 2 / 3 ) * 4 - 5 + 6 * 7);
    }
    public Main(String expr){
        this.tokens = expr.split(" ");
        this.pos = 0;
    }
    public double calculator(){
        double first = multiply();

        while (pos < tokens.length){
            String operation = tokens[pos];
            if (!operation.equals("+") && !operation.equals("-")){
                break;
            }else {
                pos++;
            }

            double second = multiply();
            if (operation.equals("+")){
                first += second;
            }else{
                first -= second;
            }
        }
        return first;
    }

    private double multiply(){
        double first = factor();

        while (pos < tokens.length){
            String operation = tokens[pos];
            if (!operation.equals("*") && !operation.equals("/")){
                break;
            }else {
                pos++;
            }

            double second = factor();
            if (operation.equals("*")){
                first *= second;
            }else{
                first /= second;
            }
        }
        return first;
    }

    public double factor(){
        String next = tokens[pos];
        double result;
        if (next.equals("(")){
            pos++;
            result = calculator();
            String closingBracket;
            if (pos < tokens.length){
                closingBracket = tokens[pos];
            }else {
                throw new IllegalArgumentException("unexpected end of expression");
            }
            if (closingBracket.equals(")")){
                pos++;
                return result;
            }
            throw new IllegalArgumentException("')' expected but " + closingBracket + " found");

        }
        pos++;
        return Double.parseDouble(next);

    }
}
