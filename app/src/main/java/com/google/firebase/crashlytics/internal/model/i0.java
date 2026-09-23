package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public u1 g;
    public l2 h;
    public k2 i;
    public v1 j;
    public List k;
    public int l;
    public byte m;

    public final j0 a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (u1Var = this.g) != null) {
            return new j0(str, str2, this.c, this.d, this.e, this.f, u1Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        kotlinx.coroutines.future.a.u(com.google.android.datatransport.runtime.a.r("Missing required properties:", sb));
        return null;
    }
}
