public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean b = false;
        boolean a = true;
        boolean c = true;
        a &= c;
        a &= b;
        a &= c;
        System.out.println(a);
    }
}
