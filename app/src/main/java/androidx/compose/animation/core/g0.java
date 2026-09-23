package androidx.compose.animation.core;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.compose.material3.j5;
import androidx.compose.material3.k5;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.emulator.EmulatorActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    private final Object e(Object obj, Object obj2) {
        Object obj3;
        androidx.compose.ui.graphics.vector.f fVarB;
        boolean z;
        long jD;
        com.app.mlounge.ui.viewmodel.l lVar = (com.app.mlounge.ui.viewmodel.l) this.y;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f = 16;
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.i1.e(oVar, 1.0f), f);
            androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            int iOrdinal = lVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    fVarB = com.google.firebase.crashlytics.internal.model.t1.d;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Inventory2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(20.0f, 2.0f);
                        gVar.r(4.0f);
                        gVar.m(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
                        obj3 = null;
                        gVar.A(3.01f);
                        gVar.m(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
                        gVar.z(20.0f);
                        gVar.n(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
                        gVar.s(14.0f);
                        gVar.n(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar.z(8.7f);
                        gVar.n(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
                        gVar.z(4.0f);
                        gVar.m(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
                        gVar.l();
                        gVar.v(15.0f, 14.0f);
                        gVar.r(9.0f);
                        gVar.A(-2.0f);
                        gVar.s(6.0f);
                        gVar.z(14.0f);
                        gVar.l();
                        gVar.v(20.0f, 7.0f);
                        gVar.r(4.0f);
                        gVar.z(4.0f);
                        gVar.s(16.0f);
                        gVar.z(7.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
                        fVarB = eVar.b();
                        com.google.firebase.crashlytics.internal.model.t1.d = fVarB;
                    }
                } else if (iOrdinal == 2) {
                    fVarB = com.imsdk.a.m();
                } else {
                    if (iOrdinal != 3) {
                        coil3.g.a();
                        return null;
                    }
                    fVarB = coil3.network.g.q();
                }
                obj3 = null;
            } else {
                obj3 = null;
                fVarB = _COROUTINE.b.y;
                if (fVarB == null) {
                    androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.Diamond", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i2 = androidx.compose.ui.graphics.vector.h0.a;
                    long j = androidx.compose.ui.graphics.t.b;
                    androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(j);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new androidx.compose.ui.graphics.vector.o(12.16f, 3.0f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-0.32f, 0.0f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-2.63f, 5.25f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(5.58f, 0.0f));
                    androidx.compose.ui.graphics.vector.k kVar = androidx.compose.ui.graphics.vector.k.c;
                    arrayList.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList, 0, p0Var2);
                    androidx.compose.ui.graphics.p0 p0Var3 = new androidx.compose.ui.graphics.p0(j);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(16.46f, 8.25f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.v(5.16f, 0.0f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.v(-2.62f, -5.25f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.v(-5.16f, 0.0f));
                    arrayList2.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList2, 0, p0Var3);
                    androidx.compose.ui.graphics.p0 p0Var4 = new androidx.compose.ui.graphics.p0(j);
                    ArrayList arrayList3 = new ArrayList(32);
                    arrayList3.add(new androidx.compose.ui.graphics.vector.o(21.38f, 9.75f));
                    arrayList3.add(new androidx.compose.ui.graphics.vector.v(-8.63f, 0.0f));
                    arrayList3.add(new androidx.compose.ui.graphics.vector.v(0.0f, 10.35f));
                    arrayList3.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList3, 0, p0Var4);
                    androidx.compose.ui.graphics.p0 p0Var5 = new androidx.compose.ui.graphics.p0(j);
                    ArrayList arrayList4 = new ArrayList(32);
                    arrayList4.add(new androidx.compose.ui.graphics.vector.o(11.25f, 20.1f));
                    arrayList4.add(new androidx.compose.ui.graphics.vector.v(0.0f, -10.35f));
                    arrayList4.add(new androidx.compose.ui.graphics.vector.v(-8.63f, 0.0f));
                    arrayList4.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList4, 0, p0Var5);
                    androidx.compose.ui.graphics.p0 p0Var6 = new androidx.compose.ui.graphics.p0(j);
                    ArrayList arrayList5 = new ArrayList(32);
                    arrayList5.add(new androidx.compose.ui.graphics.vector.o(7.54f, 8.25f));
                    arrayList5.add(new androidx.compose.ui.graphics.vector.v(2.62f, -5.25f));
                    arrayList5.add(new androidx.compose.ui.graphics.vector.v(-5.16f, 0.0f));
                    arrayList5.add(new androidx.compose.ui.graphics.vector.v(-2.62f, 5.25f));
                    arrayList5.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar2, arrayList5, 0, p0Var6);
                    fVarB = eVar2.b();
                    _COROUTINE.b.y = fVarB;
                }
            }
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 != 0) {
                z = true;
                if (iOrdinal2 == 1) {
                    jD = com.app.mlounge.ui.theme.b.f;
                } else if (iOrdinal2 == 2) {
                    jD = androidx.compose.ui.graphics.a0.d(4292886779L);
                } else {
                    if (iOrdinal2 != 3) {
                        coil3.g.a();
                        return obj3;
                    }
                    jD = androidx.compose.ui.graphics.a0.d(4278238420L);
                }
            } else {
                z = true;
                jD = androidx.compose.ui.graphics.a0.d(4294944550L);
            }
            androidx.compose.material3.q1.b(fVarB, null, androidx.compose.foundation.layout.i1.m(oVar, 24), jD, sVar, 432, 0);
            androidx.compose.foundation.layout.b.e(sVar, androidx.compose.foundation.layout.i1.q(oVar, f));
            boolean z2 = z;
            z5.b(lVar.e, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).j, sVar, 384, 0, 131066);
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.foundation.layout.b.e(sVar, new androidx.compose.foundation.layout.t0(1.0f, z2));
            androidx.compose.material3.q1.b(okhttp3.internal.platform.android.g.n(), "Play", androidx.compose.foundation.layout.i1.m(oVar, 20), com.app.mlounge.ui.theme.b.f, sVar, 3504, 0);
            sVar.p(z2);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:311:0x0975  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        char c;
        Object objO;
        boolean zG;
        char c2 = 7;
        long j = -9187201950435737472L;
        CancellableContinuation cancellableContinuationY = null;
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                ((k0) this.y).a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj);
                return kotlin.y.a;
            case 1:
                androidx.compose.foundation.gestures.k2 k2Var = (androidx.compose.foundation.gestures.k2) this.y;
                BuildersKt__Builders_commonKt.launch$default(k2Var.A0(), null, null, new androidx.compose.foundation.gestures.j2(k2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3, null);
                return Boolean.TRUE;
            case 2:
                return new androidx.compose.ui.unit.j((((long) 0) << 32) | (((long) ((androidx.compose.ui.i) this.y).a(0, (int) (((androidx.compose.ui.unit.l) obj).a & 4294967295L))) & 4294967295L));
            case 3:
                return new androidx.compose.ui.unit.j(((androidx.compose.ui.j) this.y).a(0L, ((androidx.compose.ui.unit.l) obj).a, (androidx.compose.ui.unit.m) obj2));
            case 4:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.n0.g((androidx.compose.foundation.text.selection.b1) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                return kotlin.y.a;
            case 5:
                ((androidx.compose.foundation.text.x0) this.y).e(((androidx.compose.ui.geometry.b) obj2).a);
                return kotlin.y.a;
            case 6:
                androidx.compose.foundation.text.contextmenu.data.d dVar = (androidx.compose.foundation.text.contextmenu.data.d) this.y;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                ((Integer) obj2).getClass();
                sVar.b0(666084174);
                String str = dVar.b;
                sVar.p(false);
                return str;
            case 7:
                ((Integer) obj2).getClass();
                return androidx.compose.foundation.text.contextmenu.internal.v.a((TextClassification) this.y, (androidx.compose.runtime.s) obj);
            case 8:
                ((Integer) obj2).getClass();
                return androidx.compose.foundation.text.contextmenu.internal.v.c((RemoteAction) this.y, (androidx.compose.runtime.s) obj);
            case 9:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.y;
                ((androidx.compose.ui.input.pointer.v) obj).a();
                yVar.e = ((androidx.compose.ui.geometry.b) obj2).a;
                return kotlin.y.a;
            case 10:
                ((Integer) obj2).getClass();
                ((androidx.compose.material3.q2) this.y).a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj);
                return kotlin.y.a;
            case 11:
                k5 k5Var = k5.z;
                k5 k5Var2 = k5.y;
                j5 j5Var = (j5) this.y;
                androidx.compose.ui.unit.l lVar = (androidx.compose.ui.unit.l) obj;
                float fG = androidx.compose.ui.unit.a.g(((androidx.compose.ui.unit.a) obj2).a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                k5 k5Var3 = k5.e;
                linkedHashMap.put(k5Var3, Float.valueOf(fG));
                if (((int) (lVar.a & 4294967295L)) > fG / 2) {
                    linkedHashMap.put(k5Var, Float.valueOf(fG / 2.0f));
                }
                int i = (int) (lVar.a & 4294967295L);
                if (i != 0) {
                    linkedHashMap.put(k5Var2, Float.valueOf(Math.max(0.0f, fG - i)));
                }
                androidx.compose.material3.internal.h0 h0Var = new androidx.compose.material3.internal.h0(linkedHashMap);
                int iOrdinal = ((k5) j5Var.c.h.getValue()).ordinal();
                if (iOrdinal == 0) {
                    k5Var2 = k5Var3;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    if (!linkedHashMap.containsKey(k5Var)) {
                        k5Var = linkedHashMap.containsKey(k5Var2) ? k5Var2 : k5Var3;
                    }
                    k5Var2 = k5Var;
                } else if (!linkedHashMap.containsKey(k5Var2)) {
                    k5Var2 = k5Var3;
                }
                return new kotlin.k(h0Var, k5Var2);
            case 12:
                androidx.compose.runtime.internal.l lVar2 = (androidx.compose.runtime.internal.l) this.y;
                ((Integer) obj).getClass();
                if (obj2 instanceof androidx.compose.runtime.i) {
                    androidx.compose.runtime.i iVar = (androidx.compose.runtime.i) obj2;
                    androidx.collection.p0 p0Var = lVar2.h;
                    if (p0Var == null) {
                        androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
                        p0Var = new androidx.collection.p0();
                        lVar2.h = p0Var;
                    }
                    p0Var.k(iVar);
                    lVar2.f.b(iVar);
                }
                if (obj2 instanceof androidx.compose.runtime.c2) {
                    lVar2.e((androidx.compose.runtime.c2) obj2);
                }
                if (obj2 instanceof androidx.compose.runtime.s1) {
                    ((androidx.compose.runtime.s1) obj2).c();
                }
                return kotlin.y.a;
            case 13:
                androidx.compose.runtime.y1 y1Var = (androidx.compose.runtime.y1) this.y;
                Set set = (Set) obj;
                synchronized (y1Var.c) {
                    try {
                        if (((androidx.compose.runtime.u1) y1Var.u.getValue()).compareTo(androidx.compose.runtime.u1.B) >= 0) {
                            androidx.collection.p0 p0Var3 = y1Var.h;
                            if (set instanceof androidx.compose.runtime.collection.d) {
                                androidx.collection.p0 p0Var4 = ((androidx.compose.runtime.collection.d) set).e;
                                Object[] objArr = p0Var4.b;
                                long[] jArr = p0Var4.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j2 = jArr[i2];
                                        if ((((~j2) << 7) & j2 & j) != j) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj3 = objArr[(i2 << 3) + i4];
                                                    if (!(obj3 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj3).e(1)) {
                                                        p0Var3.a(obj3);
                                                    }
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i3 == 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                            j = -9187201950435737472L;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj4).e(1)) {
                                        p0Var3.a(obj4);
                                    }
                                }
                            }
                            cancellableContinuationY = y1Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (cancellableContinuationY != null) {
                    cancellableContinuationY.resumeWith(kotlin.y.a);
                }
                return kotlin.y.a;
            case 14:
                Channel channel = (Channel) this.y;
                Set set2 = (Set) obj;
                if (set2 instanceof androidx.compose.runtime.collection.d) {
                    androidx.collection.p0 p0Var5 = ((androidx.compose.runtime.collection.d) set2).e;
                    Object[] objArr2 = p0Var5.b;
                    long[] jArr2 = p0Var5.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j3 = jArr2[i5];
                            if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < i6) {
                                        if ((j3 & 255) < 128) {
                                            Object obj5 = objArr2[(i5 << 3) + i7];
                                            if (!(obj5 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj5).e(4)) {
                                            }
                                        }
                                        j3 >>= 8;
                                        i7++;
                                        c2 = c2;
                                    } else {
                                        c = c2;
                                        if (i6 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c = c2;
                            }
                            if (i5 != length2) {
                                i5++;
                                c2 = c;
                            }
                        }
                        channel.mo28trySendJP2dKIU(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof androidx.compose.runtime.snapshots.x) || ((androidx.compose.runtime.snapshots.x) obj6).e(4)) {
                                channel.mo28trySendJP2dKIU(set2);
                            }
                        }
                    }
                }
                return kotlin.y.a;
            case 15:
                androidx.compose.runtime.snapshots.t tVar = (androidx.compose.runtime.snapshots.t) this.y;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = tVar.b;
                while (true) {
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        objO = set4;
                    } else if (obj7 instanceof Set) {
                        objO = kotlin.collections.q.k(obj7, set4);
                    } else {
                        if (!(obj7 instanceof List)) {
                            androidx.compose.runtime.u.b("Unexpected notification");
                            com.google.firebase.platforminfo.b.b();
                            return null;
                        }
                        objO = kotlin.collections.p.O((Collection) obj7, kotlin.collections.q.j(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj7, objO)) {
                            if (tVar.c()) {
                                tVar.a.invoke(new androidx.activity.w(tVar, 23));
                            }
                            return kotlin.y.a;
                        }
                    } while (atomicReference.get() == obj7);
                }
                break;
            case 16:
                androidx.compose.ui.graphics.a aVar = (androidx.compose.ui.graphics.a) this.y;
                androidx.compose.ui.geometry.c cVarA = androidx.compose.ui.graphics.a0.A((RectF) obj);
                androidx.compose.ui.geometry.c cVarA2 = androidx.compose.ui.graphics.a0.A((RectF) obj2);
                switch (aVar.a) {
                    case 26:
                        zG = cVarA.g(cVarA2);
                        break;
                    default:
                        zG = cVarA2.a(cVarA.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 17:
                ((Integer) obj2).getClass();
                com.google.android.gms.dynamite.g.b((androidx.navigation.compose.n) this.y, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                return kotlin.y.a;
            case 18:
                return EmulatorActivity.onCreate$lambda$3((EmulatorActivity) this.y, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            case 19:
                com.app.mlounge.ui.components.y0 y0Var = (com.app.mlounge.ui.components.y0) this.y;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(androidx.compose.foundation.layout.b.q(androidx.compose.ui.o.b, 12), androidx.compose.foundation.s.p(sVar2), true);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
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
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    z5.b(y0Var.b, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).l, sVar2, 0, 0, 131066);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 20:
                Double d = (Double) this.y;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d}, 1)), androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 6, 2), androidx.compose.ui.graphics.t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(n6.a)).o, sVar3, 432, 0, 131064);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
            case 21:
                com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) this.y;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z5.b(wVar.b, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, sVar4, 0, 24960, 241662);
                } else {
                    sVar4.W();
                }
                return kotlin.y.a;
            case 22:
                com.app.mlounge.data.local.entity.a aVar2 = (com.app.mlounge.data.local.entity.a) this.y;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z5.b(androidx.privacysandbox.ads.adservices.java.internal.a.r("Are you sure you want to delete '", aVar2.d, "'? This will also remove the file from storage."), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 384, 0, 262138);
                } else {
                    sVar5.W();
                }
                return kotlin.y.a;
            case 23:
                SportsMatch sportsMatch = (SportsMatch) this.y;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    float f = 12;
                    androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar, f);
                    androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar6, 48);
                    int iHashCode2 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar6.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar6, rVarQ2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar6, f1VarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar6, jVarL2, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar6, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar6, dVar2);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar6, rVarC2, eVar4);
                    if (sportsMatch.d() != null) {
                        sVar6.b0(1357533649);
                        coil3.compose.k.a(androidx.compose.runtime.j.i("https://streamed.pk", sportsMatch.d()), sportsMatch.g(), androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.i1.g(androidx.compose.foundation.layout.i1.q(oVar, 120), 80), androidx.compose.foundation.shape.e.a(6)), null, androidx.compose.ui.layout.i.b, sVar6, 1572864, 1976);
                        sVar6.p(false);
                    } else {
                        sVar6.b0(1357933890);
                        androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.i1.g(androidx.compose.foundation.layout.i1.q(oVar, 120), 80), androidx.compose.foundation.shape.e.a(6)), com.app.mlounge.ui.theme.b.c, androidx.compose.ui.graphics.a0.b);
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode3 = Long.hashCode(sVar6.T);
                        androidx.compose.runtime.internal.j jVarL3 = sVar6.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar6, rVarF);
                        sVar6.e0();
                        if (sVar6.S) {
                            fVar2 = fVar2;
                            sVar6.k(fVar2);
                        } else {
                            fVar2 = fVar2;
                            sVar6.o0();
                        }
                        androidx.compose.runtime.t.x(sVar6, q0VarD, eVar);
                        androidx.compose.runtime.t.x(sVar6, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar6, eVar3, sVar6, dVar2);
                        androidx.compose.runtime.t.x(sVar6, rVarC3, eVar4);
                        androidx.compose.material3.q1.b(_COROUTINE.a.O(), null, androidx.compose.foundation.layout.i1.m(oVar, 32), com.app.mlounge.ui.theme.b.m, sVar6, 432, 0);
                        sVar6.p(true);
                        sVar6.p(false);
                    }
                    androidx.compose.foundation.layout.b.e(sVar6, androidx.compose.foundation.layout.i1.q(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.t0 t0Var = new androidx.compose.foundation.layout.t0(1.0f, true);
                    androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar6, 0);
                    int iHashCode4 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar6.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar6, t0Var);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.o0();
                    }
                    androidx.compose.runtime.t.x(sVar6, wVarA2, eVar);
                    androidx.compose.runtime.t.x(sVar6, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar6, eVar3, sVar6, dVar2);
                    androidx.compose.runtime.t.x(sVar6, rVarC4, eVar4);
                    String strG = sportsMatch.g();
                    if (strG == null) {
                        strG = "Unknown Match";
                    }
                    String str2 = strG;
                    x2 x2Var = n6.a;
                    z5.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((m6) sVar6.j(x2Var)).m, sVar6, 0, 24960, 110586);
                    if (sportsMatch.h() != null) {
                        sVar6.b0(1088357153);
                        z5.b(sportsMatch.h(), null, com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar6.j(x2Var)).l, sVar6, 0, 24960, 110586);
                        sVar6.p(false);
                    } else {
                        sVar6.b0(1088649855);
                        sVar6.p(false);
                    }
                    if (sportsMatch.b() != null) {
                        sVar6.b0(1088721775);
                        String str3 = new SimpleDateFormat("MMM d, h:mm a", Locale.getDefault()).format(new Date(sportsMatch.b().longValue()));
                        str3.getClass();
                        z5.b(str3, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar6.j(x2Var)).o, sVar6, 0, 24960, 110586);
                        sVar6.p(false);
                    } else {
                        sVar6.b0(1089031775);
                        sVar6.p(false);
                    }
                    androidx.compose.foundation.layout.f1 f1VarA2 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, sVar6, 6);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.internal.j jVarL5 = sVar6.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar6, oVar);
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.o0();
                    }
                    androidx.compose.runtime.t.x(sVar6, f1VarA2, eVar);
                    androidx.compose.runtime.t.x(sVar6, jVarL5, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar6, eVar3, sVar6, dVar2);
                    androidx.compose.runtime.t.x(sVar6, rVarC5, eVar4);
                    if (sportsMatch.e() != null) {
                        sVar6.b0(694852496);
                        z5.b(sportsMatch.e(), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((m6) sVar6.j(x2Var)).o, sVar6, 0, 24576, 114682);
                        sVar6.p(false);
                    } else {
                        sVar6.b0(695107843);
                        sVar6.p(false);
                    }
                    androidx.room.b0.g(sVar6, true, true, true);
                } else {
                    sVar6.W();
                }
                return kotlin.y.a;
            case 24:
                androidx.compose.ui.graphics.vector.f fVar3 = (androidx.compose.ui.graphics.vector.f) this.y;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    androidx.compose.material3.q1.b(fVar3, null, null, androidx.compose.ui.graphics.t.d, sVar7, 3120, 4);
                } else {
                    sVar7.W();
                }
                return kotlin.y.a;
            case 25:
                kotlin.k kVar = (kotlin.k) this.y;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    z5.b("To save downloads to '" + kVar.y + "', Android requires you to use the system file manager to choose a folder. Please select the folder you wish to use in the next screen and then click 'Use this folder'.", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 0, 0, 262138);
                } else {
                    sVar8.W();
                }
                return kotlin.y.a;
            case 26:
                return e(obj, obj2);
            case 27:
                com.app.mlounge.ui.viewmodel.w1 w1Var = (com.app.mlounge.ui.viewmodel.w1) this.y;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zH = sVar9.h(w1Var);
                    Object objQ = sVar9.Q();
                    if (zH || objQ == androidx.compose.runtime.n.a) {
                        objQ = new com.app.mlounge.ui.screens.sources.c(w1Var, false ? 1 : 0);
                        sVar9.l0(objQ);
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ, null, false, null, null, null, null, com.app.mlounge.ui.screens.sources.a.a, sVar9, 805306368, 510);
                } else {
                    sVar9.W();
                }
                return kotlin.y.a;
            case 28:
                com.app.mlounge.ui.viewmodel.c2 c2Var = (com.app.mlounge.ui.viewmodel.c2) this.y;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (sVar10.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar2, 12, 8);
                    androidx.compose.foundation.layout.f1 f1VarA3 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, sVar10, 54);
                    int iHashCode6 = Long.hashCode(sVar10.T);
                    androidx.compose.runtime.internal.j jVarL6 = sVar10.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar10, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(fVar4);
                    } else {
                        sVar10.o0();
                    }
                    androidx.compose.runtime.t.x(sVar10, f1VarA3, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar10, jVarL6, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar10, Integer.valueOf(iHashCode6), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar10, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar10, rVarC6, androidx.compose.ui.node.g.d);
                    androidx.compose.ui.graphics.vector.f fVarN = _COROUTINE.a.N();
                    float f2 = 16;
                    androidx.compose.ui.r rVarM = androidx.compose.foundation.layout.i1.m(oVar2, f2);
                    long j4 = com.app.mlounge.ui.theme.b.f;
                    androidx.compose.material3.q1.b(fVarN, null, rVarM, j4, sVar10, 3504, 0);
                    z5.b(c2Var.e, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar10.j(n6.a)).n, sVar10, 384, 0, 131066);
                    androidx.compose.material3.q1.b(okhttp3.internal.platform.android.g.i(), null, androidx.compose.foundation.layout.i1.m(oVar2, f2), j4, sVar10, 3504, 0);
                    sVar10.p(true);
                } else {
                    sVar10.W();
                }
                return kotlin.y.a;
            default:
                char[] cArr = (char[]) this.y;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int I = kotlin.text.k.I(charSequence, cArr, iIntValue10, false);
                if (I < 0) {
                    return null;
                }
                return new kotlin.k(Integer.valueOf(I), 1);
        }
    }

    public /* synthetic */ g0(Object obj, int i, int i2) {
        this.e = i2;
        this.y = obj;
    }
}
