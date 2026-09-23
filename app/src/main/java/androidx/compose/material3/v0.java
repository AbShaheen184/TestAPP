package androidx.compose.material3;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public static final v0 y = new v0(0);
    public static final v0 z = new v0(1);
    public static final v0 A = new v0(2);
    public static final v0 B = new v0(3);
    public static final v0 C = new v0(4);
    public static final v0 D = new v0(5);
    public static final v0 E = new v0(6);
    public static final v0 F = new v0(7);

    public /* synthetic */ v0(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                }
                return yVar;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                }
                return yVar;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                }
                return yVar;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                }
                return yVar;
            case 4:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    u.a.a(null, 0.0f, 0.0f, null, 0L, sVar5, 196608);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 5:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    u.a.a(null, 0.0f, 0.0f, null, 0L, sVar6, 196608);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 6:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                }
                return yVar;
            default:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                ((Number) obj2).intValue();
                sVar8.b0(-511854661);
                u uVar = u.a;
                WeakHashMap weakHashMap = androidx.compose.foundation.layout.v1.w;
                androidx.compose.foundation.layout.v0 v0Var = new androidx.compose.foundation.layout.v0(androidx.compose.foundation.layout.t.f(sVar8).l, 48);
                sVar8.p(false);
                return v0Var;
        }
    }
}
