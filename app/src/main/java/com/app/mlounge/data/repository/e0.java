package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.model.ChqStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends g0 {
    public final ChqStream a;
    public final String b;

    public e0(ChqStream chqStream, String str) {
        chqStream.getClass();
        str.getClass();
        this.a = chqStream;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.l.a(this.a, e0Var.a) && kotlin.jvm.internal.l.a(this.b, e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(stream=" + this.a + ", url=" + this.b + ")";
    }
}
