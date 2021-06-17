import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import com.github.benmanes.caffeine.cache.Expiry

object CacheBuilder {
    var cache: Cache<String, DataToCache> = Caffeine
        .newBuilder()
        .expireAfter(object : Expiry<String, DataToCache> {
            override fun expireAfterCreate(
                key: String?, value: DataToCache, currentTime: Long
            ): Long = value.timeLeft * 1000000000

            override fun expireAfterUpdate(
                key: String?, value: DataToCache, currentTime: Long, currentDuration: Long
            ): Long = currentDuration

            override fun expireAfterRead(
                key: String?, value: DataToCache, currentTime: Long, currentDuration: Long
            ): Long = currentDuration
        })
        .build()
}