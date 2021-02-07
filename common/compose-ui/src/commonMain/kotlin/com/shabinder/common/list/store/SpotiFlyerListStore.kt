package com.shabinder.common.list.store

import com.arkivanov.mvikotlin.core.store.Store
import com.shabinder.common.PlatformQueryResult
import com.shabinder.common.TrackDetails
import com.shabinder.common.list.SpotiFlyerList
import com.shabinder.common.list.SpotiFlyerList.State
import com.shabinder.common.list.store.SpotiFlyerListStore.*

internal interface SpotiFlyerListStore: Store<Intent, State, Nothing> {
    sealed class Intent {
        data class StartDownloadAll(val trackList: List<TrackDetails>): Intent()
        data class StartDownload(val wholeTrackList:  List<TrackDetails>, val trackIndex:Int): Intent()
        data class SearchLink(val link: String): Intent()
    }
}