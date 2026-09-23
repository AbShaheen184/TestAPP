package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.core.view.w0 {
    public static final Map B;
    public final ug A;

    static {
        EnumMap enumMap = new EnumMap(ug.class);
        for (ug ugVar : ug.values()) {
            a0[] a0VarArr = new a0[10];
            for (int i = 0; i < 10; i++) {
                a0VarArr[i] = new a0(i, ugVar, vg.e);
            }
            enumMap.put(ugVar, a0VarArr);
        }
        B = Collections.unmodifiableMap(enumMap);
    }

    public a0(int i, ug ugVar, vg vgVar) {
        super(vgVar, i);
        e1.c(ugVar, "format char");
        this.A = ugVar;
        if (vgVar.a()) {
            return;
        }
        int i2 = ugVar.e;
        i2 = vgVar.c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        vgVar.d(sb);
        sb.append((char) i2);
    }

    @Override // androidx.core.view.w0
    public final void O(androidx.emoji2.text.s sVar, Object obj) {
        sVar.e(obj, this.A, (vg) this.z);
    }
}
