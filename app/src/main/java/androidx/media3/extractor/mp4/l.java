package androidx.media3.extractor.mp4;

import androidx.media3.extractor.h0;
import androidx.media3.extractor.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final r a;
    public final u b;
    public final h0 c;
    public final i0 d;
    public int e;
    public androidx.media3.common.r f;

    public l(r rVar, u uVar, h0 h0Var) {
        this.a = rVar;
        this.b = uVar;
        this.c = h0Var;
        this.d = "audio/true-hd".equals(rVar.g.o) ? new i0() : null;
    }
}
