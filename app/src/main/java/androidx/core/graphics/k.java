package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class k extends _COROUTINE.b {
    public static Font K(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN = N(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iN2 = N(fontStyle, font2.getStyle());
            if (iN2 < iN) {
                font = font2;
                iN = iN2;
            }
        }
        return font;
    }

    public static int N(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily L(androidx.core.provider.i[] iVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (androidx.core.provider.i iVar : iVarArr) {
            if (Objects.equals(iVar.a.getScheme(), "systemfont")) {
                fontBuild = M(iVar);
            } else {
                try {
                    Uri uri = iVar.a;
                    String str = iVar.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font M(androidx.core.provider.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // _COROUTINE.b
    public final Typeface j(Context context, androidx.core.content.res.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (androidx.core.content.res.f fVar : eVar.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f).setWeight(fVar.b).setSlant(fVar.c ? 1 : 0).setTtcIndex(fVar.e).setFontVariationSettings(fVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(K(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // _COROUTINE.b
    public final Typeface k(Context context, androidx.core.provider.i[] iVarArr, int i) {
        try {
            FontFamily fontFamilyL = L(iVarArr, context.getContentResolver());
            if (fontFamilyL == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyL).setStyle(K(fontFamilyL, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // _COROUTINE.b
    public final Typeface l(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyL = L((androidx.core.provider.i[]) list.get(0), contentResolver);
            if (fontFamilyL == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyL);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyL2 = L((androidx.core.provider.i[]) list.get(i2), contentResolver);
                if (fontFamilyL2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyL2);
                }
            }
            return customFallbackBuilder.setStyle(K(fontFamilyL, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // _COROUTINE.b
    public final Typeface m(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
