package com.zzh.spacexdemo.cache

import app.cash.sqldelight.db.SqlDriver

interface DatabaseDriverFactory {
    fun createDeiver(): SqlDriver
}