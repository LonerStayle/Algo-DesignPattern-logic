import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.ServerSocket

fun main() {

    Thread{
        try {
            val serverRead = ServerSocket(8888)
            while (true){
                val socket = serverRead.accept()
                val input = socket.getInputStream()
                val dataInputStream = DataInputStream(input)
                val intData = dataInputStream.readUTF()
                val stringData = dataInputStream.readUTF()

                println("Android 에서 받은 숫자 : $intData")
                println("Android 에서 받은 문자열 : $stringData")
            }

        }catch (e:java.lang.Exception){
            e.printStackTrace()
        }
    }.start()
    try {
        val server = ServerSocket(7777)

        while (true) {
            println("사용자 접속 대기중...")

            val socket = server.accept()
            val output = socket.getOutputStream()
            val dataOutputStream = DataOutputStream(output)

            dataOutputStream.writeInt(readLine()!!.toInt())
            dataOutputStream.writeUTF("서버 문자열")
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }

}