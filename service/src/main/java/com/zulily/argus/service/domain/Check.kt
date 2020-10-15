package com.zulily.argus.service.domain

abstract class Check {
    abstract fun execute()
    abstract fun shouldAlert(): Boolean
}