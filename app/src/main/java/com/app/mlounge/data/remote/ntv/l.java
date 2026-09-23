package com.app.mlounge.data.remote.ntv;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.w0;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final /* synthetic */ int e = 0;
    public int y;
    public final Object z;

    public /* synthetic */ l(String str, w0 w0Var, int i, IOException iOException, byte[] bArr, Map map) {
        x.g(w0Var);
        this.z = w0Var;
        this.y = i;
        this.A = iOException;
        this.B = bArr;
        this.C = str;
        this.D = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.e) {
            case 0:
                v vVar = (v) this.z;
                if (vVar.e || (i = this.y) > 20) {
                    return;
                }
                this.y = i + 1;
                WebView webView = (WebView) this.B;
                webView.evaluateJavascript("(function() {   var s = document.getElementById('source');   return s ? s.src : null; })();", new k(vVar, (CancellableContinuationImpl) this.C, (Handler) this.D, this, (v) this.A, webView));
                return;
            case 1:
                u0 u0Var = (u0) this.D;
                d1 d1Var = ((p1) u0Var.e).B;
                p1.k(d1Var);
                if (!d1Var.y) {
                    Log.println(6, u0Var.F(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (u0Var.z == 0) {
                    com.google.android.gms.measurement.internal.g gVar = ((p1) u0Var.e).A;
                    if (gVar.B == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.B == null) {
                                    p1 p1Var = (p1) gVar.e;
                                    ApplicationInfo applicationInfo = p1Var.e.getApplicationInfo();
                                    String strA = com.google.android.gms.common.util.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.B = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.B == null) {
                                        gVar.B = Boolean.TRUE;
                                        u0 u0Var2 = p1Var.C;
                                        p1.m(u0Var2);
                                        u0Var2.C.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (gVar.B.booleanValue()) {
                        u0Var.z = 'C';
                    } else {
                        u0Var.z = 'c';
                    }
                    break;
                }
                if (u0Var.A < 0) {
                    ((p1) u0Var.e).A.B();
                    u0Var.A = 161000L;
                }
                int i2 = this.y;
                char c = u0Var.z;
                long j = u0Var.A;
                String str2 = (String) this.z;
                Object obj = this.A;
                Object obj2 = this.B;
                Object obj3 = this.C;
                char cCharAt = "01VDIWEA?".charAt(i2);
                String strG = u0.G(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strG.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strG);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                }
                c1 c1Var = d1Var.B;
                if (c1Var != null) {
                    String str3 = (String) c1Var.A;
                    d1 d1Var2 = (d1) c1Var.B;
                    d1Var2.v();
                    if (((d1) c1Var.B).z().getLong((String) c1Var.y, 0L) == 0) {
                        c1Var.f();
                    }
                    SharedPreferences sharedPreferencesZ = d1Var2.z();
                    String str4 = (String) c1Var.z;
                    long j2 = sharedPreferencesZ.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = d1Var2.z().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    p4 p4Var = ((p1) d1Var2.e).F;
                    p1.k(p4Var);
                    long jNextLong = p4Var.v0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = d1Var2.z().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((w0) this.z).g((String) this.C, this.y, (Throwable) this.A, (byte[]) this.B, (Map) this.D);
                return;
        }
    }

    public l(u0 u0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.y = i;
        this.z = str;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = u0Var;
    }

    public l(Handler handler, WebView webView, v vVar, v vVar2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.z = vVar;
        this.B = webView;
        this.C = cancellableContinuationImpl;
        this.D = handler;
        this.A = vVar2;
    }
}
