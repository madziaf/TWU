package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(oneStar());
        System.out.println(horizontalLine(5, '*'));
        System.out.println(verticalLine(3));
        System.out.println(rightTriangle(3));
        System.out.println(isoscelesTriangle(3));
        System.out.println(diamond(3));
        System.out.println(diamondWithName(3));
        System.out.println(computePrimeFactors(30));
        fizzBuzz();
    }

    public static String oneStar() {
        String star = "*";
        return star;
    }

    public static String horizontalLine(int number, char character) {
        String stars = "";
        while (number > 0) {
            stars = stars + character;
            number--;
        }
        return stars;
    }

    public static String horizontalLine(int number){
        return horizontalLine(number, '*');
    }


    public static String verticalLine(int i) {
        String stars = "";
        while (i > 1) {
            stars = stars + "*\n";
            i -= 1;
        }
        if (i == 1) {
            stars = stars + "*";
        }
        return stars;
    }

    public static String rightTriangle(int i) {
        String stars = "";
        while (i > 1) {
            stars = horizontalLine(i) + stars;
            stars = "\n" + stars;
            i--;
        }
        if (i == 1) {
            stars = horizontalLine(i) + stars;
        }
        return stars;
    }

    public static String paddedLine(int stars, int padding) {
        return horizontalLine(padding, ' ') + horizontalLine(stars, '*') + horizontalLine(padding, ' ');
    }

    public static String isoscelesTriangle(int lines) {
        int totalLength = 2 * lines - 1;
        String triangle = "";
        int currentLine = 1;
        while (currentLine <= lines ) {
            int stars = currentLine * 2 - 1;
            int padding = (totalLength - stars) / 2;
            triangle += paddedLine(stars, padding);
            if (currentLine < lines) {
                triangle += "\n";
            }
            currentLine++;
        }
        return triangle;
    }

    public static String upsideDownIsoscelesTriangle(int lines) {
        int totalLength = 2 * lines - 1;
        String triangle = "";
        int currentLine = 1;
        while (currentLine < lines ) {
            int stars = currentLine * 2 - 1;
            int padding = (totalLength - stars) / 2;
            currentLine++;
            triangle = paddedLine(stars, padding) + triangle;
            triangle = "\n" + triangle;
        }
        return triangle;
    }

    public static String diamond(int lines) {
        return isoscelesTriangle(lines) + upsideDownIsoscelesTriangle(lines);
    }

    public static String diamondWithName(int lines) {
        return diamond(lines).replace(horizontalLine(lines * 2 - 1), "Magda");
    }

    public static List<Integer> computePrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int divisor = 2; divisor <= n;) {
            if(n % divisor == 0) {
                factors.add(divisor);
                n = n / divisor;
            } else divisor++;
        }
        return factors;
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 =  i % 5 == 0;
            if ( by3 && by5) {
                System.out.println("FizzBuzz");
            } else if (by3) {
                System.out.println("Fizz");
            } else if (by5) {
                System.out.println("Buzz");
            } else {
                String num = "" + i;
                System.out.println(num);
            }
        }
    }
}