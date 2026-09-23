package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.HandlerThread;
import android.util.Log;
import androidx.compose.ui.graphics.a0;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.db;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.rf;
import com.google.android.gms.internal.measurement.xc;
import com.google.android.gms.tasks.s;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.d0;
import com.google.common.util.concurrent.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements androidx.media3.datasource.g, y {
    public static n B;
    public Object A;
    public int e;
    public Object y;
    public Object z;

    public n(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.y = str;
        this.e = i2;
        this.z = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.A = bArr;
    }

    public static synchronized n p(Context context) {
        try {
            if (B == null) {
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.a("MessengerIpcClient", 0)));
                n nVar = new n();
                nVar.A = new l(nVar);
                nVar.e = 1;
                nVar.z = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                nVar.y = context.getApplicationContext();
                B = nVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return B;
    }

    public int a() {
        int i = this.e;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // androidx.media3.datasource.g
    public androidx.media3.datasource.h b() {
        androidx.localbroadcastmanager.content.b bVar = (androidx.localbroadcastmanager.content.b) this.A;
        androidx.media3.datasource.h hVarB = bVar != null ? bVar.b() : null;
        int i = this.e;
        androidx.media3.datasource.cache.n nVar = (androidx.media3.datasource.cache.n) this.y;
        nVar.getClass();
        return new androidx.media3.datasource.cache.d(nVar, hVarB, ((androidx.media3.datasource.n) this.z).b(), hVarB != null ? new androidx.media3.datasource.cache.c(nVar) : null, i);
    }

    public int c() {
        Paint.Cap strokeCap = ((Paint) this.y).getStrokeCap();
        int i = strokeCap == null ? -1 : androidx.compose.ui.graphics.i.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        xc xcVar = (xc) this.y;
        m0 m0Var = (m0) this.z;
        int i = this.e;
        ArrayList arrayList = (ArrayList) this.A;
        ListenableFuture listenableFutureD = com.google.common.util.concurrent.m0.d(m0Var);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) com.google.common.util.concurrent.m0.b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) xcVar.b).get(i2) != null) {
                    androidx.transition.k.h();
                    return null;
                }
                db dbVar = new db(1);
                int i3 = rf.a;
                listenableFutureD = com.google.common.util.concurrent.m0.g(listenableFutureD, new xc(4, bf.a(), dbVar), d0.e);
            }
        }
        return listenableFutureD;
    }

    public int d() {
        Paint.Join strokeJoin = ((Paint) this.y).getStrokeJoin();
        int i = strokeJoin == null ? -1 : androidx.compose.ui.graphics.i.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.y) {
            try {
                _COROUTINE.a.A(this.e > 0);
                int i = this.e - 1;
                this.e = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.A) != null) {
                    handlerThread.quit();
                    this.A = null;
                    this.z = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(float f) {
        ((Paint) this.y).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void g(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        Paint paint = (Paint) this.y;
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.graphics.b.c(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.b.e(i)));
        }
    }

    public void h(long j) {
        ((Paint) this.y).setColor(a0.y(j));
    }

    public void i(androidx.compose.ui.graphics.m mVar) {
        this.A = mVar;
        ((Paint) this.y).setColorFilter(mVar != null ? mVar.a : null);
    }

    public void j(int i) {
        ((Paint) this.y).setFilterBitmap(!(i == 0));
    }

    public void k(Shader shader) {
        this.z = shader;
        ((Paint) this.y).setShader(shader);
    }

    public void l(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.y;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void m(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.y;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void n(float f) {
        ((Paint) this.y).setStrokeWidth(f);
    }

    public void o(int i) {
        ((Paint) this.y).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized s q(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((l) this.A).d(mVar)) {
                l lVar = new l(this);
                this.A = lVar;
                lVar.d(mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVar.b.a;
    }

    public n(Paint paint) {
        this.y = paint;
        this.e = 3;
    }
}
