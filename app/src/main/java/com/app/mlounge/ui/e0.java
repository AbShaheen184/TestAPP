package com.app.mlounge.ui;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.a1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ String E;
    public final /* synthetic */ kotlin.jvm.functions.w F;
    public final /* synthetic */ a1 G;
    public final /* synthetic */ a1 H;
    public int e;
    public final /* synthetic */ Context y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, int i, String str, String str2, int i2, int i3, String str3, kotlin.jvm.functions.w wVar, a1 a1Var, a1 a1Var2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = context;
        this.z = i;
        this.A = str;
        this.B = str2;
        this.C = i2;
        this.D = i3;
        this.E = str3;
        this.F = wVar;
        this.G = a1Var;
        this.H = a1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e0(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str = this.B;
        String str2 = this.A;
        Context context = this.y;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                com.app.mlounge.data.repository.r rVar = (com.app.mlounge.data.repository.r) ((com.app.mlounge.h) ((g0) org.jsoup.helper.n.r(dagger.hilt.android.internal.a.c(applicationContext.getApplicationContext()), g0.class))).G.get();
                int i2 = this.z;
                String strValueOf = i2 > 0 ? String.valueOf(i2) : str2;
                String str3 = kotlin.jvm.internal.l.a(str, "anime") ? str2 : null;
                int i3 = this.C;
                int i4 = this.D;
                String str4 = this.E;
                rVar.getClass();
                str.getClass();
                strValueOf.getClass();
                str4.getClass();
                Flow flowChannelFlow = FlowKt.channelFlow(new com.app.mlounge.data.repository.o(rVar, str, strValueOf, i3, i4, str3, str4, null));
                d0 d0Var = new d0(this.F, this.E, this.B, this.z, this.C, this.D, this.A, this.y, this.G, this.H);
                this.e = 1;
                if (flowChannelFlow.collect(d0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (Exception e) {
            this.H.setValue(Boolean.FALSE);
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d("CinemaHQ", "One-click resolution failed", e);
            Toast.makeText(context, "Error: " + e.getMessage(), 0).show();
        }
        return kotlin.y.a;
    }
}
