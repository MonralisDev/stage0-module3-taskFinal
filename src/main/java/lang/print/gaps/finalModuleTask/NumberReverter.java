package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int reversedNumber = units * 100 + tens * 10 + hundreds;

        System.out.println(reversedNumber);
    }
}
