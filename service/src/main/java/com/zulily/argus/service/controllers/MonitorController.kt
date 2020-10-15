package com.zulily.argus.service.controllers

import com.zulily.argus.service.repositories.MonitorRepository
import io.javalin.http.Context
import io.javalin.http.NotFoundResponse

class MonitorController(private val monitorRepository: MonitorRepository) {
    fun getMonitors(ctx: Context) {
        val monitors = monitorRepository.getAllMonitors()
        ctx.json(monitors)
    }

//    fun getMonitor(ctx: Context) {
//        val name = ctx.pathParam("name")
//        val monitor = monitorRepository.getMonitor(name)
//        if (monitor != null) {
//            ctx.json(monitor)
//        } else {
//            throw NotFoundResponse("could not find monitor ($name)")
//        }
//    }
}