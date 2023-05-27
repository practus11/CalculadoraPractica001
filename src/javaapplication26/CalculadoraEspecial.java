/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

/**
 *
 * @author enamo
 */
 class CalculadoraEspecial {
        private String nombre;

        public CalculadoraEspecial(String nombre) {
            this.nombre = nombre;
        }

        public double sumar(double a, double b) {
            return a + b;
        }

        public double restar(double a, double b) {
            return a - b;
        }

        public double multiplicar(double a, double b) {
            return a * b;
        }

        public double dividir(double a, double b) {
            return a / b;
        }

        public double raizCuadrada(double a) {
            return Math.sqrt(a);
        }

       public boolean esPrimo(int numeroBuscado) {
    if (numeroBuscado <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(numeroBuscado); i++) {
        if (numeroBuscado % i == 0) {
            return false;
        }
    }
    return true;
}


        public double valorAbsoluto(double a) {
            return Math.abs(a);
        }

        public double tangente(double angulo) {
            return Math.tan(Math.toRadians(angulo));
        }

        public double coseno(double angulo) {
            return Math.cos(Math.toRadians(angulo));
        }

        public double reglaDeTres(double a, double b, double c) {
            return (c * b) / a;
        }

        public String factorizacion(int n) {
            StringBuilder factors = new StringBuilder();
            int divisor = 2;
            while (n > 1) {
                if (n % divisor == 0) {
                    factors.append(divisor).append(" ");
                    n /= divisor;
                } else {
                    divisor++;
                }
            }
            return factors.toString();
        }

        public boolean esPar(int a) {
            return a % 2 == 0;
        }
        }

  