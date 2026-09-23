package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.compose.ui.autofill.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b b;
    public r a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static r a(Context context) {
        r rVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new r(context);
                }
                rVar = bVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
