package com.google.firebase;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.inputmethod.ExtractedText;
import androidx.appcompat.widget.r;
import androidx.collection.o0;
import androidx.collection.z;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.material3.e0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.ui.autofill.o;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.q;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.g0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.j0;
import androidx.compose.ui.graphics.vector.k0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.platform.i0;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.semantics.m;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.l0;
import androidx.compose.ui.text.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.y0;
import androidx.room.b0;
import com.app.mlounge.R;
import com.app.mlounge.emulator.EmulatorActivity;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.internal.measurement.p0;
import com.google.firebase.crashlytics.internal.model.t1;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.a2;
import com.google.protobuf.f2;
import com.google.protobuf.n1;
import com.google.protobuf.t0;
import com.google.protobuf.x0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static boolean H(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 || !(i2 == 26 || i2 == 27)) {
            return i3 >= 33 && i2 == 30;
        }
        return true;
    }

    public static boolean L(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final float M(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int N(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static int O(Object obj, a2 a2Var, byte[] bArr, int i2, int i3, int i4, p0 p0Var) throws x0 {
        n1 n1Var = (n1) a2Var;
        int i5 = p0Var.d + 1;
        p0Var.d = i5;
        if (i5 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iF = n1Var.F(obj, bArr, i2, i3, i4, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return iF;
    }

    public static int P(Object obj, a2 a2Var, byte[] bArr, int i2, int i3, p0 p0Var) throws x0 {
        int iR = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iR = r(i4, bArr, iR, p0Var);
            i4 = p0Var.a;
        }
        int i5 = iR;
        if (i4 < 0 || i4 > i3 - i5) {
            throw x0.g();
        }
        int i6 = p0Var.d + 1;
        p0Var.d = i6;
        if (i6 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        a2Var.g(obj, bArr, i5, i7, p0Var);
        p0Var.d--;
        p0Var.c = obj;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:181:0x043e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0443  */
    /* JADX WARN: Code duplicated, block: B:187:0x045f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0461  */
    /* JADX WARN: Code duplicated, block: B:189:0x046a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0487  */
    /* JADX WARN: Code duplicated, block: B:197:0x048f  */
    /* JADX WARN: Code duplicated, block: B:200:0x049f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    public static final androidx.compose.ui.graphics.painter.b S(int i2, s sVar) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        int i3;
        long jC;
        int i4;
        XmlResourceParser xmlResourceParser;
        int i5;
        TypedArray typedArrayObtainStyledAttributes;
        int i6;
        int i7;
        TypedArray typedArrayObtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        Shader shader;
        int i11;
        p p0Var;
        Shader shader2;
        int i12;
        p p0Var2;
        int i13;
        ColorStateList colorStateListA;
        Context context = (Context) sVar.j(m0.b);
        Resources resources = (Resources) sVar.j(m0.c);
        androidx.compose.ui.res.d dVar = (androidx.compose.ui.res.d) sVar.j(m0.e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.a.b(i2);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                z zVar = dVar.a;
                int iD = zVar.d(i2);
                Object[] objArr = zVar.c;
                Object obj = objArr[iD];
                zVar.b[iD] = i2;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !k.C(charSequence, ".xml")) {
            sVar.b0(-1771643000);
            boolean zF = sVar.f(context.getTheme()) | sVar.f(charSequence) | sVar.d(i2);
            Object objQ = sVar.Q();
            if (zF || objQ == n.a) {
                try {
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.getClass();
                    objQ = new androidx.compose.ui.graphics.g(((BitmapDrawable) drawable).getBitmap());
                    sVar.l0(objQ);
                } catch (Exception e2) {
                    throw new androidx.compose.ui.res.e(0, "Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) objQ;
            androidx.compose.ui.graphics.painter.a aVar = new androidx.compose.ui.graphics.painter.a(gVar, (((long) gVar.a.getHeight()) & 4294967295L) | (((long) gVar.a.getWidth()) << 32));
            sVar.p(false);
            return aVar;
        }
        sVar.b0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i14 = typedValue.changingConfigurations;
        androidx.compose.ui.res.c cVar = (androidx.compose.ui.res.c) sVar.j(m0.d);
        androidx.compose.ui.res.b bVar = new androidx.compose.ui.res.b(theme, i2);
        WeakReference weakReference = (WeakReference) cVar.a.get(bVar);
        androidx.compose.ui.res.a aVar2 = weakReference != null ? (androidx.compose.ui.res.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!l.a(xml.getName(), "vector")) {
                kotlinx.coroutines.future.a.q("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            androidx.compose.ui.graphics.vector.compat.a aVar3 = new androidx.compose.ui.graphics.vector.compat.a(xml);
            int[] iArr = androidx.compose.ui.graphics.vector.compat.b.a;
            TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            float fB = aVar3.b(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
            float fB2 = aVar3.b(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
            if (fB <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fB2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (typedArrayObtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = t.i;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue3);
                        int i15 = typedValue3.type;
                        if (i15 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i15 < 28 || i15 > 31) {
                            Resources resources2 = typedArrayObtainAttributes.getResources();
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = androidx.core.content.res.c.a;
                            try {
                                colorStateListA = androidx.core.content.res.c.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e3) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
                    jC = colorStateListA != null ? a0.c(colorStateListA.getDefaultColor()) : t.i;
                }
            } else {
                jC = t.i;
            }
            long j2 = jC;
            int i16 = typedArrayObtainAttributes.getInt(6, -1);
            aVar3.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (i16 == -1) {
                i4 = 5;
            } else if (i16 == 3) {
                i4 = 3;
            } else if (i16 == 5) {
                i4 = 5;
            } else if (i16 != 9) {
                switch (i16) {
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f2 = dimension / resources.getDisplayMetrics().density;
            float f3 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayObtainAttributes.recycle();
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e(null, f2, f3, fB, fB2, j2, i4, z, 1);
            int i17 = 0;
            for (int i18 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i18); i18 = 3) {
                List listL = w.e;
                XmlPullParser xmlPullParser = aVar3.a;
                com.google.firebase.platforminfo.d dVar2 = aVar3.c;
                int i19 = i3;
                int eventType = xmlPullParser.getEventType();
                int i20 = i14;
                if (eventType != 2) {
                    if (eventType != i18) {
                        bVar = bVar;
                        xmlResourceParser = xml;
                        i6 = i19;
                    } else if ("group".equals(xmlPullParser.getName())) {
                        int i21 = i17 + 1;
                        int i22 = 0;
                        while (i22 < i21) {
                            ArrayList arrayList = eVar.i;
                            if (eVar.k) {
                                androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            androidx.compose.ui.graphics.vector.d dVar3 = (androidx.compose.ui.graphics.vector.d) arrayList.remove(arrayList.size() - 1);
                            ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.l(i19, arrayList)).j.add(new g0(dVar3.a, dVar3.b, dVar3.c, dVar3.d, dVar3.e, dVar3.f, dVar3.g, dVar3.h, dVar3.i, dVar3.j));
                            i22++;
                            i19 = 1;
                        }
                        bVar = bVar;
                        xmlResourceParser = xml;
                        i6 = 1;
                        i17 = 0;
                    }
                    xmlResourceParser.next();
                    i3 = i6;
                    bVar = bVar;
                    i14 = i20;
                    xml = xmlResourceParser;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            xmlResourceParser = xml;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    int[] iArr2 = androidx.compose.ui.graphics.vector.compat.b.b;
                                    TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB3 = aVar3.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                    float f4 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f5 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB4 = aVar3.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                    float fB5 = aVar3.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                    float fB6 = aVar3.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                    float fB7 = aVar3.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                    String string = typedArrayObtainAttributes2.getString(0);
                                    aVar3.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayObtainAttributes2.recycle();
                                    int i23 = h0.a;
                                    if (eVar.k) {
                                        androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    eVar.i.add(new androidx.compose.ui.graphics.vector.d(str, fB3, f4, f5, fB4, fB5, fB6, fB7, listL, 512));
                                }
                            } else if (name.equals("path")) {
                                int[] iArr3 = androidx.compose.ui.graphics.vector.compat.b.c;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                    i7 = 0;
                                } else {
                                    i7 = 0;
                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    kotlinx.coroutines.future.a.q("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayObtainStyledAttributes2.getString(i7);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (string3 == null) {
                                    int i24 = h0.a;
                                } else {
                                    listL = com.google.firebase.platforminfo.d.l(dVar2, string3);
                                }
                                List list = listL;
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA = aVar3.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                float fB8 = aVar3.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                int i25 = !androidx.core.content.res.b.b(aVar3.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i25 == 0) {
                                    i8 = 0;
                                } else if (i25 == 1) {
                                    i8 = 1;
                                } else if (i25 != 2) {
                                    i8 = 0;
                                } else {
                                    i8 = 2;
                                }
                                int i26 = !androidx.core.content.res.b.b(aVar3.a, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i26 != 0) {
                                    if (i26 == 1) {
                                        i9 = 1;
                                    } else if (i26 == 2) {
                                        i9 = 2;
                                    }
                                    float fB9 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA2 = aVar3.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                    float fB10 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float fB11 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float fB12 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float fB13 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float fB14 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (androidx.core.content.res.b.b(aVar3.a, "fillType")) {
                                        i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                    } else {
                                        i10 = 0;
                                    }
                                    aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                    typedArrayObtainStyledAttributes2.recycle();
                                    shader = (Shader) lVarA.z;
                                    i11 = lVarA.y;
                                    if (shader == null && i11 == 0) {
                                        p0Var = null;
                                    } else if (shader != null) {
                                        p0Var = new q(shader);
                                    } else {
                                        p0Var = new androidx.compose.ui.graphics.p0(a0.c(i11));
                                    }
                                    shader2 = (Shader) lVarA2.z;
                                    i12 = lVarA2.y;
                                    if (shader2 == null && i12 == 0) {
                                        p0Var2 = null;
                                    } else if (shader2 != null) {
                                        p0Var2 = new q(shader2);
                                    } else {
                                        p0Var2 = new androidx.compose.ui.graphics.p0(a0.c(i12));
                                    }
                                    if (i10 == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 1;
                                    }
                                    if (eVar.k) {
                                        androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.l(1, eVar.i)).j.add(new k0(str2, list, i13, p0Var, fB8, p0Var2, fB10, fB11, i8, i9, fB9, fB14, fB12, fB13));
                                    i6 = 1;
                                }
                                i9 = 0;
                                float fB15 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarA3 = aVar3.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                float fB16 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float fB17 = aVar3.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float fB18 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float fB19 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float fB110 = aVar3.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (androidx.core.content.res.b.b(aVar3.a, "fillType")) {
                                    i10 = 0;
                                } else {
                                    i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) lVarA.z;
                                i11 = lVarA.y;
                                if (shader == null) {
                                    p0Var = null;
                                } else if (shader != null) {
                                    p0Var = new q(shader);
                                } else {
                                    p0Var = new androidx.compose.ui.graphics.p0(a0.c(i11));
                                }
                                shader2 = (Shader) lVarA3.z;
                                i12 = lVarA3.y;
                                if (shader2 == null) {
                                    p0Var2 = null;
                                } else if (shader2 != null) {
                                    p0Var2 = new q(shader2);
                                } else {
                                    p0Var2 = new androidx.compose.ui.graphics.p0(a0.c(i12));
                                }
                                if (i10 == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 1;
                                }
                                if (eVar.k) {
                                    androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((androidx.compose.ui.graphics.vector.d) androidx.privacysandbox.ads.adservices.java.internal.a.l(1, eVar.i)).j.add(new k0(str2, list, i13, p0Var, fB8, p0Var2, fB16, fB17, i8, i9, fB15, fB110, fB18, fB19));
                                i6 = 1;
                            }
                        } else {
                            bVar = bVar;
                            xmlResourceParser = xml;
                            if (name.equals("clip-path")) {
                                int[] iArr4 = androidx.compose.ui.graphics.vector.compat.b.d;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                }
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String string4 = typedArrayObtainStyledAttributes.getString(i5);
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i6 = 1;
                                String string5 = typedArrayObtainStyledAttributes.getString(1);
                                aVar3.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                if (string5 == null) {
                                    int i27 = h0.a;
                                } else {
                                    listL = com.google.firebase.platforminfo.d.l(dVar2, string5);
                                }
                                List list2 = listL;
                                typedArrayObtainStyledAttributes.recycle();
                                if (eVar.k) {
                                    androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                eVar.i.add(new androidx.compose.ui.graphics.vector.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i17++;
                            } else {
                                i6 = 1;
                            }
                        }
                        xmlResourceParser.next();
                        i3 = i6;
                        bVar = bVar;
                        i14 = i20;
                        xml = xmlResourceParser;
                    }
                    i6 = 1;
                    xmlResourceParser.next();
                    i3 = i6;
                    bVar = bVar;
                    i14 = i20;
                    xml = xmlResourceParser;
                }
                xmlResourceParser = xml;
                i6 = 1;
                xmlResourceParser.next();
                i3 = i6;
                bVar = bVar;
                i14 = i20;
                xml = xmlResourceParser;
            }
            androidx.compose.ui.res.b bVar2 = bVar;
            aVar2 = new androidx.compose.ui.res.a(eVar.b(), i14 | aVar3.b);
            cVar.a.put(bVar2, new WeakReference(aVar2));
        }
        j0 j0VarD = androidx.compose.ui.graphics.vector.b.d(aVar2.a, sVar);
        sVar.p(false);
        return j0VarD;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x02af  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02db  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:145:0x030f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0319  */
    /* JADX WARN: Code duplicated, block: B:150:0x0322  */
    /* JADX WARN: Code duplicated, block: B:151:0x0324  */
    /* JADX WARN: Code duplicated, block: B:153:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x034f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0367  */
    /* JADX WARN: Code duplicated, block: B:172:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0371  */
    /* JADX WARN: Code duplicated, block: B:177:0x0374 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x037a  */
    /* JADX WARN: Code duplicated, block: B:184:0x038b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0392  */
    /* JADX WARN: Code duplicated, block: B:189:0x039c A[LOOP:5: B:188:0x039a->B:189:0x039c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:208:0x0197 A[EDGE_INSN: B:208:0x0197->B:70:0x0197 BREAK  A[LOOP:0: B:9:0x003e->B:68:0x0175], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0173 A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v12 androidx.compose.ui.autofill.e) = (r6v11 androidx.compose.ui.autofill.e), (r6v13 androidx.compose.ui.autofill.e) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v8 androidx.compose.ui.state.a) = (r21v7 androidx.compose.ui.state.a), (r21v9 androidx.compose.ui.state.a) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v5 androidx.compose.ui.text.g) = (r22v4 androidx.compose.ui.text.g), (r22v6 androidx.compose.ui.text.g) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v5 androidx.compose.ui.autofill.g) = (r23v4 androidx.compose.ui.autofill.g), (r23v6 androidx.compose.ui.autofill.g) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 androidx.compose.ui.autofill.p) = (r24v5 androidx.compose.ui.autofill.p), (r24v7 androidx.compose.ui.autofill.p) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v8 androidx.compose.ui.semantics.j) = (r26v7 androidx.compose.ui.semantics.j), (r26v9 androidx.compose.ui.semantics.j) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[LOOP:0: B:9:0x003e->B:68:0x0175, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void T(ViewStructure viewStructure, f0 f0Var, AutofillId autofillId, String str, androidx.compose.ui.spatial.b bVar) {
        long j2;
        long j3;
        char c2;
        long j4;
        boolean zBooleanValue;
        androidx.compose.ui.state.a aVar;
        androidx.compose.ui.text.g gVar;
        androidx.compose.ui.autofill.g gVar2;
        androidx.compose.ui.semantics.j jVar;
        androidx.compose.ui.autofill.e eVar;
        boolean z;
        androidx.compose.ui.autofill.p pVar;
        Boolean bool;
        boolean z2;
        Integer num;
        int i2;
        List list;
        Integer numValueOf;
        int iIntValue;
        Integer numValueOf2;
        String[] strArrV;
        boolean z3;
        boolean z4;
        boolean z5;
        String strR;
        int size;
        String strL;
        int i3;
        String[] strArrV2;
        boolean z6;
        String[] strArrV3;
        o0 o0Var;
        long[] jArr;
        Object[] objArr;
        int i4;
        long[] jArr2;
        Object[] objArr2;
        o0 o0Var2;
        androidx.compose.ui.state.a aVar2;
        androidx.compose.ui.text.g gVar3;
        androidx.compose.ui.autofill.g gVar4;
        androidx.compose.ui.semantics.j jVar2;
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.a;
        androidx.compose.ui.semantics.z zVar2 = m.a;
        androidx.compose.ui.semantics.n nVarX = f0Var.x();
        int i5 = 8;
        if (nVarX == null || (o0Var2 = nVarX.e) == null) {
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            zBooleanValue = true;
            aVar = null;
            gVar = null;
            gVar2 = null;
            jVar = null;
            eVar = null;
            z = false;
            pVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = o0Var2.b;
            j2 = 128;
            Object[] objArr4 = o0Var2.c;
            long[] jArr3 = o0Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i6 = 0;
                eVar = null;
                j3 = 255;
                z = false;
                aVar2 = null;
                gVar3 = null;
                gVar4 = null;
                pVar = null;
                bool = null;
                jVar2 = null;
                z2 = false;
                num = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr3[i6];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr3[i9];
                                Object obj2 = objArr4[i9];
                                androidx.compose.ui.semantics.z zVar3 = (androidx.compose.ui.semantics.z) obj;
                                if (l.a(zVar3, androidx.compose.ui.semantics.w.r)) {
                                    obj2.getClass();
                                    eVar = (androidx.compose.ui.autofill.e) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) kotlin.collections.p.D((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.q)) {
                                    obj2.getClass();
                                    pVar = (androidx.compose.ui.autofill.p) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.s)) {
                                    obj2.getClass();
                                    gVar4 = (androidx.compose.ui.autofill.g) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.F)) {
                                    obj2.getClass();
                                    gVar3 = (androidx.compose.ui.text.g) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.O)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.K)) {
                                    z2 = true;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.n)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.y)) {
                                    obj2.getClass();
                                    jVar2 = (androidx.compose.ui.semantics.j) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.I)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (l.a(zVar3, androidx.compose.ui.semantics.w.J)) {
                                    obj2.getClass();
                                    aVar2 = (androidx.compose.ui.state.a) obj2;
                                } else if (l.a(zVar3, m.b)) {
                                    viewStructure.setClickable(true);
                                } else if (l.a(zVar3, m.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (l.a(zVar3, m.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (l.a(zVar3, m.k)) {
                                    z = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            } else {
                j3 = 255;
                c2 = 7;
                j4 = -9187201950435737472L;
                zBooleanValue = true;
                eVar = null;
                z = false;
                aVar2 = null;
                gVar3 = null;
                gVar4 = null;
                pVar = null;
                bool = null;
                jVar2 = null;
                z2 = false;
                num = null;
            }
            aVar = aVar2;
            gVar = gVar3;
            gVar2 = gVar4;
            jVar = jVar2;
        }
        androidx.compose.ui.semantics.n nVarX2 = f0Var.x();
        if (nVarX2 != null && nVarX2.z && !nVarX2.A) {
            nVarX2 = nVarX2.c();
            androidx.collection.j0 j0Var = new androidx.collection.j0(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z);
            j0Var.c(f0Var.n());
            while (j0Var.i()) {
                f0 f0Var2 = (f0) j0Var.k(j0Var.b - 1);
                androidx.compose.ui.semantics.n nVarX3 = f0Var2.x();
                if (nVarX3 != null && !nVarX3.z) {
                    nVarX2.e(nVarX3);
                    if (!nVarX3.A) {
                        j0Var.c(f0Var2.n());
                    }
                }
            }
        }
        if (nVarX2 != null && (o0Var = nVarX2.e) != null) {
            Object[] objArr5 = o0Var.b;
            Object[] objArr6 = o0Var.c;
            long[] jArr4 = o0Var.a;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j6 = jArr4[i10];
                    int i11 = i5;
                    int i12 = i10;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j6 & j3) < j2) {
                                int i15 = (i12 << 3) + i14;
                                Object obj3 = objArr5[i15];
                                Object obj4 = objArr6[i15];
                                jArr2 = jArr4;
                                androidx.compose.ui.semantics.z zVar4 = (androidx.compose.ui.semantics.z) obj3;
                                objArr2 = objArr5;
                                if (l.a(zVar4, androidx.compose.ui.semantics.w.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (l.a(zVar4, androidx.compose.ui.semantics.w.B)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j6 >>= i11;
                            i14++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                        if (i13 != i4) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i4 = i11;
                    }
                    if (i12 == length2) {
                        break;
                    }
                    i10 = i12 + 1;
                    i5 = i4;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
            numValueOf = Integer.valueOf(f0Var.y);
            if (f0Var.v() == null) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            androidx.compose.ui.autofill.i.d(viewStructure, autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            if (eVar != null) {
                numValueOf2 = Integer.valueOf(eVar.a);
            } else if (z) {
                numValueOf2 = Integer.valueOf(i2);
            } else if (aVar != null) {
                numValueOf2 = 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                androidx.compose.ui.autofill.i.e(viewStructure, numValueOf2.intValue());
            }
            if (gVar != null) {
                androidx.compose.ui.autofill.i.f(viewStructure, androidx.compose.ui.autofill.i.a(gVar.y));
            }
            if (gVar2 != null) {
                androidx.compose.ui.autofill.i.f(viewStructure, gVar2.a);
            }
            if (pVar != null && (strArrV3 = com.google.android.gms.dynamite.g.v(pVar)) != null) {
                androidx.compose.ui.autofill.i.c(viewStructure, strArrV3);
            }
            bVar.a.u(f0Var.y, new androidx.compose.ui.autofill.s(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (aVar != null) {
                viewStructure.setCheckable(i2);
                if (aVar == androidx.compose.ui.state.a.e) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                viewStructure.setChecked(z6);
            } else if (bool != null && (jVar == null || jVar.a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            androidx.compose.ui.autofill.p.a.getClass();
            strArrV = com.google.android.gms.dynamite.g.v(o.b);
            strArrV.getClass();
            if (strArrV.length != 0) {
                androidx.transition.k.m("Array is empty.");
                return;
            }
            String str2 = strArrV[0];
            if (pVar == null && (strArrV2 = com.google.android.gms.dynamite.g.v(pVar)) != null) {
                boolean zC = kotlin.collections.o.c(str2, strArrV2);
                z3 = true;
                boolean z7 = zC;
                if (!z2 || z7) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                if (!z4 || zBooleanValue) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                androidx.compose.ui.autofill.i.g(viewStructure, z5);
                viewStructure.setVisibility(((d1) f0Var.d0.e).c1() ? 4 : 0);
                if (list != null) {
                    size = list.size();
                    strL = "";
                    for (i3 = 0; i3 < size; i3++) {
                        strL = androidx.compose.runtime.j.l(androidx.compose.runtime.j.p(strL), ((androidx.compose.ui.text.g) list.get(i3)).y, '\n');
                    }
                    viewStructure.setText(strL);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((androidx.collection.h0) f0Var.n()).isEmpty() && jVar != null && (strR = i0.r(jVar.a)) != null) {
                    viewStructure.setClassName(strR);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        androidx.arch.core.executor.d.y(viewStructure, num.intValue());
                    }
                    if (z4) {
                        androidx.compose.ui.autofill.i.h(viewStructure);
                    }
                }
            }
            z3 = true;
            if (z2) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            if (z4) {
                z5 = z3;
            } else {
                z5 = z3;
            }
            androidx.compose.ui.autofill.i.g(viewStructure, z5);
            viewStructure.setVisibility(((d1) f0Var.d0.e).c1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strL = "";
                while (i3 < size) {
                    strL = androidx.compose.runtime.j.l(androidx.compose.runtime.j.p(strL), ((androidx.compose.ui.text.g) list.get(i3)).y, '\n');
                }
                viewStructure.setText(strL);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((androidx.collection.h0) f0Var.n()).isEmpty()) {
                viewStructure.setClassName(strR);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28) {
                    androidx.arch.core.executor.d.y(viewStructure, num.intValue());
                }
                if (z4) {
                    androidx.compose.ui.autofill.i.h(viewStructure);
                }
            }
        }
        i2 = 1;
        list = null;
        numValueOf = Integer.valueOf(f0Var.y);
        if (f0Var.v() == null) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        androidx.compose.ui.autofill.i.d(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (eVar != null) {
            numValueOf2 = Integer.valueOf(eVar.a);
        } else if (z) {
            numValueOf2 = Integer.valueOf(i2);
        } else if (aVar != null) {
            numValueOf2 = 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            androidx.compose.ui.autofill.i.e(viewStructure, numValueOf2.intValue());
        }
        if (gVar != null) {
            androidx.compose.ui.autofill.i.f(viewStructure, androidx.compose.ui.autofill.i.a(gVar.y));
        }
        if (gVar2 != null) {
            androidx.compose.ui.autofill.i.f(viewStructure, gVar2.a);
        }
        if (pVar != null) {
            androidx.compose.ui.autofill.i.c(viewStructure, strArrV3);
        }
        bVar.a.u(f0Var.y, new androidx.compose.ui.autofill.s(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (aVar != null) {
            viewStructure.setCheckable(i2);
            if (aVar == androidx.compose.ui.state.a.e) {
                z6 = true;
            } else {
                z6 = false;
            }
            viewStructure.setChecked(z6);
        } else if (bool != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        androidx.compose.ui.autofill.p.a.getClass();
        strArrV = com.google.android.gms.dynamite.g.v(o.b);
        strArrV.getClass();
        if (strArrV.length != 0) {
            androidx.transition.k.m("Array is empty.");
            return;
        }
        String str3 = strArrV[0];
        if (pVar == null) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        androidx.compose.ui.autofill.i.g(viewStructure, z5);
        viewStructure.setVisibility(((d1) f0Var.d0.e).c1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strL = "";
            while (i3 < size) {
                strL = androidx.compose.runtime.j.l(androidx.compose.runtime.j.p(strL), ((androidx.compose.ui.text.g) list.get(i3)).y, '\n');
            }
            viewStructure.setText(strL);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((androidx.collection.h0) f0Var.n()).isEmpty()) {
            viewStructure.setClassName(strR);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                androidx.arch.core.executor.d.y(viewStructure, num.intValue());
            }
            if (z4) {
                androidx.compose.ui.autofill.i.h(viewStructure);
            }
        }
    }

    public static long U(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j3 == Long.MIN_VALUE) & (j2 < 0)))) {
            long j5 = j2 * j3;
            if (j2 == 0 || j5 / j2 == j3) {
                return j5;
            }
        }
        return j4;
    }

    public static int W(int i2, byte[] bArr, int i3, int i4, p0 p0Var) throws x0 {
        if ((i2 >>> 3) == 0) {
            throw x0.a();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return u(bArr, i3, p0Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return s(bArr, i3, p0Var) + p0Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw x0.a();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = p0Var.d + 1;
        p0Var.d = i7;
        if (i7 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i3 < i4) {
            i3 = s(bArr, i3, p0Var);
            i8 = p0Var.a;
            if (i8 == i6) {
                break;
            }
            i3 = W(i8, bArr, i3, i4, p0Var);
        }
        p0Var.d--;
        if (i3 > i4 || i8 != i6) {
            throw x0.f();
        }
        return i3;
    }

    public static final ExtractedText X(x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.a.y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = xVar.b;
        extractedText.selectionStart = l0.f(j2);
        extractedText.selectionEnd = l0.e(j2);
        extractedText.flags = !k.A(xVar.a.y, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int Y(coil3.size.c cVar, coil3.size.g gVar) {
        if (cVar instanceof coil3.size.a) {
            return ((coil3.size.a) cVar).a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        coil3.g.a();
        return 0;
    }

    public static final void a(androidx.navigation.i iVar, androidx.compose.runtime.saveable.d dVar, androidx.compose.runtime.internal.f fVar, s sVar, int i2) {
        sVar.c0(233973821);
        if ((((sVar.h(iVar) ? 4 : 2) | i2 | (sVar.h(dVar) ? 32 : 16)) & Token.EXPR_VOID) == 146 && sVar.F()) {
            sVar.W();
        } else {
            androidx.compose.runtime.t.b(new r[]{androidx.lifecycle.viewmodel.compose.a.a.a(iVar), androidx.lifecycle.compose.c.a.a(iVar), androidx.savedstate.compose.a.a.a(iVar)}, androidx.compose.runtime.internal.k.c(1808964477, new e0(8, dVar, fVar), sVar), sVar, 56);
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b2(iVar, dVar, fVar, i2, 3);
        }
    }

    public static int a0(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static final void b(androidx.compose.ui.r rVar, r1 r1Var, androidx.compose.runtime.internal.f fVar, s sVar, int i2) {
        int i3;
        sVar.c0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.f(r1Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        androidx.compose.runtime.internal.f fVar2 = androidx.compose.foundation.text.contextmenu.internal.k.a;
        if (i4 == 0) {
            i3 |= sVar.h(fVar2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (sVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            if (objQ == n.a) {
                Object j1Var = new j1(null, androidx.compose.runtime.f.A);
                sVar.l0(j1Var);
                objQ = j1Var;
            }
            androidx.compose.foundation.text.contextmenu.provider.c cVarD = d(fVar2, sVar, (i3 >> 6) & 14);
            androidx.compose.runtime.t.a(r1Var.a(cVarD), androidx.compose.runtime.internal.k.c(274270255, new androidx.compose.foundation.text.contextmenu.provider.d(rVar, (a1) objQ, fVar, cVarD, 0), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(rVar, r1Var, fVar, i2, 5);
        }
    }

    public static final void c(androidx.compose.runtime.saveable.d dVar, androidx.compose.runtime.internal.f fVar, s sVar, int i2) {
        sVar.c0(832919318);
        int i3 = (sVar.h(dVar) ? 4 : 2) | i2 | (sVar.h(fVar) ? 32 : 16);
        if ((i3 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            if (objQ == n.a) {
                objQ = new y(26);
                sVar.l0(objQ);
            }
            kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
            y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
            if (y0VarA == null) {
                kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(androidx.navigation.compose.a.class);
            androidx.collection.internal.b bVar = new androidx.collection.internal.b(1);
            bVar.d(kotlin.jvm.internal.a0.a(androidx.navigation.compose.a.class), lVar);
            androidx.navigation.compose.a aVar = (androidx.navigation.compose.a) _COROUTINE.b.J(eVarA, y0VarA, bVar.f(), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
            aVar.c = new androidx.media3.exoplayer.hls.c(dVar);
            dVar.e(aVar.b, fVar, sVar, ((i3 << 6) & 896) | (i3 & Token.ASSIGN_MOD));
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(dVar, fVar, i2, 14);
        }
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.c d(androidx.compose.runtime.internal.f fVar, s sVar, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && sVar.f(fVar)) || (i2 & 6) == 4;
        Object objQ = sVar.Q();
        Object obj = n.a;
        if (z || objQ == obj) {
            objQ = new androidx.compose.foundation.text.contextmenu.provider.c(fVar);
            sVar.l0(objQ);
        }
        androidx.compose.foundation.text.contextmenu.provider.c cVar = (androidx.compose.foundation.text.contextmenu.provider.c) objQ;
        boolean zF = sVar.f(cVar);
        Object objQ2 = sVar.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new androidx.activity.compose.g(cVar, 21);
            sVar.l0(objQ2);
        }
        androidx.compose.runtime.l0.b(cVar, (kotlin.jvm.functions.l) objQ2, sVar);
        return cVar;
    }

    public static long g(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j3) < 0) || ((j2 ^ j4) >= 0)) {
            return j4;
        }
        throw new ArithmeticException(androidx.privacysandbox.ads.adservices.java.internal.a.p(j3, ")", androidx.compose.runtime.j.o(j2, "overflow: checkedAdd(", ", ")));
    }

    public static final long h(int i2, int i3, coil3.size.h hVar, coil3.size.g gVar, coil3.size.h hVar2) {
        int i4;
        int i5;
        if (!l.a(hVar, coil3.size.h.c)) {
            i2 = Y(hVar.a, gVar);
            i3 = Y(hVar.b, gVar);
        }
        coil3.size.c cVar = hVar2.a;
        coil3.size.c cVar2 = hVar2.b;
        if ((cVar instanceof coil3.size.a) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((coil3.size.a) cVar).a)) {
            i2 = i5;
        }
        if ((cVar2 instanceof coil3.size.a) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((coil3.size.a) cVar2).a)) {
            i3 = i4;
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final double i(int i2, int i3, int i4, int i5, coil3.size.g gVar, coil3.size.h hVar) {
        double dMax;
        double d2 = i2;
        double d3 = ((double) i4) / d2;
        double d4 = i3;
        double d5 = ((double) i5) / d4;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d3, d5);
        } else {
            if (iOrdinal != 1) {
                coil3.g.a();
                return 0.0d;
            }
            dMax = Math.min(d3, d5);
        }
        coil3.size.c cVar = hVar.a;
        if (cVar instanceof coil3.size.a) {
            double d6 = ((double) ((coil3.size.a) cVar).a) / d2;
            if (dMax > d6) {
                dMax = d6;
            }
        }
        coil3.size.c cVar2 = hVar.b;
        if (cVar2 instanceof coil3.size.a) {
            double d7 = ((double) ((coil3.size.a) cVar2).a) / d4;
            if (dMax > d7) {
                return d7;
            }
        }
        return dMax;
    }

    public static void j(EmulatorActivity emulatorActivity, String str, File file) {
        if (file.exists()) {
            Context context = com.app.mlounge.util.a.a;
            b0.h("Skipping existing asset: ", file.getName(), "D", "PPSSPPAssets");
            return;
        }
        try {
            InputStream inputStreamOpen = emulatorActivity.getAssets().open(str);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    inputStreamOpen.getClass();
                    dagger.hilt.android.internal.b.c(inputStreamOpen, fileOutputStream);
                    fileOutputStream.close();
                    inputStreamOpen.close();
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "PPSSPPAssets", "Copied asset: ".concat(str));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dagger.internal.d.b(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    dagger.internal.d.b(inputStreamOpen, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            Context context3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "PPSSPPAssets", "Asset not found: ".concat(str));
        }
    }

    public static final File k(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static int l(byte[] bArr, int i2, p0 p0Var) throws x0 {
        int iS = s(bArr, i2, p0Var);
        int i3 = p0Var.a;
        if (i3 < 0) {
            throw x0.e();
        }
        if (i3 > bArr.length - iS) {
            throw x0.g();
        }
        if (i3 == 0) {
            p0Var.c = ByteString.EMPTY;
            return iS;
        }
        p0Var.c = ByteString.copyFrom(bArr, iS, i3);
        return iS + i3;
    }

    public static int m(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long n(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int o(a2 a2Var, byte[] bArr, int i2, int i3, int i4, p0 p0Var) throws x0 {
        GeneratedMessageLite generatedMessageLiteD = a2Var.d();
        int iO = O(generatedMessageLiteD, a2Var, bArr, i2, i3, i4, p0Var);
        a2Var.b(generatedMessageLiteD);
        p0Var.c = generatedMessageLiteD;
        return iO;
    }

    public static int p(a2 a2Var, int i2, byte[] bArr, int i3, int i4, t0 t0Var, p0 p0Var) throws x0 {
        GeneratedMessageLite generatedMessageLiteD = a2Var.d();
        a2 a2Var2 = a2Var;
        byte[] bArr2 = bArr;
        int i5 = i4;
        p0 p0Var2 = p0Var;
        int iP = P(generatedMessageLiteD, a2Var2, bArr2, i3, i5, p0Var2);
        a2Var2.b(generatedMessageLiteD);
        p0Var2.c = generatedMessageLiteD;
        t0Var.add(generatedMessageLiteD);
        while (iP < i5) {
            p0 p0Var3 = p0Var2;
            int i6 = i5;
            int iS = s(bArr2, iP, p0Var3);
            if (i2 != p0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            a2 a2Var3 = a2Var2;
            GeneratedMessageLite generatedMessageLiteD2 = a2Var3.d();
            iP = P(generatedMessageLiteD2, a2Var3, bArr3, iS, i6, p0Var3);
            a2Var2 = a2Var3;
            bArr2 = bArr3;
            i5 = i6;
            p0Var2 = p0Var3;
            a2Var2.b(generatedMessageLiteD2);
            p0Var2.c = generatedMessageLiteD2;
            t0Var.add(generatedMessageLiteD2);
        }
        return iP;
    }

    public static int q(int i2, byte[] bArr, int i3, int i4, f2 f2Var, p0 p0Var) throws x0 {
        if ((i2 >>> 3) == 0) {
            throw x0.a();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iU = u(bArr, i3, p0Var);
            f2Var.f(i2, Long.valueOf(p0Var.b));
            return iU;
        }
        if (i5 == 1) {
            f2Var.f(i2, Long.valueOf(n(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iS = s(bArr, i3, p0Var);
            int i6 = p0Var.a;
            if (i6 < 0) {
                throw x0.e();
            }
            if (i6 > bArr.length - iS) {
                throw x0.g();
            }
            if (i6 == 0) {
                f2Var.f(i2, ByteString.EMPTY);
            } else {
                f2Var.f(i2, ByteString.copyFrom(bArr, iS, i6));
            }
            return iS + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw x0.a();
            }
            f2Var.f(i2, Integer.valueOf(m(bArr, i3)));
            return i3 + 4;
        }
        f2 f2Var2 = new f2();
        int i7 = (i2 & (-8)) | 4;
        int i8 = p0Var.d + 1;
        p0Var.d = i8;
        if (i8 >= 100) {
            throw new x0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (i3 < i4) {
            int iS2 = s(bArr, i3, p0Var);
            i9 = p0Var.a;
            if (i9 == i7) {
                i3 = iS2;
                break;
            }
            i3 = q(i9, bArr, iS2, i4, f2Var2, p0Var);
        }
        p0Var.d--;
        if (i3 > i4 || i9 != i7) {
            throw x0.f();
        }
        f2Var.f(i2, f2Var2);
        return i3;
    }

    public static int r(int i2, byte[] bArr, int i3, p0 p0Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            p0Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            p0Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            p0Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            p0Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                p0Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int s(byte[] bArr, int i2, p0 p0Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return r(b2, bArr, i3, p0Var);
        }
        p0Var.a = b2;
        return i3;
    }

    public static int t(int i2, byte[] bArr, int i3, int i4, t0 t0Var, p0 p0Var) {
        com.google.protobuf.m0 m0Var = (com.google.protobuf.m0) t0Var;
        int iS = s(bArr, i3, p0Var);
        m0Var.c(p0Var.a);
        while (iS < i4) {
            int iS2 = s(bArr, iS, p0Var);
            if (i2 != p0Var.a) {
                break;
            }
            iS = s(bArr, iS2, p0Var);
            m0Var.c(p0Var.a);
        }
        return iS;
    }

    public static int u(byte[] bArr, int i2, p0 p0Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            p0Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        p0Var.b = j3;
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long v(long j2, long j3, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (j5 == 0) {
            return j4;
        }
        int i2 = ((int) ((j2 ^ j3) >> 63)) | 1;
        switch (com.google.common.math.e.a[roundingMode.ordinal()]) {
            case 1:
                t1.o(j5 == 0);
                return j4;
            case 2:
                return j4;
            case 3:
                if (i2 >= 0) {
                    return j4;
                }
                return j4 + ((long) i2);
            case 4:
                return j4 + ((long) i2);
            case 5:
                if (i2 <= 0) {
                    return j4;
                }
                return j4 + ((long) i2);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j5);
                long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j4) == 0)) {
                        return j4;
                    }
                } else if (jAbs2 <= 0) {
                    return j4;
                }
                return j4 + ((long) i2);
            default:
                throw new AssertionError();
        }
    }

    public static final Object w(androidx.room.m mVar, String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objB = mVar.b(str, new androidx.navigation.compose.r(6), cVar);
        return objB == kotlin.coroutines.intrinsics.a.e ? objB : kotlin.y.a;
    }

    public static final float x(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / ((long) 3))) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static long y(long j2, long j3) {
        t1.m("a", j2);
        t1.m("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final androidx.savedstate.g z(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            androidx.savedstate.g gVar = tag instanceof androidx.savedstate.g ? (androidx.savedstate.g) tag : null;
            if (gVar != null) {
                return gVar;
            }
            Object objP = android.support.v4.media.session.b.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract int E(View view);

    public abstract int F(CoordinatorLayout coordinatorLayout);

    public abstract int G();

    public abstract boolean I(float f2);

    public abstract boolean J(View view);

    public abstract boolean K(float f2, float f3);

    public abstract void Q(Throwable th);

    public abstract void R(com.google.firebase.messaging.n nVar);

    public abstract boolean V(View view, float f2);

    public abstract void Z(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i2);
}
