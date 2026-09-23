package androidx.navigation;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public u(Context context, androidx.work.impl.utils.taskexecutor.c cVar) {
        this.a = cVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public t a() {
        t tVarB = b();
        tVarB.getClass();
        androidx.appcompat.widget.o oVar = tVarB.y;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            String str = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            str.getClass();
            gVar.getClass();
            oVar.getClass();
            ((LinkedHashMap) oVar.d).put(str, gVar);
        }
        for (final r rVar : (ArrayList) this.e) {
            rVar.getClass();
            oVar.getClass();
            final int i = 0;
            ArrayList arrayListE = f.e((LinkedHashMap) oVar.d, new kotlin.jvm.functions.l() { // from class: androidx.navigation.internal.g
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    boolean zContains;
                    String str2 = (String) obj;
                    switch (i) {
                        case 0:
                            str2.getClass();
                            zContains = rVar.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = rVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListE.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + rVar.a + " can't be used to open destination " + ((t) oVar.b) + ".\nFollowing required arguments are missing: " + arrayListE).toString());
            }
            ((ArrayList) oVar.c).add(rVar);
        }
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            androidx.transition.k.h();
        } else {
            String str2 = (String) this.b;
            if (str2 == null) {
                return tVarB;
            }
            oVar.getClass();
            if (!kotlin.text.k.J(str2)) {
                String strConcat = "android-app://androidx.navigation/".concat(str2);
                final r rVar2 = new r(strConcat);
                final int i2 = 1;
                ArrayList arrayListE2 = f.e((LinkedHashMap) oVar.d, new kotlin.jvm.functions.l() { // from class: androidx.navigation.internal.g
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        boolean zContains;
                        String str3 = (String) obj;
                        switch (i2) {
                            case 0:
                                str3.getClass();
                                zContains = rVar2.c().contains(str3);
                                break;
                            default:
                                str3.getClass();
                                zContains = rVar2.c().contains(str3);
                                break;
                        }
                        return Boolean.valueOf(!zContains);
                    }
                });
                if (arrayListE2.isEmpty()) {
                    oVar.f = new kotlin.o(new androidx.navigation.internal.h(strConcat, 0));
                    oVar.a = strConcat.hashCode();
                    oVar.e = str2;
                    return tVarB;
                }
                StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Cannot set route \"", str2, "\" for destination ");
                sbX.append((t) oVar.b);
                sbX.append(". Following required arguments are missing: ");
                sbX.append(arrayListE2);
                throw new IllegalArgumentException(sbX.toString().toString());
            }
            kotlinx.coroutines.future.a.q("Cannot have an empty route");
        }
        return null;
    }

    public t b() {
        return ((k0) this.a).a();
    }

    public abstract Object c();

    public void d(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((androidx.work.impl.utils.taskexecutor.c) this.a).d.execute(new androidx.media3.ui.c0(4, kotlin.collections.p.b0((LinkedHashSet) this.d), this));
            }
        }
    }

    public abstract void e();

    public abstract void f();

    public u(k0 k0Var, String str) {
        this.a = k0Var;
        this.b = str;
        this.c = new LinkedHashMap();
        this.e = new ArrayList();
        this.d = new LinkedHashMap();
    }
}
