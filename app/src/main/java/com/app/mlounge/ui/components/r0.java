package com.app.mlounge.ui.components;

import androidx.compose.runtime.a1;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                ((a1) obj3).setValue(Boolean.FALSE);
                ((kotlin.jvm.functions.l) obj2).invoke((com.app.mlounge.ui.navigation.w) obj);
                break;
            case 1:
                Integer numB = ((HiAnimeEpisode) obj2).b();
                if (numB != null) {
                    ((Map) obj).put(Integer.valueOf(numB.intValue()), (androidx.compose.ui.focus.y) obj3);
                }
                break;
            case 2:
                ((Map) obj2).put(((com.app.mlounge.data.local.entity.c) obj).a, (androidx.compose.ui.focus.y) obj3);
                break;
            case 3:
                kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) obj3;
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) obj2;
                IptvChannel iptvChannel = (IptvChannel) obj;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var), null, null, new com.app.mlounge.ui.viewmodel.u(a0Var, iptvChannel, null, 0), 3, null);
                if (kotlin.text.r.u(iptvChannel.f(), "ntv://", false)) {
                    String strF = iptvChannel.f();
                    com.app.mlounge.ui.screens.livetv.h hVar = new com.app.mlounge.ui.screens.livetv.h(sVar);
                    strF.getClass();
                    Object obj4 = com.app.mlounge.data.remote.ntv.q.b;
                    com.app.mlounge.data.remote.ntv.e eVarI = coil3.svg.internal.a.I(strF);
                    if (eVarI != null) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var), null, null, new com.app.mlounge.ui.c0(a0Var, eVarI.a, eVarI.b, eVarI.c, eVarI.d, eVarI.e, hVar, strF, (kotlin.coroutines.d) null), 3, null);
                    }
                } else if (!kotlin.jvm.internal.l.a(iptvChannel.d(), "earthcam")) {
                    kotlin.jvm.functions.s sVar2 = (kotlin.jvm.functions.s) obj3;
                    String strF2 = iptvChannel.f();
                    String strC = iptvChannel.c();
                    String strF3 = iptvChannel.f();
                    sVar2.d(strF2, strC, null, null, kotlin.text.r.u(strF3, "ntv://", false) ? strF3 : null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var), null, null, new com.app.mlounge.ui.viewmodel.z(a0Var, iptvChannel, new com.app.mlounge.ui.screens.livetv.i(sVar, 0), null), 3, null);
                }
                break;
            case 4:
                int iIntValue = ((Number) ((a1) obj3).getValue()).intValue();
                ((kotlin.jvm.functions.p) obj2).invoke(iIntValue != 0 ? iIntValue != 1 ? "nes" : "sega-genesis" : "snes", ((Game) obj).c());
                break;
            case 5:
                ((Map) obj2).put(Integer.valueOf(((TmdbEpisode) obj).a()), (androidx.compose.ui.focus.y) obj3);
                break;
            default:
                ((Map) obj2).put(((com.app.mlounge.data.local.entity.f) obj).a, (androidx.compose.ui.focus.y) obj3);
                break;
        }
        return yVar;
    }
}
