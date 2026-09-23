package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.i0;
import androidx.media3.common.util.u;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.source.t0;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends _COROUTINE.a {
    public static final t0 n = new t0(9);
    public final t0 m;

    public h(t0 t0Var) {
        this.m = t0Var;
    }

    public static a e0(v vVar, int i, int i2) {
        int iW0;
        String strConcat;
        int iZ = vVar.z();
        Charset charsetT0 = t0(iZ);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        vVar.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + com.imsdk.a.B(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iW0 = 2;
        } else {
            iW0 = w0(bArr, 0);
            String strB = com.imsdk.a.B(new String(bArr, 0, iW0, StandardCharsets.ISO_8859_1));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i4 = bArr[iW0 + 1] & 255;
        int i5 = iW0 + 2;
        int iV0 = v0(bArr, i5, iZ);
        String str = new String(bArr, i5, iV0 - i5, charsetT0);
        int iS0 = s0(iZ) + iV0;
        return new a(strConcat, str, i4, i3 <= iS0 ? i0.b : Arrays.copyOfRange(bArr, iS0, i3));
    }

    public static c f0(v vVar, int i, int i2, boolean z, int i3, t0 t0Var) throws Throwable {
        int i4 = vVar.b;
        int iW0 = w0(vVar.a, i4);
        String str = new String(vVar.a, i4, iW0 - i4, StandardCharsets.ISO_8859_1);
        vVar.M(iW0 + 1);
        int iM = vVar.m();
        int iM2 = vVar.m();
        long jB = vVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = vVar.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (vVar.b < i5) {
            i iVarI0 = i0(i2, vVar, z, i3, t0Var);
            if (iVarI0 != null) {
                arrayList.add(iVarI0);
            }
        }
        return new c(str, iM, iM2, jB, j, (i[]) arrayList.toArray(new i[0]));
    }

    public static d g0(v vVar, int i, int i2, boolean z, int i3, t0 t0Var) throws Throwable {
        int i4 = vVar.b;
        int iW0 = w0(vVar.a, i4);
        String str = new String(vVar.a, i4, iW0 - i4, StandardCharsets.ISO_8859_1);
        vVar.M(iW0 + 1);
        int iZ = vVar.z();
        boolean z2 = (iZ & 2) != 0;
        boolean z3 = (iZ & 1) != 0;
        int iZ2 = vVar.z();
        String[] strArr = new String[iZ2];
        for (int i5 = 0; i5 < iZ2; i5++) {
            int i6 = vVar.b;
            int iW1 = w0(vVar.a, i6);
            strArr[i5] = new String(vVar.a, i6, iW1 - i6, StandardCharsets.ISO_8859_1);
            vVar.M(iW1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (vVar.b < i7) {
            i iVarI0 = i0(i2, vVar, z, i3, t0Var);
            if (iVarI0 != null) {
                arrayList.add(iVarI0);
            }
        }
        return new d(str, z2, z3, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e h0(int i, v vVar) {
        if (i < 4) {
            return null;
        }
        int iZ = vVar.z();
        Charset charsetT0 = t0(iZ);
        byte[] bArr = new byte[3];
        vVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        vVar.k(bArr2, 0, i2);
        int iV0 = v0(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iV0, charsetT0);
        int iS0 = s0(iZ) + iV0;
        return new e(str, str2, m0(bArr2, iS0, v0(bArr2, iS0, iZ), charsetT0));
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:183:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:185:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:191:0x020c A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:107:0x0126, B:115:0x0137, B:122:0x014d, B:124:0x0155, B:132:0x016f, B:141:0x0187, B:152:0x01a2, B:159:0x01b4, B:182:0x01f2, B:190:0x0207, B:191:0x020c), top: B:205:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:198:0x022e  */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x022e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    public static i i0(int i, v vVar, boolean z, int i2, t0 t0Var) throws Throwable {
        int iD;
        i iVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        i iVar2;
        ?? r0;
        i bVar;
        boolean z7;
        int i3 = i;
        v vVar2 = vVar;
        int iZ = vVar2.z();
        int iZ2 = vVar2.z();
        int iZ3 = vVar2.z();
        int iZ4 = i3 >= 3 ? vVar2.z() : 0;
        if (i3 == 4) {
            iD = vVar2.D();
            if (!z) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i3 == 3 ? vVar2.D() : vVar2.C();
        }
        int iG = i3 >= 3 ? vVar2.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && iD == 0 && iG == 0) {
            vVar2.M(vVar2.c);
            return null;
        }
        int i4 = vVar2.b + iD;
        if (i4 > vVar2.c) {
            androidx.media3.common.util.b.t("Id3Decoder", "Frame size exceeds remaining tag data");
            vVar2.M(vVar2.c);
            return null;
        }
        if (t0Var != null) {
            switch (t0Var.e) {
                case 9:
                    iVar = null;
                    break;
                default:
                    iVar = null;
                    z7 = (iZ == 67 && iZ2 == 79 && iZ3 == 77 && (iZ4 == 77 || i3 == 2)) || (iZ == 77 && iZ2 == 76 && iZ3 == 76 && (iZ4 == 84 || i3 == 2));
                    break;
            }
            if (!z7) {
                vVar2.M(i4);
                return iVar;
            }
        } else {
            iVar = null;
        }
        if (i3 == 3) {
            z2 = (iG & 128) != 0;
            z5 = (iG & 64) != 0;
            z6 = false;
            z4 = (iG & 32) != 0;
            z3 = z2;
        } else if (i3 == 4) {
            boolean z8 = (iG & 64) != 0;
            boolean z9 = (iG & 8) != 0;
            z5 = (iG & 4) != 0;
            z6 = (iG & 2) != 0;
            z3 = (iG & 1) != 0;
            boolean z10 = z9;
            z4 = z8;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            androidx.media3.common.util.b.t("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            vVar2.M(i4);
            return iVar;
        }
        if (z4) {
            iD--;
            vVar2.N(1);
        }
        if (z3) {
            iD -= 4;
            vVar2.N(4);
        }
        if (z6) {
            iD = x0(iD, vVar2);
        }
        int i5 = iD;
        try {
            if (iZ == 84 && iZ2 == 88 && iZ3 == 88 && (i3 == 2 || iZ4 == 88)) {
                bVar = p0(i5, vVar2);
            } else if (iZ == 84) {
                bVar = n0(i5, vVar2, u0(i3, iZ, iZ2, iZ3, iZ4));
            } else if (iZ == 87 && iZ2 == 88 && iZ3 == 88 && (i3 == 2 || iZ4 == 88)) {
                bVar = r0(i5, vVar2);
            } else if (iZ == 87) {
                bVar = q0(i5, vVar2, u0(i3, iZ, iZ2, iZ3, iZ4));
            } else if (iZ == 80 && iZ2 == 82 && iZ3 == 73 && iZ4 == 86) {
                bVar = l0(i5, vVar2);
            } else {
                if (iZ != 71 || iZ2 != 69 || iZ3 != 79 || (iZ4 != 66 && i3 != 2)) {
                    if (i3 == 2) {
                        if (iZ == 80 && iZ2 == 73 && iZ3 == 67) {
                            bVar = e0(vVar2, i5, i3);
                        } else if (iZ != 67 && iZ2 == 79 && iZ3 == 77 && (iZ4 == 77 || i3 == 2)) {
                            bVar = h0(i5, vVar2);
                        } else if (iZ != 67 && iZ2 == 72 && iZ3 == 65 && iZ4 == 80) {
                            try {
                                bVar = f0(vVar2, i5, i3, z, i2, t0Var);
                                i3 = i;
                                vVar2 = vVar;
                            } catch (Exception e) {
                                e = e;
                                i3 = i;
                                vVar2 = vVar;
                                obj = e;
                                vVar2.M(i4);
                                iVar2 = iVar;
                                r0 = obj;
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                i3 = i;
                                vVar2 = vVar;
                                obj = e;
                                vVar2.M(i4);
                                iVar2 = iVar;
                                r0 = obj;
                            } catch (Throwable th) {
                                th = th;
                                vVar2 = vVar;
                                vVar2.M(i4);
                                throw th;
                            }
                        } else if (iZ != 67 && iZ2 == 84 && iZ3 == 79 && iZ4 == 67) {
                            i3 = i;
                            vVar2 = vVar;
                            bVar = g0(vVar2, i5, i3, z, i2, t0Var);
                        } else {
                            i3 = i;
                            vVar2 = vVar;
                            if (iZ != 77 && iZ2 == 76 && iZ3 == 76 && iZ4 == 84) {
                                bVar = k0(i5, vVar2);
                            } else {
                                String strU0 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                byte[] bArr = new byte[i5];
                                vVar2.k(bArr, 0, i5);
                                bVar = new b(strU0, bArr);
                            }
                        }
                        vVar2.M(i4);
                        iVar2 = bVar;
                        r0 = iVar;
                    } else if (iZ == 65 && iZ2 == 80 && iZ3 == 73 && iZ4 == 67) {
                        bVar = e0(vVar2, i5, i3);
                    } else {
                        if (iZ != 67) {
                            if (iZ != 67) {
                            }
                            if (iZ != 67) {
                                i3 = i;
                                vVar2 = vVar;
                                if (iZ != 77) {
                                    String strU1 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr2 = new byte[i5];
                                    vVar2.k(bArr2, 0, i5);
                                    bVar = new b(strU1, bArr2);
                                } else {
                                    String strU2 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr3 = new byte[i5];
                                    vVar2.k(bArr3, 0, i5);
                                    bVar = new b(strU2, bArr3);
                                }
                            } else {
                                i3 = i;
                                vVar2 = vVar;
                                if (iZ != 77) {
                                    String strU3 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr4 = new byte[i5];
                                    vVar2.k(bArr4, 0, i5);
                                    bVar = new b(strU3, bArr4);
                                } else {
                                    String strU4 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr5 = new byte[i5];
                                    vVar2.k(bArr5, 0, i5);
                                    bVar = new b(strU4, bArr5);
                                }
                            }
                        } else {
                            if (iZ != 67) {
                            }
                            if (iZ != 67) {
                                i3 = i;
                                vVar2 = vVar;
                                if (iZ != 77) {
                                    String strU5 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr6 = new byte[i5];
                                    vVar2.k(bArr6, 0, i5);
                                    bVar = new b(strU5, bArr6);
                                } else {
                                    String strU6 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr7 = new byte[i5];
                                    vVar2.k(bArr7, 0, i5);
                                    bVar = new b(strU6, bArr7);
                                }
                            } else {
                                i3 = i;
                                vVar2 = vVar;
                                if (iZ != 77) {
                                    String strU7 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr8 = new byte[i5];
                                    vVar2.k(bArr8, 0, i5);
                                    bVar = new b(strU7, bArr8);
                                } else {
                                    String strU8 = u0(i3, iZ, iZ2, iZ3, iZ4);
                                    byte[] bArr9 = new byte[i5];
                                    vVar2.k(bArr9, 0, i5);
                                    bVar = new b(strU8, bArr9);
                                }
                            }
                        }
                        vVar2.M(i4);
                        iVar2 = bVar;
                        r0 = iVar;
                    }
                    if (iVar2 == null) {
                        androidx.media3.common.util.b.u("Id3Decoder", "Failed to decode frame: id=" + u0(i3, iZ, iZ2, iZ3, iZ4) + ", frameSize=" + i5, r0);
                    }
                    return iVar2;
                }
                bVar = j0(i5, vVar2);
            }
            vVar2.M(i4);
            iVar2 = bVar;
            r0 = iVar;
        } catch (Exception e3) {
            obj = e3;
        } catch (OutOfMemoryError e4) {
            obj = e4;
        } catch (Throwable th2) {
            th = th2;
        }
        if (iVar2 == null) {
            androidx.media3.common.util.b.u("Id3Decoder", "Failed to decode frame: id=" + u0(i3, iZ, iZ2, iZ3, iZ4) + ", frameSize=" + i5, r0);
        }
        return iVar2;
    }

    public static f j0(int i, v vVar) {
        int iZ = vVar.z();
        Charset charsetT0 = t0(iZ);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.k(bArr, 0, i2);
        int iW0 = w0(bArr, 0);
        String strP = androidx.media3.common.i0.p(new String(bArr, 0, iW0, StandardCharsets.ISO_8859_1));
        int i3 = iW0 + 1;
        int iV0 = v0(bArr, i3, iZ);
        String strM0 = m0(bArr, i3, iV0, charsetT0);
        int iS0 = s0(iZ) + iV0;
        int iV1 = v0(bArr, iS0, iZ);
        String strM1 = m0(bArr, iS0, iV1, charsetT0);
        int iS1 = s0(iZ) + iV1;
        return new f(strP, strM0, strM1, i2 <= iS1 ? i0.b : Arrays.copyOfRange(bArr, iS1, i2));
    }

    public static l k0(int i, v vVar) {
        int iG = vVar.G();
        int iC = vVar.C();
        int iC2 = vVar.C();
        int iZ = vVar.z();
        int iZ2 = vVar.z();
        u uVar = new u();
        uVar.k(vVar);
        int i2 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG2 = uVar.g(iZ);
            int iG3 = uVar.g(iZ2);
            iArr[i3] = iG2;
            iArr2[i3] = iG3;
        }
        return new l(iG, iC, iC2, iArr, iArr2);
    }

    public static m l0(int i, v vVar) {
        byte[] bArr = new byte[i];
        vVar.k(bArr, 0, i);
        int iW0 = w0(bArr, 0);
        String str = new String(bArr, 0, iW0, StandardCharsets.ISO_8859_1);
        int i2 = iW0 + 1;
        return new m(str, i <= i2 ? i0.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String m0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static n n0(int i, v vVar, String str) {
        if (i < 1) {
            return null;
        }
        int iZ = vVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.k(bArr, 0, i2);
        return new n(str, null, o0(bArr, iZ, 0));
    }

    public static a1 o0(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return h0.s("");
        }
        d0 d0VarK = h0.k();
        int iV0 = v0(bArr, i2, i);
        while (i2 < iV0) {
            d0VarK.b(new String(bArr, i2, iV0 - i2, t0(i)));
            i2 = s0(i) + iV0;
            iV0 = v0(bArr, i2, i);
        }
        a1 a1VarG = d0VarK.g();
        return a1VarG.isEmpty() ? h0.s("") : a1VarG;
    }

    public static n p0(int i, v vVar) {
        if (i < 1) {
            return null;
        }
        int iZ = vVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.k(bArr, 0, i2);
        int iV0 = v0(bArr, 0, iZ);
        return new n("TXXX", new String(bArr, 0, iV0, t0(iZ)), o0(bArr, iZ, s0(iZ) + iV0));
    }

    public static o q0(int i, v vVar, String str) {
        byte[] bArr = new byte[i];
        vVar.k(bArr, 0, i);
        return new o(str, null, new String(bArr, 0, w0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o r0(int i, v vVar) {
        if (i < 1) {
            return null;
        }
        int iZ = vVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.k(bArr, 0, i2);
        int iV0 = v0(bArr, 0, iZ);
        String str = new String(bArr, 0, iV0, t0(iZ));
        int iS0 = s0(iZ) + iV0;
        return new o("WXXX", str, m0(bArr, iS0, w0(bArr, iS0), StandardCharsets.ISO_8859_1));
    }

    public static int s0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset t0(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String u0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int v0(byte[] bArr, int i, int i2) {
        int iW0 = w0(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iW0;
        }
        while (iW0 < bArr.length - 1) {
            if ((iW0 - i) % 2 == 0 && bArr[iW0 + 1] == 0) {
                return iW0;
            }
            iW0 = w0(bArr, iW0 + 1);
        }
        return bArr.length;
    }

    public static int w0(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int x0(int i, v vVar) {
        byte[] bArr = vVar.a;
        int i2 = vVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean y0(v vVar, int i, int i2, boolean z) {
        int iC;
        long jC;
        int iG;
        int i3;
        int i4 = vVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (vVar.a() < i2) {
                    vVar.M(i4);
                    return true;
                }
                if (i >= 3) {
                    iC = vVar.m();
                    jC = vVar.B();
                    iG = vVar.G();
                } else {
                    iC = vVar.C();
                    jC = vVar.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    vVar.M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jC) != 0) {
                        vVar.M(i4);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jC < i3) {
                    vVar.M(i4);
                    return false;
                }
                if (vVar.a() < jC) {
                    vVar.M(i4);
                    return false;
                }
                vVar.N((int) jC);
            } catch (Throwable th) {
                vVar.M(i4);
                throw th;
            }
        }
    }

    @Override // _COROUTINE.a
    public final androidx.media3.common.h0 F(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        return d0(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final androidx.media3.common.h0 d0(byte[] bArr, int i) {
        boolean z;
        g gVar;
        int i2;
        int i3;
        int iX0;
        i iVarI0;
        ArrayList arrayList = new ArrayList();
        v vVar = new v(bArr, i);
        boolean z2 = false;
        if (vVar.a() < 10) {
            androidx.media3.common.util.b.t("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = vVar.C();
            if (iC == 4801587) {
                int iZ = vVar.z();
                vVar.N(1);
                int iZ2 = vVar.z();
                int iY = vVar.y();
                if (iZ != 2) {
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = vVar.m();
                            vVar.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = vVar.y();
                            vVar.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    } else {
                        androidx.compose.runtime.j.x("Skipped ID3 tag with unsupported majorVersion=", iZ, "Id3Decoder");
                    }
                    if (iZ < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    gVar = new g(iZ, iY, z);
                } else if ((iZ2 & 64) != 0) {
                    androidx.media3.common.util.b.t("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZ < 4 || (iZ2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gVar = new g(iZ, iY, z);
                }
                if (gVar == null) {
                    return null;
                }
                i2 = gVar.a;
                int i4 = vVar.b;
                i3 = i2 == 2 ? 6 : 10;
                iX0 = gVar.c;
                if (gVar.b) {
                    iX0 = x0(iX0, vVar);
                }
                vVar.L(i4 + iX0);
                if (!y0(vVar, i2, i3, false)) {
                    if (i2 == 4 || !y0(vVar, 4, i3, true)) {
                        androidx.compose.runtime.j.x("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (vVar.a() >= i3) {
                    iVarI0 = i0(i2, vVar, z2, i3, this.m);
                    if (iVarI0 != null) {
                        arrayList.add(iVarI0);
                    }
                }
                return new androidx.media3.common.h0(arrayList);
            }
            androidx.media3.common.util.b.t("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
        }
        gVar = null;
        if (gVar == null) {
            return null;
        }
        i2 = gVar.a;
        int i5 = vVar.b;
        if (i2 == 2) {
        }
        iX0 = gVar.c;
        if (gVar.b) {
            iX0 = x0(iX0, vVar);
        }
        vVar.L(i5 + iX0);
        if (!y0(vVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            androidx.compose.runtime.j.x("Failed to validate ID3 tag with majorVersion=", i2, "Id3Decoder");
            return null;
        }
        while (vVar.a() >= i3) {
            iVarI0 = i0(i2, vVar, z2, i3, this.m);
            if (iVarI0 != null) {
                arrayList.add(iVarI0);
            }
        }
        return new androidx.media3.common.h0(arrayList);
    }
}
