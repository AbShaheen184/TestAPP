package androidx.compose.ui.autofill;

import android.graphics.Rect;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements kotlin.jvm.functions.r {
    public final /* synthetic */ d y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(4);
        this.y = dVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d dVar = this.y;
        dVar.e.f(dVar.z, this.z, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return y.a;
    }
}
