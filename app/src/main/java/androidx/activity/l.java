package androidx.activity;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.c2;
import androidx.collection.y0;
import androidx.compose.animation.b1;
import androidx.lifecycle.f0;
import androidx.media3.common.util.i0;
import androidx.media3.exoplayer.audio.n0;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.e1;
import androidx.media3.exoplayer.k0;
import androidx.media3.ui.h0;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ l(k0 k0Var, int i) {
        this.e = 14;
        this.y = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0026, B:19:0x002c, B:25:0x0038, B:27:0x003c, B:29:0x0042, B:31:0x004c, B:33:0x0056, B:35:0x0067, B:34:0x005b, B:36:0x0069, B:38:0x007d, B:40:0x0085), top: B:48:0x0017 }] */
    private final void a() {
        String strC;
        TelephonyManager telephonyManager;
        androidx.media3.common.util.r rVar = (androidx.media3.common.util.r) this.y;
        androidx.media3.exoplayer.upstream.e eVar = (androidx.media3.exoplayer.upstream.e) rVar.a.get();
        if (eVar != null) {
            int iB = rVar.c.b();
            androidx.media3.exoplayer.upstream.f fVar = eVar.a;
            synchronized (fVar) {
                int i = fVar.n;
                if (i == 0 || fVar.e) {
                    if (i != iB || fVar.o == null) {
                        fVar.n = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (fVar.o == null) {
                                Context context = fVar.a;
                                String str = i0.a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strC = com.imsdk.a.C(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strC = com.imsdk.a.C(Locale.getDefault().getCountry());
                                    } else {
                                        strC = com.imsdk.a.C(networkCountryIso);
                                    }
                                }
                                fVar.o = strC;
                            }
                            fVar.l = fVar.a(iB);
                            fVar.d.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            fVar.b(fVar.i, fVar.l, fVar.g > 0 ? (int) (jElapsedRealtime - fVar.h) : 0);
                            fVar.h = jElapsedRealtime;
                            fVar.i = 0L;
                            fVar.k = 0L;
                            fVar.j = 0L;
                            androidx.media3.exoplayer.upstream.s sVar = fVar.f;
                            sVar.a.clear();
                            sVar.c = -1;
                            sVar.d = 0;
                            sVar.e = 0;
                        }
                    }
                }
            }
        }
    }

    private final void b() {
        e1 e1Var = (e1) this.y;
        try {
            synchronized (e1Var) {
            }
            try {
                e1Var.a.d(e1Var.c, e1Var.d);
            } finally {
                e1Var.a(true);
            }
        } catch (androidx.media3.exoplayer.j e) {
            androidx.media3.common.util.b.g("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            kotlinx.coroutines.future.a.l(e);
        }
    }

    private final void c() {
        androidx.media3.exoplayer.mediacodec.e eVar = (androidx.media3.exoplayer.mediacodec.e) this.y;
        synchronized (eVar.a) {
            try {
                if (eVar.m) {
                    return;
                }
                long j = eVar.l - 1;
                eVar.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    eVar.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (eVar.a) {
                    eVar.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:181:0x0307  */
    /* JADX WARN: Code duplicated, block: B:184:0x031b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0327  */
    /* JADX WARN: Code duplicated, block: B:187:0x035b  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:202:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ee A[LOOP:2: B:200:0x03e2->B:204:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0406  */
    /* JADX WARN: Code duplicated, block: B:210:0x040c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0412  */
    /* JADX WARN: Code duplicated, block: B:300:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:304:0x05c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:305:0x05ca A[Catch: all -> 0x05f3, LOOP:6: B:291:0x0568->B:305:0x05ca, LOOP_END, TryCatch #1 {all -> 0x05f3, blocks: (B:288:0x055a, B:291:0x0568, B:293:0x0578, B:295:0x0585, B:297:0x058e, B:299:0x059d, B:301:0x05be, B:305:0x05ca, B:306:0x05cd, B:308:0x05df, B:314:0x05f6, B:315:0x05f9, B:307:0x05d2), top: B:332:0x055a, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.h] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        androidx.dynamicanimation.animation.f fVar;
        float f3;
        float f4;
        androidx.dynamicanimation.animation.f fVar2;
        double dAbs;
        int i;
        boolean z2;
        long j5;
        ArrayList arrayList;
        androidx.dynamicanimation.animation.c cVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i2;
        int size;
        Object obj;
        int i3 = 24;
        long j6 = 0;
        Boolean bool = null;
        int i4 = 0;
        switch (this.e) {
            case 0:
                m mVar = (m) this.y;
                Runnable runnable = mVar.y;
                if (runnable != null) {
                    runnable.run();
                    mVar.y = null;
                    return;
                }
                return;
            case 1:
                r.a((r) this.y);
                return;
            case 2:
                ActionMode actionMode = ((androidx.compose.foundation.text.contextmenu.internal.i) this.y).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                androidx.compose.material.ripple.e.setRippleState$lambda$1((androidx.compose.material.ripple.e) this.y);
                return;
            case 4:
                androidx.compose.ui.contentcapture.f fVar3 = (androidx.compose.ui.contentcapture.f) this.y;
                boolean zE = fVar3.e();
                androidx.compose.ui.platform.u uVar = fVar3.e;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        uVar.u(true);
                        androidx.collection.z zVar = fVar3.I;
                        int[] iArr = zVar.b;
                        long[] jArr = zVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j7 = jArr[i5];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    long j8 = j7;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((255 & j8) < 128) {
                                            int i9 = iArr[(i5 << 3) + i8];
                                            if (!fVar3.d().a(i9)) {
                                                fVar3.A.add(new androidx.compose.ui.contentcapture.g(i9, fVar3.H, androidx.compose.ui.contentcapture.h.y, null));
                                                fVar3.E.mo28trySendJP2dKIU(kotlin.y.a);
                                            }
                                        }
                                        j8 >>= i6;
                                        i8++;
                                        i6 = i6;
                                    }
                                    if (i7 == i6) {
                                        if (i5 != length) {
                                            i5++;
                                        }
                                    }
                                } else if (i5 != length) {
                                    i5++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            fVar3.h(uVar.getSemanticsOwner().a(), fVar3.J);
                            Trace.endSection();
                            fVar3.c(fVar3.d());
                            fVar3.l();
                            fVar3.K = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                return;
            case 5:
                androidx.compose.ui.platform.a0 a0Var = (androidx.compose.ui.platform.a0) this.y;
                Trace.beginSection("measureAndLayout");
                try {
                    a0Var.A.u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        a0Var.n();
                        Trace.endSection();
                        a0Var.g0 = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 6:
                androidx.compose.ui.text.input.a0 a0Var2 = (androidx.compose.ui.text.input.a0) this.y;
                c2 c2Var = a0Var2.b;
                a0Var2.n = null;
                androidx.compose.runtime.collection.b bVar = a0Var2.m;
                View view = a0Var2.a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    bVar.g();
                    return;
                }
                Object[] objArr = bVar.e;
                int i10 = bVar.z;
                Boolean boolValueOf = null;
                for (int i11 = 0; i11 < i10; i11++) {
                    androidx.compose.ui.text.input.z zVar2 = (androidx.compose.ui.text.input.z) objArr[i11];
                    int iOrdinal = zVar2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            boolValueOf = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            coil3.g.a();
                            return;
                        } else if (!kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(zVar2 == androidx.compose.ui.text.input.z.z);
                        }
                    } else {
                        boolValueOf = Boolean.TRUE;
                    }
                    bool = boolValueOf;
                }
                bVar.g();
                if (kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c2Var.z.getValue()).restartInput((View) c2Var.y);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((androidx.core.view.a0) ((com.google.firebase.platforminfo.d) c2Var.A).e).b();
                    } else {
                        ((androidx.core.view.a0) ((com.google.firebase.platforminfo.d) c2Var.A).e).a();
                    }
                }
                if (kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c2Var.z.getValue()).restartInput((View) c2Var.y);
                    return;
                }
                return;
            case 7:
                androidx.dynamicanimation.animation.c cVar = (androidx.dynamicanimation.animation.c) ((androidx.dynamicanimation.animation.c) this.y).c.e;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = cVar.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    androidx.dynamicanimation.animation.e eVar = (androidx.dynamicanimation.animation.e) arrayList3.get(i12);
                    if (eVar == null) {
                        jUptimeMillis = jUptimeMillis;
                        jUptimeMillis2 = jUptimeMillis2;
                        j5 = j6;
                        i = i12;
                    } else {
                        y0 y0Var = cVar.a;
                        Long l = (Long) y0Var.get(eVar);
                        if (l == null) {
                            j = eVar.f;
                            if (j == j6) {
                                eVar.f = jUptimeMillis;
                                eVar.c(eVar.b);
                                jUptimeMillis = jUptimeMillis;
                                jUptimeMillis2 = jUptimeMillis2;
                                j5 = j6;
                                i = i12;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar.f = jUptimeMillis;
                                f = androidx.dynamicanimation.animation.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = eVar.l;
                                f2 = eVar.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        eVar.j.i = f2;
                                        eVar.k = Float.MAX_VALUE;
                                    }
                                    eVar.b = (float) eVar.j.i;
                                    eVar.a = 0.0f;
                                    eVar.l = false;
                                    jUptimeMillis = jUptimeMillis;
                                    i = i12;
                                } else {
                                    jUptimeMillis2 = jUptimeMillis2;
                                    fVar = eVar.j;
                                    f3 = eVar.b;
                                    f4 = eVar.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j9 = j4 / 2;
                                        b1 b1VarA = fVar.a(f3, f4, j9);
                                        androidx.dynamicanimation.animation.f fVar4 = eVar.j;
                                        fVar4.i = eVar.k;
                                        eVar.k = Float.MAX_VALUE;
                                        b1 b1VarA2 = fVar4.a(b1VarA.a, b1VarA.b, j9);
                                        eVar.b = b1VarA2.a;
                                        eVar.a = b1VarA2.b;
                                    } else {
                                        b1 b1VarA3 = fVar.a(f3, f4, j4);
                                        eVar.b = b1VarA3.a;
                                        eVar.a = b1VarA3.b;
                                    }
                                    float fMax = Math.max(eVar.b, -3.4028235E38f);
                                    eVar.b = fMax;
                                    float fMin = Math.min(fMax, Float.MAX_VALUE);
                                    eVar.b = fMin;
                                    float f5 = eVar.a;
                                    fVar2 = eVar.j;
                                    fVar2.getClass();
                                    dAbs = Math.abs(f5);
                                    i = i12;
                                    if (dAbs < fVar2.e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(eVar.b, Float.MAX_VALUE);
                                    eVar.b = fMin2;
                                    float fMax2 = Math.max(fMin2, -3.4028235E38f);
                                    eVar.b = fMax2;
                                    eVar.c(fMax2);
                                    if (z2) {
                                        arrayList = eVar.h;
                                        eVar.e = false;
                                        cVarB = androidx.dynamicanimation.animation.e.b();
                                        cVarB.a.remove(eVar);
                                        arrayList2 = cVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f = true;
                                        }
                                        j5 = 0;
                                        eVar.f = 0L;
                                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                                            if (arrayList.get(i2) == null) {
                                                arrayList.get(i2).getClass();
                                                androidx.transition.k.h();
                                                return;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j5 = 0;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(eVar.b, Float.MAX_VALUE);
                                eVar.b = fMin3;
                                float fMax3 = Math.max(fMin3, -3.4028235E38f);
                                eVar.b = fMax3;
                                eVar.c(fMax3);
                                if (z2) {
                                    arrayList = eVar.h;
                                    eVar.e = false;
                                    cVarB = androidx.dynamicanimation.animation.e.b();
                                    cVarB.a.remove(eVar);
                                    arrayList2 = cVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        cVarB.f = true;
                                    }
                                    j5 = 0;
                                    eVar.f = 0L;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) == null) {
                                            arrayList.get(i2).getClass();
                                            androidx.transition.k.h();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j5 = 0;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            y0Var.remove(eVar);
                            j = eVar.f;
                            if (j == j6) {
                                eVar.f = jUptimeMillis;
                                eVar.c(eVar.b);
                                jUptimeMillis = jUptimeMillis;
                                jUptimeMillis2 = jUptimeMillis2;
                                j5 = j6;
                                i = i12;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar.f = jUptimeMillis;
                                f = androidx.dynamicanimation.animation.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = eVar.l;
                                f2 = eVar.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        eVar.j.i = f2;
                                        eVar.k = Float.MAX_VALUE;
                                    }
                                    eVar.b = (float) eVar.j.i;
                                    eVar.a = 0.0f;
                                    eVar.l = false;
                                    jUptimeMillis = jUptimeMillis;
                                    i = i12;
                                } else {
                                    jUptimeMillis2 = jUptimeMillis2;
                                    fVar = eVar.j;
                                    f3 = eVar.b;
                                    f4 = eVar.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j10 = j4 / 2;
                                        b1 b1VarA4 = fVar.a(f3, f4, j10);
                                        androidx.dynamicanimation.animation.f fVar5 = eVar.j;
                                        fVar5.i = eVar.k;
                                        eVar.k = Float.MAX_VALUE;
                                        b1 b1VarA5 = fVar5.a(b1VarA4.a, b1VarA4.b, j10);
                                        eVar.b = b1VarA5.a;
                                        eVar.a = b1VarA5.b;
                                    } else {
                                        b1 b1VarA6 = fVar.a(f3, f4, j4);
                                        eVar.b = b1VarA6.a;
                                        eVar.a = b1VarA6.b;
                                    }
                                    float fMax4 = Math.max(eVar.b, -3.4028235E38f);
                                    eVar.b = fMax4;
                                    float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                                    eVar.b = fMin4;
                                    float f6 = eVar.a;
                                    fVar2 = eVar.j;
                                    fVar2.getClass();
                                    dAbs = Math.abs(f6);
                                    i = i12;
                                    if (dAbs < fVar2.e || Math.abs(fMin4 - ((float) fVar2.i)) >= fVar2.d) {
                                        z2 = false;
                                    } else {
                                        eVar.b = (float) eVar.j.i;
                                        eVar.a = 0.0f;
                                    }
                                    float fMin5 = Math.min(eVar.b, Float.MAX_VALUE);
                                    eVar.b = fMin5;
                                    float fMax5 = Math.max(fMin5, -3.4028235E38f);
                                    eVar.b = fMax5;
                                    eVar.c(fMax5);
                                    if (z2) {
                                        arrayList = eVar.h;
                                        eVar.e = false;
                                        cVarB = androidx.dynamicanimation.animation.e.b();
                                        cVarB.a.remove(eVar);
                                        arrayList2 = cVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f = true;
                                        }
                                        j5 = 0;
                                        eVar.f = 0L;
                                        while (i2 < arrayList.size()) {
                                            if (arrayList.get(i2) == null) {
                                                arrayList.get(i2).getClass();
                                                androidx.transition.k.h();
                                                return;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j5 = 0;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(eVar.b, Float.MAX_VALUE);
                                eVar.b = fMin6;
                                float fMax6 = Math.max(fMin6, -3.4028235E38f);
                                eVar.b = fMax6;
                                eVar.c(fMax6);
                                if (z2) {
                                    arrayList = eVar.h;
                                    eVar.e = false;
                                    cVarB = androidx.dynamicanimation.animation.e.b();
                                    cVarB.a.remove(eVar);
                                    arrayList2 = cVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        cVarB.f = true;
                                    }
                                    j5 = 0;
                                    eVar.f = 0L;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) == null) {
                                            arrayList.get(i2).getClass();
                                            androidx.transition.k.h();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j5 = 0;
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                            jUptimeMillis2 = jUptimeMillis2;
                            j5 = j6;
                            i = i12;
                        }
                    }
                    i12 = i + 1;
                    j6 = j5;
                    jUptimeMillis2 = jUptimeMillis2;
                    jUptimeMillis = jUptimeMillis;
                }
                if (cVar.f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        cVar.h.b();
                    }
                    cVar.f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) cVar.e.y).postFrameCallback(new androidx.compose.ui.text.input.c0(1, cVar.d));
                    return;
                }
                return;
            case 8:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.y;
                synchronized (tVar.d) {
                    try {
                        if (tVar.h == null) {
                            return;
                        }
                        try {
                            androidx.core.provider.i iVarC = tVar.c();
                            int i13 = iVarC.f;
                            if (i13 == 2) {
                                synchronized (tVar.d) {
                                }
                            }
                            if (i13 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                            }
                            try {
                                int i14 = androidx.core.os.e.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                androidx.work.impl.model.f fVar6 = tVar.c;
                                Context context = tVar.a;
                                fVar6.getClass();
                                androidx.core.provider.i[] iVarArr = {iVarC};
                                _COROUTINE.b bVar2 = androidx.core.graphics.f.a;
                                Trace.beginSection(kotlin.math.a.S("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceK = androidx.core.graphics.f.a.k(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferY = android.support.v4.media.session.b.y(tVar.a, iVarC.a);
                                    if (mappedByteBufferY == null || typefaceK == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(typefaceK, com.imsdk.a.y(mappedByteBufferY));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (tVar.d) {
                                            try {
                                                com.google.firebase.b bVar3 = tVar.h;
                                                if (bVar3 != null) {
                                                    bVar3.R(nVar);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            break;
                                        }
                                        tVar.b();
                                        return;
                                    } catch (Throwable th5) {
                                        int i15 = androidx.core.os.e.a;
                                        Trace.endSection();
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                int i16 = androidx.core.os.e.a;
                                Trace.endSection();
                                throw th7;
                            }
                            break;
                        } catch (Throwable th8) {
                            synchronized (tVar.d) {
                                try {
                                    com.google.firebase.b bVar4 = tVar.h;
                                    if (bVar4 != null) {
                                        bVar4.Q(th8);
                                    }
                                    tVar.b();
                                    return;
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            case 9:
                f0 f0Var = (f0) this.y;
                androidx.lifecycle.x xVar = f0Var.C;
                if (f0Var.y == 0) {
                    f0Var.z = true;
                    xVar.e(androidx.lifecycle.n.ON_PAUSE);
                }
                if (f0Var.e == 0 && f0Var.z) {
                    xVar.e(androidx.lifecycle.n.ON_STOP);
                    f0Var.A = true;
                    return;
                }
                return;
            case 10:
                androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.y;
                ((Context) b1Var.y).unregisterReceiver((androidx.media3.common.audio.a) b1Var.z);
                return;
            case 11:
                androidx.media3.common.audio.a aVar = (androidx.media3.common.audio.a) this.y;
                if (aVar.c.e) {
                    aVar.a.e.S(3, false);
                    return;
                }
                return;
            case 12:
                a();
                return;
            case 13:
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.y;
                androidx.appcompat.widget.o oVar = c0Var.B;
                Context context2 = c0Var.e;
                String str = i0.a;
                int iGenerateAudioSessionId = androidx.media3.common.audio.h.l(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                oVar.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((androidx.media3.common.util.f0) oVar.c).a.getLooper()) {
                    obj = oVar.e;
                } else {
                    _COROUTINE.a.A(looperMyLooper == ((androidx.media3.common.util.f0) oVar.b).a.getLooper());
                    obj = oVar.f;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    oVar.f = numValueOf;
                    androidx.media3.common.util.c cVar2 = new androidx.media3.common.util.c(oVar, numValueOf, i4);
                    androidx.media3.common.util.f0 f0Var2 = (androidx.media3.common.util.f0) oVar.c;
                    if (f0Var2.a.getLooper().getThread().isAlive()) {
                        f0Var2.d(cVar2);
                    }
                    c0Var.J(1, 10, Integer.valueOf(iGenerateAudioSessionId));
                    c0Var.J(2, 10, Integer.valueOf(iGenerateAudioSessionId));
                    return;
                }
                return;
            case 14:
                androidx.media3.exoplayer.analytics.g gVar = ((k0) this.y).T;
                gVar.M(gVar.H(), 1034, new androidx.media3.exoplayer.v(14));
                return;
            case 15:
                b();
                return;
            case 16:
                androidx.media3.exoplayer.analytics.g gVar2 = (androidx.media3.exoplayer.analytics.g) this.y;
                gVar2.M(gVar2.H(), 1028, new androidx.media3.exoplayer.v(i3));
                gVar2.C.d();
                return;
            case 17:
                ((androidx.media3.exoplayer.audio.e) this.y).c();
                return;
            case 18:
                androidx.media3.common.util.o oVar2 = (androidx.media3.common.util.o) this.y;
                oVar2.getClass();
                if (Thread.currentThread() == oVar2.a) {
                    oVar2.e(-1, new androidx.media3.exoplayer.analytics.d(i3));
                    return;
                }
                return;
            case 19:
                n0 n0Var = (n0) this.y;
                if (n0Var.a0 >= 300000) {
                    ((q0) n0Var.n.y).q1 = true;
                    n0Var.a0 = 0L;
                    return;
                }
                return;
            case 20:
                ((androidx.media3.exoplayer.hls.c) this.y).F();
                return;
            case 21:
                c();
                return;
            case 22:
                ((androidx.media3.exoplayer.trackselection.o) this.y).i();
                return;
            case 23:
                ((androidx.media3.exoplayer.video.c) this.y).h.d();
                return;
            case 24:
                ((androidx.media3.exoplayer.video.s) this.y).m--;
                return;
            case 25:
                androidx.media3.exoplayer.video.a0 a0Var3 = (androidx.media3.exoplayer.video.a0) this.y;
                a0Var3.e.postVsyncCallback(a0Var3);
                return;
            case 26:
                androidx.media3.exoplayer.video.spherical.k kVar = (androidx.media3.exoplayer.video.spherical.k) this.y;
                Surface surface = kVar.E;
                if (surface != null) {
                    Iterator it = kVar.e.iterator();
                    while (it.hasNext()) {
                        ((androidx.media3.exoplayer.x) it.next()).e.P(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.D;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.D = null;
                kVar.E = null;
                return;
            case 27:
                ((androidx.media3.ui.g) this.y).d(false);
                return;
            case 28:
                ((androidx.media3.ui.v) this.y).s();
                return;
            default:
                ((h0) this.y).invalidate();
                return;
        }
    }

    public /* synthetic */ l(k0 k0Var, e1 e1Var) {
        this.e = 15;
        this.y = e1Var;
    }

    public /* synthetic */ l(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
