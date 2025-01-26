package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousands = number / 1000;       // Перша цифра (тисячі)
        int hundreds = (number / 100) % 10;  // Друга цифра (сотні)
        int tens = (number / 10) % 10;       // Третя цифра (десятки)
        int units = number % 10;             // Четверта цифра (одиниці)

        // Обчислюємо суму цифр
        int sum = thousands + hundreds + tens + units;

        // Виводимо результат
        System.out.println(sum);
    }

}
