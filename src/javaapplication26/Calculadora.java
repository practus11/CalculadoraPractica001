package javaapplication26;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        CalculadoraEspecial calculadora = new CalculadoraEspecial("enamorado");
        boolean salir = false;
        int opcion;

        do {
            System.out.println("");
            System.out.println("=======================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Verificar numero Primo");
            System.out.println("7. Valor Absoluto");
            System.out.println("8. Tangente");
            System.out.println("9. Coseno");
            System.out.println("10. Regla de Tres");
            System.out.println("11. Factorizacion");
            System.out.println("12. Par o impar");
            System.out.println("13. Salir");
            System.out.println("=======================");
            System.out.println("Selecciona una opcion");
            System.out.println("=======================");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la suma es = " + calculadora.sumar(num1, num2));
                }
                case 2 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la resta es = " + calculadora.restar(num1, num2));
                }
                case 3 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la multiplicacion es = " + calculadora.multiplicar(num1, num2));
                }
                case 4 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la division es = " + calculadora.dividir(num1, num2));
                }
                case 5 -> {
                    System.out.println("Ingrese el numero:");
                    double numero = sn.nextDouble();
                    System.out.println("El resultado de la raiz cuadrada es = " + calculadora.raizCuadrada(numero));
                }
                case 6 -> {
                    System.out.println("Ingrese el numero:");
                      int numeroBuscado = sn.nextInt();
                      if (calculadora.esPrimo(numeroBuscado)) {
                    System.out.println("El numero es primo.");
                         } else {
                    System.out.println("El numero no es primo.");
                            }
                           break;
                }
                case 7 -> {
                    System.out.println("Ingrese el numero:");
                    double valor = sn.nextDouble();
                    System.out.println("El valor absoluto es = " + calculadora.valorAbsoluto(valor));
                }
                case 8 -> {
                    System.out.println("Ingrese el angulo (en grados):");
                    double angulo = sn.nextDouble();
                    System.out.println("La tangente del angulo es = " + calculadora.tangente(angulo));
                }
                case 9 -> {
                    System.out.println("Ingrese el angulo (en grados):");
                    double angulo = sn.nextDouble();
                    System.out.println("El coseno del angulo es = " + calculadora.coseno(angulo));
                }
                case 10 ->                 {
                    System.out.println("Ingrese el valor 1:");
                    double valor2 = sn.nextDouble();
                    System.out.println("Ingrese el valor 3:");
                    double valor3 = sn.nextDouble();
                    {
                        double valor1 = 0;
                        System.out.println("El resultado de la regla de tres es = " + calculadora.reglaDeTres(valor1, valor2, valor3));
                    }
                }

                case 11 -> {
                    System.out.println("Ingrese el numero:");
                    int numeroFactorizar = sn.nextInt();
                    System.out.println("La factorizacion del numero es = " + calculadora.factorizacion(numeroFactorizar));
                    System.out.println("Ingrese el valor 2:");
                }
                case 12 -> {
                    System.out.println("Ingrese el numero:");
                    int numeroParImpar = sn.nextInt();
                    if (calculadora.esPar(numeroParImpar)) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                }
                case 13 -> salir = true;
                default -> System.out.println("Solo números entre 1 y 13");
            }
        } while (!salir);
    
}
    } 