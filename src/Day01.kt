import kotlin.math.abs

fun main() {
    val input = readInput("Day01")
    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()
    var totalDistance = 0

    fun part1(){
        for(value in input) {
            val coordinates = value.split("   ")
            leftList.add(coordinates[0].toInt())
            rightList.add(coordinates[1].toInt())
        }

        leftList.sort()
        rightList.sort()

        for (value in leftList.indices) {
            totalDistance += abs(leftList[value] - rightList[value])
        }

        println("Left List: $leftList")
        println("Right List: $rightList")
        println("Total Distance: $totalDistance")
    }

    fun part2() {
        var similarityScore = 0
        for (leftValue in leftList.indices) {
            for (rightValue in rightList.indices) {
                if(leftList[leftValue] == rightList[rightValue]) {
                    similarityScore += leftList[leftValue]
                }
            }
        }
        println("Similarity Score: $similarityScore")
    }

    part1()
    part2()
}
