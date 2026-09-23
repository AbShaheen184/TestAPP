package androidx.media3.container;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final byte m;
    public final byte n;
    public final byte o;

    public u(t tVar) {
        int i = tVar.a;
        ByteBuffer byteBuffer = tVar.b;
        _COROUTINE.a.o(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        androidx.media3.common.util.u uVar = new androidx.media3.common.util.u(bArr, iRemaining);
        this.g = uVar.g(3);
        uVar.n();
        boolean zF = uVar.f();
        this.a = zF;
        if (zF) {
            uVar.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (uVar.f()) {
                uVar.o(64);
                if (uVar.f()) {
                    int i2 = 0;
                    while (!uVar.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        uVar.o(i2);
                    }
                }
                boolean zF2 = uVar.f();
                this.b = zF2;
                if (zF2) {
                    uVar.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = uVar.f();
            int iG = uVar.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                uVar.o(12);
                if (i3 == 0) {
                    if (uVar.g(5) > 7) {
                        uVar.f();
                    }
                } else if (uVar.g(5) > 7) {
                    uVar.n();
                }
                if (this.b) {
                    uVar.n();
                }
                if (this.h && uVar.f()) {
                    if (i3 == 0) {
                        uVar.g(4);
                    } else {
                        uVar.o(4);
                    }
                }
            }
        }
        int iG2 = uVar.g(4);
        int iG3 = uVar.g(4);
        uVar.o(iG2 + 1);
        uVar.o(iG3 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = uVar.f();
        }
        if (this.c) {
            uVar.o(4);
            uVar.o(3);
        }
        uVar.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            uVar.o(4);
            boolean zF3 = uVar.f();
            if (zF3) {
                uVar.o(2);
            }
            if (uVar.f()) {
                this.d = true;
            } else {
                this.d = uVar.f();
            }
            if (!this.d || uVar.f()) {
                this.e = true;
            } else {
                this.e = uVar.f();
            }
            if (zF3) {
                this.f = uVar.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        uVar.o(3);
        boolean zF4 = uVar.f();
        if (this.g == 2 && zF4) {
            this.i = uVar.f();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = uVar.f();
        } else {
            this.j = false;
        }
        if (uVar.f()) {
            this.m = (byte) uVar.g(8);
            this.n = (byte) uVar.g(8);
            this.o = (byte) uVar.g(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            uVar.n();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            uVar.n();
            int i4 = this.g;
            if (i4 == 0) {
                this.k = true;
                this.l = true;
            } else if (i4 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean zF5 = uVar.f();
                this.k = zF5;
                if (zF5) {
                    this.l = uVar.f();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                uVar.g(2);
            }
        }
        uVar.n();
    }
}
