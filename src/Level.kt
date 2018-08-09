import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files.readAllLines
import java.nio.file.Paths
import java.util.*


class Level (
        var namel: List<String> = listOf(),
        var ident: List<String> = listOf(),
        var color: List<String> = listOf(),
        var ubic: String
)
fun readMap(ubic: String ) {
    val scanner: Scanner
    try {
        val lines = readAllLines(Paths.get(ubic), StandardCharsets.UTF_8)

    } catch (exception: IOException) {
        println("Error!")
    }
}