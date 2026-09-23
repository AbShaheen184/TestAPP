package _COROUTINE;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.activity.compose.p;
import androidx.collection.b1;
import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.interaction.j;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.g;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.text.android.l;
import androidx.core.content.res.h;
import androidx.core.content.res.i;
import androidx.datastore.core.e;
import androidx.lifecycle.v;
import coil3.network.o;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.c0;
import kotlin.collections.q;
import kotlin.coroutines.d;
import kotlin.k;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.j0;
import okhttp3.r;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a = null;
    public static f b = null;
    public static f c = null;
    public static f d = null;
    public static f e = null;
    public static f f = null;
    public static f g = null;
    public static boolean h = true;
    public static Field i;
    public static boolean j;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static void A(boolean z) {
        if (z) {
            return;
        }
        c.a();
    }

    public static final a1 B(j jVar, s sVar, int i2) {
        Object objQ = sVar.Q();
        androidx.compose.runtime.f fVar = n.a;
        if (objQ == fVar) {
            objQ = t.r(Boolean.FALSE);
            sVar.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        boolean z = (((i2 & 14) ^ 6) > 4 && sVar.f(jVar)) || (i2 & 6) == 4;
        Object objQ2 = sVar.Q();
        if (z || objQ2 == fVar) {
            objQ2 = new p(jVar, a1Var, null, 7);
            sVar.l0(objQ2);
        }
        l0.c(sVar, jVar, (kotlin.jvm.functions.p) objQ2);
        return a1Var;
    }

    public static o0 D() {
        long[] jArr = w0.a;
        return new o0();
    }

    public static final Object H(e eVar, kotlin.jvm.functions.p pVar, d dVar) {
        return eVar.a(new androidx.datastore.preferences.core.b(pVar, null, 1), dVar);
    }

    public static long I(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    androidx.compose.ui.unit.b.l(i7);
                    com.google.firebase.platforminfo.b.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return androidx.compose.ui.unit.b.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long J(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    androidx.compose.ui.unit.b.l(i7);
                    com.google.firebase.platforminfo.b.b();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return androidx.compose.ui.unit.b.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final float K(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static ColorStateList L(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        i iVar = new i(resources, theme);
        synchronized (androidx.core.content.res.j.c) {
            try {
                SparseArray sparseArray = (SparseArray) androidx.core.content.res.j.b.get(iVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (hVar = (h) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (hVar.b.equals(resources.getConfiguration())) {
                        if (theme != null || hVar.c != 0) {
                            if (theme == null || hVar.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = hVar.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = androidx.core.content.res.j.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = androidx.core.content.res.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (androidx.core.content.res.j.c) {
            try {
                WeakHashMap weakHashMap = androidx.core.content.res.j.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i2, new h(colorStateListA, iVar.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final f M() {
        f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(14.0f, 2.0f);
        gVar.t(6.0f, 2.0f);
        gVar.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        gVar.t(4.0f, 20.0f);
        gVar.n(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        gVar.t(18.0f, 22.0f);
        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.t(20.0f, 8.0f);
        gVar.u(-6.0f, -6.0f);
        gVar.l();
        gVar.v(16.0f, 18.0f);
        gVar.t(8.0f, 18.0f);
        gVar.A(-2.0f);
        gVar.s(8.0f);
        gVar.A(2.0f);
        gVar.l();
        gVar.v(16.0f, 14.0f);
        gVar.t(8.0f, 14.0f);
        gVar.A(-2.0f);
        gVar.s(8.0f);
        gVar.A(2.0f);
        gVar.l();
        gVar.v(13.0f, 9.0f);
        gVar.t(13.0f, 3.5f);
        gVar.t(18.5f, 9.0f);
        gVar.t(13.0f, 9.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final f N() {
        f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FilterList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(10.0f, 18.0f);
        gVar.s(4.0f);
        gVar.A(-2.0f);
        gVar.s(-4.0f);
        gVar.A(2.0f);
        gVar.l();
        gVar.v(3.0f, 6.0f);
        gVar.A(2.0f);
        gVar.s(18.0f);
        gVar.t(21.0f, 6.0f);
        gVar.t(3.0f, 6.0f);
        gVar.l();
        gVar.v(6.0f, 13.0f);
        gVar.s(12.0f);
        gVar.A(-2.0f);
        gVar.t(6.0f, 11.0f);
        gVar.A(2.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static final f O() {
        f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(21.0f, 6.0f);
        gVar.s(-7.59f);
        gVar.u(3.29f, -3.29f);
        gVar.t(16.0f, 2.0f);
        gVar.u(-4.0f, 4.0f);
        gVar.u(-4.0f, -4.0f);
        gVar.u(-0.71f, 0.71f);
        gVar.t(10.59f, 6.0f);
        gVar.t(3.0f, 6.0f);
        gVar.n(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        gVar.A(12.0f);
        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.s(18.0f);
        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.t(23.0f, 8.0f);
        gVar.n(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.l();
        gVar.v(21.0f, 20.0f);
        gVar.t(3.0f, 20.0f);
        gVar.t(3.0f, 8.0f);
        gVar.s(18.0f);
        gVar.A(12.0f);
        gVar.l();
        gVar.v(9.0f, 10.0f);
        gVar.A(8.0f);
        gVar.u(7.0f, -4.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int Q(l lVar, Layout layout, androidx.compose.runtime.internal.c cVar, int i2, RectF rectF, androidx.compose.ui.text.android.selection.d dVar, g0 g0Var, boolean z) {
        androidx.compose.ui.text.android.g[] gVarArr;
        androidx.compose.ui.text.android.g[] gVarArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iG;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = lVar.f;
        int lineStart2 = layout2.getLineStart(i2);
        int iF = lVar.f(i2);
        if (i7 < (iF - lineStart2) * 2) {
            androidx.compose.ui.text.internal.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        androidx.compose.ui.scrollcapture.f fVar = new androidx.compose.ui.scrollcapture.f(lVar);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i2) == 1;
        int i8 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = fVar.a(lineStart2, z2, z2, true);
                fA3 = fVar.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = fVar.a(lineStart2, false, false, false);
                fA = fVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = fVar.a(lineStart2, false, false, true);
                    fA = fVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = fVar.a(lineStart2, false, false, false);
                    fA2 = fVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i8] = fA;
            fArr[i8 + 1] = fA3;
            i8 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) cVar.e;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int iX = cVar.x(lineStart3, false);
        int iY = cVar.y(iX);
        int i9 = lineStart3 - iY;
        int i10 = lineEnd2 - iY;
        Bidi bidiN = cVar.n(iX);
        if (bidiN == null || (bidiCreateLineBidi = bidiN.createLineBidi(i9, i10)) == null) {
            gVarArr = new androidx.compose.ui.text.android.g[]{new androidx.compose.ui.text.android.g(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            gVarArr = new androidx.compose.ui.text.android.g[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                gVarArr[i11] = new androidx.compose.ui.text.android.g(bidiCreateLineBidi.getRunStart(i11) + lineStart3, bidiCreateLineBidi.getRunLimit(i11) + lineStart3, bidiCreateLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        kotlin.ranges.b dVar2 = z ? new kotlin.ranges.d(0, gVarArr.length - 1, 1) : new kotlin.ranges.b(gVarArr.length - 1, 0, -1);
        int i13 = dVar2.e;
        int i14 = dVar2.y;
        int i15 = dVar2.z;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            androidx.compose.ui.text.android.g gVar = gVarArr[i13];
            boolean z4 = gVar.c;
            int iC = gVar.a;
            int iD = gVar.b;
            float f2 = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
            float fK = z4 ? K(iC, lineStart, fArr) : K(iD - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i16 = i15;
            if (!z) {
                gVarArr2 = gVarArr;
                if (fK < f3) {
                    iD = -1;
                    break;
                }
                float f4 = rectF.right;
                if (f2 <= f4) {
                    if ((z4 || f4 < fK) && (!z4 || f3 > f2)) {
                        int i17 = iD;
                        int i18 = iC;
                        while (i17 - i18 > 1) {
                            int i19 = (i17 + i18) / 2;
                            float f5 = fArr[(i19 - lineStart) * 2];
                            int i20 = i17;
                            if ((z4 || f5 <= rectF.right) && (!z4 || f5 >= rectF.left)) {
                                i17 = i20;
                                i18 = i19;
                            } else {
                                i17 = i19;
                            }
                        }
                        i3 = z4 ? i17 : i18;
                    } else {
                        i3 = iD - 1;
                    }
                    int iG2 = dVar.g(i3 + 1);
                    if (iG2 == -1 || (i4 = dVar.i(iG2)) <= iC) {
                        iD = -1;
                        break;
                    }
                    if (iG2 < iC) {
                        iG2 = iC;
                    }
                    if (i4 <= iD) {
                        iD = i4;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iG3 = iG2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iG3 - lineStart) * 2];
                        rectF2.right = z4 ? K(iG3, lineStart, fArr) : K(iD - 1, lineStart, fArr);
                        if (((Boolean) g0Var.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iD = dVar.d(iD);
                        if (iD == -1 || iD <= iC) {
                            iD = -1;
                            break;
                        }
                        iG3 = dVar.g(iD);
                        if (iG3 < iC) {
                            iG3 = iC;
                        }
                    }
                } else {
                    iD = -1;
                    break;
                }
                iC = iD;
            } else {
                if (fK < f3) {
                    gVarArr2 = gVarArr;
                    iC = -1;
                    break;
                }
                float f6 = rectF.right;
                if (f2 <= f6) {
                    if ((z4 || f3 > f2) && (!z4 || f6 < fK)) {
                        int i21 = iD;
                        int i22 = iC;
                        while (true) {
                            i5 = i21;
                            if (i21 - i22 <= 1) {
                                break;
                            }
                            int i23 = (i5 + i22) / 2;
                            float f7 = fArr[(i23 - lineStart) * 2];
                            if ((z4 || f7 <= rectF.left) && (!z4 || f7 >= rectF.right)) {
                                i21 = i5;
                                i22 = i23;
                            } else {
                                i21 = i23;
                            }
                        }
                        i6 = z4 ? i5 : i22;
                    } else {
                        i6 = iC;
                    }
                    int i24 = dVar.i(i6);
                    if (i24 != -1 && (iG = dVar.g(i24)) < iD) {
                        if (iG >= iC) {
                            iC = iG;
                        }
                        if (i24 > iD) {
                            i24 = iD;
                        }
                        gVarArr2 = gVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int i25 = i24;
                        while (true) {
                            rectF3.left = z4 ? fArr[((i25 - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
                            rectF3.right = z4 ? K(iC, lineStart, fArr) : K(i25 - 1, lineStart, fArr);
                            if (((Boolean) g0Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iC = dVar.c(iC);
                            if (iC != -1 && iC < iD) {
                                i25 = dVar.i(iC);
                                if (i25 > iD) {
                                    i25 = iD;
                                }
                            }
                        }
                    } else {
                        gVarArr2 = gVarArr;
                    }
                    iC = -1;
                    break;
                } else {
                    gVarArr2 = gVarArr;
                    iC = -1;
                    break;
                }
            }
            if (iC >= 0) {
                return iC;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i16;
            i15 = i16;
            gVarArr = gVarArr2;
        }
    }

    public static final f R() {
        f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Subtitles", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        g gVar = new g(0);
        gVar.v(20.0f, 4.0f);
        gVar.t(4.0f, 4.0f);
        gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        gVar.A(12.0f);
        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVar.s(16.0f);
        gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVar.t(22.0f, 6.0f);
        gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        gVar.l();
        gVar.v(4.0f, 12.0f);
        gVar.s(4.0f);
        gVar.A(2.0f);
        gVar.t(4.0f, 14.0f);
        gVar.A(-2.0f);
        gVar.l();
        gVar.v(14.0f, 18.0f);
        gVar.t(4.0f, 18.0f);
        gVar.A(-2.0f);
        gVar.s(10.0f);
        gVar.A(2.0f);
        gVar.l();
        gVar.v(20.0f, 18.0f);
        gVar.s(-4.0f);
        gVar.A(-2.0f);
        gVar.s(4.0f);
        gVar.A(2.0f);
        gVar.l();
        gVar.v(20.0f, 14.0f);
        gVar.t(10.0f, 14.0f);
        gVar.A(-2.0f);
        gVar.s(10.0f);
        gVar.A(2.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static final int S(androidx.sqlite.a aVar) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U("SELECT changes()");
        try {
            cVarU.Q();
            int i2 = (int) cVarU.getLong(0);
            q.e(cVarU, null);
            return i2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public static final boolean W(androidx.compose.ui.geometry.d dVar) {
        long j2 = dVar.e;
        return (j2 >>> 32) == (4294967295L & j2) && j2 == dVar.f && j2 == dVar.g && j2 == dVar.h;
    }

    public static final boolean X(Context context) {
        Object systemService = context.getSystemService("uimode");
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        Integer numValueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (r3 == r13) goto L82;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Y(androidx.compose.ui.input.pointer.k0 r17, androidx.compose.foundation.text.selection.q0 r18, androidx.appcompat.widget.x r19, androidx.compose.ui.input.pointer.m r20, kotlin.coroutines.jvm.internal.a r21) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: _COROUTINE.a.Y(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.selection.q0, androidx.appcompat.widget.x, androidx.compose.ui.input.pointer.m, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final boolean Z(o0 o0Var, Object obj, Object obj2) {
        Object objG = o0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof androidx.collection.p0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            o0Var.k(obj);
            return true;
        }
        androidx.collection.p0 p0Var = (androidx.collection.p0) objG;
        boolean zL = p0Var.l(obj2);
        if (zL && p0Var.g()) {
            o0Var.k(obj);
        }
        return zL;
    }

    public static final void a(Boolean bool, Object obj, v vVar, kotlin.jvm.functions.l lVar, s sVar, int i2) {
        int i3;
        sVar.c0(696924721);
        if ((i2 & 6) == 0) {
            i3 = (sVar.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            sVar.Y();
            if ((i2 & 1) == 0 || sVar.C()) {
                vVar = (v) sVar.j(androidx.lifecycle.compose.c.a);
            } else {
                sVar.W();
            }
            int i4 = i3 & (-897);
            sVar.q();
            boolean zF = sVar.f(bool) | sVar.f(obj) | sVar.f(vVar);
            Object objQ = sVar.Q();
            if (zF || objQ == n.a) {
                objQ = new androidx.lifecycle.compose.b(vVar.getLifecycle());
                sVar.l0(objQ);
            }
            b(vVar, (androidx.lifecycle.compose.b) objQ, lVar, sVar, (i4 >> 3) & 896);
        } else {
            sVar.W();
        }
        v vVar2 = vVar;
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.material3.d(bool, obj, vVar2, lVar, i2, 3);
        }
    }

    public static final void a0(o0 o0Var, Object obj) {
        boolean zG;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = o0Var.b[i5];
                        Object obj3 = o0Var.c[i5];
                        if (obj3 instanceof androidx.collection.p0) {
                            androidx.collection.p0 p0Var = (androidx.collection.p0) obj3;
                            p0Var.l(obj);
                            zG = p0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            o0Var.l(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static final void b(v vVar, androidx.lifecycle.compose.b bVar, kotlin.jvm.functions.l lVar, s sVar, int i2) {
        int i3;
        sVar.c0(228371534);
        if ((i2 & 6) == 0) {
            i3 = (sVar.h(vVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.h(lVar) ? 256 : 128;
        }
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean zH = sVar.h(bVar) | ((i3 & 896) == 256) | sVar.h(vVar);
            Object objQ = sVar.Q();
            if (zH || objQ == n.a) {
                objQ = new androidx.compose.animation.core.a(16, vVar, bVar, lVar);
                sVar.l0(objQ);
            }
            l0.a(vVar, bVar, (kotlin.jvm.functions.l) objQ, sVar);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(vVar, bVar, lVar, i2, 10);
        }
    }

    public static final androidx.compose.ui.geometry.d c(float f2, float f3, float f4, float f5, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new androidx.compose.ui.geometry.d(f2, f3, f4, f5, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c0(androidx.compose.ui.input.pointer.k0 r11, androidx.compose.foundation.text.x0 r12, androidx.compose.ui.input.pointer.m r13, kotlin.coroutines.jvm.internal.a r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: _COROUTINE.a.c0(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.x0, androidx.compose.ui.input.pointer.m, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final StackTraceElement d(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.k0 r6, kotlin.coroutines.jvm.internal.a r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.text.selection.d0
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.selection.d0 r0 = (androidx.compose.foundation.text.selection.d0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.d0 r0 = new androidx.compose.foundation.text.selection.d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.k0 r6 = r0.e
            kotlin.a.e(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r6)
            r6 = 0
            return r6
        L2e:
            kotlin.a.e(r7)
        L31:
            r0.e = r6
            r0.z = r2
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r7 = r6.b(r7, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.m r7 = (androidx.compose.ui.input.pointer.m) r7
            java.lang.Object r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = androidx.compose.ui.input.pointer.u.a(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: _COROUTINE.a.e(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final coil3.network.q f(okhttp3.g0 g0Var) {
        okio.h hVarP;
        int i2 = g0Var.A;
        long j2 = g0Var.I;
        long j3 = g0Var.J;
        r rVar = g0Var.C;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = rVar.iterator();
        while (true) {
            b1 b1Var = (b1) it;
            if (!b1Var.hasNext()) {
                break;
            }
            k kVar = (k) b1Var.next();
            String str = (String) kVar.e;
            String str2 = (String) kVar.y;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        o oVar = new o(c0.o(linkedHashMap));
        j0 j0Var = g0Var.D;
        return new coil3.network.q(i2, j2, j3, oVar, (j0Var == null || (hVarP = j0Var.P()) == null) ? null : new coil3.network.r(hVarP), g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[LOOP:1: B:24:0x0085->B:26:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final b0 g(coil3.network.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.network.okhttp.internal.c cVar2;
        a0 a0Var;
        String str;
        a0 a0Var2;
        coil3.network.p pVar2;
        okhttp3.c0 c0Var;
        g gVar;
        String str2;
        Iterator it;
        if (cVar instanceof coil3.network.okhttp.internal.c) {
            cVar2 = (coil3.network.okhttp.internal.c) cVar;
            int i2 = cVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.y = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new coil3.network.okhttp.internal.c(cVar);
            }
        } else {
            cVar2 = new coil3.network.okhttp.internal.c(cVar);
        }
        Object obj = cVar2.e;
        int i3 = cVar2.y;
        a0 a0Var3 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            okio.i iVar = (okio.i) obj;
            if (iVar != null) {
                int i4 = e0.a;
                c0Var = new okhttp3.c0(null, iVar);
                pVar2 = null;
                a0Var2 = null;
                str = null;
            } else {
                pVar = null;
                a0Var = null;
                a0Var2 = null;
                str = null;
            }
            a0Var3.c(str, c0Var);
            o oVar = pVar2.c;
            gVar = new g(4);
            for (Map.Entry entry : oVar.a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    gVar.j(str2, (String) it.next());
                }
            }
            r rVarK = gVar.k();
            a0Var2.getClass();
            a0Var2.c = rVarK.d();
            return new b0(a0Var2);
        }
        kotlin.a.e(obj);
        a0Var = new a0();
        a0Var.d(pVar.a);
        str = pVar.b;
        a0Var2 = a0Var;
        a0 a0Var4 = a0Var;
        pVar2 = pVar;
        c0Var = null;
        a0Var3 = a0Var4;
        a0Var3.c(str, c0Var);
        o oVar2 = pVar2.c;
        gVar = new g(4);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                gVar.j(str2, (String) it.next());
            }
        }
        r rVarK2 = gVar.k();
        a0Var2.getClass();
        a0Var2.c = rVarK2.d();
        return new b0(a0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.k0 r11, androidx.compose.foundation.text.x0 r12, androidx.compose.ui.input.pointer.m r13, int r14, kotlin.coroutines.jvm.internal.a r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: _COROUTINE.a.h(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.x0, androidx.compose.ui.input.pointer.m, int, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final void i(o0 o0Var, Object obj, Object obj2) {
        int iF = o0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : o0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof androidx.collection.p0) {
                ((androidx.collection.p0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                androidx.collection.p0 p0Var = new androidx.collection.p0();
                p0Var.a(obj3);
                p0Var.a(obj2);
                obj2 = p0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            o0Var.c[iF] = obj2;
            return;
        }
        int i2 = ~iF;
        o0Var.b[i2] = obj;
        o0Var.c[i2] = obj2;
    }

    public static String j(int i2, int i3, String str) {
        if (i2 < 0) {
            return b.B("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return b.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i3, "negative size: "));
        return null;
    }

    public static void k(int i2, int i3, String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void l(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, Integer.valueOf(i2)));
    }

    public static void m(String str, long j2, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, Long.valueOf(j2)));
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(str);
    }

    public static void o(boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.r();
    }

    public static void p(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void q(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, obj));
    }

    public static void r(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(b.B(str, obj, comparable));
    }

    public static void s(int i2, int i3) {
        String strB;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strB = b.B("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i3, "negative size: "));
                    return;
                }
                strB = b.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void t(androidx.media3.exoplayer.p0 p0Var) {
        p0Var.getClass();
    }

    public static void u(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h(b.B(str, obj));
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h(str);
    }

    public static void w(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            com.google.firebase.platforminfo.b.l(j(i2, i3, "index"));
        }
    }

    public static void x(int i2, int i3, int i4) {
        String strJ;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strJ = j(i2, i4, "start index");
            } else {
                strJ = (i3 < 0 || i3 > i4) ? j(i3, i4, "end index") : b.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static int y(Context context, String str) {
        if (str == null) {
            com.google.firebase.platforminfo.b.h("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new androidx.core.app.j(context).a.areNotificationsEnabled() ? 0 : -1;
    }

    public static void z(String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.u(str);
    }

    public abstract void C(com.google.common.util.concurrent.c0 c0Var, Set set);

    public androidx.media3.common.h0 E(androidx.media3.extractor.metadata.a aVar) {
        ByteBuffer byteBuffer = aVar.B;
        byteBuffer.getClass();
        o(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return F(aVar, byteBuffer);
    }

    public abstract androidx.media3.common.h0 F(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer);

    public abstract int G(com.google.common.util.concurrent.c0 c0Var);

    public abstract int P(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public float T(View view) {
        if (h) {
            try {
                return androidx.compose.ui.platform.coreshims.b.r(view);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    public abstract int U();

    public abstract ViewPropertyAnimator V(View view, int i2);

    public void b0(View view, float f2) {
        if (h) {
            try {
                androidx.compose.ui.platform.coreshims.b.y(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f2);
    }
}
