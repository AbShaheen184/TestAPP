package androidx.compose.animation.core;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.gestures.g3;
import androidx.compose.material3.a3;
import androidx.compose.material3.d3;
import androidx.compose.material3.h4;
import androidx.compose.material3.j5;
import androidx.compose.material3.j6;
import androidx.compose.material3.k5;
import androidx.compose.runtime.w2;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.tasks.TasksKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(androidx.compose.foundation.gestures.j jVar, g3 g3Var, Job job, androidx.compose.foundation.gestures.q2 q2Var) {
        this.e = 1;
        this.y = jVar;
        this.z = job;
        this.A = q2Var;
    }

    private final Object e(Object obj) {
        androidx.compose.runtime.saveable.e eVar = (androidx.compose.runtime.saveable.e) this.y;
        androidx.compose.runtime.saveable.j jVar = (androidx.compose.runtime.saveable.j) this.A;
        androidx.collection.o0 o0Var = eVar.y;
        Object obj2 = this.z;
        if (o0Var.b(obj2)) {
            androidx.media3.exoplayer.source.t0.g(obj2, " was used multiple times ", "Key ");
            return null;
        }
        eVar.e.remove(obj2);
        o0Var.m(obj2, jVar);
        return new androidx.compose.animation.g(1, eVar, obj2, jVar);
    }

    private final Object f(Object obj) {
        androidx.compose.runtime.s2 s2Var = (androidx.compose.runtime.s2) this.y;
        androidx.datastore.core.b1 b1Var = (androidx.datastore.core.b1) this.z;
        androidx.compose.ui.text.x xVar = (androidx.compose.ui.text.x) this.A;
        Throwable th = (Throwable) obj;
        s2Var.invoke(th);
        Channel channel = b1Var.c;
        channel.close(th);
        while (true) {
            Object objM47getOrNullimpl = ChannelResult.m47getOrNullimpl(channel.mo35tryReceivePtdJZtk());
            if (objM47getOrNullimpl == null) {
                return kotlin.y.a;
            }
            xVar.invoke(objM47getOrNullimpl, th);
        }
    }

    private final Object g(Object obj) {
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) this.y;
        androidx.lifecycle.compose.b bVar = (androidx.lifecycle.compose.b) this.z;
        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.core.view.k kVar = new androidx.core.view.k(bVar, zVar, lVar, 1);
        vVar.getLifecycle().a(kVar);
        return new androidx.compose.animation.g(2, vVar, kVar, zVar);
    }

    private final Object h(Object obj) {
        androidx.compose.ui.graphics.painter.b bVar = (androidx.compose.ui.graphics.painter.b) this.y;
        androidx.compose.ui.graphics.painter.b bVar2 = (androidx.compose.ui.graphics.painter.b) this.z;
        androidx.compose.ui.graphics.painter.b bVar3 = (androidx.compose.ui.graphics.painter.b) this.A;
        coil3.compose.h hVar = (coil3.compose.h) obj;
        if (hVar instanceof coil3.compose.f) {
            return bVar != null ? new coil3.compose.f(bVar) : (coil3.compose.f) hVar;
        }
        if (!(hVar instanceof coil3.compose.e)) {
            return hVar;
        }
        coil3.compose.e eVar = (coil3.compose.e) hVar;
        coil3.request.c cVar = eVar.b;
        if (cVar.c instanceof coil3.request.m) {
            return bVar2 != null ? new coil3.compose.e(bVar2, cVar) : eVar;
        }
        return bVar3 != null ? new coil3.compose.e(bVar3, cVar) : eVar;
    }

    private final Object i(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.y;
        com.app.mlounge.ui.viewmodel.j0 j0Var = (com.app.mlounge.ui.viewmodel.j0) this.z;
        kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.A;
        MusicTrack musicTrack = (MusicTrack) obj;
        musicTrack.getClass();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.room.coroutines.c0(j0Var, musicTrack, wVar, (kotlin.coroutines.d) null, 9), 3, null);
        return kotlin.y.a;
    }

    private final Object j(Object obj) {
        w2 w2Var = (w2) this.y;
        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
        w2 w2Var2 = (w2) this.A;
        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
        hVar.getClass();
        List list = (List) w2Var.getValue();
        hVar.q(list.size(), new androidx.compose.foundation.text.c0(7, new com.app.mlounge.ui.components.c0(1), list), new com.app.mlounge.ui.components.u0(1, list), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.adult.g(list, lVar, 0)));
        if (((Boolean) w2Var2.getValue()).booleanValue()) {
            androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.adult.h.b, null);
        }
        return kotlin.y.a;
    }

    private final Object k(Object obj) {
        androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.y;
        GameDetailResponse gameDetailResponse = (GameDetailResponse) this.z;
        Context context = (Context) this.A;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        a1Var.setValue(bool);
        Toast.makeText(context, zBooleanValue ? androidx.constraintlayout.core.g.c(gameDetailResponse.d(), " downloaded!") : "Download failed", 0).show();
        return kotlin.y.a;
    }

    private final Object l(Object obj) {
        List list = (List) this.y;
        androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.z;
        androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) this.A;
        androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
        jVar.getClass();
        if (((File) a1Var.getValue()).getParentFile() != null && !kotlin.jvm.internal.l.a(((File) a1Var.getValue()).getAbsolutePath(), "/")) {
            if (list != null && list.isEmpty()) {
                androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 25393286, new com.app.mlounge.ui.screens.anime.a(a1Var, 1)), 2);
                break;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 25393286, new com.app.mlounge.ui.screens.anime.a(a1Var, 1)), 2);
                    break;
                }
            } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it.next()).e).getAbsolutePath(), ((File) a1Var.getValue()).getAbsolutePath()));
        }
        if (((List) a1Var2.getValue()).isEmpty()) {
            androidx.compose.foundation.lazy.j.p(jVar, com.app.mlounge.ui.screens.settings.b.q, 3);
        } else {
            List list2 = (List) a1Var2.getValue();
            jVar.q(list2.size(), new androidx.compose.foundation.text.c0(28, new com.app.mlounge.ui.t(25), list2), new com.app.mlounge.ui.components.u0(21, list2), new androidx.compose.runtime.internal.f(true, 802480018, new com.app.mlounge.ui.screens.search.h(list2, a1Var, 1)));
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0a4f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:448:0x0a4f */
    /* JADX WARN: Type inference failed for: r0v76, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v180, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Throwable {
        androidx.compose.ui.graphics.r rVar;
        androidx.compose.ui.graphics.r rVar2;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        androidx.compose.ui.text.j0 j0Var;
        androidx.compose.ui.text.j0 j0Var2;
        androidx.compose.foundation.text.k1 k1Var;
        androidx.compose.foundation.text.k1 k1Var2;
        androidx.compose.ui.text.j0 j0Var3;
        androidx.compose.ui.text.j0 j0Var4;
        androidx.compose.foundation.text.k1 k1Var3;
        androidx.compose.foundation.text.k1 k1Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        androidx.compose.foundation.text.input.internal.o oVar;
        androidx.compose.ui.text.input.x xVar;
        boolean z;
        androidx.compose.foundation.text.r0 r0Var;
        int i = this.e;
        int i2 = 3;
        int i3 = 15;
        final int i4 = 2;
        ?? r10 = 0;
        androidx.compose.ui.text.input.x xVar2 = null;
        r10 = 0;
        kotlin.y yVar = kotlin.y.a;
        int i5 = 0;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        int i6 = 1;
        switch (i) {
            case 0:
                d dVar = (d) obj4;
                n nVar = (n) obj3;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj2;
                l lVar = (l) obj;
                e.p(lVar, dVar.c);
                androidx.compose.runtime.j1 j1Var = lVar.e;
                Object objA = d.a(dVar, j1Var.getValue());
                if (!kotlin.jvm.internal.l.a(objA, j1Var.getValue())) {
                    dVar.c.y.setValue(objA);
                    nVar.y.setValue(objA);
                    lVar.i.setValue(Boolean.FALSE);
                    lVar.d.invoke();
                    vVar.e = true;
                }
                return yVar;
            case 1:
                androidx.compose.foundation.gestures.j jVar = (androidx.compose.foundation.gestures.j) obj4;
                Job job = (Job) obj3;
                androidx.compose.foundation.gestures.q2 q2Var = (androidx.compose.foundation.gestures.q2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = jVar.N ? 1.0f : -1.0f;
                androidx.compose.foundation.gestures.r2 r2Var = jVar.M;
                long jE = r2Var.e(r2Var.h(f * fFloatValue));
                androidx.compose.foundation.gestures.r2 r2Var2 = q2Var.a;
                float fG = r2Var.g(r2Var.e(r2Var2.c(r2Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null, 2, null);
                }
                return yVar;
            case 2:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj4;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) obj2;
                androidx.compose.ui.text.input.x xVar3 = (androidx.compose.ui.text.input.x) obj;
                ((androidx.compose.runtime.a1) obj3).setValue(xVar3);
                boolean zA = kotlin.jvm.internal.l.a((String) a1Var.getValue(), xVar3.a.y);
                androidx.compose.ui.text.g gVar = xVar3.a;
                a1Var.setValue(gVar.y);
                if (!zA) {
                    lVar2.invoke(gVar.y);
                }
                return yVar;
            case 3:
                androidx.compose.foundation.text.r0 r0Var2 = (androidx.compose.foundation.text.r0) obj4;
                long j = ((androidx.compose.ui.text.input.x) obj3).b;
                androidx.compose.ui.text.input.q qVar = (androidx.compose.ui.text.input.q) obj2;
                androidx.compose.ui.graphics.drawscope.d dVar2 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.foundation.text.k1 k1VarD = r0Var2.d();
                if (k1VarD == null) {
                    return yVar;
                }
                androidx.compose.ui.graphics.r rVarV = dVar2.c0().v();
                long j2 = ((androidx.compose.ui.text.l0) r0Var2.A.getValue()).a;
                long j3 = ((androidx.compose.ui.text.l0) r0Var2.B.getValue()).a;
                androidx.compose.ui.text.j0 j0Var5 = k1VarD.a;
                androidx.compose.ui.text.i0 i0Var = j0Var5.a;
                androidx.compose.ui.text.n nVar2 = j0Var5.b;
                com.google.android.gms.cloudmessaging.n nVar3 = r0Var2.y;
                long j4 = r0Var2.z;
                if (!androidx.compose.ui.text.l0.c(j2)) {
                    nVar3.h(j4);
                    int iV = qVar.v(androidx.compose.ui.text.l0.f(j2));
                    int iV2 = qVar.v(androidx.compose.ui.text.l0.e(j2));
                    if (iV != iV2) {
                        rVarV.e(j0Var5.h(iV, iV2), nVar3);
                    }
                } else if (!androidx.compose.ui.text.l0.c(j3)) {
                    long jB = i0Var.b.b();
                    androidx.compose.ui.graphics.t tVar = jB == 16 ? null : new androidx.compose.ui.graphics.t(jB);
                    long j5 = tVar != null ? tVar.a : androidx.compose.ui.graphics.t.b;
                    nVar3.h(androidx.compose.ui.graphics.t.b(androidx.compose.ui.graphics.t.d(j5) * 0.2f, j5));
                    int iV3 = qVar.v(androidx.compose.ui.text.l0.f(j3));
                    int iV4 = qVar.v(androidx.compose.ui.text.l0.e(j3));
                    if (iV3 != iV4) {
                        rVarV.e(j0Var5.h(iV3, iV4), nVar3);
                    }
                } else if (!androidx.compose.ui.text.l0.c(j)) {
                    nVar3.h(j4);
                    int iV5 = qVar.v(androidx.compose.ui.text.l0.f(j));
                    int iV6 = qVar.v(androidx.compose.ui.text.l0.e(j));
                    if (iV5 != iV6) {
                        rVarV.e(j0Var5.h(iV5, iV6), nVar3);
                    }
                }
                long j6 = j0Var5.c;
                boolean z2 = ((((float) ((int) (j6 >> 32))) > nVar2.d ? 1 : (((float) ((int) (j6 >> 32))) == nVar2.d ? 0 : -1)) < 0 || nVar2.c || (((float) ((int) (j6 & 4294967295L))) > nVar2.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == nVar2.e ? 0 : -1)) < 0) && i0Var.f != 3;
                if (z2) {
                    androidx.compose.ui.geometry.c cVarB = org.jsoup.helper.n.b(0L, (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L));
                    rVarV.f();
                    androidx.compose.ui.graphics.r.k(rVarV, cVarB);
                }
                androidx.compose.ui.text.e0 e0Var = i0Var.b.a;
                androidx.compose.ui.text.style.l lVar3 = e0Var.m;
                androidx.compose.ui.text.style.o oVar2 = e0Var.a;
                if (lVar3 == null) {
                    lVar3 = androidx.compose.ui.text.style.l.b;
                }
                androidx.compose.ui.text.style.l lVar4 = lVar3;
                androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                if (m0Var == null) {
                    m0Var = androidx.compose.ui.graphics.m0.d;
                }
                androidx.compose.ui.graphics.m0 m0Var2 = m0Var;
                androidx.compose.ui.graphics.drawscope.e eVar = e0Var.p;
                if (eVar == null) {
                    eVar = androidx.compose.ui.graphics.drawscope.g.a;
                }
                androidx.compose.ui.graphics.drawscope.e eVar2 = eVar;
                try {
                    androidx.compose.ui.graphics.p pVarC = oVar2.c();
                    androidx.compose.ui.text.style.n nVar4 = androidx.compose.ui.text.style.n.a;
                    try {
                        if (pVarC == null) {
                            androidx.compose.ui.graphics.r rVar3 = rVarV;
                            long jB2 = oVar2 != nVar4 ? oVar2.b() : androidx.compose.ui.graphics.t.b;
                            rVar3.f();
                            ArrayList arrayList = nVar2.h;
                            int size = arrayList.size();
                            int i7 = 0;
                            while (i7 < size) {
                                androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) arrayList.get(i7);
                                pVar.a.f(rVar3, jB2, m0Var2, lVar4, eVar2);
                                rVar = rVar3;
                                try {
                                    rVar.p(0.0f, pVar.a.b());
                                    i7++;
                                    rVar3 = rVar;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z2) {
                                        rVar.q();
                                    }
                                    throw th;
                                }
                            }
                            rVar = rVar3;
                            rVar.q();
                            break;
                        } else {
                            androidx.compose.ui.text.n.i(nVar2, rVarV, pVarC, oVar2 != nVar4 ? oVar2.a() : 1.0f, m0Var2, lVar4, eVar2);
                            rVar = rVarV;
                        }
                        if (!z2) {
                            return yVar;
                        }
                        rVar.q();
                        return yVar;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rVar = rVarV;
                }
                break;
            case 4:
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) obj3;
                androidx.compose.ui.text.input.d0 d0Var = (androidx.compose.ui.text.input.d0) ((kotlin.jvm.internal.z) obj2).e;
                androidx.compose.ui.text.input.x xVarJ = ((androidx.compose.foundation.text.input.internal.o) obj4).j((List) obj);
                if (d0Var != null) {
                    d0Var.a(null, xVarJ);
                }
                lVar5.invoke(xVarJ);
                return yVar;
            case 5:
                androidx.compose.foundation.text.b1 b1Var = (androidx.compose.foundation.text.b1) obj3;
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj2;
                androidx.compose.foundation.text.selection.s0 s0Var = (androidx.compose.foundation.text.selection.s0) obj;
                int i8 = 7;
                switch (((androidx.compose.foundation.text.j0) obj4).ordinal()) {
                    case 0:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (androidx.compose.ui.text.l0.c(s0Var.f)) {
                                s0Var.i();
                            } else {
                                boolean zF = s0Var.f();
                                long j7 = s0Var.f;
                                if (zF) {
                                    int iF = androidx.compose.ui.text.l0.f(j7);
                                    s0Var.q(iF, iF);
                                } else {
                                    int iE = androidx.compose.ui.text.l0.e(j7);
                                    s0Var.q(iE, iE);
                                }
                            }
                        }
                        break;
                    case 1:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (androidx.compose.ui.text.l0.c(s0Var.f)) {
                                s0Var.m();
                            } else {
                                boolean zF2 = s0Var.f();
                                long j8 = s0Var.f;
                                if (zF2) {
                                    int iE2 = androidx.compose.ui.text.l0.e(j8);
                                    s0Var.q(iE2, iE2);
                                } else {
                                    int iF2 = androidx.compose.ui.text.l0.f(j8);
                                    s0Var.q(iF2, iF2);
                                }
                            }
                        }
                        break;
                    case 2:
                        androidx.compose.foundation.text.selection.h1 h1Var = s0Var.e;
                        h1Var.a = null;
                        androidx.compose.ui.text.g gVar2 = s0Var.g;
                        String str = gVar2.y;
                        String str2 = gVar2.y;
                        if (str.length() > 0) {
                            if (s0Var.f()) {
                                h1Var.a = null;
                                if (str2.length() > 0 && (numD = s0Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    s0Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                h1Var.a = null;
                                if (str2.length() > 0 && (numE = s0Var.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    s0Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        androidx.compose.foundation.text.selection.h1 h1Var2 = s0Var.e;
                        h1Var2.a = null;
                        androidx.compose.ui.text.g gVar3 = s0Var.g;
                        String str3 = gVar3.y;
                        String str4 = gVar3.y;
                        if (str3.length() > 0) {
                            if (s0Var.f()) {
                                h1Var2.a = null;
                                if (str4.length() > 0 && (numE2 = s0Var.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    s0Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                h1Var2.a = null;
                                if (str4.length() > 0 && (numD2 = s0Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    s0Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        s0Var.j();
                        break;
                    case 5:
                        s0Var.l();
                        break;
                    case 6:
                        s0Var.o();
                        break;
                    case 7:
                        s0Var.n();
                        break;
                    case 8:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (s0Var.f()) {
                                s0Var.o();
                            } else {
                                s0Var.n();
                            }
                        }
                        break;
                    case 9:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (s0Var.f()) {
                                s0Var.n();
                            } else {
                                s0Var.o();
                            }
                        }
                        break;
                    case 10:
                        if (s0Var.g.y.length() > 0 && (j0Var = s0Var.c) != null) {
                            int iG = s0Var.g(j0Var, -1);
                            s0Var.q(iG, iG);
                        }
                        break;
                    case 11:
                        if (s0Var.g.y.length() > 0 && (j0Var2 = s0Var.c) != null) {
                            int iG2 = s0Var.g(j0Var2, 1);
                            s0Var.q(iG2, iG2);
                        }
                        break;
                    case 12:
                    case Token.THIS /* 48 */:
                        break;
                    case 13:
                        if (s0Var.g.y.length() > 0 && (k1Var = s0Var.i) != null) {
                            int iH = s0Var.h(k1Var, -1);
                            s0Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (s0Var.g.y.length() > 0 && (k1Var2 = s0Var.i) != null) {
                            int iH2 = s0Var.h(k1Var2, 1);
                            s0Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            s0Var.q(0, 0);
                        }
                        break;
                    case 16:
                        s0Var.e.a = null;
                        androidx.compose.ui.text.g gVar4 = s0Var.g;
                        if (gVar4.y.length() > 0) {
                            int length = gVar4.y.length();
                            s0Var.q(length, length);
                        }
                        break;
                    case 17:
                        b1Var.b.d(false);
                        break;
                    case 18:
                        b1Var.b.p();
                        break;
                    case 19:
                        b1Var.b.f();
                        break;
                    case 20:
                        List listA = s0Var.a(new androidx.compose.foundation.gestures.w1(11));
                        if (listA != null) {
                            b1Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = s0Var.a(new androidx.compose.foundation.gestures.w1(12));
                        if (listA2 != null) {
                            b1Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = s0Var.a(new androidx.compose.foundation.gestures.w1(13));
                        if (listA3 != null) {
                            b1Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = s0Var.a(new androidx.compose.foundation.gestures.w1(14));
                        if (listA4 != null) {
                            b1Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = s0Var.a(new androidx.compose.foundation.gestures.w1(i3));
                        if (listA5 != null) {
                            b1Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = s0Var.a(new androidx.compose.foundation.gestures.w1(16));
                        if (listA6 != null) {
                            b1Var.a(listA6);
                        }
                        break;
                    case 26:
                        s0Var.e.a = null;
                        androidx.compose.ui.text.g gVar5 = s0Var.g;
                        if (gVar5.y.length() > 0) {
                            s0Var.q(0, gVar5.y.length());
                        }
                        break;
                    case 27:
                        s0Var.i();
                        s0Var.p();
                        break;
                    case 28:
                        s0Var.m();
                        s0Var.p();
                        break;
                    case 29:
                        if (s0Var.g.y.length() > 0 && (j0Var3 = s0Var.c) != null) {
                            int iG3 = s0Var.g(j0Var3, -1);
                            s0Var.q(iG3, iG3);
                        }
                        s0Var.p();
                        break;
                    case 30:
                        if (s0Var.g.y.length() > 0 && (j0Var4 = s0Var.c) != null) {
                            int iG4 = s0Var.g(j0Var4, 1);
                            s0Var.q(iG4, iG4);
                        }
                        s0Var.p();
                        break;
                    case 31:
                        if (s0Var.g.y.length() > 0 && (k1Var3 = s0Var.i) != null) {
                            int iH3 = s0Var.h(k1Var3, -1);
                            s0Var.q(iH3, iH3);
                        }
                        s0Var.p();
                        break;
                    case 32:
                        if (s0Var.g.y.length() > 0 && (k1Var4 = s0Var.i) != null) {
                            int iH4 = s0Var.h(k1Var4, 1);
                            s0Var.q(iH4, iH4);
                        }
                        s0Var.p();
                        break;
                    case Token.GETPROP /* 33 */:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            s0Var.q(0, 0);
                        }
                        s0Var.p();
                        break;
                    case Token.GETPROPNOWARN /* 34 */:
                        s0Var.e.a = null;
                        androidx.compose.ui.text.g gVar6 = s0Var.g;
                        if (gVar6.y.length() > 0) {
                            int length2 = gVar6.y.length();
                            s0Var.q(length2, length2);
                        }
                        s0Var.p();
                        break;
                    case 35:
                        androidx.compose.foundation.text.selection.h1 h1Var3 = s0Var.e;
                        h1Var3.a = null;
                        androidx.compose.ui.text.g gVar7 = s0Var.g;
                        String str5 = gVar7.y;
                        String str6 = gVar7.y;
                        if (str5.length() > 0) {
                            if (s0Var.f()) {
                                h1Var3.a = null;
                                if (str6.length() > 0 && (numE3 = s0Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    s0Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                h1Var3.a = null;
                                if (str6.length() > 0 && (numD3 = s0Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    s0Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        s0Var.p();
                        break;
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        androidx.compose.foundation.text.selection.h1 h1Var4 = s0Var.e;
                        h1Var4.a = null;
                        androidx.compose.ui.text.g gVar8 = s0Var.g;
                        String str7 = gVar8.y;
                        String str8 = gVar8.y;
                        if (str7.length() > 0) {
                            if (s0Var.f()) {
                                h1Var4.a = null;
                                if (str8.length() > 0 && (numD4 = s0Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    s0Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                h1Var4.a = null;
                                if (str8.length() > 0 && (numE4 = s0Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    s0Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        s0Var.p();
                        break;
                    case Token.SETPROP /* 37 */:
                        s0Var.j();
                        s0Var.p();
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        s0Var.l();
                        s0Var.p();
                        break;
                    case Token.GETELEM /* 39 */:
                        s0Var.o();
                        s0Var.p();
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        s0Var.n();
                        s0Var.p();
                        break;
                    case Token.SETELEM /* 41 */:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (s0Var.f()) {
                                s0Var.o();
                            } else {
                                s0Var.n();
                            }
                        }
                        s0Var.p();
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            if (s0Var.f()) {
                                s0Var.n();
                            } else {
                                s0Var.o();
                            }
                        }
                        s0Var.p();
                        break;
                    case Token.CALL /* 43 */:
                        s0Var.e.a = null;
                        if (s0Var.g.y.length() > 0) {
                            long j9 = s0Var.f;
                            int i9 = androidx.compose.ui.text.l0.c;
                            int i10 = (int) (j9 & 4294967295L);
                            s0Var.q(i10, i10);
                        }
                        break;
                    case Token.NAME /* 44 */:
                        if (b1Var.e) {
                            vVar2.e = b1Var.a.x.y.r.b(b1Var.l);
                        } else {
                            b1Var.a(kotlin.collections.q.j(new androidx.compose.ui.text.input.a("\n", 1)));
                        }
                        break;
                    case Token.NUMBER /* 45 */:
                        if (b1Var.e) {
                            vVar2.e = false;
                        } else {
                            b1Var.a(kotlin.collections.q.j(new androidx.compose.ui.text.input.a("\t", 1)));
                        }
                        break;
                    case Token.STRING /* 46 */:
                        androidx.compose.foundation.text.l1 l1Var = b1Var.h;
                        if (l1Var != null) {
                            l1Var.a(androidx.compose.ui.text.input.x.a(s0Var.h, s0Var.g, s0Var.f, 4));
                        }
                        androidx.compose.foundation.text.l1 l1Var2 = b1Var.h;
                        if (l1Var2 != null) {
                            androidx.compose.foundation.text.input.internal.o oVar3 = l1Var2.a;
                            if (oVar3 != null && (oVar = (androidx.compose.foundation.text.input.internal.o) oVar3.y) != null) {
                                l1Var2.a = oVar;
                                l1Var2.c -= ((androidx.compose.ui.text.input.x) oVar3.z).a.y.length();
                                l1Var2.b = new androidx.compose.foundation.text.input.internal.o(i8, l1Var2.b, (androidx.compose.ui.text.input.x) oVar3.z);
                                xVar = (androidx.compose.ui.text.input.x) oVar.z;
                            }
                            if (r10 != 0) {
                                r10 = xVar;
                                b1Var.k.invoke(r10);
                            }
                        }
                        break;
                    case Token.NULL /* 47 */:
                        androidx.compose.foundation.text.l1 l1Var3 = b1Var.h;
                        if (l1Var3 != null) {
                            androidx.compose.foundation.text.input.internal.o oVar4 = l1Var3.b;
                            if (oVar4 != null) {
                                l1Var3.b = (androidx.compose.foundation.text.input.internal.o) oVar4.y;
                                androidx.compose.ui.text.input.x xVar4 = (androidx.compose.ui.text.input.x) oVar4.z;
                                l1Var3.a = new androidx.compose.foundation.text.input.internal.o(i8, l1Var3.a, xVar4);
                                l1Var3.c = xVar4.a.y.length() + l1Var3.c;
                                xVar2 = (androidx.compose.ui.text.input.x) oVar4.z;
                            }
                            if (xVar2 != null) {
                                b1Var.k.invoke(xVar2);
                            }
                        }
                        break;
                    default:
                        coil3.g.a();
                        return null;
                }
                r10 = xVar;
                return yVar;
            case 6:
                Context context = (Context) obj3;
                androidx.compose.foundation.text.contextmenu.data.g gVar9 = (androidx.compose.foundation.text.contextmenu.data.g) obj2;
                androidx.compose.foundation.contextmenu.g gVar10 = (androidx.compose.foundation.contextmenu.g) obj;
                ?? r2 = ((androidx.compose.foundation.text.contextmenu.data.c) obj4).a;
                int size2 = r2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    androidx.compose.foundation.text.contextmenu.data.b bVar = (androidx.compose.foundation.text.contextmenu.data.b) r2.get(i11);
                    if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.d) {
                        androidx.compose.foundation.text.contextmenu.data.d dVar3 = (androidx.compose.foundation.text.contextmenu.data.d) bVar;
                        androidx.compose.foundation.contextmenu.g.b(gVar10, new g0(dVar3, 6), dVar3.c == 0 ? null : new androidx.compose.runtime.internal.f(true, -1930700965, new androidx.compose.foundation.text.contextmenu.internal.m(dVar3, 0)), new androidx.activity.compose.f(10, dVar3, gVar9), 6);
                    } else if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.h) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            androidx.compose.foundation.text.contextmenu.internal.v.f(gVar10, context, (androidx.compose.foundation.text.contextmenu.data.h) bVar);
                        }
                    } else if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.f) {
                        gVar10.a.add(androidx.compose.foundation.contextmenu.c.b);
                    }
                }
                return yVar;
            case 7:
                androidx.compose.foundation.text.selection.q0 q0Var = (androidx.compose.foundation.text.selection.q0) obj4;
                androidx.collection.g gVar11 = (androidx.collection.g) obj3;
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) obj2;
                androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) obj;
                long j10 = vVar4.c;
                androidx.compose.foundation.text.selection.b1 b1Var2 = (androidx.compose.foundation.text.selection.b1) q0Var.A;
                if (!b1Var2.k() || b1Var2.n().a.y.length() == 0 || (r0Var = b1Var2.d) == null || r0Var.d() == null) {
                    z = false;
                } else {
                    q0Var.g(b1Var2.n(), j10, false, gVar11);
                    z = true;
                }
                if (z) {
                    vVar4.a();
                    vVar3.e = true;
                }
                return yVar;
            case 8:
                final androidx.compose.foundation.text.selection.b1 b1Var3 = (androidx.compose.foundation.text.selection.b1) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Context context2 = (Context) obj2;
                androidx.compose.foundation.text.contextmenu.builder.a aVar = (androidx.compose.foundation.text.contextmenu.builder.a) obj;
                androidx.collection.j0 j0Var6 = aVar.a;
                androidx.collection.j0 j0Var7 = aVar.a;
                androidx.compose.foundation.text.contextmenu.data.f fVar = androidx.compose.foundation.text.contextmenu.data.f.b;
                j0Var6.a(fVar);
                androidx.compose.foundation.text.v0 v0Var = androidx.compose.foundation.text.v0.Autofill;
                boolean z3 = (androidx.compose.ui.text.l0.c(b1Var3.n().b) || !b1Var3.j() || (b1Var3.f instanceof androidx.compose.ui.text.input.r) || b1Var3.h == null) ? false : true;
                androidx.activity.compose.f fVar2 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.v0(b1Var3, r10, i6));
                Resources resources = context2.getResources();
                int i12 = 25;
                androidx.activity.compose.h hVar = new androidx.activity.compose.h(i12, fVar2, r10);
                if (z3) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, hVar));
                }
                androidx.compose.foundation.text.v0 v0Var2 = androidx.compose.foundation.text.v0.Autofill;
                boolean z4 = (androidx.compose.ui.text.l0.c(b1Var3.n().b) || (b1Var3.f instanceof androidx.compose.ui.text.input.r) || b1Var3.h == null) ? false : true;
                androidx.activity.compose.f fVar3 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.v0(b1Var3, r10, i4));
                Resources resources2 = context2.getResources();
                androidx.activity.compose.h hVar2 = new androidx.activity.compose.h(i12, fVar3, r10);
                if (z4) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, hVar2));
                }
                androidx.compose.foundation.text.v0 v0Var3 = androidx.compose.foundation.text.v0.Autofill;
                boolean z5 = b1Var3.j() && ((Boolean) b1Var3.x.getValue()).booleanValue() && b1Var3.h != null;
                androidx.activity.compose.f fVar4 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.v0(b1Var3, r10, i2));
                Resources resources3 = context2.getResources();
                androidx.activity.compose.h hVar3 = new androidx.activity.compose.h(i12, fVar4, r10);
                if (z5) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, hVar3));
                }
                androidx.compose.foundation.text.v0 v0Var4 = androidx.compose.foundation.text.v0.Autofill;
                boolean z6 = androidx.compose.ui.text.l0.d(b1Var3.n().b) != b1Var3.n().a.y.length();
                final int i13 = 0;
                kotlin.jvm.functions.a aVar2 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f1
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!b1Var3.B);
                            case 1:
                                b1 b1Var4 = b1Var3;
                                androidx.compose.ui.text.input.x xVarE = b1.e(b1Var4.n().a, androidx.compose.ui.text.d0.b(0, b1Var4.n().a.y.length()));
                                b1Var4.c.invoke(xVarE);
                                long j11 = xVarE.b;
                                b1Var4.w = new androidx.compose.ui.text.l0(j11);
                                b1Var4.u = androidx.compose.ui.text.input.x.a(b1Var4.u, null, j11, 5);
                                b1Var4.h(true);
                                return kotlin.y.a;
                            default:
                                kotlin.jvm.functions.a aVar3 = b1Var3.g;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                }
                                return kotlin.y.a;
                        }
                    }
                };
                final int i14 = 1;
                kotlin.jvm.functions.a aVar3 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f1
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return Boolean.valueOf(!b1Var3.B);
                            case 1:
                                b1 b1Var4 = b1Var3;
                                androidx.compose.ui.text.input.x xVarE = b1.e(b1Var4.n().a, androidx.compose.ui.text.d0.b(0, b1Var4.n().a.y.length()));
                                b1Var4.c.invoke(xVarE);
                                long j11 = xVarE.b;
                                b1Var4.w = new androidx.compose.ui.text.l0(j11);
                                b1Var4.u = androidx.compose.ui.text.input.x.a(b1Var4.u, null, j11, 5);
                                b1Var4.h(true);
                                return kotlin.y.a;
                            default:
                                kotlin.jvm.functions.a aVar4 = b1Var3.g;
                                if (aVar4 != null) {
                                    aVar4.invoke();
                                }
                                return kotlin.y.a;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                androidx.activity.compose.h hVar4 = new androidx.activity.compose.h(i12, aVar3, aVar2);
                if (z6) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, hVar4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    androidx.compose.foundation.text.v0 v0Var5 = androidx.compose.foundation.text.v0.Autofill;
                    boolean z7 = b1Var3.j() && androidx.compose.ui.text.l0.c(b1Var3.n().b);
                    kotlin.jvm.functions.a aVar4 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f1
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    return Boolean.valueOf(!b1Var3.B);
                                case 1:
                                    b1 b1Var4 = b1Var3;
                                    androidx.compose.ui.text.input.x xVarE = b1.e(b1Var4.n().a, androidx.compose.ui.text.d0.b(0, b1Var4.n().a.y.length()));
                                    b1Var4.c.invoke(xVarE);
                                    long j11 = xVarE.b;
                                    b1Var4.w = new androidx.compose.ui.text.l0(j11);
                                    b1Var4.u = androidx.compose.ui.text.input.x.a(b1Var4.u, null, j11, 5);
                                    b1Var4.h(true);
                                    return kotlin.y.a;
                                default:
                                    kotlin.jvm.functions.a aVar5 = b1Var3.g;
                                    if (aVar5 != null) {
                                        aVar5.invoke();
                                    }
                                    return kotlin.y.a;
                            }
                        }
                    };
                    Resources resources5 = context2.getResources();
                    androidx.activity.compose.h hVar5 = new androidx.activity.compose.h(i12, aVar4, r10);
                    if (z7) {
                        j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(v0Var5.e, resources5.getString(v0Var5.y), v0Var5.z, hVar5));
                    }
                }
                j0Var7.a(fVar);
                return yVar;
            case 9:
                j5 j5Var = (j5) obj3;
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj4, null, null, new d3(j5Var, ((Float) obj).floatValue(), r10, i5), 3, null).invokeOnCompletion(new a3(j5Var, (kotlin.jvm.functions.a) obj2, i6));
                return yVar;
            case 10:
                androidx.compose.foundation.layout.z0 z0Var = (androidx.compose.foundation.layout.z0) obj3;
                androidx.compose.ui.d dVar4 = (androidx.compose.ui.d) obj2;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                long j11 = ((androidx.compose.ui.geometry.e) ((androidx.compose.material3.internal.t0) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fW = h0Var.W(h4.a);
                    androidx.compose.ui.graphics.drawscope.b bVar2 = h0Var.e;
                    float fW2 = h0Var.W(z0Var.a(h0Var.getLayoutDirection()));
                    float fA = dVar4.a(kotlin.math.a.H(fIntBitsToFloat), kotlin.math.a.H((Float.intBitsToFloat((int) (bVar2.d() >> 32)) - fW2) - h0Var.W(z0Var.b(h0Var.getLayoutDirection()))), h0Var.getLayoutDirection()) + fW2;
                    float f2 = 2;
                    float f3 = fIntBitsToFloat / f2;
                    float f4 = fA + f3;
                    float f5 = (f4 - f3) - fW;
                    float f6 = f5 < 0.0f ? 0.0f : f5;
                    float f7 = f4 + f3 + fW;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float f8 = f7 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f7;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                    float f9 = (-fIntBitsToFloat3) / f2;
                    float f10 = fIntBitsToFloat3 / f2;
                    androidx.appcompat.widget.c2 c2Var = bVar2.y;
                    long jG = c2Var.G();
                    c2Var.v().f();
                    try {
                        ((androidx.appcompat.widget.c2) ((com.google.firebase.platforminfo.d) c2Var.y).e).v().o(f6, f9, f8, f10, 0);
                        h0Var.b();
                    } finally {
                        androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
                    }
                } else {
                    h0Var.b();
                }
                return yVar;
            case 11:
                return new j5((kotlin.jvm.functions.a) obj4, (kotlin.jvm.functions.a) obj3, (k5) obj, (kotlin.jvm.functions.l) obj2);
            case 12:
                androidx.activity.compose.f fVar5 = new androidx.activity.compose.f(i3, (CoroutineScope) obj3, (j6) obj2);
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                ((androidx.compose.ui.semantics.a0) obj).b(androidx.compose.ui.semantics.m.c, new androidx.compose.ui.semantics.a((String) obj4, fVar5));
                return yVar;
            case 13:
                androidx.compose.material3.internal.a0 a0Var = (androidx.compose.material3.internal.a0) obj3;
                androidx.compose.ui.layout.d1 d1Var = (androidx.compose.ui.layout.d1) obj2;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                boolean zV = ((androidx.compose.ui.layout.s0) obj4).V();
                androidx.compose.material3.internal.p pVar2 = a0Var.L;
                float fD = zV ? pVar2.d().d(a0Var.L.h.getValue()) : pVar2.f();
                androidx.compose.foundation.gestures.o1 o1Var = a0Var.N;
                float f11 = o1Var == androidx.compose.foundation.gestures.o1.y ? fD : 0.0f;
                float f12 = o1Var == androidx.compose.foundation.gestures.o1.e ? fD : 0.0f;
                c1Var.e = true;
                androidx.compose.ui.layout.c1.i(c1Var, d1Var, kotlin.math.a.H(f11), kotlin.math.a.H(f12));
                c1Var.e = false;
                return yVar;
            case 14:
                return e(obj);
            case 15:
                return f(obj);
            case 16:
                return g(obj);
            case 17:
                androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj4;
                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                qVar2.add(iVar);
                return new androidx.compose.animation.g((androidx.navigation.compose.n) obj2, iVar, qVar2);
            case 18:
                return h(obj);
            case 19:
                return i(obj);
            case 20:
                return j(obj);
            case 21:
                return k(obj);
            case 22:
                return l(obj);
            default:
                return TasksKt.asTask$lambda$0((com.google.android.gms.tasks.a) obj4, (Deferred) obj3, (com.google.android.gms.tasks.j) obj2, (Throwable) obj);
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
