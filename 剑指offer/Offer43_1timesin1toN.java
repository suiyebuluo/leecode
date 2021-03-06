package SwordOffer;

import java.util.Scanner;

/**
 *
 * 剑指 Offer 43. 1～n整数中1出现的次数
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 * 示例 1：
 * 输入：n = 12
 * 输出：5
 * 示例 2：
 * 输入：n = 13
 * 输出：6
 * 限制：
 * 1 <= n < 2^31
 */
public class Offer43_1timesin1toN {
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        Offer43_1timesin1toN solution=new Offer43_1timesin1toN();
        System.out.println(solution.countDigitOne(num));
    }
}
