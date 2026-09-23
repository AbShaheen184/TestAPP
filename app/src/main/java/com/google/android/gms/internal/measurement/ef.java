package com.google.android.gms.internal.measurement;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ ef(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                androidx.compose.runtime.snapshots.g gVar = ff.D;
                throw null;
            default:
                throw androidx.privacysandbox.ads.adservices.java.internal.a.k(obj);
        }
    }
}
