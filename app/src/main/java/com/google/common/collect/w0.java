package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements com.google.common.base.q, Serializable {
    public final int e;

    public w0() {
        q.f(2, "expectedValuesPerKey");
        this.e = 2;
    }

    @Override // com.google.common.base.q
    public final Object get() {
        return new ArrayList(this.e);
    }
}
