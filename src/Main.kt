import Level.readMap()
fun main(args: Array<String>, find: Any) {
    var wantsToContinue = true
//Imprime las opciones del menu principal

    do {
        println(menuprincipal())
        print("Ingrese la opcion del menu que desea (1-3): ")
        val option = readLine()!!.toInt()

        when (option) {
            1 -> {
                println(menuadmi())
                print("Ingrese la opcion del menu que desea (1-4): ")
                val optionmp = readLine()!!.toInt()
                when (optionmp) { //   Crear nivel
                    1 -> {
                        print("Ingrese el nombre del nivel: ")
                        val namel = readLine()!!
                        print("Ingrese el identificador: ")
                        val ident: String = readLine()!!
                        print(" Ingrese el color: ")
                        val color: String = readLine()!!
                        print("Ingrese la ubicacion del documento: ")
                        var ubic: String = readLine()!!
                        Level.readMap()
                     }                                             
                    //Eliminar nivel
                      2 -> {print("Ingrese el identificador: ")
                          val ident: String = readLine()!!}
                            Level.Checkindent()
                    // Ver todos los niveles
                    3 -> print("x == 1")
                    //Salir
                    4 -> print("Le deseamos un excelente dia")
                    else -> {
                        print("No ingreso la opcion correcta")
                    }
                }
            }
                // Imprime el menu de usuario
                2 -> {
                    println(menuuser())
                    print("Ingrese la opcion del menu que desea (1-2): ")
                    val optionmu = readLine()!!.toInt()

                    when (optionmu) { // muestra la opcion del menu de usuario ingresar placa
                        1 -> {
                            print("Ingrese el numero de placa: ")
                            val placa = readLine()!!
                            print("Ingrese el numero de nivel: ")
                            val level = readLine()!!
                            print("Ingrese el digito del estacionamiento: ")
                            val code = readLine()!!
                            print("Su ingreso ha sido un exito")

                        } //Si desea salir
                        2 -> print("gracias por preferirnos")

                        else -> {//Si no ingresa alguna de las opciones
                            print("No ingreso la opcion correcta")
                        }
                    }
                }//Si el usuario ya no desea continuar
                3 -> {
                    print("Gracias por visitarnos, esperamos que vuelva pronto")
                    wantsToContinue = false
                }//Si el usuario desea continuar con el menu
        }
    }while (wantsToContinue)
}

