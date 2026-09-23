package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw androidx.privacysandbox.ads.adservices.java.internal.a.k(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw androidx.privacysandbox.ads.adservices.java.internal.a.k(message.obj);
    }
}
