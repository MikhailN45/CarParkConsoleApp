class Command {
    companion object {
        const val startCommand = "/start" //start the program
        const val helpCommand = "/help" //provides command list
        const val endCommand = "/end" //stop the program
        const val parkCommand = "/park" //park a car to free slot
        const val returnCommand = "/return" //return a car to their owner
        const val parkInfoByCarCommand = "/park_info_by_car" //return car slot by car number
        const val parkInfoByPlaceCommand = "/park_info_by_place" //return car info by slot
    }
}
