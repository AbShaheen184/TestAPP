package androidx.compose.material3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.net.Uri;
import androidx.compose.animation.core.a2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.material3.v5;
import androidx.compose.material3.x5;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.y1;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r0(androidx.compose.runtime.a1 a1Var, kotlin.jvm.functions.p pVar) {
        this.e = 27;
        this.z = a1Var;
        this.y = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.compose.ui.graphics.n0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.functions.s] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        androidx.lifecycle.p lifecycle;
        Object value;
        com.app.mlounge.ui.screens.player.p0 p0Var;
        int i = 9;
        int i2 = 2;
        int i3 = 3;
        ?? r6 = 0;
        int i4 = 0;
        int i5 = 1;
        switch (this.e) {
            case 0:
                w2 w2Var = (w2) this.y;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.z;
                androidx.compose.ui.geometry.e eVar = (androidx.compose.ui.geometry.e) obj;
                float fFloatValue = ((Number) w2Var.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) a1Var.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) a1Var.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    a1Var.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj;
                return dVar.b(new androidx.compose.animation.e(new r0(i2, ((androidx.compose.ui.graphics.n0) this.y).a(dVar.e.d(), dVar.e.getLayoutDirection(), dVar), (v5) this.z), i3));
            case 2:
                androidx.compose.ui.graphics.a0.k((androidx.compose.ui.graphics.drawscope.d) obj, (androidx.compose.ui.graphics.a0) this.y, ((v5) this.z).a());
                return kotlin.y.a;
            case 3:
                androidx.compose.runtime.z zVar = (androidx.compose.runtime.z) this.y;
                androidx.collection.p0 p0Var2 = (androidx.collection.p0) this.z;
                zVar.A(obj);
                if (p0Var2 != null) {
                    p0Var2.a(obj);
                }
                return kotlin.y.a;
            case 4:
                y1 y1Var = (y1) this.y;
                Throwable th = (Throwable) this.z;
                Throwable th2 = (Throwable) obj;
                synchronized (y1Var.c) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                Throwable th3 = th2 instanceof CancellationException ? null : th2;
                                if (th3 != null) {
                                    kotlin.a.a(th, th3);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        r6 = th;
                    }
                    y1Var.e = r6;
                    y1Var.u.setValue(u1.e);
                }
                return kotlin.y.a;
            case 5:
                File file = (File) this.y;
                ProducerScope producerScope = (ProducerScope) this.z;
                kotlin.y yVar = kotlin.y.a;
                if (kotlin.jvm.internal.l.a((String) obj, file.getName())) {
                    ChannelsKt.trySendBlocking(producerScope, yVar);
                }
                return yVar;
            case 6:
                androidx.navigation.t tVar = (androidx.navigation.t) this.y;
                androidx.navigation.internal.f fVar = ((androidx.navigation.y) this.z).b;
                androidx.navigation.c0 c0Var = (androidx.navigation.c0) obj;
                c0Var.getClass();
                androidx.navigation.a0 a0Var = c0Var.a;
                a0Var.e = 0;
                a0Var.f = 0;
                if (tVar instanceof androidx.navigation.v) {
                    int i6 = androidx.navigation.t.B;
                    for (androidx.navigation.t tVar2 : androidx.navigation.f.b(tVar)) {
                        androidx.navigation.t tVarG = fVar.g();
                        if (kotlin.jvm.internal.l.a(tVar2, tVarG != null ? tVarG.z : null)) {
                        }
                    }
                    int i7 = androidx.navigation.v.D;
                    Iterator it = kotlin.sequences.k.L(fVar.h(), new androidx.compose.ui.text.y(25)).iterator();
                    if (!it.hasNext()) {
                        androidx.transition.k.m("Sequence is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    c0Var.d = ((androidx.navigation.t) next).y.a;
                    c0Var.f = false;
                    c0Var.g = true;
                }
                return kotlin.y.a;
            case 7:
                return new androidx.activity.compose.k(12, (w2) this.y, (androidx.navigation.compose.i) this.z);
            case 8:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.y;
                androidx.lifecycle.v vVar = (androidx.lifecycle.v) this.z;
                yVar2.getClass();
                vVar.getClass();
                androidx.navigation.internal.f fVar2 = yVar2.b;
                androidx.navigation.internal.d dVar2 = fVar2.s;
                if (!vVar.equals(fVar2.o)) {
                    androidx.lifecycle.v vVar2 = fVar2.o;
                    if (vVar2 != null && (lifecycle = vVar2.getLifecycle()) != null) {
                        lifecycle.b(dVar2);
                    }
                    fVar2.o = vVar;
                    vVar.getLifecycle().a(dVar2);
                }
                return new androidx.navigation.compose.v();
            case 9:
                Job.DefaultImpls.cancel$default((Job) this.y, (CancellationException) null, 1, (Object) null);
                ((ProducerScope) this.z).mo28trySendJP2dKIU((androidx.work.impl.constraints.c) obj);
                return kotlin.y.a;
            case 10:
                androidx.work.impl.model.c cVar = (androidx.work.impl.model.c) this.y;
                androidx.work.impl.model.a aVar = (androidx.work.impl.model.a) this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                cVar.b.v(aVar2, aVar);
                return kotlin.y.a;
            case 11:
                androidx.work.impl.model.e eVar2 = (androidx.work.impl.model.e) this.y;
                androidx.work.impl.model.d dVar3 = (androidx.work.impl.model.d) this.z;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                eVar2.b.v(aVar3, dVar3);
                return kotlin.y.a;
            case 12:
                androidx.work.impl.model.i iVar = (androidx.work.impl.model.i) this.y;
                androidx.work.impl.model.g gVar = (androidx.work.impl.model.g) this.z;
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                iVar.b.v(aVar4, gVar);
                return kotlin.y.a;
            case 13:
                androidx.work.impl.model.l lVar = (androidx.work.impl.model.l) this.y;
                androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) this.z;
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                lVar.b.v(aVar5, kVar);
                return kotlin.y.a;
            case 14:
                androidx.work.impl.model.n nVar = (androidx.work.impl.model.n) this.y;
                androidx.work.impl.model.m mVar = (androidx.work.impl.model.m) this.z;
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                nVar.b.v(aVar6, mVar);
                return kotlin.y.a;
            case 15:
                androidx.work.i0 i0Var = (androidx.work.i0) this.y;
                String str = (String) this.z;
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                androidx.sqlite.c cVarU = aVar7.U("UPDATE workspec SET state=? WHERE id=?");
                try {
                    cVarU.f(1, com.google.android.gms.dynamite.g.P(i0Var));
                    cVarU.s(2, str);
                    cVarU.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar7));
                } finally {
                    cVarU.close();
                }
            case 16:
                androidx.work.i iVar2 = (androidx.work.i) this.y;
                String str2 = (String) this.z;
                androidx.sqlite.a aVar8 = (androidx.sqlite.a) obj;
                aVar8.getClass();
                androidx.sqlite.c cVarU2 = aVar8.U("UPDATE workspec SET output=? WHERE id=?");
                try {
                    androidx.work.i iVar3 = androidx.work.i.b;
                    cVarU2.h(android.support.v4.media.session.b.G(iVar2), 1);
                    cVarU2.s(2, str2);
                    cVarU2.Q();
                    return kotlin.y.a;
                } finally {
                    cVarU2.close();
                }
            case 17:
                androidx.work.impl.model.v vVar3 = (androidx.work.impl.model.v) this.y;
                androidx.work.impl.model.u uVar = (androidx.work.impl.model.u) this.z;
                androidx.sqlite.a aVar9 = (androidx.sqlite.a) obj;
                aVar9.getClass();
                vVar3.b.v(aVar9, uVar);
                return kotlin.y.a;
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) this.y;
                MainActivity mainActivity = (MainActivity) this.z;
                ((Boolean) obj).getClass();
                int i8 = MainActivity.G;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("consent_asked", true);
                editorEdit.apply();
                mainActivity.B.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 19:
                com.app.mlounge.data.local.dao.f fVar3 = (com.app.mlounge.data.local.dao.f) this.y;
                com.app.mlounge.data.local.entity.b bVar = (com.app.mlounge.data.local.entity.b) this.z;
                androidx.sqlite.a aVar10 = (androidx.sqlite.a) obj;
                aVar10.getClass();
                fVar3.b.v(aVar10, bVar);
                return kotlin.y.a;
            case 20:
                com.app.mlounge.data.local.dao.h hVar = (com.app.mlounge.data.local.dao.h) this.y;
                List list = (List) this.z;
                androidx.sqlite.a aVar11 = (androidx.sqlite.a) obj;
                aVar11.getClass();
                hVar.b.u(aVar11, list);
                return kotlin.y.a;
            case 21:
                com.app.mlounge.data.local.dao.h hVar2 = (com.app.mlounge.data.local.dao.h) this.y;
                com.app.mlounge.data.local.entity.c cVar2 = (com.app.mlounge.data.local.entity.c) this.z;
                androidx.sqlite.a aVar12 = (androidx.sqlite.a) obj;
                aVar12.getClass();
                hVar2.b.v(aVar12, cVar2);
                return kotlin.y.a;
            case 22:
                com.app.mlounge.data.local.dao.j jVar = (com.app.mlounge.data.local.dao.j) this.y;
                List list2 = (List) this.z;
                androidx.sqlite.a aVar13 = (androidx.sqlite.a) obj;
                aVar13.getClass();
                jVar.b.u(aVar13, list2);
                return kotlin.y.a;
            case 23:
                com.app.mlounge.data.local.dao.k kVar2 = (com.app.mlounge.data.local.dao.k) this.y;
                com.app.mlounge.data.local.entity.e eVar3 = (com.app.mlounge.data.local.entity.e) this.z;
                androidx.sqlite.a aVar14 = (androidx.sqlite.a) obj;
                aVar14.getClass();
                androidx.localbroadcastmanager.content.b bVar2 = kVar2.b;
                bVar2.getClass();
                try {
                    ((androidx.work.impl.model.b) bVar2.y).v(aVar14, eVar3);
                    break;
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        throw e;
                    }
                    if (!kotlin.text.k.z(message, "unique", true) && !kotlin.text.k.z(message, "2067", false) && !kotlin.text.k.z(message, "1555", false)) {
                        throw e;
                    }
                    ((androidx.work.impl.model.s) bVar2.z).D(aVar14, eVar3);
                }
                return kotlin.y.a;
            case 24:
                com.app.mlounge.data.local.dao.m mVar2 = (com.app.mlounge.data.local.dao.m) this.y;
                List list3 = (List) this.z;
                androidx.sqlite.a aVar15 = (androidx.sqlite.a) obj;
                aVar15.getClass();
                mVar2.b.u(aVar15, list3);
                return kotlin.y.a;
            case 25:
                com.app.mlounge.data.local.dao.m mVar3 = (com.app.mlounge.data.local.dao.m) this.y;
                com.app.mlounge.data.local.entity.f fVar4 = (com.app.mlounge.data.local.entity.f) this.z;
                androidx.sqlite.a aVar16 = (androidx.sqlite.a) obj;
                aVar16.getClass();
                mVar3.b.v(aVar16, fVar4);
                return kotlin.y.a;
            case 26:
                ArrayList arrayList = (ArrayList) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                androidx.compose.foundation.lazy.j jVar2 = (androidx.compose.foundation.lazy.j) obj;
                jVar2.getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((HiAnimeItem) obj2).b())) {
                        arrayList2.add(obj2);
                    }
                }
                List listX = kotlin.collections.p.X(15, arrayList2);
                jVar2.q(listX.size(), new androidx.compose.foundation.text.c0(i, new com.app.mlounge.ui.components.c0(i3), listX), new com.app.mlounge.ui.components.u0(3, listX), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.adult.g(listX, lVar2, i5)));
                return kotlin.y.a;
            case 27:
                androidx.compose.runtime.a1 a1Var2 = (androidx.compose.runtime.a1) this.z;
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                androidx.compose.foundation.lazy.grid.h hVar3 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar3.getClass();
                hVar3.q(((List) a1Var2.getValue()).size(), new m2(a1Var2, i), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(true, -1388308873, new com.app.mlounge.ui.u(i5, pVar, a1Var2)));
                return kotlin.y.a;
            case 28:
                com.app.mlounge.ui.viewmodel.a0 a0Var2 = (com.app.mlounge.ui.viewmodel.a0) this.y;
                ?? r8 = (kotlin.jvm.functions.s) this.z;
                IptvChannel iptvChannel = (IptvChannel) obj;
                iptvChannel.getClass();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var2), null, null, new com.app.mlounge.ui.viewmodel.u(a0Var2, iptvChannel, r6, i4), 3, null);
                String strF = iptvChannel.f();
                String strC = iptvChannel.c();
                String strF2 = iptvChannel.f();
                r8.d(strF, strC, null, null, kotlin.text.r.u(strF2, "ntv://", false) ? strF2 : null);
                return kotlin.y.a;
            default:
                Context context = (Context) this.y;
                com.app.mlounge.ui.screens.player.a1 a1Var3 = (com.app.mlounge.ui.screens.player.a1) this.z;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(uri, 1);
                        break;
                    } catch (Exception unused) {
                    }
                    String string = uri.toString();
                    string.getClass();
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "Custom Subtitle";
                    }
                    com.app.mlounge.ui.screens.player.c1 c1Var = new com.app.mlounge.ui.screens.player.c1(lastPathSegment, string, "en", false, 0, 0, null, 496);
                    MutableStateFlow mutableStateFlow = a1Var3.g;
                    do {
                        value = mutableStateFlow.getValue();
                        p0Var = (com.app.mlounge.ui.screens.player.p0) value;
                    } while (!mutableStateFlow.compareAndSet(value, com.app.mlounge.ui.screens.player.p0.a(p0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, kotlin.collections.p.N(p0Var.m, c1Var), null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -4097, 7)));
                    a1Var3.i(c1Var);
                    a1Var3.k("subtitle", false);
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ r0(x5 x5Var, a2 a2Var, androidx.compose.runtime.a1 a1Var) {
        this.e = 0;
        this.y = a2Var;
        this.z = a1Var;
    }

    public /* synthetic */ r0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
