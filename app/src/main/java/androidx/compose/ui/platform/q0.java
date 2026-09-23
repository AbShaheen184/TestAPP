package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.pf;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    s0 s0Var = new s0(choreographer, coil3.svg.internal.a.e(looperMyLooper));
                    return s0Var.plus(s0Var.G);
                }
                kotlinx.coroutines.future.a.u("no Looper on this thread");
                return null;
            case 1:
                return 0L;
            case 2:
                com.google.android.gms.internal.measurement.f0 f0Var = new com.google.android.gms.internal.measurement.f0();
                f0Var.e = 0;
                return f0Var;
            case 3:
                ka.f(Thread.currentThread());
                pf pfVar = new pf();
                pfVar.a = false;
                pfVar.b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = bf.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, pfVar);
                    break;
                }
                return pfVar;
            case 4:
                return new Random();
            case 5:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(okhttp3.internal.g.a);
                return simpleDateFormat;
        }
    }
}
