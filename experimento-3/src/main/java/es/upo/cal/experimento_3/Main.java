package es.upo.cal.experimento_3;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        // Llama a los métodos para obtener las salidas y mostrarlas por pantalla
        System.out.println("Un String con 10 caracteres random: "+obtenerStringRandom(10));
        System.out.println("Un String compuesto por 5 caracteres alfanuméricos: "+obtenerStringAlfanumerico(5));
        System.out.println("Un array con 5 Strings de 8 caracteres random cada uno: ");
        String[] arrayString = obtenerArrayStrings(5, 8);
        imprimirArray(arrayString);
        System.out.println("copia del array anterior al revés: ");
        String[] arrayReverso = obtenerArrayReverso(arrayString);
        imprimirArray(arrayReverso);
    }

    // Método para obtener un String con caracteres aleatorios
    public static String obtenerStringRandom(int length) {
        return RandomStringUtils.random(length, true, true);
    }

    // Método para obtener un String alfanumérico
    public static String obtenerStringAlfanumerico(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    // Método para obtener un array de Strings con caracteres aleatorios
    public static String[] obtenerArrayStrings(int arrayLength, int stringLength) {
        String[] array = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = obtenerStringRandom(stringLength);
        }
        return array;
    }

 // Método para obtener una copia del array en orden inverso
    public static String[] obtenerArrayReverso(String[] array) {
        String[] copia = array.clone();
        ArrayUtils.reverse(copia);
        return copia;
    }

    // Método para imprimir un array de Strings
    public static void imprimirArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}