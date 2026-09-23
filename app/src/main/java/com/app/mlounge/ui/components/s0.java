package com.app.mlounge.ui.components;

import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import com.app.mlounge.data.remote.model.TmdbSeason;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public s0(boolean z, com.app.mlounge.ui.navigation.w wVar) {
        this.e = 1;
        this.y = z;
        this.z = wVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5.b(((com.app.mlounge.ui.navigation.w) this.z).b, null, this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 262138);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) this.z;
                    boolean z = this.y;
                    q1.b(z ? wVar.d : wVar.c, null, null, z ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, sVar2, 48, 4);
                } else {
                    sVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                TmdbSeason tmdbSeason = (TmdbSeason) this.z;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strD = tmdbSeason.d();
                    if (strD == null) {
                        strD = androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbSeason.e(), "S");
                    }
                    z5.b(strD, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 262136);
                } else {
                    sVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ s0(boolean z, int i, Object obj) {
        this.e = i;
        this.z = obj;
        this.y = z;
    }
}
