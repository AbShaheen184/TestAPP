package com.google.android.material.shape;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.l0;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.measurement.internal.f0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class f implements androidx.compose.ui.text.font.p, androidx.lifecycle.viewmodel.b, androidx.media3.exoplayer.upstream.p, androidx.media3.exoplayer.upstream.k, kotlin.coroutines.i, androidx.sqlite.db.a, com.google.android.datatransport.runtime.time.a, com.google.android.gms.dynamite.d, com.google.android.gms.measurement.internal.w {
    public static f y;
    public final /* synthetic */ int e;
    public static final /* synthetic */ f z = new f(22);
    public static final /* synthetic */ f A = new f(23);
    public static final /* synthetic */ f B = new f(24);
    public static final /* synthetic */ f C = new f(25);
    public static final /* synthetic */ f D = new f(26);
    public static final /* synthetic */ f E = new f(27);
    public static final /* synthetic */ f F = new f(28);
    public static final /* synthetic */ f G = new f(29);

    public f(Handler handler) {
        this.e = 19;
        new androidx.core.provider.l(handler, 1);
    }

    public static androidx.navigation.i j(androidx.media3.exoplayer.mediacodec.g gVar, androidx.navigation.t tVar, Bundle bundle, androidx.lifecycle.o oVar, androidx.navigation.m mVar) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        tVar.getClass();
        oVar.getClass();
        return new androidx.navigation.i(gVar, tVar, bundle, oVar, mVar, string, null);
    }

    public static Typeface k(String str, androidx.compose.ui.text.font.k kVar, int i) {
        if (i == 0 && kotlin.jvm.internal.l.a(kVar, androidx.compose.ui.text.font.k.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iQ = androidx.work.impl.v.q(kVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iQ) : Typeface.create(str, iQ);
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 22:
                return new Boolean(((Boolean) k3.a.get()).booleanValue());
            case 23:
                return new Boolean(((Boolean) w3.a.get()).booleanValue());
            case 24:
                List list = f0.a;
                return (String) o3.a.get();
            case 25:
                List list2 = f0.a;
                e3.y.get();
                return Integer.valueOf((int) ((Long) f3.a.g(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 26:
                List list3 = f0.a;
                e3.y.get();
                return (String) f3.a.i("measurement.upload.url", 78, "https://app-measurement.com/a").get();
            case 27:
                List list4 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 28:
                List list5 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            default:
                List list6 = f0.a;
                e3.y.get();
                return (Long) f3.a.g(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // androidx.compose.ui.text.font.p
    public Typeface b(androidx.compose.ui.text.font.m mVar, androidx.compose.ui.text.font.k kVar, int i) {
        String str;
        mVar.getClass();
        int i2 = kVar.e / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "sans-serif-light";
        } else if (i2 == 4) {
            str = "sans-serif";
        } else if (i2 == 5) {
            str = "sans-serif-medium";
        } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
            str = "sans-serif-black";
        } else {
            str = "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceK = k(str, kVar, i);
            if (!kotlin.jvm.internal.l.a(typefaceK, Typeface.create(Typeface.DEFAULT, androidx.work.impl.v.q(kVar, i))) && !kotlin.jvm.internal.l.a(typefaceK, k(null, kVar, i))) {
                typeface = typefaceK;
            }
        }
        return typeface == null ? k("sans-serif", kVar, i) : typeface;
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // androidx.sqlite.db.a
    public androidx.sqlite.db.b d(l0 l0Var) {
        return new androidx.sqlite.db.framework.g((Context) l0Var.d, (String) l0Var.e, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) l0Var.f, l0Var.b, l0Var.c);
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public Object e(Uri uri, androidx.media3.datasource.j jVar) {
        return Long.valueOf(i0.T(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public void f() {
        synchronized (androidx.media3.exoplayer.util.b.a) {
            Object obj = androidx.media3.exoplayer.util.b.b;
            synchronized (obj) {
                if (androidx.media3.exoplayer.util.b.c) {
                    return;
                }
                long jA = androidx.media3.exoplayer.util.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    androidx.media3.exoplayer.util.b.d = jA;
                    androidx.media3.exoplayer.util.b.c = true;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.d
    public androidx.media3.container.j g(Context context, String str, com.google.android.gms.dynamite.c cVar) {
        androidx.media3.container.j jVar = new androidx.media3.container.j();
        jVar.a = cVar.d(context, str);
        int i = 1;
        int iC = cVar.c(context, str, true);
        jVar.b = iC;
        int i2 = jVar.a;
        if (i2 == 0) {
            i2 = 0;
            if (iC == 0) {
                i = 0;
            } else if (i2 >= iC) {
                i = -1;
            }
        } else if (i2 >= iC) {
            i = -1;
        }
        jVar.c = i;
        return jVar;
    }

    @Override // androidx.compose.ui.text.font.p
    public Typeface h(androidx.compose.ui.text.font.k kVar, int i) {
        return k(null, kVar, i);
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public f(androidx.compose.animation.z zVar) {
        this.e = 2;
    }

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public void i() {
    }
}
