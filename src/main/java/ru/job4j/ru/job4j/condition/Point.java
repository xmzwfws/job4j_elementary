package ru.job4j.ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double rsl =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(2, 4, 6, 10);
            System.out.println("result (2, 4) to (6, 10) " + result);
        }
}
