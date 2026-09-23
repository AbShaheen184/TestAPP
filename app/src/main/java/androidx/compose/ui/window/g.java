package androidx.compose.ui.window;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ kotlin.jvm.functions.p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, int i) {
        super(2);
        this.y = rVar;
        this.z = pVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = androidx.compose.runtime.t.A(this.A | 1);
        t1.d(this.y, this.z, (androidx.compose.runtime.s) obj, iA);
        return kotlin.y.a;
    }
}
