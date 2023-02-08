import ParkingManager.allSlotStats
import ParkingManager.carInfo
import ParkingManager.parkCar
import ParkingManager.parkLogs
import ParkingManager.returnCar
import ParkingManager.slotInfo

fun main() {

    print(Messages.welcomeMessage)

    var inputText = readLine()
    while (true) {
        when (inputText) {

            Command.startCommand -> {
                println(Messages.startMessage)
                inputText = readLine()
            }

            Command.parkCommand -> {
                println(Messages.parkRequestInfoMessage)
                parkCar()
                inputText = readLine()
            }

            Command.returnCommand -> {
                println(Messages.returnMessage)
                returnCar()
                inputText = readLine()
            }

            Command.parkInfoByCarCommand -> {
                println(Messages.parkInfoByCarMessage)
                carInfo()
                inputText = readLine()
            }

            Command.parkInfoByPlaceCommand -> {
                println(Messages.parkInfoByPlaceMessage)
                slotInfo()
                inputText = readLine()
            }

            Command.parkStatsCommand -> {
                allSlotStats()
                inputText = readLine()
            }

            Command.parkAllStatsCommand -> {
                parkLogs()
                inputText = readLine()
            }

            Command.helpCommand -> {
                println(Messages.helpMessage)
                inputText = readLine()
            }

            Command.endCommand -> {
                println(Messages.endMessage)
                break
            }

            else -> {
                println(Messages.invalidCommandMessage)
                inputText = readLine()
            }
        }
    }
}

