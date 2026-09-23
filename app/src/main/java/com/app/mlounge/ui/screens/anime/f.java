package com.app.mlounge.ui.screens.anime;

import androidx.lifecycle.m0;
import androidx.room.coroutines.c0;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.g y;

    public /* synthetic */ f(com.app.mlounge.ui.viewmodel.g gVar, int i) {
        this.e = i;
        this.y = gVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                kotlin.k kVar = (kotlin.k) obj;
                int iIntValue = ((Number) kVar.e).intValue();
                int iIntValue2 = ((Number) kVar.y).intValue();
                com.app.mlounge.ui.viewmodel.g gVar = this.y;
                gVar.E.h(iIntValue);
                gVar.F.h(iIntValue2);
                break;
            default:
                kotlin.k kVar2 = (kotlin.k) obj;
                int iIntValue3 = ((Number) kVar2.e).intValue();
                int iIntValue4 = ((Number) kVar2.y).intValue();
                if (iIntValue4 > 0 && iIntValue3 >= iIntValue4 - 6) {
                    com.app.mlounge.ui.viewmodel.g gVar2 = this.y;
                    if (!((Boolean) gVar2.l.getValue()).booleanValue() && gVar2.H) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(gVar2), null, null, new c0(gVar2, (String) gVar2.p.getValue(), (String) gVar2.r.getValue(), (kotlin.coroutines.d) null, 19), 3, null);
                    }
                }
                break;
        }
        return y.a;
    }
}
