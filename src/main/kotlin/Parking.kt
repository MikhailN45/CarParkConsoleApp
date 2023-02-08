object Parking {
    fun createParking(): MutableMap<String, Car?> {
        val parking = mutableMapOf<String, Car?>()
        for (i in 1..20) parking["$i"] = null
        return parking
    }
}