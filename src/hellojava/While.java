package hellojava;

public class While {
    public static void main(String[] arg) {
        //While循環是判斷是否為true，如果為true，則執行循環本體內的敘述，如果條件運算式為false，則終止循環
        int a = 0;
        int b = 1;

        while (b <= 100) { //小於等於
            a += b; //先進行加法運算，再附值運算 a+=b就等於a=a+b
            b ++; //每執行1次就加1次
        }
        System.out.println("1~100的和是:" + a);

    }
}
