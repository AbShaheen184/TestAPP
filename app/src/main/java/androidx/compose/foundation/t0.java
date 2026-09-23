package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.e) {
            case 0:
                androidx.compose.ui.focus.c0 c0Var = (androidx.compose.ui.focus.c0) obj;
                androidx.compose.ui.focus.c0 c0Var2 = (androidx.compose.ui.focus.c0) obj2;
                u0 u0Var = (u0) this.receiver;
                if (u0Var.K && (zA = c0Var2.a()) != c0Var.a()) {
                    kotlin.jvm.functions.l lVar = u0Var.O;
                    if (lVar != null) {
                        lVar.invoke(Boolean.valueOf(zA));
                    }
                    kotlin.coroutines.d dVar = null;
                    if (zA) {
                        BuildersKt__Builders_commonKt.launch$default(u0Var.A0(), null, null, new androidx.compose.animation.core.c1(u0Var, dVar, 3), 3, null);
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        androidx.compose.ui.node.l.r(u0Var, new androidx.activity.compose.f(4, zVar, u0Var));
                        androidx.compose.foundation.lazy.layout.h0 h0Var = (androidx.compose.foundation.lazy.layout.h0) zVar.e;
                        if (h0Var != null) {
                            h0Var.a();
                        } else {
                            h0Var = null;
                        }
                        u0Var.Q = h0Var;
                        androidx.compose.ui.node.d1 d1Var = u0Var.R;
                        if (d1Var != null && d1Var.U0().K) {
                            u0Var.Q0();
                        }
                    } else {
                        androidx.compose.foundation.lazy.layout.h0 h0Var2 = u0Var.Q;
                        if (h0Var2 != null) {
                            h0Var2.b();
                        }
                        u0Var.Q = null;
                        u0Var.Q0();
                    }
                    androidx.compose.ui.node.l.m(u0Var);
                    androidx.compose.foundation.interaction.k kVar = u0Var.N;
                    if (kVar != null) {
                        androidx.compose.foundation.interaction.d dVar2 = u0Var.P;
                        if (zA) {
                            if (dVar2 != null) {
                                u0Var.P0(kVar, new androidx.compose.foundation.interaction.e(dVar2));
                                u0Var.P = null;
                            }
                            androidx.compose.foundation.interaction.d dVar3 = new androidx.compose.foundation.interaction.d();
                            u0Var.P0(kVar, dVar3);
                            u0Var.P = dVar3;
                        } else if (dVar2 != null) {
                            u0Var.P0(kVar, new androidx.compose.foundation.interaction.e(dVar2));
                            u0Var.P = null;
                        }
                    }
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.ui.focus.c0 c0Var3 = (androidx.compose.ui.focus.c0) obj;
                androidx.compose.ui.focus.c0 c0Var4 = (androidx.compose.ui.focus.c0) obj2;
                androidx.compose.ui.viewinterop.t tVar = (androidx.compose.ui.viewinterop.t) this.receiver;
                if (tVar.K && (zA2 = c0Var4.a()) != c0Var3.a()) {
                    androidx.compose.foundation.lazy.layout.h0 h0Var3 = null;
                    if (zA2) {
                        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                        androidx.compose.ui.node.l.r(tVar, new androidx.compose.ui.draw.b(8, zVar2, tVar));
                        androidx.compose.foundation.lazy.layout.h0 h0Var4 = (androidx.compose.foundation.lazy.layout.h0) zVar2.e;
                        if (h0Var4 != null) {
                            h0Var4.a();
                            h0Var3 = h0Var4;
                        }
                        tVar.O = h0Var3;
                    } else {
                        androidx.compose.foundation.lazy.layout.h0 h0Var5 = tVar.O;
                        if (h0Var5 != null) {
                            h0Var5.b();
                        }
                        tVar.O = null;
                    }
                }
                return kotlin.y.a;
            case 2:
                return com.google.android.gms.dynamite.g.m((androidx.room.r) this.receiver, (kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2);
            case 3:
                return com.google.android.gms.dynamite.g.m((androidx.room.r) this.receiver, (kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2);
            default:
                kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) obj;
                int iIntValue = ((Number) obj2).intValue();
                eVar.getClass();
                kotlinx.serialization.json.internal.h hVar = (kotlinx.serialization.json.internal.h) this.receiver;
                hVar.getClass();
                boolean z = !eVar.j(iIntValue) && eVar.i(iIntValue).c();
                hVar.b = z;
                return Boolean.valueOf(z);
        }
    }
}
