package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {
    public static final dc a;
    public static volatile String b;
    public static final s5 c;

    static {
        c3 c3Var = c3.y;
        int i = com.google.common.collect.k0.z;
        hc hcVar = new hc(c3Var, true, com.google.common.collect.h1.G);
        com.appsalt.internal.r0 r0Var = new com.appsalt.internal.r0();
        r0Var.e = hcVar;
        c = new s5(r0Var, 12);
        a = new dc("__phenotype_server_token", r0Var, "");
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
