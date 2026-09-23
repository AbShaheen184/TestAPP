package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.compose.foundation.interaction.j {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final j0 c;

    public k0(androidx.compose.foundation.interaction.k kVar, long j) {
        this.a = j;
        this.c = new j0(kVar.a, this, 0);
    }

    @Override // androidx.compose.foundation.interaction.j
    public final Flow a() {
        return this.c;
    }
}
