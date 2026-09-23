package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public static final /* synthetic */ wc y = new wc(0);
    public static final /* synthetic */ wc z = new wc(1);
    public final /* synthetic */ int e;

    public /* synthetic */ wc(int i) {
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.e) {
            case 0:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final /* synthetic */ void a() {
    }
}
