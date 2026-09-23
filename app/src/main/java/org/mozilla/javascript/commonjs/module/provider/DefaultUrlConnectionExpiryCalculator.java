package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.net.URLConnection;
import kotlinx.coroutines.future.a;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultUrlConnectionExpiryCalculator implements UrlConnectionExpiryCalculator, Serializable {
    private static final long serialVersionUID = 1;
    private final long relativeExpiry;

    public DefaultUrlConnectionExpiryCalculator(long j) {
        if (j >= 0) {
            this.relativeExpiry = j;
        } else {
            a.q("relativeExpiry < 0");
            throw null;
        }
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator
    public long calculateExpiry(URLConnection uRLConnection) {
        return System.currentTimeMillis() + this.relativeExpiry;
    }

    public DefaultUrlConnectionExpiryCalculator() {
        this(60000L);
    }
}
