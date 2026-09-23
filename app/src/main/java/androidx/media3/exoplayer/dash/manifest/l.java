package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import com.google.common.collect.h0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final j C;
    public final t D;

    public l(androidx.media3.common.r rVar, h0 h0Var, r rVar2, ArrayList arrayList) {
        super(rVar, h0Var, rVar2, arrayList);
        Uri.parse(((b) h0Var.get(0)).a);
        long j = rVar2.e;
        j jVar = j <= 0 ? null : new j(rVar2.d, j, null);
        this.C = jVar;
        this.D = jVar == null ? new t(new j(0L, -1L, null)) : null;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final String b() {
        return null;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final androidx.media3.exoplayer.dash.j c() {
        return this.D;
    }

    @Override // androidx.media3.exoplayer.dash.manifest.m
    public final j d() {
        return this.C;
    }
}
