package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    @Override // retrofit2.a
    public final List a(Executor executor) {
        return Arrays.asList(new k(), new o(executor));
    }

    @Override // retrofit2.a
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}
