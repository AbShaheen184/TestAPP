package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public final androidx.compose.foundation.shape.d a;
    public final androidx.compose.foundation.shape.d b;
    public final androidx.compose.foundation.shape.d c;
    public final androidx.compose.foundation.shape.d d;
    public final androidx.compose.foundation.shape.d e;
    public final androidx.compose.foundation.shape.d f;
    public final androidx.compose.foundation.shape.d g;
    public final androidx.compose.foundation.shape.d h;

    public c5() {
        androidx.compose.foundation.shape.d dVar = b5.a;
        androidx.compose.foundation.shape.d dVar2 = b5.b;
        androidx.compose.foundation.shape.d dVar3 = b5.c;
        androidx.compose.foundation.shape.d dVar4 = b5.d;
        androidx.compose.foundation.shape.d dVar5 = b5.f;
        androidx.compose.foundation.shape.d dVar6 = b5.e;
        androidx.compose.foundation.shape.d dVar7 = b5.g;
        androidx.compose.foundation.shape.d dVar8 = b5.h;
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
        this.g = dVar7;
        this.h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return kotlin.jvm.internal.l.a(this.a, c5Var.a) && kotlin.jvm.internal.l.a(this.b, c5Var.b) && kotlin.jvm.internal.l.a(this.c, c5Var.c) && kotlin.jvm.internal.l.a(this.d, c5Var.d) && kotlin.jvm.internal.l.a(this.e, c5Var.e) && kotlin.jvm.internal.l.a(this.f, c5Var.f) && kotlin.jvm.internal.l.a(this.g, c5Var.g) && kotlin.jvm.internal.l.a(this.h, c5Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
