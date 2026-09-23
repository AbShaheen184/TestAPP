package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    public static final /* synthetic */ q1 a = new q1();
    public static final s1 b;
    public static final s1 c;
    public static final s1 d;
    public static final s1 e;
    public static final s1 f;
    public static final s1 g;
    public static final s1 h;
    public static final s1 i;
    public static final s1 j;

    static {
        s1 s1Var = new s1("caption bar");
        b = s1Var;
        s1 s1Var2 = new s1("display cutout");
        c = s1Var2;
        s1 s1Var3 = new s1("ime");
        d = s1Var3;
        s1 s1Var4 = new s1("mandatory system gestures");
        e = s1Var4;
        s1 s1Var5 = new s1("navigation bars");
        f = s1Var5;
        s1 s1Var6 = new s1("status bars");
        g = s1Var6;
        char c2 = 2;
        r1[] r1VarArr = {s1Var6, s1Var5, s1Var};
        ArrayList arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(((s1) r1VarArr[i2]).c);
        }
        q[] qVarArr = (q[]) arrayList.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i3 = 0; i3 < 3; i3++) {
            arrayList2.add(((s1) r1VarArr[i3]).d);
        }
        q[] qVarArr2 = (q[]) arrayList2.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr2, qVarArr2.length));
        s1 s1Var7 = new s1("system gestures");
        h = s1Var7;
        s1 s1Var8 = new s1("tappable element");
        i = s1Var8;
        s1 s1Var9 = new s1("waterfall");
        j = s1Var9;
        r1[] r1VarArr2 = {s1Var6, s1Var5, s1Var, s1Var2, s1Var3, s1Var8};
        ArrayList arrayList3 = new ArrayList(6);
        int i4 = 0;
        while (i4 < 6) {
            arrayList3.add(((s1) r1VarArr2[i4]).c);
            i4++;
            c2 = c2;
        }
        char c3 = c2;
        q[] qVarArr3 = (q[]) arrayList3.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr3, qVarArr3.length));
        ArrayList arrayList4 = new ArrayList(6);
        for (int i5 = 0; i5 < 6; i5++) {
            arrayList4.add(((s1) r1VarArr2[i5]).d);
        }
        q[] qVarArr4 = (q[]) arrayList4.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr4, qVarArr4.length));
        r1[] r1VarArr3 = new r1[4];
        r1VarArr3[0] = s1Var4;
        r1VarArr3[1] = s1Var7;
        r1VarArr3[c3] = s1Var8;
        r1VarArr3[3] = s1Var9;
        ArrayList arrayList5 = new ArrayList(4);
        for (int i6 = 0; i6 < 4; i6++) {
            arrayList5.add(((s1) r1VarArr3[i6]).c);
        }
        q[] qVarArr5 = (q[]) arrayList5.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr5, qVarArr5.length));
        ArrayList arrayList6 = new ArrayList(4);
        for (int i7 = 0; i7 < 4; i7++) {
            arrayList6.add(((s1) r1VarArr3[i7]).d);
        }
        q[] qVarArr6 = (q[]) arrayList6.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr6, qVarArr6.length));
        r1[] r1VarArr4 = new r1[9];
        r1VarArr4[0] = s1Var6;
        r1VarArr4[1] = s1Var5;
        r1VarArr4[c3] = s1Var;
        r1VarArr4[3] = s1Var3;
        r1VarArr4[4] = s1Var7;
        r1VarArr4[5] = s1Var4;
        r1VarArr4[6] = s1Var8;
        r1VarArr4[7] = s1Var2;
        r1VarArr4[8] = s1Var9;
        ArrayList arrayList7 = new ArrayList(9);
        for (int i8 = 0; i8 < 9; i8++) {
            arrayList7.add(((s1) r1VarArr4[i8]).c);
        }
        q[] qVarArr7 = (q[]) arrayList7.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr7, qVarArr7.length));
        ArrayList arrayList8 = new ArrayList(9);
        for (int i9 = 0; i9 < 9; i9++) {
            arrayList8.add(((s1) r1VarArr4[i9]).d);
        }
        q[] qVarArr8 = (q[]) arrayList8.toArray(new q[0]);
        new q((q[]) Arrays.copyOf(qVarArr8, qVarArr8.length));
    }
}
