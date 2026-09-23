package androidx.compose.material3;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends androidx.activity.u {
    public final CoroutineScope d;
    public final androidx.compose.animation.core.d e;
    public final androidx.activity.w f;

    public t2(boolean z, CoroutineScope coroutineScope, androidx.compose.animation.core.d dVar, androidx.activity.w wVar) {
        super(z);
        this.d = coroutineScope;
        this.e = dVar;
        this.f = wVar;
    }

    @Override // androidx.activity.u
    public final void a() {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new androidx.compose.animation.core.c1(this, null, 11), 3, null);
    }

    @Override // androidx.activity.u
    public final void b() {
        this.f.invoke();
    }

    @Override // androidx.activity.u
    public final void c(androidx.activity.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new s2(this, aVar, null, 0), 3, null);
    }

    @Override // androidx.activity.u
    public final void d(androidx.activity.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new s2(this, aVar, null, 1), 3, null);
    }
}
