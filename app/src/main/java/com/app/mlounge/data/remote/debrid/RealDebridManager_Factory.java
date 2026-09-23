package com.app.mlounge.data.remote.debrid;

import com.app.mlounge.data.local.prefs.y1;
import dagger.internal.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridManager_Factory implements e {
    private final e apiProvider;
    private final e prefsProvider;

    @Override // javax.inject.a
    public final Object get() {
        return new RealDebridManager((RealDebridApi) this.apiProvider.get(), (y1) this.prefsProvider.get());
    }
}
