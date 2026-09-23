package androidx.compose.foundation.contextmenu;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ k(boolean z, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.y = z;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                if (this.y) {
                    this.z.invoke();
                }
                break;
            default:
                if (!this.y) {
                    this.z.invoke();
                }
                break;
        }
        return y.a;
    }
}
