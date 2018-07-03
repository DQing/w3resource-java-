import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input the number of minutes:");
        Scanner input = new Scanner(System.in);
        BigDecimal minutesInYear = BigDecimal.valueOf(60 * 24 * 365);
        BigDecimal minutesInDay = BigDecimal.valueOf(60 * 24);
        BigDecimal bigDecimal = input.nextBigDecimal();
        BigDecimal year = bigDecimal.divideToIntegralValue(minutesInYear);
        BigDecimal day = bigDecimal.divideToIntegralValue(minutesInDay).divideAndRemainder(BigDecimal.valueOf(365))[1];
        System.out.print(bigDecimal+" minutes is approximately "+year+" years and "+day+" days");
    }
}
