package mercado;

public class Test {
    public static void main(String[] args) {
        Produtos p = new Produtos("camelo", 55.99);
        Produtos p1 = new Produtos("Cavalo", 94.30);
        Produtos p2 = new Produtos("ps4", 3000.0);

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
    }
}
