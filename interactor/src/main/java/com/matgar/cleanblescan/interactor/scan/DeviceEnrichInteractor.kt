package com.matgar.cleanblescan.interactor.scan

import com.matgar.cleanblescan.domain.DeviceAdvertise
import com.matgar.cleanblescan.domain.TrackingPacket
import io.reactivex.Observable

interface DeviceEnrichInteractor {
    fun generatedPackets(): Observable<TrackingPacket>
    fun processDevice(device: DeviceAdvertise)
}