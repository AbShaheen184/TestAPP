package androidx.datastore.preferences.core;

import kotlin.jvm.functions.p;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.datastore.core.e {
    public final androidx.datastore.core.e a;

    public c(androidx.datastore.core.e eVar) {
        this.a = eVar;
    }

    @Override // androidx.datastore.core.e
    public final Object a(p pVar, kotlin.coroutines.d dVar) {
        return this.a.a(new b(pVar, null, 0), dVar);
    }

    @Override // androidx.datastore.core.e
    public final Flow b() {
        return this.a.b();
    }
}
