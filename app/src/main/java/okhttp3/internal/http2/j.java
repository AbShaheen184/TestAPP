package okhttp3.internal.http2;

import com.app.mlounge.ui.viewmodel.q0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ j(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() throws IOException {
        int iL;
        kotlin.k kVar;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        Object obj = this.y;
        switch (i) {
            case 0:
                p pVar = (p) obj;
                pVar.getClass();
                try {
                    pVar.U.L(2, 0, false);
                    break;
                } catch (IOException e) {
                    b bVar = b.PROTOCOL_ERROR;
                    pVar.a(bVar, bVar, e);
                }
                return yVar;
            case 1:
                okhttp3.internal.e.b((okhttp3.internal.ws.h) obj);
                return yVar;
            case 2:
                okhttp3.internal.e.b((Closeable) ((kotlin.jvm.internal.z) obj).e);
                return yVar;
            case 3:
                okhttp3.internal.connection.m mVar = ((okhttp3.internal.ws.e) obj).h;
                mVar.getClass();
                mVar.cancel();
                return yVar;
            default:
                okio.internal.h hVar = (okio.internal.h) obj;
                ClassLoader classLoader = hVar.z;
                okio.k kVar2 = hVar.A;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    kotlin.k kVar3 = null;
                    if (!it.hasNext()) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        resources2.getClass();
                        ArrayList<URL> list2 = Collections.list(resources2);
                        list2.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (URL url : list2) {
                            url.getClass();
                            String string = url.toString();
                            string.getClass();
                            if (kotlin.text.r.u(string, "jar:file:", false) && (iL = kotlin.text.k.L(string, 6, "!")) != -1) {
                                String str = okio.x.y;
                                kVar = new kotlin.k(okio.internal.b.e(com.google.android.gms.measurement.internal.b0.e(new File(URI.create(string.substring(4, iL)))), kVar2, new q0(20)), okio.internal.h.C);
                            } else {
                                kVar = null;
                            }
                            if (kVar != null) {
                                arrayList2.add(kVar);
                            }
                        }
                        return kotlin.collections.p.O(arrayList, arrayList2);
                    }
                    URL url2 = (URL) it.next();
                    url2.getClass();
                    if (kotlin.jvm.internal.l.a(url2.getProtocol(), "file")) {
                        String str2 = okio.x.y;
                        kVar3 = new kotlin.k(kVar2, com.google.android.gms.measurement.internal.b0.e(new File(url2.toURI())));
                    }
                    if (kVar3 != null) {
                        arrayList.add(kVar3);
                    }
                }
                break;
        }
    }
}
