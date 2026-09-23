package androidx.compose.ui.text;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.ui.graphics.p0;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    public /* synthetic */ x(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        i iVar;
        Object objA;
        int i = this.e;
        Bundle bundleF = null;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.ui.unit.o oVar2 = (androidx.compose.ui.unit.o) obj2;
                return oVar2 != null ? androidx.compose.ui.unit.o.a(oVar2.a, androidx.compose.ui.unit.o.c) : false ? Boolean.FALSE : kotlin.collections.q.a(Float.valueOf(androidx.compose.ui.unit.o.c(oVar2.a)), c0.a(new androidx.compose.ui.unit.p(androidx.compose.ui.unit.o.b(oVar2.a)), c0.w, (androidx.compose.runtime.saveable.c) obj));
            case 1:
                k kVar = (k) obj2;
                return kotlin.collections.q.a(kVar.a, c0.a(kVar.b, c0.i, (androidx.compose.runtime.saveable.c) obj));
            case 2:
                long j = ((androidx.compose.ui.unit.p) obj2).a;
                if (androidx.compose.ui.unit.p.a(j, 8589934592L)) {
                    return 0;
                }
                if (androidx.compose.ui.unit.p.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 3:
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj2;
                return bVar != null ? androidx.compose.ui.geometry.b.b(bVar.a, 9205357640488583168L) : false ? Boolean.FALSE : kotlin.collections.q.a(Float.valueOf(Float.intBitsToFloat((int) (bVar.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.a & 4294967295L))));
            case 4:
                androidx.compose.runtime.saveable.c cVar = (androidx.compose.runtime.saveable.c) obj;
                e eVar = (e) obj2;
                Object obj3 = eVar.a;
                if (obj3 instanceof s) {
                    iVar = i.e;
                } else if (obj3 instanceof e0) {
                    iVar = i.y;
                } else if (obj3 instanceof o0) {
                    iVar = i.z;
                } else if (obj3 instanceof n0) {
                    iVar = i.A;
                } else if (obj3 instanceof l) {
                    iVar = i.B;
                } else if (obj3 instanceof k) {
                    iVar = i.C;
                } else {
                    if (!(obj3 instanceof g0)) {
                        androidx.transition.k.o();
                        return null;
                    }
                    iVar = i.D;
                }
                switch (iVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = c0.a((s) obj3, c0.g, cVar);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = c0.a((e0) obj3, c0.h, cVar);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = c0.a((o0) obj3, c0.c, cVar);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = c0.a((n0) obj3, c0.d, cVar);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = c0.a((l) obj3, c0.e, cVar);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = c0.a((k) obj3, c0.f, cVar);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((g0) obj3).a;
                        break;
                    default:
                        coil3.g.a();
                        return null;
                }
                return kotlin.collections.q.a(iVar, objA, Integer.valueOf(eVar.b), Integer.valueOf(eVar.c), eVar.d);
            case 5:
                androidx.compose.runtime.saveable.c cVar2 = (androidx.compose.runtime.saveable.c) obj;
                ?? r1 = ((androidx.compose.ui.text.intl.b) obj2).e;
                ArrayList arrayList = new ArrayList(r1.size());
                int size = r1.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(c0.a((androidx.compose.ui.text.intl.a) r1.get(i2), c0.z, cVar2));
                }
                return arrayList;
            case 6:
                return ((androidx.compose.ui.text.intl.a) obj2).a.toLanguageTag();
            case 7:
                androidx.compose.runtime.saveable.c cVar3 = (androidx.compose.runtime.saveable.c) obj;
                androidx.compose.ui.text.style.i iVar2 = (androidx.compose.ui.text.style.i) obj2;
                return kotlin.collections.q.a(c0.a(new androidx.compose.ui.text.style.f(iVar2.a), c0.B, cVar3), c0.a(new androidx.compose.ui.text.style.h(iVar2.b), c0.C, cVar3), c0.a(new androidx.compose.ui.text.style.g(iVar2.c), c0.D, cVar3));
            case 8:
                return Float.valueOf(((androidx.compose.ui.text.style.f) obj2).a);
            case 9:
                return Integer.valueOf(((androidx.compose.ui.text.style.h) obj2).a);
            case 10:
                return Integer.valueOf(((androidx.compose.ui.text.style.g) obj2).a);
            case 11:
                return ((o0) obj2).a;
            case 12:
                androidx.compose.runtime.saveable.c cVar4 = (androidx.compose.runtime.saveable.c) obj;
                s sVar = (s) obj2;
                Object objA2 = c0.a(new androidx.compose.ui.text.style.k(sVar.a), c0.q, cVar4);
                Object objA3 = c0.a(new androidx.compose.ui.text.style.m(sVar.b), c0.r, cVar4);
                Object objA4 = c0.a(new androidx.compose.ui.unit.o(sVar.c), c0.v, cVar4);
                androidx.compose.ui.text.style.q qVar = sVar.d;
                androidx.compose.ui.text.style.q qVar2 = androidx.compose.ui.text.style.q.c;
                Object objA5 = c0.a(qVar, c0.l, cVar4);
                Object objA6 = c0.a(sVar.e, d0.a, cVar4);
                androidx.compose.ui.text.style.i iVar3 = sVar.f;
                androidx.compose.ui.text.style.i iVar4 = androidx.compose.ui.text.style.i.d;
                return kotlin.collections.q.a(objA2, objA3, objA4, objA5, objA6, c0.a(iVar3, c0.A, cVar4), c0.a(new androidx.compose.ui.text.style.e(sVar.g), d0.c, cVar4), c0.a(new androidx.compose.ui.text.style.d(sVar.h), c0.s, cVar4), c0.a(sVar.i, d0.d, cVar4));
            case 13:
                return ((n0) obj2).a;
            case 14:
                androidx.compose.runtime.saveable.c cVar5 = (androidx.compose.runtime.saveable.c) obj;
                e0 e0Var = (e0) obj2;
                androidx.compose.ui.graphics.t tVar = new androidx.compose.ui.graphics.t(e0Var.a.b());
                b0 b0Var = c0.p;
                Object objA7 = c0.a(tVar, b0Var, cVar5);
                androidx.compose.ui.unit.o oVar3 = new androidx.compose.ui.unit.o(e0Var.b);
                b0 b0Var2 = c0.v;
                Object objA8 = c0.a(oVar3, b0Var2, cVar5);
                androidx.compose.ui.text.font.k kVar2 = e0Var.c;
                androidx.compose.ui.text.font.k kVar3 = androidx.compose.ui.text.font.k.y;
                Object objA9 = c0.a(kVar2, c0.m, cVar5);
                Object objA10 = c0.a(e0Var.d, c0.t, cVar5);
                Object objA11 = c0.a(e0Var.e, c0.u, cVar5);
                String str = e0Var.g;
                Object objA12 = c0.a(new androidx.compose.ui.unit.o(e0Var.h), b0Var2, cVar5);
                Object objA13 = c0.a(e0Var.i, c0.n, cVar5);
                Object objA14 = c0.a(e0Var.j, c0.k, cVar5);
                androidx.compose.ui.text.intl.b bVar2 = e0Var.k;
                androidx.compose.ui.text.intl.b bVar3 = androidx.compose.ui.text.intl.b.z;
                Object objA15 = c0.a(bVar2, c0.y, cVar5);
                Object objA16 = c0.a(new androidx.compose.ui.graphics.t(e0Var.l), b0Var, cVar5);
                Object objA17 = c0.a(e0Var.m, c0.j, cVar5);
                androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                androidx.compose.ui.graphics.m0 m0Var2 = androidx.compose.ui.graphics.m0.d;
                return kotlin.collections.q.a(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, c0.a(m0Var, c0.o, cVar5));
            case 15:
                androidx.compose.runtime.saveable.c cVar6 = (androidx.compose.runtime.saveable.c) obj;
                k0 k0Var = (k0) obj2;
                e0 e0Var2 = k0Var.a;
                androidx.compose.foundation.text.input.internal.o oVar4 = c0.h;
                return kotlin.collections.q.a(c0.a(e0Var2, oVar4, cVar6), c0.a(k0Var.b, oVar4, cVar6), c0.a(k0Var.c, oVar4, cVar6), c0.a(k0Var.d, oVar4, cVar6));
            case 16:
                u uVar = (u) obj2;
                Boolean boolValueOf = Boolean.valueOf(uVar.a);
                androidx.compose.foundation.text.input.internal.o oVar5 = c0.a;
                return kotlin.collections.q.a(boolValueOf, c0.a(new j(uVar.b), d0.b, (androidx.compose.runtime.saveable.c) obj));
            case 17:
                return Integer.valueOf(((j) obj2).a);
            case 18:
                return Integer.valueOf(((androidx.compose.ui.text.style.e) obj2).a);
            case 19:
                androidx.compose.ui.text.style.s sVar2 = (androidx.compose.ui.text.style.s) obj2;
                return kotlin.collections.q.a(c0.a(new androidx.compose.ui.text.style.r(sVar2.a), d0.e, (androidx.compose.runtime.saveable.c) obj), Boolean.valueOf(sVar2.b));
            case 20:
                return Integer.valueOf(((androidx.compose.ui.text.style.r) obj2).a);
            case 21:
                androidx.datastore.core.l0 l0Var = (androidx.datastore.core.l0) obj;
                Throwable cancellationException = (Throwable) obj2;
                l0Var.getClass();
                CompletableDeferred completableDeferred = l0Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                completableDeferred.completeExceptionally(cancellationException);
                return yVar;
            case 22:
                androidx.navigation.y yVar2 = (androidx.navigation.y) obj2;
                androidx.navigation.internal.f fVar = yVar2.b;
                LinkedHashMap linkedHashMap = fVar.n;
                kotlin.collections.l<androidx.navigation.i> lVar = fVar.f;
                LinkedHashMap linkedHashMap2 = fVar.m;
                ArrayList arrayList2 = new ArrayList();
                Bundle bundleF2 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                for (Map.Entry entry : kotlin.collections.c0.o(fVar.t.a).entrySet()) {
                    ((androidx.navigation.k0) entry.getValue()).getClass();
                }
                if (!arrayList2.isEmpty()) {
                    bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                    com.google.android.gms.dynamite.g.M(bundleF2, "android-support-nav:controller:navigatorState:names", arrayList2);
                    bundleF.putBundle("android-support-nav:controller:navigatorState", bundleF2);
                }
                if (!lVar.isEmpty()) {
                    if (bundleF == null) {
                        bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    for (androidx.navigation.i iVar5 : lVar) {
                        iVar5.getClass();
                        int i3 = iVar5.y.y.a;
                        String str2 = iVar5.C;
                        androidx.navigation.internal.c cVar7 = iVar5.E;
                        Bundle bundleA = cVar7.a();
                        Bundle bundleF3 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                        cVar7.h.c(bundleF3);
                        Bundle bundleF4 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                        str2.getClass();
                        bundleF4.putString("nav-entry-state:id", str2);
                        bundleF4.putInt("nav-entry-state:destination-id", i3);
                        if (bundleA == null) {
                            bundleA = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                        }
                        bundleF4.putBundle("nav-entry-state:args", bundleA);
                        bundleF4.putBundle("nav-entry-state:saved-state", bundleF3);
                        arrayList3.add(bundleF4);
                    }
                    bundleF.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleF == null) {
                        bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = iIntValue;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList4.add(str3);
                        i4 = i5;
                    }
                    bundleF.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    com.google.android.gms.dynamite.g.M(bundleF, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleF == null) {
                        bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        kotlin.collections.l lVar2 = (kotlin.collections.l) entry3.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it = lVar2.iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.cloudmessaging.n nVar = ((androidx.navigation.j) it.next()).a;
                            nVar.getClass();
                            Bundle bundleF5 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                            String str5 = (String) nVar.y;
                            str5.getClass();
                            bundleF5.putString("nav-entry-state:id", str5);
                            bundleF5.putInt("nav-entry-state:destination-id", nVar.e);
                            Bundle bundleF6 = (Bundle) nVar.z;
                            if (bundleF6 == null) {
                                bundleF6 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                            }
                            bundleF5.putBundle("nav-entry-state:args", bundleF6);
                            Bundle bundle = (Bundle) nVar.A;
                            bundle.getClass();
                            bundleF5.putBundle("nav-entry-state:saved-state", bundle);
                            arrayList6.add(bundleF5);
                        }
                        bundleF.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList6);
                    }
                    com.google.android.gms.dynamite.g.M(bundleF, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (yVar2.e) {
                    if (bundleF == null) {
                        bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                    }
                    bundleF.putBoolean("android-support-nav:controller:deepLinkHandled", yVar2.e);
                }
                return bundleF;
            case 23:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar3.W();
                }
                return yVar;
            case 24:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z5.b("Resolving Stream", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 6, 0, 262142);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 25:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z5.b("Okay", i1.e(androidx.compose.foundation.layout.b.s(oVar, 0.0f, 14, 1), 1.0f), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar5.j(n6.a)).i, sVar5, 432, 0, 130040);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 26:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    z5.b("Confirm PIN", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 27:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    q1.a(com.google.firebase.b.S(R.drawable.ic_check, sVar7), "Watched", i1.m(androidx.compose.foundation.layout.b.q(oVar, 3), 16), androidx.compose.ui.graphics.t.d, sVar7, 3512);
                } else {
                    sVar7.W();
                }
                return yVar;
            case 28:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    s4.a(i1.m(androidx.compose.foundation.layout.b.q(oVar, 3), 16), androidx.compose.ui.graphics.t.d, 2, 0L, 0, 0.0f, sVar8, 438, 56);
                } else {
                    sVar8.W();
                }
                return yVar;
            default:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB = android.support.v4.media.session.b.d;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(6.0f, 10.0f);
                        gVarJ.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVarJ.x(0.9f, 2.0f, 2.0f, 2.0f);
                        gVarJ.x(2.0f, -0.9f, 2.0f, -2.0f);
                        gVarJ.x(-0.9f, -2.0f, -2.0f, -2.0f);
                        gVarJ.l();
                        gVarJ.v(18.0f, 10.0f);
                        gVarJ.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVarJ.x(0.9f, 2.0f, 2.0f, 2.0f);
                        gVarJ.x(2.0f, -0.9f, 2.0f, -2.0f);
                        gVarJ.x(-0.9f, -2.0f, -2.0f, -2.0f);
                        gVarJ.l();
                        gVarJ.v(12.0f, 10.0f);
                        gVarJ.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVarJ.x(0.9f, 2.0f, 2.0f, 2.0f);
                        gVarJ.x(2.0f, -0.9f, 2.0f, -2.0f);
                        gVarJ.x(-0.9f, -2.0f, -2.0f, -2.0f);
                        gVarJ.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVarJ.b, 0, p0Var);
                        fVarB = eVar2.b();
                        android.support.v4.media.session.b.d = fVarB;
                    }
                    q1.b(fVarB, "More", null, 0L, sVar9, 48, 12);
                } else {
                    sVar9.W();
                }
                return yVar;
        }
    }
}
