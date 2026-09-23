package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.unit.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ c C;
    public int D;
    public Object e;
    public k y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return c.a(this.C, null, null, this);
    }
}
