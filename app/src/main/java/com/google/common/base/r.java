package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements q, Serializable {
    public transient Object A;
    public final transient Object e = new Object();
    public final q y;
    public volatile transient boolean z;

    public r(q qVar) {
        qVar.getClass();
        this.y = qVar;
    }

    @Override // com.google.common.base.q
    public final Object get() {
        if (!this.z) {
            synchronized (this.e) {
                try {
                    if (!this.z) {
                        Object obj = this.y.get();
                        this.A = obj;
                        this.z = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.A;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.z) {
            obj = "<supplier that returned " + this.A + ">";
        } else {
            obj = this.y;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
