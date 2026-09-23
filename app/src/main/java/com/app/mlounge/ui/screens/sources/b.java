package com.app.mlounge.ui.screens.sources;

import androidx.compose.material3.q1;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.t;
import com.app.mlounge.data.local.entity.f;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.google.android.gms.dynamite.g;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int e;

    public /* synthetic */ b(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.e) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                ChqStream chqStream = (ChqStream) obj2;
                chqStream.getClass();
                String strM = chqStream.m();
                String strG = chqStream.g();
                if (strG == null) {
                    strG = "";
                }
                String strH = chqStream.h();
                String str = strH != null ? strH : "";
                StringBuilder sb = new StringBuilder();
                sb.append(iIntValue);
                sb.append("_");
                sb.append(strM);
                sb.append("|");
                sb.append(strG);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, "|", str);
            case 1:
                s sVar = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q1.b(g.s(), "Back", null, t.d, sVar, 3120, 4);
                } else {
                    sVar.W();
                }
                return y.a;
            case 2:
                int iIntValue3 = ((Integer) obj).intValue();
                TmdbSeason tmdbSeason = (TmdbSeason) obj2;
                tmdbSeason.getClass();
                return iIntValue3 + "_" + tmdbSeason.c();
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                TmdbTvShow tmdbTvShow = (TmdbTvShow) obj2;
                tmdbTvShow.getClass();
                return iIntValue4 + "_" + tmdbTvShow.b();
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                TmdbCastMember tmdbCastMember = (TmdbCastMember) obj2;
                tmdbCastMember.getClass();
                return iIntValue5 + "_" + tmdbCastMember.b();
            case 5:
                ((Integer) obj).intValue();
                f fVar = (f) obj2;
                fVar.getClass();
                return fVar.a;
            case 6:
                String str2 = (String) obj;
                h hVar = (h) obj2;
                str2.getClass();
                hVar.getClass();
                if (str2.length() == 0) {
                    return hVar.toString();
                }
                return str2 + ", " + hVar;
            case 7:
                j jVar = (j) obj;
                h hVar2 = (h) obj2;
                jVar.getClass();
                hVar2.getClass();
                j jVarMinusKey = jVar.minusKey(hVar2.getKey());
                k kVar = k.e;
                if (jVarMinusKey == kVar) {
                    return hVar2;
                }
                e eVar = e.e;
                kotlin.coroutines.f fVar2 = (kotlin.coroutines.f) jVarMinusKey.get(eVar);
                if (fVar2 == null) {
                    cVar = new kotlin.coroutines.c(jVarMinusKey, hVar2);
                } else {
                    j jVarMinusKey2 = jVarMinusKey.minusKey(eVar);
                    if (jVarMinusKey2 == kVar) {
                        return new kotlin.coroutines.c(hVar2, fVar2);
                    }
                    cVar = new kotlin.coroutines.c(new kotlin.coroutines.c(jVarMinusKey2, hVar2), fVar2);
                }
                return cVar;
            case 8:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (h) obj2));
            case 9:
                return CoroutineContextKt.foldCopies$lambda$2((j) obj, (h) obj2);
            case 10:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 11:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            default:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (h) obj2));
        }
    }
}
