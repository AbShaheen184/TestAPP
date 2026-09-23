package com.app.mlounge.data.remote.trakt;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktDeviceCodeRequest {
    public static final int $stable = 0;

    @b("client_id")
    private final String clientId = TraktManager.CLIENT_ID;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktDeviceCodeRequest) && l.a(this.clientId, ((TraktDeviceCodeRequest) obj).clientId);
    }

    public final int hashCode() {
        return this.clientId.hashCode();
    }

    public final String toString() {
        return a.r("TraktDeviceCodeRequest(clientId=", this.clientId, ")");
    }
}
