package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class wd extends c4 {
    public final boolean A;
    public final /* synthetic */ y9 B;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(y9 y9Var, boolean z, boolean z2) {
        super("log");
        this.B = y9Var;
        this.z = z;
        this.A = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        int i;
        int i2;
        String strE;
        ArrayList arrayList;
        ea.f("log", 1, list);
        int size = list.size();
        h5 h5Var = d5.m;
        y9 y9Var = this.B;
        if (size == 1) {
            ((androidx.media3.exoplayer.hls.c) y9Var.A).J(3, ((j5) b7Var.z).f(b7Var, (d5) list.get(0)).e(), Collections.EMPTY_LIST, this.z, this.A);
            return h5Var;
        }
        d5 d5Var = (d5) list.get(0);
        j5 j5Var = (j5) b7Var.z;
        j5 j5Var2 = (j5) b7Var.z;
        int iP = ea.p(j5Var.f(b7Var, d5Var).h().doubleValue());
        if (iP != 2) {
            i = 3;
            if (iP == 3) {
                i2 = 1;
            } else if (iP == 5) {
                i2 = 5;
            } else if (iP == 6) {
                i2 = 2;
            }
            strE = j5Var2.f(b7Var, (d5) list.get(1)).e();
            if (list.size() == 2) {
                ((androidx.media3.exoplayer.hls.c) y9Var.A).J(i2, strE, Collections.EMPTY_LIST, this.z, this.A);
                return h5Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(j5Var2.f(b7Var, (d5) list.get(i3)).e());
            }
            ((androidx.media3.exoplayer.hls.c) y9Var.A).J(i2, strE, arrayList, this.z, this.A);
            return h5Var;
        }
        i = 4;
        i2 = i;
        strE = j5Var2.f(b7Var, (d5) list.get(1)).e();
        if (list.size() == 2) {
            ((androidx.media3.exoplayer.hls.c) y9Var.A).J(i2, strE, Collections.EMPTY_LIST, this.z, this.A);
            return h5Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(j5Var2.f(b7Var, (d5) list.get(i3)).e());
        }
        ((androidx.media3.exoplayer.hls.c) y9Var.A).J(i2, strE, arrayList, this.z, this.A);
        return h5Var;
    }
}
