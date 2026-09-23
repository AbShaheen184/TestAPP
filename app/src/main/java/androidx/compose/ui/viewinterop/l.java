package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.f0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new l(i, 0);
        A = new l(i, 1);
        B = new l(i, 2);
        C = new l(i, 3);
        D = new l(i, 4);
        E = new l(i, 5);
        F = new l(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.y) {
            case 0:
                j.e((f0) obj).setUpdateBlock((kotlin.jvm.functions.l) obj2);
                return y.a;
            case 1:
                j.e((f0) obj).setReleaseBlock((kotlin.jvm.functions.l) obj2);
                return y.a;
            case 2:
                j.e((f0) obj).setModifier((androidx.compose.ui.r) obj2);
                return y.a;
            case 3:
                j.e((f0) obj).setDensity((androidx.compose.ui.unit.c) obj2);
                return y.a;
            case 4:
                j.e((f0) obj).setLifecycleOwner((androidx.lifecycle.v) obj2);
                return y.a;
            case 5:
                j.e((f0) obj).setSavedStateRegistryOwner((androidx.savedstate.g) obj2);
                return y.a;
            default:
                w wVarE = j.e((f0) obj);
                int iOrdinal = ((androidx.compose.ui.unit.m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        coil3.g.a();
                        return null;
                    }
                } else {
                    i = 0;
                }
                wVarE.setLayoutDirection(i);
                return y.a;
        }
    }
}
