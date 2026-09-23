package androidx.work.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.compose.material3.internal.r0;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        switch (this.a) {
            case 0:
                androidx.work.i0 i0Var = androidx.work.i0.e;
                d0 d0Var = (d0) this.b;
                h0 h0Var = (h0) this.c;
                String str3 = h0Var.m;
                String str4 = h0Var.c;
                androidx.work.impl.model.t tVar = h0Var.j;
                androidx.work.impl.model.p pVar = h0Var.a;
                boolean z = true;
                boolean z2 = false;
                if (d0Var instanceof b0) {
                    androidx.work.w wVar = ((b0) d0Var).a;
                    androidx.work.i0 i0VarB = tVar.b(str4);
                    androidx.work.impl.model.n nVarV = h0Var.i.v();
                    nVarV.getClass();
                    okhttp3.internal.platform.android.g.t(nVarV.a, false, true, new androidx.compose.material3.r(str4, 11));
                    if (i0VarB == null) {
                        z = false;
                    } else if (i0VarB == androidx.work.i0.y) {
                        if (wVar instanceof androidx.work.v) {
                            String str5 = i0.a;
                            androidx.work.y.e().f(str5, "Worker result SUCCESS for " + str3);
                            if (pVar.c()) {
                                h0Var.c();
                            } else {
                                tVar.h(androidx.work.i0.z, str4);
                                androidx.work.i iVar = ((androidx.work.v) wVar).a;
                                iVar.getClass();
                                okhttp3.internal.platform.android.g.t(tVar.a, false, true, new r0(16, iVar, str4));
                                h0Var.g.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                androidx.work.impl.model.c cVar = h0Var.k;
                                for (String str6 : cVar.a(str4)) {
                                    if (tVar.b(str6) == androidx.work.i0.B && ((Boolean) okhttp3.internal.platform.android.g.t(cVar.a, true, false, new androidx.compose.material3.r(str6, 7))).booleanValue()) {
                                        androidx.work.y.e().f(i0.a, "Setting status to enqueued for ".concat(str6));
                                        tVar.h(i0Var, str6);
                                        tVar.g(str6, jCurrentTimeMillis);
                                    }
                                }
                            }
                        } else if (wVar instanceof androidx.work.u) {
                            String str7 = i0.a;
                            androidx.work.y.e().f(str7, "Worker result RETRY for " + str3);
                            h0Var.b(-256);
                        } else {
                            String str8 = i0.a;
                            androidx.work.y.e().f(str8, "Worker result FAILURE for " + str3);
                            if (pVar.c()) {
                                h0Var.c();
                            } else {
                                h0Var.d(wVar);
                            }
                        }
                        z = false;
                    } else if (i0VarB.a()) {
                        z = false;
                    } else {
                        h0Var.b(-512);
                    }
                    z2 = z;
                } else if (d0Var instanceof a0) {
                    androidx.work.w wVar2 = ((a0) d0Var).a;
                    String str9 = i0.a;
                    androidx.work.y.e().f(str9, "Worker result FAILURE for " + str3);
                    if (pVar.c()) {
                        h0Var.c();
                    } else {
                        h0Var.d(wVar2);
                    }
                } else {
                    if (!(d0Var instanceof c0)) {
                        coil3.g.a();
                        return null;
                    }
                    int i2 = ((c0) d0Var).a;
                    if (kotlin.jvm.internal.l.a(pVar.y, Boolean.TRUE)) {
                        String str10 = i0.a;
                        androidx.work.y.e().a(str10, "Worker " + pVar.c + " was interrupted. Backing off.");
                        h0Var.b(i2);
                    } else {
                        androidx.work.i0 i0VarB2 = tVar.b(str4);
                        if (i0VarB2 == null || i0VarB2.a()) {
                            String str11 = i0.a;
                            androidx.work.y.e().a(str11, "Status for " + str4 + " is " + i0VarB2 + " ; not doing any work");
                            z = false;
                        } else {
                            String str12 = i0.a;
                            androidx.work.y.e().a(str12, "Status for " + str4 + " is " + i0VarB2 + "; not doing any work and rescheduling for later execution");
                            tVar.h(i0Var, str4);
                            tVar.i(i2, str4);
                            tVar.e(str4, -1L);
                        }
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            default:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                com.google.firebase.messaging.n nVarX = com.google.firebase.messaging.n.x();
                nVarX.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) nVarX.B).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (nVarX) {
                    try {
                        str = (String) nVarX.y;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    nVarX.y = context.getPackageName() + serviceInfo.name;
                                } else {
                                    nVarX.y = serviceInfo.name;
                                }
                                str = (String) nVarX.y;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (nVarX.C(context)) {
                        componentNameStartService = com.google.firebase.messaging.u.i(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
        }
    }
}
