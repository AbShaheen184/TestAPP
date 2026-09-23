package net.luminis.quic.impl;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final n b = new n(1);
    public static final n c = new n(1798521807);
    public final int a;

    public n(int i) {
        this.a = i;
    }

    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.a);
        return byteBufferAllocate.array();
    }

    public final boolean b() {
        return this.a == 1798521807;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "v1";
        }
        if (i == 1798521807) {
            return "v2";
        }
        if (i <= -16777216 || i > -16777182) {
            return "v-" + Integer.toHexString(i);
        }
        return "draft-" + (i - (-16777216));
    }
}
