package androidx.compose.runtime.tooling;

import androidx.compose.runtime.changelist.k0;
import androidx.compose.runtime.s;
import java.util.List;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k0, kotlin.coroutines.h {
    public static final com.google.firebase.heartbeatinfo.e y = new com.google.firebase.heartbeatinfo.e(1);
    public final s e;

    public d(s sVar) {
        this.e = sVar;
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ Object fold(Object obj, p pVar) {
        return kotlin.coroutines.g.f(this, obj, pVar);
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.h get(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.g(this, iVar);
    }

    @Override // kotlin.coroutines.h
    public final kotlin.coroutines.i getKey() {
        return y;
    }

    @Override // androidx.compose.runtime.changelist.k0
    public final List h(Integer num) {
        return this.e.J();
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j minusKey(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j plus(kotlin.coroutines.j jVar) {
        return kotlin.coroutines.g.o(jVar, this);
    }
}
