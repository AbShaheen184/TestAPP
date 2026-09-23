package androidx.compose.runtime;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.StatFs;
import com.app.mlounge.emulator.EmulatorRenderer;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ c0(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.h] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        Class<?> returnType;
        int i = this.e;
        int i2 = 1;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                u.b("Unexpected call to default provider");
                throw new androidx.compose.ui.res.e(10);
            case 1:
                x2 x2Var = androidx.compose.runtime.retain.b.a;
                return androidx.compose.runtime.retain.a.e;
            case 2:
                return new androidx.compose.runtime.saveable.e(new LinkedHashMap());
            case 3:
                x2 x2Var2 = androidx.compose.runtime.saveable.i.a;
                return null;
            case 4:
                x2 x2Var3 = androidx.compose.runtime.tooling.e.a;
                return null;
            case 5:
                x2 x2Var4 = androidx.compose.runtime.tooling.g.a;
                return null;
            case 6:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 7:
                d0 d0Var = androidx.lifecycle.viewmodel.compose.a.a;
                return null;
            case 8:
                return new androidx.lifecycle.p0();
            case 9:
                androidx.collection.internal.b bVar = new androidx.collection.internal.b(1);
                bVar.d(kotlin.jvm.internal.a0.a(androidx.navigation.internal.b.class), new androidx.navigation.compose.r(i2));
                return bVar.f();
            case 10:
                d0 d0Var2 = androidx.navigationevent.compose.a.a;
                return null;
            case 11:
                return yVar;
            case 12:
                return Boolean.TRUE;
            case 13:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 14:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 15:
                try {
                    Method method = (Method) androidx.sqlite.db.framework.b.A.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 16:
                return new androidx.work.impl.model.f(0);
            case 17:
                x2 x2Var5 = coil3.compose.r.a;
                return coil3.compose.b.a;
            case 18:
                return coil3.compose.m.a;
            case 19:
                okio.t tVar = okio.k.e;
                okio.x xVarG = okio.k.y.g("coil3_disk_cache");
                long jE = 10485760;
                try {
                    File file = xVarG.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jE = kotlin.collections.i0.e((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused3) {
                }
                return new coil3.disk.g(jE, tVar, xVarG);
            case 20:
                return coil3.network.c.a;
            case 21:
                return coil3.network.s.a;
            case 22:
                return new coil3.network.okhttp.internal.b(new okhttp3.y());
            case 23:
                try {
                    return android.support.v4.media.session.b.I(kotlin.sequences.k.O(kotlin.sequences.k.K(Arrays.asList(new coil3.network.okhttp.internal.f()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 24:
                try {
                    return android.support.v4.media.session.b.I(kotlin.sequences.k.O(kotlin.sequences.k.K(Arrays.asList(new coil3.svg.internal.b()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 25:
                return Integer.valueOf(EmulatorRenderer._init_$lambda$0());
            case 26:
                return kotlin.y.a;
            case 28:
                Object obj = com.app.mlounge.ui.screens.player.k0.a;
            case 27:
                return yVar;
            default:
                return Float.valueOf(1.0f);
        }
    }
}
