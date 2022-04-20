package hellojava;

public class ForArray {
    public static void main(String[] arg) {
        //初始化陣列
        int[] a = {5, 7, 20}; //定義並初始化陣列，使用「靜態」初始化
        int[] b = new int[4]; //定義並初始化陣列，使用「動態」初始化

        for (int i = 0; i < a.length; i++) { //注意: 要是小於，而不是小於等於
            b[i] = i + 1;
        }
        System.out.println("陣列a中的元素:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("b陣列的長度為:" + b.length);
        System.out.println("陣列b中的元素是:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        b = a; //都是int類型，所以可以將b值轉a
        System.out.println("b陣列的長度為:" + b.length);
    }

}
