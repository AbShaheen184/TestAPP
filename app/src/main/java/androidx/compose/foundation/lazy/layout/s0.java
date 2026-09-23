package androidx.compose.foundation.lazy.layout;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ v0 y;

    public /* synthetic */ s0(v0 v0Var, int i) {
        this.e = i;
        this.y = v0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                y yVar = (y) this.y.L.invoke();
                int iA = yVar.a();
                int i = 0;
                while (i < iA) {
                    if (yVar.b(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                v0 v0Var = this.y;
                y yVar2 = (y) v0Var.L.invoke();
                if (iIntValue < 0 || iIntValue >= yVar2.a()) {
                    StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
                    sbV.append(yVar2.a());
                    sbV.append(')');
                    androidx.compose.foundation.internal.b.a(sbV.toString());
                }
                BuildersKt__Builders_commonKt.launch$default(v0Var.A0(), null, null, new u0(v0Var, iIntValue, null, 0), 3, null);
                return Boolean.TRUE;
        }
    }
}
