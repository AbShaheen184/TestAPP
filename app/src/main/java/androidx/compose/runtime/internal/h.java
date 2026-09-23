package androidx.compose.runtime.internal;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b2 {
    public final Set e;
    public final androidx.compose.runtime.collection.b y = new androidx.compose.runtime.collection.b(new c2[16]);

    public h(Set set) {
        this.e = set;
    }

    @Override // androidx.compose.runtime.b2
    public final void c() {
        androidx.compose.runtime.collection.b bVar = this.y;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            b2 b2Var = ((c2) objArr[i2]).a;
            this.e.remove(b2Var);
            b2Var.c();
        }
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
    }

    @Override // androidx.compose.runtime.b2
    public final void b() {
    }
}
