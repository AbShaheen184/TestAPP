package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.compose.runtime.j;
import androidx.media3.common.util.h;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {
    public static final androidx.media3.extractor.text.a B;
    public Inflater A;
    public final v e = new v();
    public final v y = new v();
    public final a z;

    static {
        e0 e0Var = h0.y;
        B = new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, a1.B);
    }

    public b(List list) {
        int i;
        a aVar = new a();
        this.z = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = i0.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = aVar.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        androidx.media3.common.util.b.u("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    androidx.media3.common.util.b.t("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.g = Integer.parseInt(strArrSplit2[0]);
                        aVar.h = Integer.parseInt(strArrSplit2[1]);
                        aVar.d = true;
                    } catch (RuntimeException e2) {
                        androidx.media3.common.util.b.u("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.l
    public final int B() {
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0294  */
    /* JADX WARN: Code duplicated, block: B:102:0x0296  */
    /* JADX WARN: Code duplicated, block: B:105:0x029c  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x027f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0286  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00cd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.text.l
    public final void j(byte[] bArr, int i, int i2, k kVar, h hVar) {
        androidx.media3.extractor.text.a aVar;
        char c;
        char c2;
        androidx.media3.common.text.b bVar;
        long j;
        long j2;
        a1 a1VarS;
        long j3;
        Rect rect;
        v vVar = this.e;
        vVar.K(bArr, i + i2);
        vVar.M(i);
        if (this.A == null) {
            this.A = new Inflater();
        }
        Inflater inflater = this.A;
        String str = i0.a;
        if (vVar.a() > 0 && vVar.j() == 120) {
            v vVar2 = this.y;
            if (i0.J(vVar, vVar2, inflater)) {
                vVar.K(vVar2.a, vVar2.c);
            }
        }
        a aVar2 = this.z;
        long j4 = -9223372036854775807L;
        aVar2.b = -9223372036854775807L;
        aVar2.c = -9223372036854775807L;
        char c3 = 0;
        aVar2.e = false;
        aVar2.i = null;
        aVar2.j = -1;
        aVar2.k = -1;
        int iA = vVar.a();
        if (iA < 2 || vVar.G() != iA) {
            aVar = B;
        } else {
            if (aVar2.f == null) {
                androidx.media3.common.util.b.t("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (aVar2.d) {
                    int i3 = vVar.b - 2;
                    vVar.M(vVar.G() + i3);
                    while (true) {
                        if (vVar.a() < 4) {
                            c2 = c3;
                            c = c2;
                            j4 = j4;
                        } else {
                            int i4 = vVar.b;
                            int iG = vVar.G() * 10000;
                            int iG2 = vVar.G() + i3;
                            c = (iG2 == i4 || iG2 >= vVar.c) ? c3 : (char) 1;
                            int i5 = c != 0 ? iG2 : vVar.c;
                            char c4 = 1;
                            while (vVar.b < i5 && c4 != 0) {
                                long j5 = iG;
                                char c5 = c3;
                                int[] iArr = aVar2.a;
                                int iZ = vVar.z();
                                if (iZ != 255) {
                                    switch (iZ) {
                                        case 0:
                                            c4 = 1;
                                            break;
                                        case 1:
                                            aVar2.b = j5;
                                            c4 = 1;
                                            break;
                                        case 2:
                                            aVar2.c = j5;
                                            c4 = 1;
                                            break;
                                        case 3:
                                            if (vVar.a() >= 2) {
                                                int iZ2 = vVar.z();
                                                int iZ3 = vVar.z();
                                                iArr[3] = a.a(iZ2 >> 4, aVar2.f);
                                                iArr[2] = a.a(iZ2 & 15, aVar2.f);
                                                iArr[1] = a.a(iZ3 >> 4, aVar2.f);
                                                iArr[c5] = a.a(iZ3 & 15, aVar2.f);
                                                aVar2.e = true;
                                                c4 = 1;
                                            } else {
                                                androidx.media3.common.util.b.t("VobsubParser", "Incomplete color command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 4:
                                            if (vVar.a() < 2) {
                                                androidx.media3.common.util.b.t("VobsubParser", "Incomplete alpha command");
                                            } else if (aVar2.e) {
                                                int iZ4 = vVar.z();
                                                int iZ5 = vVar.z();
                                                iArr[3] = a.c(iArr[3], iZ4 >> 4);
                                                iArr[2] = a.c(iArr[2], iZ4 & 15);
                                                iArr[1] = a.c(iArr[1], iZ5 >> 4);
                                                iArr[c5] = a.c(iArr[c5], iZ5 & 15);
                                                c4 = 1;
                                            } else {
                                                androidx.media3.common.util.b.t("VobsubParser", "Ignoring alpha command before color command");
                                            }
                                            c4 = c5;
                                            break;
                                        case 5:
                                            if (vVar.a() >= 6) {
                                                int iZ6 = vVar.z();
                                                int iZ7 = vVar.z();
                                                int i6 = (iZ6 << 4) | (iZ7 >> 4);
                                                int iZ8 = ((iZ7 & 15) << 8) | vVar.z();
                                                int iZ9 = vVar.z();
                                                int iZ10 = vVar.z();
                                                aVar2.i = new Rect(i6, (iZ9 << 4) | (iZ10 >> 4), iZ8 + 1, (((iZ10 & 15) << 8) | vVar.z()) + 1);
                                                c4 = 1;
                                            } else {
                                                androidx.media3.common.util.b.t("VobsubParser", "Incomplete area command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 6:
                                            if (vVar.a() >= 4) {
                                                aVar2.j = vVar.G();
                                                aVar2.k = vVar.G();
                                                c4 = 1;
                                            } else {
                                                androidx.media3.common.util.b.t("VobsubParser", "Incomplete offsets command");
                                                c4 = c5;
                                            }
                                            break;
                                        default:
                                            j.x("Unrecognized command: ", iZ, "VobsubParser");
                                            c4 = c5;
                                            break;
                                    }
                                } else {
                                    c4 = c5;
                                }
                                c3 = c5;
                            }
                            c2 = c3;
                            if (c != 0) {
                                vVar.M(iG2);
                            }
                        }
                        if (c != 0) {
                            j4 = j4;
                            c3 = c2;
                        }
                    }
                } else {
                    androidx.media3.common.util.b.t("VobsubParser", "Skipping SPU (no plane)");
                }
                if (aVar2.f != null || !aVar2.d || !aVar2.e || (rect = aVar2.i) == null || aVar2.j == -1 || aVar2.k == -1 || rect.width() < 2 || aVar2.i.height() < 2) {
                    bVar = null;
                } else {
                    Rect rect2 = aVar2.i;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    u uVar = new u();
                    vVar.M(aVar2.j);
                    uVar.k(vVar);
                    aVar2.b(uVar, true, rect2, iArr2);
                    vVar.M(aVar2.k);
                    uVar.k(vVar);
                    aVar2.b(uVar, c2, rect2, iArr2);
                    bVar = new androidx.media3.common.text.b(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.h, 0, 0, rect2.left / aVar2.g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar2.g, rect2.height() / aVar2.h, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                }
                j = aVar2.c;
                if (j != j4) {
                    j3 = aVar2.b;
                    if (j3 != j4 || j <= j3) {
                        j2 = j;
                    } else {
                        j2 = j - j3;
                    }
                } else {
                    j2 = j4;
                }
                if (bVar != null) {
                    a1VarS = h0.s(bVar);
                } else {
                    a1VarS = a1.B;
                }
                aVar = new androidx.media3.extractor.text.a(aVar2.b, j2, a1VarS);
            }
            c2 = 0;
            j4 = -9223372036854775807L;
            if (aVar2.f != null) {
                bVar = null;
            } else {
                bVar = null;
            }
            j = aVar2.c;
            if (j != j4) {
                j3 = aVar2.b;
                if (j3 != j4) {
                    j2 = j;
                } else {
                    j2 = j;
                }
            } else {
                j2 = j4;
            }
            if (bVar != null) {
                a1VarS = h0.s(bVar);
            } else {
                a1VarS = a1.B;
            }
            aVar = new androidx.media3.extractor.text.a(aVar2.b, j2, a1VarS);
        }
        hVar.accept(aVar);
    }
}
