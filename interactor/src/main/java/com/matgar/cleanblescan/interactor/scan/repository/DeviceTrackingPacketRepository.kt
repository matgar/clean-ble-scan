package com.matgar.cleanblescan.interactor.scan.repository

import com.matgar.cleanblescan.domain.TrackingPacket
import io.reactivex.Observable

interface DeviceTrackingPacketRepository {
    fun add(packet:TrackingPacket)
    fun getAll(): Observable<TrackingPacket>
    fun clear()
}