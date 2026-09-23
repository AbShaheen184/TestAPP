package androidx.work.impl.model;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ t y;
    public final /* synthetic */ p z;

    public /* synthetic */ r(t tVar, p pVar, int i) {
        this.e = i;
        this.y = tVar;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
        switch (this.e) {
            case 0:
                aVar.getClass();
                this.y.b.v(aVar, this.z);
                break;
            default:
                aVar.getClass();
                this.y.c.D(aVar, this.z);
                break;
        }
        return y.a;
    }
}
