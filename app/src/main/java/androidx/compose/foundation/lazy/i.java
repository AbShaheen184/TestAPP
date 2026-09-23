package androidx.compose.foundation.lazy;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.r {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.internal.f y;

    public /* synthetic */ i(androidx.compose.runtime.internal.f fVar, int i) {
        this.e = i;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                d dVar = (d) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= sVar.f(dVar) ? 4 : 2;
                }
                if (sVar.T(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
                    this.y.invoke(dVar, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= sVar2.f(jVar) ? 4 : 2;
                }
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & Token.DO) != 130)) {
                    this.y.invoke(jVar, sVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
