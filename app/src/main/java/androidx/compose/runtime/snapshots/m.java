package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ m(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, int i) {
        this.e = i;
        this.y = lVar;
        this.z = lVar2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                this.y.invoke(obj);
                this.z.invoke(obj);
                break;
            default:
                this.y.invoke(obj);
                this.z.invoke(obj);
                break;
        }
        return kotlin.y.a;
    }
}
