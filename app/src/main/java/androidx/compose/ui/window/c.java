package androidx.compose.ui.window;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.functions.a aVar, w wVar, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        super(2);
        this.y = aVar;
        this.z = wVar;
        this.A = fVar;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t1.a(this.y, this.z, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1), this.C);
        return kotlin.y.a;
    }
}
