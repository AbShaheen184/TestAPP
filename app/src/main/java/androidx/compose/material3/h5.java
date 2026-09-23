package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.material3.internal.m y;
    public final /* synthetic */ kotlin.jvm.internal.w z;

    public /* synthetic */ h5(androidx.compose.material3.internal.m mVar, kotlin.jvm.internal.w wVar, int i) {
        this.e = i;
        this.y = mVar;
        this.z = wVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                androidx.compose.material3.internal.p pVar = this.y.a;
                pVar.j.h(fFloatValue);
                pVar.k.h(fFloatValue2);
                this.z.e = fFloatValue;
                break;
            default:
                androidx.compose.material3.internal.p pVar2 = this.y.a;
                pVar2.j.h(fFloatValue);
                pVar2.k.h(fFloatValue2);
                this.z.e = fFloatValue;
                break;
        }
        return kotlin.y.a;
    }
}
