package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.b0;
import com.app.mlounge.R;
import com.google.android.gms.tasks.q;
import com.google.android.material.internal.i;
import com.google.android.material.shape.a0;
import com.google.android.material.shape.m;
import com.google.android.material.shape.x;
import com.google.android.material.shape.y;
import com.google.android.material.shape.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayout {
    public final b0 A;
    public Integer[] B;
    public x C;
    public z D;
    public int E;
    public com.google.android.material.shape.b0 F;
    public boolean G;
    public final ArrayList e;
    public final ArrayList y;
    public final q z;

    public d(Context context, AttributeSet attributeSet) {
        x xVarB;
        int next;
        com.google.android.material.shape.b0 b0Var;
        int next2;
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.e = new ArrayList();
        this.y = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.z = new q(materialButtonToggleGroup);
        this.A = new b0(materialButtonToggleGroup, 2);
        this.G = true;
        Context context2 = getContext();
        TypedArray typedArrayE = i.e(context2, attributeSet, com.google.android.material.a.j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        b0Var = new com.google.android.material.shape.b0();
                        b0Var.c = new int[10][];
                        b0Var.d = new q[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            b0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    b0Var = null;
                }
            } else {
                b0Var = null;
            }
            this.F = b0Var;
        }
        if (typedArrayE.hasValue(4)) {
            z zVarB = z.b(context2, typedArrayE, 4);
            this.D = zVarB;
            if (zVarB == null) {
                y yVar = new y(m.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new com.google.android.material.shape.a(0)).a());
                this.D = yVar.b != 0 ? new z(yVar) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        xVarB = new x();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            xVarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    xVarB = x.b(aVar);
                }
            } else {
                xVarB = x.b(m.c(typedArrayE, 3, aVar));
            }
            this.C = xVarB;
        }
        this.E = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.E <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.E - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.E - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.G = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.z);
        this.e.add(materialButton.getShapeAppearanceModel());
        this.y.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.F == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                int iMin2 = 0;
                if (c(i) && this.F != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    com.google.android.material.shape.b0 b0Var = this.F;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < b0Var.a; i3++) {
                        a0 a0Var = (a0) b0Var.d[i3].e;
                        int i4 = a0Var.a;
                        float f = a0Var.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else {
                            if (i4 == 1) {
                                fMax = Math.max(i2, width * f);
                            }
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i6 = i + 1; i6 < childCount; i6++) {
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.F);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.S;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.S = null;
                materialButton.P = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.B = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.shape.m[], java.io.Serializable] */
    public final void e() {
        y yVar;
        int i;
        if (!(this.C == null && this.D == null) && this.G) {
            this.G = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    z zVar = this.D;
                    if (zVar == null || (!z && !z2)) {
                        zVar = (z) this.y.get(i2);
                    }
                    if (zVar == null) {
                        yVar = new y((m) this.e.get(i2));
                    } else {
                        y yVar2 = new y(0);
                        int i3 = zVar.a;
                        yVar2.b = i3;
                        yVar2.c = zVar.b;
                        int[][] iArr = zVar.c;
                        ?? r14 = new int[iArr.length][];
                        yVar2.d = r14;
                        m[] mVarArr = zVar.d;
                        yVar2.e = new m[mVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(mVarArr, 0, (m[]) yVar2.e, 0, yVar2.b);
                        yVar2.f = zVar.e;
                        yVar2.g = zVar.f;
                        yVar2.h = zVar.g;
                        yVar2.i = zVar.h;
                        yVar = yVar2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    x xVar = this.C;
                    if ((i4 | 1) == i4) {
                        yVar.f = xVar;
                    }
                    if ((i4 | 2) == i4) {
                        yVar.g = xVar;
                    }
                    if ((i4 | 4) == i4) {
                        yVar.h = xVar;
                    }
                    if ((i4 | 8) == i4) {
                        yVar.i = xVar;
                    }
                    z zVar2 = yVar.b == 0 ? null : new z(yVar);
                    if (zVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(zVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(zVar2.c());
                    }
                }
                i2++;
            }
        }
    }

    public com.google.android.material.shape.b0 getButtonSizeChange() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.B;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public com.google.android.material.shape.d getInnerCornerSize() {
        return this.C.b;
    }

    public x getInnerCornerSizeStateList() {
        return this.C;
    }

    public m getShapeAppearance() {
        z zVar = this.D;
        if (zVar == null) {
            return null;
        }
        return zVar.c();
    }

    public int getSpacing() {
        return this.E;
    }

    public z getStateListShapeAppearance() {
        return this.D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.e.remove(iIndexOfChild);
            this.y.remove(iIndexOfChild);
        }
        this.G = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(com.google.android.material.shape.b0 b0Var) {
        if (this.F != b0Var) {
            this.F = b0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(com.google.android.material.shape.d dVar) {
        this.C = x.b(dVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(x xVar) {
        this.C = xVar;
        this.G = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.G = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(m mVar) {
        y yVar = new y(mVar);
        this.D = yVar.b == 0 ? null : new z(yVar);
        this.G = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.E = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(z zVar) {
        this.D = zVar;
        this.G = true;
        e();
        invalidate();
    }
}
