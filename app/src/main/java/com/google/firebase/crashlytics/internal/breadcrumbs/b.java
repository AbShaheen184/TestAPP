package com.google.firebase.crashlytics.internal.breadcrumbs;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public final void d(p pVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
