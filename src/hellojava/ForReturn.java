package hellojava;

public class ForReturn {

    public static void main(String[] arg) {

        for (int a = 0; a <= 10; a++) {
            System.out.println("a的值是:" + a);
            if (a == 5) {
                return;
            }
            System.out.println("Return後輸出的敘述:");

        }

    }

}
