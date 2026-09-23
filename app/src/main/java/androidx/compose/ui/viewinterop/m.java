package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.m1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ androidx.compose.runtime.q A;
    public final /* synthetic */ androidx.compose.runtime.saveable.g B;
    public final /* synthetic */ int C;
    public final /* synthetic */ View D;
    public final /* synthetic */ Context y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, kotlin.jvm.functions.l lVar, androidx.compose.runtime.q qVar, androidx.compose.runtime.saveable.g gVar, int i, View view) {
        super(0);
        this.y = context;
        this.z = lVar;
        this.A = qVar;
        this.B = gVar;
        this.C = i;
        this.D = view;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.D;
        callback.getClass();
        return new w(this.y, this.z, this.A, this.B, this.C, (m1) callback).getLayoutNode();
    }
}
