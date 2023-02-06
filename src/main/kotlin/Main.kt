fun main() {
    print("Type /start")

    var inputText = readLine()

    while (true) {
        when (inputText) {

            "/start" -> {
                println("App started, hello!")
                inputText = readLine()
            }

            "/help" -> {
                println("Available commands: /start for begin work, /help for info, /end for close app")
                inputText = readLine()
            }

            "/end" -> {
                println("App closed, good bye!")
                break
            }

            else -> {
                println("Invalid input! Type /help for info")
                inputText = readLine()
            }
        }
    }
}
