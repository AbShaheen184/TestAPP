package androidx.media3.exoplayer.hls.playlist;

import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    public final String I;
    public final h0 J;

    public j(String str, j jVar, String str2, long j, int i, long j2, androidx.media3.common.m mVar, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, jVar, j, i, j2, mVar, str3, str4, j3, j4, z);
        this.I = str2;
        this.J = h0.o(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, a1.B);
        e0 e0Var = h0.y;
    }
}
