package com.matgar.cleanblescan.interactor.scan

import com.matgar.cleanblescan.domain.DeviceAdvertise
import io.reactivex.Observable

interface DeviceScanInteractor {
    fun findNearbyDevices(): Observable<DeviceAdvertise>
}