fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
                        // Indices:     0           1       2       3
                        // brands.size == 4

    brands[brands.size]

    for (i in 2 until 4) {      // 2 , 3
        println(brands[i])
    }
}