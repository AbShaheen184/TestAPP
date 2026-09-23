package androidx.compose.foundation.text.selection;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ t C;
    public int D;
    public CharSequence e;
    public Object y;
    public Mutex z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return t.a(this.C, null, 0L, null, this);
    }
}
