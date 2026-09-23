package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa implements com.google.common.base.q {
    public final /* synthetic */ int e;
    public final Context y;

    public oa(Context context) {
        this.e = 3;
        new ConcurrentHashMap();
        ka.e(context != null, "Context cannot be null", new Object[0]);
        this.y = context.getApplicationContext();
    }

    @Override // com.google.common.base.q
    public Object get() {
        int i = this.e;
        Context context = this.y;
        switch (i) {
            case 0:
                Object obj = na.j;
                final com.caverock.androidsvg.x1 x1Var = new com.caverock.androidsvg.x1();
                x1Var.a = context;
                context.getClass();
                if (((com.google.common.base.q) x1Var.b) == null) {
                    x1Var.b = na.m;
                }
                final int i2 = 1;
                if (((com.google.common.base.q) x1Var.c) == null) {
                    x1Var.c = android.support.v4.media.session.b.w(new oa((Context) x1Var.a, i2));
                }
                if (((ma) x1Var.d) == null) {
                    x1Var.d = new com.google.common.base.q() { // from class: com.google.android.gms.internal.measurement.ma
                        @Override // com.google.common.base.q
                        public final Object get() {
                            int i3 = i2;
                            com.caverock.androidsvg.x1 x1Var2 = x1Var;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) x1Var2.a;
                                    Object obj2 = na.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new com.google.common.base.m(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return com.google.common.base.a.e;
                                    }
                                default:
                                    return new com.google.common.base.m(new bd((com.google.common.base.q) x1Var2.b));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((com.google.common.base.q) x1Var.e) == null) {
                    Context context2 = (Context) x1Var.a;
                    ArrayList arrayList = new ArrayList();
                    vd vdVar = new vd(new oa(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, vdVar, new yd());
                    x1Var.e = android.support.v4.media.session.b.w(new s5(arrayList, 11));
                }
                if (((ma) x1Var.f) == null) {
                    x1Var.f = new com.google.common.base.q() { // from class: com.google.android.gms.internal.measurement.ma
                        @Override // com.google.common.base.q
                        public final Object get() {
                            int i4 = i3;
                            com.caverock.androidsvg.x1 x1Var2 = x1Var;
                            switch (i4) {
                                case 0:
                                    Context context3 = (Context) x1Var2.a;
                                    Object obj2 = na.j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new com.google.common.base.m(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return com.google.common.base.a.e;
                                    }
                                default:
                                    return new com.google.common.base.m(new bd((com.google.common.base.q) x1Var2.b));
                            }
                        }
                    };
                }
                return new na((Context) x1Var.a, (com.google.common.base.q) x1Var.b, (com.google.common.base.q) x1Var.c, (ma) x1Var.d, (com.google.common.base.q) x1Var.e, (ma) x1Var.f);
            case 1:
                Object obj2 = na.j;
                return new eb(new z9(context, e1.a, com.google.android.gms.common.api.b.a, com.google.android.gms.common.api.e.c));
            default:
                Object obj3 = ra.a;
                return ka.c(context);
        }
    }

    public /* synthetic */ oa(Context context, int i) {
        this.e = i;
        this.y = context;
    }
}
