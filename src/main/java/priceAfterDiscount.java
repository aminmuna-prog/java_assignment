import java.util.regex.*;
import java.util.*;
public class priceAfterDiscount {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, " +
                "what will be my total cost after giving 15% discount?";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        int laptopPrice = numbers.get(1);
        int mousePrice = numbers.get(2);
        int quantity = numbers.get(3);
        int discountPercentage = numbers.get(4);

        int totalPrice = laptopPrice + (mousePrice * quantity);
        double discountAmount = (discountPercentage / 100.0) * totalPrice;
        double finalPrice = totalPrice - discountAmount;
        System.out.printf("Final price after discount is %.2f", finalPrice);
    }
}
