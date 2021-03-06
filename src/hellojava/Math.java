package hellojava;

public class Math {
    public static void main(String[] arg) {
        //----------一元運算符號----------
        //自動增加 ++、--｜邏輯非 !｜逐位元非 ~｜強制類型轉換 (type)
        //----------二元運算符號----------
        //算數運算 +、-、*、/、%｜位元運算 &、|、^、<<、>>、>>>｜關係運算 >、>=、<、<=、==、!=｜邏輯運算 &&、||
        //設定值 =、+=、-=、*=、/=、%=、&=、|=、^=、<<=、>>=、>>>=
        //----------三元運算符號----------
        //?:
        int a = 5;
        int b = ++a + 8; //自動增加a，會變成6，再與8相加(6+8=14)，最後b的值為14(加出來的結果)
        System.out.println(b);

        //常見運算
        //+ 加法｜- 減法｜* 乘法｜/ 除法｜% 取餘數(第1個數/第2個數，整除後剩下的餘數)
        System.out.println(10 % 5);
        //> 大於｜>= 大於等於｜< 小於｜<= 小於等於｜== 等於
        //>= 左邊運算元"大於"或"等於"右邊運算元，則回傳｜<=  左邊運算元"小於"或"等於"右邊運算元，則回傳
        int x = 10;
        int z = 5;
        System.out.println(x = z);
    }

}
