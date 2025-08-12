public class Prog2{
    public static void main(String[] args)
    {
        String a ="abc";
        System.out.println(a);
        String b= new String("Hello");
        System.out.println(b);
        System.out.println("Whenever we create new objects the JVM creates it in the heap memory");
        System.out.println(a==b);
        int c=97;
        System.out.println("c is stored in stack while b is stored in heap as its a string pool");
        System.out.println((char)c);
        String d="abc";
        System.out.println(a==d);
        String q= new String("abc");
        System.out.println(a==q);
        System.out.println(a.equals(q));
        String e="Hello";
        String f =e.toUpperCase();
        System.out.println(e);
        System.out.println(f);
        System.err.println(e);//print error logs
        System.out.println(e.toLowerCase());
        System.out.println(e.charAt(0));
        System.out.println(e.length());
        System.out.println(e.contains("e"));
        System.out.println(e.replace("e","a"));
        System.out.println(e.substring(0,4));


    }
}