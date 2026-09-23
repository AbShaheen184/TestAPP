package androidx.lifecycle;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o A;
    public static final o B;
    public static final /* synthetic */ o[] C;
    public static final o e;
    public static final o y;
    public static final o z;

    static {
        o oVar = new o("DESTROYED", 0);
        e = oVar;
        o oVar2 = new o("INITIALIZED", 1);
        y = oVar2;
        o oVar3 = new o(DebugCoroutineInfoImplKt.CREATED, 2);
        z = oVar3;
        o oVar4 = new o("STARTED", 3);
        A = oVar4;
        o oVar5 = new o("RESUMED", 4);
        B = oVar5;
        C = new o[]{oVar, oVar2, oVar3, oVar4, oVar5};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) C.clone();
    }
}
