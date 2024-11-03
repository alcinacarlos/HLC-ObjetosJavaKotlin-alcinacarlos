package org.carlosalcina

import org.carlosalcina.java.escuela.EscuelaJava
import org.carlosalcina.java.gestionbiblioteca.GestonBibliotecaJava
import org.carlosalcina.java.hotel.GestionHotelJava
import org.carlosalcina.java.rpg.RpgJava
import org.carlosalcina.java.tareas.TareasJava
import org.carlosalcina.kotlin.escuela.EscuelaKotlin
import org.carlosalcina.kotlin.gestionbiblioteca.gestionBiblotecaKotlin
import org.carlosalcina.kotlin.hotel.gestionHotelKotlin
import org.carlosalcina.kotlin.rpg.RpgKotlin
import org.carlosalcina.kotlin.tareas.gestionTareas

private fun showMenu(){
    repeat(100){
        println("\n")
    }
    println("Bienvenido, selecciona el ejercicio a ejecutar:")
    println("\t 0. Salir")
    println("\t 1. Gestión Biblioteca")
    println("\t 2. Reserva Hotel")
    println("\t 3. Juego de rol")
    println("\t 4. Gestión Estudiantes")
    println("\t 5. Gestor tareas")
}

private fun javaOrKotlin():Boolean{
    var opcion:Int? = null
    println("Selecciona el idioma del ejercicio: ")
    println("\t1. Java")
    println("\t2. Kotlin")
    while (opcion !in 1..2){
        opcion = readln().toIntOrNull()
        if (opcion !in 1..2){
            println("Opción no válida, intentalo de nuevo")
        }
    }
    return opcion == 1
}

fun menuPrincipal(){
    var menuActivo = true
    while (menuActivo){
        showMenu()
        when(readln().toIntOrNull()){
            0 -> menuActivo = false
            1 -> if (javaOrKotlin()) GestonBibliotecaJava.main(arrayOf()) else gestionBiblotecaKotlin()
            2 -> if (javaOrKotlin()) GestionHotelJava.main(arrayOf()) else gestionHotelKotlin()
            3 -> if (javaOrKotlin()) RpgJava.main(arrayOf()) else RpgKotlin()
            4 -> if (javaOrKotlin()) EscuelaJava.main(arrayOf()) else EscuelaKotlin()
            5 -> if (javaOrKotlin()) TareasJava.main(arrayOf()) else gestionTareas()
            else -> println("Ejercicio no válido, vuelve a intentarlo")
        }
        println("\nEjercicio mostrado, espera 5 segundos....")
        Thread.sleep(5000)
    }
    println("Hasta luego!")
}
fun main(){
    menuPrincipal()
}