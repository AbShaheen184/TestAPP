package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ o e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.e = oVar;
        this.y = str;
        this.z = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new n(this.e, this.y, this.z, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return ((n) create((kotlin.coroutines.d) obj)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        androidx.sqlite.c cVarU = this.e.b.U(this.y);
        try {
            Object objInvoke = this.z.invoke(cVarU);
            kotlin.collections.q.e(cVarU, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }
}
