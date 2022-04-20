package hellojava;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
    //宣告一個整數陣列
    int[] a = new int[10];
    //建立一個從鍵盤接收資料的掃描器
    Scanner scanner = new Scanner(System.in);
    //循環擷取10個資料
    for(int i = 0; i < a.length; i++) {
        System.out.println("請輸入第"+(i+1)+"個擷取資料:");
        a[i] = scanner.nextInt();
    }
    //循環輸出擷取資料
    for(int i = 0; i < a.length; i++) {
        System.out.println(a[i] + " ");
    }
    System.out.println();
    }
}
