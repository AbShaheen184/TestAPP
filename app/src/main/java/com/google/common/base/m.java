package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends f {
    public final Object e;

    public m(Object obj) {
        this.e = obj;
    }

    @Override // com.google.common.base.f
    public final Object a() {
        return this.e;
    }

    @Override // com.google.common.base.f
    public final boolean b() {
        return true;
    }

    @Override // com.google.common.base.f
    public final Object c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.e.equals(((m) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.e + ")";
    }
}
