package com.caverock.androidsvg;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.compose.animation.core.u2;
import com.app.mlounge.R;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.fe;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.rc;
import com.google.android.gms.internal.measurement.rf;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.ue;
import com.google.android.gms.internal.measurement.ve;
import com.google.android.gms.internal.measurement.xc;
import com.google.android.gms.internal.measurement.xd;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements com.google.firebase.components.c {
    public static HashSet g;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public x1(int i) {
        switch (i) {
            case 11:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static void C(x xVar, String str) {
        w0 w0VarW = xVar.a.W(str);
        if (w0VarW == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(w0VarW instanceof x)) {
            z("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (w0VarW == xVar) {
            z("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        x xVar2 = (x) w0VarW;
        if (xVar.i == null) {
            xVar.i = xVar2.i;
        }
        if (xVar.j == null) {
            xVar.j = xVar2.j;
        }
        if (xVar.k == 0) {
            xVar.k = xVar2.k;
        }
        if (xVar.h.isEmpty()) {
            xVar.h = xVar2.h;
        }
        try {
            if (xVar instanceof x0) {
                x0 x0Var = (x0) xVar;
                x0 x0Var2 = (x0) w0VarW;
                if (x0Var.m == null) {
                    x0Var.m = x0Var2.m;
                }
                if (x0Var.n == null) {
                    x0Var.n = x0Var2.n;
                }
                if (x0Var.o == null) {
                    x0Var.o = x0Var2.o;
                }
                if (x0Var.p == null) {
                    x0Var.p = x0Var2.p;
                }
            } else {
                D((b1) xVar, (b1) w0VarW);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = xVar2.l;
        if (str2 != null) {
            C(xVar, str2);
        }
    }

    public static void D(b1 b1Var, b1 b1Var2) {
        if (b1Var.m == null) {
            b1Var.m = b1Var2.m;
        }
        if (b1Var.n == null) {
            b1Var.n = b1Var2.n;
        }
        if (b1Var.o == null) {
            b1Var.o = b1Var2.o;
        }
        if (b1Var.p == null) {
            b1Var.p = b1Var2.p;
        }
        if (b1Var.q == null) {
            b1Var.q = b1Var2.q;
        }
    }

    public static void E(k0 k0Var, String str) {
        w0 w0VarW = k0Var.a.W(str);
        if (w0VarW == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(w0VarW instanceof k0)) {
            z("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (w0VarW == k0Var) {
            z("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        k0 k0Var2 = (k0) w0VarW;
        if (k0Var.p == null) {
            k0Var.p = k0Var2.p;
        }
        if (k0Var.q == null) {
            k0Var.q = k0Var2.q;
        }
        if (k0Var.r == null) {
            k0Var.r = k0Var2.r;
        }
        if (k0Var.s == null) {
            k0Var.s = k0Var2.s;
        }
        if (k0Var.t == null) {
            k0Var.t = k0Var2.t;
        }
        if (k0Var.u == null) {
            k0Var.u = k0Var2.u;
        }
        if (k0Var.v == null) {
            k0Var.v = k0Var2.v;
        }
        if (k0Var.i.isEmpty()) {
            k0Var.i = k0Var2.i;
        }
        if (k0Var.o == null) {
            k0Var.o = k0Var2.o;
        }
        if (k0Var.n == null) {
            k0Var.n = k0Var2.n;
        }
        String str2 = k0Var2.w;
        if (str2 != null) {
            E(k0Var, str2);
        }
    }

    public static androidx.media3.exoplayer.source.v F(androidx.media3.common.q0 q0Var, com.google.common.collect.h0 h0Var, androidx.media3.exoplayer.source.v vVar, androidx.media3.common.t0 t0Var) {
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        androidx.media3.common.v0 v0VarL = c0Var.l();
        int i = c0Var.i();
        Object objL = v0VarL.p() ? null : v0VarL.l(i);
        int iB = (c0Var.x() || v0VarL.p()) ? -1 : v0VarL.f(i, t0Var, false).b(androidx.media3.common.util.i0.Q(c0Var.j()) - t0Var.e);
        for (int i2 = 0; i2 < h0Var.size(); i2++) {
            androidx.media3.exoplayer.source.v vVar2 = (androidx.media3.exoplayer.source.v) h0Var.get(i2);
            if (P(vVar2, objL, c0Var.x(), c0Var.f(), c0Var.g(), iB)) {
                return vVar2;
            }
        }
        if (h0Var.isEmpty() && vVar != null && P(vVar, objL, c0Var.x(), c0Var.f(), c0Var.g(), iB)) {
            return vVar;
        }
        return null;
    }

    public static LayerDrawable M(androidx.appcompat.widget.t1 t1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = t1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = t1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean P(androidx.media3.exoplayer.source.v vVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = vVar.a;
        int i4 = vVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && vVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && vVar.e == i3;
    }

    public static boolean Q(q0 q0Var, long j) {
        return (q0Var.e & j) != 0;
    }

    public static Path U(l0 l0Var) {
        Path path = new Path();
        float[] fArr = l0Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = l0Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (l0Var instanceof m0) {
            path.close();
        }
        if (l0Var.h == null) {
            l0Var.h = m(path);
        }
        return path;
    }

    public static void h(androidx.media3.datasource.cache.i iVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = iVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static void i(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, j0 j0Var) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            j0Var.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            j0Var.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static boolean k(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void k0(v1 v1Var, boolean z, z0 z0Var) {
        int i;
        q0 q0Var = v1Var.a;
        float fFloatValue = (z ? q0Var.z : q0Var.B).floatValue();
        if (z0Var instanceof t) {
            i = ((t) z0Var).e;
        } else if (!(z0Var instanceof u)) {
            return;
        } else {
            i = v1Var.a.H.e;
        }
        int iS = s(i, fFloatValue);
        if (z) {
            v1Var.d.setColor(iS);
        } else {
            v1Var.e.setColor(iS);
        }
    }

    public static void l0(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = androidx.appcompat.widget.s.b;
        }
        drawableMutate.setColorFilter(androidx.appcompat.widget.s.b(i, mode));
    }

    public static androidx.compose.ui.geometry.a m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix o(androidx.compose.ui.geometry.a r9, androidx.compose.ui.geometry.a r10, com.caverock.androidsvg.q r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            com.caverock.androidsvg.p r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            com.caverock.androidsvg.q r6 = com.caverock.androidsvg.q.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.x1.o(androidx.compose.ui.geometry.a, androidx.compose.ui.geometry.a, com.caverock.androidsvg.q):android.graphics.Matrix");
    }

    public static Typeface r(String str, Integer num, int i) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int s(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static ColorStateList t(Context context, int i) {
        int iC = androidx.appcompat.widget.y1.c(context, R.attr.colorControlHighlight);
        int iB = androidx.appcompat.widget.y1.b(context, R.attr.colorButtonNormal);
        int[] iArr = androidx.appcompat.widget.y1.b;
        int[] iArr2 = androidx.appcompat.widget.y1.d;
        int iB2 = androidx.core.graphics.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, androidx.appcompat.widget.y1.c, androidx.appcompat.widget.y1.f}, new int[]{iB, iB2, androidx.core.graphics.a.b(iC, i), i});
    }

    public static void z(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public void A(j1 j1Var, StringBuilder sb) {
        Iterator it = j1Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var instanceof j1) {
                A((j1) y0Var, sb);
            } else if (y0Var instanceof m1) {
                sb.append(q0(((m1) y0Var).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public Uri A0() {
        String strM;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = ud.a;
        Account account2 = (Account) this.d;
        ka.e(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        ka.e(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        ka.e(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ud.a.equals(account2)) {
            strM = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM = androidx.compose.runtime.j.m(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(strM.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        androidx.room.b0.i(sb, "/", str, "/", str2);
        String strN = androidx.compose.runtime.j.n(sb, "/", strM, "/", str5);
        com.google.common.collect.a1 a1VarG = ((com.google.common.collect.d0) this.f).g();
        Pattern pattern = fe.a;
        return new Uri.Builder().scheme("android").authority((String) this.a).path(strN).encodedFragment(a1VarG.isEmpty() ? null : "transform=".concat(new androidx.emoji2.text.r("+").d(a1VarG))).build();
    }

    public com.google.android.gms.tasks.s B(com.google.android.gms.tasks.s sVar) {
        return sVar.j(new androidx.arch.core.executor.a(2), new com.google.firebase.i(this, 28));
    }

    public com.google.common.util.concurrent.r B0(int i) {
        com.google.common.util.concurrent.d0 d0Var;
        AtomicLong atomicLong = (AtomicLong) this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            com.google.common.util.concurrent.n0 n0Var = com.google.common.util.concurrent.n0.E;
            return n0Var != null ? n0Var : new com.google.common.util.concurrent.n0();
        }
        ve veVar = new ve(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.c;
            ve veVar2 = (ve) atomicReference.get();
            if (veVar2 != null && veVar2.E > i) {
                com.google.common.util.concurrent.n0 n0Var2 = com.google.common.util.concurrent.n0.E;
                return n0Var2 != null ? n0Var2 : new com.google.common.util.concurrent.n0();
            }
            do {
                if (atomicReference.compareAndSet(veVar2, veVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        veVar.cancel(true);
                        while (!atomicReference.compareAndSet(veVar, null) && atomicReference.get() == veVar) {
                        }
                        return veVar;
                    }
                    rc rcVar = (rc) this.a;
                    com.google.common.util.concurrent.y yVar = (com.google.common.util.concurrent.y) rcVar.y;
                    if (yVar == null || (d0Var = (com.google.common.util.concurrent.d0) rcVar.z) == null) {
                        veVar.n((com.google.common.util.concurrent.x0) this.f);
                        return veVar;
                    }
                    j5 j5VarA = rf.a(yVar);
                    com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0();
                    z0Var.F = new com.google.common.util.concurrent.y0(z0Var, j5VarA);
                    d0Var.execute(z0Var);
                    veVar.n(z0Var);
                    return veVar;
                }
            } while (atomicReference.get() == veVar2);
        }
    }

    public v1 G(w0 w0Var) {
        v1 v1Var = new v1();
        t0(v1Var, q0.a());
        H(w0Var, v1Var);
        return v1Var;
    }

    public void H(y0 y0Var, v1 v1Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (y0Var instanceof w0) {
                arrayList.add(0, (w0) y0Var);
            }
            Object obj = y0Var.b;
            if (obj == null) {
                break;
            } else {
                y0Var = (y0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u0(v1Var, (w0) it.next());
        }
        v1 v1Var2 = (v1) this.c;
        v1Var.g = v1Var2.g;
        v1Var.f = v1Var2.f;
    }

    public androidx.media3.datasource.cache.g I(String str) {
        return (androidx.media3.datasource.cache.g) ((HashMap) this.a).get(str);
    }

    public int J() {
        int i;
        q0 q0Var = ((v1) this.c).a;
        if (q0Var.f0 == 1 || (i = q0Var.g0) == 2) {
            return q0Var.g0;
        }
        return i == 1 ? 3 : 1;
    }

    public com.google.firebase.components.p K(Class cls) {
        return g(com.google.firebase.components.r.a(cls));
    }

    public androidx.media3.datasource.cache.g L(String str) {
        HashMap map = (HashMap) this.a;
        androidx.media3.datasource.cache.g gVar = (androidx.media3.datasource.cache.g) map.get(str);
        if (gVar != null) {
            return gVar;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        androidx.media3.datasource.cache.g gVar2 = new androidx.media3.datasource.cache.g(iKeyAt, str, androidx.media3.datasource.cache.i.c);
        map.put(str, gVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((androidx.compose.material.ripple.g) this.e).f(gVar2);
        return gVar2;
    }

    public ColorStateList N(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return _COROUTINE.a.L(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return _COROUTINE.a.L(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return t(context, androidx.appcompat.widget.y1.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return t(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return t(context, androidx.appcompat.widget.y1.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return _COROUTINE.a.L(context, R.color.abc_tint_spinner);
            }
            if (k(i, (int[]) this.b)) {
                return androidx.appcompat.widget.y1.d(context, R.attr.colorControlNormal);
            }
            if (k(i, (int[]) this.e)) {
                return _COROUTINE.a.L(context, R.color.abc_tint_default);
            }
            if (k(i, (int[]) this.f)) {
                return _COROUTINE.a.L(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return _COROUTINE.a.L(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = androidx.appcompat.widget.y1.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = androidx.appcompat.widget.y1.b;
            iArr2[0] = androidx.appcompat.widget.y1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = androidx.appcompat.widget.y1.e;
            iArr2[1] = androidx.appcompat.widget.y1.c(context, R.attr.colorControlActivated);
            iArr[2] = androidx.appcompat.widget.y1.f;
            iArr2[2] = androidx.appcompat.widget.y1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = androidx.appcompat.widget.y1.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = androidx.appcompat.widget.y1.e;
            iArr2[1] = androidx.appcompat.widget.y1.c(context, R.attr.colorControlActivated);
            iArr[2] = androidx.appcompat.widget.y1.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void O(long j) {
        androidx.compose.material.ripple.g gVar;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        androidx.compose.material.ripple.g gVar2 = (androidx.compose.material.ripple.g) this.e;
        gVar2.getClass();
        androidx.compose.material.ripple.g gVar3 = (androidx.compose.material.ripple.g) this.f;
        if (gVar3 != null) {
            gVar3.getClass();
        }
        if (gVar2.b() || (gVar = (androidx.compose.material.ripple.g) this.f) == null || !gVar.b()) {
            gVar2.e(map, sparseArray);
        } else {
            ((androidx.compose.material.ripple.g) this.f).e(map, sparseArray);
            gVar2.j(map);
        }
        androidx.compose.material.ripple.g gVar4 = (androidx.compose.material.ripple.g) this.f;
        if (gVar4 != null) {
            androidx.localbroadcastmanager.content.b bVar = (androidx.localbroadcastmanager.content.b) gVar4.d;
            ((File) bVar.y).delete();
            ((File) bVar.z).delete();
            this.f = null;
        }
    }

    public okio.r R() throws IOException {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        Object obj = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.d dVar = obj != null ? (okhttp3.internal.platform.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f);
            inputStreamOpen.getClass();
            return okio.b.e(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            kotlinx.coroutines.future.a.w("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        kotlinx.coroutines.future.a.w("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public Path S(r rVar) {
        c0 c0Var = rVar.o;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = rVar.p;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        float fA = rVar.q.a(this);
        float f = fD - fA;
        float f2 = fE - fA;
        float f3 = fD + fA;
        float f4 = fE + fA;
        if (rVar.h == null) {
            float f5 = 2.0f * fA;
            rVar.h = new androidx.compose.ui.geometry.a(f, f2, f5, f5);
        }
        float f6 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f6;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f6;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    public Path T(w wVar) {
        c0 c0Var = wVar.o;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = wVar.p;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        float fD2 = wVar.q.d(this);
        float fE2 = wVar.r.e(this);
        float f = fD - fD2;
        float f2 = fE - fE2;
        float f3 = fD + fD2;
        float f4 = fE + fE2;
        if (wVar.h == null) {
            wVar.h = new androidx.compose.ui.geometry.a(f, f2, fD2 * 2.0f, 2.0f * fE2);
        }
        float f5 = fD2 * 0.5522848f;
        float f6 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f5;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f5;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public Path V(n0 n0Var) {
        float fD;
        float fE;
        float fMin;
        c0 c0Var;
        float fD2;
        c0 c0Var2;
        float fE2;
        float fD3;
        float fE3;
        float f;
        float f2;
        Path path;
        c0 c0Var3 = n0Var.s;
        if (c0Var3 == null && n0Var.t == null) {
            fD = 0.0f;
        } else {
            c0 c0Var4 = n0Var.t;
            if (c0Var3 != null) {
                if (c0Var4 == null) {
                    fD = c0Var3.d(this);
                } else {
                    fD = c0Var3.d(this);
                    fE = n0Var.t.e(this);
                }
                fMin = Math.min(fD, n0Var.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, n0Var.r.e(this) / 2.0f);
                c0Var = n0Var.o;
                if (c0Var != null) {
                    fD2 = c0Var.d(this);
                } else {
                    fD2 = 0.0f;
                }
                c0Var2 = n0Var.p;
                if (c0Var2 != null) {
                    fE2 = c0Var2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = n0Var.q.d(this);
                fE3 = n0Var.r.e(this);
                if (n0Var.h == null) {
                    n0Var.h = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fE3);
                }
                f = fD3 + fD2;
                f2 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f, fE2);
                    path.lineTo(f, f2);
                    path.lineTo(fD2, f2);
                    path.lineTo(fD2, fE2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fE2 + fMin2;
                    path.moveTo(fD2, f5);
                    float f6 = f5 - f4;
                    float f7 = fD2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fD2, f6, f8, fE2, f7, fE2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fE2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fE2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fD2;
                    path.cubicTo(f8, f2, f13, f12, fD2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fD = c0Var4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, n0Var.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, n0Var.r.e(this) / 2.0f);
        c0Var = n0Var.o;
        if (c0Var != null) {
            fD2 = c0Var.d(this);
        } else {
            fD2 = 0.0f;
        }
        c0Var2 = n0Var.p;
        if (c0Var2 != null) {
            fE2 = c0Var2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = n0Var.q.d(this);
        fE3 = n0Var.r.e(this);
        if (n0Var.h == null) {
            n0Var.h = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fE3);
        }
        f = fD3 + fD2;
        f2 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public androidx.compose.ui.geometry.a W(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        v1 v1Var = (v1) this.c;
        androidx.compose.ui.geometry.a aVar = v1Var.g;
        if (aVar == null) {
            aVar = v1Var.f;
        }
        return new androidx.compose.ui.geometry.a(fD, fE, c0Var3 != null ? c0Var3.d(this) : aVar.d, c0Var4 != null ? c0Var4.e(this) : aVar.e);
    }

    public void X(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        androidx.media3.datasource.cache.g gVar = (androidx.media3.datasource.cache.g) map.get(str);
        if (gVar != null && gVar.c.isEmpty() && gVar.d.isEmpty()) {
            map.remove(str);
            int i = gVar.a;
            boolean z = sparseBooleanArray.get(i);
            ((androidx.compose.material.ripple.g) this.e).a = true;
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public Path Y(v0 v0Var, boolean z) {
        Path path;
        Path pathY;
        Path pathL;
        ((Stack) this.d).push((v1) this.c);
        v1 v1Var = new v1((v1) this.c);
        this.c = v1Var;
        u0(v1Var, v0Var);
        if (!v() || !w0()) {
            this.c = (v1) ((Stack) this.d).pop();
            return null;
        }
        if (v0Var instanceof n1) {
            if (!z) {
                z("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            n1 n1Var = (n1) v0Var;
            w0 w0VarW = v0Var.a.W(n1Var.o);
            if (w0VarW == null) {
                z("Use reference '%s' not found", n1Var.o);
                this.c = (v1) ((Stack) this.d).pop();
                return null;
            }
            if (!(w0VarW instanceof v0)) {
                this.c = (v1) ((Stack) this.d).pop();
                return null;
            }
            pathY = Y((v0) w0VarW, false);
            if (pathY != null) {
                if (n1Var.h == null) {
                    n1Var.h = m(pathY);
                }
                Matrix matrix = n1Var.n;
                if (matrix != null) {
                    pathY.transform(matrix);
                }
                if (((v1) this.c).a.U != null && (pathL = l(v0Var, v0Var.h)) != null) {
                    pathY.op(pathL, Path.Op.INTERSECT);
                }
                this.c = (v1) ((Stack) this.d).pop();
                return pathY;
            }
            return null;
        }
        if (v0Var instanceof y) {
            y yVar = (y) v0Var;
            if (v0Var instanceof i0) {
                r1 r1Var = new r1(((i0) v0Var).o);
                androidx.compose.ui.geometry.a aVar = v0Var.h;
                Path path2 = r1Var.a;
                if (aVar == null) {
                    v0Var.h = m(path2);
                }
                path = path2;
            } else if (v0Var instanceof n0) {
                path = V((n0) v0Var);
            } else if (v0Var instanceof r) {
                path = S((r) v0Var);
            } else if (v0Var instanceof w) {
                path = T((w) v0Var);
            } else {
                path = v0Var instanceof l0 ? U((l0) v0Var) : null;
            }
            if (path != null) {
                if (yVar.h == null) {
                    yVar.h = m(path);
                }
                Matrix matrix2 = yVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((v1) this.c).a.h0;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(v0Var instanceof h1)) {
            z("Invalid %s element found in clipPath definition", v0Var.n());
            return null;
        }
        h1 h1Var = (h1) v0Var;
        ArrayList arrayList = h1Var.n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((c0) h1Var.n.get(0)).d(this);
        ArrayList arrayList2 = h1Var.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((c0) h1Var.o.get(0)).e(this);
        ArrayList arrayList3 = h1Var.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) h1Var.p.get(0)).d(this);
        ArrayList arrayList4 = h1Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((c0) h1Var.q.get(0)).e(this);
        }
        if (((v1) this.c).a.g0 != 1) {
            float fN = n(h1Var);
            if (((v1) this.c).a.g0 == 2) {
                fN /= 2.0f;
            }
            fD -= fN;
        }
        if (h1Var.h == null) {
            u1 u1Var = new u1(this, fD, fE2);
            y(h1Var, u1Var);
            RectF rectF = (RectF) u1Var.K;
            h1Var.h = new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), ((RectF) u1Var.K).height());
        }
        path = new Path();
        y(h1Var, new u1(this, fD + fD2, fE2 + fE, path));
        Matrix matrix3 = h1Var.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((v1) this.c).a.h0;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathY = path;
        if (((v1) this.c).a.U != null) {
            pathY.op(pathL, Path.Op.INTERSECT);
        }
        this.c = (v1) ((Stack) this.d).pop();
        return pathY;
    }

    public void Z(androidx.compose.ui.geometry.a aVar) {
        Canvas canvas = (Canvas) this.a;
        if (((v1) this.c).a.V != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            f0 f0Var = (f0) ((androidx.appcompat.widget.c2) this.b).W(((v1) this.c).a.V);
            h0(f0Var, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            h0(f0Var, aVar);
            canvas.restore();
            canvas.restore();
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public Object a(Class cls) {
        if (!((Set) this.a).contains(com.google.firebase.components.r.a(cls))) {
            com.google.firebase.i.b(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((com.google.firebase.components.c) this.f).a(cls);
        if (!cls.equals(com.google.firebase.events.b.class)) {
            return objA;
        }
        return new com.google.firebase.components.s();
    }

    public boolean a0() {
        w0 w0VarW;
        int i = 0;
        if (((v1) this.c).a.G.floatValue() >= 1.0f && ((v1) this.c).a.V == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.a;
        int iFloatValue = (int) (((v1) this.c).a.G.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.d).push((v1) this.c);
        v1 v1Var = new v1((v1) this.c);
        this.c = v1Var;
        String str = v1Var.a.V;
        if (str != null && ((w0VarW = ((androidx.appcompat.widget.c2) this.b).W(str)) == null || !(w0VarW instanceof f0))) {
            z("Mask reference '%s' not found", ((v1) this.c).a.V);
            ((v1) this.c).a.V = null;
        }
        return true;
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b b(com.google.firebase.components.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).b(rVar);
        }
        com.google.firebase.i.b(rVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    public void b0() {
        try {
            okio.b0 b0Var = new okio.b0(R());
            try {
                okio.i iVarL = b0Var.l(b0Var.readInt());
                okio.i iVarL2 = b0Var.l(b0Var.readInt());
                b0Var.close();
                synchronized (this) {
                    iVarL.getClass();
                    this.c = iVarL;
                    iVarL2.getClass();
                    this.d = iVarL2;
                }
                ((CountDownLatch) this.b).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(b0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.b).countDown();
            throw th3;
        }
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b c(Class cls) {
        return b(com.google.firebase.components.r.a(cls));
    }

    public void c0(r0 r0Var, androidx.compose.ui.geometry.a aVar, androidx.compose.ui.geometry.a aVar2, q qVar) {
        if (aVar.d == 0.0f || aVar.e == 0.0f) {
            return;
        }
        if (qVar == null && (qVar = r0Var.n) == null) {
            qVar = q.d;
        }
        u0((v1) this.c, r0Var);
        if (v()) {
            v1 v1Var = (v1) this.c;
            v1Var.f = aVar;
            if (!v1Var.a.L.booleanValue()) {
                androidx.compose.ui.geometry.a aVar3 = ((v1) this.c).f;
                i0(aVar3.b, aVar3.c, aVar3.d, aVar3.e);
            }
            p(r0Var, ((v1) this.c).f);
            Canvas canvas = (Canvas) this.a;
            v1 v1Var2 = (v1) this.c;
            if (aVar2 != null) {
                canvas.concat(o(v1Var2.f, aVar2, qVar));
                ((v1) this.c).g = r0Var.o;
            } else {
                androidx.compose.ui.geometry.a aVar4 = v1Var2.f;
                canvas.translate(aVar4.b, aVar4.c);
            }
            boolean zA0 = a0();
            v0();
            e0(r0Var, true);
            if (zA0) {
                Z(r0Var.h);
            }
            s0(r0Var);
        }
    }

    @Override // com.google.firebase.components.c
    public Set d(com.google.firebase.components.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).d(rVar);
        }
        com.google.firebase.i.b(rVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d0(y0 y0Var) {
        c0 c0Var;
        String str;
        int iIndexOf;
        Set setA;
        c0 c0Var2;
        Boolean bool;
        if (y0Var instanceof g0) {
            return;
        }
        o0();
        if ((y0Var instanceof w0) && (bool = ((w0) y0Var).d) != null) {
            ((v1) this.c).h = bool.booleanValue();
        }
        if (y0Var instanceof r0) {
            r0 r0Var = (r0) y0Var;
            c0(r0Var, W(r0Var.p, r0Var.q, r0Var.r, r0Var.s), r0Var.o, r0Var.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (y0Var instanceof n1) {
                n1 n1Var = (n1) y0Var;
                Canvas canvas = (Canvas) this.a;
                c0 c0Var3 = n1Var.r;
                if ((c0Var3 == null || !c0Var3.g()) && ((c0Var2 = n1Var.s) == null || !c0Var2.g())) {
                    u0((v1) this.c, n1Var);
                    if (v()) {
                        y0 y0VarW = n1Var.a.W(n1Var.o);
                        if (y0VarW == null) {
                            z("Use reference '%s' not found", n1Var.o);
                        } else {
                            Matrix matrix = n1Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            c0 c0Var4 = n1Var.p;
                            float fD = c0Var4 != null ? c0Var4.d(this) : 0.0f;
                            c0 c0Var5 = n1Var.q;
                            canvas.translate(fD, c0Var5 != null ? c0Var5.e(this) : 0.0f);
                            p(n1Var, n1Var.h);
                            boolean zA0 = a0();
                            ((Stack) this.e).push(n1Var);
                            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
                            if (y0VarW instanceof r0) {
                                r0 r0Var2 = (r0) y0VarW;
                                androidx.compose.ui.geometry.a aVarW = W(null, null, n1Var.r, n1Var.s);
                                o0();
                                c0(r0Var2, aVarW, r0Var2.o, r0Var2.n);
                                n0();
                            } else if (y0VarW instanceof e1) {
                                c0 c0Var6 = n1Var.r;
                                if (c0Var6 == null) {
                                    c0Var6 = new c0(9, 100.0f);
                                }
                                c0 c0Var7 = n1Var.s;
                                if (c0Var7 == null) {
                                    c0Var7 = new c0(9, 100.0f);
                                }
                                androidx.compose.ui.geometry.a aVarW2 = W(null, null, c0Var6, c0Var7);
                                o0();
                                e1 e1Var = (e1) y0VarW;
                                if (aVarW2.d != 0.0f && aVarW2.e != 0.0f) {
                                    q qVar = e1Var.n;
                                    if (qVar == null) {
                                        qVar = q.d;
                                    }
                                    u0((v1) this.c, e1Var);
                                    v1 v1Var = (v1) this.c;
                                    v1Var.f = aVarW2;
                                    if (!v1Var.a.L.booleanValue()) {
                                        androidx.compose.ui.geometry.a aVar = ((v1) this.c).f;
                                        i0(aVar.b, aVar.c, aVar.d, aVar.e);
                                    }
                                    androidx.compose.ui.geometry.a aVar2 = e1Var.o;
                                    v1 v1Var2 = (v1) this.c;
                                    if (aVar2 != null) {
                                        canvas.concat(o(v1Var2.f, aVar2, qVar));
                                        ((v1) this.c).g = e1Var.o;
                                    } else {
                                        androidx.compose.ui.geometry.a aVar3 = v1Var2.f;
                                        canvas.translate(aVar3.b, aVar3.c);
                                    }
                                    boolean zA1 = a0();
                                    e0(e1Var, true);
                                    if (zA1) {
                                        Z(e1Var.h);
                                    }
                                    s0(e1Var);
                                }
                                n0();
                            } else {
                                d0(y0VarW);
                            }
                            ((Stack) this.e).pop();
                            ((Stack) this.f).pop();
                            if (zA0) {
                                Z(n1Var.h);
                            }
                            s0(n1Var);
                        }
                    }
                }
            } else if (y0Var instanceof d1) {
                d1 d1Var = (d1) y0Var;
                u0((v1) this.c, d1Var);
                if (v()) {
                    Matrix matrix2 = d1Var.n;
                    if (matrix2 != null) {
                        ((Canvas) this.a).concat(matrix2);
                    }
                    p(d1Var, d1Var.h);
                    boolean zA2 = a0();
                    String language = Locale.getDefault().getLanguage();
                    for (y0 y0Var2 : d1Var.i) {
                        if (y0Var2 instanceof s0) {
                            s0 s0Var = (s0) y0Var2;
                            if (s0Var.c() == null && ((setA = s0Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setF = s0Var.f();
                                if (setF != null) {
                                    if (g == null) {
                                        synchronized (x1.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setF.isEmpty() || !g.containsAll(setF)) {
                                    }
                                }
                                Set setL = s0Var.l();
                                if (setL == null) {
                                    Set setM = s0Var.m();
                                    if (setM == null) {
                                        d0(y0Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zA2) {
                        Z(d1Var.h);
                    }
                    s0(d1Var);
                }
            } else if (y0Var instanceof z) {
                z zVar = (z) y0Var;
                u0((v1) this.c, zVar);
                if (v()) {
                    Matrix matrix3 = zVar.n;
                    if (matrix3 != null) {
                        ((Canvas) this.a).concat(matrix3);
                    }
                    p(zVar, zVar.h);
                    boolean zA3 = a0();
                    e0(zVar, true);
                    if (zA3) {
                        Z(zVar.h);
                    }
                    s0(zVar);
                }
            } else if (y0Var instanceof b0) {
                b0 b0Var = (b0) y0Var;
                Canvas canvas2 = (Canvas) this.a;
                c0 c0Var8 = b0Var.r;
                if (c0Var8 != null && !c0Var8.g() && (c0Var = b0Var.s) != null && !c0Var.g() && (str = b0Var.o) != null) {
                    q qVar2 = b0Var.n;
                    if (qVar2 == null) {
                        qVar2 = q.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        androidx.compose.ui.geometry.a aVar4 = new androidx.compose.ui.geometry.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        u0((v1) this.c, b0Var);
                        if (v() && w0()) {
                            Matrix matrix4 = b0Var.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            c0 c0Var9 = b0Var.p;
                            float fD2 = c0Var9 != null ? c0Var9.d(this) : 0.0f;
                            c0 c0Var10 = b0Var.q;
                            float fE2 = c0Var10 != null ? c0Var10.e(this) : 0.0f;
                            float fD3 = b0Var.r.d(this);
                            float fD4 = b0Var.s.d(this);
                            v1 v1Var3 = (v1) this.c;
                            v1Var3.f = new androidx.compose.ui.geometry.a(fD2, fE2, fD3, fD4);
                            if (!v1Var3.a.L.booleanValue()) {
                                androidx.compose.ui.geometry.a aVar5 = ((v1) this.c).f;
                                i0(aVar5.b, aVar5.c, aVar5.d, aVar5.e);
                            }
                            b0Var.h = ((v1) this.c).f;
                            s0(b0Var);
                            p(b0Var, b0Var.h);
                            boolean zA4 = a0();
                            v0();
                            canvas2.save();
                            canvas2.concat(o(((v1) this.c).f, aVar4, qVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((v1) this.c).a.j0 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zA4) {
                                Z(b0Var.h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof i0) {
                i0 i0Var = (i0) y0Var;
                if (i0Var.o != null) {
                    u0((v1) this.c, i0Var);
                    if (v() && w0()) {
                        v1 v1Var4 = (v1) this.c;
                        if (v1Var4.c || v1Var4.b) {
                            Matrix matrix5 = i0Var.n;
                            if (matrix5 != null) {
                                ((Canvas) this.a).concat(matrix5);
                            }
                            Path path = new r1(i0Var.o).a;
                            if (i0Var.h == null) {
                                i0Var.h = m(path);
                            }
                            s0(i0Var);
                            q(i0Var);
                            p(i0Var, i0Var.h);
                            boolean zA5 = a0();
                            v1 v1Var5 = (v1) this.c;
                            if (v1Var5.b) {
                                int i = v1Var5.a.a0;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                w(i0Var, path);
                            }
                            if (((v1) this.c).c) {
                                x(path);
                            }
                            g0(i0Var);
                            if (zA5) {
                                Z(i0Var.h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof n0) {
                n0 n0Var = (n0) y0Var;
                c0 c0Var11 = n0Var.q;
                if (c0Var11 != null && n0Var.r != null && !c0Var11.g() && !n0Var.r.g()) {
                    u0((v1) this.c, n0Var);
                    if (v() && w0()) {
                        Matrix matrix6 = n0Var.n;
                        if (matrix6 != null) {
                            ((Canvas) this.a).concat(matrix6);
                        }
                        Path pathV = V(n0Var);
                        s0(n0Var);
                        q(n0Var);
                        p(n0Var, n0Var.h);
                        boolean zA6 = a0();
                        if (((v1) this.c).b) {
                            w(n0Var, pathV);
                        }
                        if (((v1) this.c).c) {
                            x(pathV);
                        }
                        if (zA6) {
                            Z(n0Var.h);
                        }
                    }
                }
            } else if (y0Var instanceof r) {
                r rVar = (r) y0Var;
                c0 c0Var12 = rVar.q;
                if (c0Var12 != null && !c0Var12.g()) {
                    u0((v1) this.c, rVar);
                    if (v() && w0()) {
                        Matrix matrix7 = rVar.n;
                        if (matrix7 != null) {
                            ((Canvas) this.a).concat(matrix7);
                        }
                        Path pathS = S(rVar);
                        s0(rVar);
                        q(rVar);
                        p(rVar, rVar.h);
                        boolean zA7 = a0();
                        if (((v1) this.c).b) {
                            w(rVar, pathS);
                        }
                        if (((v1) this.c).c) {
                            x(pathS);
                        }
                        if (zA7) {
                            Z(rVar.h);
                        }
                    }
                }
            } else if (y0Var instanceof w) {
                w wVar = (w) y0Var;
                c0 c0Var13 = wVar.q;
                if (c0Var13 != null && wVar.r != null && !c0Var13.g() && !wVar.r.g()) {
                    u0((v1) this.c, wVar);
                    if (v() && w0()) {
                        Matrix matrix8 = wVar.n;
                        if (matrix8 != null) {
                            ((Canvas) this.a).concat(matrix8);
                        }
                        Path pathT = T(wVar);
                        s0(wVar);
                        q(wVar);
                        p(wVar, wVar.h);
                        boolean zA8 = a0();
                        if (((v1) this.c).b) {
                            w(wVar, pathT);
                        }
                        if (((v1) this.c).c) {
                            x(pathT);
                        }
                        if (zA8) {
                            Z(wVar.h);
                        }
                    }
                }
            } else if (y0Var instanceof d0) {
                d0 d0Var = (d0) y0Var;
                u0((v1) this.c, d0Var);
                if (v() && w0() && ((v1) this.c).c) {
                    Matrix matrix9 = d0Var.n;
                    if (matrix9 != null) {
                        ((Canvas) this.a).concat(matrix9);
                    }
                    c0 c0Var14 = d0Var.o;
                    float fD5 = c0Var14 == null ? 0.0f : c0Var14.d(this);
                    c0 c0Var15 = d0Var.p;
                    float fE3 = c0Var15 == null ? 0.0f : c0Var15.e(this);
                    c0 c0Var16 = d0Var.q;
                    float fD6 = c0Var16 == null ? 0.0f : c0Var16.d(this);
                    c0 c0Var17 = d0Var.r;
                    fE = c0Var17 != null ? c0Var17.e(this) : 0.0f;
                    if (d0Var.h == null) {
                        d0Var.h = new androidx.compose.ui.geometry.a(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    s0(d0Var);
                    q(d0Var);
                    p(d0Var, d0Var.h);
                    boolean zA9 = a0();
                    x(path2);
                    g0(d0Var);
                    if (zA9) {
                        Z(d0Var.h);
                    }
                }
            } else if (y0Var instanceof m0) {
                m0 m0Var = (m0) y0Var;
                u0((v1) this.c, m0Var);
                if (v() && w0()) {
                    v1 v1Var6 = (v1) this.c;
                    if (v1Var6.c || v1Var6.b) {
                        Matrix matrix10 = m0Var.n;
                        if (matrix10 != null) {
                            ((Canvas) this.a).concat(matrix10);
                        }
                        if (m0Var.o.length >= 2) {
                            Path pathU = U(m0Var);
                            s0(m0Var);
                            q(m0Var);
                            p(m0Var, m0Var.h);
                            boolean zA10 = a0();
                            if (((v1) this.c).b) {
                                w(m0Var, pathU);
                            }
                            if (((v1) this.c).c) {
                                x(pathU);
                            }
                            g0(m0Var);
                            if (zA10) {
                                Z(m0Var.h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof l0) {
                l0 l0Var = (l0) y0Var;
                u0((v1) this.c, l0Var);
                if (v() && w0()) {
                    v1 v1Var7 = (v1) this.c;
                    if (v1Var7.c || v1Var7.b) {
                        Matrix matrix11 = l0Var.n;
                        if (matrix11 != null) {
                            ((Canvas) this.a).concat(matrix11);
                        }
                        if (l0Var.o.length >= 2) {
                            Path pathU2 = U(l0Var);
                            s0(l0Var);
                            int i2 = ((v1) this.c).a.a0;
                            pathU2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            q(l0Var);
                            p(l0Var, l0Var.h);
                            boolean zA11 = a0();
                            if (((v1) this.c).b) {
                                w(l0Var, pathU2);
                            }
                            if (((v1) this.c).c) {
                                x(pathU2);
                            }
                            g0(l0Var);
                            if (zA11) {
                                Z(l0Var.h);
                            }
                        }
                    }
                }
            } else if (y0Var instanceof h1) {
                h1 h1Var = (h1) y0Var;
                u0((v1) this.c, h1Var);
                if (v()) {
                    Matrix matrix12 = h1Var.r;
                    if (matrix12 != null) {
                        ((Canvas) this.a).concat(matrix12);
                    }
                    ArrayList arrayList = h1Var.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((c0) h1Var.n.get(0)).d(this);
                    ArrayList arrayList2 = h1Var.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((c0) h1Var.o.get(0)).e(this);
                    ArrayList arrayList3 = h1Var.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) h1Var.p.get(0)).d(this);
                    ArrayList arrayList4 = h1Var.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((c0) h1Var.q.get(0)).e(this);
                    }
                    int iJ = J();
                    if (iJ != 1) {
                        float fN = n(h1Var);
                        if (iJ == 2) {
                            fN /= 2.0f;
                        }
                        fD7 -= fN;
                    }
                    if (h1Var.h == null) {
                        u1 u1Var = new u1(this, fD7, fE4);
                        y(h1Var, u1Var);
                        RectF rectF = (RectF) u1Var.K;
                        h1Var.h = new androidx.compose.ui.geometry.a(rectF.left, rectF.top, rectF.width(), ((RectF) u1Var.K).height());
                    }
                    s0(h1Var);
                    q(h1Var);
                    p(h1Var, h1Var.h);
                    boolean zA12 = a0();
                    y(h1Var, new t1(this, fD7 + fD8, fE4 + fE));
                    if (zA12) {
                        Z(h1Var.h);
                    }
                }
            }
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.inject.b e(com.google.firebase.components.r rVar) {
        if (((Set) this.e).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).e(rVar);
        }
        com.google.firebase.i.b(rVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public void e0(t0 t0Var, boolean z) {
        if (z) {
            ((Stack) this.e).push(t0Var);
            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
        }
        Iterator it = t0Var.i.iterator();
        while (it.hasNext()) {
            d0((y0) it.next());
        }
        if (z) {
            ((Stack) this.e).pop();
            ((Stack) this.f).pop();
        }
    }

    @Override // com.google.firebase.components.c
    public Object f(com.google.firebase.components.r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).f(rVar);
        }
        com.google.firebase.i.b(rVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void f0(e0 e0Var, q1 q1Var) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.a;
        o0();
        Float f4 = e0Var.u;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = q1Var.c;
            if (f6 == 0.0f && q1Var.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(q1Var.d, f6));
            }
        } else {
            fFloatValue = e0Var.u.floatValue();
        }
        float fC = e0Var.p ? 1.0f : ((v1) this.c).a.C.c();
        this.c = G(e0Var);
        Matrix matrix = new Matrix();
        matrix.preTranslate(q1Var.a, q1Var.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fC, fC);
        c0 c0Var = e0Var.q;
        float fD = c0Var != null ? c0Var.d(this) : 0.0f;
        c0 c0Var2 = e0Var.r;
        float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
        c0 c0Var3 = e0Var.s;
        float fD2 = c0Var3 != null ? c0Var3.d(this) : 3.0f;
        c0 c0Var4 = e0Var.t;
        float fE2 = c0Var4 != null ? c0Var4.e(this) : 3.0f;
        androidx.compose.ui.geometry.a aVar = e0Var.o;
        if (aVar != null) {
            float fMax = fD2 / aVar.d;
            float f7 = fE2 / aVar.e;
            q qVar = e0Var.n;
            if (qVar == null) {
                qVar = q.d;
            }
            boolean zEquals = qVar.equals(q.c);
            p pVar = qVar.a;
            if (!zEquals) {
                fMax = qVar.b == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f7);
            canvas.concat(matrix);
            androidx.compose.ui.geometry.a aVar2 = e0Var.o;
            float f8 = aVar2.d * fMax;
            float f9 = aVar2.e * f7;
            int iOrdinal = pVar.ordinal();
            if (iOrdinal == 2) {
                f = (fD2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fD2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fD2 - f8;
                f2 = 0.0f - f;
            }
            switch (pVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fE2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((v1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fE2 - f9;
                    f5 = 0.0f - f3;
                    if (!((v1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((v1) this.c).a.L.booleanValue()) {
                        i0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((v1) this.c).a.L.booleanValue()) {
                i0(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zA0 = a0();
        e0(e0Var, false);
        if (zA0) {
            Z(e0Var.h);
        }
        n0();
    }

    @Override // com.google.firebase.components.c
    public com.google.firebase.components.p g(com.google.firebase.components.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((com.google.firebase.components.c) this.f).g(rVar);
        }
        com.google.firebase.i.b(rVar, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public void g0(y yVar) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        q0 q0Var = ((v1) this.c).a;
        String str = q0Var.N;
        if (str == null && q0Var.O == null && q0Var.P == null) {
            return;
        }
        if (str == null) {
            e0Var = null;
        } else {
            w0 w0VarW = yVar.a.W(str);
            if (w0VarW != null) {
                e0Var = (e0) w0VarW;
            } else {
                z("Marker reference '%s' not found", ((v1) this.c).a.N);
                e0Var = null;
            }
        }
        String str2 = ((v1) this.c).a.O;
        if (str2 == null) {
            e0Var2 = null;
        } else {
            w0 w0VarW2 = yVar.a.W(str2);
            if (w0VarW2 != null) {
                e0Var2 = (e0) w0VarW2;
            } else {
                z("Marker reference '%s' not found", ((v1) this.c).a.O);
                e0Var2 = null;
            }
        }
        String str3 = ((v1) this.c).a.P;
        if (str3 == null) {
            e0Var3 = null;
        } else {
            w0 w0VarW3 = yVar.a.W(str3);
            if (w0VarW3 != null) {
                e0Var3 = (e0) w0VarW3;
            } else {
                z("Marker reference '%s' not found", ((v1) this.c).a.P);
                e0Var3 = null;
            }
        }
        float f4 = 0.0f;
        if (yVar instanceof i0) {
            arrayList = new p1(this, ((i0) yVar).o).a;
            f2 = 0.0f;
            i = 1;
        } else if (yVar instanceof d0) {
            d0 d0Var = (d0) yVar;
            c0 c0Var = d0Var.o;
            float fD = c0Var != null ? c0Var.d(this) : 0.0f;
            c0 c0Var2 = d0Var.p;
            float fE = c0Var2 != null ? c0Var2.e(this) : 0.0f;
            c0 c0Var3 = d0Var.q;
            float fD2 = c0Var3 != null ? c0Var3.d(this) : 0.0f;
            c0 c0Var4 = d0Var.r;
            float fE2 = c0Var4 != null ? c0Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new q1(fD, fE, f5, f6));
            arrayList2.add(new q1(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            l0 l0Var = (l0) yVar;
            int length = l0Var.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = l0Var.o;
                q1 q1Var = new q1(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = q1Var.b;
                    f2 = f4;
                    f3 = q1Var.a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = l0Var.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    q1Var.a(f9, f10);
                    arrayList3.add(q1Var);
                    q1Var = new q1(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (l0Var instanceof m0) {
                    float[] fArr3 = l0Var.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            q1Var.a(f11, f12);
                            arrayList3.add(q1Var);
                            q1 q1Var2 = new q1(f11, f12, f11 - f3, f12 - f);
                            q1Var2.b((q1) arrayList3.get(0));
                            arrayList3.add(q1Var2);
                            arrayList3.set(0, q1Var2);
                        }
                    }
                } else {
                    arrayList3.add(q1Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        q0 q0Var2 = ((v1) this.c).a;
        q0Var2.P = null;
        q0Var2.O = null;
        q0Var2.N = null;
        if (e0Var != null) {
            f0(e0Var, (q1) arrayList.get(0));
        }
        if (e0Var2 != null && arrayList.size() > 2) {
            q1 q1Var3 = (q1) arrayList.get(0);
            q1 q1Var4 = (q1) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                q1 q1Var5 = (q1) arrayList.get(i3);
                if (q1Var4.e) {
                    float f13 = q1Var4.c;
                    float f14 = q1Var4.d;
                    float f15 = q1Var4.a;
                    float f16 = f15 - q1Var3.a;
                    float f17 = q1Var4.b;
                    float f18 = ((f17 - q1Var3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((q1Var5.a - f15) * f13) + ((q1Var5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        q1Var4.c = -f13;
                        q1Var4.d = -f14;
                    }
                }
                f0(e0Var2, q1Var4);
                q1Var3 = q1Var4;
                q1Var4 = q1Var5;
            }
        }
        if (e0Var3 != null) {
            f0(e0Var3, (q1) arrayList.get(size - 1));
        }
    }

    public void h0(f0 f0Var, androidx.compose.ui.geometry.a aVar) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.a;
        Boolean bool = f0Var.n;
        if (bool == null || !bool.booleanValue()) {
            c0 c0Var = f0Var.p;
            float fB = c0Var != null ? c0Var.b(this, 1.0f) : 1.2f;
            c0 c0Var2 = f0Var.q;
            float fB2 = c0Var2 != null ? c0Var2.b(this, 1.0f) : 1.2f;
            fD = fB * aVar.d;
            fE = fB2 * aVar.e;
        } else {
            c0 c0Var3 = f0Var.p;
            fD = c0Var3 != null ? c0Var3.d(this) : aVar.d;
            c0 c0Var4 = f0Var.q;
            fE = c0Var4 != null ? c0Var4.e(this) : aVar.e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        o0();
        v1 v1VarG = G(f0Var);
        this.c = v1VarG;
        v1VarG.a.G = Float.valueOf(1.0f);
        boolean zA0 = a0();
        canvas.save();
        Boolean bool2 = f0Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.b, aVar.c);
            canvas.scale(aVar.d, aVar.e);
        }
        e0(f0Var, false);
        canvas.restore();
        if (zA0) {
            Z(aVar);
        }
        n0();
    }

    public void i0(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        com.google.firebase.messaging.n nVar = ((v1) this.c).a.M;
        if (nVar != null) {
            f += ((c0) nVar.B).d(this);
            f2 += ((c0) ((v1) this.c).a.M.y).e(this);
            fD -= ((c0) ((v1) this.c).a.M.z).d(this);
            fE -= ((c0) ((v1) this.c).a.M.A).e(this);
        }
        ((Canvas) this.a).clipRect(f, f2, fD, fE);
    }

    public void j(androidx.appcompat.widget.x xVar, androidx.media3.exoplayer.source.v vVar, androidx.media3.common.v0 v0Var) {
        if (vVar == null) {
            return;
        }
        if (v0Var.b(vVar.a) != -1) {
            xVar.q(vVar, v0Var);
            return;
        }
        androidx.media3.common.v0 v0Var2 = (androidx.media3.common.v0) ((com.google.common.collect.f1) this.c).get(vVar);
        if (v0Var2 != null) {
            xVar.q(vVar, v0Var2);
        }
    }

    public void j0(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i2;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.g gVar = (com.google.firebase.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.b);
        androidx.compose.runtime.snapshots.j jVar = (androidx.compose.runtime.snapshots.j) this.b;
        synchronized (jVar) {
            try {
                if (jVar.a == 0 && (packageInfoD = jVar.d("com.google.android.gms")) != null) {
                    jVar.a = packageInfoD.versionCode;
                }
                i = jVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((androidx.compose.runtime.snapshots.j) this.b).b());
        androidx.compose.runtime.snapshots.j jVar2 = (androidx.compose.runtime.snapshots.j) this.b;
        synchronized (jVar2) {
            try {
                if (((String) jVar2.e) == null) {
                    jVar2.f();
                }
                str3 = (String) jVar2.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        com.google.firebase.g gVar2 = (com.google.firebase.g) this.a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((com.google.firebase.installations.a) org.jsoup.helper.n.f(((com.google.firebase.installations.c) ((com.google.firebase.installations.d) this.f)).d())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) org.jsoup.helper.n.f(((com.google.firebase.installations.c) ((com.google.firebase.installations.d) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        com.google.firebase.heartbeatinfo.g gVar3 = (com.google.firebase.heartbeatinfo.g) ((com.google.firebase.inject.b) this.e).get();
        com.google.firebase.platforminfo.c cVar = (com.google.firebase.platforminfo.c) ((com.google.firebase.inject.b) this.d).get();
        if (gVar3 == null || cVar == null) {
            return;
        }
        com.google.firebase.heartbeatinfo.d dVar = (com.google.firebase.heartbeatinfo.d) gVar3;
        synchronized (dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.firebase.heartbeatinfo.h hVar = (com.google.firebase.heartbeatinfo.h) dVar.a.get();
            synchronized (hVar) {
                zE = hVar.e(com.google.firebase.heartbeatinfo.h.b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (hVar) {
                    hVar.a.a(new com.app.mlounge.ui.screens.player.s(4, hVar, hVar.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(androidx.constraintlayout.core.g.e(i2)));
            bundle.putString("Firebase-Client", cVar.a());
        }
    }

    public Path l(v0 v0Var, androidx.compose.ui.geometry.a aVar) {
        Path pathY;
        w0 w0VarW = v0Var.a.W(((v1) this.c).a.U);
        if (w0VarW == null) {
            z("ClipPath reference '%s' not found", ((v1) this.c).a.U);
            return null;
        }
        s sVar = (s) w0VarW;
        ((Stack) this.d).push((v1) this.c);
        this.c = G(sVar);
        Boolean bool = sVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.b, aVar.c);
            matrix.preScale(aVar.d, aVar.e);
        }
        Matrix matrix2 = sVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (y0 y0Var : sVar.i) {
            if ((y0Var instanceof v0) && (pathY = Y((v0) y0Var, true)) != null) {
                path.op(pathY, Path.Op.UNION);
            }
        }
        if (((v1) this.c).a.U != null) {
            if (sVar.h == null) {
                sVar.h = m(path);
            }
            Path pathL = l(sVar, sVar.h);
            if (pathL != null) {
                path.op(pathL, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (v1) ((Stack) this.d).pop();
        return path;
    }

    public com.google.android.gms.tasks.s m0(String str, String str2, Bundle bundle) {
        int i;
        try {
            j0(str, str2, bundle);
            com.google.android.gms.cloudmessaging.b bVar = (com.google.android.gms.cloudmessaging.b) this.c;
            com.google.android.gms.cloudmessaging.h hVar = com.google.android.gms.cloudmessaging.h.z;
            u2 u2Var = bVar.c;
            if (u2Var.w() >= 12000000) {
                com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(bVar.b);
                synchronized (nVarP) {
                    i = nVarP.e;
                    nVarP.e = i + 1;
                }
                return nVarP.q(new com.google.android.gms.cloudmessaging.m(i, 1, bundle, 1)).j(hVar, com.google.android.gms.cloudmessaging.d.y);
            }
            if (u2Var.x() != 0) {
                return bVar.a(bundle).d(hVar, new androidx.work.impl.k(18, bVar, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            com.google.android.gms.tasks.s sVar = new com.google.android.gms.tasks.s();
            sVar.m(iOException);
            return sVar;
        } catch (InterruptedException | ExecutionException e) {
            com.google.android.gms.tasks.s sVar2 = new com.google.android.gms.tasks.s();
            sVar2.m(e);
            return sVar2;
        }
    }

    public float n(j1 j1Var) {
        w1 w1Var = new w1(this);
        y(j1Var, w1Var);
        return w1Var.G;
    }

    public void n0() {
        ((Canvas) this.a).restore();
        this.c = (v1) ((Stack) this.d).pop();
    }

    public void o0() {
        ((Canvas) this.a).save();
        ((Stack) this.d).push((v1) this.c);
        this.c = new v1((v1) this.c);
    }

    public void p(v0 v0Var, androidx.compose.ui.geometry.a aVar) {
        Path pathL;
        if (((v1) this.c).a.U == null || (pathL = l(v0Var, aVar)) == null) {
            return;
        }
        ((Canvas) this.a).clipPath(pathL);
    }

    public void p0() {
        androidx.compose.material.ripple.g gVar = (androidx.compose.material.ripple.g) this.e;
        HashMap map = (HashMap) this.a;
        if (gVar.a) {
            gVar.j(map);
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void q(v0 v0Var) {
        z0 z0Var = ((v1) this.c).a.y;
        if (z0Var instanceof h0) {
            u(true, v0Var.h, (h0) z0Var);
        }
        z0 z0Var2 = ((v1) this.c).a.A;
        if (z0Var2 instanceof h0) {
            u(false, v0Var.h, (h0) z0Var2);
        }
    }

    public String q0(String str, boolean z, boolean z2) {
        if (((v1) this.c).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public void r0(androidx.media3.common.v0 v0Var) {
        com.google.common.collect.h0 h0Var;
        androidx.appcompat.widget.x xVarA = com.google.common.collect.f1.a();
        if (((com.google.common.collect.h0) this.b).isEmpty()) {
            j(xVarA, (androidx.media3.exoplayer.source.v) this.e, v0Var);
            if (!Objects.equals((androidx.media3.exoplayer.source.v) this.f, (androidx.media3.exoplayer.source.v) this.e)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.f, v0Var);
            }
            if (!Objects.equals((androidx.media3.exoplayer.source.v) this.d, (androidx.media3.exoplayer.source.v) this.e) && !Objects.equals((androidx.media3.exoplayer.source.v) this.d, (androidx.media3.exoplayer.source.v) this.f)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.d, v0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((com.google.common.collect.h0) this.b).size();
                h0Var = (com.google.common.collect.h0) this.b;
                if (i >= size) {
                    break;
                }
                j(xVarA, (androidx.media3.exoplayer.source.v) h0Var.get(i), v0Var);
                i++;
            }
            if (!h0Var.contains((androidx.media3.exoplayer.source.v) this.d)) {
                j(xVarA, (androidx.media3.exoplayer.source.v) this.d, v0Var);
            }
        }
        this.c = xVarA.e(true);
    }

    public void s0(v0 v0Var) {
        if (v0Var.b == null || v0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            androidx.compose.ui.geometry.a aVar = v0Var.h;
            float f = aVar.b;
            float f2 = aVar.c;
            float fC = aVar.c();
            androidx.compose.ui.geometry.a aVar2 = v0Var.h;
            float f3 = aVar2.c;
            float fC2 = aVar2.c();
            float fD = v0Var.h.d();
            androidx.compose.ui.geometry.a aVar3 = v0Var.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, aVar3.b, aVar3.d()};
            matrix.preConcat(((Canvas) this.a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            v0 v0Var2 = (v0) ((Stack) this.e).peek();
            androidx.compose.ui.geometry.a aVar4 = v0Var2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (aVar4 == null) {
                v0Var2.h = new androidx.compose.ui.geometry.a(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < aVar4.b) {
                aVar4.b = f8;
            }
            if (f9 < aVar4.c) {
                aVar4.c = f9;
            }
            if (f8 + f10 > aVar4.c()) {
                aVar4.d = (f8 + f10) - aVar4.b;
            }
            if (f9 + f11 > aVar4.d()) {
                aVar4.e = (f9 + f11) - aVar4.c;
            }
        }
    }

    public void t0(v1 v1Var, q0 q0Var) {
        if (Q(q0Var, 4096L)) {
            v1Var.a.H = q0Var.H;
        }
        if (Q(q0Var, 2048L)) {
            v1Var.a.G = q0Var.G;
        }
        boolean zQ = Q(q0Var, 1L);
        t tVar = t.z;
        if (zQ) {
            v1Var.a.y = q0Var.y;
            z0 z0Var = q0Var.y;
            v1Var.b = (z0Var == null || z0Var == tVar) ? false : true;
        }
        if (Q(q0Var, 4L)) {
            v1Var.a.z = q0Var.z;
        }
        if (Q(q0Var, 6149L)) {
            k0(v1Var, true, v1Var.a.y);
        }
        if (Q(q0Var, 2L)) {
            v1Var.a.a0 = q0Var.a0;
        }
        if (Q(q0Var, 8L)) {
            v1Var.a.A = q0Var.A;
            z0 z0Var2 = q0Var.A;
            v1Var.c = (z0Var2 == null || z0Var2 == tVar) ? false : true;
        }
        if (Q(q0Var, 16L)) {
            v1Var.a.B = q0Var.B;
        }
        if (Q(q0Var, 6168L)) {
            k0(v1Var, false, v1Var.a.A);
        }
        if (Q(q0Var, 34359738368L)) {
            v1Var.a.i0 = q0Var.i0;
        }
        if (Q(q0Var, 32L)) {
            q0 q0Var2 = v1Var.a;
            c0 c0Var = q0Var.C;
            q0Var2.C = c0Var;
            v1Var.e.setStrokeWidth(c0Var.a(this));
        }
        if (Q(q0Var, 64L)) {
            q0 q0Var3 = v1Var.a;
            Paint paint = v1Var.e;
            q0Var3.b0 = q0Var.b0;
            int iE = androidx.constraintlayout.core.g.e(q0Var.b0);
            if (iE == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iE == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iE == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Q(q0Var, 128L)) {
            q0 q0Var4 = v1Var.a;
            Paint paint2 = v1Var.e;
            q0Var4.c0 = q0Var.c0;
            int iE2 = androidx.constraintlayout.core.g.e(q0Var.c0);
            if (iE2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iE2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iE2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Q(q0Var, 256L)) {
            v1Var.a.D = q0Var.D;
            v1Var.e.setStrokeMiter(q0Var.D.floatValue());
        }
        if (Q(q0Var, 512L)) {
            v1Var.a.E = q0Var.E;
        }
        if (Q(q0Var, 1024L)) {
            v1Var.a.F = q0Var.F;
        }
        Typeface typefaceR = null;
        if (Q(q0Var, 1536L)) {
            q0 q0Var5 = v1Var.a;
            Paint paint3 = v1Var.e;
            c0[] c0VarArr = q0Var5.E;
            if (c0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c0VarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fA = q0Var5.E[i2 % length].a(this);
                    fArr[i2] = fA;
                    f += fA;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = q0Var5.F.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (Q(q0Var, 16384L)) {
            float textSize = ((v1) this.c).d.getTextSize();
            v1Var.a.J = q0Var.J;
            v1Var.d.setTextSize(q0Var.J.b(this, textSize));
            v1Var.e.setTextSize(q0Var.J.b(this, textSize));
        }
        if (Q(q0Var, 8192L)) {
            v1Var.a.I = q0Var.I;
        }
        if (Q(q0Var, 32768L)) {
            if (q0Var.K.intValue() == -1 && v1Var.a.K.intValue() > 100) {
                q0 q0Var6 = v1Var.a;
                q0Var6.K = Integer.valueOf(q0Var6.K.intValue() - 100);
            } else if (q0Var.K.intValue() != 1 || v1Var.a.K.intValue() >= 900) {
                v1Var.a.K = q0Var.K;
            } else {
                q0 q0Var7 = v1Var.a;
                q0Var7.K = Integer.valueOf(q0Var7.K.intValue() + 100);
            }
        }
        if (Q(q0Var, 65536L)) {
            v1Var.a.d0 = q0Var.d0;
        }
        if (Q(q0Var, 106496L)) {
            q0 q0Var8 = v1Var.a;
            ArrayList arrayList = q0Var8.I;
            if (arrayList != null && ((androidx.appcompat.widget.c2) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceR = r((String) it.next(), q0Var8.K, q0Var8.d0)) == null) {
                }
            }
            if (typefaceR == null) {
                typefaceR = r("serif", q0Var8.K, q0Var8.d0);
            }
            v1Var.d.setTypeface(typefaceR);
            v1Var.e.setTypeface(typefaceR);
        }
        if (Q(q0Var, 131072L)) {
            q0 q0Var9 = v1Var.a;
            Paint paint4 = v1Var.e;
            Paint paint5 = v1Var.d;
            q0Var9.e0 = q0Var.e0;
            paint5.setStrikeThruText(q0Var.e0 == 4);
            paint5.setUnderlineText(q0Var.e0 == 2);
            paint4.setStrikeThruText(q0Var.e0 == 4);
            paint4.setUnderlineText(q0Var.e0 == 2);
        }
        if (Q(q0Var, 68719476736L)) {
            v1Var.a.f0 = q0Var.f0;
        }
        if (Q(q0Var, 262144L)) {
            v1Var.a.g0 = q0Var.g0;
        }
        if (Q(q0Var, 524288L)) {
            v1Var.a.L = q0Var.L;
        }
        if (Q(q0Var, 2097152L)) {
            v1Var.a.N = q0Var.N;
        }
        if (Q(q0Var, 4194304L)) {
            v1Var.a.O = q0Var.O;
        }
        if (Q(q0Var, 8388608L)) {
            v1Var.a.P = q0Var.P;
        }
        if (Q(q0Var, 16777216L)) {
            v1Var.a.Q = q0Var.Q;
        }
        if (Q(q0Var, 33554432L)) {
            v1Var.a.R = q0Var.R;
        }
        if (Q(q0Var, 1048576L)) {
            v1Var.a.M = q0Var.M;
        }
        if (Q(q0Var, 268435456L)) {
            v1Var.a.U = q0Var.U;
        }
        if (Q(q0Var, 536870912L)) {
            v1Var.a.h0 = q0Var.h0;
        }
        if (Q(q0Var, 1073741824L)) {
            v1Var.a.V = q0Var.V;
        }
        if (Q(q0Var, 67108864L)) {
            v1Var.a.S = q0Var.S;
        }
        if (Q(q0Var, 134217728L)) {
            v1Var.a.T = q0Var.T;
        }
        if (Q(q0Var, 8589934592L)) {
            v1Var.a.Y = q0Var.Y;
        }
        if (Q(q0Var, 17179869184L)) {
            v1Var.a.Z = q0Var.Z;
        }
        if (Q(q0Var, 137438953472L)) {
            v1Var.a.j0 = q0Var.j0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009d A[PHI: r11 r12 r15 r17
  0x009d: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void u(boolean z, androidx.compose.ui.geometry.a aVar, h0 h0Var) {
        float fB;
        float f;
        float fB2;
        float f2;
        float fB3;
        float fB4;
        float fB5;
        float fB6;
        w0 w0VarW = ((androidx.appcompat.widget.c2) this.b).W(h0Var.e);
        int i = 0;
        int i2 = 0;
        if (w0VarW == null) {
            z("%s reference '%s' not found", z ? "Fill" : "Stroke", h0Var.e);
            z0 z0Var = h0Var.y;
            v1 v1Var = (v1) this.c;
            if (z0Var != null) {
                k0(v1Var, z, z0Var);
                return;
            } else if (z) {
                v1Var.b = false;
                return;
            } else {
                v1Var.c = false;
                return;
            }
        }
        boolean z2 = w0VarW instanceof x0;
        t tVar = t.y;
        if (z2) {
            x0 x0Var = (x0) w0VarW;
            String str = x0Var.l;
            if (str != null) {
                C(x0Var, str);
            }
            Boolean bool = x0Var.i;
            byte b = bool != null && bool.booleanValue();
            v1 v1Var2 = (v1) this.c;
            Paint paint = z ? v1Var2.d : v1Var2.e;
            if (b == true) {
                androidx.compose.ui.geometry.a aVar2 = v1Var2.g;
                if (aVar2 == null) {
                    aVar2 = v1Var2.f;
                }
                c0 c0Var = x0Var.m;
                fB3 = c0Var != null ? c0Var.d(this) : 0.0f;
                c0 c0Var2 = x0Var.n;
                fB4 = c0Var2 != null ? c0Var2.e(this) : 0.0f;
                f2 = 0.0f;
                c0 c0Var3 = x0Var.o;
                fB5 = c0Var3 != null ? c0Var3.d(this) : aVar2.d;
                c0 c0Var4 = x0Var.p;
                if (c0Var4 != null) {
                    fB6 = c0Var4.e(this);
                } else {
                    fB6 = f2;
                }
            } else {
                f2 = 0.0f;
                c0 c0Var5 = x0Var.m;
                fB3 = c0Var5 != null ? c0Var5.b(this, 1.0f) : 0.0f;
                c0 c0Var6 = x0Var.n;
                fB4 = c0Var6 != null ? c0Var6.b(this, 1.0f) : 0.0f;
                c0 c0Var7 = x0Var.o;
                fB5 = c0Var7 != null ? c0Var7.b(this, 1.0f) : 1.0f;
                c0 c0Var8 = x0Var.p;
                if (c0Var8 != null) {
                    fB6 = c0Var8.b(this, 1.0f);
                } else {
                    fB6 = f2;
                }
            }
            float f3 = fB4;
            float f4 = fB5;
            float f5 = fB6;
            float f6 = fB3;
            o0();
            this.c = G(x0Var);
            Matrix matrix = new Matrix();
            if (b == false) {
                matrix.preTranslate(aVar.b, aVar.c);
                matrix.preScale(aVar.d, aVar.e);
            }
            Matrix matrix2 = x0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = x0Var.h.size();
            if (size == 0) {
                n0();
                v1 v1Var3 = (v1) this.c;
                if (z) {
                    v1Var3.b = false;
                    return;
                } else {
                    v1Var3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = x0Var.h.iterator();
            int i3 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                p0 p0Var = (p0) ((y0) it.next());
                Float f8 = p0Var.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i3 == 0 || fFloatValue >= f7) {
                    fArr[i3] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i3] = f7;
                }
                o0();
                u0((v1) this.c, p0Var);
                q0 q0Var = ((v1) this.c).a;
                t tVar2 = (t) q0Var.S;
                if (tVar2 == null) {
                    tVar2 = tVar;
                }
                iArr[i3] = s(tVar2.e, q0Var.T.floatValue());
                i3++;
                n0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                n0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i4 = x0Var.k;
            if (i4 != 0) {
                if (i4 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i4 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            n0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((v1) this.c).a.z.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(w0VarW instanceof b1)) {
            if (w0VarW instanceof o0) {
                o0 o0Var = (o0) w0VarW;
                q0 q0Var2 = o0Var.e;
                if (z) {
                    if (Q(q0Var2, 2147483648L)) {
                        v1 v1Var4 = (v1) this.c;
                        q0 q0Var3 = v1Var4.a;
                        z0 z0Var2 = o0Var.e.W;
                        q0Var3.y = z0Var2;
                        v1Var4.b = z0Var2 != null;
                    }
                    if (Q(o0Var.e, 4294967296L)) {
                        ((v1) this.c).a.z = o0Var.e.X;
                    }
                    if (Q(o0Var.e, 6442450944L)) {
                        v1 v1Var5 = (v1) this.c;
                        k0(v1Var5, z, v1Var5.a.y);
                        return;
                    }
                    return;
                }
                if (Q(q0Var2, 2147483648L)) {
                    v1 v1Var6 = (v1) this.c;
                    q0 q0Var4 = v1Var6.a;
                    z0 z0Var3 = o0Var.e.W;
                    q0Var4.A = z0Var3;
                    v1Var6.c = z0Var3 != null;
                }
                if (Q(o0Var.e, 4294967296L)) {
                    ((v1) this.c).a.B = o0Var.e.X;
                }
                if (Q(o0Var.e, 6442450944L)) {
                    v1 v1Var7 = (v1) this.c;
                    k0(v1Var7, z, v1Var7.a.A);
                    return;
                }
                return;
            }
            return;
        }
        b1 b1Var = (b1) w0VarW;
        String str2 = b1Var.l;
        if (str2 != null) {
            C(b1Var, str2);
        }
        Boolean bool2 = b1Var.i;
        byte b2 = bool2 != null && bool2.booleanValue();
        v1 v1Var8 = (v1) this.c;
        Paint paint2 = z ? v1Var8.d : v1Var8.e;
        if (b2 == true) {
            c0 c0Var9 = new c0(9, 50.0f);
            c0 c0Var10 = b1Var.m;
            float fD = c0Var10 != null ? c0Var10.d(this) : c0Var9.d(this);
            c0 c0Var11 = b1Var.n;
            fB = c0Var11 != null ? c0Var11.e(this) : c0Var9.e(this);
            c0 c0Var12 = b1Var.o;
            fB2 = c0Var12 != null ? c0Var12.a(this) : c0Var9.a(this);
            f = fD;
        } else {
            c0 c0Var13 = b1Var.m;
            float fB7 = c0Var13 != null ? c0Var13.b(this, 1.0f) : 0.5f;
            c0 c0Var14 = b1Var.n;
            fB = c0Var14 != null ? c0Var14.b(this, 1.0f) : 0.5f;
            c0 c0Var15 = b1Var.o;
            f = fB7;
            fB2 = c0Var15 != null ? c0Var15.b(this, 1.0f) : 0.5f;
        }
        float f9 = fB;
        o0();
        this.c = G(b1Var);
        Matrix matrix3 = new Matrix();
        if (b2 == false) {
            matrix3.preTranslate(aVar.b, aVar.c);
            matrix3.preScale(aVar.d, aVar.e);
        }
        Matrix matrix4 = b1Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = b1Var.h.size();
        if (size2 == 0) {
            n0();
            v1 v1Var9 = (v1) this.c;
            if (z) {
                v1Var9.b = false;
                return;
            } else {
                v1Var9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = b1Var.h.iterator();
        int i5 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            p0 p0Var2 = (p0) ((y0) it2.next());
            Float f11 = p0Var2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f10) {
                fArr2[i5] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i5] = f10;
            }
            o0();
            u0((v1) this.c, p0Var2);
            q0 q0Var5 = ((v1) this.c).a;
            t tVar3 = (t) q0Var5.S;
            if (tVar3 == null) {
                tVar3 = tVar;
            }
            iArr2[i5] = s(tVar3.e, q0Var5.T.floatValue());
            i5++;
            n0();
        }
        if (fB2 == 0.0f || size2 == 1) {
            n0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i6 = b1Var.k;
        if (i6 != 0) {
            if (i6 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i6 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        n0();
        RadialGradient radialGradient = new RadialGradient(f, f9, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((v1) this.c).a.z.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i2 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i2);
    }

    public void u0(v1 v1Var, w0 w0Var) {
        boolean z = w0Var.b == null;
        q0 q0Var = v1Var.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        q0Var.Q = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        q0Var.L = bool;
        q0Var.M = null;
        q0Var.U = null;
        q0Var.G = fValueOf;
        q0Var.S = t.y;
        q0Var.T = fValueOf;
        q0Var.V = null;
        q0Var.W = null;
        q0Var.X = fValueOf;
        q0Var.Y = null;
        q0Var.Z = fValueOf;
        q0Var.i0 = 1;
        q0 q0Var2 = w0Var.e;
        if (q0Var2 != null) {
            t0(v1Var, q0Var2);
        }
        ArrayList arrayList = ((androidx.compose.ui.graphics.vector.g) ((androidx.appcompat.widget.c2) this.b).z).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (l lVar : ((androidx.compose.ui.graphics.vector.g) ((androidx.appcompat.widget.c2) this.b).z).b) {
                if (androidx.media3.common.audio.e.g(lVar.a, w0Var)) {
                    t0(v1Var, lVar.b);
                }
            }
        }
        q0 q0Var3 = w0Var.f;
        if (q0Var3 != null) {
            t0(v1Var, q0Var3);
        }
    }

    public boolean v() {
        Boolean bool = ((v1) this.c).a.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void v0() {
        int iS;
        q0 q0Var = ((v1) this.c).a;
        z0 z0Var = q0Var.Y;
        if (z0Var instanceof t) {
            iS = ((t) z0Var).e;
        } else if (!(z0Var instanceof u)) {
            return;
        } else {
            iS = q0Var.H.e;
        }
        Float f = q0Var.Z;
        if (f != null) {
            iS = s(iS, f.floatValue());
        }
        ((Canvas) this.a).drawColor(iS);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    public void w(v0 v0Var, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.a;
        z0 z0Var = ((v1) this.c).a.y;
        if (z0Var instanceof h0) {
            w0 w0VarW = ((androidx.appcompat.widget.c2) this.b).W(((h0) z0Var).e);
            if (w0VarW instanceof k0) {
                k0 k0Var = (k0) w0VarW;
                Boolean bool = k0Var.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = k0Var.w;
                if (str != null) {
                    E(k0Var, str);
                }
                c0 c0Var = k0Var.s;
                if (z3) {
                    fD = c0Var != null ? c0Var.d(this) : 0.0f;
                    c0 c0Var2 = k0Var.t;
                    fE2 = c0Var2 != null ? c0Var2.e(this) : 0.0f;
                    c0 c0Var3 = k0Var.u;
                    fD2 = c0Var3 != null ? c0Var3.d(this) : 0.0f;
                    c0 c0Var4 = k0Var.v;
                    fE = c0Var4 != null ? c0Var4.e(this) : 0.0f;
                } else {
                    float fB = c0Var != null ? c0Var.b(this, 1.0f) : 0.0f;
                    c0 c0Var5 = k0Var.t;
                    float fB2 = c0Var5 != null ? c0Var5.b(this, 1.0f) : 0.0f;
                    c0 c0Var6 = k0Var.u;
                    float fB3 = c0Var6 != null ? c0Var6.b(this, 1.0f) : 0.0f;
                    c0 c0Var7 = k0Var.v;
                    float fB4 = c0Var7 != null ? c0Var7.b(this, 1.0f) : 0.0f;
                    androidx.compose.ui.geometry.a aVar = v0Var.h;
                    float f = aVar.b;
                    float f2 = aVar.d;
                    float f3 = (fB * f2) + f;
                    float f4 = aVar.c;
                    float f5 = aVar.e;
                    float f6 = fB3 * f2;
                    fE = fB4 * f5;
                    fD = f3;
                    fE2 = (fB2 * f5) + f4;
                    fD2 = f6;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                q qVar = k0Var.n;
                if (qVar == null) {
                    qVar = q.d;
                }
                o0();
                canvas.clipPath(path);
                v1 v1Var = new v1();
                t0(v1Var, q0.a());
                v1Var.a.L = Boolean.FALSE;
                H(k0Var, v1Var);
                this.c = v1Var;
                androidx.compose.ui.geometry.a aVar2 = v0Var.h;
                Matrix matrix = k0Var.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (k0Var.r.invert(matrix2)) {
                        androidx.compose.ui.geometry.a aVar3 = v0Var.h;
                        float f7 = aVar3.b;
                        float f8 = aVar3.c;
                        float fC = aVar3.c();
                        z = true;
                        androidx.compose.ui.geometry.a aVar4 = v0Var.h;
                        z2 = false;
                        float f9 = aVar4.c;
                        float fC2 = aVar4.c();
                        float fD3 = v0Var.h.d();
                        androidx.compose.ui.geometry.a aVar5 = v0Var.h;
                        float[] fArr = {f7, f8, fC, f9, fC2, fD3, aVar5.b, aVar5.d()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        aVar2 = new androidx.compose.ui.geometry.a(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((aVar2.b - fD) / fD2)) * fD2) + fD;
                float fC3 = aVar2.c();
                float fD4 = aVar2.d();
                androidx.compose.ui.geometry.a aVar6 = new androidx.compose.ui.geometry.a(0.0f, 0.0f, fD2, fE);
                boolean zA0 = a0();
                for (float fFloor2 = (((float) Math.floor((aVar2.c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f16 = fFloor;
                    while (f16 < fC3) {
                        aVar6.b = f16;
                        aVar6.c = fFloor2;
                        o0();
                        if (!((v1) this.c).a.L.booleanValue()) {
                            i0(aVar6.b, aVar6.c, aVar6.d, aVar6.e);
                        }
                        androidx.compose.ui.geometry.a aVar7 = k0Var.o;
                        if (aVar7 != null) {
                            canvas.concat(o(aVar6, aVar7, qVar));
                        } else {
                            Boolean bool2 = k0Var.q;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                androidx.compose.ui.geometry.a aVar8 = v0Var.h;
                                canvas.scale(aVar8.d, aVar8.e);
                            }
                        }
                        Iterator it = k0Var.i.iterator();
                        while (it.hasNext()) {
                            d0((y0) it.next());
                        }
                        n0();
                        f16 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zA0) {
                    Z(k0Var.h);
                }
                n0();
                return;
            }
        }
        canvas.drawPath(path, ((v1) this.c).d);
    }

    public boolean w0() {
        Boolean bool = ((v1) this.c).a.R;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void x(Path path) {
        v1 v1Var = (v1) this.c;
        int i = v1Var.a.i0;
        Canvas canvas = (Canvas) this.a;
        if (i != 2) {
            canvas.drawPath(path, v1Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((v1) this.c).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((v1) this.c).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public com.google.common.util.concurrent.r x0() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFutureA;
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        com.google.common.util.concurrent.x0 x0Var = (com.google.common.util.concurrent.x0) this.f;
        if (x0Var.isDone()) {
            return x0Var;
        }
        do {
            atomicLong = (AtomicLong) this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.d;
        com.google.common.util.concurrent.x0 x0Var2 = new com.google.common.util.concurrent.x0();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(x0Var2);
        if (listenableFuture == null) {
            j5 j5VarA = rf.a(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(this, i, 8));
            com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0();
            z0Var.F = new com.google.common.util.concurrent.y0(z0Var, j5VarA);
            d0Var.execute(z0Var);
            listenableFutureA = z0Var;
        } else {
            com.google.common.util.concurrent.z zVar = new com.google.common.util.concurrent.z() { // from class: com.google.android.gms.internal.measurement.te
                @Override // com.google.common.util.concurrent.z
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.a.B0(i);
                }
            };
            int i2 = rf.a;
            listenableFutureA = com.google.common.util.concurrent.m0.a(listenableFuture, Throwable.class, new xc(4, bf.a(), zVar), (com.google.common.util.concurrent.w0) this.e);
        }
        x0Var2.n(listenableFutureA);
        ue ueVar = new ue(this, i);
        x0Var2.a(new androidx.core.provider.m(3, this, x0Var2, ueVar), d0Var);
        return ueVar;
    }

    public void y(j1 j1Var, _COROUTINE.b bVar) {
        float f;
        float fE;
        float fD;
        int iJ;
        if (v()) {
            Iterator it = j1Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                if (y0Var instanceof m1) {
                    bVar.F(q0(((m1) y0Var).c, z, !it.hasNext()));
                } else if (bVar.n((j1) y0Var)) {
                    float fE2 = 0.0f;
                    if (y0Var instanceof k1) {
                        o0();
                        k1 k1Var = (k1) y0Var;
                        u0((v1) this.c, k1Var);
                        if (v() && w0()) {
                            w0 w0VarW = k1Var.a.W(k1Var.n);
                            if (w0VarW == null) {
                                z("TextPath reference '%s' not found", k1Var.n);
                            } else {
                                i0 i0Var = (i0) w0VarW;
                                r1 r1Var = new r1(i0Var.o);
                                Matrix matrix = i0Var.n;
                                Path path = r1Var.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                c0 c0Var = k1Var.o;
                                fE2 = c0Var != null ? c0Var.b(this, pathMeasure.getLength()) : 0.0f;
                                int iJ2 = J();
                                if (iJ2 != 1) {
                                    float fN = n(k1Var);
                                    if (iJ2 == 2) {
                                        fN /= 2.0f;
                                    }
                                    fE2 -= fN;
                                }
                                q(k1Var.p);
                                boolean zA0 = a0();
                                y(k1Var, new s1(this, path, fE2));
                                if (zA0) {
                                    Z(k1Var.h);
                                }
                            }
                        }
                        n0();
                    } else if (y0Var instanceof g1) {
                        o0();
                        g1 g1Var = (g1) y0Var;
                        u0((v1) this.c, g1Var);
                        if (v()) {
                            ArrayList arrayList = g1Var.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = bVar instanceof t1;
                            if (z3) {
                                float fD2 = !z2 ? ((t1) bVar).G : ((c0) g1Var.n.get(0)).d(this);
                                ArrayList arrayList2 = g1Var.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((t1) bVar).H : ((c0) g1Var.o.get(0)).e(this);
                                ArrayList arrayList3 = g1Var.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((c0) g1Var.p.get(0)).d(this);
                                ArrayList arrayList4 = g1Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((c0) g1Var.q.get(0)).e(this);
                                }
                                float f2 = fD2;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z2 && (iJ = J()) != 1) {
                                float fN2 = n(g1Var);
                                if (iJ == 2) {
                                    fN2 /= 2.0f;
                                }
                                fE2 -= fN2;
                            }
                            q(g1Var.r);
                            if (z3) {
                                t1 t1Var = (t1) bVar;
                                t1Var.G = fE2 + fD;
                                t1Var.H = fE + f;
                            }
                            boolean zA1 = a0();
                            y(g1Var, bVar);
                            if (zA1) {
                                Z(g1Var.h);
                            }
                        }
                        n0();
                    } else if (y0Var instanceof f1) {
                        o0();
                        f1 f1Var = (f1) y0Var;
                        u0((v1) this.c, f1Var);
                        if (v()) {
                            q(f1Var.o);
                            w0 w0VarW2 = y0Var.a.W(f1Var.n);
                            if (w0VarW2 == null || !(w0VarW2 instanceof j1)) {
                                z("Tref reference '%s' not found", f1Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                A((j1) w0VarW2, sb);
                                if (sb.length() > 0) {
                                    bVar.F(sb.toString());
                                }
                            }
                        }
                        n0();
                    }
                }
                z = false;
            }
        }
    }

    public void y0(String str) {
        ka.e(xd.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        ka.e(!xd.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public void z0(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = xd.a;
        this.e = str;
    }

    public x1(com.google.common.util.concurrent.y yVar) {
        long j = Integer.MIN_VALUE;
        this.b = new AtomicLong((j & 4294967295L) | (j << 32));
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        this.e = new com.google.common.util.concurrent.w0(d0Var);
        com.google.common.util.concurrent.x0 x0Var = new com.google.common.util.concurrent.x0();
        this.f = x0Var;
        rc rcVar = new rc();
        rcVar.y = yVar;
        rcVar.z = d0Var;
        this.a = rcVar;
        x0Var.a(rcVar, d0Var);
    }

    public x1(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = com.google.android.gms.signin.a.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw androidx.compose.runtime.j.b(it);
    }

    public /* synthetic */ x1(Context context) {
        this.b = "files";
        this.c = "common";
        this.d = xd.b;
        this.e = "";
        this.f = com.google.common.collect.h0.k();
        ka.e(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public x1(androidx.media3.exoplayer.mediacodec.o oVar, MediaFormat mediaFormat, androidx.media3.common.r rVar, Surface surface, MediaCrypto mediaCrypto, androidx.media3.exoplayer.mediacodec.j jVar) {
        this.a = oVar;
        this.b = mediaFormat;
        this.c = rVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = jVar;
    }
}
