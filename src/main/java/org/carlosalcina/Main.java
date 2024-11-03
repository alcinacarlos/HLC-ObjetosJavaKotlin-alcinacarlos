package org.carlosalcina;

import static org.carlosalcina.kotlin.gestionbiblioteca.GestionBibliotecaKotlinKt.gestionBiblotecaKotlin;
import org.carlosalcina.java.gestionbiblioteca.GestonBibliotecaJava;

public class Main {
    public static void main(String[] args) {
        gestionBiblotecaKotlin();
        new GestonBibliotecaJava();
        gestionBiblotecaKotlin();
        System.out.println("Hello world!");
    }
}