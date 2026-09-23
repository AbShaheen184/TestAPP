package androidx.media3.datasource;

import android.os.SystemClock;
import androidx.media3.common.util.i0;
import com.google.common.collect.a1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements h {
    public l A;
    public final boolean e;
    public final ArrayList y = new ArrayList(1);
    public int z;

    public c(boolean z) {
        this.e = z;
    }

    public final void a(int i) {
        l lVar = this.A;
        String str = i0.a;
        for (int i2 = 0; i2 < this.z; i2++) {
            androidx.media3.exoplayer.upstream.f fVar = (androidx.media3.exoplayer.upstream.f) this.y.get(i2);
            boolean z = this.e;
            synchronized (fVar) {
                a1 a1Var = androidx.media3.exoplayer.upstream.f.p;
                if (z && (lVar.i & 8) != 8) {
                    fVar.i += (long) i;
                }
            }
        }
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        ArrayList arrayList = this.y;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
        this.z++;
    }

    public final void h() {
        l lVar = this.A;
        String str = i0.a;
        for (int i = 0; i < this.z; i++) {
            androidx.media3.exoplayer.upstream.f fVar = (androidx.media3.exoplayer.upstream.f) this.y.get(i);
            boolean z = this.e;
            synchronized (fVar) {
                try {
                    a1 a1Var = androidx.media3.exoplayer.upstream.f.p;
                    if (z && (lVar.i & 8) != 8) {
                        _COROUTINE.a.A(fVar.g > 0);
                        fVar.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (jElapsedRealtime - fVar.h);
                        fVar.j += (long) i2;
                        long j = fVar.k;
                        long j2 = fVar.i;
                        fVar.k = j + j2;
                        if (i2 > 0) {
                            fVar.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                            if (fVar.j >= 2000 || fVar.k >= 524288) {
                                fVar.l = (long) fVar.f.b();
                            }
                            fVar.b(fVar.i, fVar.l, i2);
                            fVar.h = jElapsedRealtime;
                            fVar.i = 0L;
                        }
                        fVar.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.A = null;
    }

    public final void k() {
        for (int i = 0; i < this.z; i++) {
            ((androidx.media3.exoplayer.upstream.f) this.y.get(i)).getClass();
        }
    }

    public final void m(l lVar) {
        this.A = lVar;
        for (int i = 0; i < this.z; i++) {
            androidx.media3.exoplayer.upstream.f fVar = (androidx.media3.exoplayer.upstream.f) this.y.get(i);
            boolean z = this.e;
            synchronized (fVar) {
                try {
                    a1 a1Var = androidx.media3.exoplayer.upstream.f.p;
                    if (z && (lVar.i & 8) != 8) {
                        if (fVar.g == 0) {
                            fVar.d.getClass();
                            fVar.h = SystemClock.elapsedRealtime();
                        }
                        fVar.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
