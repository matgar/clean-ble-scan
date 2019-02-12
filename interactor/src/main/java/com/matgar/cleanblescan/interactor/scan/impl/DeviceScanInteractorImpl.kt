package com.matgar.cleanblescan.interactor.scan.impl

import com.matgar.cleanblescan.domain.DeviceAdvertise
import com.matgar.cleanblescan.interactor.scan.DeviceScanInteractor
import com.matgar.cleanblescan.interactor.scan.repository.DeviceAdvertiseRepository
import io.reactivex.Observable

class DeviceScanInteractorImpl(
    private val repository: DeviceAdvertiseRepository): DeviceScanInteractor {

    override fun findNearbyDevices(): Observable<DeviceAdvertise> =
            repository.getNearbyDevices()
}