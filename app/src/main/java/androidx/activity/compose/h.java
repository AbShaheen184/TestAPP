package androidx.activity.compose;

import android.view.View;
import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.d2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h0;
import androidx.compose.animation.core.k0;
import androidx.compose.animation.core.x1;
import androidx.compose.foundation.gestures.g3;
import androidx.compose.foundation.gestures.n0;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.q0;
import androidx.compose.foundation.gestures.q2;
import androidx.compose.foundation.gestures.r2;
import androidx.compose.foundation.layout.v1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.text.r0;
import androidx.compose.material3.h3;
import androidx.compose.material3.j5;
import androidx.compose.material3.j6;
import androidx.compose.material3.v4;
import androidx.compose.material3.x2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.c0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        int i2 = 2;
        kotlin.coroutines.d dVar = null;
        boolean z = true;
        int i3 = 0;
        y yVar = y.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                androidx.activity.compose.internal.c cVar = (androidx.activity.compose.internal.c) obj3;
                m mVar = (m) obj2;
                cVar.a(mVar);
                return new k(i3, cVar, mVar);
            case 1:
                androidx.activity.compose.internal.c cVar2 = (androidx.activity.compose.internal.c) obj3;
                q qVar = (q) obj2;
                cVar2.a(qVar);
                return new k(z ? 1 : 0, cVar2, qVar);
            case 2:
                k0 k0Var = (k0) obj3;
                h0 h0Var = (h0) obj2;
                k0Var.a.b(h0Var);
                k0Var.b.setValue(Boolean.TRUE);
                return new k(i2, k0Var, h0Var);
            case 3:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, CoroutineStart.UNDISPATCHED, new c2((e2) obj2, null), 1, null);
                return new d2();
            case 4:
                e2 e2Var = (e2) obj3;
                a2 a2Var = (a2) obj2;
                e2Var.i.add(a2Var);
                return new k(5, e2Var, a2Var);
            case 5:
                e2 e2Var2 = (e2) obj3;
                e2 e2Var3 = (e2) obj2;
                e2Var2.j.add(e2Var3);
                return new k(3, e2Var2, e2Var3);
            case 6:
                return new k(4, (e2) obj3, (x1) obj2);
            case 7:
                ((androidx.compose.foundation.interaction.k) obj3).c((androidx.compose.foundation.interaction.l) obj2);
                return yVar;
            case 8:
                androidx.compose.ui.graphics.p pVar = (androidx.compose.ui.graphics.p) obj2;
                androidx.compose.ui.node.h0 h0Var2 = (androidx.compose.ui.node.h0) obj;
                h0Var2.b();
                androidx.compose.ui.graphics.drawscope.d.C(h0Var2, (androidx.compose.ui.graphics.j) obj3, pVar, 0.0f, null, 60);
                return yVar;
            case 9:
                androidx.compose.ui.node.h0 h0Var3 = (androidx.compose.ui.node.h0) obj;
                h0Var3.b();
                androidx.compose.ui.graphics.drawscope.d.C(h0Var3, ((g0) obj3).f, (androidx.compose.ui.graphics.p) obj2, 0.0f, null, 60);
                return yVar;
            case 10:
                ((androidx.compose.foundation.interaction.k) obj3).c((androidx.compose.foundation.interaction.i) obj2);
                return yVar;
            case 11:
                ((androidx.compose.runtime.collection.b) ((com.app.mlounge.data.music.e) obj3).y).j((androidx.compose.foundation.gestures.f) obj2);
                return yVar;
            case 12:
                androidx.compose.material3.internal.o oVar = (androidx.compose.material3.internal.o) obj3;
                long jF = androidx.compose.ui.geometry.b.f(1.0f, ((androidx.compose.foundation.gestures.u) obj).a);
                o1 o1Var = ((q0) obj2).g0;
                n0 n0Var = o0.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (o1Var == o1.e ? jF & 4294967295L : jF >> 32));
                androidx.compose.material3.internal.p pVar2 = oVar.a;
                androidx.compose.material3.internal.m.a(pVar2.n, pVar2.e(fIntBitsToFloat));
                return yVar;
            case 13:
                q2 q2Var = (q2) obj3;
                r2 r2Var = (r2) obj2;
                androidx.compose.foundation.gestures.u uVar = (androidx.compose.foundation.gestures.u) obj;
                float f = uVar.b ? -1.0f : 1.0f;
                long j = uVar.a;
                q2Var.a(1, androidx.compose.ui.geometry.b.f(f, r2Var.d == o1.y ? androidx.compose.ui.geometry.b.a(j, 0.0f, 1) : androidx.compose.ui.geometry.b.a(j, 0.0f, 2)));
                return yVar;
            case 14:
                g3 g3Var = (g3) obj3;
                ((Long) obj).getClass();
                float f2 = g3Var.e;
                g3Var.e = 0.0f;
                ((kotlin.jvm.functions.l) obj2).invoke(Float.valueOf(f2));
                return yVar;
            case 15:
                x0 x0Var = (x0) obj3;
                d1 d1Var = (d1) obj2;
                c1 c1Var = (c1) obj;
                boolean z2 = x0Var.P;
                float f3 = x0Var.L;
                if (z2) {
                    c1.l(c1Var, d1Var, c1Var.i0(f3), c1Var.i0(x0Var.M));
                } else {
                    c1.i(c1Var, d1Var, c1Var.i0(f3), c1Var.i0(x0Var.M));
                }
                return yVar;
            case 16:
                v1 v1Var = (v1) obj3;
                View view = (View) obj2;
                v1Var.a(view);
                return new k(6, v1Var, view);
            case 17:
                androidx.compose.foundation.lazy.grid.l lVar = (androidx.compose.foundation.lazy.grid.l) obj2;
                androidx.compose.foundation.lazy.grid.t tVarC = ((androidx.compose.foundation.lazy.grid.u) obj3).c(((Integer) obj).intValue());
                int i4 = tVarC.a;
                List list = tVarC.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i5 = 0;
                while (i3 < size) {
                    int i6 = (int) ((androidx.compose.foundation.lazy.grid.b) list.get(i3)).a;
                    arrayList.add(new kotlin.k(Integer.valueOf(i4), new androidx.compose.ui.unit.a(lVar.b(i5, i6))));
                    i4++;
                    i5 += i6;
                    i3++;
                }
                return arrayList;
            case 18:
                androidx.compose.foundation.lazy.grid.l lVar2 = (androidx.compose.foundation.lazy.grid.l) obj3;
                androidx.compose.foundation.lazy.grid.k kVar = (androidx.compose.foundation.lazy.grid.k) obj2;
                int iIntValue = ((Integer) obj).intValue();
                androidx.compose.foundation.lazy.grid.u uVar2 = (androidx.compose.foundation.lazy.grid.u) lVar2.f;
                int i7 = uVar2.f;
                int iG = uVar2.g(iIntValue);
                return kVar.w(iIntValue, lVar2.b(0, iG), 0, iG, kVar.A);
            case 19:
                androidx.compose.foundation.lazy.layout.e eVar = (androidx.compose.foundation.lazy.layout.e) obj3;
                androidx.compose.foundation.lazy.layout.f fVar = (androidx.compose.foundation.lazy.layout.f) obj2;
                androidx.compose.ui.spatial.d dVar2 = eVar.L;
                if (dVar2 != null) {
                    dVar2.b();
                }
                eVar.L = null;
                CompletableDeferred completableDeferred = fVar.c;
                if (completableDeferred != null) {
                    completableDeferred.complete(yVar);
                }
                fVar.c = null;
                return yVar;
            case 20:
                w0 w0Var = (w0) obj3;
                w0Var.z.i(obj2);
                return new k(7, w0Var, obj2);
            case 21:
                return new w0((androidx.compose.runtime.saveable.g) obj3, (Map) obj, (androidx.compose.runtime.saveable.d) obj2);
            case 22:
                r0 r0Var = (r0) obj3;
                androidx.compose.ui.graphics.p pVar3 = (androidx.compose.ui.graphics.p) obj2;
                androidx.compose.ui.node.h0 h0Var4 = (androidx.compose.ui.node.h0) obj;
                h0Var4.b();
                if (((Boolean) r0Var.s.getValue()).booleanValue() || ((Boolean) r0Var.t.getValue()).booleanValue()) {
                    androidx.compose.ui.graphics.drawscope.d.Z(h0Var4, pVar3, 0L, 0L, 0.0f, null, Token.ELSE);
                }
                return yVar;
            case 23:
                return new k(8, (a1) obj3, (androidx.compose.foundation.interaction.k) obj2);
            case 24:
                x xVar = (x) obj3;
                x xVar2 = (x) obj2;
                kotlin.text.g gVar = (kotlin.text.g) obj;
                if (xVar.e == -1) {
                    xVar.e = gVar.b().e;
                }
                xVar2.e = gVar.b().y + 1;
                return "";
            case 25:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj2;
                androidx.compose.foundation.text.contextmenu.data.g gVar2 = (androidx.compose.foundation.text.contextmenu.data.g) obj;
                ((kotlin.jvm.functions.a) obj3).invoke();
                if (aVar != null ? ((Boolean) aVar.invoke()).booleanValue() : true) {
                    gVar2.close();
                }
                return yVar;
            case 26:
                androidx.compose.animation.core.d dVar3 = (androidx.compose.animation.core.d) obj2;
                androidx.compose.ui.graphics.k0 k0Var2 = (androidx.compose.ui.graphics.k0) obj;
                float fG = ((j5) obj3).c.j.g();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & k0Var2.I));
                if (!Float.isNaN(fG) && !Float.isNaN(fIntBitsToFloat2) && fIntBitsToFloat2 != 0.0f) {
                    float fFloatValue = ((Number) dVar3.d()).floatValue();
                    k0Var2.i(h3.d(k0Var2, fFloatValue));
                    k0Var2.k(h3.e(k0Var2, fFloatValue));
                    k0Var2.s(a0.h(0.5f, (fG + fIntBitsToFloat2) / fIntBitsToFloat2));
                }
                return yVar;
            case 27:
                androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj;
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                z zVar = w.t;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.y.a[11];
                a0Var.b(zVar, Float.valueOf(1.0f));
                androidx.compose.ui.semantics.y.c(a0Var, (String) obj3);
                a0Var.b(androidx.compose.ui.semantics.m.b, new androidx.compose.ui.semantics.a(null, new x2(0, (kotlin.jvm.functions.a) obj2)));
                return yVar;
            case 28:
                w2 w2Var = (w2) obj3;
                w2 w2Var2 = (w2) obj2;
                androidx.compose.ui.graphics.drawscope.d dVar4 = (androidx.compose.ui.graphics.drawscope.d) obj;
                float fW = dVar4.W(v4.c);
                long j2 = ((androidx.compose.ui.graphics.t) w2Var.getValue()).a;
                float f4 = 2;
                float fW2 = dVar4.W(androidx.compose.material3.tokens.v.c / f4);
                float f5 = fW / f4;
                androidx.compose.ui.graphics.drawscope.d.S(dVar4, j2, fW2 - f5, 0L, new androidx.compose.ui.graphics.drawscope.h(fW, 0.0f, 0, 0, 30), Token.ASSIGN_ADD);
                if (androidx.compose.ui.unit.f.a(((androidx.compose.ui.unit.f) w2Var2.getValue()).e, 0) > 0) {
                    androidx.compose.ui.graphics.drawscope.d.S(dVar4, ((androidx.compose.ui.graphics.t) w2Var.getValue()).a, dVar4.W(((androidx.compose.ui.unit.f) w2Var2.getValue()).e) - f5, 0L, androidx.compose.ui.graphics.drawscope.g.a, Token.ASSIGN_ADD);
                }
                return yVar;
            default:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, null, new p((c0) obj, (j6) obj2, dVar, 16), 3, null);
                return yVar;
        }
    }
}
