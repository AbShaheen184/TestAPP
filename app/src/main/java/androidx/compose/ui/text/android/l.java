package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.room.t;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public androidx.compose.ui.text.android.selection.e e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final androidx.compose.ui.text.android.style.h[] o;
    public final Rect p = new Rect();
    public androidx.compose.runtime.internal.c q;

    /* JADX WARN: Code duplicated, block: B:100:0x01ae A[PHI: r7 r22
  0x01ae: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:105:0x01c2, B:98:0x01a7] A[DONT_GENERATE, DONT_INLINE]
  0x01ae: PHI (r22v5 java.lang.Throwable) = (r22v4 java.lang.Throwable), (r22v7 java.lang.Throwable) binds: [B:105:0x01c2, B:98:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0230  */
    /* JADX WARN: Code duplicated, block: B:129:0x0232  */
    /* JADX WARN: Code duplicated, block: B:131:0x0237  */
    /* JADX WARN: Code duplicated, block: B:132:0x0239  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public l(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, h hVar) throws Throwable {
        int i9;
        int i10;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM;
        androidx.compose.ui.text.android.style.h[] hVarArr;
        int i11;
        int i12;
        int i13;
        Throwable th;
        char c;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        long jA;
        ?? r9;
        boolean zJ;
        int topPadding;
        boolean zI;
        long jA2;
        ?? r7;
        int i18;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = m.b(i2);
        Layout.Alignment alignment = j.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : j.b : j.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, androidx.compose.ui.text.android.style.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = hVar.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || hVar.c() > f || z2) {
                i9 = 0;
                this.l = false;
                i10 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutM = n.m(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i10, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    androidx.compose.ui.text.internal.a.a("negative width");
                }
                if (iCeil < 0) {
                    androidx.compose.ui.text.internal.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutM = c.a(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil);
                    i9 = 0;
                } else {
                    i9 = 0;
                    layoutM = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                }
                i10 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f = layoutM;
            Trace.endSection();
            int iMin = Math.min(layoutM.getLineCount(), i10);
            this.g = iMin;
            int i19 = iMin - 1;
            this.d = (iMin >= i10 && (layoutM.getEllipsisCount(i19) > 0 || layoutM.getLineEnd(i19) != charSequence.length())) ? 1 : i9;
            if (layoutM.getText() instanceof Spanned) {
                CharSequence text = layoutM.getText();
                text.getClass();
                if (okhttp3.internal.platform.android.g.p((Spanned) text, androidx.compose.ui.text.android.style.h.class) || layoutM.getText().length() <= 0) {
                    CharSequence text2 = layoutM.getText();
                    text2.getClass();
                    hVarArr = (androidx.compose.ui.text.android.style.h[]) ((Spanned) text2).getSpans(i9, layoutM.getText().length(), androidx.compose.ui.text.android.style.h.class);
                } else {
                    hVarArr = null;
                }
            } else {
                hVarArr = null;
            }
            this.o = hVarArr;
            if (hVarArr == null) {
                i11 = 2;
                i12 = i9;
            } else {
                androidx.compose.ui.text.android.style.h hVar2 = hVarArr.length == 0 ? null : hVarArr[i9];
                if (hVar2 != null) {
                    if (hVar2.z) {
                        i11 = 2;
                        i18 = hVar2.C == 2 ? 1 : i18;
                        i12 = i18;
                    } else {
                        i11 = 2;
                    }
                    i18 = i9;
                    i12 = i18;
                } else {
                    i11 = 2;
                    i12 = i9;
                }
            }
            if (hVarArr == null) {
                i13 = i9;
            } else {
                androidx.compose.ui.text.android.style.h hVar3 = hVarArr.length == 0 ? null : hVarArr[i9];
                if (hVar3 != null && hVar3.A && hVar3.C == i11) {
                    i13 = 1;
                } else {
                    i13 = i9;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jA3 = m.b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i14 = 33;
                } else {
                    if (this.l) {
                        BoringLayout boringLayout = (BoringLayout) layoutM;
                        th = null;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zI = d.i(boringLayout);
                        } else {
                            r9 = i9;
                        }
                    } else {
                        th = null;
                        i14 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutM;
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 33) {
                            zJ = d.j(staticLayout);
                        } else if (i20 >= 28) {
                            r9 = 1;
                        } else {
                            r9 = i9;
                        }
                    }
                    if (r9 != 0) {
                        r9 = zJ;
                        r9 = zI;
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        r9 = zJ;
                        TextPaint paint = layoutM.getPaint();
                        CharSequence text3 = layoutM.getText();
                        c = ' ';
                        j = 4294967295L;
                        Rect rectP = kotlin.math.a.p(paint, text3, layoutM.getLineStart(i9), layoutM.getLineEnd(i9));
                        int lineAscent = layoutM.getLineAscent(i9);
                        int i21 = rectP.top;
                        if (i21 < lineAscent) {
                            r9 = zI;
                            topPadding = lineAscent - i21;
                        } else {
                            r9 = zI;
                            topPadding = layoutM.getTopPadding();
                        }
                        i15 = 1;
                        rectP = iMin != 1 ? kotlin.math.a.p(paint, text3, layoutM.getLineStart(i19), layoutM.getLineEnd(i19)) : rectP;
                        int lineDescent = layoutM.getLineDescent(i19);
                        int i22 = rectP.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutM.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = m.a(topPadding, bottomPadding);
                        }
                    }
                    if (i12 != 0) {
                        i16 = i9;
                    } else {
                        i16 = (int) (jA3 >> c);
                    }
                    if (i13 != 0) {
                        i17 = i9;
                    } else {
                        i17 = (int) (jA3 & j);
                    }
                    jA = m.a(i16, i17);
                }
                i15 = 1;
                if (i12 != 0) {
                    i16 = i9;
                } else {
                    i16 = (int) (jA3 >> c);
                }
                if (i13 != 0) {
                    i17 = i9;
                } else {
                    i17 = (int) (jA3 & j);
                }
                jA = m.a(i16, i17);
            } else {
                jA = m.b;
                th = null;
                c = ' ';
                j = 4294967295L;
                i14 = 33;
                i15 = 1;
            }
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int iMax = i9;
                int i23 = iMax;
                int iMax2 = i23;
                while (i23 < length2) {
                    androidx.compose.ui.text.android.style.h hVar4 = hVarArr[i23];
                    int i24 = hVar4.H;
                    iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                    int i25 = hVar4.I;
                    if (i25 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i25));
                    }
                    i23++;
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? m.b : m.a(iMax, iMax2);
            } else {
                jA2 = m.b;
            }
            this.h = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.i = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            androidx.compose.ui.text.android.style.h[] hVarArr2 = this.o;
            int i26 = this.g - i15;
            Layout layout = this.f;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || hVarArr2 == null || hVarArr2.length == 0) {
                r7 = th;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                if (hVarArr2.length == 0) {
                    androidx.transition.k.m("Array is empty.");
                    throw th;
                }
                androidx.compose.ui.text.android.style.h hVar5 = hVarArr2[i9];
                spannableString.setSpan(new androidx.compose.ui.text.android.style.h(hVar5.e, spannableString.length(), (i26 == 0 || !hVar5.A) ? hVar5.A : i9, hVar5.A, hVar5.B, hVar5.C), i9, spannableString.length(), i14);
                StaticLayout staticLayoutM = n.m(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, f.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM.getLineAscent(i9);
                fontMetricsInt.descent = staticLayoutM.getLineDescent(i9);
                fontMetricsInt.top = staticLayoutM.getLineTop(i9);
                fontMetricsInt.bottom = staticLayoutM.getLineBottom(i9);
                r7 = fontMetricsInt;
            }
            this.n = r7 != 0 ? ((Paint.FontMetricsInt) r7).bottom - ((int) (e(i19) - g(i19))) : i9;
            this.m = r7;
            Layout layout2 = this.f;
            this.j = t.s(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = t.t(layout3, i19, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final androidx.compose.runtime.internal.c c() {
        androidx.compose.runtime.internal.c cVar = this.q;
        if (cVar != null) {
            return cVar;
        }
        androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(this.f);
        this.q = cVar2;
        return cVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = m.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().w(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().w(i, false, z);
    }

    public final androidx.compose.ui.text.android.selection.e j() {
        androidx.compose.ui.text.android.selection.e eVar = this.e;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.f;
        androidx.compose.ui.text.android.selection.e eVar2 = new androidx.compose.ui.text.android.selection.e(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = eVar2;
        return eVar2;
    }
}
