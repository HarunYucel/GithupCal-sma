package day01;

public class Q2_Print {
    /*76453 sayisinin her bir basamağını alt alta yazdırın

     */
    public static void main(String[] args) {
    int sayi= 76453;

    int birler= sayi%10;
    int onlar= (sayi/10)%10;
    int yüzler= (sayi/100)%10;
    int binler= (sayi/1000)%10;
    int onbinler= (sayi/10000)%10;
        System.out.println(onbinler + "\n" + binler + "\n" + yüzler + "\n" + onlar + "\n" + birler );

    }
}
