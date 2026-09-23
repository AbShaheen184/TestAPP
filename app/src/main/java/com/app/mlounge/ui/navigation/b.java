package com.app.mlounge.ui.navigation;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w {
    public static final b g = new b("adult_detail/{videoId}", "Video", _COROUTINE.b.v(), null, 8);

    public final String a(String str) {
        str.getClass();
        return androidx.compose.runtime.j.i("adult_detail/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 1837694474;
    }

    public final String toString() {
        return "AdultDetail";
    }
}
