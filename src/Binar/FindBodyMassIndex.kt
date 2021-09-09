package Binar

fun findBodyMassIndex(weightInKg: Double, heightInCm: Double): Double {
    if(weightInKg <= 0){
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if(heightInCm <= 0){
        throw IllegalArgumentException("Height must be greater than zero")
    }
    fun calculateBMI(weightInKg: Double, heightInCm: Double): Double {
        val heightInMeter = heightInCm/100
        return weightInKg/(heightInMeter + heightInMeter)
    }
    return calculateBMI(weightInKg, heightInCm)
}