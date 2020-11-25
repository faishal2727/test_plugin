import java.util.*

fun main(){
    println("Nama   : Muh.faishal rizal")
    println("NIM    : 20090029")
    println("semester : 1")
    println("kelas  : 1a")
    println("TTL    :Tegal,27 Februari 2001")
    println("Alamat :desa Langgen, rt 08, rw 02")
}

object TahunKabisat {
    @JvmStatic
    fun main(args: Array<String>) {
        val tahun: Int
        val scan = Scanner(System.`in`)
        print("Masukkan tahun : ")
        tahun = scan.nextInt()
        if (tahun % 400 == 0) {
            print("$tahun Merupakan Tahun Kabisat\n")
        } else if (tahun % 100 == 0) {
            print("$tahun Bukan Tahun Kabisat\n")
        } else if (tahun % 4 == 0) {
            print("$tahun Merupakan Tahun Kabisat\n")
        } else {
            print("$tahun Bukan Tahun Kabisat\n")
        }
    }
}

internal object Proram_Looping {
    @JvmStatic
    fun main(args: Array<String>) {
        val b = 5
        for (i in 1..b) {
            for (j in 1 until i){
                print(" ")
            }
            for (k in b downTo i){
                print("*")
            }
            println()
        }
    }
}