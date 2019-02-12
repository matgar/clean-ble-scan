package com.matgar.cleanblescan.domain

data class DeviceAdvertise(
    val macAddress: String = "",
    val rssi: Int = 0,
    val batteryLevel: Short = 0,
    val isButtonPressed: Boolean = false)