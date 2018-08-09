// principal
// Bienvenia al estacionamiento
//1. Adminitrador
//2. Conductor
//3. Salir
fun menuprincipal(): String {
    return """
        Bienvenido(a) al estacionamiento:
        1. Administrador
        2. Conductor
        3. Salir
    """.trimIndent()
}

//  Menu del administrador
fun menuadmi(): String {
    return """
        Bienvenido(a):
        1. Crear nivel
        2. Eliminar nivel
        3. Ver todos los niveles
        4. Salir
    """.trimIndent()
}
//  Menu del usuario
fun menuuser(): String {
    return """
        Bienvenido(a):
        1. Ingresar placa
        2. Salir
    """.trimIndent()
}
