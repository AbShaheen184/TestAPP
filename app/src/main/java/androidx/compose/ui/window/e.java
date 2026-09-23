package androidx.compose.ui.window;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new e(i, 0);
        A = new e(i, 1);
        B = new e(i, 2);
        C = new e(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
