package com.appsalt.internal;

import com.appsalt.lib.sdk.quic.signature.LegacyRsaSignatureAdapter;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Provider {
    public q() {
        super("Android RSA Provider", 1.3d, "Legacy RSASSA-PSS adapter for android");
        put("Signature.RSASSA-PSS", kotlin.jvm.internal.a0.a(LegacyRsaSignatureAdapter.class).b());
        put("Signature.RSASSA-PSS ImplementedIn", "Software");
    }
}
