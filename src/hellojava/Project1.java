package hellojava;
import java.util.Scanner; //從鍵盤接收資料的掃描器

public class Project1 {

    public static void main(String[] args) {
        //建立Scanner
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------");
            System.out.println("請輸入1-5(0為退出)");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("你按了1");
                    break;
                case 2:
                    System.out.println("你按了2");
                    break;
                case 3:
                    System.out.println("你按了3");
                    break;
                case 4:
                    System.out.println("你按了4");
                    break;
                case 5:
                    System.out.println("你按了5");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("請輸入1-5(0為退出)");
            }
        }
    }
}
