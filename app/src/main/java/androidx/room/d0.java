package androidx.room;

import androidx.compose.foundation.m0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public int[] e;
    public /* synthetic */ Object y;
    public final /* synthetic */ m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(m0 m0Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
