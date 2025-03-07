import kotlinx.coroutines.*

class DataFetcher {
    suspend fun fetchUserData(): String {
        delay(2000)
        return "User data loaded"
    }

    suspend fun fetchOrders(): String {
        delay(3000)
        return "Orders loaded"
    }
    // 7th case
    


    

    suspend fun fetchNotifications(): String {
        delay(1500)
        return "Notifications loaded"
    }

    // ? case after точки

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
