package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final String a;
    public final kotlin.jvm.functions.p b;
    public final boolean c;

    public z(String str, kotlin.jvm.functions.p pVar) {
        this.a = str;
        this.b = pVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ z(String str) {
        this(str, l.S);
    }

    public z(String str, int i) {
        this(str);
        this.c = true;
    }

    public z(String str, boolean z, kotlin.jvm.functions.p pVar) {
        this(str, pVar);
        this.c = z;
    }
}
