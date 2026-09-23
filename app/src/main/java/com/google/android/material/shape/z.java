package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.app.mlounge.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final int a;
    public final m b;
    public final int[][] c;
    public final m[] d;
    public final x e;
    public final x f;
    public final x g;
    public final x h;

    public z(y yVar) {
        this.a = yVar.b;
        this.b = (m) yVar.c;
        this.c = (int[][]) yVar.d;
        this.d = (m[]) yVar.e;
        this.e = (x) yVar.f;
        this.f = (x) yVar.g;
        this.g = (x) yVar.h;
        this.h = (x) yVar.i;
    }

    public static void a(y yVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = com.google.android.material.a.m;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                m mVarA = m.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new a(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                yVar.b(StateSet.trimStateSet(iArr2, i), mVarA);
            }
        }
    }

    public static z b(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        y yVar = new y(0);
        yVar.e();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(yVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (yVar.b == 0) {
                    return null;
                }
                return new z(yVar);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            yVar.e();
        }
    }

    public final m c() {
        m mVar = this.b;
        x xVar = this.h;
        x xVar2 = this.g;
        x xVar3 = this.f;
        x xVar4 = this.e;
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            return mVar;
        }
        l lVarF = mVar.f();
        if (xVar4 != null) {
            lVarF.e = xVar4.b;
        }
        if (xVar3 != null) {
            lVarF.f = xVar3.b;
        }
        if (xVar2 != null) {
            lVarF.h = xVar2.b;
        }
        if (xVar != null) {
            lVarF.g = xVar.b;
        }
        return lVarF.a();
    }

    public final boolean d() {
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        return this.a > 1 || ((xVar = this.e) != null && xVar.a > 1) || (((xVar2 = this.f) != null && xVar2.a > 1) || (((xVar3 = this.g) != null && xVar3.a > 1) || ((xVar4 = this.h) != null && xVar4.a > 1)));
    }
}
