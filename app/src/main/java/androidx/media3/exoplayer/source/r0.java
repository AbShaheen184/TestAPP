package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.exoplayer.l1;
import com.google.android.gms.measurement.internal.d3;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.t3;
import com.google.android.gms.measurement.internal.u3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements androidx.media3.extractor.ogg.g {
    public Object A;
    public long e;
    public long y;
    public Object z;

    public r0(long j, int i) {
        _COROUTINE.a.A(((androidx.media3.exoplayer.upstream.a) this.z) == null);
        this.e = j;
        this.y = j + ((long) i);
    }

    public void a(Object obj, Object obj2, coil3.memory.d dVar) {
        coil3.memory.d dVar2 = (coil3.memory.d) obj2;
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) ((androidx.compose.ui.input.pointer.util.b) this.A).b).o((coil3.memory.a) obj, dVar2.a, dVar2.b, dVar2.c);
    }

    @Override // androidx.media3.extractor.ogg.g
    public long b(androidx.media3.extractor.o oVar) {
        long j = this.y;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.y = -1L;
        return j2;
    }

    public long c() {
        if (this.y == -1) {
            long jD = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.z).entrySet()) {
                jD += d(entry.getKey(), entry.getValue());
            }
            this.y = jD;
        }
        return this.y;
    }

    public long d(Object obj, Object obj2) throws Exception {
        try {
            long j = ((coil3.memory.d) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.y = -1L;
            throw e;
        }
    }

    public void e(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.z;
        while (c() > j) {
            if (linkedHashMap.isEmpty()) {
                if (c() == 0) {
                    return;
                }
                kotlinx.coroutines.future.a.u("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) kotlin.collections.p.A(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.y = c() - d(key, value);
                a(key, value, null);
            }
        }
    }

    @Override // androidx.media3.extractor.ogg.g
    public androidx.media3.extractor.a0 f() {
        _COROUTINE.a.A(this.e != -1);
        return new androidx.media3.extractor.s((androidx.media3.extractor.t) this.z, this.e, 0);
    }

    public boolean g(long j, boolean z, boolean z2) {
        u3 u3Var = (u3) this.A;
        u3Var.v();
        u3Var.w();
        p1 p1Var = (p1) u3Var.e;
        boolean zD = p1Var.d();
        com.google.android.gms.measurement.internal.u0 u0Var = p1Var.C;
        if (zD) {
            com.google.android.gms.measurement.internal.d1 d1Var = p1Var.B;
            p1.k(d1Var);
            l1 l1Var = d1Var.M;
            p1Var.H.getClass();
            l1Var.h(System.currentTimeMillis());
        }
        long j2 = j - this.e;
        if (!z && j2 < 1000) {
            p1.m(u0Var);
            u0Var.K.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.y;
            this.y = j;
        }
        p1.m(u0Var);
        u0Var.K.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !p1Var.A.K();
        d3 d3Var = p1Var.I;
        p1.l(d3Var);
        p4.s0(d3Var.z(z3), bundle, true);
        if (!z2) {
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.e = j;
        t3 t3Var = (t3) this.z;
        t3Var.c();
        t3Var.b(((Long) com.google.android.gms.measurement.internal.f0.p0.a(null)).longValue());
        return true;
    }

    @Override // androidx.media3.extractor.ogg.g
    public void l(long j) {
        long[] jArr = (long[]) ((androidx.localbroadcastmanager.content.b) this.A).y;
        this.y = jArr[androidx.media3.common.util.i0.f(jArr, j, true)];
    }

    public r0(String str, byte[] bArr, long j, long j2) {
        this.z = str;
        this.A = bArr;
        this.e = j;
        this.y = j2;
    }
}
