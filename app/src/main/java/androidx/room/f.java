package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final r a;
    public final k0 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final androidx.compose.runtime.c0 e;
    public final androidx.compose.runtime.c0 f;
    public final Object g;

    public f(r rVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = rVar;
        k0 k0Var = new k0(rVar, linkedHashMap, linkedHashMap2, strArr, rVar.k, new androidx.compose.foundation.c(1, this, f.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 4));
        this.b = k0Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new androidx.compose.runtime.c0(this, 11);
        this.f = new androidx.compose.runtime.c0(this, 11);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        k0Var.k = new androidx.navigation.internal.h(this, 1);
    }
}
