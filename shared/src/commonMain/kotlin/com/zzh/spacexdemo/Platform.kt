package com.zzh.spacexdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform