package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final p a = new p();

    public final void a() {
        try {
            ((q) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(p.class).newInstance(this.a)).a();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
