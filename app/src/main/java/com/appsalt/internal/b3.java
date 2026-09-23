package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements k3 {
    public final com.google.protobuf.t0 a;
    public final com.google.protobuf.t0 b;

    public b3(com.google.protobuf.t0 t0Var, com.google.protobuf.t0 t0Var2) {
        this.a = t0Var;
        this.b = t0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return kotlin.jvm.internal.l.a(this.a, b3Var.a) && kotlin.jvm.internal.l.a(this.b, b3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reconnect(alphaServers=" + this.a + ", betaServers=" + this.b + ')';
    }
}
