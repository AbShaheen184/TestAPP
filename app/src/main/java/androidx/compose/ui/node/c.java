package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.compose.ui.focus.r {
    public static final c a = new c();
    public static Boolean b;

    @Override // androidx.compose.ui.focus.r
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw androidx.compose.runtime.j.a("canFocus is read before it is written");
    }

    @Override // androidx.compose.ui.focus.r
    public final void d(boolean z) {
        b = Boolean.valueOf(z);
    }
}
