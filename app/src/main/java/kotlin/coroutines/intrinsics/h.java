package kotlin.coroutines.intrinsics;

import androidx.core.view.r;
import java.util.Arrays;
import java.util.Stack;
import java.util.logging.Logger;
import kotlin.coroutines.j;
import kotlin.coroutines.k;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final void a(Logger logger, okhttp3.internal.concurrent.a aVar, okhttp3.internal.concurrent.c cVar, String str) {
        logger.fine(cVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static void b(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.d d(p pVar, Object obj, kotlin.coroutines.d dVar) {
        pVar.getClass();
        dVar.getClass();
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, dVar);
        }
        j context = dVar.getContext();
        return context == k.e ? new d(pVar, obj, dVar) : new e(dVar, context, pVar, obj);
    }

    public static final String e(long j) {
        String strP;
        if (j <= -999500000) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strP = androidx.privacysandbox.ads.adservices.java.internal.a.p((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strP}, 1));
    }

    public static kotlin.coroutines.d f(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d<Object> dVarIntercepted;
        dVar.getClass();
        kotlin.coroutines.jvm.internal.c cVar = dVar instanceof kotlin.coroutines.jvm.internal.c ? (kotlin.coroutines.jvm.internal.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:172:0x0253  */
    /* JADX WARN: Code duplicated, block: B:178:0x0268  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:201:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:215:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    public static String g(String str, String str2) throws org.schabi.newpipe.extractor.exceptions.f {
        boolean z;
        boolean z2;
        boolean z3;
        int iB;
        int iB2;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        r rVar;
        r rVar2;
        r rVar3;
        boolean z7;
        boolean z8;
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf < 0) {
            org.mozilla.javascript.typedarrays.c.b("Start not found");
            return null;
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        org.schabi.newpipe.extractor.utils.jsextractor.a aVar = new org.schabi.newpipe.extractor.utils.jsextractor.a(strSubstring);
        com.google.android.material.behavior.d dVar = new com.google.android.material.behavior.d(16, false);
        r[] rVarArr = (r[]) dVar.e;
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        boolean z9 = false;
        while (true) {
            int iC = aVar.c();
            while (true) {
                if (iC == 3 || iC == 94) {
                    iC = aVar.c();
                } else {
                    if (iC == 20 || iC == 62) {
                        r rVar4 = rVarArr[0];
                        if (rVar4 != null) {
                            z = true;
                            int i3 = rVar4.a;
                            boolean z10 = true;
                            switch (i3) {
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 27:
                                case 28:
                                case 29:
                                case Token.GETPROPNOWARN /* 34 */:
                                case 35:
                                case Token.GETPROPNOWARN_SUPER /* 36 */:
                                case Token.SETELEM /* 41 */:
                                case Token.SETELEM_SUPER /* 42 */:
                                case Token.NAME /* 44 */:
                                case Token.NUMBER /* 45 */:
                                case Token.STRING /* 46 */:
                                case Token.NULL /* 47 */:
                                case Token.THIS /* 48 */:
                                case Token.FALSE /* 49 */:
                                case Token.TRUE /* 50 */:
                                case Token.SHEQ /* 51 */:
                                case Token.SHNE /* 52 */:
                                case Token.REGEXP /* 53 */:
                                case Token.BINDNAME /* 54 */:
                                case Token.THROW /* 55 */:
                                case Token.RETHROW /* 56 */:
                                case Token.IN /* 57 */:
                                case Token.INSTANCEOF /* 58 */:
                                case Token.LOCAL_LOAD /* 59 */:
                                case 60:
                                case 61:
                                case Token.CATCH_SCOPE /* 62 */:
                                case Token.ENUM_INIT_KEYS /* 63 */:
                                case Token.ENUM_INIT_VALUES /* 64 */:
                                case Token.ENUM_INIT_ARRAY /* 65 */:
                                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                case Token.ENUM_NEXT /* 67 */:
                                case Token.ENUM_ID /* 68 */:
                                case Token.THISFN /* 69 */:
                                case Token.RETURN_RESULT /* 70 */:
                                case Token.ARRAYLIT /* 71 */:
                                case Token.LC /* 94 */:
                                case Token.RC /* 95 */:
                                case Token.RP /* 97 */:
                                    z10 = false;
                                case 4:
                                case 24:
                                case 25:
                                case 26:
                                case 30:
                                case 31:
                                case 32:
                                case Token.GETPROP /* 33 */:
                                case Token.SETPROP /* 37 */:
                                case Token.SETPROP_SUPER /* 38 */:
                                case Token.GETELEM /* 39 */:
                                case Token.GETELEM_SUPER /* 40 */:
                                case Token.CALL /* 43 */:
                                case Token.OBJECTLIT /* 72 */:
                                case Token.GET_REF /* 73 */:
                                case Token.SET_REF /* 74 */:
                                case Token.DEL_REF /* 75 */:
                                case Token.REF_CALL /* 76 */:
                                case Token.REF_SPECIAL /* 77 */:
                                case Token.YIELD /* 78 */:
                                case Token.SUPER /* 79 */:
                                case Token.STRICT_SETNAME /* 80 */:
                                case Token.EXP /* 81 */:
                                case Token.DEFAULTNAMESPACE /* 82 */:
                                case Token.ESCXMLATTR /* 83 */:
                                case Token.ESCXMLTEXT /* 84 */:
                                case Token.REF_MEMBER /* 85 */:
                                case Token.REF_NS_MEMBER /* 86 */:
                                case Token.REF_NAME /* 87 */:
                                case Token.REF_NS_NAME /* 88 */:
                                case 89:
                                case Token.TRY /* 90 */:
                                case Token.SEMI /* 91 */:
                                case Token.LB /* 92 */:
                                case Token.RB /* 93 */:
                                case Token.LP /* 96 */:
                                    if (z10) {
                                        if (i3 == 31) {
                                            z2 = false;
                                        }
                                    } else if (i3 == 50 && (rVar4 instanceof org.schabi.newpipe.extractor.utils.jsextractor.e)) {
                                        z2 = ((org.schabi.newpipe.extractor.utils.jsextractor.e) rVar4).c.b;
                                    } else if (i3 == 48 && (rVar4 instanceof org.schabi.newpipe.extractor.utils.jsextractor.c)) {
                                        org.schabi.newpipe.extractor.utils.jsextractor.b bVar = ((org.schabi.newpipe.extractor.utils.jsextractor.c) rVar4).c;
                                        if (bVar.a) {
                                            org.schabi.newpipe.extractor.utils.jsextractor.d dVar2 = bVar.b;
                                            if (dVar2 != null) {
                                                z2 = !dVar2.a;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                    } else if (!org.jsoup.a.c(i3) || i3 == 46) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        int i4 = aVar.k;
                                        aVar.c = 0;
                                        if (iC == 62) {
                                            aVar.a(61);
                                            z3 = z;
                                        } else {
                                            if (iC != 20) {
                                                Kit.codeBug();
                                            }
                                            z3 = z;
                                            iB = aVar.b(z3, false);
                                            aVar.i(iB);
                                            if (iB == 42) {
                                                aVar.l = aVar.j - 1;
                                                org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                return null;
                                            }
                                        }
                                        boolean z11 = false;
                                        while (true) {
                                            iB2 = aVar.b(z3, false);
                                            if (iB2 == 47 || z11) {
                                                if (iB2 != 10 || iB2 == -1) {
                                                    org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                    return null;
                                                }
                                                if (iB2 == 92) {
                                                    aVar.a(iB2);
                                                    iB2 = aVar.b(true, false);
                                                    if (iB2 == 10 || iB2 == -1) {
                                                        org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                                        return null;
                                                    }
                                                } else if (iB2 == 91) {
                                                    z11 = true;
                                                } else if (iB2 == 93) {
                                                    z11 = false;
                                                }
                                                aVar.a(iB2);
                                                z3 = true;
                                            } else {
                                                while (true) {
                                                    int iB3 = aVar.b(z3, z3);
                                                    if ("gimysu".indexOf(iB3) != -1) {
                                                        aVar.a(iB3);
                                                        z3 = true;
                                                    } else if (iB3 > 90) {
                                                        if (97 <= iB3 && iB3 <= 122) {
                                                            org.mozilla.javascript.typedarrays.c.b("msg.invalid.re.flag");
                                                            return null;
                                                        }
                                                        aVar.j(iB3);
                                                        aVar.l = i4 + aVar.c + 2;
                                                        iC = 36;
                                                    } else {
                                                        if (65 <= iB3) {
                                                            org.mozilla.javascript.typedarrays.c.b("msg.invalid.re.flag");
                                                            return null;
                                                        }
                                                        aVar.j(iB3);
                                                        aVar.l = i4 + aVar.c + 2;
                                                        iC = 36;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    throw null;
                            }
                        } else {
                            z = true;
                        }
                        z2 = z;
                        if (z2) {
                            int i5 = aVar.k;
                            aVar.c = 0;
                            if (iC == 62) {
                                aVar.a(61);
                                z3 = z;
                            } else {
                                if (iC != 20) {
                                    Kit.codeBug();
                                }
                                z3 = z;
                                iB = aVar.b(z3, false);
                                aVar.i(iB);
                                if (iB == 42) {
                                    aVar.l = aVar.j - 1;
                                    org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                    return null;
                                }
                            }
                            boolean z12 = false;
                            while (true) {
                                iB2 = aVar.b(z3, false);
                                if (iB2 == 47) {
                                }
                                if (iB2 != 10) {
                                }
                                org.mozilla.javascript.typedarrays.c.b("msg.unterminated.re.lit");
                                return null;
                                aVar.a(iB2);
                                z3 = true;
                            }
                        }
                    }
                    int i6 = aVar.k;
                    int i7 = aVar.l;
                    if (org.jsoup.a.c(iC)) {
                        org.schabi.newpipe.extractor.utils.jsextractor.d dVar3 = null;
                        switch (androidx.constraintlayout.core.g.e(iC)) {
                            case Token.STRING /* 46 */:
                                r rVar5 = rVarArr[0];
                                if (rVar5 != null) {
                                    int iE = androidx.constraintlayout.core.g.e(rVar5.a);
                                    if (iE == 3 || iE == 39) {
                                        z4 = true;
                                        rVar2 = rVarArr[1];
                                        if (rVar2 != null || rVar2.b == aVar.g) {
                                            z6 = false;
                                        }
                                    } else {
                                        if (iE == 46 || iE == 48) {
                                            z6 = false;
                                        } else if (iE != 65) {
                                            if (iE == 77) {
                                                z6 = false;
                                            } else if (iE != 95) {
                                                z6 = !org.jsoup.a.b(rVarArr[0].a);
                                            } else {
                                                z4 = true;
                                                rVar2 = rVarArr[1];
                                                if (rVar2 != null) {
                                                }
                                                z6 = false;
                                            }
                                        } else if (stack.isEmpty() || !((org.schabi.newpipe.extractor.utils.jsextractor.b) stack.lastElement()).a) {
                                            z6 = false;
                                        } else {
                                            z6 = true;
                                        }
                                        z4 = true;
                                    }
                                    rVar = rVarArr[0];
                                    if ((rVar instanceof org.schabi.newpipe.extractor.utils.jsextractor.e) && rVar.a == 50) {
                                        dVar3 = ((org.schabi.newpipe.extractor.utils.jsextractor.e) rVar).c;
                                    }
                                    org.schabi.newpipe.extractor.utils.jsextractor.b bVar2 = new org.schabi.newpipe.extractor.utils.jsextractor.b(z6, dVar3);
                                    stack.push(bVar2);
                                    i = 47;
                                    dVar.A(new org.schabi.newpipe.extractor.utils.jsextractor.c(47, aVar.g, bVar2));
                                    if (iC == i) {
                                        z9 = z4;
                                    } else {
                                        if (z9) {
                                            if (stack.isEmpty() || !stack2.isEmpty()) {
                                                z5 = false;
                                            } else {
                                                z5 = z4;
                                            }
                                            if (z5) {
                                                return strSubstring.substring(0, i7);
                                            }
                                        }
                                        if (iC != 2) {
                                            org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                            return null;
                                        }
                                    }
                                } else {
                                    z4 = true;
                                }
                                z6 = z4;
                                rVar = rVarArr[0];
                                if (rVar instanceof org.schabi.newpipe.extractor.utils.jsextractor.e) {
                                    dVar3 = ((org.schabi.newpipe.extractor.utils.jsextractor.e) rVar).c;
                                }
                                org.schabi.newpipe.extractor.utils.jsextractor.b bVar3 = new org.schabi.newpipe.extractor.utils.jsextractor.b(z6, dVar3);
                                stack.push(bVar3);
                                i = 47;
                                dVar.A(new org.schabi.newpipe.extractor.utils.jsextractor.c(47, aVar.g, bVar3));
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.NULL /* 47 */:
                                if (stack.isEmpty()) {
                                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.n(i6, "unmatched closing brace at "));
                                }
                                dVar.A(new org.schabi.newpipe.extractor.utils.jsextractor.c(48, aVar.g, (org.schabi.newpipe.extractor.utils.jsextractor.b) stack.pop()));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.THIS /* 48 */:
                                r rVar6 = rVarArr[0];
                                if (rVar6 == null || rVar6.a != 72) {
                                    r rVar7 = rVarArr[1];
                                    if (rVar7 != null && rVar7.a == 72 && (rVar3 = rVarArr[2]) != null) {
                                        int i8 = rVar3.a;
                                        z7 = org.jsoup.a.b(i8) || i8 == 4 || i8 == 78;
                                    }
                                } else {
                                    r rVar8 = rVarArr[1];
                                    if (rVar8 != null) {
                                        int i9 = rVar8.a;
                                        if (org.jsoup.a.b(i9) || i9 == 4 || i9 == 78) {
                                        }
                                    }
                                }
                                r rVar9 = rVarArr[0];
                                if (rVar9 == null) {
                                    z8 = false;
                                } else {
                                    int i10 = rVar9.a;
                                    if (i10 == 0) {
                                        throw null;
                                    }
                                    if (i10 == 75 || i10 == 82 || i10 == 80 || i10 == 86) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                }
                                org.schabi.newpipe.extractor.utils.jsextractor.d dVar4 = new org.schabi.newpipe.extractor.utils.jsextractor.d(z7, z8);
                                stack2.push(dVar4);
                                dVar.A(new org.schabi.newpipe.extractor.utils.jsextractor.e(49, aVar.g, dVar4));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            case Token.FALSE /* 49 */:
                                if (stack2.isEmpty()) {
                                    throw new org.schabi.newpipe.extractor.exceptions.f(androidx.privacysandbox.ads.adservices.java.internal.a.n(i6, "unmatched closing paren at "));
                                }
                                dVar.A(new org.schabi.newpipe.extractor.utils.jsextractor.e(50, aVar.g, (org.schabi.newpipe.extractor.utils.jsextractor.d) stack2.pop()));
                                i = 47;
                                z4 = true;
                                if (iC == i) {
                                    z9 = z4;
                                } else {
                                    if (z9) {
                                        if (stack.isEmpty()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            return strSubstring.substring(0, i7);
                                        }
                                    }
                                    if (iC != 2) {
                                        org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                                        return null;
                                    }
                                }
                                break;
                            default:
                                i2 = 94;
                                i = 47;
                                z4 = true;
                                break;
                        }
                    } else {
                        i = 47;
                        z4 = true;
                        i2 = 94;
                    }
                    if (iC != i2) {
                        dVar.A(new r(iC, aVar.g));
                    }
                    if (iC == i) {
                        z9 = z4;
                    } else {
                        if (z9) {
                            if (stack.isEmpty()) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                return strSubstring.substring(0, i7);
                            }
                        }
                        if (iC != 2) {
                            org.mozilla.javascript.typedarrays.c.b("Could not find matching braces");
                            return null;
                        }
                    }
                }
            }
        }
    }

    public static Object h(p pVar, Object obj, kotlin.coroutines.d dVar) {
        pVar.getClass();
        dVar.getClass();
        j context = dVar.getContext();
        Object fVar = context == k.e ? new f(dVar) : new g(dVar, context);
        c0.c(2, pVar);
        return pVar.invoke(obj, fVar);
    }
}
