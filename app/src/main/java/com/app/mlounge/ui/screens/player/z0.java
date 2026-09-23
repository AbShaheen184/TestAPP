package com.app.mlounge.ui.screens.player;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.media3.common.o0 {
    public final /* synthetic */ a1 e;

    public z0(a1 a1Var) {
        this.e = a1Var;
    }

    @Override // androidx.media3.common.o0
    public final void B(androidx.media3.common.k0 k0Var) {
        Object value;
        Object value2;
        Object value3;
        a1 a1Var = this.e;
        MutableStateFlow mutableStateFlow = a1Var.g;
        k0Var.getClass();
        Context context = com.app.mlounge.util.a.a;
        String message = k0Var.getMessage();
        com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "onPlayerError: " + (message != null ? kotlin.text.k.e0(org.mozilla.javascript.Context.VERSION_ES6, message) : null));
        String message2 = k0Var.getMessage();
        com.app.mlounge.util.a.f("play-error " + (message2 != null ? kotlin.text.k.e0(120, message2) : null));
        com.app.mlounge.util.a.g("CinemaHQ-Player", "play-error");
        if (((p0) mutableStateFlow.getValue()).B) {
            androidx.room.b0.h("Auto-play source failed during playback: ", k0Var.getMessage(), "W", "CinemaHQ-Player");
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "Playback failed for auto-play source.", null, false, false, null, null, false, false, false, 0, 0L, -142606337, 7)));
            return;
        }
        if (!a1Var.t && kotlin.text.r.u(a1Var.s, "ntv://", false)) {
            for (Throwable cause = k0Var; cause != null; cause = cause.getCause()) {
                if ((cause instanceof androidx.media3.datasource.t) && ((androidx.media3.datasource.t) cause).z == 403) {
                    a1Var.t = true;
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "403 on live stream, re-resolving ".concat(kotlin.text.k.e0(80, a1Var.s)));
                    Object obj = com.app.mlounge.data.remote.ntv.q.b;
                    com.app.mlounge.data.remote.ntv.e eVarI = coil3.svg.internal.a.I(a1Var.s);
                    if (eVarI != null) {
                        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var), null, null, new w0(a1Var, eVarI, null, 2), 3, null);
                        return;
                    } else {
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "Playback error: stream expired.", null, false, false, null, null, false, false, false, 0, 0L, -8388609, 7)));
                        return;
                    }
                }
            }
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, androidx.compose.runtime.j.i("Playback error: ", k0Var.getMessage()), null, false, false, null, null, false, false, false, 0, 0L, -8388609, 7)));
    }

    @Override // androidx.media3.common.o0
    public final void G(boolean z) {
        Object value;
        a1 a1Var = this.e;
        MutableStateFlow mutableStateFlow = a1Var.g;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, z, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -2, 7)));
        if (z && ((p0) mutableStateFlow.getValue()).c) {
            a1Var.h();
        }
    }

    @Override // androidx.media3.common.o0
    public final void h(int i) {
        Object value;
        MutableStateFlow mutableStateFlow = this.e.g;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, i, 0L, -1, 5)));
    }

    @Override // androidx.media3.common.o0
    public final void i(int i) {
        Object value;
        p0 p0Var;
        boolean z;
        Object value2;
        Object value3;
        a1 a1Var = this.e;
        MutableStateFlow mutableStateFlow = a1Var.g;
        do {
            value = mutableStateFlow.getValue();
            p0Var = (p0) value;
            z = false;
            if (i == 2) {
                z = true;
            }
        } while (!mutableStateFlow.compareAndSet(value, p0.a(p0Var, false, z, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, i == 3 || i == 4, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -1048579, 7)));
        if (i == 3) {
            Job job = a1Var.l;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -67108865, 7)));
            if (((p0) mutableStateFlow.getValue()).B) {
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -402653185, 7)));
            }
            if (((p0) mutableStateFlow.getValue()).c) {
                a1Var.h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    @Override // androidx.media3.common.o0
    public final void v(androidx.media3.common.c1 c1Var) {
        String strF;
        String upperCase;
        c1Var.getClass();
        ArrayList arrayList = new ArrayList();
        com.google.common.collect.h0 h0Var = c1Var.a;
        h0Var.getClass();
        int i = 0;
        for (Object obj : h0Var) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            androidx.media3.common.b1 b1Var = (androidx.media3.common.b1) obj;
            if (b1Var.b.c == 1) {
                int i3 = b1Var.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    androidx.media3.common.r rVarA = b1Var.a(i4);
                    rVarA.getClass();
                    String str = rVarA.b;
                    String str2 = rVarA.d;
                    String strD = "UNK";
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = "UNK";
                    }
                    int i5 = rVarA.G;
                    if (i5 == 1) {
                        strD = "Mono";
                    } else if (i5 == 2) {
                        strD = "Stereo";
                    } else if (i5 == 6) {
                        strD = "5.1";
                    } else if (i5 == 8) {
                        strD = "7.1";
                    } else if (i5 > 0) {
                        strD = androidx.compose.runtime.j.d(i5, " Ch");
                    }
                    if (str == null || !kotlin.text.k.z(str, upperCase, true)) {
                        str = upperCase + " (" + strD + ")";
                    }
                    arrayList.add(new a(i, i4, str, b1Var.e[i4]));
                }
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        for (Object obj2 : h0Var) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            androidx.media3.common.b1 b1Var2 = (androidx.media3.common.b1) obj2;
            if (b1Var2.b.c == 3) {
                int i8 = 0;
                for (int i9 = b1Var2.a; i8 < i9; i9 = i9) {
                    androidx.media3.common.r rVarA2 = b1Var2.a(i8);
                    rVarA2.getClass();
                    String str3 = rVarA2.b;
                    String str4 = rVarA2.d;
                    if (str4 != null) {
                        strF = str4.toLowerCase(Locale.ROOT);
                        strF.getClass();
                        if (kotlin.text.k.J(strF)) {
                            strF = null;
                        }
                        if (strF == null) {
                            strF = o0.f(str3);
                        }
                    } else {
                        strF = o0.f(str3);
                    }
                    String str5 = strF;
                    if (str3 == null) {
                        String upperCase2 = str5.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        str3 = upperCase2 + " Track " + (i8 + 1);
                    }
                    arrayList2.add(new c1(str3, "", str5, false, i6, i8, null, 296));
                    i8++;
                }
            }
            i6 = i7;
        }
        MutableStateFlow mutableStateFlow = this.e.g;
        while (true) {
            Object value = mutableStateFlow.getValue();
            p0 p0Var = (p0) value;
            List list = p0Var.m;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!((c1) obj3).e) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.r.p(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String lowerCase = ((c1) it.next()).a.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList4.add(lowerCase);
            }
            Set setF0 = kotlin.collections.p.f0(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList2) {
                String lowerCase2 = ((c1) obj4).a.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!setF0.contains(lowerCase2)) {
                    arrayList5.add(obj4);
                }
            }
            List list2 = p0Var.m;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : list2) {
                if (!((c1) obj5).e) {
                    arrayList6.add(obj5);
                }
            }
            ArrayList arrayListO = kotlin.collections.p.O(arrayList6, arrayList5);
            ArrayList arrayList7 = arrayList2;
            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
            ArrayList arrayList8 = arrayList;
            if (mutableStateFlow2.compareAndSet(value, p0.a(p0Var, false, false, false, false, false, false, false, false, 0L, 0L, 0L, arrayList8, arrayListO, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -6145, 7))) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            arrayList = arrayList8;
            arrayList2 = arrayList7;
        }
    }
}
