package com.matgar.cleanblescan.domain

data class TrackingPacket(
    val devices: List<DeviceAdvertise> = listOf()
)