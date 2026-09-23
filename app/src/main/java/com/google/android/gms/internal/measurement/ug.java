package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum ug {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);

    public static final ug[] C = new ug[26];
    public final String A;
    public final char e;
    public final int y;
    public final int z;

    static {
        for (ug ugVar : values()) {
            C[(ugVar.e | ' ') - 97] = ugVar;
        }
    }

    ug(char c, int i, String str, boolean z) {
        this.e = c;
        this.y = i;
        vg vgVar = vg.e;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iCharAt = ((int) ((vg.d >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                kotlinx.coroutines.future.a.q("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.z = i2;
        this.A = androidx.compose.runtime.j.l(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
