package coil3.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.room.t;
import coil3.decode.s;
import coil3.l;
import coil3.request.n;
import coil3.util.m;
import coil3.v;
import com.app.mlounge.ui.viewmodel.q0;
import java.io.IOException;
import java.util.Locale;
import kotlin.collections.p;
import kotlin.text.r;
import okio.b0;
import okio.x;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final v b;
    public final n c;

    public /* synthetic */ b(v vVar, n nVar, int i) {
        this.a = i;
        this.b = vVar;
        this.c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0333  */
    /* JADX WARN: Code duplicated, block: B:193:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        Integer numW;
        String mimeTypeFromExtension2;
        Drawable drawable;
        int i7 = this.a;
        int i8 = 0;
        int i9 = 1;
        coil3.decode.h hVar = coil3.decode.h.z;
        v vVar = this.b;
        n nVar = this.c;
        String mimeTypeFromExtension3 = null;
        switch (i7) {
            case 0:
                String strI = p.I(p.y(1, l.g(vVar)), "/", null, null, null, 62);
                s sVar = new s(new b0(okio.b.e(nVar.a.getAssets().open(strI))), nVar.f, new coil3.decode.a(strI));
                if (kotlin.text.k.J(strI)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strC0 = kotlin.text.k.c0(kotlin.text.k.c0(strI, '#'), '?');
                    String strX = kotlin.text.k.X('.', kotlin.text.k.X('/', strC0, strC0), "");
                    if (kotlin.text.k.J(strX)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strX.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) coil3.util.i.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new k(sVar, mimeTypeFromExtension, hVar);
            case 1:
                String str = vVar.a;
                String str2 = vVar.a;
                int iH = kotlin.text.k.H(str, ";base64,", 0, false, 6);
                if (iH == -1) {
                    kotlinx.coroutines.future.a.e(vVar, "invalid data uri: ");
                    return null;
                }
                int iG = kotlin.text.k.G(str2, ':', 0, 6);
                if (iG == -1) {
                    kotlinx.coroutines.future.a.e(vVar, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str2.substring(iG + 1, iH);
                kotlin.io.encoding.a aVar = kotlin.io.encoding.c.c;
                int i10 = iH + 8;
                int length = str2.length();
                aVar.getClass();
                boolean z = aVar.b;
                kotlin.collections.c.a(i10, length, str2.length());
                byte[] bytes = str2.substring(i10, length).getBytes(kotlin.text.a.d);
                bytes.getClass();
                int length2 = bytes.length;
                kotlin.collections.c.a(0, length2, bytes.length);
                int i11 = -2;
                if (length2 == 0) {
                    i = 1;
                } else {
                    if (length2 == 1) {
                        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                        return null;
                    }
                    if (z) {
                        i3 = length2;
                        int i12 = 0;
                        while (true) {
                            i = i9;
                            if (i12 < length2) {
                                int i13 = kotlin.io.encoding.d.a[bytes[i12] & 255];
                                if (i13 < 0) {
                                    if (i13 == -2) {
                                        i3 -= length2 - i12;
                                    } else {
                                        i3--;
                                    }
                                }
                                i12++;
                                i9 = i;
                            }
                        }
                    } else {
                        i = 1;
                        if (bytes[length2 - 1] == 61) {
                            i3 = length2 - 1;
                            if (bytes[length2 - 2] == 61) {
                                i3 = length2 - 2;
                            }
                        } else {
                            i2 = length2;
                        }
                        i8 = (int) ((((long) i2) * ((long) 6)) / ((long) 8));
                    }
                    i2 = i3;
                    i8 = (int) ((((long) i2) * ((long) 6)) / ((long) 8));
                }
                byte[] bArr = new byte[i8];
                int[] iArr = aVar.a ? kotlin.io.encoding.d.b : kotlin.io.encoding.d.a;
                int i14 = -8;
                int i15 = 8;
                int i16 = -8;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i17 < length2) {
                        if (i16 == i14 && (i6 = i17 + 3) < length2) {
                            int i20 = i17 + 4;
                            int i21 = (iArr[bytes[i17 + 2] & 255] << 6) | (iArr[bytes[i17] & 255] << 18) | (iArr[bytes[i17 + 1] & 255] << 12) | iArr[bytes[i6] & 255];
                            if (i21 >= 0) {
                                bArr[i18] = (byte) (i21 >> 16);
                                int i22 = i18 + 2;
                                bArr[i18 + 1] = (byte) (i21 >> 8);
                                i18 += 3;
                                bArr[i22] = (byte) i21;
                                i17 = i20;
                            }
                            i11 = -2;
                            i14 = -8;
                        }
                        int i23 = bytes[i17] & 255;
                        int i24 = iArr[i23];
                        if (i24 >= 0) {
                            i17++;
                            i19 = (i19 << 6) | i24;
                            int i25 = i16 + 6;
                            if (i25 >= 0) {
                                bArr[i18] = (byte) (i19 >>> i25);
                                i19 &= (i << i25) - 1;
                                i16 -= 2;
                                i18++;
                                i11 = -2;
                                i14 = -8;
                                i15 = 8;
                            } else {
                                i16 = i25;
                                i11 = -2;
                                i14 = -8;
                                i15 = 8;
                            }
                        } else {
                            if (i24 == -2) {
                                if (i16 == -8) {
                                    kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i17, "Redundant pad character at index "));
                                } else if (i16 == -6) {
                                    i17++;
                                    i5 = i;
                                    i4 = -2;
                                } else if (i16 == -4) {
                                    int i26 = i17 + 1;
                                    if (z) {
                                        while (i26 < length2) {
                                            if (kotlin.io.encoding.d.a[bytes[i26] & 255] == -1) {
                                                i26++;
                                            }
                                        }
                                    }
                                    if (i26 == length2 || bytes[i26] != 61) {
                                        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i26, "Missing one pad character at index "));
                                    } else {
                                        i17 = i26 + 1;
                                        i5 = i;
                                        i4 = -2;
                                    }
                                } else if (i16 == -2) {
                                    i17++;
                                    i5 = i;
                                    i4 = -2;
                                } else {
                                    kotlinx.coroutines.future.a.u("Unreachable");
                                }
                                return null;
                            }
                            if (!z) {
                                char c = (char) i23;
                                kotlin.comparisons.a.c(i15);
                                String string = Integer.toString(i23, i15);
                                string.getClass();
                                throw new IllegalArgumentException("Invalid symbol '" + c + "'(" + string + ") at index " + i17);
                            }
                            i17++;
                            i11 = -2;
                            i14 = -8;
                        }
                    } else {
                        i4 = i11;
                        i5 = 0;
                    }
                }
                if (i16 == i4) {
                    obj = null;
                    kotlinx.coroutines.future.a.q("The last unit of input does not have enough bits");
                } else {
                    if (i16 != -8 && i5 == 0) {
                        kotlinx.coroutines.future.a.q("The padding option is set to PRESENT, but the input is not properly padded");
                        return null;
                    }
                    if (i19 == 0) {
                        if (z) {
                            while (i17 < length2) {
                                if (kotlin.io.encoding.d.a[bytes[i17] & 255] == -1) {
                                    i17++;
                                }
                            }
                        }
                        if (i17 < length2) {
                            obj = null;
                            int i27 = bytes[i17] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i27);
                            sb.append("'(");
                            kotlin.comparisons.a.c(8);
                            String string2 = Integer.toString(i27, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.o(i17 - 1, " is prohibited after the pad character", sb));
                        } else {
                            if (i18 == i8) {
                                okio.f fVar = new okio.f();
                                fVar.write(bArr, 0, i8);
                                return new k(new s(fVar, nVar.f, null), strSubstring, coil3.decode.h.y);
                            }
                            obj = null;
                            kotlinx.coroutines.future.a.u("Check failed.");
                        }
                    } else {
                        obj = null;
                        kotlinx.coroutines.future.a.q("The pad bits must be zeros");
                    }
                }
                return obj;
            case 2:
                String str3 = x.y;
                String strF = l.f(vVar);
                if (strF == null) {
                    kotlinx.coroutines.future.a.u("filePath == null");
                    return null;
                }
                x xVarD = com.google.android.gms.measurement.internal.b0.d(strF);
                coil3.decode.p pVarA = com.imsdk.a.a(xVarD, nVar.f, null, null, 28);
                String strX2 = kotlin.text.k.X('.', xVarD.d(), "");
                if (!kotlin.text.k.J(strX2)) {
                    String lowerCase2 = strX2.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) coil3.util.i.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new k(pVarA, mimeTypeFromExtension3, hVar);
            case 3:
                String str4 = vVar.e;
                if (str4 == null) {
                    str4 = "";
                }
                int iG2 = kotlin.text.k.G(str4, '!', 0, 6);
                if (iG2 == -1) {
                    kotlinx.coroutines.future.a.e(vVar, "Invalid jar:file URI: ");
                    return null;
                }
                String str5 = x.y;
                x xVarD2 = com.google.android.gms.measurement.internal.b0.d(str4.substring(0, iG2));
                x xVarD3 = com.google.android.gms.measurement.internal.b0.d(str4.substring(iG2 + 1, str4.length()));
                okio.k kVar = nVar.f;
                kVar.getClass();
                coil3.decode.p pVarA2 = com.imsdk.a.a(xVarD3, okio.internal.b.e(xVarD2, kVar, new q0(21)), null, null, 28);
                String strX3 = kotlin.text.k.X('.', xVarD3.d(), "");
                if (!kotlin.text.k.J(strX3)) {
                    String lowerCase3 = strX3.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) coil3.util.i.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new k(pVarA2, mimeTypeFromExtension3, hVar);
            default:
                String str6 = vVar.d;
                if (str6 != null) {
                    if (kotlin.text.k.J(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        String str7 = (String) p.K(l.g(vVar));
                        if (str7 == null || (numW = r.w(str7)) == null) {
                            com.google.firebase.platforminfo.b.k(vVar, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numW.intValue();
                        Context context = nVar.a;
                        Resources resources = str6.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str6);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (kotlin.text.k.J(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strC1 = kotlin.text.k.c0(kotlin.text.k.c0(string3, '#'), '?');
                            String strX4 = kotlin.text.k.X('.', kotlin.text.k.X('/', strC1, strC1), "");
                            if (kotlin.text.k.J(strX4)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strX4.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) coil3.util.i.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!kotlin.jvm.internal.l.a(mimeTypeFromExtension2, "text/xml")) {
                            return new k(new s(new b0(okio.b.e(resources.openRawResource(iIntValue, new TypedValue()))), nVar.f, new coil3.decode.r(str6, iIntValue)), mimeTypeFromExtension2, hVar);
                        }
                        if (str6.equals(context.getPackageName())) {
                            drawable = androidx.work.impl.v.v(context, iIntValue);
                            if (drawable == null) {
                                kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.n(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = androidx.core.content.res.j.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.n(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = m.a;
                        boolean z2 = drawable instanceof VectorDrawable;
                        if (z2) {
                            drawable = new BitmapDrawable(context.getResources(), t.l(drawable, (Bitmap.Config) l.e(nVar, coil3.request.i.b), nVar.b, nVar.c, (coil3.size.h) l.e(nVar, coil3.request.h.b), nVar.d == coil3.size.d.y));
                        }
                        return new j(l.c(drawable), z2, hVar);
                    }
                }
                com.google.firebase.platforminfo.b.k(vVar, "Invalid android.resource URI: ");
                return null;
        }
    }
}
