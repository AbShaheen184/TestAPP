package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 extends s {
    r0 h0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2);

    default r0 q(int i, int i2, Map map, kotlin.jvm.functions.l lVar) {
        return h0(i, i2, map, null, lVar);
    }
}
