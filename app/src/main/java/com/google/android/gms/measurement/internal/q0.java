package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final f1 a;

    public q0(f1 f1Var) {
        this.a = f1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.x.g(atomicReference);
        com.google.android.gms.common.internal.x.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, d2.f, d2.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, d2.i, d2.h, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.a()) {
            return str.startsWith("_exp_") ? androidx.privacysandbox.ads.adservices.java.internal.a.r("experiment_id(", str, ")") : g(str, d2.m, d2.l, d);
        }
        return str;
    }

    public final String d(u uVar) {
        String string;
        f1 f1Var = this.a;
        if (!f1Var.a()) {
            return uVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(uVar.z);
        sb.append(",name=");
        sb.append(a(uVar.e));
        sb.append(",params=");
        t tVar = uVar.y;
        if (tVar == null) {
            string = null;
        } else {
            string = !f1Var.a() ? tVar.e.toString() : e(tVar.h());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sbP = androidx.compose.runtime.j.p("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbP.length() != 8) {
                sbP.append(", ");
            }
            sbP.append(b(str));
            sbP.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbP.append(strF);
        }
        sbP.append("}]");
        return sbP.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbP = androidx.compose.runtime.j.p("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbP.length() != 1) {
                    sbP.append(", ");
                }
                sbP.append(strE);
            }
        }
        sbP.append("]");
        return sbP.toString();
    }
}
