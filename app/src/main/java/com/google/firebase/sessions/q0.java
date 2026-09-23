package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final x0 a;
    public final b b;

    public q0(x0 x0Var, b bVar) {
        this.a = x0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a.equals(q0Var.a) && this.b.equals(q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
