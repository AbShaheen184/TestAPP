package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.j6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final j6 d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public f2(Context context, j6 j6Var, Long l, Long l2) {
        this.e = true;
        com.google.android.gms.common.internal.x.g(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.x.g(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (j6Var != null) {
            this.d = j6Var;
            this.e = j6Var.z;
            this.c = j6Var.y;
            this.h = j6Var.B;
            Bundle bundle = j6Var.A;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
