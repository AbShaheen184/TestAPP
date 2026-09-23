package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ t y;

    public /* synthetic */ r(t tVar, androidx.media3.common.r rVar, androidx.media3.exoplayer.d dVar) {
        this.e = 9;
        this.y = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        t tVar = this.y;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.x xVar = tVar.b;
                String str = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar = xVar.e.r;
                gVar.M(gVar.L(), 1029, new androidx.media3.exoplayer.v(18));
                break;
            case 1:
                androidx.media3.exoplayer.x xVar2 = tVar.b;
                String str2 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar2 = xVar2.e.r;
                gVar2.M(gVar2.L(), 1011, new androidx.media3.exoplayer.analytics.d(11));
                break;
            case 2:
                androidx.media3.exoplayer.x xVar3 = tVar.b;
                String str3 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar3 = xVar3.e.r;
                gVar3.M(gVar3.L(), 1010, new androidx.media3.exoplayer.analytics.d(12));
                break;
            case 3:
                androidx.media3.exoplayer.x xVar4 = tVar.b;
                String str4 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar4 = xVar4.e.r;
                gVar4.M(gVar4.L(), 1032, new androidx.media3.exoplayer.analytics.d(13));
                break;
            case 4:
                androidx.media3.exoplayer.x xVar5 = tVar.b;
                String str5 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar5 = xVar5.e.r;
                gVar5.M(gVar5.L(), 1008, new androidx.media3.exoplayer.v(6));
                break;
            case 5:
                androidx.media3.exoplayer.x xVar6 = tVar.b;
                String str6 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar6 = xVar6.e.r;
                gVar6.M(gVar6.L(), 1012, new androidx.media3.exoplayer.analytics.d(15));
                break;
            case 6:
                androidx.media3.exoplayer.x xVar7 = tVar.b;
                String str7 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar7 = xVar7.e.r;
                gVar7.M(gVar7.L(), 1007, new androidx.media3.exoplayer.v(25));
                break;
            case 7:
                androidx.media3.exoplayer.x xVar8 = tVar.b;
                String str8 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar8 = xVar8.e.r;
                gVar8.M(gVar8.L(), 1031, new androidx.media3.exoplayer.analytics.d(3));
                break;
            case 8:
                androidx.media3.exoplayer.x xVar9 = tVar.b;
                String str9 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar9 = xVar9.e.r;
                gVar9.M(gVar9.L(), 1014, new androidx.media3.exoplayer.analytics.d(9));
                break;
            default:
                androidx.media3.exoplayer.x xVar10 = tVar.b;
                String str10 = androidx.media3.common.util.i0.a;
                androidx.media3.exoplayer.analytics.g gVar10 = xVar10.e.r;
                gVar10.M(gVar10.L(), 1009, new androidx.media3.exoplayer.analytics.d(5));
                break;
        }
    }

    public /* synthetic */ r(t tVar, long j) {
        this.e = 2;
        this.y = tVar;
    }

    public /* synthetic */ r(t tVar, int i, long j, long j2) {
        this.e = 1;
        this.y = tVar;
    }

    public /* synthetic */ r(t tVar, Object obj, int i) {
        this.e = i;
        this.y = tVar;
    }

    public /* synthetic */ r(t tVar, String str, long j, long j2) {
        this.e = 4;
        this.y = tVar;
    }
}
