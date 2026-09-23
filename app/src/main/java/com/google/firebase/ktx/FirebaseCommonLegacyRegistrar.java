package com.google.firebase.ktx;

import androidx.annotation.Keep;
import coil3.network.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import java.util.List;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return q.j(g.j("fire-core-ktx", "21.0.0"));
    }
}
