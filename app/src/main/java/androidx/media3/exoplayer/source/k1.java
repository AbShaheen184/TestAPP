package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends androidx.media3.common.j0 {
    public final com.google.common.collect.h0 z;

    public k1(String str, com.google.common.collect.a1 a1Var) {
        super(str, null, false, 1);
        this.z = com.google.common.collect.h0.o(a1Var);
    }

    @Override // androidx.media3.common.j0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        com.google.common.collect.h0 h0Var = this.z;
        if (h0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + h0Var;
    }
}
