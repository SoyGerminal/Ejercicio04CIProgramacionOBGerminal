package es.germinal;

public class EjercicioSwitch {
    public static void main(String[] args) {
        int season = 23;

        switch (season){
            case 12:
            case 1:
            case 2:
                System.out.println("Estamos en invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Estamos en primavera.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Estamos en verano.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("estamos en invierno.");
                break;
                default:
                    System.out.println("El dato introducido no es correcto.");
        }
    }
}
