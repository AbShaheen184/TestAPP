package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h, d {
    public final h a;

    public m(h hVar) {
        this.a = hVar;
    }

    @Override // kotlin.sequences.d
    public final h a(int i) {
        return i >= 5 ? e.a : new l(this.a, i, 5);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        return new a0(this);
    }

    @Override // kotlin.sequences.d
    public final h take() {
        return this;
    }
}
