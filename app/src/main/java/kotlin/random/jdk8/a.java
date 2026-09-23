package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.d
    public final int c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.d
    public final long e(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // kotlin.random.a
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
