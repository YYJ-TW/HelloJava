package hellojava;

public class Foreach {
    public static void main(String[] arg) {
    //JDK 1.5之後，Java提供了一種更簡單的循環"foreach循環"，這種循環檢查陣列和集合更加簡潔
        int[] a = {5,7,20}; //靜態初始化
        System.out.println("陣列a中的元素:");
        for (int e : a) {
            System.out.println(e);
        }
        /*
        *以上for功能相等於以下這段，foreach敘述非常簡鍊，因此在檢查輸出陣列或集合元素時經常採用此種方式
        * for (int i = 0; i < a.length; i++) {
        *   System.out.println(a[i]);
        * }
        */

    }
}
