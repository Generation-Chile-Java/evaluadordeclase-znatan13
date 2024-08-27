import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // evaluar las calificaciones de un estudiante para tres materias distintas
        // pedir que ingrese calificacion de estudiante por cada materia y guardar cada valor en su variable
        // usar "if" "else if" "else" para determinar y mostrar la calificacion final correspondiente segun las siguientes conficiones
        // No aprovado si es igual o menor que 3
        // insuficiente si es mayor que 3 pero menor o igual que 5
        // aceptable mayor de 5 menor o igual 8
        // exelente si es un 10
        //invalido fuera de |0-10|
        System.out.println("coloque su nota de matematicas");
        Integer notaM = scnr.nextInt();
        System.out.println("coloque su nota de lenguaje");
        Integer notaL = scnr.nextInt();
        System.out.println("coloque su nota de ingles");
        Integer notaI = scnr.nextInt();
        Integer promedio = notaM + notaL + notaI;
        Integer notaF = promedio / 3;
        if (notaM + notaL + notaI < -1) {
            System.out.println("Nota Invalida");
        } else if (notaM + notaL + notaI < 10) {
            System.out.println("Nota Invalida");
        }
        if (notaF <= 3) {
            System.out.println("Reprobo");
        } else if (notaF <= 5) {
            System.out.println("Insuficiente");
        } else if (notaF <= 8) {
            System.out.println("Aceptable");
        } else {
            System.out.println("Exelente");
        }
    }
}
