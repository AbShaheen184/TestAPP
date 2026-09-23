package androidx.compose.animation.core;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.material3.s3;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.ui.viewmodel.j1;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i0(View view, androidx.compose.runtime.a1 a1Var, Map map, com.app.mlounge.ui.viewmodel.p1 p1Var) {
        this.e = 13;
        this.A = view;
        this.z = a1Var;
        this.y = map;
        this.B = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x050f  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.z;
                k0 k0Var = (k0) this.A;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.B;
                long jLongValue = ((Long) obj).longValue();
                w2 w2Var = (w2) a1Var.getValue();
                long jLongValue2 = w2Var != null ? ((Number) w2Var.getValue()).longValue() : jLongValue;
                long j = k0Var.c;
                androidx.compose.runtime.collection.b bVar = k0Var.a;
                if (j == Long.MIN_VALUE || wVar.e != e.j(coroutineScope.getCoroutineContext())) {
                    k0Var.c = jLongValue;
                    Object[] objArr = bVar.e;
                    int i = bVar.z;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((h0) objArr[i2]).C = true;
                    }
                    wVar.e = e.j(coroutineScope.getCoroutineContext());
                }
                float f = wVar.e;
                if (f == 0.0f) {
                    Object[] objArr2 = bVar.e;
                    int i3 = bVar.z;
                    for (int i4 = 0; i4 < i3; i4++) {
                        h0 h0Var = (h0) objArr2[i4];
                        h0Var.z.setValue(h0Var.A.c);
                        h0Var.C = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - k0Var.c) / f);
                    Object[] objArr3 = bVar.e;
                    int i5 = bVar.z;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        h0 h0Var2 = (h0) objArr3[i6];
                        if (!h0Var2.B) {
                            h0Var2.E.b.setValue(Boolean.FALSE);
                            if (h0Var2.C) {
                                h0Var2.C = false;
                                h0Var2.D = j2;
                            }
                            long j3 = j2 - h0Var2.D;
                            h0Var2.z.setValue(h0Var2.A.f(j3));
                            h0Var2.B = h0Var2.A.e(j3);
                        }
                        if (!h0Var2.B) {
                            z = false;
                        }
                    }
                    k0Var.d.setValue(Boolean.valueOf(!z));
                }
                return kotlin.y.a;
            case 1:
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.y;
                androidx.compose.foundation.gestures.o2 o2Var = (androidx.compose.foundation.gestures.o2) this.z;
                kotlin.jvm.internal.w wVar3 = (kotlin.jvm.internal.w) this.A;
                androidx.compose.foundation.gestures.l lVar = (androidx.compose.foundation.gestures.l) this.B;
                l lVar2 = (l) obj;
                float fFloatValue = ((Number) lVar2.e.getValue()).floatValue() - wVar2.e;
                float fA = o2Var.a(fFloatValue);
                wVar2.e = ((Number) lVar2.e.getValue()).floatValue();
                wVar3.e = ((Number) lVar2.a.b.invoke(lVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    lVar2.i.setValue(Boolean.FALSE);
                    lVar2.d.invoke();
                }
                lVar.getClass();
                return kotlin.y.a;
            case 2:
                kotlin.jvm.internal.w wVar4 = (kotlin.jvm.internal.w) this.y;
                androidx.compose.foundation.gestures.n1 n1Var = (androidx.compose.foundation.gestures.n1) this.z;
                androidx.compose.foundation.gestures.q2 q2Var = (androidx.compose.foundation.gestures.q2) this.A;
                androidx.activity.compose.c cVar = (androidx.activity.compose.c) this.B;
                l lVar3 = (l) obj;
                androidx.compose.runtime.j1 j1Var = lVar3.e;
                kotlin.jvm.functions.a aVar = lVar3.d;
                androidx.compose.runtime.j1 j1Var2 = lVar3.i;
                float fFloatValue2 = ((Number) j1Var.getValue()).floatValue() - wVar4.e;
                if (androidx.compose.foundation.gestures.f1.a(fFloatValue2)) {
                    if (((Boolean) cVar.invoke(Float.valueOf(wVar4.e))).booleanValue()) {
                        j1Var2.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else if (androidx.compose.foundation.gestures.f1.a(fFloatValue2 - n1Var.c(q2Var, fFloatValue2))) {
                    wVar4.e += fFloatValue2;
                    if (((Boolean) cVar.invoke(Float.valueOf(wVar4.e))).booleanValue()) {
                        j1Var2.setValue(Boolean.FALSE);
                        aVar.invoke();
                    }
                } else {
                    j1Var2.setValue(Boolean.FALSE);
                    aVar.invoke();
                }
                return kotlin.y.a;
            case 3:
                List list = (List) this.z;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.A;
                List list2 = (List) this.y;
                androidx.compose.foundation.lazy.grid.n nVar = (androidx.compose.foundation.lazy.grid.n) this.B;
                androidx.compose.foundation.lazy.layout.a1 a1Var2 = (androidx.compose.foundation.lazy.layout.a1) obj;
                androidx.compose.ui.layout.k1 k1Var = a1Var2.e;
                int iA = k1Var != null ? k1Var.a() : 0;
                int iB = 0;
                for (int i7 = 0; i7 < iA; i7++) {
                    androidx.compose.foundation.gestures.o1 o1Var = nVar.q;
                    androidx.compose.foundation.gestures.o1 o1Var2 = androidx.compose.foundation.gestures.o1.e;
                    androidx.compose.ui.layout.k1 k1Var2 = a1Var2.e;
                    iB += (int) (o1Var == o1Var2 ? 4294967295L & (k1Var2 != null ? k1Var2.b(i7) : 0L) : (k1Var2 != null ? k1Var2.b(i7) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iB));
                }
                if (xVar.e != list2.size()) {
                    xVar.e++;
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.foundation.text.r0 r0Var = (androidx.compose.foundation.text.r0) this.z;
                androidx.compose.ui.text.input.y yVar = (androidx.compose.ui.text.input.y) this.A;
                androidx.compose.ui.text.input.x xVar2 = (androidx.compose.ui.text.input.x) this.y;
                androidx.compose.ui.text.input.k kVar = (androidx.compose.ui.text.input.k) this.B;
                if (r0Var.b()) {
                    androidx.compose.foundation.text.input.internal.o oVar = r0Var.d;
                    androidx.compose.foundation.text.s sVar = r0Var.v;
                    androidx.compose.foundation.text.s sVar2 = r0Var.w;
                    kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                    a aVar2 = new a(4, oVar, sVar, zVar);
                    androidx.compose.ui.text.input.s sVar3 = yVar.a;
                    sVar3.a(xVar2, kVar, aVar2, sVar2);
                    androidx.compose.ui.text.input.d0 d0Var = new androidx.compose.ui.text.input.d0(yVar, sVar3);
                    yVar.b.set(d0Var);
                    zVar.e = d0Var;
                    r0Var.e = d0Var;
                }
                return new androidx.compose.foundation.text.x();
            case 5:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.z;
                androidx.navigation.internal.f fVar = (androidx.navigation.internal.f) this.A;
                androidx.navigation.t tVar = (androidx.navigation.t) this.y;
                Bundle bundle = (Bundle) this.B;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                vVar.e = true;
                fVar.a(tVar, bundle, iVar, kotlin.collections.w.e);
                return kotlin.y.a;
            case 6:
                List list3 = (List) this.A;
                String str = (String) this.y;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.B;
                androidx.compose.runtime.a1 a1Var3 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
                jVar.getClass();
                jVar.q(list3.size(), new androidx.compose.foundation.text.c0(6, new com.app.mlounge.ui.t(8), list3), new com.app.mlounge.ui.components.u0(0, list3), new androidx.compose.runtime.internal.f(true, 802480018, new com.app.mlounge.ui.screens.livetv.j(list3, str, lVar4, a1Var3, 2)));
                androidx.compose.foundation.lazy.j.p(jVar, com.app.mlounge.ui.components.b0.i, 3);
                return kotlin.y.a;
            case 7:
                w2 w2Var2 = (w2) this.z;
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) this.A;
                w2 w2Var3 = (w2) this.y;
                w2 w2Var4 = (w2) this.B;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                List list4 = (List) w2Var2.getValue();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list4) {
                    if (hashSet.add(((HiAnimeItem) obj3).b())) {
                        arrayList.add(obj3);
                    }
                }
                hVar.q(arrayList.size(), new androidx.compose.foundation.text.c0(10, new com.app.mlounge.ui.components.c0(4), arrayList), new com.app.mlounge.ui.screens.anime.k(0, arrayList), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.anime.l(arrayList, lVar5, w2Var3, 0)));
                if (((Boolean) w2Var4.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.anime.m.c, null);
                }
                return kotlin.y.a;
            case 8:
                androidx.compose.runtime.a1 a1Var4 = (androidx.compose.runtime.a1) this.z;
                com.app.mlounge.ui.viewmodel.o oVar2 = (com.app.mlounge.ui.viewmodel.o) this.A;
                kotlin.jvm.functions.s sVar4 = (kotlin.jvm.functions.s) this.y;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.B;
                androidx.compose.foundation.lazy.j jVar2 = (androidx.compose.foundation.lazy.j) obj;
                jVar2.getClass();
                List list5 = (List) a1Var4.getValue();
                jVar2.q(list5.size(), new androidx.compose.foundation.text.c0(11, new com.app.mlounge.ui.t(10), list5), new com.app.mlounge.ui.components.u0(4, list5), new androidx.compose.runtime.internal.f(true, 802480018, new androidx.navigation.compose.t(list5, oVar2, a1Var4, sVar4, yVar2)));
                return kotlin.y.a;
            case 9:
                w2 w2Var5 = (w2) this.A;
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                androidx.compose.runtime.a1 a1Var5 = (androidx.compose.runtime.a1) this.z;
                w2 w2Var6 = (w2) this.B;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                hVar2.q(((List) w2Var5.getValue()).size(), new s3(w2Var5, 2), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(true, -1546571790, new com.app.mlounge.ui.m(pVar, a1Var5, w2Var5)));
                if (((Boolean) w2Var6.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar2, com.app.mlounge.ui.screens.games.a.b, null);
                }
                return kotlin.y.a;
            case 10:
                List list6 = (List) this.A;
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.y;
                kotlin.jvm.functions.s sVar5 = (kotlin.jvm.functions.s) this.B;
                androidx.compose.runtime.a1 a1Var6 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.foundation.lazy.j jVar3 = (androidx.compose.foundation.lazy.j) obj;
                jVar3.getClass();
                jVar3.q(list6.size(), new androidx.compose.foundation.text.c0(15, new com.app.mlounge.ui.components.c0(22), list6), new com.app.mlounge.ui.components.u0(8, list6), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.livetv.j(list6, a0Var, sVar5, a1Var6, 1)));
                return kotlin.y.a;
            case 11:
                w2 w2Var7 = (w2) this.A;
                com.app.mlounge.ui.viewmodel.a0 a0Var2 = (com.app.mlounge.ui.viewmodel.a0) this.y;
                kotlin.jvm.functions.s sVar6 = (kotlin.jvm.functions.s) this.B;
                androidx.compose.runtime.a1 a1Var7 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.foundation.lazy.grid.h hVar3 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar3.getClass();
                List list7 = (List) w2Var7.getValue();
                hVar3.q(list7.size(), new androidx.compose.foundation.text.c0(14, new com.app.mlounge.ui.components.c0(23), list7), new com.app.mlounge.ui.components.u0(7, list7), new androidx.compose.runtime.internal.f(true, -1942245546, new com.app.mlounge.ui.screens.livetv.j(list7, a0Var2, sVar6, a1Var7, 0)));
                return kotlin.y.a;
            case 12:
                List list8 = (List) this.z;
                com.app.mlounge.ui.screens.player.c1 c1Var = (com.app.mlounge.ui.screens.player.c1) this.A;
                kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) this.y;
                kotlin.jvm.functions.l lVar6 = (kotlin.jvm.functions.l) this.B;
                androidx.compose.foundation.lazy.j jVar4 = (androidx.compose.foundation.lazy.j) obj;
                jVar4.getClass();
                androidx.compose.foundation.lazy.j.p(jVar4, new androidx.compose.runtime.internal.f(true, -1974660684, new androidx.compose.foundation.contextmenu.i(7, c1Var, aVar3)), 3);
                jVar4.q(list8.size(), null, new com.app.mlounge.ui.components.u0(13, list8), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.anime.l(list8, c1Var, lVar6)));
                return kotlin.y.a;
            case 13:
                View view = (View) this.A;
                final androidx.compose.runtime.a1 a1Var8 = (androidx.compose.runtime.a1) this.z;
                final Map map = (Map) this.y;
                final com.app.mlounge.ui.viewmodel.p1 p1Var = (com.app.mlounge.ui.viewmodel.p1) this.B;
                ((androidx.compose.runtime.j0) obj).getClass();
                if (((String) a1Var8.getValue()) != null) {
                    view.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: com.app.mlounge.ui.screens.settings.a0
                        @Override // android.view.View.OnGenericMotionListener
                        public final boolean onGenericMotion(View view2, MotionEvent motionEvent) {
                            int i8;
                            a1 a1Var9 = a1Var8;
                            if (((String) a1Var9.getValue()) != null && (motionEvent.getSource() & 16777232) == 16777232) {
                                float axisValue = motionEvent.getAxisValue(0);
                                float axisValue2 = motionEvent.getAxisValue(1);
                                float axisValue3 = motionEvent.getAxisValue(11);
                                float axisValue4 = motionEvent.getAxisValue(14);
                                if (axisValue2 < -0.5f) {
                                    i8 = 10001;
                                } else if (axisValue2 > 0.5f) {
                                    i8 = 10002;
                                } else if (axisValue < -0.5f) {
                                    i8 = 10003;
                                } else if (axisValue > 0.5f) {
                                    i8 = 10004;
                                } else if (axisValue4 < -0.5f) {
                                    i8 = 10005;
                                } else if (axisValue4 > 0.5f) {
                                    i8 = 10006;
                                } else if (axisValue3 < -0.5f) {
                                    i8 = 10007;
                                } else if (axisValue3 > 0.5f) {
                                    i8 = 10008;
                                }
                                LinkedHashMap linkedHashMapP = kotlin.collections.c0.p(map);
                                String str2 = (String) a1Var9.getValue();
                                str2.getClass();
                                linkedHashMapP.put(str2, Integer.valueOf(i8));
                                String string = new JSONObject(kotlin.collections.c0.o(linkedHashMapP)).toString();
                                string.getClass();
                                p1 p1Var2 = p1Var;
                                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var2), null, null, new j1(p1Var2, string, null, 4), 3, null);
                                a1Var9.setValue(null);
                                return true;
                            }
                            return false;
                        }
                    });
                }
                return new androidx.activity.compose.d(view, 17);
            case 14:
                com.app.mlounge.ui.viewmodel.p1 p1Var2 = (com.app.mlounge.ui.viewmodel.p1) this.A;
                w2 w2Var8 = (w2) this.y;
                androidx.compose.runtime.a1 a1Var9 = (androidx.compose.runtime.a1) this.z;
                androidx.compose.runtime.a1 a1Var10 = (androidx.compose.runtime.a1) this.B;
                if (!((Boolean) obj).booleanValue()) {
                    p1Var2.f(false);
                } else if (((String) w2Var8.getValue()) == null || kotlin.jvm.internal.l.a((String) w2Var8.getValue(), "LOADING")) {
                    a1Var10.setValue(Boolean.TRUE);
                } else {
                    a1Var9.setValue(Boolean.TRUE);
                }
                return kotlin.y.a;
            default:
                com.google.firebase.heartbeatinfo.h hVar4 = (com.google.firebase.heartbeatinfo.h) this.z;
                String str2 = (String) this.A;
                String str3 = (String) this.y;
                androidx.datastore.preferences.core.d dVar = (androidx.datastore.preferences.core.d) this.B;
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) obj;
                if (((String) androidx.work.impl.v.z(aVar4, com.google.firebase.heartbeatinfo.h.d, "")).equals(str2)) {
                    androidx.datastore.preferences.core.d dVarC = hVar4.c(aVar4, str2);
                    if (dVarC != null && !dVarC.a.equals(str3)) {
                        synchronized (hVar4) {
                            hVar4.d(aVar4, str2);
                            HashSet hashSet2 = new HashSet((Collection) androidx.work.impl.v.z(aVar4, dVar, new HashSet()));
                            hashSet2.add(str2);
                            aVar4.f(dVar, hashSet2);
                        }
                    }
                    return null;
                }
                androidx.datastore.preferences.core.d dVar2 = com.google.firebase.heartbeatinfo.h.c;
                long jLongValue3 = ((Long) androidx.work.impl.v.z(aVar4, dVar2, 0L)).longValue();
                if (jLongValue3 + 1 == 30) {
                    synchronized (hVar4) {
                        try {
                            long jLongValue4 = ((Long) androidx.work.impl.v.z(aVar4, dVar2, 0L)).longValue();
                            String str4 = "";
                            Set hashSet3 = new HashSet();
                            String str5 = null;
                            for (Map.Entry entry : aVar4.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str6 : set) {
                                        if (str5 == null || str5.compareTo(str6) > 0) {
                                            str4 = ((androidx.datastore.preferences.core.d) entry.getKey()).a;
                                            str5 = str6;
                                            hashSet3 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet4 = new HashSet(hashSet3);
                            hashSet4.remove(str5);
                            str4.getClass();
                            aVar4.f(new androidx.datastore.preferences.core.d(str4), hashSet4);
                            jLongValue3 = jLongValue4 - 1;
                            aVar4.e(com.google.firebase.heartbeatinfo.h.c, Long.valueOf(jLongValue3));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet5 = new HashSet((Collection) androidx.work.impl.v.z(aVar4, dVar, new HashSet()));
                hashSet5.add(str2);
                aVar4.f(dVar, hashSet5);
                aVar4.e(com.google.firebase.heartbeatinfo.h.c, Long.valueOf(jLongValue3 + 1));
                aVar4.e(com.google.firebase.heartbeatinfo.h.d, str2);
                return obj2;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, androidx.compose.runtime.a1 a1Var, androidx.compose.runtime.a1 a1Var2, int i) {
        this.e = i;
        this.A = obj;
        this.y = obj2;
        this.z = a1Var;
        this.B = a1Var2;
    }

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.y = obj3;
        this.B = obj4;
    }

    public /* synthetic */ i0(Object obj, Object obj2, kotlin.d dVar, androidx.compose.runtime.a1 a1Var, int i) {
        this.e = i;
        this.A = obj;
        this.y = obj2;
        this.B = dVar;
        this.z = a1Var;
    }

    public /* synthetic */ i0(ArrayList arrayList, kotlin.jvm.internal.x xVar, List list, int i, androidx.compose.foundation.lazy.grid.n nVar) {
        this.e = 3;
        this.z = arrayList;
        this.A = xVar;
        this.y = list;
        this.B = nVar;
    }

    public /* synthetic */ i0(kotlin.jvm.internal.w wVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.y = wVar;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
