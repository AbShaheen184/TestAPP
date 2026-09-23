package androidx.compose.foundation.gestures;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    public final /* synthetic */ r2 a;

    public q2(r2 r2Var) {
        this.a = r2Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234  */
    /* JADX WARN: Code duplicated, block: B:113:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x0245  */
    /* JADX WARN: Code duplicated, block: B:119:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x026b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:134:0x027b  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x030d  */
    /* JADX WARN: Code duplicated, block: B:168:0x031e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0322  */
    /* JADX WARN: Code duplicated, block: B:171:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x0332  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:182:0x034f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0360  */
    /* JADX WARN: Code duplicated, block: B:185:0x0364  */
    /* JADX WARN: Code duplicated, block: B:187:0x0369  */
    /* JADX WARN: Code duplicated, block: B:191:0x0374  */
    /* JADX WARN: Code duplicated, block: B:193:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x037c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0380  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        char c;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        androidx.compose.foundation.w0 w0Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        androidx.compose.foundation.w0 w0Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        androidx.compose.foundation.w0 w0Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        r2 r2Var = this.a;
        r2Var.j = i;
        androidx.compose.foundation.n nVar = r2Var.b;
        if (nVar == null || !(r2Var.a.d() || r2Var.a.b())) {
            return r2Var.c(r2Var.k, j, i);
        }
        int i5 = r2Var.j;
        androidx.activity.compose.g gVar = r2Var.m;
        androidx.compose.foundation.q0 q0Var = nVar.c;
        if (androidx.compose.ui.geometry.e.e(nVar.g)) {
            r2 r2Var2 = (r2) gVar.y;
            return new androidx.compose.ui.geometry.b(r2Var2.c(r2Var2.k, j, r2Var2.j)).a;
        }
        if (!nVar.f) {
            if (androidx.compose.foundation.q0.g(q0Var.f)) {
                nVar.f(0L);
            }
            if (androidx.compose.foundation.q0.g(q0Var.g)) {
                nVar.g(0L);
            }
            if (androidx.compose.foundation.q0.g(q0Var.d)) {
                nVar.h(0L);
            }
            if (androidx.compose.foundation.q0.g(q0Var.e)) {
                nVar.e(0L);
            }
            nVar.f = true;
        }
        int i6 = androidx.compose.foundation.p.a;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jF = androidx.compose.ui.geometry.b.f(f4, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!androidx.compose.foundation.q0.g(q0Var.d) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (androidx.compose.foundation.q0.g(q0Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                    float fE = nVar.e(jF);
                    if (!androidx.compose.foundation.q0.g(q0Var.e)) {
                        q0Var.b().finish();
                    }
                    jF = jF;
                    fIntBitsToFloat = fE == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : fE / f4;
                }
            } else {
                float fH = nVar.h(jF);
                j2 = 4294967295L;
                if (!androidx.compose.foundation.q0.g(q0Var.d)) {
                    q0Var.e().finish();
                }
                fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : fH / f4;
                jF = jF;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) == 0.0f) {
                if (androidx.compose.foundation.q0.g(q0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    long j3 = jF;
                    c = ' ';
                    if (!androidx.compose.foundation.q0.g(q0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                        float fG = nVar.g(j3);
                        if (!androidx.compose.foundation.q0.g(q0Var.g)) {
                            q0Var.d().finish();
                        }
                        fIntBitsToFloat2 = fG == Float.intBitsToFloat((int) (j3 >> 32)) ? Float.intBitsToFloat(i2) : fG / f4;
                    }
                } else {
                    long j4 = jF;
                    float f5 = nVar.f(j4);
                    c = ' ';
                    if (!androidx.compose.foundation.q0.g(q0Var.f)) {
                        q0Var.c().finish();
                    }
                    fIntBitsToFloat2 = f5 == Float.intBitsToFloat((int) (j4 >> 32)) ? Float.intBitsToFloat(i2) : f5 / f4;
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c);
                if (!androidx.compose.ui.geometry.b.b(jFloatToRawIntBits, 0L)) {
                    nVar.d();
                }
                jD = androidx.compose.ui.geometry.b.d(j, jFloatToRawIntBits);
                r2 r2Var3 = (r2) gVar.y;
                long j5 = new androidx.compose.ui.geometry.b(r2Var3.c(r2Var3.k, jD, r2Var3.j)).a;
                jD2 = androidx.compose.ui.geometry.b.d(jD, j5);
                if ((Float.intBitsToFloat((int) (jD >> c)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j5 >> c)) != 0.0f || Float.intBitsToFloat((int) (j5 & j2)) != 0.0f) && (androidx.compose.foundation.q0.g(q0Var.f) || androidx.compose.foundation.q0.g(q0Var.d) || androidx.compose.foundation.q0.g(q0Var.g) || androidx.compose.foundation.q0.g(q0Var.e)))) {
                    nVar.a();
                }
                if (i5 == 1) {
                    i3 = (int) (jD2 >> c);
                    if (Float.intBitsToFloat(i3) > 0.5f) {
                        nVar.f(jD2);
                    } else {
                        if (Float.intBitsToFloat(i3) < -0.5f) {
                            nVar.g(jD2);
                        } else {
                            z3 = false;
                        }
                        i4 = (int) (jD2 & j2);
                        if (Float.intBitsToFloat(i4) > 0.5f) {
                            nVar.h(jD2);
                        } else {
                            if (Float.intBitsToFloat(i4) < -0.5f) {
                                nVar.e(jD2);
                            } else {
                                z4 = false;
                            }
                            if (!z3 || z4) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        z4 = true;
                        if (z3) {
                        }
                        z = true;
                    }
                    z3 = true;
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        nVar.h(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            nVar.e(jD2);
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                        }
                        z = true;
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!androidx.compose.ui.geometry.b.b(jD, 0L)) {
                    if (androidx.compose.foundation.q0.f(q0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                        zF = false;
                    } else {
                        EdgeEffect edgeEffectC = q0Var.c();
                        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                        if (edgeEffectC instanceof androidx.compose.foundation.w0) {
                            androidx.compose.foundation.w0 w0Var4 = (androidx.compose.foundation.w0) edgeEffectC;
                            float f6 = w0Var4.b + fIntBitsToFloat6;
                            w0Var4.b = f6;
                            if (Math.abs(f6) > w0Var4.a) {
                                w0Var4.onRelease();
                            }
                        } else {
                            edgeEffectC.onRelease();
                        }
                        zF = androidx.compose.foundation.q0.f(q0Var.f);
                    }
                    if (androidx.compose.foundation.q0.f(q0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                        edgeEffectD = q0Var.d();
                        fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                        if (edgeEffectD instanceof androidx.compose.foundation.w0) {
                            w0Var3 = (androidx.compose.foundation.w0) edgeEffectD;
                            f3 = w0Var3.b + fIntBitsToFloat5;
                            w0Var3.b = f3;
                            if (Math.abs(f3) > w0Var3.a) {
                                w0Var3.onRelease();
                            }
                        } else {
                            edgeEffectD.onRelease();
                        }
                        if (!zF || androidx.compose.foundation.q0.f(q0Var.g)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (androidx.compose.foundation.q0.f(q0Var.d) && Float.intBitsToFloat(i7) < 0.0f) {
                        edgeEffectE = q0Var.e();
                        fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                        if (edgeEffectE instanceof androidx.compose.foundation.w0) {
                            w0Var2 = (androidx.compose.foundation.w0) edgeEffectE;
                            f2 = w0Var2.b + fIntBitsToFloat4;
                            w0Var2.b = f2;
                            if (Math.abs(f2) > w0Var2.a) {
                                w0Var2.onRelease();
                            }
                        } else {
                            edgeEffectE.onRelease();
                        }
                        if (!zF || androidx.compose.foundation.q0.f(q0Var.d)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (androidx.compose.foundation.q0.f(q0Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                        edgeEffectB = q0Var.b();
                        fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                        if (edgeEffectB instanceof androidx.compose.foundation.w0) {
                            w0Var = (androidx.compose.foundation.w0) edgeEffectB;
                            f = w0Var.b + fIntBitsToFloat3;
                            w0Var.b = f;
                            if (Math.abs(f) > w0Var.a) {
                                w0Var.onRelease();
                            }
                        } else {
                            edgeEffectB.onRelease();
                        }
                        if (!zF || androidx.compose.foundation.q0.f(q0Var.e)) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    }
                    if (!zF || z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2;
                }
                if (z) {
                    nVar.d();
                }
                return androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j5);
            }
            c = ' ';
            fIntBitsToFloat2 = 0.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c);
            if (!androidx.compose.ui.geometry.b.b(jFloatToRawIntBits, 0L)) {
                nVar.d();
            }
            jD = androidx.compose.ui.geometry.b.d(j, jFloatToRawIntBits);
            r2 r2Var4 = (r2) gVar.y;
            long j6 = new androidx.compose.ui.geometry.b(r2Var4.c(r2Var4.k, jD, r2Var4.j)).a;
            jD2 = androidx.compose.ui.geometry.b.d(jD, j6);
            if (Float.intBitsToFloat((int) (jD >> c)) == 0.0f) {
                nVar.a();
            } else {
                nVar.a();
            }
            if (i5 == 1) {
                i3 = (int) (jD2 >> c);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    nVar.f(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        nVar.g(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        nVar.h(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            nVar.e(jD2);
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                        }
                        z = true;
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    nVar.h(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        nVar.e(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!androidx.compose.ui.geometry.b.b(jD, 0L)) {
                if (androidx.compose.foundation.q0.f(q0Var.f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (androidx.compose.foundation.q0.f(q0Var.g)) {
                    edgeEffectD = q0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof androidx.compose.foundation.w0) {
                        w0Var3 = (androidx.compose.foundation.w0) edgeEffectD;
                        f3 = w0Var3.b + fIntBitsToFloat5;
                        w0Var3.b = f3;
                        if (Math.abs(f3) > w0Var3.a) {
                            w0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (androidx.compose.foundation.q0.f(q0Var.d)) {
                    edgeEffectE = q0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectE instanceof androidx.compose.foundation.w0) {
                        w0Var2 = (androidx.compose.foundation.w0) edgeEffectE;
                        f2 = w0Var2.b + fIntBitsToFloat4;
                        w0Var2.b = f2;
                        if (Math.abs(f2) > w0Var2.a) {
                            w0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (androidx.compose.foundation.q0.f(q0Var.e)) {
                    edgeEffectB = q0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectB instanceof androidx.compose.foundation.w0) {
                        w0Var = (androidx.compose.foundation.w0) edgeEffectB;
                        f = w0Var.b + fIntBitsToFloat3;
                        w0Var.b = f;
                        if (Math.abs(f) > w0Var.a) {
                            w0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                z = z2;
            }
            if (z) {
                nVar.d();
            }
            return androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j6);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            if (androidx.compose.foundation.q0.g(q0Var.f)) {
                long j7 = jF;
                c = ' ';
                if (!androidx.compose.foundation.q0.g(q0Var.g)) {
                }
            } else {
                long j8 = jF;
                c = ' ';
                if (!androidx.compose.foundation.q0.g(q0Var.g)) {
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c);
            if (!androidx.compose.ui.geometry.b.b(jFloatToRawIntBits, 0L)) {
                nVar.d();
            }
            jD = androidx.compose.ui.geometry.b.d(j, jFloatToRawIntBits);
            r2 r2Var5 = (r2) gVar.y;
            long j9 = new androidx.compose.ui.geometry.b(r2Var5.c(r2Var5.k, jD, r2Var5.j)).a;
            jD2 = androidx.compose.ui.geometry.b.d(jD, j9);
            if (Float.intBitsToFloat((int) (jD >> c)) == 0.0f) {
                nVar.a();
            } else {
                nVar.a();
            }
            if (i5 == 1) {
                i3 = (int) (jD2 >> c);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    nVar.f(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        nVar.g(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        nVar.h(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            nVar.e(jD2);
                        } else {
                            z4 = false;
                        }
                        if (z3) {
                        }
                        z = true;
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    nVar.h(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        nVar.e(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!androidx.compose.ui.geometry.b.b(jD, 0L)) {
                if (androidx.compose.foundation.q0.f(q0Var.f)) {
                    zF = false;
                } else {
                    zF = false;
                }
                if (androidx.compose.foundation.q0.f(q0Var.g)) {
                    edgeEffectD = q0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof androidx.compose.foundation.w0) {
                        w0Var3 = (androidx.compose.foundation.w0) edgeEffectD;
                        f3 = w0Var3.b + fIntBitsToFloat5;
                        w0Var3.b = f3;
                        if (Math.abs(f3) > w0Var3.a) {
                            w0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (androidx.compose.foundation.q0.f(q0Var.d)) {
                    edgeEffectE = q0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectE instanceof androidx.compose.foundation.w0) {
                        w0Var2 = (androidx.compose.foundation.w0) edgeEffectE;
                        f2 = w0Var2.b + fIntBitsToFloat4;
                        w0Var2.b = f2;
                        if (Math.abs(f2) > w0Var2.a) {
                            w0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (androidx.compose.foundation.q0.f(q0Var.e)) {
                    edgeEffectB = q0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectB instanceof androidx.compose.foundation.w0) {
                        w0Var = (androidx.compose.foundation.w0) edgeEffectB;
                        f = w0Var.b + fIntBitsToFloat3;
                        w0Var.b = f;
                        if (Math.abs(f) > w0Var.a) {
                            w0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (zF) {
                        zF = true;
                    } else {
                        zF = true;
                    }
                }
                if (zF) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                z = z2;
            }
            if (z) {
                nVar.d();
            }
            return androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j9);
        }
        c = ' ';
        fIntBitsToFloat2 = 0.0f;
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c);
        if (!androidx.compose.ui.geometry.b.b(jFloatToRawIntBits, 0L)) {
            nVar.d();
        }
        jD = androidx.compose.ui.geometry.b.d(j, jFloatToRawIntBits);
        r2 r2Var6 = (r2) gVar.y;
        long j10 = new androidx.compose.ui.geometry.b(r2Var6.c(r2Var6.k, jD, r2Var6.j)).a;
        jD2 = androidx.compose.ui.geometry.b.d(jD, j10);
        if (Float.intBitsToFloat((int) (jD >> c)) == 0.0f) {
            nVar.a();
        } else {
            nVar.a();
        }
        if (i5 == 1) {
            i3 = (int) (jD2 >> c);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                nVar.f(jD2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    nVar.g(jD2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    nVar.h(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        nVar.e(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jD2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                nVar.h(jD2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    nVar.e(jD2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!androidx.compose.ui.geometry.b.b(jD, 0L)) {
            if (androidx.compose.foundation.q0.f(q0Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (androidx.compose.foundation.q0.f(q0Var.g)) {
                edgeEffectD = q0Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof androidx.compose.foundation.w0) {
                    w0Var3 = (androidx.compose.foundation.w0) edgeEffectD;
                    f3 = w0Var3.b + fIntBitsToFloat5;
                    w0Var3.b = f3;
                    if (Math.abs(f3) > w0Var3.a) {
                        w0Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (androidx.compose.foundation.q0.f(q0Var.d)) {
                edgeEffectE = q0Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectE instanceof androidx.compose.foundation.w0) {
                    w0Var2 = (androidx.compose.foundation.w0) edgeEffectE;
                    f2 = w0Var2.b + fIntBitsToFloat4;
                    w0Var2.b = f2;
                    if (Math.abs(f2) > w0Var2.a) {
                        w0Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (androidx.compose.foundation.q0.f(q0Var.e)) {
                edgeEffectB = q0Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectB instanceof androidx.compose.foundation.w0) {
                    w0Var = (androidx.compose.foundation.w0) edgeEffectB;
                    f = w0Var.b + fIntBitsToFloat3;
                    w0Var.b = f;
                    if (Math.abs(f) > w0Var.a) {
                        w0Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            nVar.d();
        }
        return androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j10);
    }
}
