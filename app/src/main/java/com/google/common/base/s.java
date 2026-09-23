package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {
    public static final androidx.transition.k A = new androidx.transition.k(29);
    public final Object e = new Object();
    public volatile q y;
    public Object z;

    public s(q qVar) {
        qVar.getClass();
        this.y = qVar;
    }

    @Override // com.google.common.base.q
    public final Object get() {
        q qVar = this.y;
        androidx.transition.k kVar = A;
        if (qVar != kVar) {
            synchronized (this.e) {
                try {
                    if (this.y != kVar) {
                        Object obj = this.y.get();
                        this.z = obj;
                        this.y = kVar;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.z;
    }

    public final String toString() {
        Object obj = this.y;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == A) {
            obj = "<supplier that returned " + this.z + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
