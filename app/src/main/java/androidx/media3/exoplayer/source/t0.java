package androidx.media3.exoplayer.source;

import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements androidx.media3.common.util.h, com.google.common.base.q, androidx.media3.extractor.q, androidx.transition.l {
    public final /* synthetic */ int e;

    public /* synthetic */ t0(int i) {
        this.e = i;
    }

    public static /* synthetic */ void d(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    @Override // androidx.media3.extractor.q
    public androidx.media3.extractor.n[] a() {
        int i = 0;
        switch (this.e) {
            case 6:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.amr.a()};
            case 7:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.flac.c()};
            case 8:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.flv.b()};
            case 9:
            case 10:
            default:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.wav.d()};
            case 11:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.mp4.m(androidx.media3.extractor.text.j.g, 16)};
            case 12:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ogg.d()};
            case 13:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ts.a()};
            case 14:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ts.c()};
            case 15:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ts.d(0)};
            case 16:
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ts.y()};
            case 17:
                androidx.media3.common.util.g0 g0Var = new androidx.media3.common.util.g0(0L);
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                return new androidx.media3.extractor.n[]{new androidx.media3.extractor.ts.c0(1, 1, androidx.media3.extractor.text.j.g, g0Var, new androidx.compose.foundation.lazy.grid.t(i, com.google.common.collect.a1.B))};
        }
    }

    @Override // androidx.media3.common.util.h
    public void accept(Object obj) {
        switch (this.e) {
            case 0:
                ((u0) obj).b.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    public Constructor c() {
        switch (this.e) {
            case 3:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(androidx.media3.extractor.n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(androidx.media3.extractor.n.class).getConstructor(null);
        }
    }

    @Override // androidx.transition.l
    public void e(androidx.transition.j jVar, androidx.transition.m mVar) {
        jVar.c(mVar);
    }

    @Override // com.google.common.base.q
    public Object get() {
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
