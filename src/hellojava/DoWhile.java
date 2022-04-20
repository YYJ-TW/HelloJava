package hellojava;

public class DoWhile {

    public static void main(String[] arg) {

        int a = 0;
        int b = 1;
        do { //循環本體
            a += b;
            b++;
        } while (b <= 100); //條件運算式
        System.out.println("1~100的和:" + a);
    }

}
