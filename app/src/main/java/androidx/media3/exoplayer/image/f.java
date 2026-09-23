package androidx.media3.exoplayer.image;

import com.google.android.gms.measurement.internal.b0;
import com.google.firebase.installations.j;
import java.net.URL;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public Object d;

    public f() {
        this.a = 3;
        if (b0.T == null) {
            Pattern pattern = j.b;
            b0.T = new b0(24);
        }
        b0 b0Var = b0.T;
        if (j.c == null) {
            j.c = new j(b0Var);
        }
        this.d = j.c;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public synchronized boolean a() {
        boolean z;
        if (this.b != 0) {
            ((j) this.d).a.getClass();
            if (System.currentTimeMillis() > this.c) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.b = 0;
            }
            return;
        }
        this.b++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.b);
                ((j) this.d).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000L);
            } else {
                jMin = 86400000;
            }
            ((j) this.d).a.getClass();
            this.c = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }

    public int c() {
        return Integer.max(0, ((int) ((((Date) this.d).getTime() + ((long) (this.b * 1000))) - new Date().getTime())) / 1000);
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("Ticket, creation date = ");
                sb.append((Date) this.d);
                sb.append(", ticket lifetime = ");
                sb.append(this.b);
                if (c() > 0) {
                    str = " (still valid for " + c() + " seconds)";
                } else {
                    str = " (not valid anymore)";
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    public f(int i, URL url, long j) {
        this.a = 2;
        this.b = i;
        this.d = url;
        this.c = j;
    }

    public f(int i, long j) {
        this.a = 0;
        this.b = i;
        this.c = j;
    }
}
