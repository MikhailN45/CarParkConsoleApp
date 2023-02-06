fun main() {
    print("Type /start")

    do {
        val inputText = readLine()
        if (inputText == "/start") {
            println("App started, hello!")
        }
        else if (inputText == "/help") {
            println("Available commands: /start for begin work, /help for info, /end for close app")
        }
        else if (inputText == "/end") {
            println("App closed, good bye!")
            break
        } else println("Invalid input! Type /help for info")

    } while (true)
}