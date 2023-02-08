object ParkingManager {

    private val parking = Parking.createParking()
    fun readParkData(): Car {
        val userData = readLine()
        val arr = userData?.split(" ")?.toTypedArray() ?: throw Exception(Messages.emptyMessage)
        if (arr.size != 5) println(Messages.invalidFormat)
        val owner = Owner(ownerName = arr[3], ownerSurname = arr[4])
        return Car(brand = arr[0], color = arr[1], id = arr[2], owner = owner)
    }

    fun readOwnerData(): Owner {
        val ownerData = readLine()
        val arr: List<String> = ownerData?.split(" ") ?: throw Exception(Messages.emptyMessage)
        return Owner(ownerName = arr[0], ownerSurname = arr[1])
    }

    fun parkCar() {
        val freeSlot = parking.filterValues { it == null }.keys.firstOrNull() ?: throw Exception(Messages.fullMessage)
        val car = readParkData()
        parking[freeSlot] = car
        println(Messages.successPark)
    }

    fun returnCar() {
        val owner = readOwnerData()
        val checkOwner =
            parking.any { it.value?.owner?.ownerName == owner.ownerName || it.value?.owner?.ownerSurname == owner.ownerSurname }
        if (!checkOwner) println(Messages.invalidOwner)
        val car = parking.filterValues { it?.owner == owner }.keys.first()
        println(Messages.successReturn + car)
        parking[car] = null
    }

    fun carInfo() {
        val carId = readLine()
        val checkCar = parking.any { it.value?.id == carId }
        val slot = parking.filterValues { it?.id == carId }.keys
        if (!checkCar) println(Messages.invalidId) else println(Messages.slotMessage + slot)
    }

    fun slotInfo() {
        val slot = readLine()
        val car = parking[slot]
        if (car != null) println(
            car.brand + " " +
                    car.color + " " +
                    car.id + " " +
                    car.owner.ownerName + " " +
                    car.owner.ownerSurname
        ) else println(
            Messages.emptySlot
        )
    }
}
