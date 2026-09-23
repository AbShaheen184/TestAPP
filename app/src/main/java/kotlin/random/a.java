package kotlin.random;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // kotlin.random.d
    public final int a(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // kotlin.random.d
    public final int b() {
        return f().nextInt();
    }

    @Override // kotlin.random.d
    public final long d() {
        return f().nextLong();
    }

    public abstract Random f();

    public final int g(int i) {
        return f().nextInt(i);
    }
}
