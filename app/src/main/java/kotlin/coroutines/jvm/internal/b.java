package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements kotlin.coroutines.d {
    public static final b e = new b();

    @Override // kotlin.coroutines.d
    public final j getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
