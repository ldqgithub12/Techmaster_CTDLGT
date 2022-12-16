public class Main {
    public static void f(int n){
        if (n>9){
            return;
        }
        System.out.println("Start: "+n);
        f(n+1);
        System.out.println("End: "+n);
    }
    public static void main(String[] args) {
        f(0);
    }
}