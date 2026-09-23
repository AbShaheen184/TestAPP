package com.app.mlounge.ui.screens.player;

import android.content.Context;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.s4;
import androidx.compose.material3.x2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static final Object a = kotlin.collections.c0.k(new kotlin.k("en", "English"), new kotlin.k("fr", "French"), new kotlin.k("de", "German"), new kotlin.k("es", "Spanish"), new kotlin.k("it", "Italian"), new kotlin.k("pt", "Portuguese"), new kotlin.k("ru", "Russian"), new kotlin.k("ja", "Japanese"), new kotlin.k("ko", "Korean"), new kotlin.k("zh", "Chinese"), new kotlin.k("ar", "Arabic"), new kotlin.k("hi", "Hindi"), new kotlin.k("nl", "Dutch"), new kotlin.k("pl", "Polish"), new kotlin.k("sv", "Swedish"), new kotlin.k("da", "Danish"), new kotlin.k("fi", "Finnish"), new kotlin.k("no", "Norwegian"), new kotlin.k("cs", "Czech"), new kotlin.k("hu", "Hungarian"), new kotlin.k("ro", "Romanian"), new kotlin.k("vi", "Vietnamese"), new kotlin.k("th", "Thai"), new kotlin.k("tr", "Turkish"), new kotlin.k("el", "Greek"), new kotlin.k("he", "Hebrew"), new kotlin.k("id", "Indonesian"), new kotlin.k("ms", "Malay"), new kotlin.k("uk", "Ukrainian"), new kotlin.k("bg", "Bulgarian"), new kotlin.k("sr", "Serbian"), new kotlin.k("hr", "Croatian"), new kotlin.k("sk", "Slovak"), new kotlin.k("sl", "Slovenian"), new kotlin.k("lt", "Lithuanian"), new kotlin.k("lv", "Latvian"), new kotlin.k("et", "Estonian"), new kotlin.k("ca", "Catalan"), new kotlin.k("gl", "Galician"), new kotlin.k("eu", "Basque"), new kotlin.k("af", "Afrikaans"), new kotlin.k("sw", "Swahili"), new kotlin.k("tl", "Filipino"), new kotlin.k("mn", "Mongolian"), new kotlin.k("ne", "Nepali"), new kotlin.k("sq", "Albanian"), new kotlin.k("hy", "Armenian"), new kotlin.k("ka", "Georgian"), new kotlin.k("fa", "Persian"), new kotlin.k("ur", "Urdu"), new kotlin.k("am", "Amharic"), new kotlin.k("my", "Burmese"), new kotlin.k("km", "Khmer"), new kotlin.k("lo", "Lao"), new kotlin.k("si", "Sinhala"), new kotlin.k("ta", "Tamil"), new kotlin.k("te", "Telugu"), new kotlin.k("kn", "Kannada"), new kotlin.k("ml", "Malayalam"), new kotlin.k("mr", "Marathi"), new kotlin.k("gu", "Gujarati"), new kotlin.k("pa", "Punjabi"), new kotlin.k("bn", "Bengali"), new kotlin.k("bo", "Tibetan"), new kotlin.k("ps", "Pashto"), new kotlin.k("tk", "Turkmen"), new kotlin.k("uz", "Uzbek"), new kotlin.k("kk", "Kazakh"), new kotlin.k("ky", "Kyrgyz"), new kotlin.k("tg", "Tajik"), new kotlin.k("az", "Azerbaijani"), new kotlin.k("be", "Belarusian"), new kotlin.k("is", "Icelandic"), new kotlin.k("ga", "Irish"), new kotlin.k("cy", "Welsh"), new kotlin.k("mt", "Maltese"), new kotlin.k("lb", "Luxembourgish"), new kotlin.k("mk", "Macedonian"), new kotlin.k("bs", "Bosnian"), new kotlin.k("oc", "Occitan"), new kotlin.k("la", "Latin"), new kotlin.k("eo", "Esperanto"));

    public static void a(a1 a1Var, a aVar) {
        aVar.getClass();
        androidx.media3.exoplayer.c0 c0Var = a1Var.i;
        if (c0Var != null) {
            androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(((androidx.media3.common.b1) c0Var.m().a.get(aVar.b)).b, aVar.c);
            androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
            jVar.getClass();
            androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
            iVar.e(x0Var);
            c0Var.O(iVar.a());
        }
        a1Var.k("audio", false);
    }

    public static final void b(List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        sVar.c0(102932368);
        int i2 = (sVar.h(list) ? 4 : 2) | i | (sVar.h(lVar) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(-366070041, new x(aVar, list, lVar), sVar), sVar, ((i2 >> 6) & 14) | 432, 0);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new x(list, lVar, aVar, i, 1);
        }
    }

    public static final void c(final long j, final boolean z, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, final int i) {
        long jB;
        aVar.getClass();
        sVar.c0(-1045678862);
        int i2 = i | (sVar.e(j) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.runtime.a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            androidx.compose.ui.r rVarM = i1.m(androidx.compose.ui.o.b, 32);
            androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(rVarM, j, dVar);
            float f = (((Boolean) a1VarB.getValue()).booleanValue() || z) ? 3 : 1;
            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                jB = com.app.mlounge.ui.theme.b.q;
            } else {
                jB = z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.b(0.3f, androidx.compose.ui.graphics.t.d);
            }
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(androidx.compose.foundation.s.g(rVarF, f, jB, dVar), kVar, null, false, null, aVar, 28), kVar, 1), sVar, 0);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(j, z, aVar, i) { // from class: com.app.mlounge.ui.screens.player.m
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(1);
                    k0.c(this.e, this.y, this.z, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(String str, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        rVar.getClass();
        aVar.getClass();
        sVar.c0(2046887946);
        int i2 = i | (sVar.f(fVar) ? 32 : 16) | (sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (sVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(androidx.compose.foundation.s.g(rVar, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f)), kVar, null, false, null, aVar, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(555748943, new androidx.compose.foundation.contextmenu.f(22, fVar, str), sVar), sVar, 12583296, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, fVar, rVar, aVar, i);
        }
    }

    public static final void e(String str, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2 = sVar;
        aVar.getClass();
        sVar2.c0(-916936596);
        int i2 = i | (sVar2.h(aVar) ? 32 : 16);
        if (sVar2.T(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(androidx.compose.ui.o.b, 1.0f), 16);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.H, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            z5.b(str, null, androidx.compose.ui.graphics.t.d, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).g, sVar2, 1573254, 0, 131002);
            sVar2 = sVar2;
            f(t1.w(), aVar, sVar2, i2 & Token.ASSIGN_MOD);
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.f(str, aVar, i, 3);
        }
    }

    public static final void f(androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        aVar.getClass();
        sVar.c0(-1794377093);
        int i2 = (sVar.f(fVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.o.b, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a), false, null, kVar, null, androidx.compose.runtime.internal.k.c(469856153, new androidx.compose.animation.core.g0(fVar, 24), sVar), sVar, ((i2 >> 3) & 14) | 1597440, 44);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new v1(fVar, aVar, i, 12);
        }
    }

    public static final void g(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
        rVar.getClass();
        aVar.getClass();
        sVar.c0(580592521);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = sVar.Q();
            if (z || objQ == androidx.compose.runtime.n.a) {
                objQ = new x2(15, aVar);
                sVar.l0(objQ);
            }
            p5.a(androidx.compose.foundation.s.k(rVar, false, null, (kotlin.jvm.functions.a) objQ, 15), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.f, 0L, 0.0f, 6, b.a, sVar, 12779904, 88);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(rVar, aVar, i, 23);
        }
    }

    public static final void h(String str, androidx.compose.runtime.s sVar, int i) {
        String str2 = str;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.c0(-306493835);
        int i2 = i | (sVar2.f(str2) ? 4 : 2);
        if (sVar2.T(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(i1.c, androidx.compose.ui.graphics.t.b(0.8f, androidx.compose.ui.graphics.t.b), androidx.compose.ui.graphics.a0.b);
            Object objQ = sVar2.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.runtime.c0(28);
                sVar2.l0(objQ);
            }
            androidx.compose.ui.r rVarK = androidx.compose.foundation.s.k(rVarF, false, null, (kotlin.jvm.functions.a) objQ, 14);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarK);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar2, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, oVar);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
            androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
            s4.a(i1.m(oVar, 48), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 54, 60);
            androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 24));
            androidx.compose.runtime.x2 x2Var = n6.a;
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).h;
            long j = androidx.compose.ui.graphics.t.d;
            z5.b("Auto-Playing Next Episode", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 390, 0, 131066);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, 8));
            str2 = str;
            z5.b(str2, null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).k, sVar, (i2 & 14) | 384, 0, 131066);
            sVar2 = sVar;
            sVar2.p(true);
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.r(str2, i, 8);
        }
    }

    public static final void i(String str, androidx.compose.ui.graphics.vector.f fVar, boolean z, String str2, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        String str5;
        String str6;
        androidx.compose.runtime.s sVar2 = sVar;
        aVar.getClass();
        sVar2.c0(1561967658);
        if ((i & 6) == 0) {
            str3 = str;
            i3 = i | (sVar2.f(str3) ? 4 : 2);
        } else {
            str3 = str;
            i3 = i;
        }
        int i5 = i3 | (sVar2.f(fVar) ? 32 : 16) | (sVar2.g(z) ? LibretroCore.SCREEN_WIDTH : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i5 | (sVar2.f(str4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        int i7 = i4 | (sVar2.h(aVar) ? 16384 : 8192);
        if (sVar2.T(i7 & 1, (i7 & 9363) != 9362)) {
            String str7 = i6 != 0 ? null : str4;
            Object objQ = sVar2.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.runtime.a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
            float f = 2;
            long j = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            float f2 = 8;
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarE, f, j, androidx.compose.foundation.shape.e.a(f2)), z ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2)), kVar, null, false, null, aVar, 28), kVar, 1), 16);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar2, f1VarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
            float f3 = 20;
            q1.b(fVar, null, i1.m(oVar, f3), z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.b(0.6f, androidx.compose.ui.graphics.t.d), sVar2, ((i7 >> 3) & 14) | 432, 0);
            androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, 12));
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.foundation.layout.t0 t0Var = new androidx.compose.foundation.layout.t0(1.0f, true);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, t0Var);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
            androidx.compose.runtime.t.x(sVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.x(sVar2, rVarC2, eVar4);
            z5.b(str3, null, z ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.d, 0L, z ? androidx.compose.ui.text.font.k.C : androidx.compose.ui.text.font.k.z, 0L, null, 0L, 0, false, 0, 0, null, sVar, i7 & 14, 0, 262074);
            sVar2 = sVar;
            if (str7 != null) {
                sVar2.b0(-453014236);
                String str8 = str7;
                z5.b(str8, null, androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(11), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i7 >> 9) & 14) | 24960, 0, 262122);
                str6 = str8;
                sVar2 = sVar;
            } else {
                str6 = str7;
                sVar2.b0(-1158477922);
            }
            sVar2.p(false);
            sVar2.p(true);
            if (z) {
                sVar2.b0(-1968044064);
                q1.b(coil3.svg.internal.a.s(), null, i1.m(oVar, f3), com.app.mlounge.ui.theme.b.f, sVar2, 3504, 0);
            } else {
                sVar2.b0(-1967963340);
            }
            sVar2.p(false);
            sVar2.p(true);
            str5 = str6;
        } else {
            sVar2.W();
            str5 = str4;
        }
        s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.t(str, fVar, z, str5, aVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void j(final androidx.compose.ui.graphics.vector.f fVar, final String str, float f, long j, androidx.compose.ui.focus.y yVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        final float f2;
        int i4;
        long j2;
        int i5;
        int i6;
        androidx.compose.ui.focus.y yVar2;
        int i7;
        boolean z;
        final long j3;
        final androidx.compose.ui.focus.y yVar3;
        s1 s1VarT;
        final float f3;
        final long j4;
        androidx.compose.ui.focus.y yVar4;
        Object objQ;
        androidx.compose.runtime.a1 a1VarB;
        androidx.compose.ui.r rVarK;
        long j5;
        int i8;
        aVar.getClass();
        sVar.c0(-1525533955);
        if ((i & 6) == 0) {
            i3 = (sVar.f(fVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= sVar.c(f2) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    j2 = j;
                    if (sVar.e(j2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        yVar2 = yVar;
                        if (sVar.f(yVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) != 0) {
                        if (sVar.h(aVar)) {
                            i8 = 131072;
                        } else {
                            i8 = Parser.ARGC_LIMIT;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (sVar.T(i3 & 1, z)) {
                        if (i9 != 0) {
                            f3 = 44;
                        } else {
                            f3 = f2;
                        }
                        if (i4 != 0) {
                            j4 = androidx.compose.ui.graphics.t.d;
                        } else {
                            j4 = j2;
                        }
                        if (i6 != 0) {
                            yVar4 = null;
                        } else {
                            yVar4 = yVar2;
                        }
                        objQ = sVar.Q();
                        if (objQ == androidx.compose.runtime.n.a) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                        rVarK = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarM = i1.m(rVarK, f3);
                        if (yVar4 != null) {
                            rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                        }
                        androidx.compose.ui.r rVarD = rVarM.d(rVarK);
                        float f4 = 2;
                        if (((Boolean) a1VarB.getValue()).booleanValue()) {
                            j5 = com.app.mlounge.ui.theme.b.q;
                        } else {
                            j5 = androidx.compose.ui.graphics.t.h;
                        }
                        androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
                        androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD, f4, j5, dVar), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar), false, null, kVar, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                                } else {
                                    sVar2.W();
                                }
                                return kotlin.y.a;
                            }
                        }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                        yVar3 = yVar4;
                        f2 = f3;
                        j3 = j4;
                    } else {
                        sVar.W();
                        j3 = j2;
                        yVar3 = yVar2;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                                return kotlin.y.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                yVar2 = yVar;
                if ((196608 & i) != 0) {
                    if (sVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (sVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ;
                    a1VarB = _COROUTINE.a.B(kVar2, sVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarM2 = i1.m(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD2 = rVarM2.d(rVarK);
                    float f5 = 2;
                    if (((Boolean) a1VarB.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                    androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD2, f5, j5, dVar2), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar2), false, null, kVar2, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                            } else {
                                sVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    sVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            j2 = j;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    yVar2 = yVar;
                    if (sVar.f(yVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) != 0) {
                    if (sVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (sVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ;
                    a1VarB = _COROUTINE.a.B(kVar3, sVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarM3 = i1.m(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD3 = rVarM3.d(rVarK);
                    float f6 = 2;
                    if (((Boolean) a1VarB.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar3 = androidx.compose.foundation.shape.e.a;
                    androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD3, f6, j5, dVar3), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar3), false, null, kVar3, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                            } else {
                                sVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    sVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            yVar2 = yVar;
            if ((196608 & i) != 0) {
                if (sVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ;
                a1VarB = _COROUTINE.a.B(kVar4, sVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarM4 = i1.m(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD4 = rVarM4.d(rVarK);
                float f7 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar4 = androidx.compose.foundation.shape.e.a;
                androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD4, f7, j5, dVar4), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar4), false, null, kVar4, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                        } else {
                            sVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                sVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                j2 = j;
                if (sVar.e(j2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    yVar2 = yVar;
                    if (sVar.f(yVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) != 0) {
                    if (sVar.h(aVar)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (sVar.T(i3 & 1, z)) {
                    if (i9 != 0) {
                        f3 = 44;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        j4 = androidx.compose.ui.graphics.t.d;
                    } else {
                        j4 = j2;
                    }
                    if (i6 != 0) {
                        yVar4 = null;
                    } else {
                        yVar4 = yVar2;
                    }
                    objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ;
                    a1VarB = _COROUTINE.a.B(kVar5, sVar, 6);
                    rVarK = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarM5 = i1.m(rVarK, f3);
                    if (yVar4 != null) {
                        rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                    }
                    androidx.compose.ui.r rVarD5 = rVarM5.d(rVarK);
                    float f8 = 2;
                    if (((Boolean) a1VarB.getValue()).booleanValue()) {
                        j5 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j5 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.foundation.shape.d dVar5 = androidx.compose.foundation.shape.e.a;
                    androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD5, f8, j5, dVar5), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar5), false, null, kVar5, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                            } else {
                                sVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                    yVar3 = yVar4;
                    f2 = f3;
                    j3 = j4;
                } else {
                    sVar.W();
                    j3 = j2;
                    yVar3 = yVar2;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            yVar2 = yVar;
            if ((196608 & i) != 0) {
                if (sVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ;
                a1VarB = _COROUTINE.a.B(kVar6, sVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarM6 = i1.m(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD6 = rVarM6.d(rVarK);
                float f9 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar6 = androidx.compose.foundation.shape.e.a;
                androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD6, f9, j5, dVar6), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar6), false, null, kVar6, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                        } else {
                            sVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                sVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 3072;
        j2 = j;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                yVar2 = yVar;
                if (sVar.f(yVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) != 0) {
                if (sVar.h(aVar)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (sVar.T(i3 & 1, z)) {
                if (i9 != 0) {
                    f3 = 44;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    j4 = androidx.compose.ui.graphics.t.d;
                } else {
                    j4 = j2;
                }
                if (i6 != 0) {
                    yVar4 = null;
                } else {
                    yVar4 = yVar2;
                }
                objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar7 = (androidx.compose.foundation.interaction.k) objQ;
                a1VarB = _COROUTINE.a.B(kVar7, sVar, 6);
                rVarK = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarM7 = i1.m(rVarK, f3);
                if (yVar4 != null) {
                    rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
                }
                androidx.compose.ui.r rVarD7 = rVarM7.d(rVarK);
                float f10 = 2;
                if (((Boolean) a1VarB.getValue()).booleanValue()) {
                    j5 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j5 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.foundation.shape.d dVar7 = androidx.compose.foundation.shape.e.a;
                androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD7, f10, j5, dVar7), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar7), false, null, kVar7, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                        } else {
                            sVar2.W();
                        }
                        return kotlin.y.a;
                    }
                }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
                yVar3 = yVar4;
                f2 = f3;
                j3 = j4;
            } else {
                sVar.W();
                j3 = j2;
                yVar3 = yVar2;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i3 |= 24576;
        yVar2 = yVar;
        if ((196608 & i) != 0) {
            if (sVar.h(aVar)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i3 |= i8;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sVar.T(i3 & 1, z)) {
            if (i9 != 0) {
                f3 = 44;
            } else {
                f3 = f2;
            }
            if (i4 != 0) {
                j4 = androidx.compose.ui.graphics.t.d;
            } else {
                j4 = j2;
            }
            if (i6 != 0) {
                yVar4 = null;
            } else {
                yVar4 = yVar2;
            }
            objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar8 = (androidx.compose.foundation.interaction.k) objQ;
            a1VarB = _COROUTINE.a.B(kVar8, sVar, 6);
            rVarK = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarM8 = i1.m(rVarK, f3);
            if (yVar4 != null) {
                rVarK = androidx.compose.ui.focus.d.k(rVarK, yVar4);
            }
            androidx.compose.ui.r rVarD8 = rVarM8.d(rVarK);
            float f11 = 2;
            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                j5 = com.app.mlounge.ui.theme.b.q;
            } else {
                j5 = androidx.compose.ui.graphics.t.h;
            }
            androidx.compose.foundation.shape.d dVar8 = androidx.compose.foundation.shape.e.a;
            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarD8, f11, j5, dVar8), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), dVar8), false, null, kVar8, null, androidx.compose.runtime.internal.k.c(1843506715, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.a0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q1.b(fVar, str, i1.m(androidx.compose.ui.o.b, f3 * 0.6f), j4, sVar2, 0, 0);
                    } else {
                        sVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar), sVar, ((i3 >> 15) & 14) | 1597440, 44);
            yVar3 = yVar4;
            f2 = f3;
            j3 = j4;
        } else {
            sVar.W();
            j3 = j2;
            yVar3 = yVar2;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.b0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k0.j(fVar, str, f2, j3, yVar3, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1), i2);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void k(String str, final p0 p0Var, androidx.compose.ui.focus.y yVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar3, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        androidx.compose.runtime.s sVar2;
        int i3;
        StringBuilder sb;
        String str2;
        long j;
        boolean z;
        int i4;
        boolean z2;
        String str3;
        p0Var.getClass();
        boolean z3 = p0Var.a;
        yVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        lVar2.getClass();
        sVar.c0(-573310636);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(yVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.h(lVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i2 |= sVar.h(aVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= sVar.h(lVar2) ? 8388608 : 4194304;
        }
        if (sVar.T(i2 & 1, (i2 & 4793491) != 4793490)) {
            androidx.compose.foundation.layout.e0 e0Var = i1.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarE = androidx.compose.foundation.layout.t.e(i1.e(oVar, 1.0f), androidx.compose.ui.c.y);
            long j2 = androidx.compose.ui.graphics.t.b;
            androidx.compose.ui.graphics.t tVar = new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j2));
            long j3 = androidx.compose.ui.graphics.t.h;
            androidx.compose.ui.r rVarE2 = androidx.compose.foundation.s.e(rVarE, androidx.work.impl.model.f.t(kotlin.collections.q.k(tVar, new androidx.compose.ui.graphics.t(j3)), 0.0f, 0.0f, 14));
            float f = 12;
            float f2 = 40;
            float f3 = 8;
            androidx.compose.ui.r rVarT = androidx.compose.foundation.layout.b.t(rVarE2, f3, f, f3, f2);
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarT);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            androidx.compose.ui.graphics.vector.f fVarS = com.google.android.gms.dynamite.g.s();
            boolean z4 = (i2 & 7168) == 2048;
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (z4 || objQ == fVar2) {
                objQ = new x2(16, aVar);
                sVar.l0(objQ);
            }
            int i5 = i2;
            j(fVarS, "Back", 0.0f, 0L, null, (kotlin.jvm.functions.a) objQ, sVar, 48, 28);
            androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f3));
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar.j(n6.a)).h;
            long j4 = androidx.compose.ui.graphics.t.d;
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            z5.b(str, new androidx.compose.foundation.layout.t0(1.0f, true), j4, 0L, null, 0L, null, 0L, 0, false, 1, 0, m0Var, sVar, (i5 & 14) | 384, 24576, 114680);
            androidx.compose.runtime.s sVar3 = sVar;
            if (p0Var.l.size() > 1) {
                sVar3.b0(-651135582);
                androidx.compose.ui.graphics.vector.f fVarQ = _COROUTINE.b.q();
                boolean z5 = (i5 & 29360128) == 8388608;
                Object objQ2 = sVar3.Q();
                if (z5 || objQ2 == fVar2) {
                    objQ2 = new e(3, lVar2);
                    sVar3.l0(objQ2);
                }
                j(fVarQ, "Audio", 0.0f, 0L, null, (kotlin.jvm.functions.a) objQ2, sVar, 48, 28);
                sVar3 = sVar;
                androidx.compose.foundation.layout.b.e(sVar3, i1.q(oVar, 4));
                sVar3.p(false);
            } else {
                sVar3.b0(-650991432);
                sVar3.p(false);
            }
            androidx.compose.ui.graphics.vector.f fVarR = !p0Var.m.isEmpty() ? _COROUTINE.a.R() : _COROUTINE.b.x();
            long j5 = p0Var.n != null ? com.app.mlounge.ui.theme.b.f : j4;
            int i6 = i5 & 29360128;
            boolean z6 = i6 == 8388608;
            Object objQ3 = sVar3.Q();
            if (z6 || objQ3 == fVar2) {
                i3 = 4;
                objQ3 = new e(4, lVar2);
                sVar3.l0(objQ3);
            } else {
                i3 = 4;
            }
            j(fVarR, "Subtitles", 0.0f, j5, null, (kotlin.jvm.functions.a) objQ3, sVar, 48, 20);
            float f4 = i3;
            androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f4));
            androidx.compose.ui.graphics.vector.f fVarY = t1.y();
            boolean z7 = i6 == 8388608;
            Object objQ4 = sVar.Q();
            if (z7 || objQ4 == fVar2) {
                objQ4 = new e(5, lVar2);
                sVar.l0(objQ4);
            }
            j(fVarY, "Settings", 0.0f, 0L, null, (kotlin.jvm.functions.a) objQ4, sVar, 48, 28);
            sVar.p(true);
            float f5 = 16;
            androidx.compose.ui.r rVarT2 = androidx.compose.foundation.layout.b.t(androidx.compose.foundation.s.e(androidx.compose.foundation.layout.t.e(i1.e(oVar, 1.0f), androidx.compose.ui.c.E), androidx.work.impl.model.f.t(kotlin.collections.q.k(new androidx.compose.ui.graphics.t(j3), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j2))), 0.0f, 0.0f, 14)), f5, f2, f5, f5);
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL3 = sVar.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, rVarT2);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, wVarA, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.x(sVar, rVarC3, eVar4);
            m(p0Var.i, p0Var.j, p0Var.z, lVar, aVar3, sVar, (i5 >> 6) & 64512);
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(i1.e(oVar, 1.0f), f4, 0.0f, 2);
            f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.G, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL4 = sVar.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar, rVarS);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA2, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL4, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.x(sVar, rVarC4, eVar4);
            String strS = s(p0Var.i);
            long jX = coil3.svg.internal.a.x(14);
            androidx.compose.ui.text.font.k kVar = androidx.compose.ui.text.font.k.C;
            z5.b(strS, null, j4, jX, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597824, 0, 262058);
            z5.b(s(p0Var.j), null, j4, coil3.svg.internal.a.x(14), kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597824, 0, 262058);
            sVar.p(true);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar, f));
            androidx.compose.ui.r rVarE3 = i1.e(oVar, 1.0f);
            f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.d, iVar, sVar, 54);
            int iHashCode5 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL5 = sVar.l();
            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar, rVarE3);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA3, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL5, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.x(sVar, rVarC5, eVar4);
            final long j6 = p0Var.I;
            if (j6 >= 60000) {
                sb = new StringBuilder();
                sb.append(j6 / ((long) 60000));
                str2 = "m";
            } else {
                sb = new StringBuilder();
                sb.append(j6 / ((long) 1000));
                str2 = "s";
            }
            sb.append(str2);
            String string = sb.toString();
            androidx.compose.ui.graphics.vector.f fVarB = com.imsdk.a.c;
            if (fVarB != null) {
                j = j2;
                z = false;
            } else {
                androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.FastRewind", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i7 = androidx.compose.ui.graphics.vector.h0.a;
                j = j2;
                androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(j);
                androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                gVar.v(11.0f, 18.0f);
                gVar.t(11.0f, 6.0f);
                androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar, -8.5f, 6.0f, 8.5f, 6.0f);
                gVar.v(11.5f, 12.0f);
                gVar.u(8.5f, 6.0f);
                gVar.t(20.0f, 6.0f);
                gVar.u(-8.5f, 6.0f);
                gVar.l();
                z = false;
                androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var2);
                fVarB = eVar5.b();
                com.imsdk.a.c = fVarB;
            }
            androidx.compose.ui.graphics.vector.f fVar3 = fVarB;
            String strConcat = "Rewind ".concat(string);
            int i8 = i5 & 458752;
            int i9 = i5 & 3670016;
            boolean zH = (i8 == 131072 ? true : z) | sVar.h(p0Var) | sVar.e(j6) | (i9 == 1048576 ? true : z);
            Object objQ5 = sVar.Q();
            if (zH || objQ5 == fVar2) {
                final int i10 = 0;
                i4 = 16384;
                objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.u
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                lVar.invoke(Long.valueOf(p0Var.i - j6));
                                aVar3.invoke();
                                break;
                            default:
                                lVar.invoke(Long.valueOf(p0Var.i + j6));
                                aVar3.invoke();
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ5);
            } else {
                i4 = 16384;
            }
            q(fVar3, strConcat, string, 0.0f, (kotlin.jvm.functions.a) objQ5, sVar, 0);
            float f6 = 36;
            androidx.compose.foundation.layout.b.e(sVar, i1.q(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05bc: INVOKE 
                  (r64v0 'sVar' androidx.compose.runtime.s)
                  (wrap androidx.compose.ui.r:0x05b8: INVOKE (r1v2 ?? I:??[OBJECT, ARRAY]), (r1v7 'f6' float) STATIC call: androidx.compose.foundation.layout.i1.q(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:1465))
                 STATIC call: androidx.compose.foundation.layout.b.e(androidx.compose.runtime.s, androidx.compose.ui.r):void A[MD:(androidx.compose.runtime.s, androidx.compose.ui.r):void (m)] (LINE:1469) in method: com.app.mlounge.ui.screens.player.k0.k(java.lang.String, com.app.mlounge.ui.screens.player.p0, androidx.compose.ui.focus.y, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.s, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1807
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.player.k0.k(java.lang.String, com.app.mlounge.ui.screens.player.p0, androidx.compose.ui.focus.y, kotlin.jvm.functions.a, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.a, kotlin.jvm.functions.l, androidx.compose.runtime.s, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:106:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:109:0x0204  */
        /* JADX WARN: Code duplicated, block: B:110:0x0207  */
        /* JADX WARN: Code duplicated, block: B:113:0x0215  */
        /* JADX WARN: Code duplicated, block: B:114:0x0218  */
        /* JADX WARN: Code duplicated, block: B:117:0x0226  */
        /* JADX WARN: Code duplicated, block: B:118:0x0229  */
        /* JADX WARN: Code duplicated, block: B:121:0x0237  */
        /* JADX WARN: Code duplicated, block: B:122:0x023a  */
        /* JADX WARN: Code duplicated, block: B:125:0x0244  */
        /* JADX WARN: Code duplicated, block: B:126:0x0247  */
        /* JADX WARN: Code duplicated, block: B:132:0x0260  */
        /* JADX WARN: Code duplicated, block: B:135:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:136:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:142:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:148:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:151:0x02fb  */
        /* JADX WARN: Code duplicated, block: B:152:0x02fd  */
        /* JADX WARN: Code duplicated, block: B:156:0x0306  */
        /* JADX WARN: Code duplicated, block: B:159:0x0320  */
        /* JADX WARN: Code duplicated, block: B:162:0x033a  */
        /* JADX WARN: Code duplicated, block: B:164:0x034d  */
        /* JADX WARN: Code duplicated, block: B:167:0x0361  */
        /* JADX WARN: Code duplicated, block: B:170:0x037b  */
        /* JADX WARN: Code duplicated, block: B:174:0x0392  */
        /* JADX WARN: Code duplicated, block: B:176:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:179:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:182:0x03e3  */
        /* JADX WARN: Code duplicated, block: B:186:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:190:0x041d  */
        /* JADX WARN: Code duplicated, block: B:194:0x0435  */
        /* JADX WARN: Code duplicated, block: B:196:0x044f  */
        /* JADX WARN: Code duplicated, block: B:199:0x0464  */
        /* JADX WARN: Code duplicated, block: B:202:0x0496  */
        /* JADX WARN: Code duplicated, block: B:206:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:210:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:214:0x04de  */
        /* JADX WARN: Code duplicated, block: B:218:0x04f5  */
        /* JADX WARN: Code duplicated, block: B:220:0x0512  */
        /* JADX WARN: Code duplicated, block: B:223:0x052b  */
        /* JADX WARN: Code duplicated, block: B:226:0x053d  */
        /* JADX WARN: Code duplicated, block: B:230:0x0554  */
        /* JADX WARN: Code duplicated, block: B:234:0x056b  */
        /* JADX WARN: Code duplicated, block: B:236:0x057e  */
        /* JADX WARN: Code duplicated, block: B:240:0x05a7  */
        /* JADX WARN: Code duplicated, block: B:244:0x05cc  */
        /* JADX WARN: Code duplicated, block: B:247:0x05ff  */
        /* JADX WARN: Code duplicated, block: B:248:0x0603  */
        /* JADX WARN: Code duplicated, block: B:251:0x0627  */
        /* JADX WARN: Code duplicated, block: B:252:0x063b  */
        /* JADX WARN: Code duplicated, block: B:255:0x064f  */
        /* JADX WARN: Code duplicated, block: B:259:0x0668  */
        /* JADX WARN: Code duplicated, block: B:263:0x0697  */
        /* JADX WARN: Code duplicated, block: B:264:0x06be  */
        /* JADX WARN: Code duplicated, block: B:267:0x06d4  */
        /* JADX WARN: Code duplicated, block: B:268:0x0714  */
        /* JADX WARN: Code duplicated, block: B:271:0x0738  */
        /* JADX WARN: Code duplicated, block: B:273:0x0757  */
        /* JADX WARN: Code duplicated, block: B:274:0x075b  */
        /* JADX WARN: Code duplicated, block: B:277:0x077a  */
        /* JADX WARN: Code duplicated, block: B:278:0x077d  */
        /* JADX WARN: Code duplicated, block: B:282:0x0794  */
        /* JADX WARN: Code duplicated, block: B:286:0x07ac  */
        /* JADX WARN: Code duplicated, block: B:290:0x07c4  */
        /* JADX WARN: Code duplicated, block: B:294:0x07dc  */
        /* JADX WARN: Code duplicated, block: B:297:0x07ff  */
        /* JADX WARN: Code duplicated, block: B:299:0x080d  */
        /* JADX WARN: Code duplicated, block: B:301:0x0862  */
        /* JADX WARN: Code duplicated, block: B:336:0x090c  */
        /* JADX WARN: Code duplicated, block: B:339:0x0921  */
        /* JADX WARN: Code duplicated, block: B:341:0x0931  */
        /* JADX WARN: Code duplicated, block: B:344:0x093c  */
        /* JADX WARN: Code duplicated, block: B:78:0x0133  */
        /* JADX WARN: Code duplicated, block: B:81:0x014b  */
        /* JADX WARN: Code duplicated, block: B:82:0x014e  */
        /* JADX WARN: Code duplicated, block: B:88:0x0171  */
        /* JADX WARN: Code duplicated, block: B:91:0x0193  */
        /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:98:0x01c8  */
        public static final void l(final String str, final String str2, final Map map, final String str3, final String str4, final int i, final int i2, final int i3, final String str5, final String str6, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.r rVar, a1 a1Var, androidx.compose.runtime.s sVar, final int i4) {
            androidx.compose.runtime.s sVar2;
            final a1 a1Var2;
            int i5;
            a1 a1Var3;
            boolean z;
            boolean z2;
            Object objQ;
            boolean z3;
            androidx.compose.runtime.f fVar;
            androidx.activity.compose.t tVarH;
            int i6;
            boolean z4;
            boolean zH;
            Object objQ2;
            kotlin.coroutines.d dVar;
            Context context;
            boolean z5;
            String str7;
            Object objQ3;
            androidx.compose.ui.focus.y yVar;
            Object objQ4;
            androidx.compose.ui.focus.y yVar2;
            boolean zH2;
            Object objQ5;
            androidx.activity.compose.t tVarH2;
            boolean z6;
            boolean z7;
            int i7;
            boolean z8;
            a1 a1Var4;
            int i8;
            boolean z9;
            int i9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            Object objQ6;
            int i10;
            final a1 a1Var5;
            String str8;
            int i11;
            boolean z14;
            boolean z15;
            Object u0Var;
            Context context2;
            kotlin.jvm.functions.a aVar2;
            boolean zF;
            Object objQ7;
            androidx.compose.runtime.a1 a1Var6;
            boolean z16;
            Object objQ8;
            androidx.compose.runtime.s sVar3;
            androidx.compose.foundation.layout.e0 e0Var;
            long j;
            boolean zH3;
            Object objQ9;
            final androidx.compose.runtime.a1 a1Var7;
            boolean zF2;
            Object objQ10;
            androidx.compose.ui.j jVar;
            androidx.compose.ui.node.f fVar2;
            androidx.compose.ui.node.e eVar;
            androidx.compose.ui.node.e eVar2;
            androidx.compose.ui.node.e eVar3;
            androidx.compose.ui.node.d dVar2;
            androidx.compose.ui.node.e eVar4;
            androidx.media3.exoplayer.c0 c0Var;
            boolean zH4;
            Object objQ11;
            boolean zF3;
            Object objQ12;
            androidx.compose.runtime.s sVar4;
            androidx.compose.ui.node.e eVar5;
            androidx.compose.ui.node.d dVar3;
            boolean z17;
            androidx.compose.ui.o oVar;
            androidx.compose.ui.o oVar2;
            long j2;
            boolean z18;
            androidx.compose.foundation.layout.e0 e0Var2;
            androidx.compose.ui.node.e eVar6;
            androidx.compose.ui.node.e eVar7;
            androidx.compose.runtime.f fVar3;
            final a1 a1Var8;
            androidx.compose.ui.o oVar3;
            final a1 a1Var9;
            String str9;
            String str10;
            String str11;
            boolean zH5;
            Object objQ13;
            boolean zH6;
            Object objQ14;
            boolean zH7;
            Object objQ15;
            boolean zH8;
            Object objQ16;
            String str12;
            boolean z19;
            boolean zH9;
            Object objQ17;
            boolean zH10;
            Object objQ18;
            boolean zH11;
            Object objQ19;
            boolean zH12;
            Object objQ20;
            boolean zH13;
            Object objQ21;
            boolean zH14;
            Object objQ22;
            boolean zH15;
            Object objQ23;
            boolean zH16;
            Object objQ24;
            boolean zH17;
            Object objQ25;
            boolean zH18;
            Object objQ26;
            boolean zH19;
            Object objQ27;
            boolean zH20;
            Object objQ28;
            boolean zH21;
            Object objQ29;
            boolean zH22;
            Object objQ30;
            boolean zH23;
            Object objQ31;
            aVar.getClass();
            sVar.c0(-1537570315);
            int i12 = i4 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.h(map) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.f(str3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.d(i) ? 131072 : Parser.ARGC_LIMIT) | (sVar.d(i2) ? 1048576 : 524288) | (sVar.d(i3) ? 8388608 : 4194304) | (sVar.f(str5) ? 67108864 : 33554432) | (sVar.f(str6) ? 536870912 : 268435456);
            int i13 = (sVar.h(aVar) ? 4 : 2) | (sVar.h(rVar) ? 32 : 16) | 128;
            if (sVar.T(i12 & 1, ((306775187 & i12) == 306775186 && (i13 & Token.EXPR_VOID) == 146) ? false : true)) {
                sVar.Y();
                if ((i4 & 1) == 0 || sVar.C()) {
                    androidx.lifecycle.y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                    if (y0VarA == null) {
                        kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    } else {
                        i5 = i13 & (-897);
                        a1Var3 = (a1) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(a1.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                    }
                } else {
                    sVar.W();
                    i5 = i13 & (-897);
                    a1Var3 = a1Var;
                }
                int i14 = i5;
                sVar.q();
                Context context3 = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
                androidx.compose.runtime.a1 a1VarG = androidx.compose.runtime.t.g(a1Var3.h, sVar);
                if (i != 0) {
                    z = true;
                    if (!kotlin.text.k.z(str, "/live/", true)) {
                        z2 = false;
                    }
                    androidx.activity.result.contract.b bVar = new androidx.activity.result.contract.b(3);
                    objQ = sVar.Q();
                    z3 = z2;
                    fVar = androidx.compose.runtime.n.a;
                    if (objQ == fVar) {
                        objQ = new com.app.mlounge.ui.t(19);
                        sVar.l0(objQ);
                    }
                    tVarH = _COROUTINE.b.H(bVar, (kotlin.jvm.functions.l) objQ, sVar, 48);
                    i6 = i12 & 7168;
                    if (i6 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zH = z4 | sVar.h(context3) | sVar.h(tVarH);
                    objQ2 = sVar.Q();
                    dVar = null;
                    if (!zH || objQ2 == fVar) {
                        context = context3;
                        z5 = true;
                        str7 = str3;
                        androidx.compose.foundation.text.u0 u0Var2 = new androidx.compose.foundation.text.u0(str7, context, tVarH, dVar, 5);
                        sVar.l0(u0Var2);
                        objQ2 = u0Var2;
                    } else {
                        context = context3;
                        z5 = true;
                        str7 = str3;
                    }
                    androidx.compose.runtime.l0.c(sVar, str7, (kotlin.jvm.functions.p) objQ2);
                    objQ3 = sVar.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new androidx.compose.ui.focus.y();
                        sVar.l0(objQ3);
                    }
                    yVar = (androidx.compose.ui.focus.y) objQ3;
                    objQ4 = sVar.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new androidx.compose.ui.focus.y();
                        sVar.l0(objQ4);
                    }
                    yVar2 = (androidx.compose.ui.focus.y) objQ4;
                    androidx.activity.result.contract.b bVar2 = new androidx.activity.result.contract.b(0);
                    zH2 = sVar.h(context) | sVar.h(a1Var3);
                    objQ5 = sVar.Q();
                    if (zH2 || objQ5 == fVar) {
                        objQ5 = new androidx.compose.material3.internal.r0(29, context, a1Var3);
                        sVar.l0(objQ5);
                    }
                    tVarH2 = _COROUTINE.b.H(bVar2, (kotlin.jvm.functions.l) objQ5, sVar, 0);
                    boolean zH24 = sVar.h(a1Var3);
                    if ((i12 & 14) == 4) {
                        z6 = z5;
                    } else {
                        z6 = false;
                    }
                    boolean z20 = zH24 | z6;
                    if ((234881024 & i12) == 67108864) {
                        z7 = z5;
                    } else {
                        z7 = false;
                    }
                    boolean zG = z20 | z7 | sVar.g(z3);
                    i7 = 458752 & i12;
                    if (i7 == 131072) {
                        z8 = z5;
                    } else {
                        z8 = false;
                    }
                    boolean z21 = zG | z8;
                    a1Var4 = a1Var3;
                    i8 = i12 & 3670016;
                    if (i8 == 1048576) {
                        z9 = z5;
                    } else {
                        z9 = false;
                    }
                    boolean z22 = z21 | z9;
                    i9 = i12 & 29360128;
                    if (i9 == 8388608) {
                        z10 = z5;
                    } else {
                        z10 = false;
                    }
                    boolean zH25 = z22 | z10 | sVar.h(map);
                    if (i6 == 2048) {
                        z11 = z5;
                    } else {
                        z11 = false;
                    }
                    boolean z23 = z11 | zH25;
                    if ((i12 & 1879048192) == 536870912) {
                        z12 = z5;
                    } else {
                        z12 = false;
                    }
                    z13 = z23 | z12;
                    objQ6 = sVar.Q();
                    if (!z13 || objQ6 == fVar) {
                        i10 = i9;
                        f0 f0Var = new f0(a1Var4, str, str5, z3, i, i2, i3, map, str7, str6, null);
                        a1Var5 = a1Var4;
                        str8 = str;
                        sVar.l0(f0Var);
                        objQ6 = f0Var;
                    } else {
                        str8 = str;
                        i10 = i9;
                        a1Var5 = a1Var4;
                    }
                    androidx.compose.runtime.l0.c(sVar, str8, (kotlin.jvm.functions.p) objQ6);
                    String str13 = ((p0) a1VarG.getValue()).x;
                    boolean zF4 = sVar.f(a1VarG) | sVar.h(context);
                    i11 = i14 & 14;
                    if (i11 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zF4 | z14;
                    Object objQ32 = sVar.Q();
                    if (!z15 || objQ32 == fVar) {
                        context2 = context;
                        u0Var = new androidx.compose.foundation.text.u0(a1VarG, context2, aVar, dVar, 6);
                        aVar2 = aVar;
                        sVar.l0(u0Var);
                    } else {
                        u0Var = objQ32;
                        context2 = context;
                        aVar2 = aVar;
                    }
                    androidx.compose.runtime.l0.c(sVar, str13, (kotlin.jvm.functions.p) u0Var);
                    Boolean boolValueOf = Boolean.valueOf(((p0) a1VarG.getValue()).c);
                    zF = sVar.f(a1VarG);
                    objQ7 = sVar.Q();
                    if (!zF || objQ7 == fVar) {
                        a1Var6 = a1VarG;
                        objQ7 = new androidx.compose.foundation.text.u0(yVar, yVar2, a1Var6, dVar, 7);
                        sVar.l0(objQ7);
                    } else {
                        a1Var6 = a1VarG;
                    }
                    androidx.compose.runtime.l0.c(sVar, boolValueOf, (kotlin.jvm.functions.p) objQ7);
                    if (i11 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ8 = sVar.Q();
                    if (z16 || objQ8 == fVar) {
                        objQ8 = new x2(14, aVar2);
                        sVar.l0(objQ8);
                    }
                    android.support.v4.media.session.b.a(false, (kotlin.jvm.functions.a) objQ8, sVar, 0);
                    if (((p0) a1Var6.getValue()).d) {
                        sVar.b0(71663729);
                        long j3 = ((p0) a1Var6.getValue()).k;
                        zH23 = sVar.h(a1Var5);
                        objQ31 = sVar.Q();
                        if (zH23 || objQ31 == fVar) {
                            objQ31 = new n(a1Var5, 6);
                            sVar.l0(objQ31);
                        }
                        o(j3, (kotlin.jvm.functions.l) objQ31, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.b0(71813645);
                        sVar.p(false);
                    }
                    if (((p0) a1Var6.getValue()).e) {
                        sVar.b0(71873630);
                        List list = ((p0) a1Var6.getValue()).l;
                        zH21 = sVar.h(a1Var5);
                        objQ29 = sVar.Q();
                        if (zH21 || objQ29 == fVar) {
                            objQ29 = new n(a1Var5, 7);
                            sVar.l0(objQ29);
                        }
                        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ29;
                        zH22 = sVar.h(a1Var5);
                        objQ30 = sVar.Q();
                        if (zH22 || objQ30 == fVar) {
                            final int i15 = 6;
                            objQ30 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i15) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j4 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j4);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar.l0(objQ30);
                        }
                        b(list, lVar, (kotlin.jvm.functions.a) objQ30, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.b0(72503085);
                        sVar.p(false);
                    }
                    if (((p0) a1Var6.getValue()).f) {
                        sVar.b0(72568123);
                        List list2 = ((p0) a1Var6.getValue()).m;
                        boolean z24 = ((p0) a1Var6.getValue()).o;
                        c1 c1Var = ((p0) a1Var6.getValue()).n;
                        zH17 = sVar.h(a1Var5);
                        objQ25 = sVar.Q();
                        if (zH17 || objQ25 == fVar) {
                            objQ25 = new n(a1Var5, 8);
                            sVar.l0(objQ25);
                        }
                        kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ25;
                        zH18 = sVar.h(a1Var5);
                        objQ26 = sVar.Q();
                        if (zH18 || objQ26 == fVar) {
                            final int i16 = 7;
                            objQ26 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i16) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j4 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j4);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar.l0(objQ26);
                        }
                        kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) objQ26;
                        zH19 = sVar.h(a1Var5) | sVar.h(tVarH2) | sVar.h(context2);
                        objQ27 = sVar.Q();
                        if (zH19 || objQ27 == fVar) {
                            objQ27 = new androidx.compose.foundation.gestures.g(19, a1Var5, tVarH2, context2);
                            sVar.l0(objQ27);
                        }
                        kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ27;
                        zH20 = sVar.h(a1Var5);
                        objQ28 = sVar.Q();
                        if (zH20 || objQ28 == fVar) {
                            final int i17 = 8;
                            objQ28 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i17) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j4 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j4);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar.l0(objQ28);
                        }
                        r(list2, z24, c1Var, lVar2, aVar3, aVar4, (kotlin.jvm.functions.a) objQ28, sVar, 0);
                        sVar3 = sVar;
                        sVar3.p(false);
                    } else {
                        sVar3 = sVar;
                        sVar3.b0(73415725);
                        sVar3.p(false);
                    }
                    if (((p0) a1Var6.getValue()).g) {
                        sVar3.b0(73472827);
                        float f = ((p0) a1Var6.getValue()).p;
                        int i18 = ((p0) a1Var6.getValue()).q;
                        int i19 = ((p0) a1Var6.getValue()).r;
                        long j4 = ((p0) a1Var6.getValue()).s;
                        zH12 = sVar3.h(a1Var5);
                        objQ20 = sVar3.Q();
                        if (zH12 || objQ20 == fVar) {
                            objQ20 = new n(a1Var5, 0);
                            sVar3.l0(objQ20);
                        }
                        kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ20;
                        zH13 = sVar3.h(a1Var5);
                        objQ21 = sVar3.Q();
                        if (zH13 || objQ21 == fVar) {
                            objQ21 = new n(a1Var5, 1);
                            sVar3.l0(objQ21);
                        }
                        kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ21;
                        zH14 = sVar3.h(a1Var5);
                        objQ22 = sVar3.Q();
                        if (zH14 || objQ22 == fVar) {
                            objQ22 = new n(a1Var5, 2);
                            sVar3.l0(objQ22);
                        }
                        kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ22;
                        zH15 = sVar3.h(a1Var5);
                        objQ23 = sVar3.Q();
                        if (zH15 || objQ23 == fVar) {
                            objQ23 = new n(a1Var5, 3);
                            sVar3.l0(objQ23);
                        }
                        kotlin.jvm.functions.l lVar6 = (kotlin.jvm.functions.l) objQ23;
                        zH16 = sVar3.h(a1Var5);
                        objQ24 = sVar3.Q();
                        if (zH16 || objQ24 == fVar) {
                            final int i20 = 0;
                            objQ24 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i20) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar3.l0(objQ24);
                        }
                        androidx.compose.runtime.s sVar5 = sVar3;
                        n(f, i18, i19, j4, lVar3, lVar4, lVar5, lVar6, (kotlin.jvm.functions.a) objQ24, sVar5, 0);
                        sVar3 = sVar5;
                        sVar3.p(false);
                    } else {
                        sVar3.b0(74074413);
                        sVar3.p(false);
                    }
                    if (((p0) a1Var6.getValue()).A) {
                        sVar3.b0(74117658);
                        zH9 = sVar3.h(a1Var5);
                        objQ17 = sVar3.Q();
                        if (zH9 || objQ17 == fVar) {
                            final int i21 = 1;
                            objQ17 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i21) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar3.l0(objQ17);
                        }
                        kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) objQ17;
                        zH10 = sVar3.h(a1Var5);
                        objQ18 = sVar3.Q();
                        if (zH10 || objQ18 == fVar) {
                            final int i22 = 2;
                            objQ18 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i22) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar3.l0(objQ18);
                        }
                        kotlin.jvm.functions.a aVar6 = (kotlin.jvm.functions.a) objQ18;
                        zH11 = sVar3.h(a1Var5);
                        objQ19 = sVar3.Q();
                        if (zH11 || objQ19 == fVar) {
                            final int i23 = 3;
                            objQ19 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i23) {
                                        case 0:
                                            a1Var5.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var5;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var5;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var5.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var5.h();
                                            break;
                                        case 6:
                                            a1Var5.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var5;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var5.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar3.l0(objQ19);
                        }
                        p(aVar5, aVar6, (kotlin.jvm.functions.a) objQ19, sVar3, 0);
                        sVar3.p(false);
                    } else {
                        sVar3.b0(74351181);
                        sVar3.p(false);
                    }
                    e0Var = i1.c;
                    j = androidx.compose.ui.graphics.t.b;
                    androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.ui.focus.d.k(androidx.compose.foundation.s.f(e0Var, j, androidx.compose.ui.graphics.a0.b), yVar2), 0, 3);
                    zH3 = sVar3.h(a1Var5);
                    objQ9 = sVar3.Q();
                    if (zH3 || objQ9 == fVar) {
                        objQ9 = new androidx.compose.foundation.m(a1Var5, 8);
                        sVar3.l0(objQ9);
                    }
                    androidx.compose.ui.r rVarA = androidx.compose.ui.input.pointer.h0.a(rVarN, kotlin.y.a, (PointerInputEventHandler) objQ9);
                    a1Var7 = a1Var6;
                    zF2 = sVar3.f(a1Var7) | sVar3.h(a1Var5);
                    objQ10 = sVar3.Q();
                    if (zF2 || objQ10 == fVar) {
                        objQ10 = new androidx.compose.foundation.text.c0(20, a1Var5, a1Var7);
                        sVar3.l0(objQ10);
                    }
                    androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarA, (kotlin.jvm.functions.l) objQ10);
                    jVar = androidx.compose.ui.c.e;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar, false);
                    int iHashCode = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL = sVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarE);
                    androidx.compose.ui.node.h.b.getClass();
                    fVar2 = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar2);
                    } else {
                        sVar3.o0();
                    }
                    eVar = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar3, q0VarD, eVar);
                    eVar2 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar3, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    eVar3 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
                    dVar2 = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar3, dVar2);
                    eVar4 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar3, rVarC, eVar4);
                    c0Var = a1Var5.i;
                    if (c0Var == null) {
                        sVar3.b0(1843081991);
                        sVar3.p(false);
                        sVar4 = sVar3;
                        dVar3 = dVar2;
                        eVar5 = eVar4;
                    } else {
                        sVar3.b0(1843081992);
                        zH4 = sVar3.h(c0Var);
                        objQ11 = sVar3.Q();
                        if (zH4 || objQ11 == fVar) {
                            objQ11 = new s2(c0Var, 17);
                            sVar3.l0(objQ11);
                        }
                        kotlin.jvm.functions.l lVar7 = (kotlin.jvm.functions.l) objQ11;
                        zF3 = sVar3.f(a1Var7);
                        objQ12 = sVar3.Q();
                        if (zF3 || objQ12 == fVar) {
                            objQ12 = new m2(a1Var7, 11);
                            sVar3.l0(objQ12);
                        }
                        sVar4 = sVar3;
                        eVar5 = eVar4;
                        dVar3 = dVar2;
                        e0Var = e0Var;
                        androidx.compose.ui.viewinterop.j.b(lVar7, e0Var, (kotlin.jvm.functions.l) objQ12, sVar4, 48, 0);
                        sVar4.p(false);
                    }
                    if (str3.equals("music")) {
                        sVar4.b0(1844072411);
                        androidx.compose.runtime.s sVar6 = sVar4;
                        com.app.mlounge.ui.components.b0.d(((p0) a1Var7.getValue()).H, e0Var, 0, ((p0) a1Var7.getValue()).a, sVar6, 48);
                        sVar4 = sVar6;
                        sVar4.p(false);
                    } else {
                        sVar4.b0(1844259155);
                        sVar4.p(false);
                    }
                    z17 = ((p0) a1Var7.getValue()).b;
                    oVar = androidx.compose.ui.o.b;
                    if (z17) {
                        sVar4.b0(1844310584);
                        eVar6 = eVar;
                        e0Var2 = e0Var;
                        oVar2 = oVar;
                        j2 = j;
                        sVar2 = sVar;
                        eVar7 = eVar2;
                        s4.a(androidx.compose.foundation.layout.t.e(oVar, androidx.compose.ui.c.B), androidx.compose.ui.graphics.t.d, 0.0f, 0L, 0, 0.0f, sVar2, 48, 60);
                        z18 = false;
                        sVar2.p(false);
                    } else {
                        oVar2 = oVar;
                        j2 = j;
                        z18 = false;
                        e0Var2 = e0Var;
                        sVar2 = sVar4;
                        eVar6 = eVar;
                        eVar7 = eVar2;
                        sVar2.b0(1844407955);
                        sVar2.p(false);
                    }
                    if (((p0) a1Var7.getValue()).c) {
                        sVar2.b0(1844477798);
                        androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar, z18);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, e0Var2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.o0();
                        }
                        androidx.compose.runtime.t.x(sVar2, q0VarD2, eVar6);
                        androidx.compose.runtime.t.x(sVar2, jVarL2, eVar7);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar3);
                        androidx.compose.runtime.t.x(sVar2, rVarC2, eVar5);
                        str10 = ((p0) a1Var7.getValue()).D;
                        if (str10 == null) {
                            str11 = str2;
                        } else {
                            str11 = str10;
                        }
                        p0 p0Var = (p0) a1Var7.getValue();
                        a1Var8 = a1Var5;
                        zH5 = sVar2.h(a1Var8);
                        objQ13 = sVar2.Q();
                        fVar3 = fVar;
                        if (zH5 || objQ13 == fVar3) {
                            final int i24 = 4;
                            objQ13 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i24) {
                                        case 0:
                                            a1Var8.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var8;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var8;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var8.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var8.h();
                                            break;
                                        case 6:
                                            a1Var8.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var8;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var8.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar2.l0(objQ13);
                        }
                        kotlin.jvm.functions.a aVar7 = (kotlin.jvm.functions.a) objQ13;
                        zH6 = sVar2.h(a1Var8);
                        objQ14 = sVar2.Q();
                        if (zH6 || objQ14 == fVar3) {
                            objQ14 = new n(a1Var8, 4);
                            sVar2.l0(objQ14);
                        }
                        kotlin.jvm.functions.l lVar8 = (kotlin.jvm.functions.l) objQ14;
                        zH7 = sVar2.h(a1Var8);
                        objQ15 = sVar2.Q();
                        if (zH7 || objQ15 == fVar3) {
                            final int i25 = 5;
                            objQ15 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    Object value;
                                    Object value2;
                                    Object value3;
                                    switch (i25) {
                                        case 0:
                                            a1Var8.k("settings", false);
                                            break;
                                        case 1:
                                            a1 a1Var10 = a1Var8;
                                            MutableStateFlow mutableStateFlow = a1Var10.g;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                            androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                            if (c0Var2 != null) {
                                                c0Var2.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 2:
                                            a1 a1Var11 = a1Var8;
                                            MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                            do {
                                                value2 = mutableStateFlow2.getValue();
                                            } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                            androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                            if (c0Var3 != null) {
                                                c0Var3.G(0L);
                                            }
                                            return kotlin.y.a;
                                        case 3:
                                            a1Var8.k("recovery", false);
                                            break;
                                        case 4:
                                            androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                            if (c0Var4 != null) {
                                                if (c0Var4.w()) {
                                                    c0Var4.M(false);
                                                } else {
                                                    c0Var4.M(true);
                                                }
                                            }
                                            return kotlin.y.a;
                                        case 5:
                                            a1Var8.h();
                                            break;
                                        case 6:
                                            a1Var8.k("audio", false);
                                            break;
                                        case 7:
                                            a1 a1Var12 = a1Var8;
                                            MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                            androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                            long j5 = c0Var5 != null ? c0Var5.j() : 0L;
                                            do {
                                                value3 = mutableStateFlow3.getValue();
                                            } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                            androidx.localbroadcastmanager.content.b bVar3 = a1Var12.v;
                                            if (bVar3 != null) {
                                                Context context4 = a1Var12.f;
                                                context4.getClass();
                                                androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar3, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                                androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                                if (c0Var6 != null) {
                                                    c0Var6.K(aVarA);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                                if (c0Var7 != null) {
                                                    c0Var7.C();
                                                }
                                                androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                                if (c0Var8 != null) {
                                                    c0Var8.G(j5);
                                                }
                                                androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                                if (c0Var9 != null) {
                                                    c0Var9.M(true);
                                                }
                                            }
                                            a1Var12.k("subtitle", false);
                                            break;
                                        default:
                                            a1Var8.k("subtitle", false);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            sVar2.l0(objQ15);
                        }
                        kotlin.jvm.functions.a aVar8 = (kotlin.jvm.functions.a) objQ15;
                        zH8 = sVar2.h(a1Var8);
                        objQ16 = sVar2.Q();
                        if (zH8 || objQ16 == fVar3) {
                            objQ16 = new n(a1Var8, 5);
                            sVar2.l0(objQ16);
                        }
                        k(str11, p0Var, yVar, aVar, aVar7, lVar8, aVar8, (kotlin.jvm.functions.l) objQ16, sVar2, ((i14 << 9) & 7168) | 384);
                        str12 = ((p0) a1Var7.getValue()).y;
                        if (str12 == null) {
                            sVar2.b0(-1391056200);
                            z19 = false;
                            sVar2.p(false);
                            oVar3 = oVar2;
                        } else {
                            sVar2.b0(-1391056199);
                            oVar3 = oVar2;
                            p5.a(androidx.compose.foundation.layout.b.u(androidx.compose.foundation.layout.t.e(oVar3, androidx.compose.ui.c.y), 0.0f, 80, 0.0f, 0.0f, 13), androidx.compose.foundation.shape.e.a(8), androidx.compose.ui.graphics.t.b(0.6f, j2), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2046199055, new com.app.mlounge.ui.components.r(str12, 7), sVar2), sVar, 12583296, 120);
                            sVar2 = sVar;
                            z19 = false;
                            sVar2.p(false);
                        }
                        sVar2.p(true);
                        sVar2.p(z19);
                    } else {
                        fVar3 = fVar;
                        a1Var8 = a1Var5;
                        oVar3 = oVar2;
                        sVar2.b0(1845535859);
                        sVar2.p(z18);
                    }
                    if (((p0) a1Var7.getValue()).h || rVar == null) {
                        a1Var9 = a1Var8;
                        sVar2.b0(1846165779);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1845617048);
                        float f2 = 16;
                        androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(androidx.compose.foundation.layout.t.e(oVar3, androidx.compose.ui.c.F), 0.0f, 0.0f, f2, ((p0) a1Var7.getValue()).c ? 180 : f2, 3);
                        boolean zF5 = sVar2.f(a1Var7) | sVar2.h(a1Var8) | (i7 == 131072) | (i8 == 1048576) | (i10 == 8388608) | ((i12 & Token.ASSIGN_MOD) == 32) | ((i14 & Token.ASSIGN_MOD) == 32);
                        Object objQ33 = sVar2.Q();
                        if (zF5 || objQ33 == fVar3) {
                            a1Var9 = a1Var8;
                            kotlin.jvm.functions.a aVar9 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.q
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    boolean z25 = ((p0) a1Var7.getValue()).E;
                                    a1 a1Var10 = a1Var9;
                                    int i26 = i;
                                    int i27 = i2;
                                    int i28 = i3;
                                    String str14 = str2;
                                    if (z25) {
                                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var10), null, null, new s0(str14, i28 + 1, a1Var10, i27, i26, null), 3, null);
                                    } else {
                                        a1Var10.g();
                                        rVar.invoke(Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28 + 1), str14);
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            a1Var7 = a1Var7;
                            sVar2.l0(aVar9);
                            objQ33 = aVar9;
                        } else {
                            a1Var7 = a1Var7;
                            a1Var9 = a1Var8;
                        }
                        g(rVarU, (kotlin.jvm.functions.a) objQ33, sVar2, 0);
                        sVar2.p(false);
                    }
                    if (((p0) a1Var7.getValue()).B) {
                        sVar2.b0(1846209892);
                        str9 = ((p0) a1Var7.getValue()).C;
                        if (str9 == null) {
                            str9 = "Loading next episode...";
                        }
                        h(str9, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1846316563);
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                    a1Var2 = a1Var9;
                } else {
                    z = true;
                }
                z2 = z;
                androidx.activity.result.contract.b bVar3 = new androidx.activity.result.contract.b(3);
                objQ = sVar.Q();
                z3 = z2;
                fVar = androidx.compose.runtime.n.a;
                if (objQ == fVar) {
                    objQ = new com.app.mlounge.ui.t(19);
                    sVar.l0(objQ);
                }
                tVarH = _COROUTINE.b.H(bVar3, (kotlin.jvm.functions.l) objQ, sVar, 48);
                i6 = i12 & 7168;
                if (i6 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zH = z4 | sVar.h(context3) | sVar.h(tVarH);
                objQ2 = sVar.Q();
                dVar = null;
                if (zH) {
                    context = context3;
                    z5 = true;
                    str7 = str3;
                    androidx.compose.foundation.text.u0 u0Var3 = new androidx.compose.foundation.text.u0(str7, context, tVarH, dVar, 5);
                    sVar.l0(u0Var3);
                    objQ2 = u0Var3;
                } else {
                    context = context3;
                    z5 = true;
                    str7 = str3;
                    androidx.compose.foundation.text.u0 u0Var4 = new androidx.compose.foundation.text.u0(str7, context, tVarH, dVar, 5);
                    sVar.l0(u0Var4);
                    objQ2 = u0Var4;
                }
                androidx.compose.runtime.l0.c(sVar, str7, (kotlin.jvm.functions.p) objQ2);
                objQ3 = sVar.Q();
                if (objQ3 == fVar) {
                    objQ3 = new androidx.compose.ui.focus.y();
                    sVar.l0(objQ3);
                }
                yVar = (androidx.compose.ui.focus.y) objQ3;
                objQ4 = sVar.Q();
                if (objQ4 == fVar) {
                    objQ4 = new androidx.compose.ui.focus.y();
                    sVar.l0(objQ4);
                }
                yVar2 = (androidx.compose.ui.focus.y) objQ4;
                androidx.activity.result.contract.b bVar4 = new androidx.activity.result.contract.b(0);
                zH2 = sVar.h(context) | sVar.h(a1Var3);
                objQ5 = sVar.Q();
                if (zH2) {
                    objQ5 = new androidx.compose.material3.internal.r0(29, context, a1Var3);
                    sVar.l0(objQ5);
                } else {
                    objQ5 = new androidx.compose.material3.internal.r0(29, context, a1Var3);
                    sVar.l0(objQ5);
                }
                tVarH2 = _COROUTINE.b.H(bVar4, (kotlin.jvm.functions.l) objQ5, sVar, 0);
                boolean zH26 = sVar.h(a1Var3);
                if ((i12 & 14) == 4) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
                boolean z25 = zH26 | z6;
                if ((234881024 & i12) == 67108864) {
                    z7 = z5;
                } else {
                    z7 = false;
                }
                boolean zG2 = z25 | z7 | sVar.g(z3);
                i7 = 458752 & i12;
                if (i7 == 131072) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                boolean z26 = zG2 | z8;
                a1Var4 = a1Var3;
                i8 = i12 & 3670016;
                if (i8 == 1048576) {
                    z9 = z5;
                } else {
                    z9 = false;
                }
                boolean z27 = z26 | z9;
                i9 = i12 & 29360128;
                if (i9 == 8388608) {
                    z10 = z5;
                } else {
                    z10 = false;
                }
                boolean zH27 = z27 | z10 | sVar.h(map);
                if (i6 == 2048) {
                    z11 = z5;
                } else {
                    z11 = false;
                }
                boolean z28 = z11 | zH27;
                if ((i12 & 1879048192) == 536870912) {
                    z12 = z5;
                } else {
                    z12 = false;
                }
                z13 = z28 | z12;
                objQ6 = sVar.Q();
                if (z13) {
                    i10 = i9;
                    f0 f0Var2 = new f0(a1Var4, str, str5, z3, i, i2, i3, map, str7, str6, null);
                    a1Var5 = a1Var4;
                    str8 = str;
                    sVar.l0(f0Var2);
                    objQ6 = f0Var2;
                } else {
                    i10 = i9;
                    f0 f0Var3 = new f0(a1Var4, str, str5, z3, i, i2, i3, map, str7, str6, null);
                    a1Var5 = a1Var4;
                    str8 = str;
                    sVar.l0(f0Var3);
                    objQ6 = f0Var3;
                }
                androidx.compose.runtime.l0.c(sVar, str8, (kotlin.jvm.functions.p) objQ6);
                String str14 = ((p0) a1VarG.getValue()).x;
                boolean zF6 = sVar.f(a1VarG) | sVar.h(context);
                i11 = i14 & 14;
                if (i11 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zF6 | z14;
                Object objQ34 = sVar.Q();
                if (z15) {
                    context2 = context;
                    u0Var = new androidx.compose.foundation.text.u0(a1VarG, context2, aVar, dVar, 6);
                    aVar2 = aVar;
                    sVar.l0(u0Var);
                } else {
                    context2 = context;
                    u0Var = new androidx.compose.foundation.text.u0(a1VarG, context2, aVar, dVar, 6);
                    aVar2 = aVar;
                    sVar.l0(u0Var);
                }
                androidx.compose.runtime.l0.c(sVar, str14, (kotlin.jvm.functions.p) u0Var);
                Boolean boolValueOf2 = Boolean.valueOf(((p0) a1VarG.getValue()).c);
                zF = sVar.f(a1VarG);
                objQ7 = sVar.Q();
                if (zF) {
                    a1Var6 = a1VarG;
                    objQ7 = new androidx.compose.foundation.text.u0(yVar, yVar2, a1Var6, dVar, 7);
                    sVar.l0(objQ7);
                } else {
                    a1Var6 = a1VarG;
                    objQ7 = new androidx.compose.foundation.text.u0(yVar, yVar2, a1Var6, dVar, 7);
                    sVar.l0(objQ7);
                }
                androidx.compose.runtime.l0.c(sVar, boolValueOf2, (kotlin.jvm.functions.p) objQ7);
                if (i11 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ8 = sVar.Q();
                if (z16) {
                    objQ8 = new x2(14, aVar2);
                    sVar.l0(objQ8);
                } else {
                    objQ8 = new x2(14, aVar2);
                    sVar.l0(objQ8);
                }
                android.support.v4.media.session.b.a(false, (kotlin.jvm.functions.a) objQ8, sVar, 0);
                if (((p0) a1Var6.getValue()).d) {
                    sVar.b0(71663729);
                    long j5 = ((p0) a1Var6.getValue()).k;
                    zH23 = sVar.h(a1Var5);
                    objQ31 = sVar.Q();
                    if (zH23) {
                        objQ31 = new n(a1Var5, 6);
                        sVar.l0(objQ31);
                    } else {
                        objQ31 = new n(a1Var5, 6);
                        sVar.l0(objQ31);
                    }
                    o(j5, (kotlin.jvm.functions.l) objQ31, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.b0(71813645);
                    sVar.p(false);
                }
                if (((p0) a1Var6.getValue()).e) {
                    sVar.b0(71873630);
                    List list3 = ((p0) a1Var6.getValue()).l;
                    zH21 = sVar.h(a1Var5);
                    objQ29 = sVar.Q();
                    if (zH21) {
                        objQ29 = new n(a1Var5, 7);
                        sVar.l0(objQ29);
                    } else {
                        objQ29 = new n(a1Var5, 7);
                        sVar.l0(objQ29);
                    }
                    kotlin.jvm.functions.l lVar9 = (kotlin.jvm.functions.l) objQ29;
                    zH22 = sVar.h(a1Var5);
                    objQ30 = sVar.Q();
                    if (zH22) {
                        final int i110 = 6;
                        objQ30 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i110) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ30);
                    } else {
                        final int i111 = 6;
                        objQ30 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i111) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ30);
                    }
                    b(list3, lVar9, (kotlin.jvm.functions.a) objQ30, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.b0(72503085);
                    sVar.p(false);
                }
                if (((p0) a1Var6.getValue()).f) {
                    sVar.b0(72568123);
                    List list4 = ((p0) a1Var6.getValue()).m;
                    boolean z29 = ((p0) a1Var6.getValue()).o;
                    c1 c1Var2 = ((p0) a1Var6.getValue()).n;
                    zH17 = sVar.h(a1Var5);
                    objQ25 = sVar.Q();
                    if (zH17) {
                        objQ25 = new n(a1Var5, 8);
                        sVar.l0(objQ25);
                    } else {
                        objQ25 = new n(a1Var5, 8);
                        sVar.l0(objQ25);
                    }
                    kotlin.jvm.functions.l lVar10 = (kotlin.jvm.functions.l) objQ25;
                    zH18 = sVar.h(a1Var5);
                    objQ26 = sVar.Q();
                    if (zH18) {
                        final int i112 = 7;
                        objQ26 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i112) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ26);
                    } else {
                        final int i113 = 7;
                        objQ26 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i113) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ26);
                    }
                    kotlin.jvm.functions.a aVar10 = (kotlin.jvm.functions.a) objQ26;
                    zH19 = sVar.h(a1Var5) | sVar.h(tVarH2) | sVar.h(context2);
                    objQ27 = sVar.Q();
                    if (zH19) {
                        objQ27 = new androidx.compose.foundation.gestures.g(19, a1Var5, tVarH2, context2);
                        sVar.l0(objQ27);
                    } else {
                        objQ27 = new androidx.compose.foundation.gestures.g(19, a1Var5, tVarH2, context2);
                        sVar.l0(objQ27);
                    }
                    kotlin.jvm.functions.a aVar11 = (kotlin.jvm.functions.a) objQ27;
                    zH20 = sVar.h(a1Var5);
                    objQ28 = sVar.Q();
                    if (zH20) {
                        final int i114 = 8;
                        objQ28 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i114) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ28);
                    } else {
                        final int i115 = 8;
                        objQ28 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i115) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j6 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j6);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(objQ28);
                    }
                    r(list4, z29, c1Var2, lVar10, aVar10, aVar11, (kotlin.jvm.functions.a) objQ28, sVar, 0);
                    sVar3 = sVar;
                    sVar3.p(false);
                } else {
                    sVar3 = sVar;
                    sVar3.b0(73415725);
                    sVar3.p(false);
                }
                if (((p0) a1Var6.getValue()).g) {
                    sVar3.b0(73472827);
                    float f3 = ((p0) a1Var6.getValue()).p;
                    int i116 = ((p0) a1Var6.getValue()).q;
                    int i117 = ((p0) a1Var6.getValue()).r;
                    long j6 = ((p0) a1Var6.getValue()).s;
                    zH12 = sVar3.h(a1Var5);
                    objQ20 = sVar3.Q();
                    if (zH12) {
                        objQ20 = new n(a1Var5, 0);
                        sVar3.l0(objQ20);
                    } else {
                        objQ20 = new n(a1Var5, 0);
                        sVar3.l0(objQ20);
                    }
                    kotlin.jvm.functions.l lVar11 = (kotlin.jvm.functions.l) objQ20;
                    zH13 = sVar3.h(a1Var5);
                    objQ21 = sVar3.Q();
                    if (zH13) {
                        objQ21 = new n(a1Var5, 1);
                        sVar3.l0(objQ21);
                    } else {
                        objQ21 = new n(a1Var5, 1);
                        sVar3.l0(objQ21);
                    }
                    kotlin.jvm.functions.l lVar12 = (kotlin.jvm.functions.l) objQ21;
                    zH14 = sVar3.h(a1Var5);
                    objQ22 = sVar3.Q();
                    if (zH14) {
                        objQ22 = new n(a1Var5, 2);
                        sVar3.l0(objQ22);
                    } else {
                        objQ22 = new n(a1Var5, 2);
                        sVar3.l0(objQ22);
                    }
                    kotlin.jvm.functions.l lVar13 = (kotlin.jvm.functions.l) objQ22;
                    zH15 = sVar3.h(a1Var5);
                    objQ23 = sVar3.Q();
                    if (zH15) {
                        objQ23 = new n(a1Var5, 3);
                        sVar3.l0(objQ23);
                    } else {
                        objQ23 = new n(a1Var5, 3);
                        sVar3.l0(objQ23);
                    }
                    kotlin.jvm.functions.l lVar14 = (kotlin.jvm.functions.l) objQ23;
                    zH16 = sVar3.h(a1Var5);
                    objQ24 = sVar3.Q();
                    if (zH16) {
                        final int i26 = 0;
                        objQ24 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i26) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ24);
                    } else {
                        final int i27 = 0;
                        objQ24 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i27) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ24);
                    }
                    androidx.compose.runtime.s sVar7 = sVar3;
                    n(f3, i116, i117, j6, lVar11, lVar12, lVar13, lVar14, (kotlin.jvm.functions.a) objQ24, sVar7, 0);
                    sVar3 = sVar7;
                    sVar3.p(false);
                } else {
                    sVar3.b0(74074413);
                    sVar3.p(false);
                }
                if (((p0) a1Var6.getValue()).A) {
                    sVar3.b0(74117658);
                    zH9 = sVar3.h(a1Var5);
                    objQ17 = sVar3.Q();
                    if (zH9) {
                        final int i28 = 1;
                        objQ17 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i28) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ17);
                    } else {
                        final int i29 = 1;
                        objQ17 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i29) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ17);
                    }
                    kotlin.jvm.functions.a aVar12 = (kotlin.jvm.functions.a) objQ17;
                    zH10 = sVar3.h(a1Var5);
                    objQ18 = sVar3.Q();
                    if (zH10) {
                        final int i210 = 2;
                        objQ18 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i210) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ18);
                    } else {
                        final int i211 = 2;
                        objQ18 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i211) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ18);
                    }
                    kotlin.jvm.functions.a aVar13 = (kotlin.jvm.functions.a) objQ18;
                    zH11 = sVar3.h(a1Var5);
                    objQ19 = sVar3.Q();
                    if (zH11) {
                        final int i212 = 3;
                        objQ19 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i212) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ19);
                    } else {
                        final int i213 = 3;
                        objQ19 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i213) {
                                    case 0:
                                        a1Var5.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var5;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var5;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var5.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var5.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var5.h();
                                        break;
                                    case 6:
                                        a1Var5.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var5;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var5.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar3.l0(objQ19);
                    }
                    p(aVar12, aVar13, (kotlin.jvm.functions.a) objQ19, sVar3, 0);
                    sVar3.p(false);
                } else {
                    sVar3.b0(74351181);
                    sVar3.p(false);
                }
                e0Var = i1.c;
                j = androidx.compose.ui.graphics.t.b;
                androidx.compose.ui.r rVarN2 = androidx.compose.foundation.s.n(androidx.compose.ui.focus.d.k(androidx.compose.foundation.s.f(e0Var, j, androidx.compose.ui.graphics.a0.b), yVar2), 0, 3);
                zH3 = sVar3.h(a1Var5);
                objQ9 = sVar3.Q();
                if (zH3) {
                    objQ9 = new androidx.compose.foundation.m(a1Var5, 8);
                    sVar3.l0(objQ9);
                } else {
                    objQ9 = new androidx.compose.foundation.m(a1Var5, 8);
                    sVar3.l0(objQ9);
                }
                androidx.compose.ui.r rVarA2 = androidx.compose.ui.input.pointer.h0.a(rVarN2, kotlin.y.a, (PointerInputEventHandler) objQ9);
                a1Var7 = a1Var6;
                zF2 = sVar3.f(a1Var7) | sVar3.h(a1Var5);
                objQ10 = sVar3.Q();
                if (zF2) {
                    objQ10 = new androidx.compose.foundation.text.c0(20, a1Var5, a1Var7);
                    sVar3.l0(objQ10);
                } else {
                    objQ10 = new androidx.compose.foundation.text.c0(20, a1Var5, a1Var7);
                    sVar3.l0(objQ10);
                }
                androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarA2, (kotlin.jvm.functions.l) objQ10);
                jVar = androidx.compose.ui.c.e;
                androidx.compose.ui.layout.q0 q0VarD3 = androidx.compose.foundation.layout.p.d(jVar, false);
                int iHashCode3 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar3, rVarE2);
                androidx.compose.ui.node.h.b.getClass();
                fVar2 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
                } else {
                    sVar3.o0();
                }
                eVar = androidx.compose.ui.node.g.f;
                androidx.compose.runtime.t.x(sVar3, q0VarD3, eVar);
                eVar2 = androidx.compose.ui.node.g.e;
                androidx.compose.runtime.t.x(sVar3, jVarL3, eVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                eVar3 = androidx.compose.ui.node.g.g;
                androidx.compose.runtime.t.p(sVar3, numValueOf2, eVar3);
                dVar2 = androidx.compose.ui.node.g.h;
                androidx.compose.runtime.t.t(sVar3, dVar2);
                eVar4 = androidx.compose.ui.node.g.d;
                androidx.compose.runtime.t.x(sVar3, rVarC3, eVar4);
                c0Var = a1Var5.i;
                if (c0Var == null) {
                    sVar3.b0(1843081991);
                    sVar3.p(false);
                    sVar4 = sVar3;
                    dVar3 = dVar2;
                    eVar5 = eVar4;
                } else {
                    sVar3.b0(1843081992);
                    zH4 = sVar3.h(c0Var);
                    objQ11 = sVar3.Q();
                    if (zH4) {
                        objQ11 = new s2(c0Var, 17);
                        sVar3.l0(objQ11);
                    } else {
                        objQ11 = new s2(c0Var, 17);
                        sVar3.l0(objQ11);
                    }
                    kotlin.jvm.functions.l lVar15 = (kotlin.jvm.functions.l) objQ11;
                    zF3 = sVar3.f(a1Var7);
                    objQ12 = sVar3.Q();
                    if (zF3) {
                        objQ12 = new m2(a1Var7, 11);
                        sVar3.l0(objQ12);
                    } else {
                        objQ12 = new m2(a1Var7, 11);
                        sVar3.l0(objQ12);
                    }
                    sVar4 = sVar3;
                    eVar5 = eVar4;
                    dVar3 = dVar2;
                    e0Var = e0Var;
                    androidx.compose.ui.viewinterop.j.b(lVar15, e0Var, (kotlin.jvm.functions.l) objQ12, sVar4, 48, 0);
                    sVar4.p(false);
                }
                if (str3.equals("music")) {
                    sVar4.b0(1844072411);
                    androidx.compose.runtime.s sVar8 = sVar4;
                    com.app.mlounge.ui.components.b0.d(((p0) a1Var7.getValue()).H, e0Var, 0, ((p0) a1Var7.getValue()).a, sVar8, 48);
                    sVar4 = sVar8;
                    sVar4.p(false);
                } else {
                    sVar4.b0(1844259155);
                    sVar4.p(false);
                }
                z17 = ((p0) a1Var7.getValue()).b;
                oVar = androidx.compose.ui.o.b;
                if (z17) {
                    sVar4.b0(1844310584);
                    eVar6 = eVar;
                    e0Var2 = e0Var;
                    oVar2 = oVar;
                    j2 = j;
                    sVar2 = sVar;
                    eVar7 = eVar2;
                    s4.a(androidx.compose.foundation.layout.t.e(oVar, androidx.compose.ui.c.B), androidx.compose.ui.graphics.t.d, 0.0f, 0L, 0, 0.0f, sVar2, 48, 60);
                    z18 = false;
                    sVar2.p(false);
                } else {
                    oVar2 = oVar;
                    j2 = j;
                    z18 = false;
                    e0Var2 = e0Var;
                    sVar2 = sVar4;
                    eVar6 = eVar;
                    eVar7 = eVar2;
                    sVar2.b0(1844407955);
                    sVar2.p(false);
                }
                if (((p0) a1Var7.getValue()).c) {
                    sVar2.b0(1844477798);
                    androidx.compose.ui.layout.q0 q0VarD4 = androidx.compose.foundation.layout.p.d(jVar, z18);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar2.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar2, e0Var2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, q0VarD4, eVar6);
                    androidx.compose.runtime.t.x(sVar2, jVarL4, eVar7);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar3, sVar2, dVar3);
                    androidx.compose.runtime.t.x(sVar2, rVarC4, eVar5);
                    str10 = ((p0) a1Var7.getValue()).D;
                    if (str10 == null) {
                        str11 = str2;
                    } else {
                        str11 = str10;
                    }
                    p0 p0Var2 = (p0) a1Var7.getValue();
                    a1Var8 = a1Var5;
                    zH5 = sVar2.h(a1Var8);
                    objQ13 = sVar2.Q();
                    fVar3 = fVar;
                    if (zH5) {
                        final int i214 = 4;
                        objQ13 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i214) {
                                    case 0:
                                        a1Var8.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var8;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var8;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var8.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var8.h();
                                        break;
                                    case 6:
                                        a1Var8.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var8;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var8.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar2.l0(objQ13);
                    } else {
                        final int i215 = 4;
                        objQ13 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i215) {
                                    case 0:
                                        a1Var8.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var8;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var8;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var8.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var8.h();
                                        break;
                                    case 6:
                                        a1Var8.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var8;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var8.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar2.l0(objQ13);
                    }
                    kotlin.jvm.functions.a aVar14 = (kotlin.jvm.functions.a) objQ13;
                    zH6 = sVar2.h(a1Var8);
                    objQ14 = sVar2.Q();
                    if (zH6) {
                        objQ14 = new n(a1Var8, 4);
                        sVar2.l0(objQ14);
                    } else {
                        objQ14 = new n(a1Var8, 4);
                        sVar2.l0(objQ14);
                    }
                    kotlin.jvm.functions.l lVar16 = (kotlin.jvm.functions.l) objQ14;
                    zH7 = sVar2.h(a1Var8);
                    objQ15 = sVar2.Q();
                    if (zH7) {
                        final int i216 = 5;
                        objQ15 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i216) {
                                    case 0:
                                        a1Var8.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var8;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var8;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var8.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var8.h();
                                        break;
                                    case 6:
                                        a1Var8.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var8;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var8.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar2.l0(objQ15);
                    } else {
                        final int i217 = 5;
                        objQ15 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.o
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                switch (i217) {
                                    case 0:
                                        a1Var8.k("settings", false);
                                        break;
                                    case 1:
                                        a1 a1Var10 = a1Var8;
                                        MutableStateFlow mutableStateFlow = a1Var10.g;
                                        do {
                                            value = mutableStateFlow.getValue();
                                        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
                                        androidx.media3.exoplayer.c0 c0Var2 = a1Var10.i;
                                        if (c0Var2 != null) {
                                            c0Var2.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 2:
                                        a1 a1Var11 = a1Var8;
                                        MutableStateFlow mutableStateFlow2 = a1Var11.g;
                                        do {
                                            value2 = mutableStateFlow2.getValue();
                                        } while (!mutableStateFlow2.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, "Seeking disabled due to slow response.", false, false, null, null, false, false, false, 0, 0L, -117440513, 7)));
                                        androidx.media3.exoplayer.c0 c0Var3 = a1Var11.i;
                                        if (c0Var3 != null) {
                                            c0Var3.G(0L);
                                        }
                                        return kotlin.y.a;
                                    case 3:
                                        a1Var8.k("recovery", false);
                                        break;
                                    case 4:
                                        androidx.media3.exoplayer.c0 c0Var4 = a1Var8.i;
                                        if (c0Var4 != null) {
                                            if (c0Var4.w()) {
                                                c0Var4.M(false);
                                            } else {
                                                c0Var4.M(true);
                                            }
                                        }
                                        return kotlin.y.a;
                                    case 5:
                                        a1Var8.h();
                                        break;
                                    case 6:
                                        a1Var8.k("audio", false);
                                        break;
                                    case 7:
                                        a1 a1Var12 = a1Var8;
                                        MutableStateFlow mutableStateFlow3 = a1Var12.g;
                                        androidx.media3.exoplayer.c0 c0Var5 = a1Var12.i;
                                        long j7 = c0Var5 != null ? c0Var5.j() : 0L;
                                        do {
                                            value3 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8193, 7)));
                                        androidx.localbroadcastmanager.content.b bVar5 = a1Var12.v;
                                        if (bVar5 != null) {
                                            Context context4 = a1Var12.f;
                                            context4.getClass();
                                            androidx.media3.exoplayer.source.a aVarA = o0.a(context4, a1Var12.n, ((p0) mutableStateFlow3.getValue()).v, bVar5, null, ((p0) mutableStateFlow3.getValue()).w, a1Var12.w);
                                            androidx.media3.exoplayer.c0 c0Var6 = a1Var12.i;
                                            if (c0Var6 != null) {
                                                c0Var6.K(aVarA);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var7 = a1Var12.i;
                                            if (c0Var7 != null) {
                                                c0Var7.C();
                                            }
                                            androidx.media3.exoplayer.c0 c0Var8 = a1Var12.i;
                                            if (c0Var8 != null) {
                                                c0Var8.G(j7);
                                            }
                                            androidx.media3.exoplayer.c0 c0Var9 = a1Var12.i;
                                            if (c0Var9 != null) {
                                                c0Var9.M(true);
                                            }
                                        }
                                        a1Var12.k("subtitle", false);
                                        break;
                                    default:
                                        a1Var8.k("subtitle", false);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar2.l0(objQ15);
                    }
                    kotlin.jvm.functions.a aVar15 = (kotlin.jvm.functions.a) objQ15;
                    zH8 = sVar2.h(a1Var8);
                    objQ16 = sVar2.Q();
                    if (zH8) {
                        objQ16 = new n(a1Var8, 5);
                        sVar2.l0(objQ16);
                    } else {
                        objQ16 = new n(a1Var8, 5);
                        sVar2.l0(objQ16);
                    }
                    k(str11, p0Var2, yVar, aVar, aVar14, lVar16, aVar15, (kotlin.jvm.functions.l) objQ16, sVar2, ((i14 << 9) & 7168) | 384);
                    str12 = ((p0) a1Var7.getValue()).y;
                    if (str12 == null) {
                        sVar2.b0(-1391056200);
                        z19 = false;
                        sVar2.p(false);
                        oVar3 = oVar2;
                    } else {
                        sVar2.b0(-1391056199);
                        oVar3 = oVar2;
                        p5.a(androidx.compose.foundation.layout.b.u(androidx.compose.foundation.layout.t.e(oVar3, androidx.compose.ui.c.y), 0.0f, 80, 0.0f, 0.0f, 13), androidx.compose.foundation.shape.e.a(8), androidx.compose.ui.graphics.t.b(0.6f, j2), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2046199055, new com.app.mlounge.ui.components.r(str12, 7), sVar2), sVar, 12583296, 120);
                        sVar2 = sVar;
                        z19 = false;
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                    sVar2.p(z19);
                } else {
                    fVar3 = fVar;
                    a1Var8 = a1Var5;
                    oVar3 = oVar2;
                    sVar2.b0(1845535859);
                    sVar2.p(z18);
                }
                if (((p0) a1Var7.getValue()).h) {
                    a1Var9 = a1Var8;
                    sVar2.b0(1846165779);
                    sVar2.p(false);
                } else {
                    a1Var9 = a1Var8;
                    sVar2.b0(1846165779);
                    sVar2.p(false);
                }
                if (((p0) a1Var7.getValue()).B) {
                    sVar2.b0(1846209892);
                    str9 = ((p0) a1Var7.getValue()).C;
                    if (str9 == null) {
                        str9 = "Loading next episode...";
                    }
                    h(str9, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.b0(1846316563);
                    sVar2.p(false);
                }
                sVar2.p(true);
                a1Var2 = a1Var9;
            } else {
                sVar2 = sVar;
                sVar2.W();
                a1Var2 = a1Var;
            }
            s1 s1VarT = sVar2.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p(str, str2, map, str3, str4, i, i2, i3, str5, str6, aVar, rVar, a1Var2, i4) { // from class: com.app.mlounge.ui.screens.player.r
                    public final /* synthetic */ String A;
                    public final /* synthetic */ String B;
                    public final /* synthetic */ int C;
                    public final /* synthetic */ int D;
                    public final /* synthetic */ int E;
                    public final /* synthetic */ String F;
                    public final /* synthetic */ String G;
                    public final /* synthetic */ kotlin.jvm.functions.a H;
                    public final /* synthetic */ kotlin.jvm.functions.r I;
                    public final /* synthetic */ a1 J;
                    public final /* synthetic */ String e;
                    public final /* synthetic */ String y;
                    public final /* synthetic */ Map z;

                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = androidx.compose.runtime.t.A(1);
                        k0.l(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (androidx.compose.runtime.s) obj, iA);
                        return kotlin.y.a;
                    }
                };
            }
        }

        public static final void m(final long j, final long j2, final boolean z, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, final int i) {
            int i2;
            kotlin.jvm.functions.l lVar2;
            Object g0Var;
            androidx.compose.runtime.f1 f1Var;
            int i3;
            int i4;
            int i5;
            androidx.compose.runtime.a1 a1Var;
            Object h0Var;
            final boolean z2;
            androidx.compose.ui.o oVar;
            long j3;
            lVar.getClass();
            aVar.getClass();
            sVar.c0(1845836079);
            if ((i & 6) == 0) {
                i2 = (sVar.e(j) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= sVar.e(j2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= sVar.g(z) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            if ((i & 3072) == 0) {
                lVar2 = lVar;
                i2 |= sVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else {
                lVar2 = lVar;
            }
            if ((i & 24576) == 0) {
                i2 |= sVar.h(aVar) ? 16384 : 8192;
            }
            if (sVar.T(i2 & 1, (i2 & 9363) != 9362)) {
                float fC = j2 > 0 ? kotlin.collections.i0.c(j / j2, 0.0f, 1.0f) : 0.0f;
                Object objQ = sVar.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                if (objQ == fVar) {
                    objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ);
                }
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.runtime.f1(0.0f);
                    sVar.l0(objQ2);
                }
                androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) objQ2;
                float fG = ((Boolean) a1Var2.getValue()).booleanValue() ? f1Var2.g() : fC;
                Boolean bool = (Boolean) a1Var2.getValue();
                bool.getClass();
                Float fValueOf = Float.valueOf(f1Var2.g());
                int i6 = i2 & Token.ASSIGN_MOD;
                int i7 = i2 & 896;
                int i8 = i2 & 7168;
                boolean z3 = (i6 == 32) | (i7 == 256) | (i8 == 2048);
                Object objQ3 = sVar.Q();
                if (z3 || objQ3 == fVar) {
                    f1Var = f1Var2;
                    i3 = i6;
                    i4 = i2;
                    i5 = LibretroCore.SCREEN_WIDTH;
                    g0Var = new g0(j2, z, lVar2, a1Var2, f1Var, null);
                    a1Var = a1Var2;
                    sVar.l0(g0Var);
                } else {
                    i4 = i2;
                    g0Var = objQ3;
                    i3 = i6;
                    i5 = LibretroCore.SCREEN_WIDTH;
                    a1Var = a1Var2;
                    f1Var = f1Var2;
                }
                androidx.compose.runtime.l0.d(bool, fValueOf, (kotlin.jvm.functions.p) g0Var, sVar);
                Object objQ4 = sVar.Q();
                if (objQ4 == fVar) {
                    objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ4;
                androidx.compose.runtime.a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                float f = 32;
                androidx.compose.ui.r rVarG = i1.g(i1.e(oVar2, 1.0f), f);
                Long lValueOf = Long.valueOf(j2);
                Boolean boolValueOf = Boolean.valueOf(z);
                int i9 = i4 & 57344;
                boolean z4 = (i3 == 32) | (i7 == i5) | (i8 == 2048) | (i9 == 16384);
                Object objQ5 = sVar.Q();
                if (z4 || objQ5 == fVar) {
                    z2 = z;
                    oVar = oVar2;
                    h0Var = new h0(j2, z2, lVar, aVar);
                    sVar.l0(h0Var);
                } else {
                    oVar = oVar2;
                    h0Var = objQ5;
                    z2 = z;
                }
                androidx.compose.ui.input.pointer.m mVar = androidx.compose.ui.input.pointer.h0.a;
                androidx.compose.ui.r rVarD = rVarG.d(new androidx.compose.ui.input.pointer.g0(lValueOf, boolValueOf, (PointerInputEventHandler) h0Var, 4));
                androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.A, false);
                int iHashCode = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL = sVar.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarD);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar2);
                } else {
                    sVar.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                androidx.compose.runtime.t.x(sVar, q0VarD, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                androidx.compose.runtime.t.t(sVar, dVar);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
                androidx.compose.ui.r rVarG2 = i1.g(i1.e(oVar, 1.0f), 4);
                final float f2 = fG;
                boolean zC = (i7 == 256) | sVar.c(f2);
                Object objQ6 = sVar.Q();
                if (zC || objQ6 == fVar) {
                    objQ6 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.player.c0
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj) {
                            long j4;
                            float f3;
                            androidx.compose.ui.graphics.drawscope.d dVar2 = (androidx.compose.ui.graphics.drawscope.d) obj;
                            dVar2.getClass();
                            boolean z5 = z2;
                            if (z5) {
                                j4 = androidx.compose.ui.graphics.t.d;
                                f3 = 0.3f;
                            } else {
                                j4 = androidx.compose.ui.graphics.t.c;
                                f3 = 0.2f;
                            }
                            long jB = androidx.compose.ui.graphics.t.b(f3, j4);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.k0() & 4294967295L)))) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.d() >> 32));
                            dVar2.y(jB, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.k0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), Float.intBitsToFloat((int) (dVar2.d() & 4294967295L)), (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 1);
                            float f4 = f2;
                            if (f4 > 0.0f) {
                                long j5 = z5 ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.c;
                                long j6 = j5;
                                dVar2.y(j6, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.k0() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.d() >> 32)) * f4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.k0() & 4294967295L)))) & 4294967295L), Float.intBitsToFloat((int) (dVar2.d() & 4294967295L)), (LibretroCore.PSP_SCREEN_WIDTH & 16) != 0 ? 0 : 1);
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ6);
                }
                androidx.compose.foundation.s.b(rVarG2, (kotlin.jvm.functions.l) objQ6, sVar, 6);
                if (f2 < 0.01f) {
                    f2 = 0.01f;
                }
                androidx.compose.ui.r rVarG3 = i1.g(i1.e(oVar, f2), f);
                androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.C, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarG3);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar2);
                } else {
                    sVar.o0();
                }
                androidx.compose.runtime.t.x(sVar, q0VarD2, eVar);
                androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
                androidx.compose.ui.r rVarM = i1.m(oVar, ((Boolean) a1VarB.getValue()).booleanValue() ? 18 : 16);
                if (z) {
                    j3 = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.f : androidx.compose.ui.graphics.t.d;
                } else {
                    j3 = androidx.compose.ui.graphics.t.c;
                }
                androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                androidx.compose.ui.r rVarN = androidx.compose.foundation.s.n(androidx.compose.foundation.s.g(androidx.compose.foundation.s.f(rVarM, j3, dVar2), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar2), kVar, 1);
                float f3 = fC;
                boolean zC2 = (i9 == 16384) | (i7 == 256) | sVar.c(f3) | (i3 == 32) | (i8 == 2048);
                Object objQ7 = sVar.Q();
                if (zC2 || objQ7 == fVar) {
                    objQ7 = new i0(z, aVar, f3, j2, lVar, a1Var, f1Var);
                    sVar.l0(objQ7);
                }
                androidx.compose.foundation.layout.p.a(androidx.compose.ui.input.key.c.e(rVarN, (kotlin.jvm.functions.l) objQ7), sVar, 0);
                sVar.p(true);
                sVar.p(true);
            } else {
                sVar.W();
            }
            s1 s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.player.d0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        k0.m(j, j2, z, lVar, aVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                        return kotlin.y.a;
                    }
                };
            }
        }

        public static final void n(float f, int i, int i2, long j, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i3) {
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            lVar4.getClass();
            aVar.getClass();
            sVar.c0(2107898366);
            int i4 = i3 | (sVar.c(f) ? 4 : 2) | (sVar.d(i) ? 32 : 16) | (sVar.d(i2) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(lVar) ? 16384 : 8192) | (sVar.h(lVar2) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(lVar3) ? 1048576 : 524288) | (sVar.h(lVar4) ? 8388608 : 4194304) | (sVar.h(aVar) ? 67108864 : 33554432);
            if (sVar.T(i4 & 1, (38347923 & i4) != 38347922)) {
                t1.a(aVar, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(-1518373739, new y(aVar, lVar, f, lVar4, j, i, lVar2, i2, lVar3), sVar), sVar, ((i4 >> 24) & 14) | 432, 0);
            } else {
                sVar.W();
            }
            s1 s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new y(f, i, i2, j, lVar, lVar2, lVar3, lVar4, aVar, i3);
            }
        }

        public static final void o(long j, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i) {
            androidx.compose.runtime.s sVar2;
            lVar.getClass();
            sVar.c0(59637880);
            int i2 = (sVar.e(j) ? 4 : 2) | i | (sVar.h(lVar) ? 32 : 16);
            if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
                boolean z = (i2 & Token.ASSIGN_MOD) == 32;
                Object objQ = sVar.Q();
                if (z || objQ == androidx.compose.runtime.n.a) {
                    objQ = new e(6, lVar);
                    sVar.l0(objQ);
                }
                sVar2 = sVar;
                t1.a((kotlin.jvm.functions.a) objQ, null, androidx.compose.runtime.internal.k.c(-706254513, new v(j, lVar, 0, (byte) 0), sVar), sVar2, 384, 2);
            } else {
                sVar2 = sVar;
                sVar2.W();
            }
            s1 s1VarT = sVar2.t();
            if (s1VarT != null) {
                s1VarT.d = new v(i, j, lVar);
            }
        }

        public static final void p(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, androidx.compose.runtime.s sVar, int i) {
            aVar.getClass();
            aVar2.getClass();
            aVar3.getClass();
            sVar.c0(-1507009035);
            int i2 = (sVar.h(aVar) ? 4 : 2) | i | (sVar.h(aVar2) ? 32 : 16) | (sVar.h(aVar3) ? LibretroCore.SCREEN_WIDTH : 128);
            if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                t1.a(aVar3, null, androidx.compose.runtime.internal.k.c(1133785470, new w(aVar, aVar2, 0), sVar), sVar, ((i2 >> 6) & 14) | 384, 2);
            } else {
                sVar.W();
            }
            s1 s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new b2(aVar, aVar2, aVar3, i, 11);
            }
        }

        public static final void q(androidx.compose.ui.graphics.vector.f fVar, String str, String str2, float f, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
            float f2;
            androidx.compose.runtime.s sVar2 = sVar;
            sVar2.c0(-1006901639);
            int i2 = i | (sVar2.f(fVar) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? LibretroCore.SCREEN_WIDTH : 128) | 3072 | (sVar2.h(aVar) ? 16384 : 8192);
            if (sVar2.T(i2 & 1, (i2 & 9363) != 9362)) {
                float f3 = 48;
                androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
                int iHashCode = Long.hashCode(sVar2.T);
                androidx.compose.runtime.internal.j jVarL = sVar2.l();
                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, oVar);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(fVar2);
                } else {
                    sVar2.o0();
                }
                androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                boolean z = (57344 & i2) == 16384;
                Object objQ = sVar2.Q();
                if (z || objQ == androidx.compose.runtime.n.a) {
                    objQ = new x2(17, aVar);
                    sVar2.l0(objQ);
                }
                j(fVar, str, f3, 0L, null, (kotlin.jvm.functions.a) objQ, sVar2, (i2 & Token.ELSE) | 384, 24);
                androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 2));
                z5.b(str2, null, androidx.compose.ui.graphics.t.b(0.8f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(11), androidx.compose.ui.text.font.k.A, 0L, null, 0L, 0, false, 0, 0, null, sVar, ((i2 >> 6) & 14) | 1597824, 0, 262058);
                sVar2 = sVar;
                sVar2.p(true);
                f2 = f3;
            } else {
                sVar2.W();
                f2 = f;
            }
            s1 s1VarT = sVar2.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.z0(fVar, str, str2, f2, aVar, i);
            }
        }

        public static final void r(final List list, final boolean z, final c1 c1Var, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.a aVar2, final kotlin.jvm.functions.a aVar3, androidx.compose.runtime.s sVar, final int i) {
            list.getClass();
            lVar.getClass();
            aVar.getClass();
            aVar2.getClass();
            aVar3.getClass();
            sVar.c0(117735788);
            int i2 = i | (sVar.h(list) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.f(c1Var) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(aVar) ? 16384 : 8192) | (sVar.h(aVar2) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(aVar3) ? 1048576 : 524288);
            if (sVar.T(i2 & 1, (599187 & i2) != 599186)) {
                boolean zF = sVar.f(list);
                Object objQ = sVar.Q();
                Object obj = androidx.compose.runtime.n.a;
                if (zF || objQ == obj) {
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((c1) it.next()).c);
                    }
                    List listB0 = kotlin.collections.p.b0(kotlin.collections.p.e0(arrayList));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listB0) {
                        if (!kotlin.text.k.J((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    objQ = kotlin.collections.p.W(arrayList2, new j0());
                    sVar.l0(objQ);
                }
                List list2 = (List) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.t.r(null);
                    sVar.l0(objQ2);
                }
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ2;
                Object objQ3 = sVar.Q();
                if (objQ3 == obj) {
                    objQ3 = androidx.compose.runtime.t.r(Boolean.FALSE);
                    sVar.l0(objQ3);
                }
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) objQ3;
                boolean zF2 = sVar.f((String) a1Var.getValue()) | sVar.f(list);
                Object objQ4 = sVar.Q();
                if (zF2 || objQ4 == obj) {
                    if (((String) a1Var.getValue()) == null) {
                        objQ4 = list;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((c1) obj3).c.equals((String) a1Var.getValue())) {
                                arrayList3.add(obj3);
                            }
                        }
                        objQ4 = arrayList3;
                    }
                    sVar.l0(objQ4);
                }
                t1.a(aVar3, new androidx.compose.ui.window.w(3, false, false), androidx.compose.runtime.internal.k.c(1088022069, new com.app.mlounge.ui.components.n(z, c1Var, aVar, (List) objQ4, lVar, aVar2, aVar3, a1Var2, list2, a1Var), sVar), sVar, ((i2 >> 18) & 14) | 432, 0);
            } else {
                sVar.W();
            }
            s1 s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p(list, z, c1Var, lVar, aVar, aVar2, aVar3, i) { // from class: com.app.mlounge.ui.screens.player.t
                    public final /* synthetic */ kotlin.jvm.functions.l A;
                    public final /* synthetic */ kotlin.jvm.functions.a B;
                    public final /* synthetic */ kotlin.jvm.functions.a C;
                    public final /* synthetic */ kotlin.jvm.functions.a D;
                    public final /* synthetic */ List e;
                    public final /* synthetic */ boolean y;
                    public final /* synthetic */ c1 z;

                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        int iA = androidx.compose.runtime.t.A(1);
                        k0.r(this.e, this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.s) obj4, iA);
                        return kotlin.y.a;
                    }
                };
            }
        }

        public static final String s(long j) {
            long j2 = j / ((long) 1000);
            if (j2 < 3600) {
                long j3 = 60;
                return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
            }
            long j4 = 3600;
            long j5 = 60;
            return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j4), Long.valueOf((j2 % j4) / j5), Long.valueOf(j2 % j5)}, 3));
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        public static final String t(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str2 = (String) a.get(lowerCase);
            if (str2 == null) {
                return kotlin.text.k.J(str) ? "Unknown" : str;
            }
            return str2;
        }

        public static final int u(long j) {
            return ((int) ((androidx.compose.ui.graphics.t.e(j) * 255.0f) + 0.5f)) | (((((((int) ((androidx.compose.ui.graphics.t.d(j) * 255.0f) + 0.5f)) << 24) | ((int) ((androidx.compose.ui.graphics.t.h(j) * 255.0f) + 0.5f))) << 16) | ((int) ((androidx.compose.ui.graphics.t.g(j) * 255.0f) + 0.5f))) << 8);
        }
    }
