/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.goodnumber;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class GoodNumber {

    public static void main(String[] args) {
        int n, k, count = 0, sum = 0;
        String[] arr = new String[105];
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            arr[i] = scan.nextLine();
            count = 0;
            for (int j = 0; j <= k; j++) {
                for (int l = 0; l < arr[i].length(); l++) {
                    String helper = arr[i];
                    if (helper.toCharArray()[l] - '0' == j) {
                        count++;
                        break;
                    }
                }

            }
            if (count == k + 1) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
