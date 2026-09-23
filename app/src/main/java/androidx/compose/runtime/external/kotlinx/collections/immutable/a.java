package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c;
import androidx.room.t;
import java.util.List;
import kotlin.collections.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final c e;
    public final int y;
    public final int z;

    public a(c cVar, int i, int i2) {
        this.e = cVar;
        this.y = i;
        t.g(i, i2, cVar.b());
        this.z = i2 - i;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        t.d(i, this.z);
        return this.e.get(this.y + i);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i, int i2) {
        t.g(i, i2, this.z);
        int i3 = this.y;
        return new a(this.e, i + i3, i3 + i2);
    }
}
