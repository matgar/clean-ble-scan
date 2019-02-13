package com.matgar.cleanblescan.data

import com.matgar.cleanblescan.domain.DeviceAdvertise
import com.matgar.cleanblescan.interactor.scan.repository.DeviceAdvertiseRepository
import io.reactivex.Observable

class BleDeviceAdvertiseRepository : DeviceAdvertiseRepository {

    override fun getNearbyDevices(): Observable<DeviceAdvertise> =
            Observable.just(
                DeviceAdvertise("AA", -10, 3500, false),
                DeviceAdvertise("BB", -11, 3501, true),
                DeviceAdvertise("CC", -12, 3502, false),
                DeviceAdvertise("DD", -13, 3503, true)
            )
}