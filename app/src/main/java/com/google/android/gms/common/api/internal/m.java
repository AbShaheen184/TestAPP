package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.common.util.concurrent.k0;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.google.android.gms.common.internal.d {
    public Object B;
    public Object C;
    public Object y;
    public Object z;
    public Object A = new LinkedHashMap();
    public boolean e = true;

    public synchronized boolean a() {
        boolean zH;
        Boolean bool = (Boolean) this.B;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((com.google.firebase.g) this.y).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        b(zH);
        return zH;
    }

    public void b(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.B) == null) {
            str = "global Firebase setting";
        } else {
            str = this.e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strK = androidx.compose.runtime.j.k("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
    }

    public void c(com.google.android.gms.common.b bVar) {
        k kVar = (k) ((e) this.C).G.get((b) this.z);
        if (kVar != null) {
            kVar.q(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.d
    public void d(com.google.android.gms.common.b bVar) {
        ((e) this.C).J.post(new k0(9, this, bVar, false));
    }
}
