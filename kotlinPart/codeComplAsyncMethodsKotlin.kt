import kotlinx.coroutines.*

class DataFetcher {
    suspend fun fetchUserData(): String {
        delay(2000)
        return ""
    }
    // 14 сase

    suspend fun fetchOrders(): String {
        delay(3000)
        return "Orders loaded"
    }
    // 7th case

    suspend fun fetchProductList(): String {
        return try {
            delay(1000)
            "Product list loaded"
        } catch (e: Exception) {
            "Error loading product list: ${e.message}"
        }
    }

    // 11 case
    suspend fun fetchSettings(): String {
    }

    suspend fun fetchNotifications(): String { 
        delay(1500)
        return "Notifications loaded"
    }
    // 5th case

    suspend fun fetchAllData(): {
        val userDataDeferred = async { fetchUserData() }
        val ordersDataDeferred = async { fetchOrders() }
        val productListDeferred = async { fetchProductList() }
        val notificationsDeferred = async { fetchNotifications() }

        mapOf(
            "UserData" to userDataDeferred.await(),
            "Orders" to ordersDataDeferred.await(),
            "ProductList" to productListDeferred.await(),
            "Notifications" to notificationsDeferred.await()
        )
    }
}

fun main() = runBlocking {
    val dataFetcher = DataFetcher()
    println("Fetching data...")
    val data = dataFetcher.fetchAllData()
    data.forEach { (key, value) -> println("$key: $value") }
}
