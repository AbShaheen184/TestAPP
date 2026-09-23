package kotlin.collections;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.serialization.internal.k0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static ArrayList a(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static int b(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        n(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iD = kotlin.comparisons.a.d((Comparable) arrayList.get(i3), comparable);
            if (iD < 0) {
                i2 = i3 + 1;
            } else {
                if (iD <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static kotlin.collections.builders.b c(List list) {
        list.getClass();
        kotlin.collections.builders.b bVar = (kotlin.collections.builders.b) list;
        bVar.h();
        bVar.z = true;
        return bVar.y > 0 ? bVar : kotlin.collections.builders.b.A;
    }

    public static final kotlin.k d(okhttp3.u uVar) {
        Charset charset = kotlin.text.a.a;
        if (uVar != null) {
            Charset charsetA = okhttp3.u.a(uVar);
            if (charsetA == null) {
                try {
                    uVar = o.s(uVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    uVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new kotlin.k(charset, uVar);
    }

    public static final void e(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    androidx.compose.runtime.j.w(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    kotlin.a.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    kotlinx.coroutines.future.a.r();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static org.jsoup.select.e f(org.jsoup.select.p pVar, org.jsoup.nodes.j jVar) {
        Stream streamFilter;
        if (pVar.f()) {
            pVar.e();
            jVar.getClass();
            streamFilter = o.B(jVar, org.jsoup.nodes.j.class).filter(new org.jsoup.select.f(pVar, jVar, 0));
        } else {
            pVar.e();
            jVar.getClass();
            streamFilter = o.B(jVar, org.jsoup.nodes.j.class).filter(new org.jsoup.select.f(pVar, jVar, 1));
        }
        org.jsoup.select.e eVar = (org.jsoup.select.e) streamFilter.collect(Collectors.toCollection(new org.jsoup.internal.c(6)));
        pVar.e();
        return eVar;
    }

    public static kotlin.collections.builders.b g() {
        return new kotlin.collections.builders.b(10);
    }

    public static int h(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final kotlinx.serialization.a i(kotlinx.serialization.a aVar) {
        aVar.getClass();
        return aVar.d().c() ? aVar : new k0(aVar);
    }

    public static List j(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List k(Object... objArr) {
        if (objArr.length <= 0) {
            return w.e;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList l(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static final List m(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : j(list.get(0));
        }
        return w.e;
    }

    public static final void n(int i, int i2) {
        if (i2 < 0) {
            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            com.google.firebase.platforminfo.b.d(i2, "toIndex (", ") is greater than size (", i);
        }
    }

    public static void o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
