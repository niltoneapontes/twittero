package br.com.bubblesolutions.twittero

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform