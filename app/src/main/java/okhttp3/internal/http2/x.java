package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okio.f0;
import okio.g0;
import okio.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g0 {
    public long A;
    public long B;
    public final ArrayDeque C;
    public boolean D;
    public final v E;
    public final u F;
    public final w G;
    public final w H;
    public b I;
    public IOException J;
    public final int e;
    public final p y;
    public final okhttp3.internal.http2.flowcontrol.a z;

    public x(int i, p pVar, boolean z, boolean z2, okhttp3.r rVar) {
        pVar.getClass();
        this.e = i;
        this.y = pVar;
        this.z = new okhttp3.internal.http2.flowcontrol.a(i);
        this.B = pVar.P.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.C = arrayDeque;
        this.E = new v(this, pVar.O.a(), z2);
        this.F = new u(this, z);
        this.G = new w(this);
        this.H = new w(this);
        if (rVar == null) {
            if (i()) {
                return;
            }
            kotlinx.coroutines.future.a.u("remotely-initiated streams should have headers");
            throw null;
        }
        if (i()) {
            kotlinx.coroutines.future.a.u("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zJ;
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            try {
                v vVar = this.E;
                if (vVar.y || !vVar.B) {
                    z = false;
                } else {
                    u uVar = this.F;
                    if (uVar.e || uVar.z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zJ = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(b.CANCEL, null);
        } else {
            if (zJ) {
                return;
            }
            this.y.n(this.e);
        }
    }

    public final void b() throws IOException {
        u uVar = this.F;
        if (uVar.z) {
            kotlinx.coroutines.future.a.w("stream closed");
            return;
        }
        if (uVar.e) {
            kotlinx.coroutines.future.a.w("stream finished");
            return;
        }
        if (h() != null) {
            IOException iOException = this.J;
            if (iOException != null) {
                throw iOException;
            }
            b bVarH = h();
            bVarH.getClass();
            throw new c0(bVarH);
        }
    }

    @Override // okio.g0
    public final h0 c() {
        return this.E;
    }

    @Override // okio.g0
    public final void cancel() {
        g(b.CANCEL);
    }

    @Override // okio.g0
    public final f0 d() {
        return this.F;
    }

    public final void e(b bVar, IOException iOException) {
        if (f(bVar, iOException)) {
            p pVar = this.y;
            pVar.getClass();
            pVar.U.N(this.e, bVar);
        }
    }

    public final boolean f(b bVar, IOException iOException) {
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.I = bVar;
            this.J = iOException;
            notifyAll();
            if (this.E.y && this.F.e) {
                return false;
            }
            this.y.n(this.e);
            return true;
        }
    }

    public final void g(b bVar) {
        if (f(bVar, null)) {
            this.y.N(this.e, bVar);
        }
    }

    public final b h() {
        b bVar;
        synchronized (this) {
            bVar = this.I;
        }
        return bVar;
    }

    public final boolean i() {
        boolean z = (this.e & 1) == 1;
        this.y.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                v vVar = this.E;
                if (vVar.y || vVar.B) {
                    u uVar = this.F;
                    if ((uVar.e || uVar.z) && this.D) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(okhttp3.r rVar, boolean z) {
        boolean zJ;
        rVar.getClass();
        TimeZone timeZone = okhttp3.internal.g.a;
        synchronized (this) {
            try {
                if (this.D && rVar.b(":status") == null && rVar.b(":method") == null) {
                    this.E.getClass();
                } else {
                    this.D = true;
                    this.C.add(rVar);
                }
                if (z) {
                    this.E.y = true;
                }
                zJ = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.y.n(this.e);
    }
}
