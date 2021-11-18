import java.util.Arrays;
import java.util.Collections;

public class Coffeemashine {

    public static int[] changes(int money, int price) {
        int index = 0;
        int oddmoney = money - price;
        int[] coins = new int[]{10, 5, 2, 1};
        int[] result = new int[oddmoney];
        for (int coin : coins) {
            while (oddmoney >= coin) {
                result[index] = coin;
                oddmoney = oddmoney - coin;
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}

