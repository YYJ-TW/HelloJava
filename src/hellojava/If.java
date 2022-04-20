package hellojava;

public class If {
    public static void main(String[] arg) {
        //分數輸入區
        int a = 75;
        //判斷a是否為負數
        if (a < 0) {
            System.out.println("負數");
        }
        if (a % 2 == 0) { //% 取餘數(a除2，整除後剩下的餘數)
            System.out.println("偶數");
        }
        else {
            System.out.println("奇數");
        }
        //分數等級判斷
        if (a >= 90) { //>= 大於等於
            System.out.println("優秀");
        } else if (a >= 80) {
            System.out.println("良好");
        } else if (a >= 70) {
            System.out.println("中等");
        } else if (a >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
