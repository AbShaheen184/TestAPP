package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.StateSet;
import androidx.media3.exoplayer.b1;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class i extends Drawable implements w {
    public static final Paint b0;
    public static final h[] c0;
    public final u[] A;
    public final BitSet B;
    public boolean C;
    public boolean D;
    public final Matrix E;
    public final Path F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final Region J;
    public final Region K;
    public final Paint L;
    public final Paint M;
    public final com.google.android.material.shadow.a N;
    public final com.google.android.material.behavior.d O;
    public final b1 P;
    public PorterDuffColorFilter Q;
    public PorterDuffColorFilter R;
    public final RectF S;
    public final boolean T;
    public boolean U;
    public m V;
    public androidx.dynamicanimation.animation.f W;
    public final androidx.dynamicanimation.animation.e[] X;
    public float[] Y;
    public float[] Z;
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.j a0;
    public final com.google.android.gms.tasks.q e;
    public g y;
    public final u[] z;

    static {
        Paint paint = new Paint(1);
        b0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c0 = new h[4];
        int i = 0;
        while (true) {
            h[] hVarArr = c0;
            if (i >= hVarArr.length) {
                return;
            }
            hVarArr[i] = new h(i);
            i++;
        }
    }

    public i(g gVar) {
        this.e = new com.google.android.gms.tasks.q(this);
        this.z = new u[4];
        this.A = new u[4];
        this.B = new BitSet(8);
        this.E = new Matrix();
        this.F = new Path();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new Region();
        this.K = new Region();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.N = new com.google.android.material.shadow.a();
        this.P = Looper.getMainLooper().getThread() == Thread.currentThread() ? n.a : new b1();
        this.S = new RectF();
        this.T = true;
        this.U = true;
        this.X = new androidx.dynamicanimation.animation.e[4];
        this.y = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.O = new com.google.android.material.behavior.d(this);
    }

    public static float b(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.e(rectF)) {
                return mVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (mVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        g gVar = this.y;
        this.P.b(gVar.a, this.Y, gVar.j, rectF, this.O, path);
        if (this.y.i != 1.0f) {
            Matrix matrix = this.E;
            matrix.reset();
            float f = this.y.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.S, true);
    }

    public final int c(int i) {
        int i2;
        g gVar = this.y;
        float f = gVar.n + 0.0f + gVar.m;
        com.google.android.material.elevation.a aVar = gVar.c;
        if (aVar == null || !aVar.a || androidx.core.graphics.a.d(i, 255) != aVar.d) {
            return i;
        }
        float f2 = aVar.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iA = _COROUTINE.b.A(fMin, androidx.core.graphics.a.d(i, 255), aVar.b);
        if (fMin > 0.0f && (i2 = aVar.c) != 0) {
            iA = androidx.core.graphics.a.b(androidx.core.graphics.a.d(i2, com.google.android.material.elevation.a.f), iA);
        }
        return androidx.core.graphics.a.d(iA, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.B.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.y.p;
        Path path = this.F;
        com.google.android.material.shadow.a aVar = this.N;
        if (i != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            u uVar = this.z[i2];
            int i3 = this.y.o;
            Matrix matrix = u.b;
            uVar.a(matrix, aVar, i3, canvas);
            this.A[i2].a(matrix, aVar, this.y.o, canvas);
        }
        if (this.T) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.y.p));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.y.p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, b0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.Q;
        Paint paint2 = this.L;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.y.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.R;
        Paint paint3 = this.M;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.y.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.y.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.y.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.C;
            paint = paint2;
            Path path = this.F;
            if (z) {
                a(g(), path);
                this.C = false;
            }
            g gVar = this.y;
            gVar.getClass();
            if (gVar.o > 0 && !gVar.a.e(g())) {
                float[] fArr = this.Y;
                if (fArr != null) {
                    int i3 = 1;
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        while (true) {
                            if (i3 < fArr.length) {
                                if (fArr[i3] == f) {
                                    i3++;
                                }
                            } else if (!this.y.a.d()) {
                            }
                            if (!path.isConvex()) {
                                canvas.save();
                                double d = 0;
                                canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.y.p)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.y.p)));
                                if (!this.T) {
                                    RectF rectF = this.S;
                                    iWidth = (int) (rectF.width() - getBounds().width());
                                    int iHeight = (int) (rectF.height() - getBounds().height());
                                    if (iWidth >= 0) {
                                    }
                                    kotlinx.coroutines.future.a.u("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                d(canvas);
                                canvas.restore();
                            }
                        }
                    } else if (!this.y.a.d()) {
                        if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                            canvas.save();
                            double d2 = 0;
                            canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.y.p)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.y.p)));
                            if (!this.T) {
                                d(canvas);
                                canvas.restore();
                            } else {
                                RectF rectF2 = this.S;
                                iWidth = (int) (rectF2.width() - getBounds().width());
                                int iHeight2 = (int) (rectF2.height() - getBounds().height());
                                if (iWidth >= 0 || iHeight2 < 0) {
                                    kotlinx.coroutines.future.a.u("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                    return;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.y.o * 2) + ((int) rectF2.width()) + iWidth, (this.y.o * 2) + ((int) rectF2.height()) + iHeight2, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                                float f2 = (getBounds().left - this.y.o) - iWidth;
                                float f3 = (getBounds().top - this.y.o) - iHeight2;
                                canvas2.translate(-f2, -f3);
                                d(canvas2);
                                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                                bitmapCreateBitmap.recycle();
                                canvas.restore();
                            }
                        }
                    }
                } else if (!path.isConvex()) {
                    canvas.save();
                    double d3 = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d3)) * ((double) this.y.p)), (int) (Math.cos(Math.toRadians(d3)) * ((double) this.y.p)));
                    if (!this.T) {
                        RectF rectF3 = this.S;
                        iWidth = (int) (rectF3.width() - getBounds().width());
                        int iHeight3 = (int) (rectF3.height() - getBounds().height());
                        if (iWidth >= 0) {
                        }
                        kotlinx.coroutines.future.a.u("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.y.a, this.Y, g());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.D) {
                m mVar = this.y.a;
                l lVarF = mVar.f();
                d dVar = mVar.e;
                com.google.android.gms.tasks.q qVar = this.e;
                lVarF.e = qVar.f(dVar);
                lVarF.f = qVar.f(mVar.f);
                lVarF.h = qVar.f(mVar.h);
                lVarF.g = qVar.f(mVar.g);
                this.V = lVarF.a();
                float[] fArr2 = this.Y;
                if (fArr2 != null) {
                    if (this.Z == null) {
                        this.Z = new float[fArr2.length];
                    }
                    float fI = i();
                    int i4 = 0;
                    while (true) {
                        float[] fArr3 = this.Y;
                        if (i4 >= fArr3.length) {
                            break;
                        }
                        this.Z[i4] = Math.max(0.0f, fArr3[i4] - fI);
                        i4++;
                    }
                } else {
                    this.Z = null;
                }
                m mVar2 = this.V;
                float[] fArr4 = this.Z;
                float f4 = this.y.j;
                RectF rectFG = g();
                RectF rectF4 = this.I;
                rectF4.set(rectFG);
                float fI2 = i();
                rectF4.inset(fI2, fI2);
                this.P.b(mVar2, fArr4, f4, rectF4, null, this.G);
                this.D = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, mVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.y.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void f(Canvas canvas) {
        m mVar = this.V;
        float[] fArr = this.Z;
        RectF rectFG = g();
        RectF rectF = this.I;
        rectF.set(rectFG);
        float fI = i();
        rectF.inset(fI, fI);
        e(canvas, this.M, this.G, mVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.H;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.y.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.y.getClass();
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.y.a, this.Y);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.y.j);
            return;
        }
        boolean z = this.C;
        Path path = this.F;
        if (z) {
            a(rectFG, path);
            this.C = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            com.google.android.material.drawable.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                com.google.android.material.drawable.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            com.google.android.material.drawable.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.y.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.J;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.F;
        a(rectFG, path);
        Region region2 = this.K;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.Y;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        m mVar = this.y.a;
        b1 b1Var = this.P;
        b1Var.getClass();
        float fA = mVar.e.a(rectFG);
        m mVar2 = this.y.a;
        b1Var.getClass();
        float fA2 = mVar2.h.a(rectFG) + fA;
        m mVar3 = this.y.a;
        b1Var.getClass();
        float fA3 = fA2 - mVar3.g.a(rectFG);
        m mVar4 = this.y.a;
        b1Var.getClass();
        return (fA3 - mVar4.f.a(rectFG)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.M.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.C = true;
        this.D = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.y.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.y.getClass();
        ColorStateList colorStateList2 = this.y.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.y.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        z zVar = this.y.b;
        return zVar != null && zVar.d();
    }

    public final boolean j() {
        Paint.Style style = this.y.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.M.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.y.c = new com.google.android.material.elevation.a(context);
        s();
    }

    public final void l(androidx.dynamicanimation.animation.f fVar) {
        if (this.W == fVar) {
            return;
        }
        this.W = fVar;
        int i = 0;
        while (true) {
            androidx.dynamicanimation.animation.e[] eVarArr = this.X;
            if (i >= eVarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i] == null) {
                eVarArr[i] = new androidx.dynamicanimation.animation.e(this, c0[i]);
            }
            androidx.dynamicanimation.animation.e eVar = eVarArr[i];
            androidx.dynamicanimation.animation.f fVar2 = new androidx.dynamicanimation.animation.f();
            float f = (float) fVar.b;
            if (f < 0.0f) {
                kotlinx.coroutines.future.a.q("Damping ratio must be non-negative");
                return;
            }
            fVar2.b = f;
            fVar2.c = false;
            double d = fVar.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                kotlinx.coroutines.future.a.q("Spring stiffness constant must be positive.");
                return;
            }
            fVar2.a = Math.sqrt(f2);
            fVar2.c = false;
            eVar.j = fVar2;
            i++;
        }
    }

    public final void m(float f) {
        g gVar = this.y;
        if (gVar.n != f) {
            gVar.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.y = new g(this.y);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        g gVar = this.y;
        if (gVar.d != colorStateList) {
            gVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(z zVar) {
        g gVar = this.y;
        if (gVar.b != zVar) {
            gVar.b = zVar;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.C = true;
        this.D = true;
        super.onBoundsChange(rect);
        if (this.y.b != null && !rect.isEmpty()) {
            q(getState(), this.U);
        }
        this.U = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.y.b != null) {
            q(iArr, false);
        }
        boolean z = p(iArr) || r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.y.d == null || color2 == (colorForState2 = this.y.d.getColorForState(iArr, (color2 = (paint2 = this.L).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.y.e == null || color == (colorForState = this.y.e.getColorForState(iArr, (color = (paint = this.M).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z) {
        m mVarA;
        d dVar;
        int i;
        RectF rectFG = g();
        if (this.y.b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.W == null);
        if (this.Y == null) {
            this.Y = new float[4];
        }
        z zVar = this.y.b;
        m[] mVarArr = zVar.d;
        int i2 = zVar.a;
        int[][] iArr2 = zVar.c;
        x xVar = zVar.h;
        x xVar2 = zVar.g;
        x xVar3 = zVar.f;
        x xVar4 = zVar.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            mVarA = mVarArr[i3];
        } else {
            l lVarF = mVarArr[i3].f();
            if (xVar4 != null) {
                lVarF.e = xVar4.c(iArr);
            }
            if (xVar3 != null) {
                lVarF.f = xVar3.c(iArr);
            }
            if (xVar2 != null) {
                lVarF.h = xVar2.c(iArr);
            }
            if (xVar != null) {
                lVarF.g = xVar.c(iArr);
            }
            mVarA = lVarF.a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.P.getClass();
            if (i5 == 1) {
                dVar = mVarA.g;
            } else if (i5 != 2) {
                dVar = i5 != 3 ? mVarA.f : mVarA.e;
            } else {
                dVar = mVarA.h;
            }
            float fA = dVar.a(rectFG);
            if (z2) {
                this.Y[i5] = fA;
            }
            androidx.dynamicanimation.animation.e[] eVarArr = this.X;
            androidx.dynamicanimation.animation.e eVar = eVarArr[i5];
            if (eVar != null) {
                eVar.a(fA);
                if (z2) {
                    eVarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.Q;
        PorterDuffColorFilter porterDuffColorFilter3 = this.R;
        g gVar = this.y;
        ColorStateList colorStateList = gVar.f;
        PorterDuff.Mode mode = gVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.L.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.Q = porterDuffColorFilter;
        this.y.getClass();
        this.R = null;
        this.y.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.Q) && Objects.equals(porterDuffColorFilter3, this.R)) ? false : true;
    }

    public final void s() {
        g gVar = this.y;
        float f = gVar.n + 0.0f;
        gVar.o = (int) Math.ceil(0.75f * f);
        this.y.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        g gVar = this.y;
        if (gVar.l != i) {
            gVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.y.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.w
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.y;
        gVar.a = mVar;
        gVar.b = null;
        this.Y = null;
        this.Z = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.y.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.y;
        if (gVar.g != mode) {
            gVar.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i() {
        this(new m());
    }
}
