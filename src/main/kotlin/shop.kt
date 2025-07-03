
fun main() {
    println(getInventory("Technology", "Smartphone"))
}

fun technologyProducts(): List<Product> {
    val products: List<Product> = listOf(
        Product("Laptop", "Technology", 1000.0),
        Product("Smartphone", "Technology", 500.0),
        Product("Desktop", "Technology", 3000.0),
        Product("Headphones", "Technology", 150.0)
    )
    return products
}

fun foodProducts(): List<Product> {
    val products: List<Product> = listOf(
        Product("Burger", "Food", 10.0),
        Product("Pizza", "Food", 20.0),
        Product("Sandwich", "Food", 5.0)
    )
    return products
}


fun getInventory(category: String, item: String): Double{
    val inventory: MutableMap<String, List<Product>> = mutableMapOf(
        "Technology" to technologyProducts(),
        "Food" to foodProducts()
    )
    return inventory[category]?.find { it.name == item }?.price ?: 0.0
}

