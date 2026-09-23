package androidx.compose.foundation.text.selection;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.caverock.androidsvg.x1;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements androidx.media3.exoplayer.mediacodec.k {
    public Object A;
    public final /* synthetic */ int e;
    public boolean y;
    public Object z;

    public q0(q0 q0Var, com.google.android.gms.common.d[] dVarArr, boolean z) {
        this.e = 7;
        this.A = q0Var;
        this.z = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.y = z2;
    }

    public static q0 c() {
        q0 q0Var = new q0(6);
        q0Var.y = true;
        return q0Var;
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((androidx.compose.foundation.text.input.internal.o) this.A).y;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (androidx.compose.ui.input.pointer.u.e(((androidx.compose.ui.input.pointer.x) obj).a, j)) {
                break;
            }
            i++;
        }
        androidx.compose.ui.input.pointer.x xVar = (androidx.compose.ui.input.pointer.x) obj;
        if (xVar != null) {
            return xVar.h;
        }
        return false;
    }

    public q0 b() {
        com.google.android.gms.common.internal.x.a("execute parameter required", ((com.google.android.gms.common.api.internal.h) this.z) != null);
        return new q0(this, (com.google.android.gms.common.d[]) this.A, this.y);
    }

    @Override // androidx.media3.exoplayer.mediacodec.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public androidx.media3.exoplayer.mediacodec.b k(x1 x1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        androidx.media3.exoplayer.mediacodec.m dVar;
        int i;
        String str = ((androidx.media3.exoplayer.mediacodec.o) x1Var.a).a;
        androidx.media3.exoplayer.mediacodec.b bVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.y || Build.VERSION.SDK_INT < 36) {
                    dVar = new androidx.media3.exoplayer.mediacodec.d(mediaCodecCreateByCodecName, (HandlerThread) ((androidx.media3.exoplayer.q) this.A).get());
                    i = 0;
                } else {
                    dVar = new androidx.media3.exoplayer.dash.manifest.t(mediaCodecCreateByCodecName);
                    i = 4;
                }
                androidx.media3.exoplayer.mediacodec.b bVar2 = new androidx.media3.exoplayer.mediacodec.b(mediaCodecCreateByCodecName, (HandlerThread) ((androidx.media3.exoplayer.q) this.z).get(), dVar, (androidx.media3.exoplayer.mediacodec.j) x1Var.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) x1Var.d;
                    if (surface == null && ((androidx.media3.exoplayer.mediacodec.o) x1Var.a).h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    androidx.media3.exoplayer.mediacodec.b.a(bVar2, (MediaFormat) x1Var.b, surface, (MediaCrypto) x1Var.e, i);
                    return bVar2;
                } catch (Exception e) {
                    e = e;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public j e() {
        w wVar = (w) this.A;
        int i = wVar.b;
        int i2 = wVar.c;
        if (i < i2) {
            return j.y;
        }
        return i > i2 ? j.e : j.z;
    }

    public void f() {
        if (this.y) {
            b1.b((b1) this.A, (androidx.compose.ui.text.l0) this.z);
        }
    }

    public long g(androidx.compose.ui.text.input.x xVar, long j, boolean z, androidx.collection.g gVar) {
        b1 b1Var = (b1) this.A;
        long jC = b1.c(b1Var, xVar, j, z, false, gVar, false);
        if (!androidx.compose.ui.text.l0.a(jC, (androidx.compose.ui.text.l0) this.z)) {
            this.y = false;
        }
        b1Var.q(androidx.compose.ui.text.l0.c(jC) ? androidx.compose.foundation.text.g0.z : androidx.compose.foundation.text.g0.y);
        return jC;
    }

    public void h(com.google.android.gms.tasks.p pVar) {
        synchronized (this.z) {
            try {
                if (((ArrayDeque) this.A) == null) {
                    this.A = new ArrayDeque();
                }
                ((ArrayDeque) this.A).add(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(com.google.android.gms.tasks.i iVar) {
        com.google.android.gms.tasks.p pVar;
        synchronized (this.z) {
            if (((ArrayDeque) this.A) != null && !this.y) {
                this.y = true;
                while (true) {
                    synchronized (this.z) {
                        try {
                            pVar = (com.google.android.gms.tasks.p) ((ArrayDeque) this.A).poll();
                            if (pVar == null) {
                                this.y = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    pVar.a(iVar);
                }
            }
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.y + ", crossed=" + e() + ", info=\n\t" + ((w) this.A) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q0(int i) {
        this.e = i;
    }

    public q0() {
        this.e = 8;
        this.z = new Object();
    }

    public q0(androidx.collection.s sVar, androidx.compose.foundation.text.input.internal.o oVar) {
        this.e = 2;
        this.z = sVar;
        this.A = oVar;
    }

    public q0(androidx.media3.exoplayer.q qVar, androidx.media3.exoplayer.q qVar2) {
        this.e = 4;
        this.z = qVar;
        this.A = qVar2;
        this.y = true;
    }

    public q0(boolean z, z zVar, w wVar) {
        this.e = 0;
        this.y = z;
        this.z = zVar;
        this.A = wVar;
    }

    public q0(b1 b1Var) {
        this.e = 1;
        this.A = b1Var;
        this.y = true;
    }
}
