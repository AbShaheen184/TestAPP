package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.l.a(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode() - 933324943;
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("Os(name=android, version="), Build.VERSION.RELEASE, ')');
    }
}
