package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.measurement.internal.i0;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.u0;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Parcelable z;

    public i(m3 m3Var, r4 r4Var, boolean z, com.google.android.gms.measurement.internal.e eVar) {
        this.e = 3;
        this.z = r4Var;
        this.y = z;
        this.A = eVar;
        Objects.requireNonNull(m3Var);
        this.B = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.e) {
            case 0:
                Intent intent = (Intent) this.z;
                Context context = (Context) this.A;
                boolean z = this.y;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.B;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.a("pscm-ack-executor", 0));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new androidx.core.provider.m(2, context, aVar, countDownLatch));
                            try {
                                iIntValue = ((Integer) org.jsoup.helper.n.f(new com.google.firebase.messaging.f(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                m3 m3Var = (m3) this.B;
                i0 i0Var = m3Var.A;
                if (i0Var != null) {
                    m3Var.N(i0Var, this.y ? null : (m4) this.A, (r4) this.z);
                    m3Var.I();
                    return;
                } else {
                    u0 u0Var = ((p1) m3Var.e).C;
                    p1.m(u0Var);
                    u0Var.C.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                m3 m3Var2 = (m3) this.B;
                i0 i0Var2 = m3Var2.A;
                if (i0Var2 != null) {
                    m3Var2.N(i0Var2, this.y ? null : (u) this.A, (r4) this.z);
                    m3Var2.I();
                    return;
                } else {
                    u0 u0Var2 = ((p1) m3Var2.e).C;
                    p1.m(u0Var2);
                    u0Var2.C.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                m3 m3Var3 = (m3) this.B;
                i0 i0Var3 = m3Var3.A;
                if (i0Var3 != null) {
                    m3Var3.N(i0Var3, this.y ? null : (com.google.android.gms.measurement.internal.e) this.A, (r4) this.z);
                    m3Var3.I();
                    return;
                } else {
                    u0 u0Var3 = ((p1) m3Var3.e).C;
                    p1.m(u0Var3);
                    u0Var3.C.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ i(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.e = 0;
        this.z = intent;
        this.A = context;
        this.y = z;
        this.B = pendingResult;
    }

    public /* synthetic */ i(m3 m3Var, r4 r4Var, boolean z, com.google.android.gms.common.internal.safeparcel.a aVar, int i) {
        this.e = i;
        this.z = r4Var;
        this.y = z;
        this.A = aVar;
        this.B = m3Var;
    }
}
