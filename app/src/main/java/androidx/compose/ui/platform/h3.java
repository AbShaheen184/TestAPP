package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 implements z1, kotlin.jvm.internal.g {
    public final /* synthetic */ androidx.compose.runtime.w e;

    public h3(androidx.compose.runtime.w wVar) {
        this.e = wVar;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return new kotlin.jvm.internal.j(1, 0, androidx.compose.runtime.w.class, this.e, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof z1) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
