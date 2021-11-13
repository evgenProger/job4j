import java.util.Arrays;
import java.util.Collections;

public class Coffeemashine {

    private static int[] result;

    public static int[] changes(int money, int price) {
        int index = 0;
        int oddmoney = money - price;
        int[] coins = new int[]{10, 5, 2, 1};
        result = new int[oddmoney];
        for (int i : coins) {
            while (oddmoney >= i) {
                result[index] = i;
                oddmoney = oddmoney - i;
                index++;
            }
            if (oddmoney == 0) {
                break;
            }
        }
        return Arrays.copyOf(result, index);
    }
}

 /*while (oddmoney >= i) {
         result[index] = coins[i];
         oddmoney = oddmoney - i;
         index++;
         }
         if (oddmoney == 0) {
         break;
         }

  */