package hellojava;

public class For {
    public static void main(String[] arg) {
        //迴圈初始數值為1，迴圈每運行1次，就會++(自動增加)，直到小於或等於10才會結束
        for (int count = 1; count <= 10; count++) { //<= 小於等於 ++自動增加
            System.out.print(count);
        }
        System.out.println("結束!");

        int b = 0;
        for (int i = 1; i <= 100; i++) {
            b += i;
        }
        System.out.println("1~100的和:" + b);

        //99
        for (int a99 = 1; a99 <= 9; a99++) {
            for (int j = 1; j <= a99; j++) {
                System.out.print(j + "*" + a99 + "=" + a99 * j + " ");
            }
            System.out.println();
        }

        for (int e = 1; e <= 10; e++) {
            if (e == 5) {
                System.out.println("找到目標，終止循環!");
                break;
            }
            System.out.println(e);
        }

    }
}