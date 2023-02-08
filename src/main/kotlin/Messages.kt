class Messages {
    companion object {
        const val welcomeMessage = "Welcome to parking assistant! Type /start for begin work..."
        const val startMessage = "Parking assistant started! Type /help for more info..."
        const val helpMessage =
            "Hints: /start for begin work, /park for park your car, /return for take your car, /park_info_by_car for find car by registration number, /park_info_by_place for check parking slot, /park_stats for check parking congestion, /park_all_stats for see detailed park history, /end for close assistant"
        const val endMessage = "Parking assistant closed, good bye!"
        const val parkRequestInfoMessage =
            "Please enter your car brand, color, registration number and full name of the owner!"
        const val returnMessage = "Please enter car owner full name!"
        const val parkInfoByCarMessage = "Please enter car registration number!"
        const val parkInfoByPlaceMessage = "Please enter parking slot ID!"
        const val invalidCommandMessage = "Invalid input! Type /help for hints..."
        const val fullMessage = "There are no free spaces in the parking lot!"
        const val successReturn = "You can pick up your car at parking space "
        const val invalidOwner = "You did not park your car in our parking lot"
        const val invalidId = "There are no cars with this number in the parking lot"
        const val emptySlot = "This parking slot is empty!"
        const val successPark = "Car successfully parked!"
        const val slotMessageParked = "This car parked at slot "
        const val slotStatsIsEmpty = " - slot is empty"
        const val parkLogs = "Today our client parked times: "
    }
}
