public class bitswap {
    public static void main(String[] args) {
        int a=120;
        int b=100;
        a=a^b;
        b=a^b;
        System.out.println(b);
        System.out.println(a);
    }
    
}
