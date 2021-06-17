import CacheBuilder.cache

fun main() {
    cache.put("11", DataToCache("1", 0))
    cache.put("22", DataToCache("2", 2))
    cache.put("33", DataToCache("3", 4))
    cache.put("44", DataToCache("4", 6))
    cache.put("55", DataToCache("5", 8))





    printCacheValues()
    Thread.sleep(2000)
    printCacheValues()
    Thread.sleep(2000)
    printCacheValues()
    Thread.sleep(2000)
    printCacheValues()
    Thread.sleep(2000)
    printCacheValues()
}

private fun printCacheValues() {
    println(cache.getIfPresent("11"))
    println(cache.getIfPresent("22"))
    println(cache.getIfPresent("33"))
    println(cache.getIfPresent("44"))
    println(cache.getIfPresent("55"))
}