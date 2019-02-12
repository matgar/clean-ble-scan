package com.matgar.cleanblescan.interactor.scan.repository

import com.matgar.cleanblescan.domain.DeviceAdvertise
import io.reactivex.Observable

interface DeviceAdvertiseRepository {
    fun getNearbyDevices(): Observable<DeviceAdvertise>
}