package coil3.network;

import androidx.media3.exoplayer.dash.manifest.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ n B;
    public int C;
    public Object e;
    public q y;
    public t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return n.d(this.B, null, null, null, this);
    }
}
