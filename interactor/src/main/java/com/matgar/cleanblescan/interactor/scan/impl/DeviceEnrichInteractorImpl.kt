package com.matgar.cleanblescan.interactor.scan.impl

import com.matgar.cleanblescan.domain.DeviceAdvertise
import com.matgar.cleanblescan.domain.TrackingPacket
import com.matgar.cleanblescan.interactor.scan.DeviceEnrichInteractor
import com.matgar.cleanblescan.interactor.scan.repository.DeviceTrackingPacketRepository
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class DeviceEnrichInteractorImpl(
    private val repository: DeviceTrackingPacketRepository
): DeviceEnrichInteractor {

    companion object {
        private const val MAX_DEVICES = 10
    }

    private val advertises = mutableListOf<DeviceAdvertise>()
    private val generated = PublishSubject.create<TrackingPacket>()

    override fun generatedPackets(): Observable<TrackingPacket> = generated

    override fun processDevice(device: DeviceAdvertise) {
        advertises += device

        if (advertises.size >= MAX_DEVICES) {
            val packet = TrackingPacket(advertises)

            repository.add(packet)
            generated.onNext(packet)
            advertises.clear()
        }
    }
}