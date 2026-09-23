package okio;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Closeable {
    public static final t e;
    public static final x y;

    static {
        t tVar;
        try {
            Class.forName("j$.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        e = tVar;
        String str = x.y;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        y = com.google.android.gms.measurement.internal.b0.d(property);
        ClassLoader classLoader = okio.internal.h.class.getClassLoader();
        classLoader.getClass();
        new okio.internal.h(classLoader);
    }

    public abstract void A(x xVar);

    public final void L(x xVar) {
        xVar.getClass();
        A(xVar);
    }

    public final boolean N(x xVar) {
        xVar.getClass();
        return Z(xVar) != null;
    }

    public abstract List X(x xVar);

    public final androidx.constraintlayout.core.widgets.analyzer.e Y(x xVar) throws FileNotFoundException {
        xVar.getClass();
        androidx.constraintlayout.core.widgets.analyzer.e eVarZ = Z(xVar);
        if (eVarZ != null) {
            return eVarZ;
        }
        kotlinx.coroutines.future.a.v(xVar, "no such file: ");
        return null;
    }

    public abstract androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar);

    public abstract f0 a(x xVar);

    public abstract s a0(x xVar);

    public abstract f0 b0(x xVar, boolean z);

    public abstract h0 c0(x xVar);

    public abstract void g(x xVar, x xVar2);

    public final void n(x xVar) {
        kotlin.collections.l lVar = new kotlin.collections.l();
        while (xVar != null && !N(xVar)) {
            lVar.addFirst(xVar);
            xVar = xVar.e();
        }
        Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            x((x) it.next());
        }
    }

    public abstract void x(x xVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
