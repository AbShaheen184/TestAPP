package android.support.v4.media.session;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.activity.compose.h;
import androidx.activity.compose.m;
import androidx.activity.e0;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.b0;
import androidx.compose.foundation.r1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.o;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.j0;
import androidx.constraintlayout.core.e;
import androidx.core.graphics.d;
import androidx.lifecycle.s0;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.extractor.text.ttml.g;
import androidx.room.t;
import androidx.room.util.i;
import androidx.transition.k;
import androidx.work.j;
import androidx.work.y;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static f a;
    public static f b;
    public static f c;
    public static f d;
    public static f e;
    public static f f;
    public static f g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static final i A(androidx.sqlite.a aVar, String str, boolean z) {
        androidx.sqlite.c cVarU = aVar.U("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iH = _COROUTINE.b.h(cVarU, "seqno");
            int iH2 = _COROUTINE.b.h(cVarU, "cid");
            int iH3 = _COROUTINE.b.h(cVarU, "name");
            int iH4 = _COROUTINE.b.h(cVarU, "desc");
            if (iH != -1 && iH2 != -1 && iH3 != -1 && iH4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarU.Q()) {
                    if (((int) cVarU.getLong(iH2)) >= 0) {
                        int i2 = (int) cVarU.getLong(iH);
                        String strF = cVarU.F(iH3);
                        String str2 = cVarU.getLong(iH4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), strF);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List listW = p.W(linkedHashMap.entrySet(), new e(3));
                ArrayList arrayList = new ArrayList(r.p(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listB0 = p.b0(arrayList);
                List listW2 = p.W(linkedHashMap2.entrySet(), new e(4));
                ArrayList arrayList2 = new ArrayList(r.p(listW2, 10));
                Iterator it2 = listW2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                i iVar = new i(str, listB0, p.b0(arrayList2), z);
                q.e(cVarU, null);
                return iVar;
            }
            q.e(cVarU, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public static g D(g gVar, String[] strArr, Map map) {
        int i2 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i2 < length) {
                    gVar2.a((g) map.get(strArr[i2]));
                    i2++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    gVar.a((g) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return gVar;
    }

    public static int E(Context context, int i2, int i3) {
        TypedValue typedValueD = t.D(context, i2);
        return (typedValueD == null || typedValueD.type != 16) ? i3 : typedValueD.data;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c A[Catch: NumberFormatException -> 0x014a, TryCatch #1 {NumberFormatException -> 0x014a, blocks: (B:44:0x00e9, B:47:0x0100, B:49:0x0106, B:53:0x0112, B:66:0x0136, B:68:0x013c, B:74:0x0152, B:77:0x0159, B:78:0x0165, B:79:0x016a, B:80:0x016b, B:81:0x0170), top: B:106:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152 A[Catch: NumberFormatException -> 0x014a, TryCatch #1 {NumberFormatException -> 0x014a, blocks: (B:44:0x00e9, B:47:0x0100, B:49:0x0106, B:53:0x0112, B:66:0x0136, B:68:0x013c, B:74:0x0152, B:77:0x0159, B:78:0x0165, B:79:0x016a, B:80:0x016b, B:81:0x0170), top: B:106:0x00e9 }] */
    public static TimeInterpolator F(Context context, int i2, TimeInterpolator timeInterpolator) {
        int i3;
        String strTrim;
        int i4;
        float[] fArr;
        TypedValue typedValue = new TypedValue();
        int i5 = 1;
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            kotlinx.coroutines.future.a.q("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!t(strValueOf, "cubic-bezier") && !t(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        int i6 = 0;
        if (t(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(n(0, strArrSplit), n(1, strArrSplit), n(2, strArrSplit), n(3, strArrSplit));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!t(strValueOf, "path")) {
            kotlinx.coroutines.future.a.q("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i8 = 0;
        while (i7 < strSubstring.length()) {
            while (i7 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i7);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = strSubstring.substring(i8, i7).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i6) != 'z' || strTrim.charAt(i6) == 'Z') {
                                i4 = i6;
                                fArr = new float[i4];
                            } else {
                                try {
                                    int length = strTrim.length();
                                    float[] fArr2 = new float[length];
                                    int length2 = strTrim.length();
                                    int i9 = i5;
                                    int i10 = i6;
                                    while (i9 < length2) {
                                        int i11 = i6;
                                        int i12 = i11;
                                        int i13 = i12;
                                        int i14 = i13;
                                        for (int i15 = i9; i15 < strTrim.length(); i15++) {
                                            char cCharAt2 = strTrim.charAt(i15);
                                            if (cCharAt2 == ' ') {
                                                i11 = 0;
                                                i13 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case Token.NAME /* 44 */:
                                                        i11 = 0;
                                                        i13 = 1;
                                                        break;
                                                    case Token.NUMBER /* 45 */:
                                                        if (i15 == i9 || i11 != 0) {
                                                            i11 = 0;
                                                        } else {
                                                            i11 = 0;
                                                            i13 = 1;
                                                            i14 = 1;
                                                        }
                                                        break;
                                                    case Token.STRING /* 46 */:
                                                        if (i12 == 0) {
                                                            i11 = 0;
                                                            i12 = 1;
                                                        } else {
                                                            i11 = 0;
                                                            i13 = 1;
                                                            i14 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i11 = 0;
                                                        break;
                                                }
                                            } else {
                                                i11 = 1;
                                            }
                                            if (i13 != 0) {
                                                if (i9 < i15) {
                                                    fArr2[i10] = Float.parseFloat(strTrim.substring(i9, i15));
                                                    i10++;
                                                }
                                                if (i14 != 0) {
                                                    i9 = i15;
                                                } else {
                                                    i9 = i15 + 1;
                                                }
                                                i6 = 0;
                                            }
                                        }
                                        if (i9 < i15) {
                                            fArr2[i10] = Float.parseFloat(strTrim.substring(i9, i15));
                                            i10++;
                                        }
                                        if (i14 != 0) {
                                            i9 = i15;
                                        } else {
                                            i9 = i15 + 1;
                                        }
                                        i6 = 0;
                                    }
                                    if (i10 < 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    if (length < 0) {
                                        throw new ArrayIndexOutOfBoundsException();
                                    }
                                    fArr = new float[i10];
                                    System.arraycopy(fArr2, 0, fArr, 0, Math.min(i10, length));
                                    i4 = 0;
                                } catch (NumberFormatException e2) {
                                    t0.j(androidx.privacysandbox.ads.adservices.java.internal.a.r("error in parsing \"", strTrim, "\""), e2);
                                    return null;
                                }
                            }
                            arrayList.add(new d(strTrim.charAt(i4), fArr));
                        }
                        i8 = i7;
                        i6 = 0;
                        i7++;
                        i5 = 1;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i7++;
            }
            strTrim = strSubstring.substring(i8, i7).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i6) != 'z') {
                    i4 = i6;
                    fArr = new float[i4];
                } else {
                    i4 = i6;
                    fArr = new float[i4];
                }
                arrayList.add(new d(strTrim.charAt(i4), fArr));
            }
            i8 = i7;
            i6 = 0;
            i7++;
            i5 = 1;
        }
        if (i7 - i8 != 1 || i8 >= strSubstring.length()) {
            i3 = 0;
        } else {
            i3 = 0;
            arrayList.add(new d(strSubstring.charAt(i8), new float[0]));
        }
        try {
            d.b((d[]) arrayList.toArray(new d[i3]), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e3) {
            t0.j("Error in parsing ".concat(strSubstring), e3);
            return null;
        }
    }

    public static byte[] G(androidx.work.i iVar) {
        iVar.getClass();
        HashMap map = iVar.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    H(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            y.e().d(j.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void H(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                k.l(a0.a(obj.getClass()).c(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            kotlin.jvm.internal.e eVarA = a0.a(objArr.getClass());
            if (eVarA.equals(a0.a(Boolean[].class))) {
                i2 = 8;
            } else if (eVarA.equals(a0.a(Byte[].class))) {
                i2 = 9;
            } else if (eVarA.equals(a0.a(Integer[].class))) {
                i2 = 10;
            } else if (eVarA.equals(a0.a(Long[].class))) {
                i2 = 11;
            } else if (eVarA.equals(a0.a(Float[].class))) {
                i2 = 12;
            } else if (eVarA.equals(a0.a(Double[].class))) {
                i2 = 13;
            } else {
                if (!eVarA.equals(a0.a(String[].class))) {
                    k.l(a0.a(objArr.getClass()).b(), "Unsupported value type ");
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final List I(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(p.B(list));
        }
        return w.e;
    }

    public static final Map J(Map map) {
        int size = map.size();
        if (size == 0) {
            return x.e;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) p.A(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Bundle K(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void a(boolean z, kotlin.jvm.functions.a aVar, s sVar, int i2) {
        sVar.c0(-361453782);
        int i3 = i2 | 6 | (sVar.h(aVar) ? 32 : 16);
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objA = androidx.navigationevent.compose.a.a(sVar);
            if (objA == null) {
                sVar.b0(535274673);
                objA = androidx.activity.compose.s.a(sVar);
            } else {
                sVar.b0(535271790);
            }
            sVar.p(false);
            if (objA == null) {
                kotlinx.coroutines.future.a.u("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = sVar.f(objA);
            Object objQ = sVar.Q();
            Object obj = n.a;
            if (zF || objQ == obj) {
                androidx.navigationevent.d dVar = objA instanceof androidx.navigationevent.d ? (androidx.navigationevent.d) objA : null;
                androidx.navigationevent.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                e0 e0Var = objA instanceof e0 ? (e0) objA : null;
                objQ = new androidx.activity.compose.internal.c(navigationEventDispatcher, e0Var != null ? e0Var.getOnBackPressedDispatcher() : null);
                sVar.l0(objQ);
            }
            Object obj2 = (androidx.activity.compose.internal.c) objQ;
            long j = sVar.T;
            boolean zF2 = sVar.f(obj2) | sVar.e(j);
            Object objQ2 = sVar.Q();
            Object obj3 = objQ2;
            if (zF2 || objQ2 == obj) {
                m mVar = new m(new androidx.activity.compose.e(j, objA));
                mVar.c = new androidx.activity.compose.b(1);
                sVar.l0(mVar);
                obj3 = mVar;
            }
            Object obj4 = (m) obj3;
            sVar.b0(-585307852);
            boolean zH = sVar.h(obj4) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new androidx.activity.compose.f(0, obj4, aVar);
                sVar.l0(objQ3);
            }
            l0.e((kotlin.jvm.functions.a) objQ3, sVar);
            boolean zH2 = sVar.h(obj4);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == obj) {
                objQ4 = new androidx.activity.compose.g(obj4, 0);
                sVar.l0(objQ4);
            }
            _COROUTINE.a.a(true, obj4, null, (l) objQ4, sVar, 6);
            boolean zH3 = sVar.h(obj2) | sVar.h(obj4);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == obj) {
                objQ5 = new h(0, obj2, obj4);
                sVar.l0(objQ5);
            }
            l0.a(obj2, obj4, (l) objQ5, sVar);
            sVar.p(false);
            z = true;
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.activity.compose.i(z, aVar, i2, 0);
        }
    }

    public static final long b(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void c(androidx.compose.ui.r rVar, androidx.compose.foundation.lazy.y yVar, z0 z0Var, androidx.compose.foundation.layout.g gVar, androidx.compose.ui.d dVar, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, final l lVar2, s sVar, final int i2, final int i3) {
        androidx.compose.ui.r rVar2;
        int i4;
        androidx.compose.foundation.lazy.y yVarA;
        int i5;
        int i6;
        z0 z0Var2;
        int i7;
        int i8;
        androidx.compose.foundation.layout.g gVar2;
        int i9;
        int i10;
        boolean z2;
        final androidx.compose.ui.d dVar2;
        final androidx.compose.foundation.n nVar2;
        final androidx.compose.ui.r rVar3;
        final androidx.compose.foundation.lazy.y yVar2;
        final z0 z0Var3;
        final androidx.compose.foundation.layout.g gVar3;
        final androidx.compose.foundation.gestures.l lVar3;
        final boolean z3;
        s1 s1VarT;
        androidx.compose.ui.r rVar4;
        z0 z0Var4;
        androidx.compose.foundation.gestures.l lVarH;
        int i11;
        androidx.compose.foundation.n nVarA;
        androidx.compose.foundation.layout.g gVar4;
        androidx.compose.ui.d dVar3;
        z0 z0Var5;
        boolean z4;
        sVar.c0(53695811);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            yVarA = yVar;
            int i13 = sVar.f(yVarA) ? 32 : 16;
            i5 = i4 | i13;
            i6 = i3 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    z0Var2 = z0Var;
                    if (sVar.f(z0Var2)) {
                        i7 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 3072;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        gVar2 = gVar;
                        int i14 = sVar.f(gVar2) ? 16384 : 8192;
                        i8 |= i14;
                    } else {
                        gVar2 = gVar;
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                int i15 = i8 | 46858240;
                if (sVar.h(lVar2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i10 = i15 | i9;
                if ((306783379 & i10) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sVar.T(i10 & 1, z2)) {
                    sVar.Y();
                    if ((i2 & 1) != 0 || sVar.C()) {
                        if (i12 != 0) {
                            rVar4 = o.b;
                        } else {
                            rVar4 = rVar2;
                        }
                        if ((i3 & 2) != 0) {
                            i10 &= -113;
                            yVarA = b0.a(0, 0, sVar, 3);
                        }
                        if (i6 != 0) {
                            float f2 = 0;
                            z0Var4 = new z0(f2, f2, f2, f2);
                        } else {
                            z0Var4 = z0Var2;
                        }
                        if ((i3 & 16) != 0) {
                            i10 &= -57345;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                        lVarH = okhttp3.internal.platform.android.g.h(sVar);
                        i11 = i10 & (-238551041);
                        nVarA = r1.a(sVar);
                        gVar4 = gVar2;
                        dVar3 = hVar;
                        z0Var5 = z0Var4;
                        z4 = true;
                    } else {
                        sVar.W();
                        if ((i3 & 2) != 0) {
                            i10 &= -113;
                        }
                        if ((i3 & 16) != 0) {
                            i10 &= -57345;
                        }
                        int i16 = i10 & (-238551041);
                        z4 = z;
                        nVarA = nVar;
                        i11 = i16;
                        rVar4 = rVar2;
                        z0Var5 = z0Var2;
                        gVar4 = gVar2;
                        dVar3 = dVar;
                        lVarH = lVar;
                    }
                    sVar.q();
                    androidx.compose.ui.r rVar5 = rVar4;
                    androidx.compose.foundation.lazy.y yVar3 = yVarA;
                    androidx.compose.foundation.gestures.l lVar4 = lVarH;
                    androidx.compose.foundation.n nVar3 = nVarA;
                    t.a(rVar5, yVar3, z0Var5, true, lVar4, z4, nVar3, dVar3, gVar4, null, null, lVar2, sVar, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                    lVar3 = lVar4;
                    gVar3 = gVar4;
                    nVar2 = nVar3;
                    androidx.compose.ui.d dVar4 = dVar3;
                    z3 = z4;
                    dVar2 = dVar4;
                    z0Var3 = z0Var5;
                    yVar2 = yVar3;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    dVar2 = dVar;
                    nVar2 = nVar;
                    rVar3 = rVar2;
                    yVar2 = yVarA;
                    z0Var3 = z0Var2;
                    gVar3 = gVar2;
                    lVar3 = lVar;
                    z3 = z;
                }
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            android.support.v4.media.session.b.c(rVar3, yVar2, z0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i5 |= 384;
            z0Var2 = z0Var;
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            int i17 = i8 | 46858240;
            if (sVar.h(lVar2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i10 = i17 | i9;
            if ((306783379 & i10) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i10 & 1, z2)) {
                sVar.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        rVar4 = o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        yVarA = b0.a(0, 0, sVar, 3);
                    }
                    if (i6 != 0) {
                        float f3 = 0;
                        z0Var4 = new z0(f3, f3, f3, f3);
                    } else {
                        z0Var4 = z0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    i11 = i10 & (-238551041);
                    nVarA = r1.a(sVar);
                    gVar4 = gVar2;
                    dVar3 = hVar2;
                    z0Var5 = z0Var4;
                    z4 = true;
                } else {
                    if (i12 != 0) {
                        rVar4 = o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        yVarA = b0.a(0, 0, sVar, 3);
                    }
                    if (i6 != 0) {
                        float f4 = 0;
                        z0Var4 = new z0(f4, f4, f4, f4);
                    } else {
                        z0Var4 = z0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar3 = androidx.compose.ui.c.J;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    i11 = i10 & (-238551041);
                    nVarA = r1.a(sVar);
                    gVar4 = gVar2;
                    dVar3 = hVar3;
                    z0Var5 = z0Var4;
                    z4 = true;
                }
                sVar.q();
                androidx.compose.ui.r rVar6 = rVar4;
                androidx.compose.foundation.lazy.y yVar4 = yVarA;
                androidx.compose.foundation.gestures.l lVar5 = lVarH;
                androidx.compose.foundation.n nVar4 = nVarA;
                t.a(rVar6, yVar4, z0Var5, true, lVar5, z4, nVar4, dVar3, gVar4, null, null, lVar2, sVar, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                lVar3 = lVar5;
                gVar3 = gVar4;
                nVar2 = nVar4;
                androidx.compose.ui.d dVar5 = dVar3;
                z3 = z4;
                dVar2 = dVar5;
                z0Var3 = z0Var5;
                yVar2 = yVar4;
                rVar3 = rVar6;
            } else {
                sVar.W();
                dVar2 = dVar;
                nVar2 = nVar;
                rVar3 = rVar2;
                yVar2 = yVarA;
                z0Var3 = z0Var2;
                gVar3 = gVar2;
                lVar3 = lVar;
                z3 = z;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        android.support.v4.media.session.b.c(rVar3, yVar2, z0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        yVarA = yVar;
        i5 = i4 | i13;
        i6 = i3 & 4;
        if (i6 != 0) {
            if ((i2 & 384) == 0) {
                z0Var2 = z0Var;
                if (sVar.f(z0Var2)) {
                    i7 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    gVar2 = gVar;
                    if (sVar.f(gVar2)) {
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            int i18 = i8 | 46858240;
            if (sVar.h(lVar2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i10 = i18 | i9;
            if ((306783379 & i10) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i10 & 1, z2)) {
                sVar.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        rVar4 = o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        yVarA = b0.a(0, 0, sVar, 3);
                    }
                    if (i6 != 0) {
                        float f5 = 0;
                        z0Var4 = new z0(f5, f5, f5, f5);
                    } else {
                        z0Var4 = z0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar4 = androidx.compose.ui.c.J;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    i11 = i10 & (-238551041);
                    nVarA = r1.a(sVar);
                    gVar4 = gVar2;
                    dVar3 = hVar4;
                    z0Var5 = z0Var4;
                    z4 = true;
                } else {
                    if (i12 != 0) {
                        rVar4 = o.b;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        yVarA = b0.a(0, 0, sVar, 3);
                    }
                    if (i6 != 0) {
                        float f6 = 0;
                        z0Var4 = new z0(f6, f6, f6, f6);
                    } else {
                        z0Var4 = z0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar5 = androidx.compose.ui.c.J;
                    lVarH = okhttp3.internal.platform.android.g.h(sVar);
                    i11 = i10 & (-238551041);
                    nVarA = r1.a(sVar);
                    gVar4 = gVar2;
                    dVar3 = hVar5;
                    z0Var5 = z0Var4;
                    z4 = true;
                }
                sVar.q();
                androidx.compose.ui.r rVar7 = rVar4;
                androidx.compose.foundation.lazy.y yVar5 = yVarA;
                androidx.compose.foundation.gestures.l lVar6 = lVarH;
                androidx.compose.foundation.n nVar5 = nVarA;
                t.a(rVar7, yVar5, z0Var5, true, lVar6, z4, nVar5, dVar3, gVar4, null, null, lVar2, sVar, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                lVar3 = lVar6;
                gVar3 = gVar4;
                nVar2 = nVar5;
                androidx.compose.ui.d dVar6 = dVar3;
                z3 = z4;
                dVar2 = dVar6;
                z0Var3 = z0Var5;
                yVar2 = yVar5;
                rVar3 = rVar7;
            } else {
                sVar.W();
                dVar2 = dVar;
                nVar2 = nVar;
                rVar3 = rVar2;
                yVar2 = yVarA;
                z0Var3 = z0Var2;
                gVar3 = gVar2;
                lVar3 = lVar;
                z3 = z;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        android.support.v4.media.session.b.c(rVar3, yVar2, z0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i5 |= 384;
        z0Var2 = z0Var;
        i8 = i5 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                gVar2 = gVar;
                if (sVar.f(gVar2)) {
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            i8 |= i14;
        } else {
            gVar2 = gVar;
        }
        int i19 = i8 | 46858240;
        if (sVar.h(lVar2)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        i10 = i19 | i9;
        if ((306783379 & i10) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sVar.T(i10 & 1, z2)) {
            sVar.Y();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    rVar4 = o.b;
                } else {
                    rVar4 = rVar2;
                }
                if ((i3 & 2) != 0) {
                    i10 &= -113;
                    yVarA = b0.a(0, 0, sVar, 3);
                }
                if (i6 != 0) {
                    float f7 = 0;
                    z0Var4 = new z0(f7, f7, f7, f7);
                } else {
                    z0Var4 = z0Var2;
                }
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                androidx.compose.ui.h hVar6 = androidx.compose.ui.c.J;
                lVarH = okhttp3.internal.platform.android.g.h(sVar);
                i11 = i10 & (-238551041);
                nVarA = r1.a(sVar);
                gVar4 = gVar2;
                dVar3 = hVar6;
                z0Var5 = z0Var4;
                z4 = true;
            } else {
                if (i12 != 0) {
                    rVar4 = o.b;
                } else {
                    rVar4 = rVar2;
                }
                if ((i3 & 2) != 0) {
                    i10 &= -113;
                    yVarA = b0.a(0, 0, sVar, 3);
                }
                if (i6 != 0) {
                    float f8 = 0;
                    z0Var4 = new z0(f8, f8, f8, f8);
                } else {
                    z0Var4 = z0Var2;
                }
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                androidx.compose.ui.h hVar7 = androidx.compose.ui.c.J;
                lVarH = okhttp3.internal.platform.android.g.h(sVar);
                i11 = i10 & (-238551041);
                nVarA = r1.a(sVar);
                gVar4 = gVar2;
                dVar3 = hVar7;
                z0Var5 = z0Var4;
                z4 = true;
            }
            sVar.q();
            androidx.compose.ui.r rVar8 = rVar4;
            androidx.compose.foundation.lazy.y yVar6 = yVarA;
            androidx.compose.foundation.gestures.l lVar7 = lVarH;
            androidx.compose.foundation.n nVar6 = nVarA;
            t.a(rVar8, yVar6, z0Var5, true, lVar7, z4, nVar6, dVar3, gVar4, null, null, lVar2, sVar, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
            lVar3 = lVar7;
            gVar3 = gVar4;
            nVar2 = nVar6;
            androidx.compose.ui.d dVar7 = dVar3;
            z3 = z4;
            dVar2 = dVar7;
            z0Var3 = z0Var5;
            yVar2 = yVar6;
            rVar3 = rVar8;
        } else {
            sVar.W();
            dVar2 = dVar;
            nVar2 = nVar;
            rVar3 = rVar2;
            yVar2 = yVarA;
            z0Var3 = z0Var2;
            gVar3 = gVar2;
            lVar3 = lVar;
            z3 = z;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    android.support.v4.media.session.b.c(rVar3, yVar2, z0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i2 | 1), i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void d(androidx.compose.ui.r rVar, androidx.compose.foundation.lazy.y yVar, final z0 z0Var, final androidx.compose.foundation.layout.e eVar, androidx.compose.ui.i iVar, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, final l lVar2, s sVar, final int i2) {
        final androidx.compose.ui.r rVar2;
        final androidx.compose.foundation.lazy.y yVar2;
        final androidx.compose.ui.i iVar2;
        final androidx.compose.foundation.gestures.l lVar3;
        final boolean z2;
        final androidx.compose.foundation.n nVar2;
        androidx.compose.foundation.lazy.y yVarA;
        androidx.compose.foundation.n nVarA;
        int i3;
        androidx.compose.ui.r rVar3;
        boolean z3;
        androidx.compose.foundation.gestures.l lVar4;
        androidx.compose.ui.i iVar3;
        sVar.c0(-1884325601);
        int i4 = i2 | 46861334 | (sVar.h(lVar2) ? 536870912 : 268435456);
        if (sVar.T(i4 & 1, (306783379 & i4) != 306783378)) {
            sVar.Y();
            if ((i2 & 1) == 0 || sVar.C()) {
                yVarA = b0.a(0, 0, sVar, 3);
                androidx.compose.ui.i iVar4 = androidx.compose.ui.c.G;
                androidx.compose.foundation.gestures.l lVarH = okhttp3.internal.platform.android.g.h(sVar);
                nVarA = r1.a(sVar);
                i3 = i4 & (-238551153);
                rVar3 = o.b;
                z3 = true;
                lVar4 = lVarH;
                iVar3 = iVar4;
            } else {
                sVar.W();
                yVarA = yVar;
                iVar3 = iVar;
                lVar4 = lVar;
                z3 = z;
                nVarA = nVar;
                i3 = i4 & (-238551153);
                rVar3 = rVar;
            }
            sVar.q();
            t.a(rVar3, yVarA, z0Var, false, lVar4, z3, nVarA, null, null, iVar3, eVar, lVar2, sVar, 1600902, 432 | ((i3 >> 18) & 7168), 1792);
            androidx.compose.ui.i iVar5 = iVar3;
            nVar2 = nVarA;
            iVar2 = iVar5;
            rVar2 = rVar3;
            yVar2 = yVarA;
            lVar3 = lVar4;
            z2 = z3;
        } else {
            sVar.W();
            rVar2 = rVar;
            yVar2 = yVar;
            iVar2 = iVar;
            lVar3 = lVar;
            z2 = z;
            nVar2 = nVar;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(yVar2, z0Var, eVar, iVar2, lVar3, z2, nVar2, lVar2, i2) { // from class: androidx.compose.foundation.lazy.c
                public final /* synthetic */ androidx.compose.foundation.layout.e A;
                public final /* synthetic */ androidx.compose.ui.i B;
                public final /* synthetic */ androidx.compose.foundation.gestures.l C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ androidx.compose.foundation.n E;
                public final /* synthetic */ kotlin.jvm.functions.l F;
                public final /* synthetic */ y y;
                public final /* synthetic */ z0 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(24961);
                    android.support.v4.media.session.b.d(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final Object[] e(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.o.j(0, i2, 6, objArr, objArr2);
        kotlin.collections.o.f(i2 + 2, i2, objArr.length, objArr, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.o.j(0, i2, 6, objArr, objArr2);
        kotlin.collections.o.f(i2, i2 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] g(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.o.j(0, i2, 6, objArr, objArr2);
        kotlin.collections.o.f(i2, i2 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static boolean h(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zI = i(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zI;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean i(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static s0 j(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                com.google.firebase.platforminfo.b.p(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (s0) objNewInstance;
            } catch (IllegalAccessException e2) {
                androidx.core.graphics.b.c("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                androidx.core.graphics.b.c("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            androidx.core.graphics.b.c("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static void k(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (com.google.firebase.components.h hVar : (Set) it2.next()) {
                        for (com.google.firebase.components.j jVar : hVar.a.c) {
                            if (jVar.c == 0) {
                                Set<com.google.firebase.components.h> set = (Set) map.get(new com.google.firebase.components.i(jVar.a, jVar.b == 2));
                                if (set != null) {
                                    for (com.google.firebase.components.h hVar2 : set) {
                                        hVar.b.add(hVar2);
                                        hVar2.c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<com.google.firebase.components.h> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (com.google.firebase.components.h hVar3 : hashSet) {
                    if (hVar3.c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    com.google.firebase.components.h hVar4 = (com.google.firebase.components.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i2++;
                    for (com.google.firebase.components.h hVar5 : hVar4.b) {
                        hVar5.c.remove(hVar4);
                        if (hVar5.c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (com.google.firebase.components.h hVar6 : hashSet) {
                    if (!hVar6.c.isEmpty() && !hVar6.b.isEmpty()) {
                        arrayList2.add(hVar6.a);
                    }
                }
                throw new com.google.firebase.components.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 7);
            }
            com.google.firebase.components.b bVar = (com.google.firebase.components.b) it.next();
            com.google.firebase.components.h hVar7 = new com.google.firebase.components.h(bVar);
            for (com.google.firebase.components.r rVar : bVar.b) {
                boolean z = bVar.e == 0;
                com.google.firebase.components.i iVar = new com.google.firebase.components.i(rVar, !z);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set2 = (Set) map.get(iVar);
                if (!set2.isEmpty() && z) {
                    t0.m(rVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(hVar7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static androidx.work.i l(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            kotlinx.coroutines.future.a.u("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return androidx.work.i.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            byte b2 = (byte) (-21267);
            int i2 = 0;
            if (bArr2[0] == ((byte) 16777132)) {
                z = true;
                if (bArr2[1] != b2) {
                    z = false;
                }
            } else {
                z = false;
            }
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i3 = objectInputStream.readInt();
                    while (i2 < i3) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i2++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dagger.internal.d.b(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.n(s2, "Unsupported version number: "));
                        }
                    } else {
                        kotlinx.coroutines.future.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.n(s, "Magic number doesn't match: "));
                    }
                    int i4 = dataInputStream.readInt();
                    while (i2 < i4) {
                        linkedHashMap.put(dataInputStream.readUTF(), m(dataInputStream, dataInputStream.readByte()));
                        i2++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        dagger.internal.d.b(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e2) {
            y.e().d(j.a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            y.e().d(j.a, "Error in Data#fromByteArray: ", e3);
        }
        return new androidx.work.i(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable m(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int i3 = dataInputStream.readInt();
            ?? r0 = new Boolean[i3];
            while (i2 < i3) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i4 = dataInputStream.readInt();
            ?? r1 = new Byte[i4];
            while (i2 < i4) {
                r1[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i5 = dataInputStream.readInt();
            ?? r2 = new Integer[i5];
            while (i2 < i5) {
                r2[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i6 = dataInputStream.readInt();
            ?? r3 = new Long[i6];
            while (i2 < i6) {
                r3[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i7 = dataInputStream.readInt();
            ?? r4 = new Float[i7];
            while (i2 < i7) {
                r4[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i8 = dataInputStream.readInt();
            ?? r5 = new Double[i8];
            while (i2 < i8) {
                r5[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r5;
        }
        if (b2 != 14) {
            kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.n(b2, "Unsupported type "));
            return null;
        }
        int i9 = dataInputStream.readInt();
        ?? r6 = new String[i9];
        while (i2 < i9) {
            String utf = dataInputStream.readUTF();
            if (kotlin.jvm.internal.l.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i2] = utf;
            i2++;
        }
        return r6;
    }

    public static float n(int i2, String[] strArr) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static final ViewParent p(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final androidx.compose.ui.text.style.j r(j0 j0Var, int i2) {
        i0 i0Var = j0Var.a;
        androidx.compose.ui.text.n nVar = j0Var.b;
        if (i0Var.a.y.length() != 0) {
            int iD = nVar.d(i2);
            if ((i2 != 0 && iD == nVar.d(i2 - 1)) || (i2 != i0Var.a.y.length() && iD == nVar.d(i2 + 1))) {
                return j0Var.a(i2);
            }
        }
        return j0Var.g(i2);
    }

    public static final int s(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static boolean t(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean u(byte b2) {
        return b2 > -65;
    }

    public static boolean v(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static com.google.common.base.q w(com.google.common.base.q qVar) {
        if ((qVar instanceof com.google.common.base.s) || (qVar instanceof com.google.common.base.r)) {
            return qVar;
        }
        return qVar instanceof Serializable ? new com.google.common.base.r(qVar) : new com.google.common.base.s(qVar);
    }

    public static String x(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            kotlinx.coroutines.future.a.q("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer y(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final List z(androidx.sqlite.c cVar) {
        int iH = _COROUTINE.b.h(cVar, "id");
        int iH2 = _COROUTINE.b.h(cVar, "seq");
        int iH3 = _COROUTINE.b.h(cVar, "from");
        int iH4 = _COROUTINE.b.h(cVar, "to");
        kotlin.collections.builders.b bVarG = q.g();
        while (cVar.Q()) {
            bVarG.add(new androidx.room.util.f(cVar.F(iH3), (int) cVar.getLong(iH), cVar.F(iH4), (int) cVar.getLong(iH2)));
        }
        return p.V(q.c(bVarG));
    }

    public abstract Object B(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar);

    public abstract Object C(Uri uri, kotlin.coroutines.d dVar);

    public abstract Object o(kotlin.coroutines.d dVar);
}
