package com.zulily.argus.service

import com.zulily.argus.service.controllers.MonitorController
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import org.koin.core.KoinComponent
import org.koin.core.inject

class Application: KoinComponent {
    private val monitorController by inject<MonitorController>()

    fun start() {
        Javalin.create().apply {
            exception(Exception::class.java) { e, _ -> e.printStackTrace() }
        }.routes {
            get("/monitors") { ctx ->
                monitorController.getMonitors(ctx)
            }
        }.start(7000)
    }
}