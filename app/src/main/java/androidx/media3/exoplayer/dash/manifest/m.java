package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.i0;
import com.google.common.collect.h0;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final List A;
    public final j B;
    public final androidx.media3.common.r e;
    public final h0 y;
    public final long z;

    public m(androidx.media3.common.r rVar, List list, s sVar, List list2) {
        _COROUTINE.a.o(!list.isEmpty());
        this.e = rVar;
        this.y = h0.o(list);
        this.A = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.B = sVar.a(this);
        long j = sVar.c;
        long j2 = sVar.b;
        String str = i0.a;
        this.z = i0.Y(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract androidx.media3.exoplayer.dash.j c();

    public abstract j d();
}
