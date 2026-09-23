package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public kotlin.jvm.internal.z A;
    public kotlin.coroutines.j B;
    public kotlin.jvm.internal.z C;
    public com.google.android.material.shape.f D;
    public /* synthetic */ Object E;
    public final /* synthetic */ e F;
    public int G;
    public boolean e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.F = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.D(false, null, this);
    }
}
