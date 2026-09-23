package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class of {
    public int a;
    public final int b;
    public of c;
    public final HashMap d = new HashMap(0);

    public of(int i, int i2) {
        if (i > i2) {
            kotlinx.coroutines.future.a.r();
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return androidx.compose.runtime.j.e(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
