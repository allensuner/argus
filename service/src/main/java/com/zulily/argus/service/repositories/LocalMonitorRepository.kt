package com.zulily.argus.service.repositories

import com.zulily.argus.service.domain.Monitor

class LocalMonitorRepository: MonitorRepository {
    private val monitors = mutableSetOf<Monitor>()
    override fun getAllMonitors() = monitors.toSet()
}