package coil3.svg.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.n2;
import androidx.appcompat.widget.p2;
import androidx.arch.core.executor.d;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.runtime.j;
import androidx.compose.ui.geometry.c;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.n;
import androidx.compose.ui.graphics.vector.v;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.unit.o;
import androidx.compose.ui.unit.p;
import androidx.media3.common.j0;
import androidx.room.t;
import com.app.mlounge.data.remote.ntv.e;
import com.google.android.material.shape.w;
import com.google.firebase.g;
import com.google.firebase.sessions.e1;
import com.google.firebase.sessions.i;
import com.google.firebase.sessions.q;
import j$.net.URLDecoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a;
    public static f b;
    public static f c;
    public static f d;
    public static f e;
    public static f f;
    public static f g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static e1 j;

    public static boolean A(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean B(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final boolean C(b1 b1Var, boolean z) {
        x xVarC;
        r0 r0Var = b1Var.d;
        if (r0Var == null || (xVarC = r0Var.c()) == null) {
            return false;
        }
        c cVarI = t.I(xVarC);
        long jL = b1Var.l(z);
        float f2 = cVarI.a;
        float f3 = cVarI.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = cVarI.b;
        float f5 = cVarI.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final void D(String str) {
        str.getClass();
        throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.r("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int E(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int F(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void G() {
        try {
            if (j == null) {
                e1 e1Var = (e1) ((i) ((q) g.c().b(q.class))).o.get();
                e1Var.getClass();
                j = e1Var;
            }
            e1 e1Var2 = j;
            if (e1Var2 == null) {
                l.f("sharedSessionRepository");
                throw null;
            }
            if (e1Var2.i) {
                if (e1Var2 != null) {
                    e1Var2.b();
                } else {
                    l.f("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final long H(float f2, long j2) {
        long jFloatToRawIntBits = j2 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        p[] pVarArr = o.b;
        return jFloatToRawIntBits;
    }

    public static e I(String str) {
        str.getClass();
        String strDecode = null;
        if (r.u(str, "ntv://", false)) {
            List listU = k.U(k.P(str, "ntv://"), new String[]{"|"}, 6);
            if (listU.size() >= 3) {
                String str2 = (String) listU.get(0);
                String str3 = (String) listU.get(1);
                CharSequence charSequence = (CharSequence) listU.get(2);
                if (k.J(charSequence)) {
                    charSequence = "cdnlive";
                }
                String str4 = (String) charSequence;
                String str5 = (String) kotlin.collections.p.E(3, listU);
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5;
                String str7 = (String) kotlin.collections.p.E(4, listU);
                if (str7 != null) {
                    try {
                        strDecode = URLDecoder.decode(str7, "UTF-8");
                    } catch (Exception unused) {
                    }
                }
                return new e(str2, str3, str4, str6, strDecode);
            }
        }
        return null;
    }

    public static boolean J(Parcel parcel, int i2) {
        U(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder K(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iN);
        return strongBinder;
    }

    public static int L(Parcel parcel, int i2) {
        U(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long M(Parcel parcel, int i2) {
        U(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int N(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void O(androidx.media3.common.text.a aVar) {
        aVar.k = -3.4028235E38f;
        aVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.a = SpannableString.valueOf(charSequence);
                aVar.b = null;
            }
            CharSequence charSequence2 = aVar.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float P(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }

    public static void Q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n2.a(view, charSequence);
            return;
        }
        p2 p2Var = p2.H;
        if (p2Var != null && p2Var.e == view) {
            p2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p2(view, charSequence);
            return;
        }
        p2 p2Var2 = p2.I;
        if (p2Var2 != null && p2Var2.e == view) {
            p2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void S(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + N(parcel, i2));
    }

    public static int T(Parcel parcel) {
        int i2 = parcel.readInt();
        int iN = N(parcel, i2);
        char c2 = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new com.google.android.gms.common.internal.safeparcel.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iN + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i3);
        throw new com.google.android.gms.common.internal.safeparcel.b(sb.toString(), parcel);
    }

    public static void U(Parcel parcel, int i2, int i3) {
        int iN = N(parcel, i2);
        if (iN == i3) {
            return;
        }
        String hexString = Integer.toHexString(iN);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iN).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iN);
        throw new com.google.android.gms.common.internal.safeparcel.b(j.m(sb, " (0x", hexString, ")"), parcel);
    }

    public static void V(Parcel parcel, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i2).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        throw new com.google.android.gms.common.internal.safeparcel.b(j.m(sb, " (0x", hexString, ")"), parcel);
    }

    public static final long a(int i2) {
        if (!(i2 > 0)) {
            androidx.compose.foundation.internal.b.a("The span value should be higher than 0");
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean b(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iE;
        int i3;
        int i4;
        boolean zC = c(i2, rect, rect2);
        if (c(i2, rect, rect3) || !zC) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i2 != 17 && i2 != 66) {
                            iE = E(i2, rect, rect2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iE < Math.max(1, i3 - i4)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i2 != 17) {
                        iE = E(i2, rect, rect2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iE < Math.max(1, i3 - i4)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i2 != 17) {
                    iE = E(i2, rect, rect2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iE < Math.max(1, i3 - i4)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i2 != 17) {
                iE = E(i2, rect, rect2);
                if (i2 != 17) {
                    i3 = rect.left;
                    i4 = rect3.left;
                } else if (i2 != 33) {
                    i3 = rect.top;
                    i4 = rect3.top;
                } else if (i2 != 66) {
                    i3 = rect3.right;
                    i4 = rect.right;
                } else {
                    if (i2 == 130) {
                        kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    i3 = rect3.bottom;
                    i4 = rect.bottom;
                }
                if (iE < Math.max(1, i3 - i4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean c(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        kotlinx.coroutines.future.a.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final boolean d(c cVar, float f2, float f3) {
        float f4 = cVar.a;
        if (f2 > cVar.c || f4 > f2) {
            return false;
        }
        return f3 <= cVar.d && cVar.b <= f3;
    }

    public static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            kotlinx.coroutines.future.a.l(cause);
            return null;
        }
    }

    public static Bundle f(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iN);
        return bundle;
    }

    public static byte[] g(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iN);
        return bArrCreateByteArray;
    }

    public static byte[][] h(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        byte[][] bArr = new byte[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iN);
        return bArr;
    }

    public static int[] i(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iN);
        return iArrCreateIntArray;
    }

    public static Parcelable j(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iN);
        return parcelable;
    }

    public static String k(Parcel parcel, int i2) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iN);
        return string;
    }

    public static Object[] l(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iN);
        return objArrCreateTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iN = N(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iN);
        return arrayListCreateTypedArrayList;
    }

    public static final androidx.room.p n(Context context, Class cls, String str) {
        if (k.J(str)) {
            kotlinx.coroutines.future.a.q("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new androidx.room.p(context, cls, str);
        }
        kotlinx.coroutines.future.a.q("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static Bitmap o(byte[] bArr, int i2, int i3) throws IOException {
        BitmapFactory.Options options;
        int i4 = 0;
        int iE = 1;
        if (i3 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i3; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw j0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            androidx.exifinterface.media.g gVar = new androidx.exifinterface.media.g(byteArrayInputStream);
            byteArrayInputStream.close();
            androidx.exifinterface.media.c cVarC = gVar.c("Orientation");
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void p(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new com.google.android.gms.common.internal.safeparcel.b(j.e(i2, "Overread allowed size end=", new StringBuilder(String.valueOf(i2).length() + 26)), parcel);
        }
    }

    public static final androidx.work.impl.model.j q(androidx.work.impl.model.p pVar) {
        pVar.getClass();
        return new androidx.work.impl.model.j(pVar.a, pVar.t);
    }

    public static androidx.compose.ui.autofill.r r(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new androidx.compose.ui.autofill.r(com.google.android.gms.common.wrappers.a.c(view));
        }
        return null;
    }

    public static final f s() {
        f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(9.0f, 16.17f));
        arrayList.add(new n(4.83f, 12.0f));
        arrayList.add(new v(-1.42f, 1.41f));
        arrayList.add(new n(9.0f, 19.0f));
        arrayList.add(new n(21.0f, 7.0f));
        arrayList.add(new v(-1.41f, -1.41f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final f u() {
        f fVar = c;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(13.0f, 3.0f);
        gVarJ.n(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        gVarJ.t(1.0f, 12.0f);
        gVarJ.u(3.89f, 3.89f);
        gVarJ.u(0.07f, 0.14f);
        gVarJ.t(9.0f, 12.0f);
        gVarJ.t(6.0f, 12.0f);
        gVarJ.n(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        gVarJ.x(7.0f, 3.13f, 7.0f, 7.0f);
        gVarJ.x(-3.13f, 7.0f, -7.0f, 7.0f);
        gVarJ.n(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        gVarJ.u(-1.42f, 1.42f);
        gVarJ.m(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        gVarJ.n(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        gVarJ.x(-4.03f, -9.0f, -9.0f, -9.0f);
        gVarJ.l();
        gVarJ.v(12.0f, 8.0f);
        gVarJ.A(5.0f);
        gVarJ.u(4.28f, 2.54f);
        gVarJ.u(0.72f, -1.21f);
        gVarJ.u(-3.5f, -2.08f);
        gVarJ.t(13.5f, 8.0f);
        gVarJ.t(12.0f, 8.0f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        f fVarB = eVar.b();
        c = fVarB;
        return fVarB;
    }

    public static long v(double d2) {
        _COROUTINE.a.n("not a normal value", B(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static final long w(double d2) {
        return H((float) d2, 4294967296L);
    }

    public static final long x(int i2) {
        return H(i2, 4294967296L);
    }

    public static final f y() {
        f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(9.0f, 11.24f);
        gVar.z(7.5f);
        gVar.m(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        gVar.w(14.0f, 6.12f, 14.0f, 7.5f);
        gVar.A(3.74f);
        gVar.n(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        gVar.m(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        gVar.w(7.0f, 5.01f, 7.0f, 7.5f);
        gVar.m(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
        gVar.l();
        gVar.v(18.84f, 15.87f);
        gVar.u(-4.54f, -2.26f);
        gVar.n(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        gVar.r(13.0f);
        gVar.A(-6.0f);
        gVar.m(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
        gVar.w(10.0f, 6.67f, 10.0f, 7.5f);
        gVar.A(10.74f);
        gVar.n(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
        gVar.n(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        gVar.u(-0.79f, 0.8f);
        gVar.u(4.94f, 4.94f);
        gVar.m(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
        gVar.s(6.79f);
        gVar.n(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        gVar.u(0.75f, -5.27f);
        gVar.n(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        gVar.m(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public abstract void R(w wVar, float f2);

    public abstract void t(com.google.android.material.shape.v vVar, float f2, float f3);

    public abstract float z(w wVar);
}
