package hellojava;

public class Variable {
    public static void main(String[] args) {
        //可以包含數字，但不能以數字開頭
        //除底線"_"和"$"符號，不可包含其他特殊字元，空格也算
        //"abc"和"ABC"是不同識別符號
        //不能使用Java關鍵字

        int a = 10; //宣告變數並附初始值10
        System.out.println(a); //列印a變數

        int b; //先宣告變數
        b = 20; //在附初始值20
        System.out.println(b);
        System.out.println(a + b); //列印a+b等於出的數字

        int c = a * b;
        System.out.println("a*b: " + c);

        String s1 = "這是字串變數初始值1";
        System.out.println(s1);
        //常數

        final double PI=3.1416; //宣告double類型的常數，初始值為3.1416
        final boolean IS_MAN=true; //宣告boolean類型的常數，初始值為true

        //基本類型
        //byte 位元組｜short 短整數｜int 整數｜long 長整數｜float 浮點數｜double 雙精度｜boolean 布林值｜char 字元類型

    }
}
