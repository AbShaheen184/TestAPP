package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ androidx.compose.foundation.interaction.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(androidx.compose.foundation.interaction.f fVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
