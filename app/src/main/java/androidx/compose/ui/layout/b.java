package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements kotlin.jvm.functions.p {
    public static final b e = new b(2, kotlin.math.a.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
