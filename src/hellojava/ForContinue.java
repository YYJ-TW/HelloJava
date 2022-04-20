package hellojava;

public class ForContinue {
    public static void main(String[] arg) {

        for (int u = 1; u <= 10; u++) {
            if (u == 5) {
                System.out.println("找到目標，繼續循環!");
                continue; //繼續執行
            }
            System.out.println(u);
        }
    }
}
