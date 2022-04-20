package hellojava;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        //宣告一個整數的陣列
        int[] a = new int[10];
        //建立一個從鍵盤接收資料的掃描器
        Scanner scanner = new Scanner(System.in);
        //循環擷取10個資料
        for (int i = 0; i < a.length; i++) {
            System.out.print("請輸入第" + (i + 1) + "個擷取資料:");
            a[i] = scanner.nextInt();
        }
        //使用foreach敘述顯示擷取的資料
        int i = 0;
        for (int e : a) {
            System.out.println(a[i] + " ");
            //每行顯示5個
            i++;
            //i的倍數%是5的話
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
