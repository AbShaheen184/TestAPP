package com.app.mlounge.data.remote.api;

import com.app.mlounge.data.remote.model.NtvChannelsResponse;
import kotlin.coroutines.d;
import retrofit2.http.f;
import retrofit2.http.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface ChqNtvApi {
    @f("api/ntv/channels")
    Object getChannels(@t("server") String str, d<? super NtvChannelsResponse> dVar);
}
