package net.luminis.quic.impl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public byte[] a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean j;
    public byte[] m;
    public byte[] n;
    public byte[] p;
    public com.google.android.material.internal.k q;
    public int i = 3;
    public int k = 25;
    public int l = 2;
    public int o = 1500;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n- original destination connection id\t");
        byte[] bArr = this.a;
        sb.append(bArr != null ? kotlin.coroutines.intrinsics.h.c(bArr) : "null");
        sb.append("\n- max idle timeout\t");
        sb.append(this.b / 1000);
        sb.append("\n- max udp payload size\t");
        sb.append(this.o);
        sb.append("\n- initial max data\t\t\t");
        sb.append(this.c);
        sb.append("\n- initial max stream data bidi local\t");
        sb.append(this.d);
        sb.append("\n- initial max stream data bidi remote\t");
        sb.append(this.e);
        sb.append("\n- initial max stream data uni\t\t");
        sb.append(this.f);
        sb.append("\n- initial max streams bidi\t\t");
        sb.append(this.g);
        sb.append("\n- initial max streams uni\t\t");
        sb.append(this.h);
        sb.append("\n- ack delay exponent\t\t\t");
        sb.append(this.i);
        sb.append("\n- max ack delay\t\t\t\t");
        sb.append(this.k);
        sb.append("\n- disable migration\t\t\t");
        sb.append(this.j);
        sb.append("\n- active connection id limit\t\t");
        sb.append(this.l);
        sb.append("\n- initial source connection id\t\t");
        byte[] bArr2 = this.m;
        sb.append(bArr2 != null ? kotlin.coroutines.intrinsics.h.c(bArr2) : "null");
        sb.append("\n- retry source connection id\t\t");
        byte[] bArr3 = this.n;
        sb.append(bArr3 != null ? kotlin.coroutines.intrinsics.h.c(bArr3) : "null");
        return sb.toString();
    }
}
