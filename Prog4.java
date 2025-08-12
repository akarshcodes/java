public class Prog4{
    public static void main(String [] args)
    {
        int a =5;
        int b = 10;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a<<1));
        System.out.println(Integer.toBinaryString(a>>1));
    }
}