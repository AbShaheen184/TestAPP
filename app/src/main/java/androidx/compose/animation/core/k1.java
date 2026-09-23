package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements b0 {
    public final float a;
    public final float b;
    public final Object c;

    public k1(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // androidx.compose.animation.core.m
    public final m2 a(l2 l2Var) {
        Object eVar;
        Object obj = this.c;
        s sVar = obj == null ? null : (s) l2Var.a.invoke(obj);
        int[] iArr = n2.a;
        float f = this.a;
        float f2 = this.b;
        if (sVar != null) {
            eVar = new com.app.mlounge.data.music.e(sVar, f, f2);
        } else {
            com.google.firebase.platforminfo.d dVar = new com.google.firebase.platforminfo.d();
            dVar.e = new d0(f, f2, 0.01f);
            eVar = dVar;
        }
        com.google.firebase.platforminfo.d dVar2 = new com.google.firebase.platforminfo.d();
        dVar2.e = new com.google.firebase.messaging.n(eVar, 1);
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (k1Var.a == this.a && k1Var.b == this.b && kotlin.jvm.internal.l.a(k1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + androidx.privacysandbox.ads.adservices.java.internal.a.c(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ k1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
