package kotlin;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h, Serializable {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public z(int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = new ArrayList();
                this.z = new ArrayList();
                break;
        }
    }

    @Override // kotlin.h
    public Object getValue() {
        if (this.z == v.a) {
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.y;
            aVar.getClass();
            this.z = aVar.invoke();
            this.y = null;
        }
        return this.z;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return this.z != v.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
            default:
                return super.toString();
        }
    }
}
