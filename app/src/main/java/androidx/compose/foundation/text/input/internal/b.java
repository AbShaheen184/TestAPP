package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.graphics.f0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements kotlin.jvm.functions.l {
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar) {
        super(1, kotlin.jvm.internal.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.e = qVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        float[] fArr = ((f0) obj).a;
        androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.e.O.getValue();
        if (xVar != null) {
            if (!xVar.l()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.m(fArr);
            }
        }
        return y.a;
    }
}
