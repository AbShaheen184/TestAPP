package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.TreeSet;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ s2 z;

    public /* synthetic */ m2(s2 s2Var, Bundle bundle, int i) {
        this.e = i;
        this.y = bundle;
        this.z = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                s2 s2Var = this.z;
                s2Var.v();
                s2Var.w();
                Bundle bundle = this.y;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                com.google.android.gms.common.internal.x.d(string);
                com.google.android.gms.common.internal.x.d(string2);
                com.google.android.gms.common.internal.x.g(bundle.get(ES6Iterator.VALUE_PROPERTY));
                p1 p1Var = (p1) s2Var.e;
                if (!p1Var.d()) {
                    u0 u0Var = p1Var.C;
                    p1.m(u0Var);
                    u0Var.K.a("Conditional property not set since app measurement is disabled");
                } else {
                    m4 m4Var = new m4(bundle.getLong("triggered_timestamp"), bundle.get(ES6Iterator.VALUE_PROPERTY), string, string2);
                    try {
                        p4 p4Var = p1Var.F;
                        p1.k(p4Var);
                        bundle.getString("app_id");
                        u uVarD0 = p4Var.d0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        p1.k(p4Var);
                        bundle.getString("app_id");
                        u uVarD1 = p4Var.d0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        p1Var.p().O(new e(bundle.getString("app_id"), string2, m4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), uVarD1, bundle.getLong("trigger_timeout"), uVarD0, bundle.getLong("time_to_live"), p4Var.d0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                s2 s2Var2 = this.z;
                s2Var2.v();
                s2Var2.w();
                Bundle bundle2 = this.y;
                String string3 = bundle2.getString("name");
                com.google.android.gms.common.internal.x.d(string3);
                p1 p1Var2 = (p1) s2Var2.e;
                if (!p1Var2.d()) {
                    u0 u0Var2 = p1Var2.C;
                    p1.m(u0Var2);
                    u0Var2.K.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    m4 m4Var2 = new m4(0L, null, string3, "");
                    try {
                        p4 p4Var2 = p1Var2.F;
                        p1.k(p4Var2);
                        bundle2.getString("app_id");
                        p1Var2.p().O(new e(bundle2.getString("app_id"), "", m4Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), p4Var2.d0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                s2 s2Var3 = this.z;
                androidx.media3.exoplayer.dash.manifest.t tVar = s2Var3.S;
                p1 p1Var3 = (p1) s2Var3.e;
                Bundle bundle3 = this.y;
                if (!bundle3.isEmpty()) {
                    d1 d1Var = p1Var3.B;
                    p4 p4Var3 = p1Var3.F;
                    g gVar = p1Var3.A;
                    u0 u0Var3 = p1Var3.C;
                    p1.k(d1Var);
                    Bundle bundle4 = new Bundle(d1Var.V.J());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            p1.k(p4Var3);
                            if (p4.I0(obj)) {
                                p4.N(tVar, null, 27, null, null, 0);
                            }
                            p1.m(u0Var3);
                            u0Var3.H.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (p4.a0(str)) {
                            p1.m(u0Var3);
                            u0Var3.H.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            p1.k(p4Var3);
                            gVar.getClass();
                            if (p4Var3.z("param", str, 500, obj)) {
                                p4Var3.M(bundle4, str, obj);
                            }
                        }
                    }
                    p1.k(p4Var3);
                    p4 p4Var4 = ((p1) gVar.e).F;
                    p1.k(p4Var4);
                    int i = p4Var4.g0(201500000) ? 100 : 25;
                    if (bundle4.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle4.remove(str2);
                            }
                        }
                        p1.k(p4Var3);
                        p4.N(tVar, null, 26, null, null, 0);
                        p1.m(u0Var3);
                        u0Var3.H.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                d1 d1Var2 = p1Var3.B;
                p1.k(d1Var2);
                d1Var2.V.K(bundle3);
                p1Var3.p().A(bundle3);
                break;
        }
    }
}
