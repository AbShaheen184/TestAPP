package com.app.mlounge.ui.screens.player;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements androidx.media3.extractor.n {
    public long a;
    public final androidx.media3.extractor.mkv.e b = new androidx.media3.extractor.mkv.e(new androidx.work.impl.model.f(15), 1);
    public androidx.media3.extractor.a0 c;
    public androidx.media3.extractor.p d;

    public b1(long j) {
        this.a = j;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        return this.b.a(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.b.b(j, j2);
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        oVar.getClass();
        rVar.getClass();
        if (this.a <= 0 && oVar.getLength() > 0) {
            long length = oVar.getLength();
            this.a = length;
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "SeekableMatroskaExtractor: Discovered inputLength from input: " + length);
            androidx.media3.extractor.a0 a0Var = this.c;
            androidx.media3.extractor.p pVar = this.d;
            if (a0Var != null && !a0Var.c() && a0Var.g() != -9223372036854775807L && pVar != null) {
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "SeekableMatroskaExtractor: Updating to LinearSeekMap after length discovery");
                pVar.h(new c(a0Var.g(), this.a));
            }
        }
        return this.b.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        pVar.getClass();
        this.d = pVar;
        this.b.d(new androidx.work.impl.k(10, pVar, this));
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        this.b.getClass();
    }
}
