package androidx.compose.ui.platform;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements androidx.compose.runtime.saveable.g {
    public final /* synthetic */ androidx.compose.runtime.saveable.h e;
    public final p1 y;

    public o1(androidx.compose.runtime.saveable.h hVar, p1 p1Var) {
        this.e = hVar;
        this.y = p1Var;
    }

    @Override // androidx.compose.runtime.saveable.g
    public final boolean a(Object obj) {
        return this.e.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.g
    public final Map b() {
        return this.e.b();
    }

    @Override // androidx.compose.runtime.saveable.g
    public final Object c(String str) {
        return this.e.c(str);
    }

    @Override // androidx.compose.runtime.saveable.g
    public final androidx.compose.runtime.saveable.f d(String str, kotlin.jvm.functions.a aVar) {
        return this.e.d(str, aVar);
    }
}
