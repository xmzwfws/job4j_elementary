package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
      if (number == 0) {
            System.out.println("Colut not div by 0");
        }
      if (number < 0) {
          System.out.println("This a negative number");
      }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-1);
    }
}
