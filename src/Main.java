import java.util.Date;
import java.util.GregorianCalendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private GregorianCalendar calendar;

    public Main() {
        calendar = new GregorianCalendar();
    }

    public void displayDate() {
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Месяцы в GregorianCalendar начинаются с 0
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year + ", Месяц: " + month + ", День: " + day);
    }

    public void setTimeInMillis(long milliseconds) {
        calendar.setTimeInMillis(milliseconds);
    }

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumbers();
        System.out.println("\n");
        Main main = new Main();

        System.out.println("Текущая дата:");
        main.displayDate();

        long milliseconds = 1234567898765L;
        main.setTimeInMillis(milliseconds);

        System.out.println("Дата после установки времени:");
        main.displayDate();
    }
}