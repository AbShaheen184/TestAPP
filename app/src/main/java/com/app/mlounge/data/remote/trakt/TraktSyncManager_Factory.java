package com.app.mlounge.data.remote.trakt;

import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.x;
import dagger.internal.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncManager_Factory implements e {
    private final e localRepoProvider;
    private final e tmdbRepoProvider;
    private final e traktManagerProvider;

    @Override // javax.inject.a
    public final Object get() {
        return new TraktSyncManager((TraktManager) this.traktManagerProvider.get(), (x) this.localRepoProvider.get(), (j0) this.tmdbRepoProvider.get());
    }
}
