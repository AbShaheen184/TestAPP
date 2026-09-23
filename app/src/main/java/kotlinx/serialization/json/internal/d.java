package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.core.text.f {
    public final boolean c;

    public d(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        super(lVar);
        this.c = z;
    }

    @Override // androidx.core.text.f
    public final void l(String str) {
        str.getClass();
        if (this.c) {
            super.l(str);
        } else {
            ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.b).p(str);
        }
    }
}
