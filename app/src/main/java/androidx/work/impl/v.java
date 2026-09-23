package androidx.work.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.collection.j0;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.r1;
import androidx.compose.foundation.text.selection.p0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c2;
import androidx.compose.runtime.g2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s1;
import androidx.compose.ui.layout.q0;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import com.caverock.androidsvg.x1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static androidx.compose.ui.graphics.vector.f A;
    public static androidx.compose.ui.graphics.vector.f B;
    public static androidx.compose.ui.graphics.vector.f C;
    public static androidx.compose.ui.graphics.vector.f D;
    public static final /* synthetic */ int E = 0;
    public static final /* synthetic */ int F = 0;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f y;
    public static androidx.compose.ui.graphics.vector.f z;

    public static Object A(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.compose.ui.text.android.d.d(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (androidx.activity.result.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static androidx.core.text.c B(l0 l0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new androidx.core.text.c(androidx.arch.core.executor.d.p(l0Var));
        }
        TextPaint textPaint = new TextPaint(l0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = l0Var.getBreakStrategy();
        int hyphenationFrequency = l0Var.getHyphenationFrequency();
        if (l0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (l0Var.getInputType() & 15) != 3) {
            boolean z2 = l0Var.getLayoutDirection() == 1;
            switch (l0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(androidx.arch.core.executor.d.g(DecimalFormatSymbols.getInstance(l0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new androidx.core.text.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int E(String str) {
        if (str == null) {
            return -1;
        }
        String strP = androidx.media3.common.i0.p(str);
        strP.getClass();
        switch (strP) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int F(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final String I(Collection collection) {
        return kotlin.text.l.i(kotlin.collections.p.I(collection, ",", null, null, null, 62)).concat(kotlin.text.l.i(" }"));
    }

    public static final String J(Collection collection) {
        return kotlin.text.l.i(kotlin.collections.p.I(collection, ",", null, null, null, 62)).concat(kotlin.text.l.i("},"));
    }

    public static final androidx.work.a0 K(androidx.work.a0 a0Var, String str, androidx.room.y yVar, kotlin.jvm.functions.a aVar) {
        a0Var.getClass();
        yVar.getClass();
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(0);
        androidx.concurrent.futures.i iVar = new androidx.concurrent.futures.i();
        iVar.c = new androidx.concurrent.futures.n();
        androidx.concurrent.futures.l lVar = new androidx.concurrent.futures.l(iVar);
        iVar.b = lVar;
        iVar.a = androidx.privacysandbox.ads.adservices.java.internal.a.class;
        try {
            yVar.execute(new androidx.compose.foundation.text.j(a0Var, str, aVar, b0Var, iVar));
            iVar.a = kotlin.y.a;
        } catch (Exception e2) {
            lVar.y.m(e2);
        }
        return new androidx.work.a0();
    }

    public static long L(androidx.media3.common.util.v vVar, int i, int i2) {
        vVar.M(i);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = vVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || vVar.z() < 7 || vVar.a() < 7 || (vVar.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        vVar.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static final androidx.compose.ui.unit.k M(androidx.compose.ui.geometry.c cVar) {
        return new androidx.compose.ui.unit.k(Math.round(cVar.a), Math.round(cVar.b), Math.round(cVar.c), Math.round(cVar.d));
    }

    public static void N(TextView textView, int i) {
        t1.l(i);
        if (Build.VERSION.SDK_INT >= 28) {
            androidx.arch.core.executor.d.x(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void O(TextView textView, int i) {
        t1.l(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void P(TextView textView, int i) {
        t1.l(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.animation.core.j2, androidx.compose.runtime.tooling.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList Q(g2 g2Var, int i, Integer num) {
        ?? jVar = new androidx.compose.runtime.tooling.j(g2Var);
        i = g2Var.q(i);
        androidx.compose.runtime.a aVarA = g2Var.a(i);
        while (i >= 0) {
            jVar.r(g2Var.i(i), g2Var.k(i) ? g2Var.p(i, g2Var.b) : androidx.compose.runtime.n.a, g2Var.a.h(i), num);
            if (i >= 0) {
                androidx.compose.runtime.a aVar = aVarA;
                aVarA = g2Var.a(i);
                i = g2Var.q(i);
                num = aVar;
            } else {
                num = aVarA;
            }
        }
        return (ArrayList) jVar.e;
    }

    public static ActionMode.Callback R(ActionMode.Callback callback) {
        return (!(callback instanceof androidx.core.widget.g) || Build.VERSION.SDK_INT < 26) ? callback : ((androidx.core.widget.g) callback).a;
    }

    public static ActionMode.Callback S(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof androidx.core.widget.g) || callback == null) ? callback : new androidx.core.widget.g(callback, textView);
    }

    public static final androidx.compose.ui.unit.k a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new androidx.compose.ui.unit.k(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x018d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    public static final void b(androidx.compose.foundation.lazy.grid.a aVar, androidx.compose.ui.r rVar, androidx.compose.foundation.lazy.grid.x xVar, z0 z0Var, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, androidx.compose.foundation.gestures.l lVar, boolean z2, androidx.compose.foundation.n nVar, kotlin.jvm.functions.l lVar2, androidx.compose.runtime.s sVar, int i, int i2) {
        androidx.compose.ui.r rVar2;
        androidx.compose.foundation.lazy.grid.x xVarA;
        int i3;
        androidx.compose.foundation.layout.g gVar2;
        int i4;
        androidx.compose.foundation.layout.e eVar2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        androidx.compose.ui.r rVar3;
        androidx.compose.foundation.lazy.grid.x xVar2;
        androidx.compose.foundation.layout.g gVar3;
        androidx.compose.foundation.layout.e eVar3;
        androidx.compose.foundation.gestures.l lVar3;
        androidx.compose.foundation.n nVar2;
        s1 s1VarT;
        androidx.compose.foundation.gestures.l lVarH;
        androidx.compose.foundation.layout.e eVar4;
        androidx.compose.foundation.n nVarA;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        Object objQ;
        int i10;
        sVar.c0(-2072102870);
        int i11 = i | (sVar.f(aVar) ? 4 : 2);
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i11 |= sVar.f(rVar2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                xVarA = xVar;
                int i13 = sVar.f(xVarA) ? LibretroCore.SCREEN_WIDTH : 128;
                i3 = i11 | i13 | 24576;
                if ((i & 196608) == 0) {
                    if ((i2 & 32) == 0) {
                        gVar2 = gVar;
                        if (sVar.f(gVar2)) {
                            i10 = 131072;
                        }
                        i3 |= i10;
                    } else {
                        gVar2 = gVar;
                    }
                    i10 = Parser.ARGC_LIMIT;
                    i3 |= i10;
                } else {
                    gVar2 = gVar;
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                    if ((i & 1572864) == 0) {
                        eVar2 = eVar;
                        if (sVar.f(eVar2)) {
                            i5 = 1048576;
                        } else {
                            i5 = 524288;
                        }
                        i3 |= i5;
                    }
                    i6 = i3 | 373293056;
                    if (sVar.h(lVar2)) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    z3 = true;
                    if ((306783379 & i6) == 306783378 || (i7 & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (sVar.T(i6 & 1, z4)) {
                        sVar.Y();
                        if ((i & 1) != 0 || sVar.C()) {
                            if (i12 != 0) {
                                rVar2 = androidx.compose.ui.o.b;
                            }
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                                xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                            }
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                                gVar2 = androidx.compose.foundation.layout.h.c;
                            }
                            if (i4 != 0) {
                                eVar2 = androidx.compose.foundation.layout.h.a;
                            }
                            androidx.compose.ui.r rVar4 = rVar2;
                            lVarH = okhttp3.internal.platform.android.g.h(sVar);
                            rVar3 = rVar4;
                            eVar4 = eVar2;
                            nVarA = r1.a(sVar);
                            i8 = i6 & (-1908408321);
                            z6 = true;
                        } else {
                            sVar.W();
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            i8 = i6 & (-1908408321);
                            rVar3 = rVar2;
                            eVar4 = eVar2;
                            lVarH = lVar;
                            z6 = z2;
                            nVarA = nVar;
                        }
                        sVar.q();
                        i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                        boolean z8 = (((i9 & 14) ^ 6) <= 4 && sVar.f(aVar)) || (i9 & 6) == 4;
                        if ((((i9 & Token.ASSIGN_MOD) ^ 48) > 32 || !sVar.f(eVar4)) && (i9 & 48) != 32) {
                        }
                        z7 = z8 | z3;
                        objQ = sVar.Q();
                        if (z7 || objQ == androidx.compose.runtime.n.a) {
                            objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                            sVar.l0(objQ);
                        }
                        int i14 = i8 >> 3;
                        int i15 = (i14 & 14) | 196608;
                        xVar2 = xVarA;
                        boolean z9 = z6;
                        coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z9, nVarA, gVar2, eVar4, lVar2, sVar, (i14 & Token.ASSIGN_MOD) | i15 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                        gVar3 = gVar2;
                        nVar2 = nVarA;
                        z5 = z9;
                        lVar3 = lVarH;
                        eVar3 = eVar4;
                    } else {
                        sVar.W();
                        z5 = z2;
                        rVar3 = rVar2;
                        xVar2 = xVarA;
                        gVar3 = gVar2;
                        eVar3 = eVar2;
                        lVar3 = lVar;
                        nVar2 = nVar;
                    }
                    s1VarT = sVar.t();
                    if (s1VarT != null) {
                        s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
                    }
                }
                i3 |= 1572864;
                eVar2 = eVar;
                i6 = i3 | 373293056;
                if (sVar.h(lVar2)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                z3 = true;
                if ((306783379 & i6) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (sVar.T(i6 & 1, z4)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar5 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar5;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    } else {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar6 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar6;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    }
                    sVar.q();
                    i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                    if (((i9 & 14) ^ 6) <= 4) {
                    }
                    z3 = ((i9 & Token.ASSIGN_MOD) ^ 48) > 32 ? false : false;
                    z7 = z8 | z3;
                    objQ = sVar.Q();
                    if (z7) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    }
                    int i16 = i8 >> 3;
                    int i17 = (i16 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z10 = z6;
                    coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z10, nVarA, gVar2, eVar4, lVar2, sVar, (i16 & Token.ASSIGN_MOD) | i17 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z5 = z10;
                    lVar3 = lVarH;
                    eVar3 = eVar4;
                } else {
                    sVar.W();
                    z5 = z2;
                    rVar3 = rVar2;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
                }
            }
            xVarA = xVar;
            i3 = i11 | i13 | 24576;
            if ((i & 196608) == 0) {
                if ((i2 & 32) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                        i10 = 131072;
                    }
                    i3 |= i10;
                } else {
                    gVar2 = gVar;
                }
                i10 = Parser.ARGC_LIMIT;
                i3 |= i10;
            } else {
                gVar2 = gVar;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((i & 1572864) == 0) {
                    eVar2 = eVar;
                    if (sVar.f(eVar2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 373293056;
                if (sVar.h(lVar2)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                z3 = true;
                if ((306783379 & i6) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (sVar.T(i6 & 1, z4)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar7 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar7;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    } else {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar8 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar8;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    }
                    sVar.q();
                    i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                    if (((i9 & 14) ^ 6) <= 4) {
                    }
                    if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
                    }
                    z7 = z8 | z3;
                    objQ = sVar.Q();
                    if (z7) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    }
                    int i18 = i8 >> 3;
                    int i19 = (i18 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z11 = z6;
                    coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z11, nVarA, gVar2, eVar4, lVar2, sVar, (i18 & Token.ASSIGN_MOD) | i19 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z5 = z11;
                    lVar3 = lVarH;
                    eVar3 = eVar4;
                } else {
                    sVar.W();
                    z5 = z2;
                    rVar3 = rVar2;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
                }
            }
            i3 |= 1572864;
            eVar2 = eVar;
            i6 = i3 | 373293056;
            if (sVar.h(lVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            z3 = true;
            if ((306783379 & i6) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (sVar.T(i6 & 1, z4)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar9 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar9;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                } else {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar10 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar10;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                }
                sVar.q();
                i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                if (((i9 & 14) ^ 6) <= 4) {
                }
                if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z7 = z8 | z3;
                objQ = sVar.Q();
                if (z7) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                }
                int i110 = i8 >> 3;
                int i111 = (i110 & 14) | 196608;
                xVar2 = xVarA;
                boolean z12 = z6;
                coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z12, nVarA, gVar2, eVar4, lVar2, sVar, (i110 & Token.ASSIGN_MOD) | i111 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z5 = z12;
                lVar3 = lVarH;
                eVar3 = eVar4;
            } else {
                sVar.W();
                z5 = z2;
                rVar3 = rVar2;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
            }
        }
        i11 |= 48;
        rVar2 = rVar;
        if ((i2 & 4) == 0) {
            xVarA = xVar;
            if (sVar.f(xVarA)) {
            }
            i3 = i11 | i13 | 24576;
            if ((i & 196608) == 0) {
                if ((i2 & 32) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                        i10 = 131072;
                    }
                    i3 |= i10;
                } else {
                    gVar2 = gVar;
                }
                i10 = Parser.ARGC_LIMIT;
                i3 |= i10;
            } else {
                gVar2 = gVar;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((i & 1572864) == 0) {
                    eVar2 = eVar;
                    if (sVar.f(eVar2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 373293056;
                if (sVar.h(lVar2)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                z3 = true;
                if ((306783379 & i6) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (sVar.T(i6 & 1, z4)) {
                    sVar.Y();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar11 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar11;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    } else {
                        if (i12 != 0) {
                            rVar2 = androidx.compose.ui.o.b;
                        }
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                            xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        if (i4 != 0) {
                            eVar2 = androidx.compose.foundation.layout.h.a;
                        }
                        androidx.compose.ui.r rVar12 = rVar2;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        rVar3 = rVar12;
                        eVar4 = eVar2;
                        nVarA = r1.a(sVar);
                        i8 = i6 & (-1908408321);
                        z6 = true;
                    }
                    sVar.q();
                    i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                    if (((i9 & 14) ^ 6) <= 4) {
                    }
                    if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
                    }
                    z7 = z8 | z3;
                    objQ = sVar.Q();
                    if (z7) {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    } else {
                        objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                        sVar.l0(objQ);
                    }
                    int i112 = i8 >> 3;
                    int i113 = (i112 & 14) | 196608;
                    xVar2 = xVarA;
                    boolean z13 = z6;
                    coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z13, nVarA, gVar2, eVar4, lVar2, sVar, (i112 & Token.ASSIGN_MOD) | i113 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                    gVar3 = gVar2;
                    nVar2 = nVarA;
                    z5 = z13;
                    lVar3 = lVarH;
                    eVar3 = eVar4;
                } else {
                    sVar.W();
                    z5 = z2;
                    rVar3 = rVar2;
                    xVar2 = xVarA;
                    gVar3 = gVar2;
                    eVar3 = eVar2;
                    lVar3 = lVar;
                    nVar2 = nVar;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
                }
            }
            i3 |= 1572864;
            eVar2 = eVar;
            i6 = i3 | 373293056;
            if (sVar.h(lVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            z3 = true;
            if ((306783379 & i6) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (sVar.T(i6 & 1, z4)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar13 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar13;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                } else {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar14 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar14;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                }
                sVar.q();
                i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                if (((i9 & 14) ^ 6) <= 4) {
                }
                if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z7 = z8 | z3;
                objQ = sVar.Q();
                if (z7) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                }
                int i114 = i8 >> 3;
                int i115 = (i114 & 14) | 196608;
                xVar2 = xVarA;
                boolean z14 = z6;
                coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z14, nVarA, gVar2, eVar4, lVar2, sVar, (i114 & Token.ASSIGN_MOD) | i115 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z5 = z14;
                lVar3 = lVarH;
                eVar3 = eVar4;
            } else {
                sVar.W();
                z5 = z2;
                rVar3 = rVar2;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
            }
        }
        xVarA = xVar;
        i3 = i11 | i13 | 24576;
        if ((i & 196608) == 0) {
            if ((i2 & 32) == 0) {
                gVar2 = gVar;
                if (sVar.f(gVar2)) {
                    i10 = 131072;
                }
                i3 |= i10;
            } else {
                gVar2 = gVar;
            }
            i10 = Parser.ARGC_LIMIT;
            i3 |= i10;
        } else {
            gVar2 = gVar;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((i & 1572864) == 0) {
                eVar2 = eVar;
                if (sVar.f(eVar2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i3 | 373293056;
            if (sVar.h(lVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            z3 = true;
            if ((306783379 & i6) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (sVar.T(i6 & 1, z4)) {
                sVar.Y();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar15 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar15;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                } else {
                    if (i12 != 0) {
                        rVar2 = androidx.compose.ui.o.b;
                    }
                    if ((i2 & 4) != 0) {
                        i6 &= -897;
                        xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    if (i4 != 0) {
                        eVar2 = androidx.compose.foundation.layout.h.a;
                    }
                    androidx.compose.ui.r rVar16 = rVar2;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    rVar3 = rVar16;
                    eVar4 = eVar2;
                    nVarA = r1.a(sVar);
                    i8 = i6 & (-1908408321);
                    z6 = true;
                }
                sVar.q();
                i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
                if (((i9 & 14) ^ 6) <= 4) {
                }
                if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
                }
                z7 = z8 | z3;
                objQ = sVar.Q();
                if (z7) {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                } else {
                    objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                    sVar.l0(objQ);
                }
                int i116 = i8 >> 3;
                int i117 = (i116 & 14) | 196608;
                xVar2 = xVarA;
                boolean z15 = z6;
                coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z15, nVarA, gVar2, eVar4, lVar2, sVar, (i116 & Token.ASSIGN_MOD) | i117 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
                gVar3 = gVar2;
                nVar2 = nVarA;
                z5 = z15;
                lVar3 = lVarH;
                eVar3 = eVar4;
            } else {
                sVar.W();
                z5 = z2;
                rVar3 = rVar2;
                xVar2 = xVarA;
                gVar3 = gVar2;
                eVar3 = eVar2;
                lVar3 = lVar;
                nVar2 = nVar;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
            }
        }
        i3 |= 1572864;
        eVar2 = eVar;
        i6 = i3 | 373293056;
        if (sVar.h(lVar2)) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        z3 = true;
        if ((306783379 & i6) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (sVar.T(i6 & 1, z4)) {
            sVar.Y();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    rVar2 = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                }
                if ((i2 & 32) != 0) {
                    i6 &= -458753;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                if (i4 != 0) {
                    eVar2 = androidx.compose.foundation.layout.h.a;
                }
                androidx.compose.ui.r rVar17 = rVar2;
                lVarH = okhttp3.internal.platform.android.g.h(sVar);
                rVar3 = rVar17;
                eVar4 = eVar2;
                nVarA = r1.a(sVar);
                i8 = i6 & (-1908408321);
                z6 = true;
            } else {
                if (i12 != 0) {
                    rVar2 = androidx.compose.ui.o.b;
                }
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    xVarA = androidx.compose.foundation.lazy.grid.z.a(0, 0, sVar, 3);
                }
                if ((i2 & 32) != 0) {
                    i6 &= -458753;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                if (i4 != 0) {
                    eVar2 = androidx.compose.foundation.layout.h.a;
                }
                androidx.compose.ui.r rVar18 = rVar2;
                lVarH = okhttp3.internal.platform.android.g.h(sVar);
                rVar3 = rVar18;
                eVar4 = eVar2;
                nVarA = r1.a(sVar);
                i8 = i6 & (-1908408321);
                z6 = true;
            }
            sVar.q();
            i9 = (i8 & 14) | ((i8 >> 15) & Token.ASSIGN_MOD);
            if (((i9 & 14) ^ 6) <= 4) {
            }
            if (((i9 & Token.ASSIGN_MOD) ^ 48) > 32) {
            }
            z7 = z8 | z3;
            objQ = sVar.Q();
            if (z7) {
                objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                sVar.l0(objQ);
            } else {
                objQ = new androidx.compose.foundation.lazy.grid.c(new androidx.compose.foundation.contextmenu.f(1, aVar, eVar4));
                sVar.l0(objQ);
            }
            int i118 = i8 >> 3;
            int i119 = (i118 & 14) | 196608;
            xVar2 = xVarA;
            boolean z16 = z6;
            coil3.network.g.a(rVar3, xVar2, (androidx.compose.foundation.lazy.grid.c) objQ, z0Var, lVarH, z16, nVarA, gVar2, eVar4, lVar2, sVar, (i118 & Token.ASSIGN_MOD) | i119 | 12610560 | ((i8 << 12) & 1879048192), ((i8 >> 18) & 14) | ((i7 << 3) & Token.ASSIGN_MOD));
            gVar3 = gVar2;
            nVar2 = nVarA;
            z5 = z16;
            lVar3 = lVarH;
            eVar3 = eVar4;
        } else {
            sVar.W();
            z5 = z2;
            rVar3 = rVar2;
            xVar2 = xVarA;
            gVar3 = gVar2;
            eVar3 = eVar2;
            lVar3 = lVar;
            nVar2 = nVar;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.lazy.grid.e(aVar, rVar3, xVar2, z0Var, gVar3, eVar3, lVar3, z5, nVar2, lVar2, i, i2);
        }
    }

    public static final void c(androidx.compose.ui.r rVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i) {
        sVar.c0(-1854833411);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i;
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = p0.a;
                sVar.l0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0Var, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            fVar.invoke(sVar, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(rVar, fVar, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.animation.core.j2, androidx.compose.runtime.tooling.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List g(k2 k2Var, Integer num, int i, Integer num2) {
        int iE;
        int iS;
        j0 j0Var;
        if (k2Var.w || k2Var.p() == 0) {
            return kotlin.collections.w.e;
        }
        ?? jVar = new androidx.compose.runtime.tooling.j(k2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = k2Var.v;
            if (iE < 0) {
                iE = k2Var.E(i, k2Var.b);
            }
        }
        if (num == 0) {
            int iN = k2Var.i - k2Var.N(k2Var.r(i), k2Var.b);
            androidx.collection.z zVar = k2Var.s;
            num = Integer.valueOf(iN + ((zVar == null || (j0Var = (j0) zVar.b(i)) == null) ? 0 : j0Var.b));
        }
        int iR = k2Var.r(i) * 5;
        int[] iArr = k2Var.b;
        if (iR < iArr.length) {
            iS = k2Var.s(i);
        } else {
            int iE2 = iE >= 0 ? k2Var.E(iE, iArr) : iE;
            iS = k2Var.s(iE);
            int i2 = iE;
            iE = iE2;
            i = i2;
        }
        while (i >= 0) {
            jVar.r(iS, (k2Var.b[(k2Var.r(i) * 5) + 1] & 536870912) != 0 ? k2Var.t(i) : androidx.compose.runtime.n.a, k2Var.O(i), num);
            num = k2Var.b(i);
            if (iE >= 0) {
                int iE3 = k2Var.E(iE, k2Var.b);
                iS = k2Var.s(iE);
                int i3 = iE;
                iE = iE3;
                i = i3;
            } else {
                i = iE;
            }
        }
        return (ArrayList) jVar.e;
    }

    public static void h(okio.k kVar, okio.x xVar) {
        if (kVar.N(xVar)) {
            return;
        }
        try {
            kVar.b0(xVar, false).close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final t j(Context context, androidx.work.b bVar) {
        androidx.room.p pVarN;
        context.getClass();
        androidx.work.impl.utils.taskexecutor.c cVar = new androidx.work.impl.utils.taskexecutor.c(bVar.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        androidx.room.y yVar = cVar.a;
        yVar.getClass();
        androidx.work.a0 a0Var = bVar.d;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        a0Var.getClass();
        if (z2) {
            pVarN = new androidx.room.p(applicationContext, WorkDatabase.class, null);
            pVarN.i = true;
        } else {
            pVarN = coil3.svg.internal.a.n(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            pVarN.h = new androidx.media3.common.audio.c(applicationContext, 4);
        }
        pVarN.f = yVar;
        pVarN.d.add(new androidx.room.o(a0Var));
        pVarN.a(b.h);
        pVarN.a(new e(applicationContext, 2, 3));
        pVarN.a(b.i);
        pVarN.a(b.j);
        pVarN.a(new e(applicationContext, 5, 6));
        pVarN.a(b.k);
        pVarN.a(b.l);
        pVarN.a(b.m);
        pVarN.a(new e(applicationContext));
        pVarN.a(new e(applicationContext, 10, 11));
        pVarN.a(b.d);
        pVarN.a(b.e);
        pVarN.a(b.f);
        pVarN.a(b.g);
        pVarN.a(new e(applicationContext, 21, 22));
        pVarN.p = false;
        pVarN.q = true;
        pVarN.r = true;
        WorkDatabase workDatabase = (WorkDatabase) pVarN.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        androidx.work.impl.constraints.trackers.i iVar = new androidx.work.impl.constraints.trackers.i(applicationContext2, cVar);
        d dVar = new d(context.getApplicationContext(), bVar, cVar, workDatabase);
        return new t(context.getApplicationContext(), bVar, cVar, workDatabase, (List) u.e.b(context, bVar, cVar, workDatabase, iVar, dVar), dVar, iVar);
    }

    public static final boolean k(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return kotlin.jvm.internal.l.a(kotlin.text.k.g0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final void m(okio.k kVar, okio.x xVar) throws IOException {
        try {
            IOException iOException = null;
            for (okio.x xVar2 : kVar.X(xVar)) {
                try {
                    if (kVar.Y(xVar2).c) {
                        m(kVar, xVar2);
                    }
                    kVar.A(xVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final Integer n(g2 g2Var, androidx.compose.runtime.w wVar, int i, int i2) {
        Integer numN;
        int[] iArr = g2Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (g2Var.j(i) && g2Var.i(i) == 206 && kotlin.jvm.internal.l.a(g2Var.p(i, iArr), androidx.compose.runtime.u.e)) {
                Object objH = g2Var.h(i, 0);
                c2 c2Var = objH instanceof c2 ? (c2) objH : null;
                b2 b2Var = c2Var != null ? c2Var.a : null;
                androidx.compose.runtime.p pVar = b2Var instanceof androidx.compose.runtime.p ? (androidx.compose.runtime.p) b2Var : null;
                if (pVar != null && pVar.e.equals(wVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (g2Var.d(i) && (numN = n(g2Var, wVar, i + 1, i3)) != null) {
                return Integer.valueOf(numN.intValue());
            }
            i = i3;
        }
    }

    public static final String o(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? kotlin.text.l.i(kotlin.collections.p.I(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static androidx.documentfile.provider.a p(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            com.google.firebase.platforminfo.b.f(uri, "Could not get document ID from Uri: ");
            return null;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new androidx.documentfile.provider.a(context, uriBuildDocumentUriUsingTree);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public static final int q(androidx.compose.ui.text.font.k kVar, int i) {
        boolean z2 = kotlin.jvm.internal.l.b(kVar.e, androidx.compose.ui.text.font.k.y.e) >= 0;
        boolean z3 = i == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final androidx.compose.ui.graphics.vector.f r() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Cancel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 2.0f);
        gVarJ.m(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        gVarJ.x(4.47f, 10.0f, 10.0f, 10.0f);
        gVarJ.x(10.0f, -4.47f, 10.0f, -10.0f);
        gVarJ.w(17.53f, 2.0f, 12.0f, 2.0f);
        gVarJ.l();
        gVarJ.v(17.0f, 15.59f);
        gVarJ.t(15.59f, 17.0f);
        gVarJ.t(12.0f, 13.41f);
        gVarJ.t(8.41f, 17.0f);
        gVarJ.t(7.0f, 15.59f);
        gVarJ.t(10.59f, 12.0f);
        gVarJ.t(7.0f, 8.41f);
        gVarJ.t(8.41f, 7.0f);
        gVarJ.t(12.0f, 10.59f);
        gVarJ.t(15.59f, 7.0f);
        gVarJ.t(17.0f, 8.41f);
        gVarJ.t(13.41f, 12.0f);
        gVarJ.t(17.0f, 15.59f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static ColorStateList s(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListL;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListL = _COROUTINE.a.L(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListL;
    }

    public static ColorStateList t(Context context, androidx.appcompat.widget.c2 c2Var, int i) {
        int resourceId;
        ColorStateList colorStateListL;
        TypedArray typedArray = (TypedArray) c2Var.z;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListL = _COROUTINE.a.L(context, resourceId)) == null) ? c2Var.y(i) : colorStateListL;
    }

    public static final androidx.compose.ui.graphics.vector.f u() {
        androidx.compose.ui.graphics.vector.f fVar = y;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(5.0f, 20.0f);
        gVar.s(14.0f);
        gVar.A(-2.0f);
        gVar.r(5.0f);
        gVar.z(20.0f);
        gVar.l();
        gVar.v(19.0f, 9.0f);
        gVar.s(-4.0f);
        gVar.z(3.0f);
        gVar.r(9.0f);
        gVar.A(6.0f);
        gVar.r(5.0f);
        gVar.u(7.0f, 7.0f);
        gVar.t(19.0f, 9.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        y = fVarB;
        return fVarB;
    }

    public static Drawable v(Context context, int i) {
        return androidx.appcompat.widget.t1.b().c(context, i);
    }

    public static Drawable w(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableV;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableV = v(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableV;
    }

    public static final androidx.compose.ui.graphics.vector.f x() {
        androidx.compose.ui.graphics.vector.f fVar = A;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(12.0f, 3.0f);
        gVar.A(10.55f);
        gVar.n(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
        gVar.n(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        gVar.x(1.79f, 4.0f, 4.0f, 4.0f);
        gVar.x(4.0f, -1.79f, 4.0f, -4.0f);
        gVar.z(7.0f);
        gVar.s(4.0f);
        gVar.z(3.0f);
        gVar.s(-6.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        A = fVarB;
        return fVarB;
    }

    public static final Object z(androidx.datastore.preferences.core.a aVar, androidx.datastore.preferences.core.d dVar, Serializable serializable) {
        aVar.getClass();
        dVar.getClass();
        Object objC = aVar.c(dVar);
        return objC == null ? serializable : objC;
    }

    public abstract Uri C();

    public void D(androidx.sqlite.a aVar, Object obj) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U(i());
        try {
            d(cVarU, obj);
            cVarU.Q();
            kotlin.collections.q.e(cVarU, null);
            _COROUTINE.a.S(aVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public abstract boolean G();

    public abstract void d(androidx.sqlite.c cVar, Object obj);

    public com.google.android.gms.common.api.c e(Context context, Looper looper, x1 x1Var, Object obj, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.h hVar) {
        return f(context, looper, x1Var, obj, (com.google.android.gms.common.api.internal.k) gVar, (com.google.android.gms.common.api.internal.k) hVar);
    }

    public com.google.android.gms.common.api.c f(Context context, Looper looper, x1 x1Var, Object obj, com.google.android.gms.common.api.internal.k kVar, com.google.android.gms.common.api.internal.k kVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract String i();

    public abstract boolean l();

    public abstract String y();
}
