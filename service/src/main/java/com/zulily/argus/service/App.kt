package com.zulily.argus.service

import org.koin.core.context.startKoin
import org.koin.core.logger.Level

fun main(args: Array<String>) {
    startKoin {
        printLogger(Level.DEBUG)
        fileProperties()
        modules(appModule)
    }
    Application().start()
}
