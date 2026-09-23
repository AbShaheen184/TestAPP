package com.google.common.io;

import com.google.android.gms.dynamite.g;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final c d;
    public static final b e;
    public final a a;
    public final Character b;
    public volatile d c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        d = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public d(a aVar, Character ch) {
        boolean z;
        this.a = aVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = aVar.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        _COROUTINE.a.q(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        _COROUTINE.a.x(0, length, bArr.length);
        a aVar = this.a;
        int i = aVar.e;
        int i2 = aVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(g.p(length, i2) * i);
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            kotlinx.coroutines.future.a.o(e2);
            return null;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        _COROUTINE.a.x(i, i + i2, bArr.length);
        a aVar = this.a;
        int i3 = aVar.f;
        int i4 = aVar.d;
        int i5 = 0;
        _COROUTINE.a.o(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(aVar.b[((int) (j >>> (i7 - i5))) & aVar.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < aVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        _COROUTINE.a.x(0, i, bArr.length);
        while (i2 < i) {
            a aVar = this.a;
            b(sb, bArr, i2, Math.min(aVar.f, i - i2));
            i2 += aVar.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && Objects.equals(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.a;
        sb.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
