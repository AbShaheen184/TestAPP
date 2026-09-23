package com.app.mlounge.ui.screens.player;

import android.content.Context;
import android.graphics.Color;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.model.ChqStream;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ r0(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object value;
        androidx.localbroadcastmanager.content.b bVar;
        Object value2;
        String strK;
        String strK2;
        String strK3;
        Object value3;
        StringBuilder sbW;
        Object value4;
        Object value5;
        p0 p0Var;
        float fFloatValue;
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue;
        Boolean bool;
        switch (this.e) {
            case 0:
                com.app.mlounge.data.repository.g0 g0Var = (com.app.mlounge.data.repository.g0) obj;
                a1 a1Var = this.y;
                MutableStateFlow mutableStateFlow = a1Var.g;
                if (g0Var instanceof com.app.mlounge.data.repository.d0) {
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value4, p0.a((p0) value4, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, "Finding sources...", null, false, false, false, 0, 0L, -268435457, 7)));
                } else if (g0Var instanceof com.app.mlounge.data.repository.f0) {
                    do {
                        value3 = mutableStateFlow.getValue();
                        com.app.mlounge.data.repository.f0 f0Var = (com.app.mlounge.data.repository.f0) g0Var;
                        int i = f0Var.a;
                        int i2 = f0Var.b;
                        String str = f0Var.c;
                        sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Trying Source ", "/", i, ": ", i2);
                        sbW.append(str);
                    } while (!mutableStateFlow.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, sbW.toString(), null, false, false, false, 0, 0L, -268435457, 7)));
                } else if (g0Var instanceof com.app.mlounge.data.repository.e0) {
                    com.app.mlounge.data.repository.e0 e0Var = (com.app.mlounge.data.repository.e0) g0Var;
                    String str2 = e0Var.b;
                    ChqStream chqStream = e0Var.a;
                    okhttp3.y yVarB = o0.b(str2, chqStream.e());
                    a1Var.x = yVarB;
                    Context context = a1Var.f;
                    boolean z = kotlin.text.k.z(str2, ".m3u8", false) || ((strK3 = chqStream.k()) != null && kotlin.text.k.z(strK3, "mpegurl", true));
                    boolean z2 = (kotlin.text.k.z(str2, ".mkv", true) || ((strK2 = chqStream.k()) != null && kotlin.text.k.z(strK2, "matroska", true))) && (kotlin.text.k.z(str2, "googleusercontent.com", false) || kotlin.text.k.z(str2, "googleapis.com", false));
                    if (z2) {
                        context.getClass();
                        bVar = o0.a.d(context, yVarB);
                    } else {
                        bVar = new androidx.localbroadcastmanager.content.b(context, new androidx.localbroadcastmanager.content.b(yVarB));
                    }
                    a1Var.v = bVar;
                    kotlin.coroutines.d dVar2 = null;
                    androidx.transition.k kVar = z2 ? new androidx.transition.k(15) : null;
                    a1Var.w = kVar;
                    context.getClass();
                    boolean z3 = z;
                    androidx.media3.exoplayer.source.a aVarA = o0.a(context, str2, z3, bVar, null, chqStream.k(), kVar);
                    boolean z4 = kotlin.jvm.internal.l.a(a1Var.p, "music") && !z3 && ((strK = chqStream.k()) == null || !kotlin.text.k.z(strK, "video", true));
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, z4, 0, 0L, -1, 6)));
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new androidx.compose.foundation.text.input.internal.k(a1Var, aVarA, dVar2, 11), dVar);
                    if (objWithContext == kotlin.coroutines.intrinsics.a.e) {
                        return objWithContext;
                    }
                } else if (g0Var instanceof com.app.mlounge.data.repository.c0) {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, ((com.app.mlounge.data.repository.c0) g0Var).a, null, false, false, null, null, false, false, false, 0, 0L, -142606337, 7)));
                }
                return kotlin.y.a;
            default:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
                Long l = (Long) aVar.c(y1.G0);
                long jLongValue = l != null ? l.longValue() : 30000L;
                a1 a1Var2 = this.y;
                a1Var2.q = jLongValue;
                Long l2 = (Long) aVar.c(y1.H0);
                a1Var2.r = l2 != null ? l2.longValue() : 30000L;
                MutableStateFlow mutableStateFlow2 = a1Var2.g;
                do {
                    value5 = mutableStateFlow2.getValue();
                    p0Var = (p0) value5;
                    Float f = (Float) aVar.c(y1.J0);
                    fFloatValue = f != null ? f.floatValue() : 16.0f;
                    Integer num = (Integer) aVar.c(y1.K0);
                    iIntValue = num != null ? num.intValue() : -1;
                    Integer num2 = (Integer) aVar.c(y1.L0);
                    iIntValue2 = num2 != null ? num2.intValue() : Color.argb(128, 0, 0, 0);
                    Boolean bool2 = (Boolean) aVar.c(y1.E0);
                    zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
                    bool = (Boolean) aVar.c(y1.F0);
                } while (!mutableStateFlow2.compareAndSet(value5, p0.a(p0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, fFloatValue, iIntValue, iIntValue2, 0L, null, false, false, null, null, null, false, false, null, null, zBooleanValue, bool != null ? bool.booleanValue() : false, false, 0, a1Var2.r, 1073512447, 3)));
                return kotlin.y.a;
        }
    }
}
