package androidx.media3.exoplayer.dash.manifest;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.w0;
import com.app.mlounge.data.repository.l0;
import com.appsalt.internal.n4;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.u3;
import com.google.android.gms.measurement.internal.z1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements androidx.media3.exoplayer.dash.j, androidx.media3.exoplayer.mediacodec.m, androidx.media3.exoplayer.text.d, androidx.media3.extractor.text.l, w0, androidx.sqlite.db.d, coil3.util.d, okhttp3.o, com.google.android.gms.common.api.internal.h, com.google.android.gms.common.internal.c, o4, com.google.android.gms.measurement.internal.w0, com.google.android.gms.tasks.f, com.google.android.gms.tasks.e, com.google.android.gms.tasks.c {
    public Object e;

    public t(int i) {
        switch (i) {
            case 3:
                this.e = new SparseArray();
                break;
            case 5:
                this.e = new androidx.work.impl.model.f(15);
                break;
            case 9:
                this.e = new v();
                break;
            case 12:
                this.e = null;
                break;
            case 14:
                this.e = coil3.svg.internal.a.e(Looper.getMainLooper());
                break;
            case 21:
                this.e = Collections.synchronizedMap(new androidx.collection.f(0));
                break;
            case 29:
                this.e = new CountDownLatch(1);
                break;
            default:
                this.e = new androidx.media3.exoplayer.hls.e(5, 1.0f, false, 0);
                break;
        }
    }

    public static t Q(String str) {
        return new t((TextUtils.isEmpty(str) || str.length() > 1) ? z1.UNINITIALIZED : c2.e(str.charAt(0)));
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long A() {
        return 0L;
    }

    @Override // androidx.media3.extractor.text.l
    public int B() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.w0
    public int C(View view) {
        return view.getBottom() + ((d0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long D(long j) {
        return 1L;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long E(long j, long j2) {
        return 1L;
    }

    @Override // com.google.android.gms.tasks.e
    public void F(Exception exc) {
        ((CountDownLatch) this.e).countDown();
    }

    @Override // androidx.sqlite.db.d
    public void G(androidx.sqlite.db.c cVar) {
        androidx.sqlite.driver.e eVar = (androidx.sqlite.driver.e) this.e;
        int length = eVar.A.length;
        for (int i = 1; i < length; i++) {
            int i2 = eVar.A[i];
            if (i2 == 1) {
                cVar.f(i, eVar.B[i]);
            } else if (i2 == 2) {
                cVar.G(eVar.C[i], i);
            } else if (i2 == 3) {
                String str = eVar.D[i];
                str.getClass();
                cVar.m(i, str);
            } else if (i2 == 4) {
                byte[] bArr = eVar.E[i];
                bArr.getClass();
                cVar.h(bArr, i);
            } else if (i2 == 5) {
                cVar.j(i);
            }
        }
    }

    public androidx.media3.exoplayer.drm.h I() {
        return null;
    }

    public androidx.media3.exoplayer.drm.b J() {
        return (androidx.media3.exoplayer.drm.b) this.e;
    }

    public UUID K() {
        return androidx.media3.common.g.a;
    }

    public int L() {
        return 1;
    }

    public Flow N(androidx.work.impl.model.p pVar) {
        pVar.getClass();
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((androidx.work.impl.constraints.controllers.d) obj).b(pVar)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.p(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((androidx.work.impl.constraints.controllers.d) it.next()).a(pVar.j));
        }
        return FlowKt.distinctUntilChanged(new l0((Flow[]) kotlin.collections.p.b0(arrayList3).toArray(new Flow[0]), 2));
    }

    public void O() {
        u3 u3Var = (u3) this.e;
        u3Var.v();
        p1 p1Var = (p1) u3Var.e;
        d1 d1Var = p1Var.B;
        p1.k(d1Var);
        p1Var.H.getClass();
        if (d1Var.E(System.currentTimeMillis())) {
            d1 d1Var2 = p1Var.B;
            p1.k(d1Var2);
            d1Var2.I.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                u0Var.K.a("Detected application was in foreground");
                R(System.currentTimeMillis(), p1Var.A.G(null, f0.e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    public void P(long j, long j2) {
        u3 u3Var = (u3) this.e;
        u3Var.v();
        u3Var.z();
        p1 p1Var = (p1) u3Var.e;
        d1 d1Var = p1Var.B;
        p1.k(d1Var);
        if (d1Var.E(j)) {
            p1.k(d1Var);
            d1Var.I.b(true);
            p1Var.r().A();
        }
        p1.k(d1Var);
        d1Var.M.h(j);
        if (d1Var.I.a()) {
            R(j, j2);
        }
    }

    public void R(long j, long j2) {
        u3 u3Var = (u3) this.e;
        u3Var.v();
        p1 p1Var = (p1) u3Var.e;
        if (p1Var.d()) {
            d1 d1Var = p1Var.B;
            p1.k(d1Var);
            d1Var.M.h(j);
            p1Var.H.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.K.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.G(j, lValueOf, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid");
            p1.k(d1Var);
            d1Var.N.h(j3);
            d1Var.I.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            p1.l(s2Var);
            s2Var.D(j, j2, bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s");
            String strT = d1Var.S.t();
            if (TextUtils.isEmpty(strT)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strT);
            p1.l(s2Var);
            s2Var.D(j, j2, bundle2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr");
        }
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long a(long j) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) obj2;
        com.google.android.gms.common.internal.service.a aVar = (com.google.android.gms.common.internal.service.a) ((com.google.android.gms.common.internal.service.d) obj).t();
        com.google.android.gms.common.internal.m mVar = (com.google.android.gms.common.internal.m) this.e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f);
        int i = com.google.android.gms.internal.base.c.a;
        if (mVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            mVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            jVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((CountDownLatch) this.e).countDown();
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void c(int i, androidx.media3.decoder.a aVar, long j, int i2) {
        ((MediaCodec) this.e).queueSecureInputBuffer(i, 0, aVar.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void d(Bundle bundle) {
        ((MediaCodec) this.e).setParameters(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.o4
    public void e(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        s2 s2Var = (s2) this.e;
        if (zIsEmpty) {
            s2Var.z(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_err", bundle);
        } else {
            s2Var.getClass();
            kotlinx.coroutines.future.a.u("Unexpected call on client side");
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.e).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.android.gms.measurement.internal.w0
    public /* synthetic */ void g(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((j4) this.e).B(str, i, th, bArr, map);
    }

    @Override // com.google.android.gms.common.internal.c
    public void h(com.google.android.gms.common.b bVar) {
        ((com.google.android.gms.common.api.h) this.e).h(bVar);
    }

    @Override // coil3.util.d
    public boolean i(coil3.size.h hVar) {
        coil3.size.c cVar = hVar.a;
        if ((cVar instanceof coil3.size.a ? ((coil3.size.a) cVar).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        coil3.size.c cVar2 = hVar.b;
        return (cVar2 instanceof coil3.size.a ? ((coil3.size.a) cVar2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // androidx.media3.extractor.text.l
    public void j(byte[] bArr, int i, int i2, androidx.media3.extractor.text.k kVar, androidx.media3.common.util.h hVar) {
        androidx.media3.common.text.b bVarA;
        v vVar = (v) this.e;
        vVar.K(bArr, i + i2);
        vVar.M(i);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            _COROUTINE.a.n("Incomplete Mp4Webvtt Top Level box header found.", vVar.a() >= 8);
            int iM = vVar.m();
            if (vVar.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                androidx.media3.common.text.a aVarA = null;
                while (i3 > 0) {
                    _COROUTINE.a.n("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = vVar.m();
                    int iM3 = vVar.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = vVar.a;
                    int i5 = vVar.b;
                    String str = i0.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    vVar.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        androidx.media3.extractor.text.webvtt.g gVar = new androidx.media3.extractor.text.webvtt.g();
                        androidx.media3.extractor.text.webvtt.h.e(str2, gVar);
                        aVarA = gVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = androidx.media3.extractor.text.webvtt.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    aVarA.b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = androidx.media3.extractor.text.webvtt.h.a;
                    androidx.media3.extractor.text.webvtt.g gVar2 = new androidx.media3.extractor.text.webvtt.g();
                    gVar2.c = charSequenceF;
                    bVarA = gVar2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                vVar.N(iM - 8);
            }
        }
        hVar.accept(new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // okhttp3.o
    public List l(String str) {
        return ((n4) this.e).b.a(3, str);
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long m(long j, long j2) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.w0
    public int n(View view) {
        return (view.getTop() - ((d0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((d0) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long p(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.dash.j
    public j q(long j) {
        return (j) this.e;
    }

    @Override // androidx.recyclerview.widget.w0
    public int r() {
        return ((c0) this.e).F();
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long s(long j, long j2) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.w0
    public int t() {
        c0 c0Var = (c0) this.e;
        return c0Var.n - c0Var.C();
    }

    @Override // androidx.sqlite.db.d
    public String u() {
        return ((androidx.sqlite.driver.e) this.e).y;
    }

    @Override // coil3.util.d
    public boolean v() {
        boolean z;
        coil3.util.c cVar = coil3.util.c.a;
        androidx.media3.exoplayer.hls.c cVar2 = (androidx.media3.exoplayer.hls.c) this.e;
        synchronized (cVar) {
            try {
                int i = coil3.util.c.c;
                coil3.util.c.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > coil3.util.c.d + ((long) 30000)) {
                    coil3.util.c.c = 0;
                    coil3.util.c.d = SystemClock.uptimeMillis();
                    String[] list = coil3.util.c.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z2 = length < 800;
                    coil3.util.c.e = z2;
                    if (!z2 && cVar2 != null) {
                        coil3.util.h hVar = coil3.util.h.A;
                        if (((coil3.util.h) cVar2.y).compareTo(hVar) <= 0) {
                            androidx.media3.exoplayer.hls.c.E("FileDescriptorCounter", hVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                        }
                    }
                }
                z = coil3.util.c.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.c
    public void x() {
        ((CountDownLatch) this.e).countDown();
    }

    @Override // androidx.media3.exoplayer.dash.j
    public boolean y() {
        return true;
    }

    @Override // androidx.recyclerview.widget.w0
    public View z(int i) {
        return ((c0) this.e).t(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.m
    public void w() {
    }

    public void H(androidx.media3.exoplayer.drm.d dVar) {
    }

    public void M(androidx.media3.exoplayer.drm.d dVar) {
    }

    @Override // androidx.media3.exoplayer.dash.j
    public long k(long j, long j2) {
        return j2;
    }

    public /* synthetic */ t(Object obj) {
        this.e = obj;
    }

    public t(androidx.work.impl.constraints.trackers.i iVar) {
        iVar.getClass();
        String str = androidx.work.impl.constraints.j.a;
        androidx.navigation.u uVar = iVar.b;
        androidx.work.impl.constraints.trackers.g gVar = iVar.d;
        ArrayList arrayListL = kotlin.collections.q.l(new androidx.work.impl.constraints.controllers.c(uVar, 0), new androidx.work.impl.constraints.controllers.c(iVar.c), new androidx.work.impl.constraints.controllers.c(iVar.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = iVar.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            arrayListL.add(new androidx.work.impl.constraints.f((ConnectivityManager) systemService));
        } else {
            gVar.getClass();
            arrayListL.addAll(kotlin.collections.q.k(new androidx.work.impl.constraints.controllers.c(gVar, 2), new androidx.work.impl.constraints.controllers.c(gVar, 3), new androidx.work.impl.constraints.controllers.f(gVar), new androidx.work.impl.constraints.controllers.e(gVar)));
        }
        this.e = arrayListL;
    }
}
