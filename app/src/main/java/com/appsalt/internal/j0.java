package com.appsalt.internal;

import android.os.Build;
import com.google.protobuf.ByteString;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 b = new j0(0);
    public static final j0 c = new j0(1);
    public static final j0 d = new j0(2);
    public static final j0 e = new j0(3);
    public final /* synthetic */ int a;

    public /* synthetic */ j0(int i) {
        this.a = i;
    }

    public static int a(int i) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return 1;
        }
        if (iE == 1) {
            return 2;
        }
        if (iE == 2) {
            return 3;
        }
        coil3.g.a();
        return 0;
    }

    public static int c(int i) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return 1;
        }
        if (iE == 1) {
            return 2;
        }
        if (iE == 2) {
            return 3;
        }
        coil3.g.a();
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x054a  */
    /* JADX WARN: Code duplicated, block: B:122:0x054c  */
    /* JADX WARN: Code duplicated, block: B:123:0x054e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0551  */
    /* JADX WARN: Code duplicated, block: B:125:0x0554  */
    /* JADX WARN: Code duplicated, block: B:126:0x0557  */
    /* JADX WARN: Code duplicated, block: B:127:0x0559  */
    /* JADX WARN: Code duplicated, block: B:128:0x055b  */
    /* JADX WARN: Code duplicated, block: B:129:0x055d  */
    /* JADX WARN: Code duplicated, block: B:130:0x055f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0561  */
    public byte[] b(h2 h2Var) {
        int i;
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                b1 b1VarE = c5.e();
                String str = h2Var.a;
                b1VarE.c();
                c5 c5Var = (c5) b1VarE.y;
                c5Var.getClass();
                str.getClass();
                c5Var.id_ = str;
                p3 p3Var = h2Var.c;
                char c2 = 5;
                char c3 = 4;
                if (p3Var instanceof p2) {
                    p2 p2Var = (p2) p3Var;
                    g2 g2Var = p2Var.b;
                    s2 s2VarN = o3.n();
                    String str2 = p2Var.a;
                    s2VarN.c();
                    o3 o3Var = (o3) s2VarN.y;
                    o3Var.getClass();
                    o3Var.uid_ = str2;
                    s2VarN.c();
                    o3 o3Var2 = (o3) s2VarN.y;
                    o3Var2.getClass();
                    o3Var2.cid_ = "HASDKANKTLKTLWQ251023PA";
                    s2VarN.c();
                    o3 o3Var3 = (o3) s2VarN.y;
                    o3Var3.getClass();
                    o3Var3.version_ = "1.5.0-SNAPSHOT";
                    s2VarN.c();
                    o3 o3Var4 = (o3) s2VarN.y;
                    o3Var4.getClass();
                    switch (5) {
                        case 1:
                            i2 = 0;
                            break;
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                            i2 = 3;
                            break;
                        case 5:
                            i2 = 4;
                            break;
                        case 6:
                            i2 = -1;
                            break;
                        default:
                            throw null;
                    }
                    o3Var4.protocol_ = i2;
                    k2 k2VarD = n2.d();
                    String str3 = g2Var.a;
                    k2VarD.c();
                    n2 n2Var = (n2) k2VarD.y;
                    n2Var.getClass();
                    str3.getClass();
                    n2Var.name_ = str3;
                    String str4 = g2Var.b;
                    k2VarD.c();
                    n2 n2Var2 = (n2) k2VarD.y;
                    n2Var2.getClass();
                    str4.getClass();
                    n2Var2.package_ = str4;
                    s2VarN.c();
                    o3 o3Var5 = (o3) s2VarN.y;
                    n2 n2Var3 = (n2) k2VarD.a();
                    o3Var5.getClass();
                    o3Var5.applicationData_ = n2Var3;
                    o3Var5.bitField0_ |= 1;
                    d3 d3VarD = h3.d();
                    d3VarD.c();
                    h3 h3Var = (h3) d3VarD.y;
                    h3Var.getClass();
                    h3Var.name_ = "android";
                    String str5 = Build.VERSION.RELEASE;
                    d3VarD.c();
                    h3 h3Var2 = (h3) d3VarD.y;
                    h3Var2.getClass();
                    str5.getClass();
                    h3Var2.version_ = Build.VERSION.RELEASE;
                    s2VarN.c();
                    o3 o3Var6 = (o3) s2VarN.y;
                    h3 h3Var3 = (h3) d3VarD.a();
                    o3Var6.getClass();
                    o3Var6.osData_ = h3Var3;
                    o3Var6.bitField0_ |= 2;
                    Object obj = p2Var.d;
                    s2VarN.c();
                    o3 o3Var7 = (o3) s2VarN.y;
                    if (!o3Var7.optional_.isMutable()) {
                        o3Var7.optional_ = o3Var7.optional_.mutableCopy();
                    }
                    o3Var7.optional_.putAll(obj);
                    String str6 = p2Var.e;
                    s2VarN.c();
                    o3 o3Var8 = (o3) s2VarN.y;
                    o3Var8.getClass();
                    str6.getClass();
                    o3Var8.sid_ = str6;
                    u2 u2VarH = w2.h();
                    u2VarH.c();
                    ((w2) u2VarH.y).tcp_ = true;
                    u2VarH.c();
                    ((w2) u2VarH.y).udp_ = true;
                    u2VarH.c();
                    ((w2) u2VarH.y).reconnect_ = true;
                    u2VarH.c();
                    ((w2) u2VarH.y).ipVersion_ = true;
                    u2VarH.c();
                    ((w2) u2VarH.y).targetBlacklist_ = true;
                    u2VarH.c();
                    ((w2) u2VarH.y).connectionInfo_ = true;
                    s2VarN.c();
                    o3 o3Var9 = (o3) s2VarN.y;
                    w2 w2Var = (w2) u2VarH.a();
                    o3Var9.getClass();
                    o3Var9.features_ = w2Var;
                    o3Var9.bitField0_ |= 4;
                    b1VarE.c();
                    c5 c5Var2 = (c5) b1VarE.y;
                    o3 o3Var10 = (o3) s2VarN.a();
                    c5Var2.getClass();
                    c5Var2.message_ = o3Var10;
                    c5Var2.messageCase_ = 2;
                } else {
                    if (p3Var instanceof y2) {
                        y2 y2Var = (y2) p3Var;
                        s3 s3VarI = x3.i();
                        int iA = a(y2Var.f);
                        s3VarI.c();
                        x3 x3Var = (x3) s3VarI.y;
                        x3Var.getClass();
                        x3Var.isIdle_ = androidx.room.b0.b(iA);
                        int iA2 = a(y2Var.g);
                        s3VarI.c();
                        x3 x3Var2 = (x3) s3VarI.y;
                        x3Var2.getClass();
                        x3Var2.isMetered_ = androidx.room.b0.b(iA2);
                        int iA3 = a(y2Var.c);
                        s3VarI.c();
                        x3 x3Var3 = (x3) s3VarI.y;
                        x3Var3.getClass();
                        x3Var3.isPlugged_ = androidx.room.b0.b(iA3);
                        int iA4 = a(y2Var.e);
                        s3VarI.c();
                        x3 x3Var4 = (x3) s3VarI.y;
                        x3Var4.getClass();
                        x3Var4.isRoaming_ = androidx.room.b0.b(iA4);
                        Integer num = y2Var.d;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            s3VarI.c();
                            ((x3) s3VarI.y).batteryLevel_ = iIntValue;
                        }
                        Integer num2 = y2Var.b;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            s3VarI.c();
                            ((x3) s3VarI.y).signalStrength_ = iIntValue2;
                        }
                        int i4 = y2Var.a;
                        int i5 = i4 != 0 ? f0.b[androidx.constraintlayout.core.g.e(i4)] : -1;
                        if (i5 == 2) {
                            c3 = 2;
                        } else if (i5 == 3) {
                            c3 = 3;
                        } else if (i5 != 4) {
                            c3 = 1;
                        }
                        s3VarI.c();
                        x3 x3Var5 = (x3) s3VarI.y;
                        x3Var5.getClass();
                        int i6 = 1;
                        if (c3 != 1) {
                            int i7 = 2;
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    i7 = 5;
                                    if (c3 != 4) {
                                        throw null;
                                    }
                                }
                                i6 = i7;
                            }
                        } else {
                            i6 = 0;
                        }
                        x3Var5.networkType_ = i6;
                        b1VarE.c();
                        c5 c5Var3 = (c5) b1VarE.y;
                        x3 x3Var6 = (x3) s3VarI.a();
                        c5Var3.getClass();
                        c5Var3.message_ = x3Var6;
                        c5Var3.messageCase_ = 3;
                    } else if (p3Var instanceof x0) {
                        l1 l1VarD = s1.d();
                        x0 x0Var = (x0) p3Var;
                        String str7 = x0Var.a;
                        l1VarD.c();
                        s1 s1Var = (s1) l1VarD.y;
                        s1Var.getClass();
                        str7.getClass();
                        s1Var.proxyId_ = str7;
                        int i8 = x0Var.b;
                        switch (i8 != 0 ? f0.a[androidx.constraintlayout.core.g.e(i8)] : -1) {
                            case -1:
                            case 1:
                                c2 = 1;
                                l1VarD.c();
                                s1 s1Var2 = (s1) l1VarD.y;
                                s1Var2.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var2.reason_ = i;
                                b1VarE.c();
                                c5 c5Var4 = (c5) b1VarE.y;
                                s1 s1Var3 = (s1) l1VarD.a();
                                c5Var4.getClass();
                                c5Var4.message_ = s1Var3;
                                c5Var4.messageCase_ = 4;
                                break;
                            case 0:
                            default:
                                coil3.g.a();
                                return null;
                            case 2:
                                c2 = 2;
                                l1VarD.c();
                                s1 s1Var4 = (s1) l1VarD.y;
                                s1Var4.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var4.reason_ = i;
                                b1VarE.c();
                                c5 c5Var5 = (c5) b1VarE.y;
                                s1 s1Var5 = (s1) l1VarD.a();
                                c5Var5.getClass();
                                c5Var5.message_ = s1Var5;
                                c5Var5.messageCase_ = 4;
                                break;
                            case 3:
                                c2 = 3;
                                l1VarD.c();
                                s1 s1Var6 = (s1) l1VarD.y;
                                s1Var6.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var6.reason_ = i;
                                b1VarE.c();
                                c5 c5Var6 = (c5) b1VarE.y;
                                s1 s1Var7 = (s1) l1VarD.a();
                                c5Var6.getClass();
                                c5Var6.message_ = s1Var7;
                                c5Var6.messageCase_ = 4;
                                break;
                            case 4:
                                c2 = 4;
                                l1VarD.c();
                                s1 s1Var8 = (s1) l1VarD.y;
                                s1Var8.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var8.reason_ = i;
                                b1VarE.c();
                                c5 c5Var7 = (c5) b1VarE.y;
                                s1 s1Var9 = (s1) l1VarD.a();
                                c5Var7.getClass();
                                c5Var7.message_ = s1Var9;
                                c5Var7.messageCase_ = 4;
                                break;
                            case 5:
                                l1VarD.c();
                                s1 s1Var10 = (s1) l1VarD.y;
                                s1Var10.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var10.reason_ = i;
                                b1VarE.c();
                                c5 c5Var8 = (c5) b1VarE.y;
                                s1 s1Var11 = (s1) l1VarD.a();
                                c5Var8.getClass();
                                c5Var8.message_ = s1Var11;
                                c5Var8.messageCase_ = 4;
                                break;
                            case 6:
                                c2 = 6;
                                l1VarD.c();
                                s1 s1Var12 = (s1) l1VarD.y;
                                s1Var12.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var12.reason_ = i;
                                b1VarE.c();
                                c5 c5Var9 = (c5) b1VarE.y;
                                s1 s1Var13 = (s1) l1VarD.a();
                                c5Var9.getClass();
                                c5Var9.message_ = s1Var13;
                                c5Var9.messageCase_ = 4;
                                break;
                            case 7:
                                c2 = 7;
                                l1VarD.c();
                                s1 s1Var14 = (s1) l1VarD.y;
                                s1Var14.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var14.reason_ = i;
                                b1VarE.c();
                                c5 c5Var10 = (c5) b1VarE.y;
                                s1 s1Var15 = (s1) l1VarD.a();
                                c5Var10.getClass();
                                c5Var10.message_ = s1Var15;
                                c5Var10.messageCase_ = 4;
                                break;
                            case 8:
                                c2 = '\b';
                                l1VarD.c();
                                s1 s1Var16 = (s1) l1VarD.y;
                                s1Var16.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var16.reason_ = i;
                                b1VarE.c();
                                c5 c5Var11 = (c5) b1VarE.y;
                                s1 s1Var17 = (s1) l1VarD.a();
                                c5Var11.getClass();
                                c5Var11.message_ = s1Var17;
                                c5Var11.messageCase_ = 4;
                                break;
                            case 9:
                                c2 = '\t';
                                l1VarD.c();
                                s1 s1Var18 = (s1) l1VarD.y;
                                s1Var18.getClass();
                                switch (c2) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 5;
                                        break;
                                    case 5:
                                        i = 6;
                                        break;
                                    case 6:
                                        i = 7;
                                        break;
                                    case 7:
                                        i = 9;
                                        break;
                                    case '\b':
                                        i = 10;
                                        break;
                                    case '\t':
                                        i = 11;
                                        break;
                                    case '\n':
                                        i = -1;
                                        break;
                                    default:
                                        throw null;
                                }
                                s1Var18.reason_ = i;
                                b1VarE.c();
                                c5 c5Var12 = (c5) b1VarE.y;
                                s1 s1Var19 = (s1) l1VarD.a();
                                c5Var12.getClass();
                                c5Var12.message_ = s1Var19;
                                c5Var12.messageCase_ = 4;
                                break;
                        }
                    } else if (p3Var instanceof m1) {
                        w1 w1VarG = f2.g();
                        m1 m1Var = (m1) p3Var;
                        String str8 = m1Var.a;
                        w1VarG.c();
                        f2 f2Var = (f2) w1VarG.y;
                        f2Var.getClass();
                        str8.getClass();
                        f2Var.proxyId_ = str8;
                        ByteString byteStringCopyFrom = ByteString.copyFrom(m1Var.b);
                        w1VarG.c();
                        f2 f2Var2 = (f2) w1VarG.y;
                        f2Var2.getClass();
                        byteStringCopyFrom.getClass();
                        f2Var2.ip_ = byteStringCopyFrom;
                        int i9 = m1Var.e;
                        w1VarG.c();
                        ((f2) w1VarG.y).connectTime_ = i9;
                        int i10 = m1Var.d;
                        w1VarG.c();
                        ((f2) w1VarG.y).dnsLookupTime_ = i10;
                        int iE = androidx.constraintlayout.core.g.e(m1Var.c);
                        if (iE == 0) {
                            c3 = 2;
                        } else if (iE == 1) {
                            c3 = 3;
                        } else if (iE != 2) {
                            c3 = 1;
                        }
                        w1VarG.c();
                        f2 f2Var3 = (f2) w1VarG.y;
                        f2Var3.getClass();
                        int i11 = 1;
                        if (c3 == 1) {
                            i11 = 0;
                        } else if (c3 != 2) {
                            i11 = 3;
                            if (c3 == 3) {
                                i11 = 2;
                            } else if (c3 != 4) {
                                throw null;
                            }
                        }
                        f2Var3.dnsResolveType_ = i11;
                        b1VarE.c();
                        c5 c5Var13 = (c5) b1VarE.y;
                        f2 f2Var4 = (f2) w1VarG.a();
                        c5Var13.getClass();
                        c5Var13.message_ = f2Var4;
                        c5Var13.messageCase_ = 5;
                    } else if (p3Var instanceof u0) {
                        d1 d1VarD = i1.d();
                        u0 u0Var = (u0) p3Var;
                        String str9 = u0Var.a;
                        d1VarD.c();
                        i1 i1Var = (i1) d1VarD.y;
                        i1Var.getClass();
                        str9.getClass();
                        i1Var.proxyId_ = str9;
                        ByteString byteStringCopyFrom2 = ByteString.copyFrom(u0Var.b);
                        d1VarD.c();
                        i1 i1Var2 = (i1) d1VarD.y;
                        i1Var2.getClass();
                        byteStringCopyFrom2.getClass();
                        i1Var2.payload_ = byteStringCopyFrom2;
                        b1VarE.c();
                        c5 c5Var14 = (c5) b1VarE.y;
                        i1 i1Var3 = (i1) d1VarD.a();
                        c5Var14.getClass();
                        c5Var14.message_ = i1Var3;
                        c5Var14.messageCase_ = 6;
                    } else {
                        b1VarE = null;
                    }
                }
                if (b1VarE != null) {
                    return ((c5) b1VarE.a()).toByteArray();
                }
                return null;
            default:
                w4 w4VarE = c0.e();
                String str10 = h2Var.a;
                w4VarE.c();
                c0 c0Var = (c0) w4VarE.y;
                c0Var.getClass();
                str10.getClass();
                c0Var.id_ = str10;
                p3 p3Var2 = h2Var.c;
                char c4 = 4;
                if (p3Var2 instanceof p2) {
                    p2 p2Var2 = (p2) p3Var2;
                    g2 g2Var2 = p2Var2.b;
                    i5 i5VarN = k.n();
                    String str11 = p2Var2.a;
                    i5VarN.c();
                    k kVar = (k) i5VarN.y;
                    kVar.getClass();
                    kVar.uid_ = str11;
                    i5VarN.c();
                    k kVar2 = (k) i5VarN.y;
                    kVar2.getClass();
                    kVar2.cid_ = "HASDKANKTLKTLWQ251023PA";
                    i5VarN.c();
                    k kVar3 = (k) i5VarN.y;
                    kVar3.getClass();
                    kVar3.version_ = "1.5.0-SNAPSHOT";
                    i5VarN.c();
                    k kVar4 = (k) i5VarN.y;
                    kVar4.getClass();
                    switch (5) {
                        case 1:
                            i3 = 0;
                            break;
                        case 2:
                            i3 = 1;
                            break;
                        case 3:
                            i3 = 2;
                            break;
                        case 4:
                            i3 = 3;
                            break;
                        case 5:
                            i3 = 4;
                            break;
                        case 6:
                            i3 = -1;
                            break;
                        default:
                            throw null;
                    }
                    kVar4.protocol_ = i3;
                    a5 a5VarD = f5.d();
                    String str12 = g2Var2.a;
                    a5VarD.c();
                    f5 f5Var = (f5) a5VarD.y;
                    f5Var.getClass();
                    str12.getClass();
                    f5Var.name_ = str12;
                    String str13 = g2Var2.b;
                    a5VarD.c();
                    f5 f5Var2 = (f5) a5VarD.y;
                    f5Var2.getClass();
                    str13.getClass();
                    f5Var2.package_ = str13;
                    i5VarN.c();
                    k kVar5 = (k) i5VarN.y;
                    f5 f5Var3 = (f5) a5VarD.a();
                    kVar5.getClass();
                    kVar5.applicationData_ = f5Var3;
                    kVar5.bitField0_ = 1 | kVar5.bitField0_;
                    w5 w5VarD = b.d();
                    w5VarD.c();
                    b bVar = (b) w5VarD.y;
                    bVar.getClass();
                    bVar.name_ = "android";
                    String str14 = Build.VERSION.RELEASE;
                    w5VarD.c();
                    b bVar2 = (b) w5VarD.y;
                    bVar2.getClass();
                    str14.getClass();
                    bVar2.version_ = Build.VERSION.RELEASE;
                    i5VarN.c();
                    k kVar6 = (k) i5VarN.y;
                    b bVar3 = (b) w5VarD.a();
                    kVar6.getClass();
                    kVar6.osData_ = bVar3;
                    kVar6.bitField0_ |= 2;
                    Object obj2 = p2Var2.d;
                    i5VarN.c();
                    k kVar7 = (k) i5VarN.y;
                    if (!kVar7.optional_.isMutable()) {
                        kVar7.optional_ = kVar7.optional_.mutableCopy();
                    }
                    kVar7.optional_.putAll(obj2);
                    String str15 = p2Var2.e;
                    i5VarN.c();
                    k kVar8 = (k) i5VarN.y;
                    kVar8.getClass();
                    str15.getClass();
                    kVar8.sid_ = str15;
                    l5 l5VarH = p5.h();
                    l5VarH.c();
                    ((p5) l5VarH.y).tcp_ = true;
                    l5VarH.c();
                    ((p5) l5VarH.y).udp_ = true;
                    l5VarH.c();
                    ((p5) l5VarH.y).reconnect_ = true;
                    l5VarH.c();
                    ((p5) l5VarH.y).ipVersion_ = true;
                    l5VarH.c();
                    ((p5) l5VarH.y).targetBlacklist_ = true;
                    l5VarH.c();
                    ((p5) l5VarH.y).connectionInfo_ = true;
                    i5VarN.c();
                    k kVar9 = (k) i5VarN.y;
                    p5 p5Var = (p5) l5VarH.a();
                    kVar9.getClass();
                    kVar9.features_ = p5Var;
                    kVar9.bitField0_ |= 4;
                    w4VarE.c();
                    c0 c0Var2 = (c0) w4VarE.y;
                    k kVar10 = (k) i5VarN.a();
                    c0Var2.getClass();
                    c0Var2.message_ = kVar10;
                    c0Var2.messageCase_ = 2;
                } else {
                    if (!(p3Var2 instanceof y2)) {
                        return null;
                    }
                    y2 y2Var2 = (y2) p3Var2;
                    p pVarI = y.i();
                    int iC = c(y2Var2.f);
                    pVarI.c();
                    y yVar = (y) pVarI.y;
                    yVar.getClass();
                    yVar.isIdle_ = androidx.room.b0.a(iC);
                    int iC2 = c(y2Var2.g);
                    pVarI.c();
                    y yVar2 = (y) pVarI.y;
                    yVar2.getClass();
                    yVar2.isMetered_ = androidx.room.b0.a(iC2);
                    int iC3 = c(y2Var2.c);
                    pVarI.c();
                    y yVar3 = (y) pVarI.y;
                    yVar3.getClass();
                    yVar3.isPlugged_ = androidx.room.b0.a(iC3);
                    int iC4 = c(y2Var2.e);
                    pVarI.c();
                    y yVar4 = (y) pVarI.y;
                    yVar4.getClass();
                    yVar4.isRoaming_ = androidx.room.b0.a(iC4);
                    Integer num3 = y2Var2.d;
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        pVarI.c();
                        ((y) pVarI.y).batteryLevel_ = iIntValue3;
                    }
                    Integer num4 = y2Var2.b;
                    if (num4 != null) {
                        int iIntValue4 = num4.intValue();
                        pVarI.c();
                        ((y) pVarI.y).signalStrength_ = iIntValue4;
                    }
                    int i12 = y2Var2.a;
                    int i13 = i12 == 0 ? -1 : h0.a[androidx.constraintlayout.core.g.e(i12)];
                    if (i13 == 2) {
                        c4 = 2;
                    } else if (i13 == 3) {
                        c4 = 3;
                    } else if (i13 != 4) {
                        c4 = 1;
                    }
                    pVarI.c();
                    y yVar5 = (y) pVarI.y;
                    yVar5.getClass();
                    int i14 = 1;
                    if (c4 != 1) {
                        int i15 = 2;
                        if (c4 != 2) {
                            if (c4 != 3) {
                                i15 = 5;
                                if (c4 != 4) {
                                    throw null;
                                }
                            }
                            i14 = i15;
                        }
                    } else {
                        i14 = 0;
                    }
                    yVar5.networkType_ = i14;
                    w4VarE.c();
                    c0 c0Var3 = (c0) w4VarE.y;
                    y yVar6 = (y) pVarI.a();
                    c0Var3.getClass();
                    c0Var3.message_ = yVar6;
                    c0Var3.messageCase_ = 3;
                }
                return ((c0) w4VarE.a()).toByteArray();
        }
    }
}
