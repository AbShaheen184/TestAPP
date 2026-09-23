package com.appsalt.internal;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.l.a(str, str);
    }

    public final int hashCode() {
        String str = Build.VERSION.RELEASE;
        return (-933324943) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("OsData(name=android, version="), Build.VERSION.RELEASE, ')');
    }
}
