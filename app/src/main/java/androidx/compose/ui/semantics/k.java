package androidx.compose.ui.semantics;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final kotlin.jvm.functions.a a;
    public final kotlin.jvm.functions.a b;

    public k(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
