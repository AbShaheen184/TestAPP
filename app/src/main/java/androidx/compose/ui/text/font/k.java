package androidx.compose.ui.text.font;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k y;
    public static final k z;
    public final int e;

    static {
        k kVar = new k(100);
        k kVar2 = new k(Context.VERSION_ES6);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        y = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        z = kVar4;
        A = kVar5;
        B = kVar6;
        C = kVar7;
        kotlin.collections.q.k(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i) {
        this.e = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        androidx.compose.ui.text.internal.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e, ((k) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.e == ((k) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("FontWeight(weight="), this.e, ')');
    }
}
