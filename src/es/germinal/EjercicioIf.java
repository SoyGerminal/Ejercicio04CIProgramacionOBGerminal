package es.germinal;

public class EjercicioIf {
    public static void main(String[] args) {
        int num = 14;

        if (num > 0){
            System.out.println(num + " es un número positivo.");
        } else if (num < 0) {
            System.out.println(num + " es un número negativo.");
        }else {
            System.out.println(num + " es 0.");
        }
    }
}
