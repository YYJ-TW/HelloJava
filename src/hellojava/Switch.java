package hellojava;

public class Switch {
    public static void main(String[] arg) {

        int a = 10;
        //用Switch判斷a的等級
        switch (a / 10) {
            case 10: //case的值(value)必須是常數
            case 9:
                System.out.println("優秀");
                break; //break用於跳出switch敘述，即當執行完1個case分支，終止switch敘述的執行
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default: //如同else的概念
                System.out.println("不及格");
        }

        //字串判斷
        String season = "秋天";
        switch (season) {
            case "春天":
                System.out.println("就春天齁");
                break;
            case "夏天":
                System.out.println("就夏天齁");
                break;
            case "秋天":
                System.out.println("就秋天齁");
                break;
            case "冬天":
                System.out.println("就冬天齁");
                break;
            default:
                System.out.println("錯誤");
                break;
        }

    }
}
