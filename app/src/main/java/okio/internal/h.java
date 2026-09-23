package okio.internal;

import com.google.android.gms.measurement.internal.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.r;
import kotlin.o;
import okio.f0;
import okio.h0;
import okio.s;
import okio.t;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends okio.k {
    public static final x C;
    public final okio.k A;
    public final o B;
    public final ClassLoader z;

    static {
        String str = x.y;
        C = b0.d("/");
    }

    public h(ClassLoader classLoader) {
        t tVar = okio.k.e;
        tVar.getClass();
        this.z = classLoader;
        this.A = tVar;
        this.B = new o(new okhttp3.internal.http2.j(this, 4));
    }

    @Override // okio.k
    public final void A(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final List X(x xVar) throws FileNotFoundException {
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (kotlin.k kVar : (List) this.B.getValue()) {
            okio.k kVar2 = (okio.k) kVar.e;
            x xVar3 = (x) kVar.y;
            try {
                List listX = kVar2.X(xVar3.g(strU));
                ArrayList<x> arrayList = new ArrayList();
                for (Object obj : listX) {
                    if (g.b((x) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
                for (x xVar4 : arrayList) {
                    xVar4.getClass();
                    String strReplace = kotlin.text.k.P(xVar4.e.u(), xVar3.e.u()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(xVar2.g(strReplace));
                }
                p.t(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return p.b0(linkedHashSet);
        }
        kotlinx.coroutines.future.a.v(xVar, "file not found: ");
        return null;
    }

    @Override // okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) {
        xVar.getClass();
        if (!g.b(xVar)) {
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        for (kotlin.k kVar : (List) this.B.getValue()) {
            androidx.constraintlayout.core.widgets.analyzer.e eVarZ = ((okio.k) kVar.e).Z(((x) kVar.y).g(strU));
            if (eVarZ != null) {
                return eVarZ;
            }
        }
        return null;
    }

    @Override // okio.k
    public final f0 a(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final s a0(x xVar) throws FileNotFoundException {
        if (!g.b(xVar)) {
            kotlinx.coroutines.future.a.v(xVar, "file not found: ");
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        for (kotlin.k kVar : (List) this.B.getValue()) {
            try {
                return ((okio.k) kVar.e).a0(((x) kVar.y).g(strU));
            } catch (FileNotFoundException unused) {
            }
        }
        kotlinx.coroutines.future.a.v(xVar, "file not found: ");
        return null;
    }

    @Override // okio.k
    public final f0 b0(x xVar, boolean z) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final h0 c0(x xVar) throws IOException {
        xVar.getClass();
        if (!g.b(xVar)) {
            kotlinx.coroutines.future.a.v(xVar, "file not found: ");
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        URL resource = this.z.getResource(c.b(xVar2, xVar, false).f(xVar2).e.u());
        if (resource == null) {
            kotlinx.coroutines.future.a.v(xVar, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return okio.b.e(inputStream);
    }

    @Override // okio.k
    public final void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final void x(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }
}
