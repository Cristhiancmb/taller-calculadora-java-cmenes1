import java.util.Scanner;
public class Calculadora {

    private double valor1;
    private double valor2;

    // Constructor de la clase
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Método para sumar los dos valores
    public double sumar() {
        return valor1 + valor2;
    }

    // Método para restar los dos valores
    public double restar() {
        return valor1 - valor2;
    }

    // Método para multiplicar los dos valores
    public double multiplicar() {
        return valor1 * valor2;
    }

    // Método para dividir los dos valores
    public double dividir() {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();


        Calculadora calculadora = new Calculadora(valor1, valor2);

        // Solicitar al usuario la operación deseada
        System.out.println("Seleccione una operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = calculadora.sumar();
                System.out.println("Resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = calculadora.restar();
                System.out.println("Resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar();
                System.out.println("Resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = calculadora.dividir();
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
