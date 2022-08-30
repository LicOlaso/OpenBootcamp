public class Main {
    public static void main(String[] args) {
        System.out.println("Primera Parte");
        sumar(4,6,8);
        System.out.println("Segunda Parte");
        coche miCoche = new coche();
        miCoche.incrementar_puertas(1);
        miCoche.mostrar_puertas();
    }

    private static void sumar(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}