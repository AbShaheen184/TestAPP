package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h, Serializable {
    public kotlin.jvm.functions.a e;
    public volatile Object y;
    public final Object z;

    public o(kotlin.jvm.functions.a aVar) {
        aVar.getClass();
        this.e = aVar;
        this.y = v.a;
        this.z = this;
    }

    public final boolean a() {
        return this.y != v.a;
    }

    @Override // kotlin.h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.y;
        v vVar = v.a;
        if (obj != vVar) {
            return obj;
        }
        synchronized (this.z) {
            objInvoke = this.y;
            if (objInvoke == vVar) {
                kotlin.jvm.functions.a aVar = this.e;
                aVar.getClass();
                objInvoke = aVar.invoke();
                this.y = objInvoke;
                this.e = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
