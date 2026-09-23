package com.imsdk;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.text.Layout;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.j;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.e;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.h0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.datastore.core.b0;
import androidx.navigation.compose.g;
import androidx.navigation.compose.i;
import androidx.navigation.compose.n;
import androidx.navigation.l0;
import androidx.navigation.y;
import androidx.room.k0;
import androidx.room.r;
import coil3.decode.p;
import com.app.mlounge.R;
import com.google.common.primitives.b;
import com.google.common.primitives.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.builders.h;
import kotlin.collections.g0;
import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.flow.FlowKt;
import okio.k;
import okio.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a = null;
    public static f b = null;
    public static f c = null;
    public static f d = null;
    public static f e = null;
    public static f f = null;
    public static f g = null;
    public static f h = null;
    public static boolean i = false;
    public static Method j;
    public static Boolean k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;

    public static int[] A(Collection collection) {
        if (collection instanceof b) {
            b bVar = (b) collection;
            return Arrays.copyOfRange(bVar.e, bVar.y, bVar.z);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static String B(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (v(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (v(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String C(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Integer D(String str) {
        byte b2;
        Integer num;
        Long l2;
        Long lValueOf;
        Long lValueOf2;
        byte b3;
        str.getClass();
        if (str.isEmpty()) {
            l2 = 0;
            num = null;
        } else {
            int i2 = str.charAt(0) == '-' ? 1 : 0;
            if (i2 == str.length()) {
                l2 = 0;
                num = null;
            } else {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    b2 = c.a[cCharAt];
                } else {
                    byte[] bArr = c.a;
                    b2 = -1;
                }
                if (b2 < 0 || b2 >= 10) {
                    num = null;
                    l2 = num;
                } else {
                    long j2 = -b2;
                    long j3 = 10;
                    long j4 = Long.MIN_VALUE / j3;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            char cCharAt2 = str.charAt(i3);
                            if (cCharAt2 < 128) {
                                b3 = c.a[cCharAt2];
                            } else {
                                byte[] bArr2 = c.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j2 < j4) {
                                num = null;
                            } else {
                                long j5 = j2 * j3;
                                num = null;
                                long j6 = b3;
                                if (j5 >= j6 - Long.MIN_VALUE) {
                                    j2 = j5 - j6;
                                    i3 = i4;
                                }
                            }
                        } else {
                            num = null;
                            if (i2 != 0) {
                                lValueOf2 = Long.valueOf(j2);
                            } else if (j2 != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j2);
                            }
                        }
                        l2 = num;
                    }
                }
            }
        }
        if (l2 != 0) {
            l2 = lValueOf;
            l2 = lValueOf2;
            if (l2.longValue() == l2.intValue()) {
                return Integer.valueOf(l2.intValue());
            }
        }
        l2 = lValueOf;
        l2 = lValueOf2;
        return num;
    }

    public static final Exception E(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i2 = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i2 = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            kotlin.a.a(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new b0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static void F(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                com.google.firebase.platforminfo.b.h(j.e(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
                return;
            }
        }
    }

    public static p a(x xVar, k kVar, String str, coil3.disk.f fVar, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            fVar = null;
        }
        return new p(xVar, kVar, str, fVar);
    }

    public static List b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new b(iArr, 0, iArr.length);
    }

    public static int f(long j2) {
        int i2 = (int) j2;
        _COROUTINE.a.m("Out of range: %s", j2, ((long) i2) == j2);
        return i2;
    }

    public static final androidx.room.coroutines.j g(r rVar, String[] strArr, l lVar) {
        kotlin.k kVar;
        rVar.getClass();
        androidx.room.f fVarG = rVar.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        k0 k0Var = fVarG.b;
        k0Var.getClass();
        h hVar = new h();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = k0Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                hVar.addAll(set);
            } else {
                hVar.add(str);
            }
        }
        String[] strArr3 = (String[]) g0.b(hVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = k0Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                kotlinx.coroutines.future.a.q("There is no table with name ".concat(str2));
                kVar = null;
                String[] strArr4 = (String[]) kVar.e;
                int[] iArr2 = (int[]) kVar.y;
                strArr4.getClass();
                iArr2.getClass();
                return new androidx.room.coroutines.j(FlowKt.conflate(FlowKt.flow(new androidx.compose.animation.core.f(k0Var, iArr2, strArr4, (d) null, 7))), rVar, lVar);
            }
            iArr[i2] = num.intValue();
        }
        kVar = new kotlin.k(strArr3, iArr);
        String[] strArr5 = (String[]) kVar.e;
        int[] iArr3 = (int[]) kVar.y;
        strArr5.getClass();
        iArr3.getClass();
        return new androidx.room.coroutines.j(FlowKt.conflate(FlowKt.flow(new androidx.compose.animation.core.f(k0Var, iArr3, strArr5, (d) null, 7))), rVar, lVar);
    }

    public static final y h(Context context) {
        context.getClass();
        y yVar = new y(context);
        androidx.navigation.internal.f fVar = yVar.b;
        l0 l0Var = fVar.t;
        l0Var.a(new g(l0Var));
        l0 l0Var2 = fVar.t;
        l0Var2.a(new i());
        l0Var2.a(new n());
        return yVar;
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = s0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = r0.d;
            r0 r0Var = (r0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (r0Var == null) {
                r0Var = new r0();
                r0Var.a = null;
                r0Var.b = null;
                r0Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, r0Var);
            }
            WeakReference weakReference2 = r0Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                r0Var.c = new WeakReference(keyEvent);
                if (r0Var.b == null) {
                    r0Var.b = new SparseArray();
                }
                SparseArray sparseArray = r0Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    androidx.transition.k.h();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean j(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int k(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static final f l() {
        f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Animation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(15.0f, 2.0f);
        gVarJ.n(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f);
        gVarJ.n(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
        gVarJ.m(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
        gVarJ.n(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        gVarJ.n(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f);
        gVarJ.n(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
        gVarJ.m(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
        gVarJ.n(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        gVarJ.l();
        gVarJ.v(9.0f, 20.0f);
        gVarJ.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarJ.n(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        gVarJ.n(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        gVarJ.n(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
        gVarJ.l();
        gVarJ.v(12.0f, 17.0f);
        gVarJ.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarJ.n(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        gVarJ.n(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
        gVarJ.n(-0.84f, 0.63f, -1.88f, 1.0f, -3.0f, 1.0f);
        gVarJ.l();
        gVarJ.v(16.7f, 13.7f);
        gVarJ.n(-0.53f, 0.19f, -1.1f, 0.3f, -1.7f, 0.3f);
        gVarJ.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        gVarJ.n(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
        gVarJ.n(0.53f, -0.19f, 1.1f, -0.3f, 1.7f, -0.3f);
        gVarJ.n(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        gVarJ.n(0.0f, 0.6f, -0.11f, 1.17f, -0.3f, 1.7f);
        gVarJ.l();
        gVarJ.v(19.0f, 12.0f);
        gVarJ.n(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
        gVarJ.n(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
        gVarJ.n(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        gVarJ.n(0.0f, 1.12f, -0.37f, 2.16f, -1.0f, 3.0f);
        gVarJ.l();
        e.a(eVar, gVarJ.b, 0, p0Var);
        f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final f m() {
        f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Cloud", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(19.35f, 10.04f);
        gVarJ.m(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        gVarJ.m(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        gVarJ.m(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        gVarJ.n(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        gVarJ.s(13.0f);
        gVarJ.n(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        gVarJ.n(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        gVarJ.l();
        e.a(eVar, gVarJ.b, 0, p0Var);
        f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final int n(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final f o() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(6.0f, 19.0f);
        gVar.s(4.0f);
        gVar.t(10.0f, 5.0f);
        gVar.t(6.0f, 5.0f);
        gVar.A(14.0f);
        gVar.l();
        gVar.v(14.0f, 5.0f);
        gVar.A(14.0f);
        gVar.s(4.0f);
        gVar.t(18.0f, 5.0f);
        gVar.s(-4.0f);
        gVar.l();
        e.a(eVar, gVar.b, 0, p0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final long p(com.app.mlounge.data.music.e eVar) {
        DragEvent dragEvent = (DragEvent) eVar.y;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final androidx.compose.ui.text.g q(androidx.compose.ui.text.input.x xVar) {
        androidx.compose.ui.text.g gVar = xVar.a;
        long j2 = xVar.b;
        gVar.getClass();
        return gVar.subSequence(androidx.compose.ui.text.l0.f(j2), androidx.compose.ui.text.l0.e(j2));
    }

    public static final androidx.compose.ui.text.g r(androidx.compose.ui.text.input.x xVar, int i2) {
        androidx.compose.ui.text.g gVar = xVar.a;
        androidx.compose.ui.text.g gVar2 = xVar.a;
        long j2 = xVar.b;
        int iE = androidx.compose.ui.text.l0.e(j2);
        int iE2 = androidx.compose.ui.text.l0.e(j2);
        int length = iE2 + i2;
        if (((i2 ^ length) & (iE2 ^ length)) < 0) {
            length = gVar2.y.length();
        }
        return gVar.subSequence(iE, Math.min(length, gVar2.y.length()));
    }

    public static final androidx.compose.ui.text.g s(androidx.compose.ui.text.input.x xVar, int i2) {
        androidx.compose.ui.text.g gVar = xVar.a;
        long j2 = xVar.b;
        int iF = androidx.compose.ui.text.l0.f(j2);
        int i3 = iF - i2;
        if (((iF ^ i3) & (i2 ^ iF)) < 0) {
            i3 = 0;
        }
        return gVar.subSequence(Math.max(0, i3), androidx.compose.ui.text.l0.f(j2));
    }

    public static int t(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static boolean u(byte b2) {
        return b2 > -65;
    }

    public static boolean v(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static androidx.emoji2.text.flatbuffer.b y(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            kotlinx.coroutines.future.a.w("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    androidx.emoji2.text.flatbuffer.b bVar = new androidx.emoji2.text.flatbuffer.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.A = byteBufferDuplicate;
                    bVar.e = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.y = i7;
                    bVar.z = ((ByteBuffer) bVar.A).getShort(i7);
                    return bVar;
                }
            }
        }
        kotlinx.coroutines.future.a.w("Cannot read metadata.");
        return null;
    }

    public static int z(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public abstract boolean c(androidx.concurrent.futures.h hVar, androidx.concurrent.futures.d dVar, androidx.concurrent.futures.d dVar2);

    public abstract boolean d(androidx.concurrent.futures.h hVar, Object obj, Object obj2);

    public abstract boolean e(androidx.concurrent.futures.h hVar, androidx.concurrent.futures.g gVar, androidx.concurrent.futures.g gVar2);

    public abstract void w(androidx.concurrent.futures.g gVar, androidx.concurrent.futures.g gVar2);

    public abstract void x(androidx.concurrent.futures.g gVar, Thread thread);
}
