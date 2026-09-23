package com.google.common.util.concurrent;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.exoplayer.l1;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.dd;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.ic;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.mc;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.pc;
import com.google.android.gms.internal.measurement.qc;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.zc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.a3;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.d2;
import com.google.android.gms.measurement.internal.e1;
import com.google.android.gms.measurement.internal.f2;
import com.google.android.gms.measurement.internal.h2;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.l3;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u3;
import com.google.android.gms.measurement.internal.w1;
import com.google.android.gms.measurement.internal.x2;
import com.google.android.gms.measurement.internal.y1;
import com.google.android.gms.measurement.internal.z1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public k0(s2 s2Var, b6 b6Var) {
        this.e = 16;
        this.y = b6Var;
        Objects.requireNonNull(s2Var);
        this.z = s2Var;
    }

    private final void a() {
        try {
            ((Runnable) this.z).run();
            synchronized (((androidx.room.y) this.y).B) {
                ((androidx.room.y) this.y).a();
            }
        } catch (Throwable th) {
            synchronized (((androidx.room.y) this.y).B) {
                ((androidx.room.y) this.y).a();
                throw th;
            }
        }
    }

    private final void b() {
        com.google.android.gms.cloudmessaging.l lVar = (com.google.android.gms.cloudmessaging.l) this.y;
        int i = ((com.google.android.gms.cloudmessaging.m) this.z).a;
        synchronized (lVar) {
            com.google.android.gms.cloudmessaging.m mVar = (com.google.android.gms.cloudmessaging.m) lVar.B.get(i);
            if (mVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                lVar.B.remove(i);
                mVar.b(new androidx.compose.runtime.snapshots.g("Timed out waiting for response", (Throwable) null));
                lVar.c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00af A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:33:0x008f, B:35:0x0093, B:37:0x0097, B:42:0x00a4, B:47:0x00af, B:48:0x00bb), top: B:61:0x008f }] */
    private final void c() {
        boolean z;
        boolean z2;
        androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.y;
        s5 s5Var = (s5) this.z;
        j5 j5Var = (j5) fVar.b;
        if (j5Var == null) {
            return;
        }
        s5Var.getClass();
        try {
            byte[] bArr = (byte[]) s5Var.y;
            a1 a1Var = a1.a;
            int i = com.google.android.gms.internal.measurement.o0.a;
            qc qcVarV = qc.v(bArr, a1.b);
            boolean z3 = false;
            for (mc mcVar : ((zc) j5Var.z).f) {
                List listU = qcVarV.u();
                mcVar.getClass();
                s5 s5Var2 = pc.i;
                s5Var2.getClass();
                if (listU == null || listU.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listU.iterator();
                    z = false;
                    while (it.hasNext()) {
                        ic icVar = (ic) ((ConcurrentHashMap) s5Var2.y).get((String) it.next());
                        if (icVar != null) {
                            pc pcVar = icVar.a;
                            if (pcVar.e) {
                                androidx.compose.material.ripple.g gVar = pcVar.a;
                                if (gVar != null && (gVar.a || ((androidx.core.view.r) gVar.e).a == 3 || pcVar.h.b())) {
                                    synchronized (pcVar) {
                                        try {
                                            androidx.compose.material.ripple.g gVar2 = pcVar.a;
                                            if (gVar2 != null) {
                                                if (gVar2.a) {
                                                    pcVar.a = null;
                                                    ((AtomicInteger) pcVar.g.y).incrementAndGet();
                                                } else if ((((androidx.core.view.r) gVar2.e).a == 3) || pcVar.h.b()) {
                                                    pcVar.a = null;
                                                    ((AtomicInteger) pcVar.g.y).incrementAndGet();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    ((dd) j5Var.y).a();
                    z3 = true;
                }
            }
        } catch (t1 unused) {
            j5Var.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c3 A[Catch: NotFoundException -> 0x02c8, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x02c8, blocks: (B:100:0x02b2, B:103:0x02c3), top: B:296:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x0307 A[EDGE_INSN: B:118:0x0307->B:119:0x0309 BREAK  A[LOOP:0: B:113:0x02ed->B:312:?]] */
    /* JADX WARN: Code duplicated, block: B:120:0x030b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x032f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0379  */
    /* JADX WARN: Code duplicated, block: B:127:0x0382  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:142:0x03f7 A[PHI: r13
  0x03f7: PHI (r13v20 boolean) = (r13v8 boolean), (r13v7 boolean) binds: [B:141:0x03f6, B:138:0x03f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x041c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0420  */
    /* JADX WARN: Code duplicated, block: B:147:0x0424  */
    /* JADX WARN: Code duplicated, block: B:148:0x0428  */
    /* JADX WARN: Code duplicated, block: B:151:0x043a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0452  */
    /* JADX WARN: Code duplicated, block: B:155:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x047b  */
    /* JADX WARN: Code duplicated, block: B:160:0x049d  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b1 A[PHI: r28 r29 r30
  0x04b1: PHI (r28v2 com.google.android.gms.measurement.internal.p1) = (r28v0 com.google.android.gms.measurement.internal.p1), (r28v3 com.google.android.gms.measurement.internal.p1) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]
  0x04b1: PHI (r29v2 com.google.android.gms.measurement.internal.s0) = (r29v0 com.google.android.gms.measurement.internal.s0), (r29v3 com.google.android.gms.measurement.internal.s0) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]
  0x04b1: PHI (r30v2 com.google.android.gms.measurement.internal.p4) = (r30v0 com.google.android.gms.measurement.internal.p4), (r30v3 com.google.android.gms.measurement.internal.p4) binds: [B:159:0x049b, B:157:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:175:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x0513  */
    /* JADX WARN: Code duplicated, block: B:182:0x0523  */
    /* JADX WARN: Code duplicated, block: B:185:0x0542  */
    /* JADX WARN: Code duplicated, block: B:187:0x0550 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x056d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0573  */
    /* JADX WARN: Code duplicated, block: B:197:0x0591  */
    /* JADX WARN: Code duplicated, block: B:201:0x05be  */
    /* JADX WARN: Code duplicated, block: B:204:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:213:0x0601  */
    /* JADX WARN: Code duplicated, block: B:214:0x060c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0616  */
    /* JADX WARN: Code duplicated, block: B:220:0x062c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0638  */
    /* JADX WARN: Code duplicated, block: B:227:0x0646  */
    /* JADX WARN: Code duplicated, block: B:230:0x065a  */
    /* JADX WARN: Code duplicated, block: B:231:0x065f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0671  */
    /* JADX WARN: Code duplicated, block: B:235:0x0691 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x0707  */
    /* JADX WARN: Code duplicated, block: B:248:0x0723  */
    /* JADX WARN: Code duplicated, block: B:251:0x072f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0779  */
    /* JADX WARN: Code duplicated, block: B:262:0x0781  */
    /* JADX WARN: Code duplicated, block: B:263:0x0783  */
    /* JADX WARN: Code duplicated, block: B:265:0x078b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0798  */
    /* JADX WARN: Code duplicated, block: B:273:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:275:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:276:0x07da  */
    /* JADX WARN: Code duplicated, block: B:278:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:280:0x080e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0824  */
    /* JADX WARN: Code duplicated, block: B:287:0x0838  */
    /* JADX WARN: Code duplicated, block: B:296:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0188 A[Catch: NameNotFoundException -> 0x01a5, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:41:0x017d, B:43:0x0188, B:45:0x0194), top: B:302:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0194 A[Catch: NameNotFoundException -> 0x01a5, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:41:0x017d, B:43:0x0188, B:45:0x0194), top: B:302:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0199  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0203  */
    /* JADX WARN: Code duplicated, block: B:71:0x020e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0219  */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x022f  */
    /* JADX WARN: Code duplicated, block: B:75:0x023a  */
    /* JADX WARN: Code duplicated, block: B:79:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x024f A[Catch: IllegalStateException -> 0x0270, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:298:0x0246 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x025b  */
    /* JADX WARN: Code duplicated, block: B:84:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261 A[Catch: IllegalStateException -> 0x0270, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:298:0x0246 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a8  */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.measurement.internal.r2] */
    private final void d() throws Throwable {
        com.google.android.gms.measurement.internal.n0 n0Var;
        String str;
        String string;
        int i;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iG;
        List listAsList;
        p1 p1Var;
        Bundle bundleH;
        Integer numValueOf;
        String[] stringArray;
        x2 x2Var;
        com.google.android.gms.measurement.internal.s0 s0Var;
        com.google.android.gms.measurement.internal.s0 s0Var2;
        com.google.android.gms.measurement.internal.s0 s0Var3;
        com.google.android.gms.measurement.internal.s0 s0Var4;
        String strB;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final s2 s2Var;
        int iA;
        boolean zG;
        boolean z;
        com.google.android.gms.measurement.internal.s0 s0Var5;
        com.google.android.gms.measurement.internal.u0 u0Var;
        b1 b1Var;
        c2 c2VarC;
        z1 z1VarL;
        z1 z1VarL2;
        b2 b2Var;
        z1 z1Var;
        p1 p1Var2;
        com.google.android.gms.measurement.internal.s0 s0Var6;
        p4 p4Var;
        c2 c2Var;
        boolean z2;
        p1 p1Var3;
        z1 z1VarL3;
        z1 z1VarL4;
        Boolean boolI;
        l1 l1Var;
        o1 o1Var;
        p1 p1Var4;
        p4 p4Var2;
        b1 b1Var2;
        com.google.android.gms.measurement.internal.u0 u0Var2;
        boolean zD;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z3;
        long jMax;
        com.google.android.gms.measurement.internal.s0 s0Var7;
        Context context;
        IntentFilter intentFilter;
        androidx.media3.common.util.s sVar;
        boolean z4;
        Context context2;
        int i3;
        Iterator it;
        String str3;
        p4 p4Var3;
        String strB2;
        Bundle bundle;
        p1 p1Var5 = (p1) this.z;
        f2 f2Var = (f2) this.y;
        m1 m1Var = p1Var5.D;
        com.google.android.gms.measurement.internal.u0 u0Var3 = p1Var5.C;
        d1 d1Var = p1Var5.B;
        p4 p4Var4 = p1Var5.F;
        p1.m(m1Var);
        m1Var.v();
        com.google.android.gms.measurement.internal.g gVar = p1Var5.A;
        ((p1) gVar.e).getClass();
        com.google.android.gms.measurement.internal.p pVar = new com.google.android.gms.measurement.internal.p(p1Var5);
        pVar.y();
        p1Var5.P = pVar;
        j6 j6Var = f2Var.d;
        long j2 = j6Var == null ? 0L : j6Var.e;
        String string2 = "";
        if (j6Var != null && (bundle = j6Var.A) != null) {
            string2 = bundle.getString("runtime_google_app_id", "");
        }
        com.google.android.gms.measurement.internal.n0 n0Var2 = new com.google.android.gms.measurement.internal.n0(p1Var5, f2Var.c, j2, string2);
        n0Var2.x();
        p1Var5.Q = n0Var2;
        com.google.android.gms.measurement.internal.p0 p0Var = new com.google.android.gms.measurement.internal.p0(p1Var5);
        p0Var.x();
        p1Var5.N = p0Var;
        m3 m3Var = new m3(p1Var5);
        m3Var.x();
        p1Var5.O = m3Var;
        boolean z5 = p4Var4.y;
        p1 p1Var6 = (p1) p4Var4.e;
        if (z5) {
            kotlinx.coroutines.future.a.u("Can't initialize twice");
            return;
        }
        p4Var4.v();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                com.google.android.gms.measurement.internal.u0 u0Var4 = ((p1) p4Var4.e).C;
                p1.m(u0Var4);
                u0Var4.F.a("Utils falling back to Random for random id");
            }
        }
        p4Var4.A.set(jNextLong);
        p1Var6.Z.incrementAndGet();
        p4Var4.y = true;
        if (d1Var.y) {
            kotlinx.coroutines.future.a.u("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((p1) d1Var.e).e.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        d1Var.z = sharedPreferences2;
        boolean z6 = sharedPreferences2.getBoolean("has_been_opened", false);
        d1Var.O = z6;
        if (!z6) {
            SharedPreferences.Editor editorEdit = d1Var.z.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        d1Var.B = new c1(d1Var, Math.max(0L, ((Long) com.google.android.gms.measurement.internal.f0.d.a(null)).longValue()));
        ((p1) d1Var.e).Z.incrementAndGet();
        d1Var.y = true;
        com.google.android.gms.measurement.internal.n0 n0Var3 = p1Var5.Q;
        if (n0Var3.y) {
            kotlinx.coroutines.future.a.u("Can't initialize twice");
            return;
        }
        p1 p1Var7 = (p1) n0Var3.e;
        com.google.android.gms.measurement.internal.u0 u0Var5 = p1Var7.C;
        com.google.android.gms.measurement.internal.u0 u0Var6 = p1Var7.C;
        p1.m(u0Var5);
        u0Var5.K.c(Long.valueOf(n0Var3.G), Long.valueOf(n0Var3.F), "sdkVersion bundled with app, dynamiteVersion");
        Context context3 = p1Var7.e;
        String packageName = context3.getPackageName();
        PackageManager packageManager = context3.getPackageManager();
        String str4 = "";
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                n0Var = n0Var2;
                str = "Can't initialize twice";
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    p1.m(u0Var6);
                    u0Var6.C.b(com.google.android.gms.measurement.internal.u0.D(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    p1.m(u0Var6);
                                    u0Var6.C.c(com.google.android.gms.measurement.internal.u0.D(packageName), string, "Error retrieving package info. appId, appName");
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        n0Var3.z = packageName;
                        n0Var3.C = str7;
                        n0Var3.A = str2;
                        n0Var3.B = i;
                        n0Var3.D = string;
                        n0Var3.E = 0L;
                        iG = p1Var7.g();
                        if (iG == 0) {
                            p1.m(u0Var6);
                            u0Var6.K.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            p1.m(u0Var6);
                            u0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement disabled");
                            p1.m(u0Var6);
                            u0Var6.D.a("Invalid scion state in identity");
                        } else {
                            p1.m(u0Var6);
                            u0Var6.I.a("App measurement disabled due to denied storage consent");
                        }
                        n0Var3.L = "";
                        strB2 = n0Var3.J;
                        if (TextUtils.isEmpty(strB2)) {
                            strB2 = d2.b(context3, p1Var7.M);
                        }
                        if (!TextUtils.isEmpty(strB2)) {
                            str4 = strB2;
                        }
                        n0Var3.L = str4;
                        if (iG == 0) {
                            p1.m(u0Var6);
                            u0Var6.K.c(n0Var3.z, n0Var3.L, "App measurement enabled for app package, google app id");
                        }
                        listAsList = null;
                        n0Var3.H = null;
                        com.google.android.gms.measurement.internal.g gVar2 = p1Var7.A;
                        p1Var = (p1) gVar2.e;
                        com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
                        bundleH = gVar2.H();
                        if (bundleH != null) {
                            if (bundleH.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    com.google.android.gms.measurement.internal.u0 u0Var7 = p1Var.C;
                                    p1.m(u0Var7);
                                    u0Var7.C.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            }
                            if (listAsList != null) {
                                n0Var3.H = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        n0Var3.H = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        p4Var3 = p1Var7.F;
                                        p1.k(p4Var3);
                                    }
                                } while (p4Var3.A0("safelisted event", str3));
                            } else {
                                p1.m(u0Var6);
                                u0Var6.H.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                            } else {
                                n0Var3.K = 0;
                            }
                            ((p1) n0Var3.e).Z.incrementAndGet();
                            n0Var3.y = true;
                            x2Var = new x2(p1Var5);
                            x2Var.x();
                            p1Var5.R = x2Var;
                            if (!x2Var.y) {
                                kotlinx.coroutines.future.a.u(str);
                                return;
                            }
                            x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
                            ((p1) x2Var.e).Z.incrementAndGet();
                            x2Var.y = true;
                            p1.m(u0Var3);
                            s0Var = u0Var3.J;
                            s0Var2 = u0Var3.I;
                            s0Var3 = u0Var3.K;
                            s0Var4 = u0Var3.C;
                            gVar.B();
                            s0Var2.b(161000L, "App measurement initialized, version");
                            p1.m(u0Var3);
                            s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strB = n0Var.B();
                            if (p4Var4.b0(strB, gVar.z)) {
                                p1.m(u0Var3);
                                s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                p1.m(u0Var3);
                                s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                            }
                            p1.m(u0Var3);
                            s0Var.a("Debug-level message logging enabled");
                            i2 = p1Var5.X;
                            atomicInteger = p1Var5.Z;
                            if (i2 != atomicInteger.get()) {
                                p1.m(u0Var3);
                                s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            p1Var5.S = true;
                            j = p1Var5.a0;
                            s2Var = p1Var5.J;
                            m1 m1Var2 = p1Var5.D;
                            p1.m(m1Var2);
                            m1Var2.v();
                            p1.j(p1Var5.R);
                            iA = p1Var5.R.A();
                            g4.a();
                            zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
                            if (iA == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zG) {
                                p4Var4.v();
                                if (p4Var4.T() == 1) {
                                    p4Var4.v();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    sVar = new androidx.media3.common.util.s(p1Var6);
                                    z4 = z;
                                    context2 = p1Var6.e;
                                    u0Var = u0Var3;
                                    i3 = Build.VERSION.SDK_INT;
                                    s0Var5 = s0Var2;
                                    if (i3 >= 33) {
                                        com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                                    } else if (i3 >= 26) {
                                        androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(sVar, intentFilter, null, null);
                                    }
                                    com.google.android.gms.measurement.internal.u0 u0Var8 = p1Var6.C;
                                    p1.m(u0Var8);
                                    u0Var8.J.a("Registered app receiver");
                                    if (z4) {
                                        p1.j(p1Var5.R);
                                        p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    p4Var4.v();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    sVar = new androidx.media3.common.util.s(p1Var6);
                                    z4 = z;
                                    context2 = p1Var6.e;
                                    u0Var = u0Var3;
                                    i3 = Build.VERSION.SDK_INT;
                                    s0Var5 = s0Var2;
                                    if (i3 >= 33) {
                                        com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                                    } else if (i3 >= 26) {
                                        androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(sVar, intentFilter, null, null);
                                    }
                                    com.google.android.gms.measurement.internal.u0 u0Var9 = p1Var6.C;
                                    p1.m(u0Var9);
                                    u0Var9.J.a("Registered app receiver");
                                    if (z4) {
                                        p1.j(p1Var5.R);
                                        p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                                    }
                                } else {
                                    s0Var5 = s0Var2;
                                    u0Var = u0Var3;
                                }
                            } else if (z) {
                                z = true;
                                p4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                sVar = new androidx.media3.common.util.s(p1Var6);
                                z4 = z;
                                context2 = p1Var6.e;
                                u0Var = u0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                s0Var5 = s0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                                } else {
                                    context2.registerReceiver(sVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.u0 u0Var10 = p1Var6.C;
                                p1.m(u0Var10);
                                u0Var10.J.a("Registered app receiver");
                                if (z4) {
                                    p1.j(p1Var5.R);
                                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                                }
                            } else {
                                s0Var5 = s0Var2;
                                u0Var = u0Var3;
                            }
                            b1Var = d1Var.D;
                            c2VarC = d1Var.C();
                            int i4 = c2VarC.b;
                            z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                            z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                            b2Var = b2.ANALYTICS_STORAGE;
                            z1Var = z1.UNINITIALIZED;
                            if (z1VarL == z1Var || z1VarL2 != z1Var) {
                                p1Var2 = p1Var5;
                                s0Var6 = s0Var4;
                                p4Var = p4Var4;
                                if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(b2.class);
                                    enumMap.put(b2.AD_STORAGE, z1VarL);
                                    enumMap.put(b2Var, z1VarL2);
                                    c2Var = new c2(enumMap, -10);
                                    z2 = false;
                                }
                                if (c2Var != null) {
                                    p1.l(s2Var);
                                    s2Var.R(c2Var, true);
                                } else {
                                    c2Var = c2VarC;
                                }
                                p1.l(s2Var);
                                p1Var3 = (p1) s2Var.e;
                                s2Var.V(c2Var);
                                d1Var.v();
                                int i5 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
                                z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                                if (z1VarL3 != z1Var) {
                                    p1.m(u0Var);
                                    s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
                                }
                                z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                                if (z1VarL4 == z1Var && c2.l(-10, i5)) {
                                    p1.l(s2Var);
                                    EnumMap enumMap2 = new EnumMap(b2.class);
                                    enumMap2.put(b2.AD_USER_DATA, z1VarL4);
                                    s2Var.Q(new com.google.android.gms.measurement.internal.o(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(p1Var2.r().C()) && (i5 == 0 || i5 == 30)) {
                                    p1.l(s2Var);
                                    s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolI = gVar.I("google_analytics_tcf_data_enabled");
                                if (boolI != null || boolI.booleanValue()) {
                                    p1.m(u0Var);
                                    s0Var.a("TCF client enabled.");
                                    p1.l(s2Var);
                                    s2Var.v();
                                    com.google.android.gms.measurement.internal.u0 u0Var11 = p1Var3.C;
                                    p1.m(u0Var11);
                                    u0Var11.J.a("Register tcfPrefChangeListener.");
                                    if (s2Var.Q == null) {
                                        s2Var.R = new h2(s2Var, p1Var3, 2);
                                        s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                s2 s2Var2 = s2Var;
                                                s2Var2.getClass();
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    u0 u0Var12 = ((p1) s2Var2.e).C;
                                                    p1.m(u0Var12);
                                                    u0Var12.K.a("IABTCF_TCString change picked up in listener.");
                                                    h2 h2Var = s2Var2.R;
                                                    com.google.android.gms.common.internal.x.g(h2Var);
                                                    h2Var.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    d1 d1Var2 = p1Var3.B;
                                    p1.k(d1Var2);
                                    d1Var2.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                                    p1.l(s2Var);
                                    s2Var.B();
                                }
                                l1Var = d1Var.C;
                                if (l1Var.g() == 0) {
                                    p1.m(u0Var);
                                    s0Var3.b(Long.valueOf(j), "Persisting first open");
                                    l1Var.h(j);
                                }
                                p1.l(s2Var);
                                o1Var = s2Var.N;
                                if (o1Var.c() && o1Var.b()) {
                                    d1 d1Var3 = o1Var.e.B;
                                    p1.k(d1Var3);
                                    d1Var3.T.v(null);
                                }
                                if (p1Var2.h()) {
                                    p1Var4 = p1Var2;
                                    p4Var2 = p4Var;
                                    if (TextUtils.isEmpty(p1Var4.r().C())) {
                                        b1Var2 = b1Var;
                                    } else {
                                        String strC = p1Var4.r().C();
                                        d1Var.v();
                                        String string3 = d1Var.z().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strC);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            b1Var2 = b1Var;
                                        } else {
                                            com.google.android.gms.common.internal.x.g(strC);
                                            if (strC.equals(string3)) {
                                                b1Var2 = b1Var;
                                            } else {
                                                p1.m(u0Var);
                                                s0Var5.a("Rechecking which service to use due to a GMP App Id change");
                                                d1Var.v();
                                                d1Var.v();
                                                Boolean boolValueOf = d1Var.z().contains("measurement_enabled") ? Boolean.valueOf(d1Var.z().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = d1Var.z().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    d1Var.v();
                                                    SharedPreferences.Editor editorEdit3 = d1Var.z().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                p1Var4.o().z();
                                                p1Var4.O.D();
                                                p1Var4.O.B();
                                                l1Var.h(j);
                                                b1Var2 = b1Var;
                                                b1Var2.v(null);
                                            }
                                        }
                                        String strC2 = p1Var4.r().C();
                                        d1Var.v();
                                        SharedPreferences.Editor editorEdit4 = d1Var.z().edit();
                                        editorEdit4.putString("gmp_app_id", strC2);
                                        editorEdit4.apply();
                                    }
                                    if (!d1Var.C().i(b2Var)) {
                                        b1Var2.v(null);
                                    }
                                    p1.l(s2Var);
                                    s2Var.D.set(b1Var2.t());
                                    try {
                                        p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        b1 b1Var3 = d1Var.S;
                                        if (!TextUtils.isEmpty(b1Var3.t())) {
                                            p1.m(u0Var);
                                            u0Var2 = u0Var;
                                            u0Var2.F.a("Remote config removed with active feature rollouts");
                                            b1Var3.v(null);
                                        }
                                        if (!TextUtils.isEmpty(p1Var4.r().C())) {
                                            zD = p1Var4.d();
                                            sharedPreferences = d1Var.z;
                                            if (sharedPreferences == null) {
                                                zContains = z2;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                d1Var.D(!zD);
                                            }
                                            if (zD) {
                                                p1.l(s2Var);
                                                s2Var.H();
                                            }
                                            u3 u3Var = p1Var4.E;
                                            p1.l(u3Var);
                                            u3Var.B.O();
                                            p1Var4.p().z(new AtomicReference());
                                            p1Var4.p().A(d1Var.V.J());
                                        }
                                        g4.a();
                                        if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                                            p4Var2.v();
                                            if (p4Var2.T() == 1) {
                                                z3 = true;
                                            } else {
                                                z3 = z2;
                                            }
                                            if (z3) {
                                                long jIntValue = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                p1Var4.H.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    p1.m(u0Var2);
                                                    s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                p1.l(s2Var);
                                                s2Var.v();
                                                if (s2Var.I == null) {
                                                    s2Var.I = new h2(s2Var, p1Var3, 0);
                                                }
                                                s2Var.I.b(jMax);
                                            }
                                        }
                                        d1Var.L.b(true);
                                    }
                                    u0Var2 = u0Var;
                                    if (!TextUtils.isEmpty(p1Var4.r().C())) {
                                        zD = p1Var4.d();
                                        sharedPreferences = d1Var.z;
                                        if (sharedPreferences == null) {
                                            zContains = z2;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !gVar.J()) {
                                            d1Var.D(!zD);
                                        }
                                        if (zD) {
                                            p1.l(s2Var);
                                            s2Var.H();
                                        }
                                        u3 u3Var2 = p1Var4.E;
                                        p1.l(u3Var2);
                                        u3Var2.B.O();
                                        p1Var4.p().z(new AtomicReference());
                                        p1Var4.p().A(d1Var.V.J());
                                    }
                                } else {
                                    if (p1Var2.d()) {
                                        p4Var2 = p4Var;
                                        if (p4Var2.Z("android.permission.INTERNET")) {
                                            s0Var7 = s0Var6;
                                        } else {
                                            p1.m(u0Var);
                                            s0Var7 = s0Var6;
                                            s0Var7.a("App is missing INTERNET permission");
                                        }
                                        if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                            p1.m(u0Var);
                                            s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        p1Var4 = p1Var2;
                                        context = p1Var4.e;
                                        if (!com.google.android.gms.common.wrappers.b.a(context).d() && !gVar.y()) {
                                            if (!p4.r0(context)) {
                                                p1.m(u0Var);
                                                s0Var7.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!p4.Q(context)) {
                                                p1.m(u0Var);
                                                s0Var7.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        p1.m(u0Var);
                                        s0Var7.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        p1Var4 = p1Var2;
                                        p4Var2 = p4Var;
                                    }
                                    u0Var2 = u0Var;
                                }
                                g4.a();
                                if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                                    p4Var2.v();
                                    if (p4Var2.T() == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (z3) {
                                        long jIntValue2 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        p1Var4.H.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            p1.m(u0Var2);
                                            s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        p1.l(s2Var);
                                        s2Var.v();
                                        if (s2Var.I == null) {
                                            s2Var.I = new h2(s2Var, p1Var3, 0);
                                        }
                                        s2Var.I.b(jMax);
                                    }
                                }
                                d1Var.L.b(true);
                            }
                            p1Var2 = p1Var5;
                            s0Var6 = s0Var4;
                            p4Var = p4Var4;
                            if (TextUtils.isEmpty(p1Var2.r().C()) && (i4 == 0 || i4 == 30 || i4 == 10 || i4 == 40)) {
                                p1.l(s2Var);
                                z2 = false;
                                s2Var.R(new c2(-10), false);
                            } else {
                                z2 = false;
                            }
                            c2Var = null;
                            if (c2Var != null) {
                                p1.l(s2Var);
                                s2Var.R(c2Var, true);
                            } else {
                                c2Var = c2VarC;
                            }
                            p1.l(s2Var);
                            p1Var3 = (p1) s2Var.e;
                            s2Var.V(c2Var);
                            d1Var.v();
                            int i6 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
                            z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                            if (z1VarL3 != z1Var) {
                                p1.m(u0Var);
                                s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
                            }
                            z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                            if (z1VarL4 == z1Var) {
                                if (!TextUtils.isEmpty(p1Var2.r().C())) {
                                    p1.l(s2Var);
                                    s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
                                p1.l(s2Var);
                                s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolI = gVar.I("google_analytics_tcf_data_enabled");
                            if (boolI != null) {
                                p1.m(u0Var);
                                s0Var.a("TCF client enabled.");
                                p1.l(s2Var);
                                s2Var.v();
                                com.google.android.gms.measurement.internal.u0 u0Var12 = p1Var3.C;
                                p1.m(u0Var12);
                                u0Var12.J.a("Register tcfPrefChangeListener.");
                                if (s2Var.Q == null) {
                                    s2Var.R = new h2(s2Var, p1Var3, 2);
                                    s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            s2 s2Var2 = s2Var;
                                            s2Var2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                u0 u0Var13 = ((p1) s2Var2.e).C;
                                                p1.m(u0Var13);
                                                u0Var13.K.a("IABTCF_TCString change picked up in listener.");
                                                h2 h2Var = s2Var2.R;
                                                com.google.android.gms.common.internal.x.g(h2Var);
                                                h2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                d1 d1Var4 = p1Var3.B;
                                p1.k(d1Var4);
                                d1Var4.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                                p1.l(s2Var);
                                s2Var.B();
                            } else {
                                p1.m(u0Var);
                                s0Var.a("TCF client enabled.");
                                p1.l(s2Var);
                                s2Var.v();
                                com.google.android.gms.measurement.internal.u0 u0Var13 = p1Var3.C;
                                p1.m(u0Var13);
                                u0Var13.J.a("Register tcfPrefChangeListener.");
                                if (s2Var.Q == null) {
                                    s2Var.R = new h2(s2Var, p1Var3, 2);
                                    s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            s2 s2Var2 = s2Var;
                                            s2Var2.getClass();
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                u0 u0Var14 = ((p1) s2Var2.e).C;
                                                p1.m(u0Var14);
                                                u0Var14.K.a("IABTCF_TCString change picked up in listener.");
                                                h2 h2Var = s2Var2.R;
                                                com.google.android.gms.common.internal.x.g(h2Var);
                                                h2Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                d1 d1Var5 = p1Var3.B;
                                p1.k(d1Var5);
                                d1Var5.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                                p1.l(s2Var);
                                s2Var.B();
                            }
                            l1Var = d1Var.C;
                            if (l1Var.g() == 0) {
                                p1.m(u0Var);
                                s0Var3.b(Long.valueOf(j), "Persisting first open");
                                l1Var.h(j);
                            }
                            p1.l(s2Var);
                            o1Var = s2Var.N;
                            if (o1Var.c()) {
                                d1 d1Var6 = o1Var.e.B;
                                p1.k(d1Var6);
                                d1Var6.T.v(null);
                            }
                            if (p1Var2.h()) {
                                if (p1Var2.d()) {
                                    p4Var2 = p4Var;
                                    if (p4Var2.Z("android.permission.INTERNET")) {
                                        p1.m(u0Var);
                                        s0Var7 = s0Var6;
                                        s0Var7.a("App is missing INTERNET permission");
                                    } else {
                                        s0Var7 = s0Var6;
                                    }
                                    if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                        p1.m(u0Var);
                                        s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    p1Var4 = p1Var2;
                                    context = p1Var4.e;
                                    if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                        if (!p4.r0(context)) {
                                            p1.m(u0Var);
                                            s0Var7.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!p4.Q(context)) {
                                            p1.m(u0Var);
                                            s0Var7.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    p1.m(u0Var);
                                    s0Var7.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    p1Var4 = p1Var2;
                                    p4Var2 = p4Var;
                                }
                                u0Var2 = u0Var;
                            } else {
                                p1Var4 = p1Var2;
                                p4Var2 = p4Var;
                                if (TextUtils.isEmpty(p1Var4.r().C())) {
                                    String strC3 = p1Var4.r().C();
                                    d1Var.v();
                                    String string4 = d1Var.z().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strC3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                                    if (zIsEmpty) {
                                        b1Var2 = b1Var;
                                    } else {
                                        b1Var2 = b1Var;
                                    }
                                    String strC4 = p1Var4.r().C();
                                    d1Var.v();
                                    SharedPreferences.Editor editorEdit5 = d1Var.z().edit();
                                    editorEdit5.putString("gmp_app_id", strC4);
                                    editorEdit5.apply();
                                } else {
                                    b1Var2 = b1Var;
                                }
                                if (!d1Var.C().i(b2Var)) {
                                    b1Var2.v(null);
                                }
                                p1.l(s2Var);
                                s2Var.D.set(b1Var2.t());
                                p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                u0Var2 = u0Var;
                                if (!TextUtils.isEmpty(p1Var4.r().C())) {
                                    zD = p1Var4.d();
                                    sharedPreferences = d1Var.z;
                                    if (sharedPreferences == null) {
                                        zContains = z2;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        d1Var.D(!zD);
                                    }
                                    if (zD) {
                                        p1.l(s2Var);
                                        s2Var.H();
                                    }
                                    u3 u3Var3 = p1Var4.E;
                                    p1.l(u3Var3);
                                    u3Var3.B.O();
                                    p1Var4.p().z(new AtomicReference());
                                    p1Var4.p().A(d1Var.V.J());
                                }
                            }
                            g4.a();
                            if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                                p4Var2.v();
                                if (p4Var2.T() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (z3) {
                                    long jIntValue3 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    p1Var4.H.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        p1.m(u0Var2);
                                        s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    p1.l(s2Var);
                                    s2Var.v();
                                    if (s2Var.I == null) {
                                        s2Var.I = new h2(s2Var, p1Var3, 0);
                                    }
                                    s2Var.I.b(jMax);
                                }
                            }
                            d1Var.L.b(true);
                        }
                        com.google.android.gms.measurement.internal.u0 u0Var14 = p1Var.C;
                        p1.m(u0Var14);
                        u0Var14.C.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            }
                        }
                        if (listAsList != null) {
                            n0Var3.H = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    n0Var3.H = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    p4Var3 = p1Var7.F;
                                    p1.k(p4Var3);
                                }
                            } while (p4Var3.A0("safelisted event", str3));
                        } else {
                            p1.m(u0Var6);
                            u0Var6.H.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                        } else {
                            n0Var3.K = 0;
                        }
                        ((p1) n0Var3.e).Z.incrementAndGet();
                        n0Var3.y = true;
                        x2Var = new x2(p1Var5);
                        x2Var.x();
                        p1Var5.R = x2Var;
                        if (!x2Var.y) {
                            kotlinx.coroutines.future.a.u(str);
                            return;
                        }
                        x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
                        ((p1) x2Var.e).Z.incrementAndGet();
                        x2Var.y = true;
                        p1.m(u0Var3);
                        s0Var = u0Var3.J;
                        s0Var2 = u0Var3.I;
                        s0Var3 = u0Var3.K;
                        s0Var4 = u0Var3.C;
                        gVar.B();
                        s0Var2.b(161000L, "App measurement initialized, version");
                        p1.m(u0Var3);
                        s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strB = n0Var.B();
                        if (p4Var4.b0(strB, gVar.z)) {
                            p1.m(u0Var3);
                            s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            p1.m(u0Var3);
                            s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                        }
                        p1.m(u0Var3);
                        s0Var.a("Debug-level message logging enabled");
                        i2 = p1Var5.X;
                        atomicInteger = p1Var5.Z;
                        if (i2 != atomicInteger.get()) {
                            p1.m(u0Var3);
                            s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        p1Var5.S = true;
                        j = p1Var5.a0;
                        s2Var = p1Var5.J;
                        m1 m1Var3 = p1Var5.D;
                        p1.m(m1Var3);
                        m1Var3.v();
                        p1.j(p1Var5.R);
                        iA = p1Var5.R.A();
                        g4.a();
                        zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
                        if (iA == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zG) {
                            p4Var4.v();
                            if (p4Var4.T() == 1) {
                                p4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                sVar = new androidx.media3.common.util.s(p1Var6);
                                z4 = z;
                                context2 = p1Var6.e;
                                u0Var = u0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                s0Var5 = s0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                                } else {
                                    context2.registerReceiver(sVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.u0 u0Var15 = p1Var6.C;
                                p1.m(u0Var15);
                                u0Var15.J.a("Registered app receiver");
                                if (z4) {
                                    p1.j(p1Var5.R);
                                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                p4Var4.v();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                sVar = new androidx.media3.common.util.s(p1Var6);
                                z4 = z;
                                context2 = p1Var6.e;
                                u0Var = u0Var3;
                                i3 = Build.VERSION.SDK_INT;
                                s0Var5 = s0Var2;
                                if (i3 >= 33) {
                                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                                } else if (i3 >= 26) {
                                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                                } else {
                                    context2.registerReceiver(sVar, intentFilter, null, null);
                                }
                                com.google.android.gms.measurement.internal.u0 u0Var16 = p1Var6.C;
                                p1.m(u0Var16);
                                u0Var16.J.a("Registered app receiver");
                                if (z4) {
                                    p1.j(p1Var5.R);
                                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                                }
                            } else {
                                s0Var5 = s0Var2;
                                u0Var = u0Var3;
                            }
                        } else if (z) {
                            z = true;
                            p4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            sVar = new androidx.media3.common.util.s(p1Var6);
                            z4 = z;
                            context2 = p1Var6.e;
                            u0Var = u0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            s0Var5 = s0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                            } else {
                                context2.registerReceiver(sVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.u0 u0Var17 = p1Var6.C;
                            p1.m(u0Var17);
                            u0Var17.J.a("Registered app receiver");
                            if (z4) {
                                p1.j(p1Var5.R);
                                p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                            }
                        } else {
                            s0Var5 = s0Var2;
                            u0Var = u0Var3;
                        }
                        b1Var = d1Var.D;
                        c2VarC = d1Var.C();
                        int i7 = c2VarC.b;
                        z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                        z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                        b2Var = b2.ANALYTICS_STORAGE;
                        z1Var = z1.UNINITIALIZED;
                        if (z1VarL == z1Var) {
                            p1Var2 = p1Var5;
                            s0Var6 = s0Var4;
                            p4Var = p4Var4;
                            if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(b2.class);
                                enumMap3.put(b2.AD_STORAGE, z1VarL);
                                enumMap3.put(b2Var, z1VarL2);
                                c2Var = new c2(enumMap3, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(p1Var2.r().C())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c2Var = null;
                            }
                        } else {
                            p1Var2 = p1Var5;
                            s0Var6 = s0Var4;
                            p4Var = p4Var4;
                            if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(b2.class);
                                enumMap4.put(b2.AD_STORAGE, z1VarL);
                                enumMap4.put(b2Var, z1VarL2);
                                c2Var = new c2(enumMap4, -10);
                                z2 = false;
                            } else {
                                if (TextUtils.isEmpty(p1Var2.r().C())) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c2Var = null;
                            }
                        }
                        if (c2Var != null) {
                            p1.l(s2Var);
                            s2Var.R(c2Var, true);
                        } else {
                            c2Var = c2VarC;
                        }
                        p1.l(s2Var);
                        p1Var3 = (p1) s2Var.e;
                        s2Var.V(c2Var);
                        d1Var.v();
                        int i8 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
                        z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                        if (z1VarL3 != z1Var) {
                            p1.m(u0Var);
                            s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
                        }
                        z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                        if (z1VarL4 == z1Var) {
                            if (!TextUtils.isEmpty(p1Var2.r().C())) {
                                p1.l(s2Var);
                                s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
                            p1.l(s2Var);
                            s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolI = gVar.I("google_analytics_tcf_data_enabled");
                        if (boolI != null) {
                            p1.m(u0Var);
                            s0Var.a("TCF client enabled.");
                            p1.l(s2Var);
                            s2Var.v();
                            com.google.android.gms.measurement.internal.u0 u0Var18 = p1Var3.C;
                            p1.m(u0Var18);
                            u0Var18.J.a("Register tcfPrefChangeListener.");
                            if (s2Var.Q == null) {
                                s2Var.R = new h2(s2Var, p1Var3, 2);
                                s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        s2 s2Var2 = s2Var;
                                        s2Var2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            u0 u0Var19 = ((p1) s2Var2.e).C;
                                            p1.m(u0Var19);
                                            u0Var19.K.a("IABTCF_TCString change picked up in listener.");
                                            h2 h2Var = s2Var2.R;
                                            com.google.android.gms.common.internal.x.g(h2Var);
                                            h2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            d1 d1Var7 = p1Var3.B;
                            p1.k(d1Var7);
                            d1Var7.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                            p1.l(s2Var);
                            s2Var.B();
                        } else {
                            p1.m(u0Var);
                            s0Var.a("TCF client enabled.");
                            p1.l(s2Var);
                            s2Var.v();
                            com.google.android.gms.measurement.internal.u0 u0Var19 = p1Var3.C;
                            p1.m(u0Var19);
                            u0Var19.J.a("Register tcfPrefChangeListener.");
                            if (s2Var.Q == null) {
                                s2Var.R = new h2(s2Var, p1Var3, 2);
                                s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        s2 s2Var2 = s2Var;
                                        s2Var2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            u0 u0Var110 = ((p1) s2Var2.e).C;
                                            p1.m(u0Var110);
                                            u0Var110.K.a("IABTCF_TCString change picked up in listener.");
                                            h2 h2Var = s2Var2.R;
                                            com.google.android.gms.common.internal.x.g(h2Var);
                                            h2Var.b(500L);
                                        }
                                    }
                                };
                            }
                            d1 d1Var8 = p1Var3.B;
                            p1.k(d1Var8);
                            d1Var8.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                            p1.l(s2Var);
                            s2Var.B();
                        }
                        l1Var = d1Var.C;
                        if (l1Var.g() == 0) {
                            p1.m(u0Var);
                            s0Var3.b(Long.valueOf(j), "Persisting first open");
                            l1Var.h(j);
                        }
                        p1.l(s2Var);
                        o1Var = s2Var.N;
                        if (o1Var.c()) {
                            d1 d1Var9 = o1Var.e.B;
                            p1.k(d1Var9);
                            d1Var9.T.v(null);
                        }
                        if (p1Var2.h()) {
                            if (p1Var2.d()) {
                                p4Var2 = p4Var;
                                if (p4Var2.Z("android.permission.INTERNET")) {
                                    p1.m(u0Var);
                                    s0Var7 = s0Var6;
                                    s0Var7.a("App is missing INTERNET permission");
                                } else {
                                    s0Var7 = s0Var6;
                                }
                                if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                    p1.m(u0Var);
                                    s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                p1Var4 = p1Var2;
                                context = p1Var4.e;
                                if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                    if (!p4.r0(context)) {
                                        p1.m(u0Var);
                                        s0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!p4.Q(context)) {
                                        p1.m(u0Var);
                                        s0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                p1.m(u0Var);
                                s0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                p1Var4 = p1Var2;
                                p4Var2 = p4Var;
                            }
                            u0Var2 = u0Var;
                        } else {
                            p1Var4 = p1Var2;
                            p4Var2 = p4Var;
                            if (TextUtils.isEmpty(p1Var4.r().C())) {
                                String strC5 = p1Var4.r().C();
                                d1Var.v();
                                String string5 = d1Var.z().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strC5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                                if (zIsEmpty) {
                                    b1Var2 = b1Var;
                                } else {
                                    b1Var2 = b1Var;
                                }
                                String strC6 = p1Var4.r().C();
                                d1Var.v();
                                SharedPreferences.Editor editorEdit6 = d1Var.z().edit();
                                editorEdit6.putString("gmp_app_id", strC6);
                                editorEdit6.apply();
                            } else {
                                b1Var2 = b1Var;
                            }
                            if (!d1Var.C().i(b2Var)) {
                                b1Var2.v(null);
                            }
                            p1.l(s2Var);
                            s2Var.D.set(b1Var2.t());
                            p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            u0Var2 = u0Var;
                            if (!TextUtils.isEmpty(p1Var4.r().C())) {
                                zD = p1Var4.d();
                                sharedPreferences = d1Var.z;
                                if (sharedPreferences == null) {
                                    zContains = z2;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    d1Var.D(!zD);
                                }
                                if (zD) {
                                    p1.l(s2Var);
                                    s2Var.H();
                                }
                                u3 u3Var4 = p1Var4.E;
                                p1.l(u3Var4);
                                u3Var4.B.O();
                                p1Var4.p().z(new AtomicReference());
                                p1Var4.p().A(d1Var.V.J());
                            }
                        }
                        g4.a();
                        if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                            p4Var2.v();
                            if (p4Var2.T() == 1) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (z3) {
                                long jIntValue4 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                p1Var4.H.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    p1.m(u0Var2);
                                    s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                p1.l(s2Var);
                                s2Var.v();
                                if (s2Var.I == null) {
                                    s2Var.I = new h2(s2Var, p1Var3, 0);
                                }
                                s2Var.I.b(jMax);
                            }
                        }
                        d1Var.L.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                n0Var3.z = packageName;
                n0Var3.C = str8;
                n0Var3.A = str2;
                n0Var3.B = i;
                n0Var3.D = string;
                n0Var3.E = 0L;
                iG = p1Var7.g();
                if (iG == 0) {
                    p1.m(u0Var6);
                    u0Var6.K.a("App measurement collection enabled");
                } else if (iG == 1) {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    p1.m(u0Var6);
                    u0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement disabled");
                    p1.m(u0Var6);
                    u0Var6.D.a("Invalid scion state in identity");
                } else {
                    p1.m(u0Var6);
                    u0Var6.I.a("App measurement disabled due to denied storage consent");
                }
                n0Var3.L = "";
                strB2 = n0Var3.J;
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = d2.b(context3, p1Var7.M);
                }
                if (!TextUtils.isEmpty(strB2)) {
                    str4 = strB2;
                }
                n0Var3.L = str4;
                if (iG == 0) {
                    p1.m(u0Var6);
                    u0Var6.K.c(n0Var3.z, n0Var3.L, "App measurement enabled for app package, google app id");
                }
                listAsList = null;
                n0Var3.H = null;
                com.google.android.gms.measurement.internal.g gVar3 = p1Var7.A;
                p1Var = (p1) gVar3.e;
                com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
                bundleH = gVar3.H();
                if (bundleH != null) {
                    if (bundleH.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        }
                    }
                    if (listAsList != null) {
                        n0Var3.H = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                n0Var3.H = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                p4Var3 = p1Var7.F;
                                p1.k(p4Var3);
                            }
                        } while (p4Var3.A0("safelisted event", str3));
                    } else {
                        p1.m(u0Var6);
                        u0Var6.H.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                    } else {
                        n0Var3.K = 0;
                    }
                    ((p1) n0Var3.e).Z.incrementAndGet();
                    n0Var3.y = true;
                    x2Var = new x2(p1Var5);
                    x2Var.x();
                    p1Var5.R = x2Var;
                    if (!x2Var.y) {
                        kotlinx.coroutines.future.a.u(str);
                        return;
                    }
                    x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
                    ((p1) x2Var.e).Z.incrementAndGet();
                    x2Var.y = true;
                    p1.m(u0Var3);
                    s0Var = u0Var3.J;
                    s0Var2 = u0Var3.I;
                    s0Var3 = u0Var3.K;
                    s0Var4 = u0Var3.C;
                    gVar.B();
                    s0Var2.b(161000L, "App measurement initialized, version");
                    p1.m(u0Var3);
                    s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strB = n0Var.B();
                    if (p4Var4.b0(strB, gVar.z)) {
                        p1.m(u0Var3);
                        s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        p1.m(u0Var3);
                        s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                    }
                    p1.m(u0Var3);
                    s0Var.a("Debug-level message logging enabled");
                    i2 = p1Var5.X;
                    atomicInteger = p1Var5.Z;
                    if (i2 != atomicInteger.get()) {
                        p1.m(u0Var3);
                        s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    p1Var5.S = true;
                    j = p1Var5.a0;
                    s2Var = p1Var5.J;
                    m1 m1Var4 = p1Var5.D;
                    p1.m(m1Var4);
                    m1Var4.v();
                    p1.j(p1Var5.R);
                    iA = p1Var5.R.A();
                    g4.a();
                    zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
                    if (iA == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zG) {
                        p4Var4.v();
                        if (p4Var4.T() == 1) {
                            p4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            sVar = new androidx.media3.common.util.s(p1Var6);
                            z4 = z;
                            context2 = p1Var6.e;
                            u0Var = u0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            s0Var5 = s0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                            } else {
                                context2.registerReceiver(sVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.u0 u0Var110 = p1Var6.C;
                            p1.m(u0Var110);
                            u0Var110.J.a("Registered app receiver");
                            if (z4) {
                                p1.j(p1Var5.R);
                                p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            p4Var4.v();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            sVar = new androidx.media3.common.util.s(p1Var6);
                            z4 = z;
                            context2 = p1Var6.e;
                            u0Var = u0Var3;
                            i3 = Build.VERSION.SDK_INT;
                            s0Var5 = s0Var2;
                            if (i3 >= 33) {
                                com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                            } else if (i3 >= 26) {
                                androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                            } else {
                                context2.registerReceiver(sVar, intentFilter, null, null);
                            }
                            com.google.android.gms.measurement.internal.u0 u0Var111 = p1Var6.C;
                            p1.m(u0Var111);
                            u0Var111.J.a("Registered app receiver");
                            if (z4) {
                                p1.j(p1Var5.R);
                                p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                            }
                        } else {
                            s0Var5 = s0Var2;
                            u0Var = u0Var3;
                        }
                    } else if (z) {
                        z = true;
                        p4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        sVar = new androidx.media3.common.util.s(p1Var6);
                        z4 = z;
                        context2 = p1Var6.e;
                        u0Var = u0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        s0Var5 = s0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                        } else {
                            context2.registerReceiver(sVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.u0 u0Var112 = p1Var6.C;
                        p1.m(u0Var112);
                        u0Var112.J.a("Registered app receiver");
                        if (z4) {
                            p1.j(p1Var5.R);
                            p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                        }
                    } else {
                        s0Var5 = s0Var2;
                        u0Var = u0Var3;
                    }
                    b1Var = d1Var.D;
                    c2VarC = d1Var.C();
                    int i9 = c2VarC.b;
                    z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                    z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                    b2Var = b2.ANALYTICS_STORAGE;
                    z1Var = z1.UNINITIALIZED;
                    if (z1VarL == z1Var) {
                        p1Var2 = p1Var5;
                        s0Var6 = s0Var4;
                        p4Var = p4Var4;
                        if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(b2.class);
                            enumMap5.put(b2.AD_STORAGE, z1VarL);
                            enumMap5.put(b2Var, z1VarL2);
                            c2Var = new c2(enumMap5, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(p1Var2.r().C())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            c2Var = null;
                        }
                    } else {
                        p1Var2 = p1Var5;
                        s0Var6 = s0Var4;
                        p4Var = p4Var4;
                        if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(b2.class);
                            enumMap6.put(b2.AD_STORAGE, z1VarL);
                            enumMap6.put(b2Var, z1VarL2);
                            c2Var = new c2(enumMap6, -10);
                            z2 = false;
                        } else {
                            if (TextUtils.isEmpty(p1Var2.r().C())) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            c2Var = null;
                        }
                    }
                    if (c2Var != null) {
                        p1.l(s2Var);
                        s2Var.R(c2Var, true);
                    } else {
                        c2Var = c2VarC;
                    }
                    p1.l(s2Var);
                    p1Var3 = (p1) s2Var.e;
                    s2Var.V(c2Var);
                    d1Var.v();
                    int i10 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
                    z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                    if (z1VarL3 != z1Var) {
                        p1.m(u0Var);
                        s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
                    }
                    z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                    if (z1VarL4 == z1Var) {
                        if (!TextUtils.isEmpty(p1Var2.r().C())) {
                            p1.l(s2Var);
                            s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
                        p1.l(s2Var);
                        s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolI = gVar.I("google_analytics_tcf_data_enabled");
                    if (boolI != null) {
                        p1.m(u0Var);
                        s0Var.a("TCF client enabled.");
                        p1.l(s2Var);
                        s2Var.v();
                        com.google.android.gms.measurement.internal.u0 u0Var113 = p1Var3.C;
                        p1.m(u0Var113);
                        u0Var113.J.a("Register tcfPrefChangeListener.");
                        if (s2Var.Q == null) {
                            s2Var.R = new h2(s2Var, p1Var3, 2);
                            s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    s2 s2Var2 = s2Var;
                                    s2Var2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        u0 u0Var114 = ((p1) s2Var2.e).C;
                                        p1.m(u0Var114);
                                        u0Var114.K.a("IABTCF_TCString change picked up in listener.");
                                        h2 h2Var = s2Var2.R;
                                        com.google.android.gms.common.internal.x.g(h2Var);
                                        h2Var.b(500L);
                                    }
                                }
                            };
                        }
                        d1 d1Var10 = p1Var3.B;
                        p1.k(d1Var10);
                        d1Var10.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                        p1.l(s2Var);
                        s2Var.B();
                    } else {
                        p1.m(u0Var);
                        s0Var.a("TCF client enabled.");
                        p1.l(s2Var);
                        s2Var.v();
                        com.google.android.gms.measurement.internal.u0 u0Var114 = p1Var3.C;
                        p1.m(u0Var114);
                        u0Var114.J.a("Register tcfPrefChangeListener.");
                        if (s2Var.Q == null) {
                            s2Var.R = new h2(s2Var, p1Var3, 2);
                            s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    s2 s2Var2 = s2Var;
                                    s2Var2.getClass();
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        u0 u0Var115 = ((p1) s2Var2.e).C;
                                        p1.m(u0Var115);
                                        u0Var115.K.a("IABTCF_TCString change picked up in listener.");
                                        h2 h2Var = s2Var2.R;
                                        com.google.android.gms.common.internal.x.g(h2Var);
                                        h2Var.b(500L);
                                    }
                                }
                            };
                        }
                        d1 d1Var11 = p1Var3.B;
                        p1.k(d1Var11);
                        d1Var11.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                        p1.l(s2Var);
                        s2Var.B();
                    }
                    l1Var = d1Var.C;
                    if (l1Var.g() == 0) {
                        p1.m(u0Var);
                        s0Var3.b(Long.valueOf(j), "Persisting first open");
                        l1Var.h(j);
                    }
                    p1.l(s2Var);
                    o1Var = s2Var.N;
                    if (o1Var.c()) {
                        d1 d1Var12 = o1Var.e.B;
                        p1.k(d1Var12);
                        d1Var12.T.v(null);
                    }
                    if (p1Var2.h()) {
                        if (p1Var2.d()) {
                            p4Var2 = p4Var;
                            if (p4Var2.Z("android.permission.INTERNET")) {
                                p1.m(u0Var);
                                s0Var7 = s0Var6;
                                s0Var7.a("App is missing INTERNET permission");
                            } else {
                                s0Var7 = s0Var6;
                            }
                            if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                                p1.m(u0Var);
                                s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            p1Var4 = p1Var2;
                            context = p1Var4.e;
                            if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                                if (!p4.r0(context)) {
                                    p1.m(u0Var);
                                    s0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!p4.Q(context)) {
                                    p1.m(u0Var);
                                    s0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            p1.m(u0Var);
                            s0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            p1Var4 = p1Var2;
                            p4Var2 = p4Var;
                        }
                        u0Var2 = u0Var;
                    } else {
                        p1Var4 = p1Var2;
                        p4Var2 = p4Var;
                        if (TextUtils.isEmpty(p1Var4.r().C())) {
                            String strC7 = p1Var4.r().C();
                            d1Var.v();
                            String string6 = d1Var.z().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strC7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                            if (zIsEmpty) {
                                b1Var2 = b1Var;
                            } else {
                                b1Var2 = b1Var;
                            }
                            String strC8 = p1Var4.r().C();
                            d1Var.v();
                            SharedPreferences.Editor editorEdit7 = d1Var.z().edit();
                            editorEdit7.putString("gmp_app_id", strC8);
                            editorEdit7.apply();
                        } else {
                            b1Var2 = b1Var;
                        }
                        if (!d1Var.C().i(b2Var)) {
                            b1Var2.v(null);
                        }
                        p1.l(s2Var);
                        s2Var.D.set(b1Var2.t());
                        p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        u0Var2 = u0Var;
                        if (!TextUtils.isEmpty(p1Var4.r().C())) {
                            zD = p1Var4.d();
                            sharedPreferences = d1Var.z;
                            if (sharedPreferences == null) {
                                zContains = z2;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                d1Var.D(!zD);
                            }
                            if (zD) {
                                p1.l(s2Var);
                                s2Var.H();
                            }
                            u3 u3Var5 = p1Var4.E;
                            p1.l(u3Var5);
                            u3Var5.B.O();
                            p1Var4.p().z(new AtomicReference());
                            p1Var4.p().A(d1Var.V.J());
                        }
                    }
                    g4.a();
                    if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                        p4Var2.v();
                        if (p4Var2.T() == 1) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            long jIntValue5 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            p1Var4.H.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                p1.m(u0Var2);
                                s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            p1.l(s2Var);
                            s2Var.v();
                            if (s2Var.I == null) {
                                s2Var.I = new h2(s2Var, p1Var3, 0);
                            }
                            s2Var.I.b(jMax);
                        }
                    }
                    d1Var.L.b(true);
                }
                com.google.android.gms.measurement.internal.u0 u0Var115 = p1Var.C;
                p1.m(u0Var115);
                u0Var115.C.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                }
                if (listAsList != null) {
                    n0Var3.H = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            n0Var3.H = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            p4Var3 = p1Var7.F;
                            p1.k(p4Var3);
                        }
                    } while (p4Var3.A0("safelisted event", str3));
                } else {
                    p1.m(u0Var6);
                    u0Var6.H.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
                } else {
                    n0Var3.K = 0;
                }
                ((p1) n0Var3.e).Z.incrementAndGet();
                n0Var3.y = true;
                x2Var = new x2(p1Var5);
                x2Var.x();
                p1Var5.R = x2Var;
                if (!x2Var.y) {
                    kotlinx.coroutines.future.a.u(str);
                    return;
                }
                x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
                ((p1) x2Var.e).Z.incrementAndGet();
                x2Var.y = true;
                p1.m(u0Var3);
                s0Var = u0Var3.J;
                s0Var2 = u0Var3.I;
                s0Var3 = u0Var3.K;
                s0Var4 = u0Var3.C;
                gVar.B();
                s0Var2.b(161000L, "App measurement initialized, version");
                p1.m(u0Var3);
                s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strB = n0Var.B();
                if (p4Var4.b0(strB, gVar.z)) {
                    p1.m(u0Var3);
                    s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    p1.m(u0Var3);
                    s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
                }
                p1.m(u0Var3);
                s0Var.a("Debug-level message logging enabled");
                i2 = p1Var5.X;
                atomicInteger = p1Var5.Z;
                if (i2 != atomicInteger.get()) {
                    p1.m(u0Var3);
                    s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                p1Var5.S = true;
                j = p1Var5.a0;
                s2Var = p1Var5.J;
                m1 m1Var5 = p1Var5.D;
                p1.m(m1Var5);
                m1Var5.v();
                p1.j(p1Var5.R);
                iA = p1Var5.R.A();
                g4.a();
                zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
                if (iA == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zG) {
                    p4Var4.v();
                    if (p4Var4.T() == 1) {
                        p4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        sVar = new androidx.media3.common.util.s(p1Var6);
                        z4 = z;
                        context2 = p1Var6.e;
                        u0Var = u0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        s0Var5 = s0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                        } else {
                            context2.registerReceiver(sVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.u0 u0Var116 = p1Var6.C;
                        p1.m(u0Var116);
                        u0Var116.J.a("Registered app receiver");
                        if (z4) {
                            p1.j(p1Var5.R);
                            p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        p4Var4.v();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        sVar = new androidx.media3.common.util.s(p1Var6);
                        z4 = z;
                        context2 = p1Var6.e;
                        u0Var = u0Var3;
                        i3 = Build.VERSION.SDK_INT;
                        s0Var5 = s0Var2;
                        if (i3 >= 33) {
                            com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                        } else if (i3 >= 26) {
                            androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                        } else {
                            context2.registerReceiver(sVar, intentFilter, null, null);
                        }
                        com.google.android.gms.measurement.internal.u0 u0Var117 = p1Var6.C;
                        p1.m(u0Var117);
                        u0Var117.J.a("Registered app receiver");
                        if (z4) {
                            p1.j(p1Var5.R);
                            p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                        }
                    } else {
                        s0Var5 = s0Var2;
                        u0Var = u0Var3;
                    }
                } else if (z) {
                    z = true;
                    p4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    sVar = new androidx.media3.common.util.s(p1Var6);
                    z4 = z;
                    context2 = p1Var6.e;
                    u0Var = u0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    s0Var5 = s0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                    } else {
                        context2.registerReceiver(sVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.u0 u0Var118 = p1Var6.C;
                    p1.m(u0Var118);
                    u0Var118.J.a("Registered app receiver");
                    if (z4) {
                        p1.j(p1Var5.R);
                        p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                    }
                } else {
                    s0Var5 = s0Var2;
                    u0Var = u0Var3;
                }
                b1Var = d1Var.D;
                c2VarC = d1Var.C();
                int i11 = c2VarC.b;
                z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
                z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
                b2Var = b2.ANALYTICS_STORAGE;
                z1Var = z1.UNINITIALIZED;
                if (z1VarL == z1Var) {
                    p1Var2 = p1Var5;
                    s0Var6 = s0Var4;
                    p4Var = p4Var4;
                    if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(b2.class);
                        enumMap7.put(b2.AD_STORAGE, z1VarL);
                        enumMap7.put(b2Var, z1VarL2);
                        c2Var = new c2(enumMap7, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(p1Var2.r().C())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        c2Var = null;
                    }
                } else {
                    p1Var2 = p1Var5;
                    s0Var6 = s0Var4;
                    p4Var = p4Var4;
                    if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(b2.class);
                        enumMap8.put(b2.AD_STORAGE, z1VarL);
                        enumMap8.put(b2Var, z1VarL2);
                        c2Var = new c2(enumMap8, -10);
                        z2 = false;
                    } else {
                        if (TextUtils.isEmpty(p1Var2.r().C())) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        c2Var = null;
                    }
                }
                if (c2Var != null) {
                    p1.l(s2Var);
                    s2Var.R(c2Var, true);
                } else {
                    c2Var = c2VarC;
                }
                p1.l(s2Var);
                p1Var3 = (p1) s2Var.e;
                s2Var.V(c2Var);
                d1Var.v();
                int i12 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
                z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
                if (z1VarL3 != z1Var) {
                    p1.m(u0Var);
                    s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
                }
                z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
                if (z1VarL4 == z1Var) {
                    if (!TextUtils.isEmpty(p1Var2.r().C())) {
                        p1.l(s2Var);
                        s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
                    p1.l(s2Var);
                    s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolI = gVar.I("google_analytics_tcf_data_enabled");
                if (boolI != null) {
                    p1.m(u0Var);
                    s0Var.a("TCF client enabled.");
                    p1.l(s2Var);
                    s2Var.v();
                    com.google.android.gms.measurement.internal.u0 u0Var119 = p1Var3.C;
                    p1.m(u0Var119);
                    u0Var119.J.a("Register tcfPrefChangeListener.");
                    if (s2Var.Q == null) {
                        s2Var.R = new h2(s2Var, p1Var3, 2);
                        s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                s2 s2Var2 = s2Var;
                                s2Var2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    u0 u0Var1110 = ((p1) s2Var2.e).C;
                                    p1.m(u0Var1110);
                                    u0Var1110.K.a("IABTCF_TCString change picked up in listener.");
                                    h2 h2Var = s2Var2.R;
                                    com.google.android.gms.common.internal.x.g(h2Var);
                                    h2Var.b(500L);
                                }
                            }
                        };
                    }
                    d1 d1Var13 = p1Var3.B;
                    p1.k(d1Var13);
                    d1Var13.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                    p1.l(s2Var);
                    s2Var.B();
                } else {
                    p1.m(u0Var);
                    s0Var.a("TCF client enabled.");
                    p1.l(s2Var);
                    s2Var.v();
                    com.google.android.gms.measurement.internal.u0 u0Var1110 = p1Var3.C;
                    p1.m(u0Var1110);
                    u0Var1110.J.a("Register tcfPrefChangeListener.");
                    if (s2Var.Q == null) {
                        s2Var.R = new h2(s2Var, p1Var3, 2);
                        s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                s2 s2Var2 = s2Var;
                                s2Var2.getClass();
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    u0 u0Var1111 = ((p1) s2Var2.e).C;
                                    p1.m(u0Var1111);
                                    u0Var1111.K.a("IABTCF_TCString change picked up in listener.");
                                    h2 h2Var = s2Var2.R;
                                    com.google.android.gms.common.internal.x.g(h2Var);
                                    h2Var.b(500L);
                                }
                            }
                        };
                    }
                    d1 d1Var14 = p1Var3.B;
                    p1.k(d1Var14);
                    d1Var14.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                    p1.l(s2Var);
                    s2Var.B();
                }
                l1Var = d1Var.C;
                if (l1Var.g() == 0) {
                    p1.m(u0Var);
                    s0Var3.b(Long.valueOf(j), "Persisting first open");
                    l1Var.h(j);
                }
                p1.l(s2Var);
                o1Var = s2Var.N;
                if (o1Var.c()) {
                    d1 d1Var15 = o1Var.e.B;
                    p1.k(d1Var15);
                    d1Var15.T.v(null);
                }
                if (p1Var2.h()) {
                    if (p1Var2.d()) {
                        p4Var2 = p4Var;
                        if (p4Var2.Z("android.permission.INTERNET")) {
                            p1.m(u0Var);
                            s0Var7 = s0Var6;
                            s0Var7.a("App is missing INTERNET permission");
                        } else {
                            s0Var7 = s0Var6;
                        }
                        if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                            p1.m(u0Var);
                            s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        p1Var4 = p1Var2;
                        context = p1Var4.e;
                        if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                            if (!p4.r0(context)) {
                                p1.m(u0Var);
                                s0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!p4.Q(context)) {
                                p1.m(u0Var);
                                s0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        p1.m(u0Var);
                        s0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        p1Var4 = p1Var2;
                        p4Var2 = p4Var;
                    }
                    u0Var2 = u0Var;
                } else {
                    p1Var4 = p1Var2;
                    p4Var2 = p4Var;
                    if (TextUtils.isEmpty(p1Var4.r().C())) {
                        String strC9 = p1Var4.r().C();
                        d1Var.v();
                        String string7 = d1Var.z().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strC9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                        if (zIsEmpty) {
                            b1Var2 = b1Var;
                        } else {
                            b1Var2 = b1Var;
                        }
                        String strC10 = p1Var4.r().C();
                        d1Var.v();
                        SharedPreferences.Editor editorEdit8 = d1Var.z().edit();
                        editorEdit8.putString("gmp_app_id", strC10);
                        editorEdit8.apply();
                    } else {
                        b1Var2 = b1Var;
                    }
                    if (!d1Var.C().i(b2Var)) {
                        b1Var2.v(null);
                    }
                    p1.l(s2Var);
                    s2Var.D.set(b1Var2.t());
                    p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    u0Var2 = u0Var;
                    if (!TextUtils.isEmpty(p1Var4.r().C())) {
                        zD = p1Var4.d();
                        sharedPreferences = d1Var.z;
                        if (sharedPreferences == null) {
                            zContains = z2;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            d1Var.D(!zD);
                        }
                        if (zD) {
                            p1.l(s2Var);
                            s2Var.H();
                        }
                        u3 u3Var6 = p1Var4.E;
                        p1.l(u3Var6);
                        u3Var6.B.O();
                        p1Var4.p().z(new AtomicReference());
                        p1Var4.p().A(d1Var.V.J());
                    }
                }
                g4.a();
                if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                    p4Var2.v();
                    if (p4Var2.T() == 1) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        long jIntValue6 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        p1Var4.H.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            p1.m(u0Var2);
                            s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        p1.l(s2Var);
                        s2Var.v();
                        if (s2Var.I == null) {
                            s2Var.I = new h2(s2Var, p1Var3, 0);
                        }
                        s2Var.I.b(jMax);
                    }
                }
                d1Var.L.b(true);
            }
            p1.m(u0Var6);
            n0Var = n0Var2;
            str = "Can't initialize twice";
            u0Var6.C.b(com.google.android.gms.measurement.internal.u0.D(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strB2 = n0Var3.J;
            if (TextUtils.isEmpty(strB2)) {
                strB2 = d2.b(context3, p1Var7.M);
            }
            if (!TextUtils.isEmpty(strB2)) {
                str4 = strB2;
            }
            n0Var3.L = str4;
            if (iG == 0) {
                p1.m(u0Var6);
                u0Var6.K.c(n0Var3.z, n0Var3.L, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            p1.m(u0Var6);
            u0Var6.C.c(com.google.android.gms.measurement.internal.u0.D(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        i = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        n0Var3.z = packageName;
        n0Var3.C = str9;
        n0Var3.A = str2;
        n0Var3.B = i;
        n0Var3.D = string;
        n0Var3.E = 0L;
        iG = p1Var7.g();
        if (iG == 0) {
            p1.m(u0Var6);
            u0Var6.K.a("App measurement collection enabled");
        } else if (iG == 1) {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            p1.m(u0Var6);
            u0Var6.H.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement disabled");
            p1.m(u0Var6);
            u0Var6.D.a("Invalid scion state in identity");
        } else {
            p1.m(u0Var6);
            u0Var6.I.a("App measurement disabled due to denied storage consent");
        }
        n0Var3.L = "";
        listAsList = null;
        n0Var3.H = null;
        com.google.android.gms.measurement.internal.g gVar4 = p1Var7.A;
        p1Var = (p1) gVar4.e;
        com.google.android.gms.common.internal.x.d("analytics.safelisted_events");
        bundleH = gVar4.H();
        if (bundleH != null) {
            if (bundleH.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleH.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = Arrays.asList(stringArray);
                }
            }
            if (listAsList != null) {
                n0Var3.H = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        n0Var3.H = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        p4Var3 = p1Var7.F;
                        p1.k(p4Var3);
                    }
                } while (p4Var3.A0("safelisted event", str3));
            } else {
                p1.m(u0Var6);
                u0Var6.H.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
            } else {
                n0Var3.K = 0;
            }
            ((p1) n0Var3.e).Z.incrementAndGet();
            n0Var3.y = true;
            x2Var = new x2(p1Var5);
            x2Var.x();
            p1Var5.R = x2Var;
            if (!x2Var.y) {
                kotlinx.coroutines.future.a.u(str);
                return;
            }
            x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
            ((p1) x2Var.e).Z.incrementAndGet();
            x2Var.y = true;
            p1.m(u0Var3);
            s0Var = u0Var3.J;
            s0Var2 = u0Var3.I;
            s0Var3 = u0Var3.K;
            s0Var4 = u0Var3.C;
            gVar.B();
            s0Var2.b(161000L, "App measurement initialized, version");
            p1.m(u0Var3);
            s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strB = n0Var.B();
            if (p4Var4.b0(strB, gVar.z)) {
                p1.m(u0Var3);
                s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                p1.m(u0Var3);
                s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
            }
            p1.m(u0Var3);
            s0Var.a("Debug-level message logging enabled");
            i2 = p1Var5.X;
            atomicInteger = p1Var5.Z;
            if (i2 != atomicInteger.get()) {
                p1.m(u0Var3);
                s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            p1Var5.S = true;
            j = p1Var5.a0;
            s2Var = p1Var5.J;
            m1 m1Var6 = p1Var5.D;
            p1.m(m1Var6);
            m1Var6.v();
            p1.j(p1Var5.R);
            iA = p1Var5.R.A();
            g4.a();
            zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
            if (iA == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zG) {
                p4Var4.v();
                if (p4Var4.T() == 1) {
                    p4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    sVar = new androidx.media3.common.util.s(p1Var6);
                    z4 = z;
                    context2 = p1Var6.e;
                    u0Var = u0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    s0Var5 = s0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                    } else {
                        context2.registerReceiver(sVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.u0 u0Var1111 = p1Var6.C;
                    p1.m(u0Var1111);
                    u0Var1111.J.a("Registered app receiver");
                    if (z4) {
                        p1.j(p1Var5.R);
                        p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    p4Var4.v();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    sVar = new androidx.media3.common.util.s(p1Var6);
                    z4 = z;
                    context2 = p1Var6.e;
                    u0Var = u0Var3;
                    i3 = Build.VERSION.SDK_INT;
                    s0Var5 = s0Var2;
                    if (i3 >= 33) {
                        com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                    } else if (i3 >= 26) {
                        androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                    } else {
                        context2.registerReceiver(sVar, intentFilter, null, null);
                    }
                    com.google.android.gms.measurement.internal.u0 u0Var1112 = p1Var6.C;
                    p1.m(u0Var1112);
                    u0Var1112.J.a("Registered app receiver");
                    if (z4) {
                        p1.j(p1Var5.R);
                        p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                    }
                } else {
                    s0Var5 = s0Var2;
                    u0Var = u0Var3;
                }
            } else if (z) {
                z = true;
                p4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                sVar = new androidx.media3.common.util.s(p1Var6);
                z4 = z;
                context2 = p1Var6.e;
                u0Var = u0Var3;
                i3 = Build.VERSION.SDK_INT;
                s0Var5 = s0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                } else {
                    context2.registerReceiver(sVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.u0 u0Var1113 = p1Var6.C;
                p1.m(u0Var1113);
                u0Var1113.J.a("Registered app receiver");
                if (z4) {
                    p1.j(p1Var5.R);
                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                }
            } else {
                s0Var5 = s0Var2;
                u0Var = u0Var3;
            }
            b1Var = d1Var.D;
            c2VarC = d1Var.C();
            int i13 = c2VarC.b;
            z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
            z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
            b2Var = b2.ANALYTICS_STORAGE;
            z1Var = z1.UNINITIALIZED;
            if (z1VarL == z1Var) {
                p1Var2 = p1Var5;
                s0Var6 = s0Var4;
                p4Var = p4Var4;
                if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(b2.class);
                    enumMap9.put(b2.AD_STORAGE, z1VarL);
                    enumMap9.put(b2Var, z1VarL2);
                    c2Var = new c2(enumMap9, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(p1Var2.r().C())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    c2Var = null;
                }
            } else {
                p1Var2 = p1Var5;
                s0Var6 = s0Var4;
                p4Var = p4Var4;
                if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(b2.class);
                    enumMap10.put(b2.AD_STORAGE, z1VarL);
                    enumMap10.put(b2Var, z1VarL2);
                    c2Var = new c2(enumMap10, -10);
                    z2 = false;
                } else {
                    if (TextUtils.isEmpty(p1Var2.r().C())) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    c2Var = null;
                }
            }
            if (c2Var != null) {
                p1.l(s2Var);
                s2Var.R(c2Var, true);
            } else {
                c2Var = c2VarC;
            }
            p1.l(s2Var);
            p1Var3 = (p1) s2Var.e;
            s2Var.V(c2Var);
            d1Var.v();
            int i14 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
            z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
            if (z1VarL3 != z1Var) {
                p1.m(u0Var);
                s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
            }
            z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
            if (z1VarL4 == z1Var) {
                if (!TextUtils.isEmpty(p1Var2.r().C())) {
                    p1.l(s2Var);
                    s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
                p1.l(s2Var);
                s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolI = gVar.I("google_analytics_tcf_data_enabled");
            if (boolI != null) {
                p1.m(u0Var);
                s0Var.a("TCF client enabled.");
                p1.l(s2Var);
                s2Var.v();
                com.google.android.gms.measurement.internal.u0 u0Var1114 = p1Var3.C;
                p1.m(u0Var1114);
                u0Var1114.J.a("Register tcfPrefChangeListener.");
                if (s2Var.Q == null) {
                    s2Var.R = new h2(s2Var, p1Var3, 2);
                    s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            s2 s2Var2 = s2Var;
                            s2Var2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                u0 u0Var1115 = ((p1) s2Var2.e).C;
                                p1.m(u0Var1115);
                                u0Var1115.K.a("IABTCF_TCString change picked up in listener.");
                                h2 h2Var = s2Var2.R;
                                com.google.android.gms.common.internal.x.g(h2Var);
                                h2Var.b(500L);
                            }
                        }
                    };
                }
                d1 d1Var16 = p1Var3.B;
                p1.k(d1Var16);
                d1Var16.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                p1.l(s2Var);
                s2Var.B();
            } else {
                p1.m(u0Var);
                s0Var.a("TCF client enabled.");
                p1.l(s2Var);
                s2Var.v();
                com.google.android.gms.measurement.internal.u0 u0Var1115 = p1Var3.C;
                p1.m(u0Var1115);
                u0Var1115.J.a("Register tcfPrefChangeListener.");
                if (s2Var.Q == null) {
                    s2Var.R = new h2(s2Var, p1Var3, 2);
                    s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            s2 s2Var2 = s2Var;
                            s2Var2.getClass();
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                u0 u0Var1116 = ((p1) s2Var2.e).C;
                                p1.m(u0Var1116);
                                u0Var1116.K.a("IABTCF_TCString change picked up in listener.");
                                h2 h2Var = s2Var2.R;
                                com.google.android.gms.common.internal.x.g(h2Var);
                                h2Var.b(500L);
                            }
                        }
                    };
                }
                d1 d1Var17 = p1Var3.B;
                p1.k(d1Var17);
                d1Var17.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
                p1.l(s2Var);
                s2Var.B();
            }
            l1Var = d1Var.C;
            if (l1Var.g() == 0) {
                p1.m(u0Var);
                s0Var3.b(Long.valueOf(j), "Persisting first open");
                l1Var.h(j);
            }
            p1.l(s2Var);
            o1Var = s2Var.N;
            if (o1Var.c()) {
                d1 d1Var18 = o1Var.e.B;
                p1.k(d1Var18);
                d1Var18.T.v(null);
            }
            if (p1Var2.h()) {
                if (p1Var2.d()) {
                    p4Var2 = p4Var;
                    if (p4Var2.Z("android.permission.INTERNET")) {
                        p1.m(u0Var);
                        s0Var7 = s0Var6;
                        s0Var7.a("App is missing INTERNET permission");
                    } else {
                        s0Var7 = s0Var6;
                    }
                    if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                        p1.m(u0Var);
                        s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    p1Var4 = p1Var2;
                    context = p1Var4.e;
                    if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                        if (!p4.r0(context)) {
                            p1.m(u0Var);
                            s0Var7.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!p4.Q(context)) {
                            p1.m(u0Var);
                            s0Var7.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    p1.m(u0Var);
                    s0Var7.a("Uploading is not possible. App measurement disabled");
                } else {
                    p1Var4 = p1Var2;
                    p4Var2 = p4Var;
                }
                u0Var2 = u0Var;
            } else {
                p1Var4 = p1Var2;
                p4Var2 = p4Var;
                if (TextUtils.isEmpty(p1Var4.r().C())) {
                    String strC11 = p1Var4.r().C();
                    d1Var.v();
                    String string8 = d1Var.z().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strC11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string8);
                    if (zIsEmpty) {
                        b1Var2 = b1Var;
                    } else {
                        b1Var2 = b1Var;
                    }
                    String strC12 = p1Var4.r().C();
                    d1Var.v();
                    SharedPreferences.Editor editorEdit9 = d1Var.z().edit();
                    editorEdit9.putString("gmp_app_id", strC12);
                    editorEdit9.apply();
                } else {
                    b1Var2 = b1Var;
                }
                if (!d1Var.C().i(b2Var)) {
                    b1Var2.v(null);
                }
                p1.l(s2Var);
                s2Var.D.set(b1Var2.t());
                p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                u0Var2 = u0Var;
                if (!TextUtils.isEmpty(p1Var4.r().C())) {
                    zD = p1Var4.d();
                    sharedPreferences = d1Var.z;
                    if (sharedPreferences == null) {
                        zContains = z2;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        d1Var.D(!zD);
                    }
                    if (zD) {
                        p1.l(s2Var);
                        s2Var.H();
                    }
                    u3 u3Var7 = p1Var4.E;
                    p1.l(u3Var7);
                    u3Var7.B.O();
                    p1Var4.p().z(new AtomicReference());
                    p1Var4.p().A(d1Var.V.J());
                }
            }
            g4.a();
            if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                p4Var2.v();
                if (p4Var2.T() == 1) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    long jIntValue7 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    p1Var4.H.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        p1.m(u0Var2);
                        s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    p1.l(s2Var);
                    s2Var.v();
                    if (s2Var.I == null) {
                        s2Var.I = new h2(s2Var, p1Var3, 0);
                    }
                    s2Var.I.b(jMax);
                }
            }
            d1Var.L.b(true);
        }
        com.google.android.gms.measurement.internal.u0 u0Var1116 = p1Var.C;
        p1.m(u0Var1116);
        u0Var1116.C.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = p1Var.e.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            n0Var3.H = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    n0Var3.H = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    p4Var3 = p1Var7.F;
                    p1.k(p4Var3);
                }
            } while (p4Var3.A0("safelisted event", str3));
        } else {
            p1.m(u0Var6);
            u0Var6.H.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            n0Var3.K = com.google.android.gms.common.wrappers.a.e(context3) ? 1 : 0;
        } else {
            n0Var3.K = 0;
        }
        ((p1) n0Var3.e).Z.incrementAndGet();
        n0Var3.y = true;
        x2Var = new x2(p1Var5);
        x2Var.x();
        p1Var5.R = x2Var;
        if (!x2Var.y) {
            kotlinx.coroutines.future.a.u(str);
            return;
        }
        x2Var.z = (JobScheduler) ((p1) x2Var.e).e.getSystemService("jobscheduler");
        ((p1) x2Var.e).Z.incrementAndGet();
        x2Var.y = true;
        p1.m(u0Var3);
        s0Var = u0Var3.J;
        s0Var2 = u0Var3.I;
        s0Var3 = u0Var3.K;
        s0Var4 = u0Var3.C;
        gVar.B();
        s0Var2.b(161000L, "App measurement initialized, version");
        p1.m(u0Var3);
        s0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strB = n0Var.B();
        if (p4Var4.b0(strB, gVar.z)) {
            p1.m(u0Var3);
            s0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            p1.m(u0Var3);
            s0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strB)));
        }
        p1.m(u0Var3);
        s0Var.a("Debug-level message logging enabled");
        i2 = p1Var5.X;
        atomicInteger = p1Var5.Z;
        if (i2 != atomicInteger.get()) {
            p1.m(u0Var3);
            s0Var4.c(Integer.valueOf(p1Var5.X), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        p1Var5.S = true;
        j = p1Var5.a0;
        s2Var = p1Var5.J;
        m1 m1Var7 = p1Var5.D;
        p1.m(m1Var7);
        m1Var7.v();
        p1.j(p1Var5.R);
        iA = p1Var5.R.A();
        g4.a();
        zG = gVar.G(null, com.google.android.gms.measurement.internal.f0.P0);
        if (iA == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zG) {
            p4Var4.v();
            if (p4Var4.T() == 1) {
                p4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                sVar = new androidx.media3.common.util.s(p1Var6);
                z4 = z;
                context2 = p1Var6.e;
                u0Var = u0Var3;
                i3 = Build.VERSION.SDK_INT;
                s0Var5 = s0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                } else {
                    context2.registerReceiver(sVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.u0 u0Var1117 = p1Var6.C;
                p1.m(u0Var1117);
                u0Var1117.J.a("Registered app receiver");
                if (z4) {
                    p1.j(p1Var5.R);
                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                p4Var4.v();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                sVar = new androidx.media3.common.util.s(p1Var6);
                z4 = z;
                context2 = p1Var6.e;
                u0Var = u0Var3;
                i3 = Build.VERSION.SDK_INT;
                s0Var5 = s0Var2;
                if (i3 >= 33) {
                    com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
                } else if (i3 >= 26) {
                    androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
                } else {
                    context2.registerReceiver(sVar, intentFilter, null, null);
                }
                com.google.android.gms.measurement.internal.u0 u0Var1118 = p1Var6.C;
                p1.m(u0Var1118);
                u0Var1118.J.a("Registered app receiver");
                if (z4) {
                    p1.j(p1Var5.R);
                    p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
                }
            } else {
                s0Var5 = s0Var2;
                u0Var = u0Var3;
            }
        } else if (z) {
            z = true;
            p4Var4.v();
            intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            sVar = new androidx.media3.common.util.s(p1Var6);
            z4 = z;
            context2 = p1Var6.e;
            u0Var = u0Var3;
            i3 = Build.VERSION.SDK_INT;
            s0Var5 = s0Var2;
            if (i3 >= 33) {
                com.google.android.gms.common.wrappers.a.h(context2, sVar, intentFilter);
            } else if (i3 >= 26) {
                androidx.media3.common.audio.h.q(context2, sVar, intentFilter);
            } else {
                context2.registerReceiver(sVar, intentFilter, null, null);
            }
            com.google.android.gms.measurement.internal.u0 u0Var1119 = p1Var6.C;
            p1.m(u0Var1119);
            u0Var1119.J.a("Registered app receiver");
            if (z4) {
                p1.j(p1Var5.R);
                p1Var5.R.z(((Long) com.google.android.gms.measurement.internal.f0.C.a(null)).longValue());
            }
        } else {
            s0Var5 = s0Var2;
            u0Var = u0Var3;
        }
        b1Var = d1Var.D;
        c2VarC = d1Var.C();
        int i15 = c2VarC.b;
        z1VarL = gVar.L("google_analytics_default_allow_ad_storage", false);
        z1VarL2 = gVar.L("google_analytics_default_allow_analytics_storage", false);
        b2Var = b2.ANALYTICS_STORAGE;
        z1Var = z1.UNINITIALIZED;
        if (z1VarL == z1Var) {
            p1Var2 = p1Var5;
            s0Var6 = s0Var4;
            p4Var = p4Var4;
            if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(b2.class);
                enumMap11.put(b2.AD_STORAGE, z1VarL);
                enumMap11.put(b2Var, z1VarL2);
                c2Var = new c2(enumMap11, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(p1Var2.r().C())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                c2Var = null;
            }
        } else {
            p1Var2 = p1Var5;
            s0Var6 = s0Var4;
            p4Var = p4Var4;
            if (c2.l(-10, d1Var.z().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(b2.class);
                enumMap12.put(b2.AD_STORAGE, z1VarL);
                enumMap12.put(b2Var, z1VarL2);
                c2Var = new c2(enumMap12, -10);
                z2 = false;
            } else {
                if (TextUtils.isEmpty(p1Var2.r().C())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                c2Var = null;
            }
        }
        if (c2Var != null) {
            p1.l(s2Var);
            s2Var.R(c2Var, true);
        } else {
            c2Var = c2VarC;
        }
        p1.l(s2Var);
        p1Var3 = (p1) s2Var.e;
        s2Var.V(c2Var);
        d1Var.v();
        int i16 = com.google.android.gms.measurement.internal.o.b(d1Var.z().getString("dma_consent_settings", null)).a;
        z1VarL3 = gVar.L("google_analytics_default_allow_ad_personalization_signals", true);
        if (z1VarL3 != z1Var) {
            p1.m(u0Var);
            s0Var3.b(z1VarL3, "Default ad personalization consent from Manifest");
        }
        z1VarL4 = gVar.L("google_analytics_default_allow_ad_user_data", true);
        if (z1VarL4 == z1Var) {
            if (!TextUtils.isEmpty(p1Var2.r().C())) {
                p1.l(s2Var);
                s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(p1Var2.r().C())) {
            p1.l(s2Var);
            s2Var.Q(new com.google.android.gms.measurement.internal.o((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolI = gVar.I("google_analytics_tcf_data_enabled");
        if (boolI != null) {
            p1.m(u0Var);
            s0Var.a("TCF client enabled.");
            p1.l(s2Var);
            s2Var.v();
            com.google.android.gms.measurement.internal.u0 u0Var11110 = p1Var3.C;
            p1.m(u0Var11110);
            u0Var11110.J.a("Register tcfPrefChangeListener.");
            if (s2Var.Q == null) {
                s2Var.R = new h2(s2Var, p1Var3, 2);
                s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        s2 s2Var2 = s2Var;
                        s2Var2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            u0 u0Var11111 = ((p1) s2Var2.e).C;
                            p1.m(u0Var11111);
                            u0Var11111.K.a("IABTCF_TCString change picked up in listener.");
                            h2 h2Var = s2Var2.R;
                            com.google.android.gms.common.internal.x.g(h2Var);
                            h2Var.b(500L);
                        }
                    }
                };
            }
            d1 d1Var19 = p1Var3.B;
            p1.k(d1Var19);
            d1Var19.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
            p1.l(s2Var);
            s2Var.B();
        } else {
            p1.m(u0Var);
            s0Var.a("TCF client enabled.");
            p1.l(s2Var);
            s2Var.v();
            com.google.android.gms.measurement.internal.u0 u0Var11111 = p1Var3.C;
            p1.m(u0Var11111);
            u0Var11111.J.a("Register tcfPrefChangeListener.");
            if (s2Var.Q == null) {
                s2Var.R = new h2(s2Var, p1Var3, 2);
                s2Var.Q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        s2 s2Var2 = s2Var;
                        s2Var2.getClass();
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            u0 u0Var11112 = ((p1) s2Var2.e).C;
                            p1.m(u0Var11112);
                            u0Var11112.K.a("IABTCF_TCString change picked up in listener.");
                            h2 h2Var = s2Var2.R;
                            com.google.android.gms.common.internal.x.g(h2Var);
                            h2Var.b(500L);
                        }
                    }
                };
            }
            d1 d1Var110 = p1Var3.B;
            p1.k(d1Var110);
            d1Var110.A().registerOnSharedPreferenceChangeListener(s2Var.Q);
            p1.l(s2Var);
            s2Var.B();
        }
        l1Var = d1Var.C;
        if (l1Var.g() == 0) {
            p1.m(u0Var);
            s0Var3.b(Long.valueOf(j), "Persisting first open");
            l1Var.h(j);
        }
        p1.l(s2Var);
        o1Var = s2Var.N;
        if (o1Var.c()) {
            d1 d1Var111 = o1Var.e.B;
            p1.k(d1Var111);
            d1Var111.T.v(null);
        }
        if (p1Var2.h()) {
            if (p1Var2.d()) {
                p4Var2 = p4Var;
                if (p4Var2.Z("android.permission.INTERNET")) {
                    p1.m(u0Var);
                    s0Var7 = s0Var6;
                    s0Var7.a("App is missing INTERNET permission");
                } else {
                    s0Var7 = s0Var6;
                }
                if (!p4Var2.Z("android.permission.ACCESS_NETWORK_STATE")) {
                    p1.m(u0Var);
                    s0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                p1Var4 = p1Var2;
                context = p1Var4.e;
                if (!com.google.android.gms.common.wrappers.b.a(context).d()) {
                    if (!p4.r0(context)) {
                        p1.m(u0Var);
                        s0Var7.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!p4.Q(context)) {
                        p1.m(u0Var);
                        s0Var7.a("AppMeasurementService not registered/enabled");
                    }
                }
                p1.m(u0Var);
                s0Var7.a("Uploading is not possible. App measurement disabled");
            } else {
                p1Var4 = p1Var2;
                p4Var2 = p4Var;
            }
            u0Var2 = u0Var;
        } else {
            p1Var4 = p1Var2;
            p4Var2 = p4Var;
            if (TextUtils.isEmpty(p1Var4.r().C())) {
                String strC13 = p1Var4.r().C();
                d1Var.v();
                String string9 = d1Var.z().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strC13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string9);
                if (zIsEmpty) {
                    b1Var2 = b1Var;
                } else {
                    b1Var2 = b1Var;
                }
                String strC14 = p1Var4.r().C();
                d1Var.v();
                SharedPreferences.Editor editorEdit10 = d1Var.z().edit();
                editorEdit10.putString("gmp_app_id", strC14);
                editorEdit10.apply();
            } else {
                b1Var2 = b1Var;
            }
            if (!d1Var.C().i(b2Var)) {
                b1Var2.v(null);
            }
            p1.l(s2Var);
            s2Var.D.set(b1Var2.t());
            p1Var6.e.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            u0Var2 = u0Var;
            if (!TextUtils.isEmpty(p1Var4.r().C())) {
                zD = p1Var4.d();
                sharedPreferences = d1Var.z;
                if (sharedPreferences == null) {
                    zContains = z2;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    d1Var.D(!zD);
                }
                if (zD) {
                    p1.l(s2Var);
                    s2Var.H();
                }
                u3 u3Var8 = p1Var4.E;
                p1.l(u3Var8);
                u3Var8.B.O();
                p1Var4.p().z(new AtomicReference());
                p1Var4.p().A(d1Var.V.J());
            }
        }
        g4.a();
        if (gVar.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
            p4Var2.v();
            if (p4Var2.T() == 1) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (z3) {
                long jIntValue8 = ((Integer) com.google.android.gms.measurement.internal.f0.w0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                p1Var4.H.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    p1.m(u0Var2);
                    s0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                p1.l(s2Var);
                s2Var.v();
                if (s2Var.I == null) {
                    s2Var.I = new h2(s2Var, p1Var3, 0);
                }
                s2Var.I.b(jMax);
            }
        }
        d1Var.L.b(true);
    }

    private final void e() {
        com.google.android.gms.tasks.n nVar = (com.google.android.gms.tasks.n) this.z;
        synchronized (nVar.z) {
            ((com.google.android.gms.tasks.d) nVar.A).onComplete((com.google.android.gms.tasks.i) this.y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x030d  */
    /* JADX WARN: Code duplicated, block: B:293:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thO;
        com.google.firebase.platforminfo.d dVar;
        com.app.mlounge.data.music.e eVar;
        androidx.appcompat.widget.g gVar;
        com.google.android.gms.common.internal.i iVar;
        com.google.android.gms.common.internal.i j0Var;
        Long lValueOf;
        int i = 0;
        b = 0;
        byte b = 0;
        androidx.work.impl.model.p pVar = null;
        int i2 = 1;
        switch (this.e) {
            case 0:
                j0 j0Var2 = (j0) this.z;
                Future future = (Future) this.y;
                if ((future instanceof r) && (thO = ((r) future).o()) != null) {
                    j0Var2.j(thO);
                    return;
                }
                try {
                    j0Var2.b(m0.b(future));
                    return;
                } catch (ExecutionException e) {
                    j0Var2.j(e.getCause());
                    return;
                } catch (Throwable th) {
                    j0Var2.j(th);
                    return;
                }
            case 1:
                androidx.appcompat.widget.g gVar2 = (androidx.appcompat.widget.g) this.y;
                androidx.appcompat.widget.j jVar = (androidx.appcompat.widget.j) this.z;
                androidx.appcompat.view.menu.j jVar2 = jVar.z;
                if (jVar2 != null && (dVar = jVar2.e) != null && (eVar = ((ActionMenuView) dVar.e).Q) != null) {
                    Toolbar toolbar = (Toolbar) eVar.y;
                    androidx.appcompat.widget.j jVar3 = toolbar.e.P;
                    if (jVar3 == null || (gVar = jVar3.O) == null || !gVar.b()) {
                        Iterator it = toolbar.g0.b.iterator();
                        while (it.hasNext()) {
                            ((androidx.fragment.app.f) ((androidx.core.view.n) it.next())).a.u();
                        }
                    }
                }
                ActionMenuView actionMenuView = jVar.D;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (gVar2.b()) {
                        jVar.O = gVar2;
                    } else if (gVar2.e != null) {
                        gVar2.d(0, 0, false, false);
                        jVar.O = gVar2;
                    }
                }
                jVar.Q = null;
                return;
            case 2:
                com.google.firebase.platforminfo.d dVar2 = (com.google.firebase.platforminfo.d) this.y;
                Typeface typeface = (Typeface) this.z;
                androidx.core.content.res.b bVar = (androidx.core.content.res.b) dVar2.e;
                if (bVar != null) {
                    bVar.f(typeface);
                    return;
                }
                return;
            case 3:
                ((androidx.core.provider.f) this.y).accept(this.z);
                return;
            case 4:
                androidx.work.y yVarE = androidx.work.y.e();
                String str = androidx.work.impl.background.greedy.a.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                androidx.work.impl.model.p pVar2 = (androidx.work.impl.model.p) this.y;
                sb.append(pVar2.a);
                yVarE.a(str, sb.toString());
                ((androidx.work.impl.background.greedy.a) this.z).a.a(pVar2);
                return;
            case 5:
                androidx.work.impl.d dVar3 = ((androidx.work.impl.foreground.a) this.z).e.f;
                String str2 = (String) this.y;
                synchronized (dVar3.k) {
                    try {
                        androidx.work.impl.h0 h0VarC = dVar3.c(str2);
                        if (h0VarC != null) {
                            pVar = h0VarC.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (pVar == null || kotlin.jvm.internal.l.a(androidx.work.e.j, pVar.j)) {
                    return;
                }
                synchronized (((androidx.work.impl.foreground.a) this.z).z) {
                    ((androidx.work.impl.foreground.a) this.z).C.put(coil3.svg.internal.a.q(pVar), pVar);
                    androidx.work.impl.foreground.a aVar = (androidx.work.impl.foreground.a) this.z;
                    ((androidx.work.impl.foreground.a) this.z).D.put(coil3.svg.internal.a.q(pVar), androidx.work.impl.constraints.j.a(aVar.E, pVar, ((androidx.work.impl.utils.taskexecutor.c) aVar.y).b, aVar));
                    break;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                com.google.android.gms.cloudmessaging.l lVar = (com.google.android.gms.cloudmessaging.l) this.y;
                IBinder iBinder = (IBinder) this.z;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.a("Null service connection");
                    } else {
                        try {
                            lVar.z = new androidx.work.impl.k(iBinder);
                            lVar.e = 2;
                            ((ScheduledExecutorService) lVar.C.z).execute(new com.google.android.gms.cloudmessaging.j(lVar, i));
                        } catch (RemoteException e2) {
                            lVar.a(e2.getMessage());
                        }
                    }
                }
                return;
            case 8:
                b();
                return;
            case 9:
                com.google.android.gms.common.b bVar2 = (com.google.android.gms.common.b) this.y;
                com.google.android.gms.common.api.internal.m mVar = (com.google.android.gms.common.api.internal.m) this.z;
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) mVar.y;
                com.google.android.gms.common.api.internal.k kVar = (com.google.android.gms.common.api.internal.k) ((com.google.android.gms.common.api.internal.e) mVar.C).G.get((com.google.android.gms.common.api.internal.b) mVar.z);
                if (kVar == null) {
                    return;
                }
                if (bVar2.y != 0) {
                    kVar.p(bVar2, null);
                    return;
                }
                mVar.e = true;
                if (cVar.l()) {
                    if (!mVar.e || (iVar = (com.google.android.gms.common.internal.i) mVar.A) == null) {
                        return;
                    }
                    cVar.c(iVar, (Set) mVar.B);
                    return;
                }
                try {
                    cVar.c(null, cVar.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    cVar.d("Failed to get service from broker.");
                    kVar.p(new com.google.android.gms.common.b(10, null, null), null);
                    return;
                }
            case 10:
                c();
                return;
            case 11:
                com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) this.z;
                com.google.android.gms.signin.internal.e eVar2 = (com.google.android.gms.signin.internal.e) this.y;
                com.google.android.gms.common.b bVar3 = eVar2.y;
                if (bVar3.y == 0) {
                    com.google.android.gms.common.internal.r rVar = eVar2.z;
                    com.google.android.gms.common.internal.x.g(rVar);
                    com.google.android.gms.common.b bVar4 = rVar.z;
                    if (bVar4.y != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        uVar.k.c(bVar4);
                        uVar.j.o();
                        return;
                    }
                    com.google.android.gms.common.api.internal.m mVar2 = uVar.k;
                    IBinder iBinder2 = rVar.y;
                    if (iBinder2 == null) {
                        j0Var = null;
                    } else {
                        int i3 = com.google.android.gms.common.internal.a.e;
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        j0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.i ? (com.google.android.gms.common.internal.i) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.j0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = uVar.h;
                    mVar2.getClass();
                    if (j0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        mVar2.c(new com.google.android.gms.common.b(4, null, null));
                    } else {
                        mVar2.A = j0Var;
                        mVar2.B = set;
                        if (mVar2.e) {
                            ((com.google.android.gms.common.api.c) mVar2.y).c(j0Var, set);
                        }
                    }
                } else {
                    uVar.k.c(bVar3);
                }
                uVar.j.o();
                return;
            case 12:
                y1 y1Var = (y1) this.y;
                y1Var.a();
                if (androidx.work.impl.model.f.v()) {
                    y1Var.e().E(this);
                    return;
                }
                com.google.android.gms.measurement.internal.n nVar = (com.google.android.gms.measurement.internal.n) this.z;
                i = nVar.c != 0 ? 1 : 0;
                nVar.c = 0L;
                if (i != 0) {
                    nVar.a();
                    return;
                }
                return;
            case 13:
                e1 e1Var = (e1) this.z;
                p1 p1Var = e1Var.y.b;
                m1 m1Var = p1Var.D;
                p1.m(m1Var);
                m1Var.v();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", e1Var.e);
                try {
                    p5 p5Var = (p5) ((r5) this.y);
                    Parcel parcelH = p5Var.h();
                    o5.b(parcelH, bundle);
                    Parcel parcelC = p5Var.c(parcelH, 1);
                    Bundle bundle2 = (Bundle) o5.a(parcelC, Bundle.CREATOR);
                    parcelC.recycle();
                    if (bundle2 == null) {
                        com.google.android.gms.measurement.internal.u0 u0Var = p1Var.C;
                        p1.m(u0Var);
                        u0Var.C.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    com.google.android.gms.measurement.internal.u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                m1 m1Var2 = p1Var.D;
                p1.m(m1Var2);
                m1Var2.v();
                throw new IllegalStateException("Unexpected call on client side");
            case 14:
                d();
                return;
            case 15:
                w1 w1Var = (w1) this.z;
                w1Var.d.W();
                com.google.android.gms.measurement.internal.e eVar3 = (com.google.android.gms.measurement.internal.e) this.y;
                Object objD = eVar3.z.d();
                j4 j4Var = w1Var.d;
                if (objD == null) {
                    j4Var.getClass();
                    String str3 = eVar3.e;
                    com.google.android.gms.common.internal.x.g(str3);
                    r4 r4VarQ = j4Var.Q(str3);
                    if (r4VarQ != null) {
                        j4Var.b0(eVar3, r4VarQ);
                        return;
                    }
                    return;
                }
                j4Var.getClass();
                String str4 = eVar3.e;
                com.google.android.gms.common.internal.x.g(str4);
                r4 r4VarQ2 = j4Var.Q(str4);
                if (r4VarQ2 != null) {
                    j4Var.a0(eVar3, r4VarQ2);
                    return;
                }
                return;
            case 16:
                b6 b6Var = (b6) this.y;
                s2 s2Var = (s2) this.z;
                u3 u3Var = ((p1) s2Var.e).E;
                p1.l(u3Var);
                p1 p1Var2 = (p1) u3Var.e;
                d1 d1Var = p1Var2.B;
                d1 d1Var2 = p1Var2.B;
                p1.k(d1Var);
                if (d1Var.C().i(b2.ANALYTICS_STORAGE)) {
                    p1.k(d1Var2);
                    p1Var2.H.getClass();
                    if (!d1Var2.E(System.currentTimeMillis())) {
                        p1.k(d1Var2);
                        if (d1Var2.N.g() != 0) {
                            p1.k(d1Var2);
                            lValueOf = Long.valueOf(d1Var2.N.g());
                        }
                    }
                    if (lValueOf == null) {
                        p4 p4Var = ((p1) s2Var.e).F;
                        p1.k(p4Var);
                        p4Var.k0(b6Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            b6Var.w(null);
                            return;
                        } catch (RemoteException e5) {
                            com.google.android.gms.measurement.internal.u0 u0Var3 = ((p1) s2Var.e).C;
                            p1.m(u0Var3);
                            u0Var3.C.b(e5, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                com.google.android.gms.measurement.internal.u0 u0Var4 = p1Var2.C;
                p1.m(u0Var4);
                u0Var4.H.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    b6Var.w(null);
                    return;
                }
                p4 p4Var2 = ((p1) s2Var.e).F;
                p1.k(p4Var2);
                p4Var2.k0(b6Var, lValueOf.longValue());
                return;
            case 17:
                ((s2) this.z).M((Boolean) this.y, true);
                return;
            case 18:
                s2 s2Var2 = (s2) this.z;
                p1 p1Var3 = (p1) s2Var2.e;
                d1 d1Var3 = p1Var3.B;
                com.google.android.gms.measurement.internal.u0 u0Var5 = p1Var3.C;
                p1.k(d1Var3);
                d1Var3.v();
                d1Var3.v();
                com.google.android.gms.measurement.internal.o oVarB = com.google.android.gms.measurement.internal.o.b(d1Var3.z().getString("dma_consent_settings", null));
                com.google.android.gms.measurement.internal.o oVar = (com.google.android.gms.measurement.internal.o) this.y;
                int i4 = oVar.a;
                if (!c2.l(i4, oVarB.a)) {
                    p1.m(u0Var5);
                    u0Var5.I.b(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = d1Var3.z().edit();
                editorEdit.putString("dma_consent_settings", oVar.b);
                editorEdit.apply();
                p1.m(u0Var5);
                u0Var5.K.b(oVar, "Setting DMA consent(FE)");
                p1 p1Var4 = (p1) s2Var2.e;
                if (p1Var4.p().F()) {
                    m3 m3VarP = p1Var4.p();
                    m3VarP.v();
                    m3VarP.w();
                    m3VarP.J(new k3(m3VarP, i2));
                    return;
                }
                m3 m3VarP2 = p1Var4.p();
                m3VarP2.v();
                m3VarP2.w();
                if (m3VarP2.E()) {
                    m3VarP2.J(new h3(m3VarP2, m3VarP2.L(false)));
                    return;
                }
                return;
            case 19:
                s2 s2Var3 = ((AppMeasurementDynamiteService) this.z).d.J;
                p1.l(s2Var3);
                androidx.work.impl.k kVar2 = (androidx.work.impl.k) this.y;
                s2Var3.v();
                s2Var3.w();
                androidx.work.impl.k kVar3 = s2Var3.A;
                if (kVar2 != kVar3) {
                    com.google.android.gms.common.internal.x.i("EventInterceptor already set.", kVar3 == null);
                }
                s2Var3.A = kVar2;
                return;
            case 20:
                p1 p1Var5 = (p1) ((s2) this.y).e;
                com.google.android.gms.measurement.internal.n0 n0VarR = p1Var5.r();
                String str5 = (String) this.z;
                String str6 = n0VarR.O;
                if (str6 != null && !str6.equals(str5)) {
                    b = 1;
                }
                n0VarR.O = str5;
                if (b != 0) {
                    p1Var5.r().A();
                    return;
                }
                return;
            case 21:
                m3 m3Var = (m3) this.z;
                com.google.android.gms.measurement.internal.i0 i0Var = m3Var.A;
                p1 p1Var6 = (p1) m3Var.e;
                if (i0Var == null) {
                    com.google.android.gms.measurement.internal.u0 u0Var6 = p1Var6.C;
                    p1.m(u0Var6);
                    u0Var6.C.a("Failed to send current screen to service");
                    return;
                }
                try {
                    a3 a3Var = (a3) this.y;
                    if (a3Var == null) {
                        i0Var.k(0L, null, null, p1Var6.e.getPackageName());
                    } else {
                        i0Var.k(a3Var.c, a3Var.a, a3Var.b, p1Var6.e.getPackageName());
                    }
                    m3Var.I();
                    return;
                } catch (RemoteException e6) {
                    com.google.android.gms.measurement.internal.u0 u0Var7 = ((p1) m3Var.e).C;
                    p1.m(u0Var7);
                    u0Var7.C.b(e6, "Failed to send current screen to the service");
                    return;
                }
            case 22:
                ((l3) this.z).z.G((ComponentName) this.y);
                return;
            case 23:
                m3 m3Var2 = ((l3) this.z).z;
                m3Var2.A = null;
                if (((com.google.android.gms.common.b) this.y).y != 7777) {
                    m3Var2.K();
                    return;
                }
                if (m3Var2.D == null) {
                    m3Var2.D = Executors.newScheduledThreadPool(1);
                }
                m3Var2.D.schedule(new androidx.appcompat.widget.z0(this, 20), ((Long) com.google.android.gms.measurement.internal.f0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 24:
                j4 j4Var2 = (j4) this.y;
                j4Var2.W();
                Runnable runnable = (Runnable) this.z;
                j4Var2.e().v();
                if (j4Var2.M == null) {
                    j4Var2.M = new ArrayList();
                }
                j4Var2.M.add(runnable);
                j4Var2.q();
                return;
            case 25:
                androidx.media3.exoplayer.hls.c cVar2 = (androidx.media3.exoplayer.hls.c) this.y;
                JobParameters jobParameters = (JobParameters) this.z;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((p3) ((Service) cVar2.y)).c(jobParameters);
                return;
            case 26:
                com.google.android.gms.tasks.i iVar2 = (com.google.android.gms.tasks.i) this.y;
                boolean z = ((com.google.android.gms.tasks.s) iVar2).d;
                com.google.android.gms.tasks.m mVar3 = (com.google.android.gms.tasks.m) this.z;
                if (z) {
                    mVar3.A.n();
                    return;
                }
                try {
                    ((com.google.android.gms.tasks.m) this.z).A.k(mVar3.z.d(iVar2));
                    return;
                } catch (com.google.android.gms.tasks.g e7) {
                    boolean z2 = e7.getCause() instanceof Exception;
                    com.google.android.gms.tasks.m mVar4 = (com.google.android.gms.tasks.m) this.z;
                    if (z2) {
                        mVar4.A.m((Exception) e7.getCause());
                        return;
                    } else {
                        mVar4.A.m(e7);
                        return;
                    }
                } catch (Exception e8) {
                    ((com.google.android.gms.tasks.m) this.z).A.m(e8);
                    return;
                }
            case 27:
                com.google.android.gms.tasks.m mVar5 = (com.google.android.gms.tasks.m) this.z;
                try {
                    com.google.android.gms.tasks.i iVar3 = (com.google.android.gms.tasks.i) mVar5.z.d((com.google.android.gms.tasks.i) this.y);
                    if (iVar3 == null) {
                        mVar5.F(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    com.google.android.gms.tasks.r rVar2 = com.google.android.gms.tasks.k.b;
                    iVar3.c(rVar2, mVar5);
                    iVar3.b(rVar2, mVar5);
                    com.google.android.gms.tasks.s sVar = (com.google.android.gms.tasks.s) iVar3;
                    sVar.b.h(new com.google.android.gms.tasks.n((Executor) rVar2, (com.google.android.gms.tasks.c) mVar5));
                    sVar.p();
                    return;
                } catch (com.google.android.gms.tasks.g e9) {
                    if (e9.getCause() instanceof Exception) {
                        mVar5.A.m((Exception) e9.getCause());
                        return;
                    } else {
                        mVar5.A.m(e9);
                        return;
                    }
                } catch (Exception e10) {
                    mVar5.A.m(e10);
                    return;
                }
            case 28:
                e();
                return;
            default:
                com.google.android.gms.tasks.n nVar2 = (com.google.android.gms.tasks.n) this.z;
                synchronized (nVar2.z) {
                    try {
                        com.google.android.gms.tasks.e eVar4 = (com.google.android.gms.tasks.e) nVar2.A;
                        if (eVar4 != null) {
                            Exception excE = ((com.google.android.gms.tasks.i) this.y).e();
                            com.google.android.gms.common.internal.x.g(excE);
                            eVar4.F(excE);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(k0.class.getSimpleName());
                j0 j0Var = (j0) this.z;
                com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(1, false);
                ((com.google.android.material.internal.k) jVar.A).z = kVar;
                jVar.A = kVar;
                kVar.y = j0Var;
                return jVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k0(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = obj2;
    }

    public k0(androidx.media3.exoplayer.hls.c cVar, j4 j4Var, Runnable runnable) {
        this.e = 24;
        this.y = j4Var;
        this.z = runnable;
    }

    public k0(e1 e1Var, r5 r5Var, e1 e1Var2) {
        this.e = 13;
        this.y = r5Var;
        this.z = e1Var;
    }

    public /* synthetic */ k0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public k0(m3 m3Var, a3 a3Var) {
        this.e = 21;
        this.y = a3Var;
        Objects.requireNonNull(m3Var);
        this.z = m3Var;
    }
}
