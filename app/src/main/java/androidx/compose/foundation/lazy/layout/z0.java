package androidx.compose.foundation.lazy.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ a1 f;

    public z0(a1 a1Var, List list) {
        this.f = a1Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            androidx.compose.foundation.internal.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
