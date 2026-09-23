package kotlin.math;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c2;
import androidx.collection.s0;
import androidx.collection.z0;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h1;
import androidx.compose.animation.core.i2;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.text.input.internal.k;
import androidx.compose.foundation.text.selection.j0;
import androidx.compose.material3.internal.r0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.c;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.runtime.w2;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.layer.i;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.input.indirect.b;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.q2;
import androidx.compose.ui.unit.o;
import androidx.compose.ui.unit.p;
import androidx.compose.ui.window.d0;
import androidx.compose.ui.window.e0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.source.t0;
import androidx.navigation.b0;
import androidx.navigation.compose.q;
import androidx.navigation.compose.u;
import androidx.navigation.k0;
import androidx.navigation.l0;
import androidx.navigation.v;
import androidx.navigation.w;
import androidx.navigation.y;
import androidx.room.t;
import coil3.j;
import coil3.l;
import coil3.request.h;
import coil3.request.n;
import coil3.size.d;
import coil3.util.m;
import com.app.mlounge.emulator.LibretroCore;
import com.google.common.base.g;
import com.google.protobuf.o2;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.collections.c0;
import kotlin.collections.r;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {
    public static f A;
    public static f B;
    public static f C;
    public static f D;
    public static long E;
    public static Method F;
    public static Method G;
    public static Method H;
    public static final /* synthetic */ int I = 0;
    public static final /* synthetic */ int J = 0;
    public static final /* synthetic */ int K = 0;
    public static f e;
    public static f y;
    public static f z;

    public static final void B(k2 k2Var, c cVar, int i) {
        while (true) {
            int i2 = k2Var.v;
            if (i > i2 && i < k2Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            k2Var.M();
            if (k2Var.y(k2Var.v)) {
                cVar.k();
            }
            k2Var.j();
        }
    }

    public static final long C(b bVar, o1 o1Var, androidx.compose.ui.input.indirect.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (o1Var == null) {
            return bVar.c;
        }
        int i = aVar.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c >> 32));
        } else {
            if (i != 2) {
                return bVar.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        }
        if (o1Var == o1.y) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final long D(b bVar, o1 o1Var, androidx.compose.ui.input.indirect.a aVar) {
        float fIntBitsToFloat;
        long j = bVar.g;
        if (o1Var == null) {
            return j;
        }
        int i = aVar.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i != 2) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (o1Var == o1.y) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public static Uri E(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static final float F(long j, float f, androidx.compose.ui.unit.c cVar) {
        float fC;
        long jB = o.b(j);
        if (p.a(jB, 4294967296L)) {
            if (cVar.U() <= 1.05d) {
                return cVar.t0(j);
            }
            fC = o.c(j) / o.c(cVar.H(f));
        } else {
            if (!p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = o.c(j);
        }
        return fC * f;
    }

    public static int G(double d) {
        if (Double.isNaN(d)) {
            kotlinx.coroutines.future.a.q("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int H(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        kotlinx.coroutines.future.a.q("Cannot round NaN value.");
        return 0;
    }

    public static long I(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        kotlinx.coroutines.future.a.q("Cannot round NaN value.");
        return 0L;
    }

    public static final Object J(kotlin.jvm.functions.p pVar) {
        Thread.interrupted();
        return BuildersKt__BuildersKt.runBlocking$default(null, new k(pVar, null), 1, null);
    }

    public static final void L(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(a0.y(j)), i, i2, 33);
        }
    }

    public static void M(Window window, boolean z2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            i.i(window, z2);
        } else {
            if (i >= 30) {
                i.h(window, z2);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void O(Spannable spannable, long j, androidx.compose.ui.unit.c cVar, int i, int i2) {
        long jB = o.b(j);
        if (p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(H(cVar.t0(j)), false), i, i2, 33);
        } else if (p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static final void P(Spannable spannable, androidx.compose.ui.text.intl.b bVar, int i, int i2) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(r.p(bVar, 10));
            Iterator it = bVar.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.text.intl.a) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static String Q(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + okhttp3.internal.platform.android.g.A(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + okhttp3.internal.platform.android.g.A(Float.intBitsToFloat(i)) + ", " + okhttp3.internal.platform.android.g.A(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final coil3.intercept.a R(coil3.intercept.a aVar, coil3.request.g gVar, n nVar, coil3.f fVar, androidx.media3.exoplayer.hls.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        coil3.intercept.g gVar2;
        Bitmap bitmapL;
        coil3.intercept.a aVar2;
        Bitmap bitmap;
        int size;
        coil3.f fVar2;
        List list;
        int i;
        coil3.request.g gVar3 = gVar;
        n nVar2 = nVar;
        if (cVar2 instanceof coil3.intercept.g) {
            gVar2 = (coil3.intercept.g) cVar2;
            int i2 = gVar2.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar2.F = i2 - Integer.MIN_VALUE;
            } else {
                gVar2 = new coil3.intercept.g(cVar2);
            }
        } else {
            gVar2 = new coil3.intercept.g(cVar2);
        }
        Object obj = gVar2.E;
        int i3 = gVar2.F;
        if (i3 == 0) {
            kotlin.a.e(obj);
            List list2 = (List) l.d(gVar3, h.a);
            if (list2.isEmpty()) {
                return aVar;
            }
            j jVar = aVar.a;
            boolean z2 = jVar instanceof coil3.a;
            coil3.util.h hVar = coil3.util.h.z;
            if (!z2 && !((Boolean) l.d(gVar3, h.d)).booleanValue()) {
                if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar) <= 0) {
                    androidx.media3.exoplayer.hls.c.E("EngineInterceptor", hVar, androidx.privacysandbox.ads.adservices.java.internal.a.r("allowConversionToBitmap=false, skipping transformations for type ", kotlin.jvm.internal.a0.a(aVar.a.getClass()).c(), "."), null);
                }
                return aVar;
            }
            if (z2) {
                Bitmap bitmap2 = ((coil3.a) jVar).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (kotlin.collections.o.c(config, m.a)) {
                    bitmapL = bitmap2;
                } else if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar) <= 0) {
                    androidx.media3.exoplayer.hls.c.E("EngineInterceptor", hVar, "Converting bitmap with config " + config + " to apply transformations: " + list2 + ".", null);
                }
                fVar.getClass();
                aVar2 = aVar;
                bitmap = bitmapL;
                size = list2.size();
                fVar2 = fVar;
                list = list2;
                i = 0;
            } else if (cVar != null && ((coil3.util.h) cVar.y).compareTo(hVar) <= 0) {
                androidx.media3.exoplayer.hls.c.E("EngineInterceptor", hVar, "Converting image of type " + kotlin.jvm.internal.a0.a(jVar.getClass()).b() + " to apply transformations: " + list2 + ".", null);
            }
            bitmapL = t.l(l.b(jVar, nVar2.a.getResources()), (Bitmap.Config) l.e(nVar2, coil3.request.i.b), nVar2.b, nVar2.c, (coil3.size.h) l.e(nVar2, h.b), nVar2.d == d.y);
            fVar.getClass();
            aVar2 = aVar;
            bitmap = bitmapL;
            size = list2.size();
            fVar2 = fVar;
            list = list2;
            i = 0;
        } else {
            if (i3 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = gVar2.D;
            int i4 = gVar2.C;
            List list3 = gVar2.B;
            fVar2 = gVar2.A;
            n nVar3 = gVar2.z;
            coil3.request.g gVar4 = gVar2.y;
            aVar2 = gVar2.e;
            kotlin.a.e(obj);
            Bitmap bitmap3 = (Bitmap) obj;
            JobKt.ensureActive(gVar2.getContext());
            i = i4 + 1;
            gVar3 = gVar4;
            bitmap = bitmap3;
            list = list3;
            nVar2 = nVar3;
        }
        if (i >= size) {
            fVar2.getClass();
            return new coil3.intercept.a(new coil3.a(bitmap), aVar2.b, aVar2.c, aVar2.d);
        }
        if (list.get(i) != null) {
            androidx.transition.k.h();
            return null;
        }
        coil3.size.h hVar2 = nVar2.b;
        gVar2.e = aVar2;
        gVar2.y = gVar3;
        gVar2.z = nVar2;
        gVar2.A = fVar2;
        gVar2.B = list;
        gVar2.C = i;
        gVar2.D = size;
        gVar2.F = 1;
        throw null;
    }

    public static String S(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void T(int i, int i2) {
        String strC;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strC = okhttp3.internal.platform.android.g.C("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.e(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strC = okhttp3.internal.platform.android.g.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void U(int i, int i2, int i3) {
        String strV;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strV = V(i, i3, "start index");
            } else {
                strV = (i2 < 0 || i2 > i3) ? V(i2, i3, "end index") : okhttp3.internal.platform.android.g.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static String V(int i, int i2, String str) {
        if (i < 0) {
            return okhttp3.internal.platform.android.g.C("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return okhttp3.internal.platform.android.g.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.e(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public static final void a(androidx.compose.foundation.text.selection.m mVar, e eVar, androidx.compose.runtime.internal.f fVar, s sVar, int i) {
        int i2;
        sVar.c0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(mVar) : sVar.h(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(fVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        boolean z2 = true;
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean z3 = (i2 & Token.ASSIGN_MOD) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !sVar.f(mVar))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objQ = sVar.Q();
            if (z4 || objQ == androidx.compose.runtime.n.a) {
                objQ = new androidx.compose.foundation.text.selection.l(eVar, mVar);
                sVar.l0(objQ);
            }
            androidx.compose.ui.window.o.a((androidx.compose.foundation.text.selection.l) objQ, null, new d0(false, e0.e, false), fVar, sVar, ((i2 << 3) & 7168) | 384, 2);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.j(mVar, eVar, fVar, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:331:0x0684  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [androidx.navigation.compose.n] */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v26, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.navigation.t, androidx.navigation.v] */
    public static final void b(final y yVar, final v vVar, final androidx.compose.ui.r rVar, final e eVar, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final kotlin.jvm.functions.l lVar3, final kotlin.jvm.functions.l lVar4, s sVar, final int i) {
        l0 l0Var;
        androidx.lifecycle.v vVar2;
        a1 a1Var;
        ?? r14;
        kotlin.coroutines.d dVar;
        ?? r15;
        ?? r0;
        androidx.navigation.compose.n nVar;
        final androidx.navigation.compose.i iVar;
        boolean z2;
        boolean z3;
        h1 h1Var;
        e2 e2Var;
        androidx.collection.e0 e0Var;
        androidx.navigation.compose.i iVar2;
        a1 a1Var2;
        int i2;
        kotlin.coroutines.d dVar2;
        int[] intArray;
        int[] iArr;
        ArrayList arrayList;
        String strA;
        androidx.navigation.t tVarZ;
        v vVar3;
        int i3;
        Bundle bundle;
        androidx.navigation.t tVarZ2;
        v vVar4;
        ?? r16;
        sVar.c0(-1964664536);
        int i4 = (i & 6) == 0 ? (sVar.h(yVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= sVar.h(vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar.f(rVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar.f(eVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar.h(lVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= sVar.h(lVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i4 |= sVar.h(lVar3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= sVar.h(lVar4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= sVar.h(null) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if ((38347923 & i5) == 38347922 && sVar.F()) {
            sVar.W();
            r16 = sVar;
        } else {
            sVar.Y();
            if ((i & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            androidx.lifecycle.v vVar5 = (androidx.lifecycle.v) sVar.j(androidx.lifecycle.compose.c.a);
            y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
            if (y0VarA == null) {
                kotlinx.coroutines.future.a.u("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            x0 viewModelStore = y0VarA.getViewModelStore();
            yVar.getClass();
            androidx.navigation.internal.f fVar = yVar.b;
            viewModelStore.getClass();
            fVar.getClass();
            l0 l0Var2 = fVar.t;
            if (!kotlin.jvm.internal.l.a(fVar.p, androidx.navigation.f.c(viewModelStore))) {
                if (!fVar.f.isEmpty()) {
                    kotlinx.coroutines.future.a.u("ViewModelStore should be set before setGraph call");
                    return;
                }
                fVar.p = androidx.navigation.f.c(viewModelStore);
            }
            vVar.getClass();
            fVar.getClass();
            LinkedHashMap linkedHashMap = fVar.u;
            androidx.fragment.app.h hVar = vVar.C;
            kotlin.collections.l<androidx.navigation.i> lVar5 = fVar.f;
            if (!lVar5.isEmpty() && fVar.i() == androidx.lifecycle.o.e) {
                kotlinx.coroutines.future.a.u("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z4 = false;
            if (kotlin.jvm.internal.l.a(fVar.c, vVar)) {
                l0Var = l0Var2;
                i5 = i5;
                vVar2 = vVar5;
                int iF = ((z0) hVar.A).f();
                for (int i6 = 0; i6 < iF; i6++) {
                    androidx.navigation.t tVar = (androidx.navigation.t) ((z0) hVar.A).g(i6);
                    v vVar6 = fVar.c;
                    vVar6.getClass();
                    int iD = ((z0) vVar6.C.A).d(i6);
                    v vVar7 = fVar.c;
                    vVar7.getClass();
                    z0 z0Var = (z0) vVar7.C.A;
                    if (z0Var.e) {
                        androidx.collection.t.a(z0Var);
                    }
                    int iA = androidx.collection.internal.a.a(z0Var.y, z0Var.A, iD);
                    if (iA >= 0) {
                        Object[] objArr = z0Var.z;
                        Object obj = objArr[iA];
                        objArr[iA] = tVar;
                    }
                }
                for (androidx.navigation.i iVar3 : lVar5) {
                    int i7 = androidx.navigation.t.B;
                    kotlin.collections.d0 d0Var = new kotlin.collections.d0(kotlin.sequences.k.O(androidx.navigation.f.b(iVar3.y)));
                    androidx.navigation.t tVarZ3 = fVar.c;
                    tVarZ3.getClass();
                    Iterator it = d0Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((z) it).y;
                        if (listIterator.hasPrevious()) {
                            androidx.navigation.t tVar2 = (androidx.navigation.t) listIterator.previous();
                            if (!kotlin.jvm.internal.l.a(tVar2, fVar.c) || !kotlin.jvm.internal.l.a(tVarZ3, vVar)) {
                                if (tVarZ3 instanceof v) {
                                    tVarZ3 = ((v) tVarZ3).C.z(tVar2.y.a);
                                    tVarZ3.getClass();
                                }
                            }
                        }
                    }
                    tVarZ3.getClass();
                    iVar3.y = tVarZ3;
                }
            } else {
                v vVar8 = fVar.c;
                if (vVar8 != null) {
                    Iterator it2 = new ArrayList(fVar.m.keySet()).iterator();
                    while (it2.hasNext()) {
                        Integer num = (Integer) it2.next();
                        num.getClass();
                        int iIntValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((androidx.navigation.l) it3.next()).d = true;
                            it2 = it2;
                        }
                        Iterator it4 = it2;
                        boolean zS = fVar.s(iIntValue, null, new b0(z4, true, -1, z4, z4, -1, -1));
                        for (Iterator it5 = linkedHashMap.values().iterator(); it5.hasNext(); it5 = it5) {
                            ((androidx.navigation.l) it5.next()).d = false;
                            zS = zS;
                        }
                        if (zS) {
                            fVar.n(iIntValue, true, false);
                        }
                        it2 = it4;
                        z4 = false;
                    }
                    fVar.n(vVar8.y.a, true, false);
                }
                fVar.c = vVar;
                l0 l0Var3 = fVar.t;
                y yVar2 = fVar.a;
                androidx.media3.exoplayer.mediacodec.g gVar = yVar2.c;
                Bundle bundle2 = fVar.d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        coil3.svg.internal.a.D("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    Iterator<String> it6 = stringArrayList.iterator();
                    while (it6.hasNext()) {
                        Iterator<String> it7 = it6;
                        String next = it6.next();
                        l0Var3.b(next);
                        if (bundle2.containsKey(next) && bundle2.getBundle(next) == null) {
                            coil3.svg.internal.a.D(next);
                            throw null;
                        }
                        it6 = it7;
                    }
                }
                Bundle[] bundleArr = fVar.e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = i8;
                        Bundle bundle3 = bundleArr[i9];
                        bundle3.getClass();
                        int i10 = length;
                        bundle3.setClassLoader(androidx.navigation.j.class.getClassLoader());
                        String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            coil3.svg.internal.a.D("nav-entry-state:id");
                            throw null;
                        }
                        int iR = coil3.network.g.r("nav-entry-state:destination-id", bundle3);
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            coil3.svg.internal.a.D("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            coil3.svg.internal.a.D("nav-entry-state:saved-state");
                            throw null;
                        }
                        androidx.navigation.t tVarD = fVar.d(iR, null);
                        if (tVarD == null) {
                            int i11 = androidx.navigation.t.B;
                            t0.k(androidx.privacysandbox.ads.adservices.java.internal.a.x("Restoring the Navigation back stack failed: destination ", androidx.navigation.f.a(gVar, iR), " cannot be found from the current destination "), fVar.g());
                            return;
                        }
                        androidx.lifecycle.o oVarI = fVar.i();
                        androidx.navigation.m mVar = fVar.p;
                        gVar.getClass();
                        oVarI.getClass();
                        Context context = gVar.e;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        androidx.navigation.i iVar4 = new androidx.navigation.i(gVar, tVarD, bundle4, oVarI, mVar, string, bundle5);
                        k0 k0VarB = l0Var3.b(tVarD.e);
                        Object lVar6 = linkedHashMap.get(k0VarB);
                        if (lVar6 == null) {
                            lVar6 = new androidx.navigation.l(yVar2, k0VarB);
                            linkedHashMap.put(k0VarB, lVar6);
                        }
                        lVar5.addLast(iVar4);
                        ((androidx.navigation.l) lVar6).a(iVar4);
                        v vVar9 = iVar4.y.z;
                        if (vVar9 != null) {
                            fVar.k(iVar4, fVar.f(vVar9.y.a));
                        }
                        i8 = i9 + 1;
                        length = i10;
                    }
                    fVar.b.invoke();
                    fVar.e = null;
                }
                Collection collectionValues = c0.o(l0Var3.a).values();
                ArrayList<k0> arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (!((k0) obj2).b) {
                        arrayList2.add(obj2);
                    }
                }
                for (k0 k0Var : arrayList2) {
                    Object lVar7 = linkedHashMap.get(k0Var);
                    if (lVar7 == null) {
                        k0Var.getClass();
                        lVar7 = new androidx.navigation.l(yVar2, k0Var);
                        linkedHashMap.put(k0Var, lVar7);
                    }
                    k0Var.getClass();
                    k0Var.a = (androidx.navigation.l) lVar7;
                    k0Var.b = true;
                }
                if (fVar.c == null || !lVar5.isEmpty()) {
                    l0Var = l0Var2;
                    i5 = i5;
                    vVar2 = vVar5;
                    fVar.b();
                } else {
                    Activity activity = yVar2.d;
                    if (yVar2.e || activity == null) {
                        l0Var = l0Var2;
                        i5 = i5;
                        vVar2 = vVar5;
                        v vVar10 = fVar.c;
                        vVar10.getClass();
                        fVar.l(vVar10, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        androidx.navigation.internal.f fVar2 = yVar2.b;
                        if (intent == null) {
                            l0Var = l0Var2;
                            i5 = i5;
                            vVar2 = vVar5;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e2) {
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                bundleF.putAll(bundle6);
                            }
                            if (intArray == null || intArray.length == 0) {
                                ?? J2 = fVar2.j();
                                vVar2 = vVar5;
                                l0Var = l0Var2;
                                androidx.navigation.s sVarE = J2.e(new c2(24, intent.getData(), intent.getAction(), intent.getType()), J2);
                                if (sVarE != null) {
                                    androidx.navigation.t tVar3 = sVarE.e;
                                    kotlin.collections.l lVar8 = new kotlin.collections.l();
                                    androidx.navigation.t tVar4 = tVar3;
                                    while (true) {
                                        androidx.appcompat.widget.o oVar = tVar4.y;
                                        v vVar11 = tVar4.z;
                                        if (vVar11 == null || vVar11.C.y != oVar.a) {
                                            lVar8.addFirst(tVar4);
                                        }
                                        if (kotlin.jvm.internal.l.a(vVar11, null) || vVar11 == null) {
                                            break;
                                        } else {
                                            tVar4 = vVar11;
                                        }
                                    }
                                    List listB0 = kotlin.collections.p.b0(lVar8);
                                    ArrayList arrayList3 = new ArrayList(r.p(listB0, 10));
                                    Iterator it8 = listB0.iterator();
                                    while (it8.hasNext()) {
                                        arrayList3.add(Integer.valueOf(((androidx.navigation.t) it8.next()).y.a));
                                    }
                                    int[] iArrA0 = kotlin.collections.p.a0(arrayList3);
                                    Bundle bundleB = tVar3.b(sVarE.y);
                                    if (bundleB != null) {
                                        bundleF.putAll(bundleB);
                                    }
                                    iArr = iArrA0;
                                    arrayList = null;
                                }
                                if (iArr == null && iArr.length != 0) {
                                    fVar2.getClass();
                                    v vVar12 = fVar2.c;
                                    int length2 = iArr.length;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= length2) {
                                            strA = null;
                                            break;
                                        }
                                        int i13 = iArr[i12];
                                        if (i12 == 0) {
                                            v vVar13 = fVar2.c;
                                            vVar13.getClass();
                                            tVarZ2 = vVar13.y.a == i13 ? fVar2.c : null;
                                        } else {
                                            vVar12.getClass();
                                            tVarZ2 = vVar12.C.z(i13);
                                        }
                                        if (tVarZ2 == null) {
                                            int i14 = androidx.navigation.t.B;
                                            strA = androidx.navigation.f.a(fVar2.a.c, i13);
                                            break;
                                        }
                                        if (i12 != iArr.length - 1 && (tVarZ2 instanceof v)) {
                                            while (true) {
                                                vVar4 = (v) tVarZ2;
                                                vVar4.getClass();
                                                androidx.fragment.app.h hVar2 = vVar4.C;
                                                if (!(hVar2.z(hVar2.y) instanceof v)) {
                                                    break;
                                                } else {
                                                    tVarZ2 = hVar2.z(hVar2.y);
                                                }
                                            }
                                            vVar12 = vVar4;
                                        }
                                        i12++;
                                    }
                                    if (strA != null) {
                                        Log.i("NavController", "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundleF.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr.length;
                                        Bundle[] bundleArr2 = new Bundle[length3];
                                        for (int i15 = 0; i15 < length3; i15++) {
                                            Bundle bundleF2 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
                                            bundleF2.putAll(bundleF);
                                            if (arrayList != null && (bundle = (Bundle) arrayList.get(i15)) != null) {
                                                bundleF2.putAll(bundle);
                                            }
                                            bundleArr2[i15] = bundleF2;
                                        }
                                        int flags = intent.getFlags();
                                        int i16 = 268435456 & flags;
                                        if (i16 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            Context context2 = yVar2.a;
                                            ArrayList arrayList4 = new ArrayList();
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(context2.getPackageManager());
                                            }
                                            if (component != null) {
                                                int size = arrayList4.size();
                                                try {
                                                    for (Intent intentU = org.jsoup.helper.n.u(context2, component); intentU != null; intentU = org.jsoup.helper.n.u(context2, intentU.getComponent())) {
                                                        arrayList4.add(size, intentU);
                                                    }
                                                } catch (PackageManager.NameNotFoundException e3) {
                                                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                    throw new IllegalArgumentException(e3);
                                                }
                                            }
                                            arrayList4.add(intent);
                                            if (arrayList4.isEmpty()) {
                                                kotlinx.coroutines.future.a.u("No intents added to TaskStackBuilder; cannot startActivities");
                                                return;
                                            }
                                            Intent[] intentArr = (Intent[]) arrayList4.toArray(new Intent[0]);
                                            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                                            context2.startActivities(intentArr, null);
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i16 != 0) {
                                            if (fVar2.f.isEmpty()) {
                                                i3 = 0;
                                            } else {
                                                v vVar14 = fVar2.c;
                                                vVar14.getClass();
                                                i3 = 0;
                                                fVar2.n(vVar14.y.a, true, false);
                                            }
                                            while (i3 < iArr.length) {
                                                int i17 = iArr[i3];
                                                int i18 = i3 + 1;
                                                Bundle bundle7 = bundleArr2[i3];
                                                androidx.navigation.t tVarD2 = fVar2.d(i17, null);
                                                if (tVarD2 == null) {
                                                    int i19 = androidx.navigation.t.B;
                                                    t0.k(androidx.privacysandbox.ads.adservices.java.internal.a.x("Deep Linking failed: destination ", androidx.navigation.f.a(gVar, i17), " cannot be found from the current destination "), fVar2.g());
                                                    return;
                                                } else {
                                                    fVar2.l(tVarD2, bundle7, androidx.navigation.f.g(new r0(6, tVarD2, yVar2)));
                                                    i3 = i18;
                                                }
                                            }
                                            yVar2.e = true;
                                        } else {
                                            v vVar15 = fVar2.c;
                                            int length4 = iArr.length;
                                            for (int i20 = 0; i20 < length4; i20++) {
                                                int i21 = iArr[i20];
                                                Bundle bundle8 = bundleArr2[i20];
                                                if (i20 == 0) {
                                                    tVarZ = fVar2.c;
                                                } else {
                                                    vVar15.getClass();
                                                    tVarZ = vVar15.C.z(i21);
                                                }
                                                if (tVarZ == null) {
                                                    int i22 = androidx.navigation.t.B;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + androidx.navigation.f.a(gVar, i21) + " cannot be found in graph " + vVar15);
                                                }
                                                if (i20 == iArr.length - 1) {
                                                    v vVar16 = fVar2.c;
                                                    vVar16.getClass();
                                                    fVar2.l(tVarZ, bundle8, new b0(false, false, vVar16.y.a, true, false, 0, 0));
                                                } else if (tVarZ instanceof v) {
                                                    while (true) {
                                                        vVar3 = (v) tVarZ;
                                                        vVar3.getClass();
                                                        androidx.fragment.app.h hVar3 = vVar3.C;
                                                        if (!(hVar3.z(hVar3.y) instanceof v)) {
                                                            break;
                                                        } else {
                                                            tVarZ = hVar3.z(hVar3.y);
                                                        }
                                                    }
                                                    vVar15 = vVar3;
                                                }
                                            }
                                            yVar2.e = true;
                                        }
                                    }
                                }
                            } else {
                                l0Var = l0Var2;
                                vVar2 = vVar5;
                            }
                            arrayList = parcelableArrayList;
                            iArr = intArray;
                            if (iArr == null) {
                            }
                        }
                        v vVar17 = fVar.c;
                        vVar17.getClass();
                        fVar.l(vVar17, null, null);
                    }
                }
            }
            l0 l0Var4 = l0Var;
            k0 k0VarB2 = l0Var4.b("composable");
            androidx.navigation.compose.i iVar5 = k0VarB2 instanceof androidx.navigation.compose.i ? (androidx.navigation.compose.i) k0VarB2 : null;
            if (iVar5 == null) {
                s1 s1VarT = sVar.t();
                if (s1VarT != null) {
                    final int i23 = 2;
                    s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.navigation.compose.s
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i23) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.A(i | 1));
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.A(i | 1));
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.A(i | 1));
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            a1 a1VarG = androidx.compose.runtime.t.g(iVar5.b().e, sVar);
            Object objQ = sVar.Q();
            Object obj3 = androidx.compose.runtime.n.a;
            if (objQ == obj3) {
                objQ = new f1(0.0f);
                sVar.l0(objQ);
            }
            f1 f1Var = (f1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj3) {
                objQ2 = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar.l0(objQ2);
            }
            final a1 a1Var3 = (a1) objQ2;
            boolean z5 = ((List) a1VarG.getValue()).size() > 1;
            boolean zF = sVar.f(a1VarG) | sVar.h(iVar5);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == obj3) {
                objQ3 = new androidx.compose.animation.core.z0(iVar5, a1VarG, f1Var, a1Var3, null, 6);
                a1Var = a1VarG;
                sVar.l0(objQ3);
            } else {
                a1Var = a1VarG;
            }
            okhttp3.internal.platform.android.g.a(z5, (kotlin.jvm.functions.p) objQ3, sVar, 0);
            androidx.lifecycle.v vVar18 = vVar2;
            boolean zH = sVar.h(yVar) | sVar.h(vVar18);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == obj3) {
                objQ4 = new r0(8, yVar, vVar18);
                sVar.l0(objQ4);
            }
            androidx.compose.runtime.l0.b(vVar18, (kotlin.jvm.functions.l) objQ4, sVar);
            androidx.compose.runtime.saveable.e eVarF = androidx.compose.runtime.saveable.l.f(sVar);
            a1 a1VarG2 = androidx.compose.runtime.t.g(fVar.j, sVar);
            Object objQ5 = sVar.Q();
            if (objQ5 == obj3) {
                objQ5 = androidx.compose.runtime.t.k(new androidx.compose.foundation.text.selection.k0(a1VarG2, 6));
                sVar.l0(objQ5);
            }
            w2 w2Var = (w2) objQ5;
            androidx.navigation.i iVar6 = (androidx.navigation.i) kotlin.collections.p.K((List) w2Var.getValue());
            Object objQ6 = sVar.Q();
            if (objQ6 == obj3) {
                int i24 = s0.a;
                objQ6 = new androidx.collection.e0(6);
                sVar.l0(objQ6);
            }
            androidx.collection.e0 e0Var2 = (androidx.collection.e0) objQ6;
            if (iVar6 != null) {
                sVar.b0(-1797250687);
                boolean zH2 = sVar.h(iVar5) | ((((i5 & 3670016) ^ 1572864) > 1048576 && sVar.f(lVar3)) || (i5 & 1572864) == 1048576) | ((i5 & 57344) == 16384);
                Object objQ7 = sVar.Q();
                if (zH2 || objQ7 == obj3) {
                    final int i25 = 0;
                    iVar = iVar5;
                    z2 = false;
                    z3 = true;
                    kotlin.jvm.functions.l lVar9 = new kotlin.jvm.functions.l() { // from class: androidx.navigation.compose.p
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj4) {
                            int i26 = i25;
                            a1 a1Var4 = a1Var3;
                            kotlin.jvm.functions.l lVar10 = lVar;
                            kotlin.jvm.functions.l lVar11 = lVar3;
                            i iVar7 = iVar;
                            androidx.compose.animation.v vVar19 = (androidx.compose.animation.v) obj4;
                            switch (i26) {
                                case 0:
                                    androidx.navigation.t tVar5 = ((androidx.navigation.i) vVar19.c()).y;
                                    tVar5.getClass();
                                    h hVar4 = (h) tVar5;
                                    if (((Boolean) iVar7.c.getValue()).booleanValue() || ((Boolean) a1Var4.getValue()).booleanValue()) {
                                        int i27 = androidx.navigation.t.B;
                                        for (androidx.navigation.t tVar6 : androidx.navigation.f.b(hVar4)) {
                                        }
                                        return (androidx.compose.animation.x0) lVar11.invoke(vVar19);
                                    }
                                    int i28 = androidx.navigation.t.B;
                                    for (androidx.navigation.t tVar7 : androidx.navigation.f.b(hVar4)) {
                                    }
                                    return (androidx.compose.animation.x0) lVar10.invoke(vVar19);
                                default:
                                    androidx.navigation.t tVar8 = ((androidx.navigation.i) vVar19.b()).y;
                                    tVar8.getClass();
                                    h hVar5 = (h) tVar8;
                                    if (((Boolean) iVar7.c.getValue()).booleanValue() || ((Boolean) a1Var4.getValue()).booleanValue()) {
                                        int i29 = androidx.navigation.t.B;
                                        for (androidx.navigation.t tVar9 : androidx.navigation.f.b(hVar5)) {
                                        }
                                        return (androidx.compose.animation.y0) lVar11.invoke(vVar19);
                                    }
                                    int i30 = androidx.navigation.t.B;
                                    for (androidx.navigation.t tVar10 : androidx.navigation.f.b(hVar5)) {
                                    }
                                    return (androidx.compose.animation.y0) lVar10.invoke(vVar19);
                            }
                        }
                    };
                    sVar.l0(lVar9);
                    objQ7 = lVar9;
                } else {
                    iVar = iVar5;
                    z3 = true;
                    z2 = false;
                }
                kotlin.jvm.functions.l lVar10 = (kotlin.jvm.functions.l) objQ7;
                boolean zH3 = sVar.h(iVar) | (((((i5 & 29360128) ^ 12582912) <= 8388608 || !sVar.f(lVar4)) && (i5 & 12582912) != 8388608) ? z2 : z3) | ((i5 & 458752) == 131072 ? z3 : z2);
                Object objQ8 = sVar.Q();
                if (zH3 || objQ8 == obj3) {
                    final int i26 = 1;
                    kotlin.jvm.functions.l lVar11 = new kotlin.jvm.functions.l() { // from class: androidx.navigation.compose.p
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj4) {
                            int i27 = i26;
                            a1 a1Var4 = a1Var3;
                            kotlin.jvm.functions.l lVar12 = lVar2;
                            kotlin.jvm.functions.l lVar13 = lVar4;
                            i iVar7 = iVar;
                            androidx.compose.animation.v vVar19 = (androidx.compose.animation.v) obj4;
                            switch (i27) {
                                case 0:
                                    androidx.navigation.t tVar5 = ((androidx.navigation.i) vVar19.c()).y;
                                    tVar5.getClass();
                                    h hVar4 = (h) tVar5;
                                    if (((Boolean) iVar7.c.getValue()).booleanValue() || ((Boolean) a1Var4.getValue()).booleanValue()) {
                                        int i28 = androidx.navigation.t.B;
                                        for (androidx.navigation.t tVar6 : androidx.navigation.f.b(hVar4)) {
                                        }
                                        return (androidx.compose.animation.x0) lVar13.invoke(vVar19);
                                    }
                                    int i29 = androidx.navigation.t.B;
                                    for (androidx.navigation.t tVar7 : androidx.navigation.f.b(hVar4)) {
                                    }
                                    return (androidx.compose.animation.x0) lVar12.invoke(vVar19);
                                default:
                                    androidx.navigation.t tVar8 = ((androidx.navigation.i) vVar19.b()).y;
                                    tVar8.getClass();
                                    h hVar5 = (h) tVar8;
                                    if (((Boolean) iVar7.c.getValue()).booleanValue() || ((Boolean) a1Var4.getValue()).booleanValue()) {
                                        int i210 = androidx.navigation.t.B;
                                        for (androidx.navigation.t tVar9 : androidx.navigation.f.b(hVar5)) {
                                        }
                                        return (androidx.compose.animation.y0) lVar13.invoke(vVar19);
                                    }
                                    int i30 = androidx.navigation.t.B;
                                    for (androidx.navigation.t tVar10 : androidx.navigation.f.b(hVar5)) {
                                    }
                                    return (androidx.compose.animation.y0) lVar12.invoke(vVar19);
                            }
                        }
                    };
                    sVar.l0(lVar11);
                    objQ8 = lVar11;
                }
                kotlin.jvm.functions.l lVar12 = (kotlin.jvm.functions.l) objQ8;
                boolean z6 = (i5 & 234881024) == 67108864 ? z3 : z2;
                Object objQ9 = sVar.Q();
                if (z6 || objQ9 == obj3) {
                    objQ9 = new androidx.compose.ui.text.y(27);
                    sVar.l0(objQ9);
                }
                kotlin.jvm.functions.l lVar13 = (kotlin.jvm.functions.l) objQ9;
                Boolean bool = Boolean.TRUE;
                boolean zH4 = sVar.h(iVar);
                Object objQ10 = sVar.Q();
                if (zH4 || objQ10 == obj3) {
                    objQ10 = new r0(7, w2Var, iVar);
                    sVar.l0(objQ10);
                }
                androidx.compose.runtime.l0.b(bool, (kotlin.jvm.functions.l) objQ10, sVar);
                Object objQ11 = sVar.Q();
                if (objQ11 == obj3) {
                    objQ11 = new h1(iVar6);
                    sVar.l0(objQ11);
                }
                h1 h1Var2 = (h1) objQ11;
                e2 e2VarD = i2.d(h1Var2, "entry", sVar, 56);
                if (((Boolean) a1Var3.getValue()).booleanValue()) {
                    sVar.b0(-1795016672);
                    Float fValueOf = Float.valueOf(f1Var.g());
                    boolean zF2 = sVar.f(a1Var) | sVar.h(h1Var2);
                    Object objQ12 = sVar.Q();
                    if (zF2 || objQ12 == obj3) {
                        dVar2 = null;
                        objQ12 = new androidx.compose.animation.b0(h1Var2, a1Var, f1Var, (kotlin.coroutines.d) null);
                        sVar.l0(objQ12);
                    } else {
                        dVar2 = null;
                    }
                    androidx.compose.runtime.l0.c(sVar, fValueOf, (kotlin.jvm.functions.p) objQ12);
                    sVar.p(false);
                    h1Var = h1Var2;
                    e2Var = e2VarD;
                    dVar = dVar2;
                } else {
                    w2Var = w2Var;
                    sVar.b0(-1794598265);
                    boolean zH5 = sVar.h(h1Var2) | sVar.h(iVar6) | sVar.f(e2VarD);
                    Object objQ13 = sVar.Q();
                    if (zH5 || objQ13 == obj3) {
                        h1Var = h1Var2;
                        e2Var = e2VarD;
                        dVar = null;
                        objQ13 = new androidx.compose.animation.core.f(h1Var, iVar6, e2Var, dVar, 5);
                        sVar.l0(objQ13);
                    } else {
                        h1Var = h1Var2;
                        e2Var = e2VarD;
                        dVar = null;
                    }
                    androidx.compose.runtime.l0.c(sVar, iVar6, (kotlin.jvm.functions.p) objQ13);
                    sVar.p(false);
                }
                boolean zH6 = sVar.h(e0Var2) | sVar.h(iVar) | sVar.f(lVar10) | sVar.f(lVar12) | sVar.f(lVar13);
                Object objQ14 = sVar.Q();
                if (zH6 || objQ14 == obj3) {
                    androidx.navigation.compose.i iVar7 = iVar;
                    objQ14 = new q(e0Var2, iVar7, lVar10, lVar12, lVar13, w2Var, a1Var3);
                    e0Var = e0Var2;
                    iVar2 = iVar7;
                    a1Var2 = a1Var3;
                    sVar.l0(objQ14);
                } else {
                    iVar2 = iVar;
                    e0Var = e0Var2;
                    a1Var2 = a1Var3;
                }
                kotlin.jvm.functions.l lVar14 = (kotlin.jvm.functions.l) objQ14;
                Object objQ15 = sVar.Q();
                if (objQ15 == obj3) {
                    i2 = 0;
                    objQ15 = new androidx.navigation.compose.r(i2);
                    sVar.l0(objQ15);
                } else {
                    i2 = 0;
                }
                w2 w2Var2 = w2Var;
                ?? r17 = i2;
                e2 e2Var2 = e2Var;
                androidx.compose.animation.m.a(e2Var2, rVar, lVar14, eVar, (kotlin.jvm.functions.l) objQ15, androidx.compose.runtime.internal.k.c(820763100, new androidx.navigation.compose.t(h1Var, iVar6, eVarF, a1Var2, w2Var2), sVar), sVar, ((i5 >> 3) & Token.ASSIGN_MOD) | 221184 | (i5 & 7168));
                ?? r18 = sVar;
                Object objN = e2Var2.a.n();
                Object value = e2Var2.d.getValue();
                boolean zF3 = r18.f(e2Var2) | r18.h(yVar) | r18.h(iVar6) | r18.h(iVar2) | r18.h(e0Var);
                Object objQ16 = r18.Q();
                if (zF3 || objQ16 == obj3) {
                    u uVar = new u(e2Var2, yVar, iVar6, e0Var, w2Var2, iVar2, null);
                    r18.l0(uVar);
                    objQ16 = uVar;
                }
                androidx.compose.runtime.l0.d(objN, value, (kotlin.jvm.functions.p) objQ16, r18);
                r18.p(r17);
                r14 = r17;
                r15 = r18;
            } else {
                r14 = 0;
                s sVar2 = sVar;
                dVar = null;
                sVar2.b0(-1789446406);
                sVar2.p(false);
                r15 = sVar2;
            }
            k0 k0VarB3 = l0Var4.b("dialog");
            if (k0VarB3 instanceof androidx.navigation.compose.n) {
                nVar = (androidx.navigation.compose.n) k0VarB3;
            } else {
                r0 = dVar;
            }
            if (r0 == 0) {
                s1 s1VarT2 = r15.t();
                if (s1VarT2 == null) {
                    r0 = nVar;
                    return;
                }
                r0 = nVar;
                final int i27 = 0;
                s1VarT2.d = new kotlin.jvm.functions.p() { // from class: androidx.navigation.compose.s
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj4, Object obj5) {
                        switch (i27) {
                            case 0:
                                ((Integer) obj5).getClass();
                                kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                                break;
                            case 1:
                                ((Integer) obj5).getClass();
                                kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                                break;
                            default:
                                ((Integer) obj5).getClass();
                                kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                return;
            }
            r0 = nVar;
            com.google.android.gms.dynamite.g.b(r0, r15, r14);
            r16 = r15;
        }
        s1 s1VarT3 = r16.t();
        if (s1VarT3 != null) {
            final int i28 = 1;
            s1VarT3.d = new kotlin.jvm.functions.p() { // from class: androidx.navigation.compose.s
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i28) {
                        case 0:
                            ((Integer) obj5).getClass();
                            kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                            break;
                        case 1:
                            ((Integer) obj5).getClass();
                            kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            kotlin.math.a.b(yVar, vVar, rVar, eVar, lVar, lVar2, lVar3, lVar4, (androidx.compose.runtime.s) obj4, androidx.compose.runtime.t.A(i | 1));
                            break;
                    }
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(y yVar, String str, androidx.compose.ui.r rVar, e eVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.l lVar5, s sVar, int i) {
        kotlin.jvm.functions.l lVar6;
        int i2;
        e eVar2;
        androidx.compose.ui.r rVar2;
        kotlin.jvm.functions.l lVar7;
        kotlin.jvm.functions.l lVar8;
        kotlin.jvm.functions.l lVar9;
        kotlin.jvm.functions.l lVar10;
        kotlin.jvm.functions.l lVar11;
        kotlin.jvm.functions.l lVar12;
        kotlin.jvm.functions.l lVar13;
        e eVar3;
        androidx.compose.ui.r rVar3;
        sVar.c0(1840250294);
        int i3 = i | (sVar.h(yVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | 844852608;
        char c = sVar.h(lVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i3) == 306783378 && (c & 3) == 2 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            eVar3 = eVar;
            lVar13 = lVar;
            lVar12 = lVar2;
            lVar11 = lVar3;
            lVar10 = lVar4;
        } else {
            sVar.Y();
            int i4 = i & 1;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (i4 == 0 || sVar.C()) {
                androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
                Object objQ = sVar.Q();
                if (objQ == fVar) {
                    objQ = new androidx.compose.ui.text.y(28);
                    sVar.l0(objQ);
                }
                kotlin.jvm.functions.l lVar14 = (kotlin.jvm.functions.l) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.ui.text.y(29);
                    sVar.l0(objQ2);
                }
                lVar6 = (kotlin.jvm.functions.l) objQ2;
                i2 = i3 & (-264241153);
                eVar2 = jVar;
                rVar2 = androidx.compose.ui.o.b;
                lVar7 = lVar14;
                lVar8 = lVar7;
                lVar9 = lVar6;
            } else {
                sVar.W();
                rVar2 = rVar;
                lVar6 = lVar2;
                lVar8 = lVar3;
                lVar9 = lVar4;
                i2 = i3 & (-264241153);
                eVar2 = eVar;
                lVar7 = lVar;
            }
            sVar.q();
            boolean z2 = ((i2 & Token.ASSIGN_MOD) == 32) | ((c & 14) == 4);
            Object objQ3 = sVar.Q();
            if (z2 || objQ3 == fVar) {
                w wVar = new w(yVar.b.t, str);
                lVar5.invoke(wVar);
                objQ3 = wVar.g();
                sVar.l0(objQ3);
            }
            kotlin.jvm.functions.l lVar15 = lVar9;
            e eVar4 = eVar2;
            kotlin.jvm.functions.l lVar16 = lVar6;
            b(yVar, (v) objQ3, rVar2, eVar4, lVar7, lVar16, lVar8, lVar15, sVar, (i2 & 8078) | 100884480);
            lVar10 = lVar15;
            lVar11 = lVar8;
            lVar12 = lVar16;
            lVar13 = lVar7;
            eVar3 = eVar4;
            rVar3 = rVar2;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.search.d(yVar, str, rVar3, eVar3, lVar13, lVar12, lVar11, lVar10, lVar5, i);
        }
    }

    public static final void d(final androidx.compose.foundation.text.selection.m mVar, final boolean z2, final androidx.compose.ui.text.style.j jVar, final boolean z3, long j, final float f, final androidx.compose.ui.r rVar, s sVar, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z4;
        sVar.c0(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(mVar) : sVar.h(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.d(jVar.ordinal()) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.g(z3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.f(rVar) ? 1048576 : 524288;
        }
        if (sVar.T(i2 & 1, (533651 & i2) != 533650)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                sVar.W();
                i3 = i2 & (-57345);
                j3 = j;
            }
            sVar.q();
            androidx.compose.ui.text.style.j jVar2 = androidx.compose.ui.text.style.j.y;
            androidx.compose.ui.text.style.j jVar3 = androidx.compose.ui.text.style.j.e;
            if (z2) {
                float f2 = j0.a;
                z4 = (jVar == jVar3 && !z3) || (jVar == jVar2 && z3);
            } else {
                float f3 = j0.a;
                z4 = !((jVar == jVar3 && !z3) || (jVar == jVar2 && z3));
            }
            androidx.compose.ui.g gVar = z4 ? androidx.compose.ui.a.b : androidx.compose.ui.a.a;
            int i4 = i3 & 14;
            boolean zG = (i4 == 4 || ((i3 & 8) != 0 && sVar.h(mVar))) | ((i3 & Token.ASSIGN_MOD) == 32) | sVar.g(z4);
            Object objQ = sVar.Q();
            if (zG || objQ == androidx.compose.runtime.n.a) {
                objQ = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.text.selection.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj;
                        long jA = mVar.a();
                        a0Var.b(j0.c, new i0(z2 ? androidx.compose.foundation.text.f0.y : androidx.compose.foundation.text.f0.z, jA, z4 ? h0.e : h0.z, (9223372034707292159L & jA) != 9205357640488583168L));
                        return kotlin.y.a;
                    }
                };
                sVar.l0(objQ);
            }
            final androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.q.a(rVar, false, (kotlin.jvm.functions.l) objQ);
            final q2 q2Var = (q2) sVar.j(l1.s);
            long j4 = j3;
            androidx.compose.ui.g gVar2 = gVar;
            j2 = j4;
            a(mVar, gVar2, androidx.compose.runtime.internal.k.c(1365123137, new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.c
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.appcompat.widget.r rVarA2 = l1.s.a(q2Var);
                        final long j5 = j2;
                        final boolean z5 = z4;
                        final androidx.compose.ui.r rVar2 = rVarA;
                        final m mVar2 = mVar;
                        androidx.compose.runtime.t.a(rVarA2, androidx.compose.runtime.internal.k.c(1260045569, new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.e
                            @Override // kotlin.jvm.functions.p
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z6 = z5;
                                    androidx.compose.ui.r rVar3 = rVar2;
                                    final m mVar3 = mVar2;
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                                    if (j6 != 9205357640488583168L) {
                                        sVar3.b0(3458246);
                                        androidx.compose.foundation.layout.t tVar = z6 ? androidx.compose.foundation.layout.b.b : androidx.compose.foundation.layout.b.a;
                                        androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.i1.l(rVar3, androidx.compose.ui.unit.h.b(j6), androidx.compose.ui.unit.h.a(j6), 0.0f, 0.0f, 12);
                                        androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(tVar, androidx.compose.ui.c.G, sVar3, 0);
                                        int iHashCode = Long.hashCode(sVar3.T);
                                        androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarL);
                                        androidx.compose.ui.node.h.b.getClass();
                                        androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                                        sVar3.e0();
                                        if (sVar3.S) {
                                            sVar3.k(fVar2);
                                        } else {
                                            sVar3.o0();
                                        }
                                        androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                                        androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                                        androidx.compose.runtime.t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                                        boolean zH = sVar3.h(mVar3);
                                        Object objQ2 = sVar3.Q();
                                        if (zH || objQ2 == fVar) {
                                            final int i5 = 0;
                                            objQ2 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f
                                                @Override // kotlin.jvm.functions.a
                                                public final Object invoke() {
                                                    switch (i5) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            sVar3.l0(objQ2);
                                        }
                                        kotlin.math.a.e(androidx.compose.ui.o.b, (kotlin.jvm.functions.a) objQ2, z6, sVar3, 6);
                                        sVar3.p(true);
                                        sVar3.p(false);
                                    } else {
                                        sVar3.b0(4389176);
                                        boolean zH2 = sVar3.h(mVar3);
                                        Object objQ3 = sVar3.Q();
                                        if (zH2 || objQ3 == fVar) {
                                            final int i6 = 1;
                                            objQ3 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.f
                                                @Override // kotlin.jvm.functions.a
                                                public final Object invoke() {
                                                    switch (i6) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            sVar3.l0(objQ3);
                                        }
                                        kotlin.math.a.e(rVar3, (kotlin.jvm.functions.a) objQ3, z6, sVar3, 0);
                                        sVar3.p(false);
                                    }
                                } else {
                                    sVar3.W();
                                }
                                return kotlin.y.a;
                            }
                        }, sVar2), sVar2, 56);
                    } else {
                        sVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, sVar), sVar, i4 | 384);
        } else {
            sVar.W();
            j2 = j;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            final long j5 = j2;
            s1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.text.selection.d
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kotlin.math.a.d(mVar, z2, jVar, z3, j5, f, rVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void e(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, boolean z2, s sVar, int i) {
        int i2;
        sVar.c0(2111672474);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (sVar.h(aVar) ? 32 : 16) | (sVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.layout.b.e(sVar, androidx.compose.ui.a.a(i1.n(rVar, j0.a, j0.b), new androidx.compose.foundation.text.selection.h(aVar, z2)));
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.text.selection.g(rVar, aVar, z2, i);
        }
    }

    public static final void f(com.google.firebase.platforminfo.d dVar, b bVar, o1 o1Var, androidx.compose.ui.input.indirect.a aVar, androidx.compose.foundation.gestures.a1 a1Var, long j) {
        float fIntBitsToFloat;
        ArrayList arrayList = a1Var.b;
        long j2 = bVar.c;
        boolean z2 = bVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        boolean z3 = bVar.h;
        if (!z3 && z2) {
            a1Var.a = 0;
            arrayList.clear();
        }
        if (!g(bVar) && (z3 || !z2)) {
            if (arrayList.size() == 3) {
                int i = a1Var.a;
                a1Var.a = i + 1;
                arrayList.set(i, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (a1Var.a == 3) {
                a1Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((b) arrayList.get(i2)).c >> 32))));
            }
            fIntBitsToFloat2 = (float) kotlin.collections.p.v(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((b) arrayList.get(i3)).c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) kotlin.collections.p.v(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (o1Var != null) {
            int i4 = aVar.a;
            if (i4 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i4 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = o1Var == o1.y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((androidx.compose.ui.input.pointer.util.b) dVar.e).a(bVar.b, androidx.compose.ui.geometry.b.e(jFloatToRawIntBits, j));
    }

    public static final boolean g(b bVar) {
        return bVar.h && !bVar.d;
    }

    public static IOException h(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException i(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return h(file, iOException);
        }
        if (!parentFile.exists()) {
            return h(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? h(file, iOException) : h(file, iOException);
            }
            return parentFile.canWrite() ? h(file, iOException) : h(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? h(file, iOException) : h(file, iOException);
        }
        return parentFile.canWrite() ? h(file, iOException) : h(file, iOException);
    }

    public static long[] j(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        _COROUTINE.a.m("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final androidx.compose.ui.graphics.g k(androidx.compose.ui.draw.d dVar, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        androidx.compose.ui.graphics.g gVarF = okhttp3.internal.platform.android.g.a;
        androidx.compose.ui.graphics.c cVarA = okhttp3.internal.platform.android.g.b;
        androidx.compose.ui.graphics.drawscope.b bVar = okhttp3.internal.platform.android.g.c;
        if (gVarF == null || cVarA == null) {
            gVarF = a0.f(iCeil, iCeil, 1);
            okhttp3.internal.platform.android.g.a = gVarF;
            cVarA = a0.a(gVarF);
            okhttp3.internal.platform.android.g.b = cVarA;
        } else {
            Bitmap bitmap = gVarF.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                gVarF = a0.f(iCeil, iCeil, 1);
                okhttp3.internal.platform.android.g.a = gVarF;
                cVarA = a0.a(gVarF);
                okhttp3.internal.platform.android.g.b = cVarA;
            }
        }
        androidx.compose.ui.graphics.g gVar = gVarF;
        androidx.compose.ui.graphics.c cVar = cVarA;
        if (bVar == null) {
            bVar = new androidx.compose.ui.graphics.drawscope.b();
            okhttp3.internal.platform.android.g.c = bVar;
        }
        androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
        androidx.compose.ui.graphics.drawscope.a aVar = bVar2.e;
        androidx.compose.ui.unit.m layoutDirection = dVar.e.getLayoutDirection();
        Bitmap bitmap2 = gVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        androidx.compose.ui.unit.c cVar2 = aVar.a;
        androidx.compose.ui.unit.m mVar = aVar.b;
        androidx.compose.ui.graphics.r rVar = aVar.c;
        long j = aVar.d;
        aVar.a = dVar;
        aVar.b = layoutDirection;
        aVar.c = cVar;
        aVar.d = jFloatToRawIntBits;
        cVar.f();
        androidx.compose.ui.graphics.drawscope.d.G(bVar2, androidx.compose.ui.graphics.t.b, 0L, bVar2.d(), 0.0f, 58);
        androidx.compose.ui.graphics.drawscope.d.G(bVar2, a0.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, 120);
        androidx.compose.ui.graphics.drawscope.d.S(bVar2, a0.d(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        cVar.q();
        aVar.a = cVar2;
        aVar.b = mVar;
        aVar.c = rVar;
        aVar.d = j;
        return gVar;
    }

    public static int n(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    public static final boolean o(long j, long j2) {
        return j == j2;
    }

    public static final Rect p(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        androidx.compose.ui.platform.coreshims.b.q(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.b.q(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final f q() {
        f fVar = z;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(16.5f, 3.0f);
        gVarJ.n(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        gVarJ.m(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        gVarJ.m(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        gVarJ.n(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        gVarJ.t(12.0f, 21.35f);
        gVarJ.u(1.45f, -1.32f);
        gVarJ.m(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        gVarJ.m(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        gVarJ.l();
        gVarJ.v(12.1f, 18.55f);
        gVarJ.u(-0.1f, 0.1f);
        gVarJ.u(-0.1f, -0.1f);
        gVarJ.m(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        gVarJ.m(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        gVarJ.n(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        gVarJ.s(1.87f);
        gVarJ.m(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        gVarJ.n(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        gVarJ.n(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        f fVarB = eVar.b();
        z = fVarB;
        return fVarB;
    }

    public static androidx.concurrent.futures.l s(androidx.concurrent.futures.j jVar) {
        androidx.concurrent.futures.i iVar = new androidx.concurrent.futures.i();
        iVar.c = new androidx.concurrent.futures.n();
        androidx.concurrent.futures.l lVar = new androidx.concurrent.futures.l(iVar);
        iVar.b = lVar;
        iVar.a = jVar.getClass();
        try {
            Object objB = jVar.b(iVar);
            if (objB == null) {
                return lVar;
            }
            iVar.a = objB;
            return lVar;
        } catch (Exception e2) {
            lVar.y.m(e2);
            return lVar;
        }
    }

    public static final f t() {
        f fVar = B;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 12.0f);
        gVarJ.n(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        gVarJ.x(-1.79f, -4.0f, -4.0f, -4.0f);
        gVarJ.x(-4.0f, 1.79f, -4.0f, 4.0f);
        gVarJ.x(1.79f, 4.0f, 4.0f, 4.0f);
        gVarJ.l();
        gVarJ.v(12.0f, 14.0f);
        gVarJ.n(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        gVarJ.A(2.0f);
        gVarJ.s(16.0f);
        gVarJ.A(-2.0f);
        gVarJ.n(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        f fVarB = eVar.b();
        B = fVarB;
        return fVarB;
    }

    public static void u(Exception exc, String str) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            kotlinx.coroutines.future.a.l(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int v(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return androidx.tracing.a.c();
        }
        try {
            if (F == null) {
                E = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                F = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) F.invoke(null, Long.valueOf(E))).booleanValue();
        } catch (Exception e2) {
            u(e2, "isTagEnabled");
            return false;
        }
    }

    public static boolean y(ByteBuffer byteBuffer, int i, int i2) {
        a aVar = o2.a;
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        int i5 = (i4 - i) + i;
        while (i5 < i2) {
            int i6 = i5 + 1;
            byte b = byteBuffer.get(i5);
            if (b >= 0) {
                i5 = i6;
            } else if (b < -32) {
                if (i6 >= i2 || b < -62 || byteBuffer.get(i6) > -65) {
                    return false;
                }
                i5 += 2;
            } else if (b < -16) {
                if (i6 >= i2 - 1) {
                    return false;
                }
                int i7 = i5 + 2;
                byte b2 = byteBuffer.get(i6);
                if (b2 > -65) {
                    return false;
                }
                if (b == -32 && b2 < -96) {
                    return false;
                }
                if ((b == -19 && b2 >= -96) || byteBuffer.get(i7) > -65) {
                    return false;
                }
                i5 += 3;
            } else {
                if (i6 >= i2 - 2) {
                    return false;
                }
                int i8 = i5 + 2;
                byte b3 = byteBuffer.get(i6);
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return false;
                }
                int i9 = i5 + 3;
                if (byteBuffer.get(i8) > -65) {
                    return false;
                }
                i5 += 4;
                if (byteBuffer.get(i9) > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public abstract boolean A(char c);

    public abstract void K(boolean z2);

    public abstract void N(boolean z2);

    @Override // com.google.common.base.g
    /* JADX INFO: renamed from: apply */
    public boolean mo13apply(Object obj) {
        return A(((Character) obj).charValue());
    }

    public abstract String l(byte[] bArr, int i, int i2);

    public abstract int m(String str, byte[] bArr, int i, int i2);

    public abstract InputFilter[] r(InputFilter[] inputFilterArr);

    public abstract boolean x(byte[] bArr, int i, int i2);

    public boolean z(ByteBuffer byteBuffer, int i, int i2) {
        return y(byteBuffer, i, i2);
    }
}
