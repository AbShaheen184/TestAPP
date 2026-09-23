package kotlin;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements kotlin.coroutines.d {
    public kotlinx.serialization.json.internal.k e;
    public kotlin.coroutines.d y;
    public Object z;

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.j getContext() {
        return kotlin.coroutines.k.e;
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        this.y = null;
        this.z = obj;
    }
}
