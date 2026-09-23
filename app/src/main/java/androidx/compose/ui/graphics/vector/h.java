package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final h A;
    public static final h z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new h(i, 0);
        A = new h(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                return new androidx.compose.ui.graphics.k(new PathMeasure());
            default:
                return kotlin.y.a;
        }
    }
}
