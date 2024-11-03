package org.carlosalcina.kotlin.rpg

fun RpgKotlin() {
    val guerrero = Guerrero("DonDragon", 100, 15)
    val mago = Mago("Nanometro", 80, 50)

    val fuego = Hechizo("Tornado", 20, 30)
    val hielo = Hechizo("Explision", 15, 20)

    mago.aprenderHechizo(fuego)
    mago.aprenderHechizo(hielo)

    guerrero.atacar(mago)
    mago.usarHechizo("Tornado", guerrero)
    mago.usarHechizo("Explision", guerrero)
}