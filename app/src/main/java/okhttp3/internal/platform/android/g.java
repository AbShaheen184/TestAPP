package okhttp3.internal.platform.android;

import android.text.Spanned;
import androidx.compose.animation.core.x;
import androidx.compose.animation.g1;
import androidx.compose.runtime.changelist.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.snapshots.u;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.a0;
import androidx.compose.ui.graphics.vector.v;
import androidx.compose.ui.platform.l1;
import androidx.datastore.core.h0;
import androidx.media3.common.util.i0;
import androidx.room.b0;
import androidx.room.t;
import coil3.network.q;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;
import kotlin.collections.c0;
import kotlin.jvm.functions.p;
import kotlin.text.r;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okio.z;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static androidx.compose.ui.graphics.g a;
    public static androidx.compose.ui.graphics.c b;
    public static androidx.compose.ui.graphics.drawscope.b c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static androidx.compose.ui.graphics.vector.f i;
    public static androidx.compose.ui.graphics.vector.f j;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static final String A(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static void B(q qVar, z zVar) {
        zVar.S(qVar.a);
        zVar.writeByte(10);
        zVar.S(qVar.b);
        zVar.writeByte(10);
        zVar.S(qVar.c);
        zVar.writeByte(10);
        Set<Map.Entry> setEntrySet = qVar.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        zVar.S(size);
        zVar.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                zVar.y((String) entry.getKey());
                zVar.y(":");
                zVar.y(str);
                zVar.writeByte(10);
            }
        }
    }

    public static String C(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(D(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(D(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String D(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM = androidx.compose.runtime.j.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strM.length() + 8 + name2.length() + 1);
            b0.i(sb, "<", strM, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final void a(boolean z, p pVar, s sVar, int i2) {
        sVar.c0(1818896922);
        int i3 = (sVar.g(z) ? 4 : 2) | i2 | (sVar.h(pVar) ? 32 : 16);
        if ((i3 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            t.b(z, pVar, sVar, i3 & Token.ELSE);
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.activity.compose.i(z, pVar, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(File file, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) throws IOException {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i2 = h0Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.z = i2 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(cVar);
            }
        } else {
            h0Var = new h0(cVar);
        }
        Object obj = h0Var.y;
        int i3 = h0Var.z;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = h0Var.e;
                kotlin.a.e(obj);
                return obj;
            }
            kotlin.a.e(obj);
            h0Var.e = file;
            h0Var.z = 1;
            Object objInvoke = lVar.invoke(h0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (IOException e2) {
            if (e2 instanceof androidx.datastore.core.b) {
                throw e2;
            }
            file.getClass();
            if (!file.exists()) {
                throw kotlin.math.a.i(file, e2);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw kotlin.math.a.i(file, e2);
                    }
                    throw kotlin.math.a.i(file, e2);
                }
                if (file.canWrite()) {
                    throw kotlin.math.a.i(file, e2);
                }
                throw kotlin.math.a.i(file, e2);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw kotlin.math.a.i(file, e2);
                }
                throw kotlin.math.a.i(file, e2);
            }
            if (file.canWrite()) {
                throw kotlin.math.a.i(file, e2);
            }
            throw kotlin.math.a.i(file, e2);
        }
    }

    public static final Object c(ListenableFuture listenableFuture, kotlin.coroutines.jvm.internal.i iVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return androidx.concurrent.futures.h.i(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(iVar), 1);
            cancellableContinuationImpl.initCancellability();
            listenableFuture.a(new androidx.concurrent.futures.o(listenableFuture, cancellableContinuationImpl), androidx.concurrent.futures.m.e);
            cancellableContinuationImpl.invokeOnCancellation(new androidx.compose.animation.e(listenableFuture, 26));
            return cancellableContinuationImpl.getResult();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static byte d(long j2) {
        _COROUTINE.a.m("out of range: %s", j2, (j2 >> 8) == 0);
        return (byte) j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final void f(androidx.sqlite.a aVar) {
        aVar.getClass();
        kotlin.collections.builders.b bVarG = kotlin.collections.q.g();
        androidx.sqlite.c cVarU = aVar.U("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarU.Q()) {
            try {
                bVarG.add(cVarU.F(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.collections.q.e(cVarU, th);
                    throw th2;
                }
            }
        }
        kotlin.collections.q.e(cVarU, null);
        ListIterator listIterator = kotlin.collections.q.c(bVarG).listIterator(0);
        while (true) {
            u uVar = (u) listIterator;
            if (!uVar.hasNext()) {
                return;
            }
            String str = (String) uVar.next();
            if (r.u(str, "room_fts_content_sync_", false)) {
                t1.t(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static androidx.compose.foundation.gestures.l h(s sVar) {
        float f2 = g1.a;
        androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) sVar.j(l1.h);
        boolean zC = sVar.c(cVar.a());
        Object objQ = sVar.Q();
        Object obj = androidx.compose.runtime.n.a;
        if (zC || objQ == obj) {
            objQ = new x(new com.app.mlounge.data.music.e(cVar));
            sVar.l0(objQ);
        }
        x xVar = (x) objQ;
        boolean zF = sVar.f(xVar);
        Object objQ2 = sVar.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new androidx.compose.foundation.gestures.l(xVar);
            sVar.l0(objQ2);
        }
        return (androidx.compose.foundation.gestures.l) objQ2;
    }

    public static final androidx.compose.ui.graphics.vector.f i() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(7.0f, 10.0f));
        arrayList.add(new v(5.0f, 5.0f));
        arrayList.add(new v(5.0f, -5.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final kotlin.coroutines.j j(androidx.room.r rVar, boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.room.x xVar = (androidx.room.x) cVar.getContext().get(androidx.room.x.y);
        kotlin.coroutines.j jVar = xVar != null ? xVar.e : null;
        if (!rVar.k()) {
            CoroutineScope coroutineScope = rVar.a;
            if (coroutineScope == null) {
                kotlin.jvm.internal.l.f("coroutineScope");
                throw null;
            }
            kotlin.coroutines.j coroutineContext = coroutineScope.getCoroutineContext();
            if (jVar == null) {
                jVar = kotlin.coroutines.k.e;
            }
            return coroutineContext.plus(jVar);
        }
        if (jVar != null) {
            CoroutineScope coroutineScope2 = rVar.a;
            if (coroutineScope2 != null) {
                return coroutineScope2.getCoroutineContext().plus(jVar);
            }
            kotlin.jvm.internal.l.f("coroutineScope");
            throw null;
        }
        if (z) {
            kotlin.coroutines.j jVar2 = rVar.b;
            if (jVar2 != null) {
                return jVar2;
            }
            kotlin.jvm.internal.l.f("transactionContext");
            throw null;
        }
        CoroutineScope coroutineScope3 = rVar.a;
        if (coroutineScope3 != null) {
            return coroutineScope3.getCoroutineContext();
        }
        kotlin.jvm.internal.l.f("coroutineScope");
        throw null;
    }

    public static final androidx.compose.ui.graphics.vector.f k() {
        androidx.compose.ui.graphics.vector.f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(6.0f, 19.0f);
        gVarJ.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gVarJ.s(8.0f);
        gVarJ.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gVarJ.z(7.0f);
        gVarJ.r(6.0f);
        gVarJ.A(12.0f);
        gVarJ.l();
        gVarJ.v(19.0f, 4.0f);
        gVarJ.s(-3.5f);
        gVarJ.u(-1.0f, -1.0f);
        gVarJ.s(-5.0f);
        gVarJ.u(-1.0f, 1.0f);
        gVarJ.r(5.0f);
        gVarJ.A(2.0f);
        gVarJ.s(14.0f);
        gVarJ.z(4.0f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f l() {
        androidx.compose.ui.graphics.vector.f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(12.0f, 21.35f);
        gVar.u(-1.45f, -1.32f);
        gVar.m(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        gVar.m(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        gVar.n(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        gVar.m(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        gVar.m(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        gVar.n(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        gVar.t(12.0f, 21.35f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f m() {
        androidx.compose.ui.graphics.vector.f fVar = g;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Link", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(3.9f, 12.0f);
        gVarJ.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        gVarJ.s(4.0f);
        gVarJ.t(11.0f, 7.0f);
        gVarJ.t(7.0f, 7.0f);
        gVarJ.n(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        gVarJ.x(2.24f, 5.0f, 5.0f, 5.0f);
        gVarJ.s(4.0f);
        gVarJ.A(-1.9f);
        gVarJ.t(7.0f, 15.1f);
        gVarJ.n(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        gVarJ.l();
        gVarJ.v(8.0f, 13.0f);
        gVarJ.s(8.0f);
        gVarJ.A(-2.0f);
        gVarJ.t(8.0f, 11.0f);
        gVarJ.A(2.0f);
        gVarJ.l();
        gVarJ.v(17.0f, 7.0f);
        gVarJ.s(-4.0f);
        gVarJ.A(1.9f);
        gVarJ.s(4.0f);
        gVarJ.n(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        gVarJ.x(-1.39f, 3.1f, -3.1f, 3.1f);
        gVarJ.s(-4.0f);
        gVarJ.t(13.0f, 17.0f);
        gVarJ.s(4.0f);
        gVarJ.n(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        gVarJ.x(-2.24f, -5.0f, -5.0f, -5.0f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        g = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f n() {
        androidx.compose.ui.graphics.vector.f fVar = h;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(8.0f, 5.0f));
        arrayList.add(new a0(14.0f));
        arrayList.add(new v(11.0f, -7.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        h = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = i;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SportsEsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(21.58f, 16.09f);
        gVar.u(-1.09f, -7.66f);
        gVar.m(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        gVar.r(7.47f);
        gVar.m(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        gVar.u(-1.09f, 7.66f);
        gVar.m(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        gVar.s(0.0f);
        gVar.n(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
        gVar.t(9.0f, 16.0f);
        gVar.s(6.0f);
        gVar.u(2.25f, 2.25f);
        gVar.n(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        gVar.s(0.0f);
        gVar.m(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        gVar.l();
        gVar.v(11.0f, 11.0f);
        gVar.r(9.0f);
        gVar.A(2.0f);
        gVar.r(8.0f);
        gVar.A(-2.0f);
        gVar.r(6.0f);
        gVar.A(-1.0f);
        gVar.s(2.0f);
        gVar.z(8.0f);
        gVar.s(1.0f);
        gVar.A(2.0f);
        gVar.s(2.0f);
        gVar.z(11.0f);
        gVar.l();
        gVar.v(15.0f, 10.0f);
        gVar.n(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        gVar.n(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gVar.x(1.0f, 0.45f, 1.0f, 1.0f);
        gVar.m(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        gVar.l();
        gVar.v(17.0f, 13.0f);
        gVar.n(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        gVar.n(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        gVar.x(1.0f, 0.45f, 1.0f, 1.0f);
        gVar.m(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        i = fVarB;
        return fVarB;
    }

    public static final boolean p(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int q(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i2, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final long r(float f2, long j2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : androidx.compose.ui.graphics.t.b(androidx.compose.ui.graphics.t.d(j2) * f2, j2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList s(androidx.media3.common.util.v vVar) {
        char c2;
        ArrayList arrayList;
        boolean z;
        int i2;
        Object eVar;
        androidx.media3.common.util.v vVar2 = vVar;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (vVar2.z() == 0) {
            char c3 = 7;
            vVar2.N(7);
            int iM = vVar2.m();
            boolean z2 = true;
            if (iM == 1684433976) {
                androidx.media3.common.util.v vVar3 = new androidx.media3.common.util.v();
                Inflater inflater = new Inflater(true);
                try {
                    if (!i0.J(vVar2, vVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    vVar2 = vVar3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i3 = vVar2.b;
            int i4 = vVar2.c;
            while (i3 < i4) {
                int iM2 = vVar2.m() + i3;
                if (iM2 > i3 && iM2 <= i4) {
                    if (vVar2.m() == 1835365224) {
                        int iM3 = vVar2.m();
                        if (iM3 > 10000) {
                            c2 = c3;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i2 = i4;
                            eVar = arrayList4;
                        } else {
                            float[] fArr = new float[iM3];
                            for (int i5 = 0; i5 < iM3; i5++) {
                                fArr[i5] = Float.intBitsToFloat(vVar2.m());
                            }
                            int iM4 = vVar2.m();
                            if (iM4 > 32000) {
                                c2 = c3;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i2 = i4;
                                eVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = vVar2.a;
                                androidx.media3.common.util.u uVar = new androidx.media3.common.util.u(bArr, bArr.length);
                                uVar.m(vVar2.b * 8);
                                float[] fArr2 = new float[iM4 * 5];
                                int i6 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i7 < iM4) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i6) {
                                                int i10 = iArr[i9];
                                                int iG = uVar.g(iCeil);
                                                int i11 = ((iG >> 1) ^ (-(iG & 1))) + i10;
                                                if (i11 < iM3 && i11 >= 0) {
                                                    fArr2[i8] = fArr[i11];
                                                    iArr[i9] = i11;
                                                    i9++;
                                                    i8++;
                                                    i6 = 5;
                                                }
                                            } else {
                                                i7++;
                                                i6 = 5;
                                            }
                                        }
                                    } else {
                                        uVar.m((uVar.e() + 7) & (-8));
                                        int i12 = 32;
                                        int iG2 = uVar.g(32);
                                        androidx.compose.ui.text.android.selection.e[] eVarArr = new androidx.compose.ui.text.android.selection.e[iG2];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < iG2) {
                                                int iG3 = uVar.g(8);
                                                int iG4 = uVar.g(8);
                                                int iG5 = uVar.g(i12);
                                                if (iG5 <= 128000) {
                                                    int i14 = iG2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG5 * 3];
                                                    float[] fArr5 = new float[iG5 * 2];
                                                    i2 = i4;
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i15 < iG5) {
                                                            int iG6 = uVar.g(iCeil2);
                                                            androidx.media3.common.util.u uVar2 = uVar;
                                                            int i17 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i16;
                                                            if (i17 >= 0 && i17 < iM4) {
                                                                int i18 = i15 * 3;
                                                                int i19 = i17 * 5;
                                                                fArr4[i18] = fArr3[i19];
                                                                fArr4[i18 + 1] = fArr3[i19 + 1];
                                                                fArr4[i18 + 2] = fArr3[i19 + 2];
                                                                int i20 = i15 * 2;
                                                                fArr5[i20] = fArr3[i19 + 3];
                                                                fArr5[i20 + 1] = fArr3[i19 + 4];
                                                                i15++;
                                                                i16 = i17;
                                                                uVar = uVar2;
                                                            }
                                                        } else {
                                                            eVarArr[i13] = new androidx.compose.ui.text.android.selection.e(iG3, iG4, fArr4, fArr5);
                                                            i13++;
                                                            iG2 = i14;
                                                            fArr2 = fArr3;
                                                            i4 = i2;
                                                            uVar = uVar;
                                                            i12 = 32;
                                                        }
                                                    }
                                                }
                                                eVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i2 = i4;
                                                eVar = new androidx.media3.exoplayer.video.spherical.e(eVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i2 = i4;
                                    eVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (eVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(eVar);
                    } else {
                        c2 = c3;
                        arrayList = arrayList2;
                        z = z2;
                        i2 = i4;
                    }
                    vVar2.M(iM2);
                    i3 = iM2;
                    c3 = c2;
                    z2 = z;
                    arrayList2 = arrayList;
                    i4 = i2;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static final Object t(androidx.room.r rVar, boolean z, boolean z2, kotlin.jvm.functions.l lVar) {
        rVar.getClass();
        ThreadLocal threadLocal = rVar.i;
        rVar.a();
        if (rVar.k() && !rVar.l()) {
            kotlin.coroutines.j jVar = (kotlin.coroutines.j) threadLocal.get();
            if ((jVar != null ? (androidx.room.x) jVar.get(androidx.room.x.y) : null) != null) {
                kotlinx.coroutines.future.a.u("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        kotlin.coroutines.j jVar2 = (kotlin.coroutines.j) threadLocal.get();
        if (jVar2 == null) {
            jVar2 = kotlin.coroutines.k.e;
        }
        return kotlin.math.a.J(new androidx.room.util.d(jVar2, rVar, z2, z, lVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object u(androidx.room.r rVar, boolean z, boolean z2, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        androidx.room.util.e eVar;
        androidx.room.r rVar2;
        boolean z3;
        boolean z4;
        kotlin.jvm.functions.l lVar2;
        if (dVar instanceof androidx.room.util.e) {
            eVar = (androidx.room.util.e) dVar;
            int i2 = eVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.C = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new androidx.room.util.e(dVar);
            }
        } else {
            eVar = new androidx.room.util.e(dVar);
        }
        androidx.room.util.e eVar2 = eVar;
        Object obj = eVar2.B;
        int i3 = eVar2.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i3 == 0) {
            kotlin.a.e(obj);
            if (rVar.k() && rVar.n() && rVar.l()) {
                androidx.room.util.b bVar = new androidx.room.util.b(z2, z, rVar, null, lVar, 1);
                eVar2.C = 1;
                Object objQ = rVar.q(z, bVar, eVar2);
                if (objQ != aVar) {
                    return objQ;
                }
            } else {
                eVar2.e = rVar;
                eVar2.y = lVar;
                eVar2.z = z;
                eVar2.A = z2;
                eVar2.C = 2;
                kotlin.coroutines.j jVarJ = j(rVar, z2, eVar2);
                if (jVarJ != aVar) {
                    rVar2 = rVar;
                    z3 = z;
                    obj = jVarJ;
                    z4 = z2;
                    lVar2 = lVar;
                }
            }
        }
        if (i3 == 1) {
            kotlin.a.e(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                kotlin.a.e(obj);
                return obj;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = eVar2.A;
        boolean z6 = eVar2.z;
        kotlin.jvm.functions.l lVar3 = eVar2.y;
        androidx.room.r rVar3 = eVar2.e;
        kotlin.a.e(obj);
        z4 = z5;
        z3 = z6;
        lVar2 = lVar3;
        rVar2 = rVar3;
        androidx.room.util.c cVar = new androidx.room.util.c((kotlin.coroutines.d) null, rVar2, z3, z4, lVar2);
        eVar2.e = null;
        eVar2.y = null;
        eVar2.C = 3;
        Object objWithContext = BuildersKt.withContext((kotlin.coroutines.j) obj, cVar, eVar2);
        return objWithContext == aVar ? aVar : objWithContext;
    }

    public static q v(okio.b0 b0Var) {
        int i2 = Integer.parseInt(b0Var.t(Long.MAX_VALUE));
        long j2 = Long.parseLong(b0Var.t(Long.MAX_VALUE));
        long j3 = Long.parseLong(b0Var.t(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(b0Var.t(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strT = b0Var.t(Long.MAX_VALUE);
            int iG = kotlin.text.k.G(strT, ':', 0, 6);
            if (iG == -1) {
                kotlinx.coroutines.future.a.s("Unexpected header: ".concat(strT));
                return null;
            }
            String string = kotlin.text.k.g0(strT.substring(0, iG)).toString();
            String strSubstring = strT.substring(iG + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new q(i2, j2, j3, new coil3.network.o(c0.o(linkedHashMap)), null, null);
    }

    public static final void w(l0 l0Var, int i2, Object obj) {
        l0Var.p[(l0Var.q - l0Var.l[l0Var.m - 1].b) + i2] = obj;
    }

    public static final void x(l0 l0Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = l0Var.q - l0Var.l[l0Var.m - 1].b;
        Object[] objArr = l0Var.p;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static boolean y(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String z(Object obj) {
        com.grack.nanojson.e eVar = new com.grack.nanojson.e();
        eVar.o(obj);
        return eVar.b();
    }
}
