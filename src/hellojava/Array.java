package hellojava;

public class Array {
    public static void main(String[] arg) {
        //陣列是程式語言中常見的一種資料結構。一班來說陣列用來儲存一組大小固定並且類型相同的資料，這些資料可以透過索引進行存取。
        //當我們要儲存多個同類的資料時，就可以使用陣列(Array)
        int[] a; //宣告1個整數陣列A
        a = new int[10]; //給陣列A分配儲存空間:10*4個位元組
        double[] b = new double[10]; //定義1個長度為10的雙精度浮點數
        char[] c = new char[100]; //定義1個長度為100的字元陣列c
        boolean[] d = new boolean[20]; //定義1長度為20的布林陣列d
        String[] s = new String[5]; //定義1個長度為5的字串陣列
        //輸出陣列物件的雜奏碼
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println("******************************");
        //輸出個陣列中第1個元素的值，注意輸出的內容
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        System.out.println(d[0]);
        System.out.println(s[0]);
        System.out.println("******************************");
        //下面輸出個陣列的長度
        System.out.println("a.length=" + a.length);
        System.out.println("b.length=" + b.length);
        System.out.println("c.length=" + c.length);
        System.out.println("d.length=" + d.length);
        System.out.println("s.length=" + s.length);

    }
}
