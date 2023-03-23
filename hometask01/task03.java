package hometask01;
import java.util.Arrays;
public class task03 {
    public static void check(int[] num)
        {
            int k = 0;
            int val = 3;
            for (int i: num)
            {
                if (i != val) {
                    num[k++] = i;
                }
            }
            for (int i = k; i < num.length; i++) {
                num[i] = val;
            }
        }
     
        public static void main(String[] args)
        {
            int[] nums = { 3, 2, 2, 3 };
     
            check(nums);
            System.out.println(Arrays.toString(nums));
        }
    }
