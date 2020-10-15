package com.zulily.argus.service.repositories

import com.zulily.argus.service.domain.Monitor

interface MonitorRepository {
    fun getAllMonitors(): Collection<Monitor>
}