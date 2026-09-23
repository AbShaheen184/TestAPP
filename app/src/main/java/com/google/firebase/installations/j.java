package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.b0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j c;
    public final b0 a;

    public j(b0 b0Var) {
        this.a = b0Var;
    }

    public final boolean a(com.google.firebase.installations.local.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j = bVar.f + bVar.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
