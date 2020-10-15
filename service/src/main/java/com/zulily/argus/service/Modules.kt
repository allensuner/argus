package com.zulily.argus.service

import com.zulily.argus.service.controllers.MonitorController
import com.zulily.argus.service.repositories.LocalMonitorRepository
import com.zulily.argus.service.repositories.MonitorRepository
import org.koin.dsl.module

val appModule = module {
    single { MonitorController(get()) }
    single { LocalMonitorRepository() as MonitorRepository }
}