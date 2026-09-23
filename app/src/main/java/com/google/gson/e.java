package com.google.gson;

import com.google.android.gms.measurement.internal.z;
import com.google.gson.internal.bind.a0;
import com.google.gson.internal.bind.d0;
import com.google.gson.internal.bind.f1;
import com.google.gson.internal.bind.p;
import com.google.gson.internal.bind.r;
import com.google.gson.internal.bind.s;
import com.google.gson.internal.bind.t;
import com.google.gson.internal.bind.u;
import com.google.gson.internal.bind.v0;
import com.google.gson.internal.bind.x0;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final a h = a.d;
    public static final int i = 1;
    public static final int j = 1;
    public static final int k = 2;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final z c;
    public final com.google.gson.internal.bind.k d;
    public final List e;
    public final boolean f;
    public final a g;

    public e() {
        com.google.gson.internal.d dVar = com.google.gson.internal.d.z;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        z zVar = new z(25);
        this.c = zVar;
        this.f = true;
        this.g = h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(f1.A);
        int i2 = j;
        arrayList.add(i2 == 1 ? u.c : new t(i2));
        arrayList.add(dVar);
        arrayList.addAll(list);
        arrayList.add(f1.p);
        arrayList.add(f1.g);
        arrayList.add(f1.d);
        arrayList.add(f1.e);
        arrayList.add(f1.f);
        d0 d0Var = f1.k;
        arrayList.add(new x0(Long.TYPE, Long.class, d0Var));
        arrayList.add(new x0(Double.TYPE, Double.class, new b(0)));
        arrayList.add(new x0(Float.TYPE, Float.class, new b(1)));
        int i3 = k;
        arrayList.add(i3 == 2 ? s.b : new r(new s(i3), 0));
        arrayList.add(f1.h);
        arrayList.add(f1.i);
        arrayList.add(new v0(AtomicLong.class, new c(d0Var, 0).a(), 0));
        int i4 = 0;
        arrayList.add(new v0(AtomicLongArray.class, new c(d0Var, 1).a(), i4));
        arrayList.add(f1.j);
        arrayList.add(f1.l);
        arrayList.add(f1.q);
        arrayList.add(f1.r);
        arrayList.add(new v0(BigDecimal.class, f1.m, i4));
        arrayList.add(new v0(BigInteger.class, f1.n, i4));
        arrayList.add(new v0(com.google.gson.internal.j.class, f1.o, i4));
        arrayList.add(f1.s);
        arrayList.add(f1.t);
        arrayList.add(f1.v);
        arrayList.add(f1.w);
        arrayList.add(f1.y);
        arrayList.add(f1.u);
        arrayList.add(f1.b);
        arrayList.add(com.google.gson.internal.bind.g.c);
        arrayList.add(f1.x);
        if (com.google.gson.internal.sql.e.a) {
            arrayList.add(com.google.gson.internal.sql.e.c);
            arrayList.add(com.google.gson.internal.sql.e.b);
            arrayList.add(com.google.gson.internal.sql.e.d);
        }
        arrayList.add(com.google.gson.internal.bind.b.c);
        arrayList.add(f1.a);
        arrayList.add(new com.google.gson.internal.bind.d(zVar, 0));
        arrayList.add(new com.google.gson.internal.bind.d(zVar, 1));
        com.google.gson.internal.bind.k kVar = new com.google.gson.internal.bind.k(zVar);
        this.d = kVar;
        arrayList.add(kVar);
        arrayList.add(f1.B);
        arrayList.add(new a0(zVar, i, dVar, kVar));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(j jVar, Class cls) {
        com.google.gson.reflect.a aVar = new com.google.gson.reflect.a(cls);
        if (jVar == null) {
            return null;
        }
        com.google.gson.internal.bind.n nVar = new com.google.gson.internal.bind.n(com.google.gson.internal.bind.n.Q);
        nVar.M = new Object[32];
        nVar.N = 0;
        nVar.O = new String[32];
        nVar.P = new int[32];
        nVar.C0(jVar);
        return c(nVar, aVar);
    }

    public final Object c(com.google.gson.stream.a aVar, com.google.gson.reflect.a aVar2) {
        int i2 = aVar.L;
        boolean z = true;
        if (i2 == 2) {
            aVar.L = 1;
        }
        try {
            try {
                try {
                    aVar.n0();
                    z = false;
                    m mVarE = e(aVar2);
                    Object objB = mVarE.b(aVar);
                    Class clsL = com.google.gson.internal.h.l(aVar2.a());
                    if (objB != null && !clsL.isInstance(objB)) {
                        throw new ClassCastException("Type adapter '" + mVarE + "' returned wrong type; requested " + aVar2.a() + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    if (i2 == 0) {
                        throw null;
                    }
                    aVar.L = i2;
                    return objB;
                } catch (EOFException e) {
                    if (!z) {
                        throw new h(e, 8);
                    }
                    if (i2 == 0) {
                        throw null;
                    }
                    aVar.L = i2;
                    return null;
                } catch (IOException e2) {
                    throw new h(e2, 8);
                }
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e3.getMessage(), e3);
            } catch (IllegalStateException e4) {
                throw new h(e4, 8);
            }
        } catch (Throwable th) {
            if (i2 == 0) {
                throw null;
            }
            aVar.L = i2;
            throw th;
        }
    }

    public final Object d(Class cls, String str) {
        com.google.gson.reflect.a aVar = new com.google.gson.reflect.a(cls);
        if (str == null) {
            return null;
        }
        com.google.gson.stream.a aVar2 = new com.google.gson.stream.a(new StringReader(str));
        aVar2.L = 2;
        Object objC = c(aVar2, aVar);
        if (objC != null) {
            try {
                if (aVar2.n0() != 10) {
                    throw new h("JSON document was not fully consumed.", 8);
                }
            } catch (com.google.gson.stream.c e) {
                throw new h(e, 8);
            } catch (IOException e2) {
                throw new h(e2, 8);
            }
        }
        return objC;
    }

    public final m e(com.google.gson.reflect.a aVar) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        m mVar = (m) concurrentHashMap.get(aVar);
        if (mVar != null) {
            return mVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            m mVar2 = (m) map.get(aVar);
            if (mVar2 != null) {
                return mVar2;
            }
            z = false;
        }
        try {
            d dVar = new d();
            map.put(aVar, dVar);
            Iterator it = this.e.iterator();
            m mVarA = null;
            while (it.hasNext()) {
                mVarA = ((n) it.next()).a(this, aVar);
                if (mVarA != null) {
                    if (dVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    dVar.a = mVarA;
                    map.put(aVar, mVarA);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (mVarA == null) {
                com.google.firebase.platforminfo.b.f(aVar, "GSON (2.13.2) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return mVarA;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final com.google.gson.stream.b f(Writer writer) {
        com.google.gson.stream.b bVar = new com.google.gson.stream.b(writer);
        bVar.a0(this.g);
        bVar.F = this.f;
        bVar.b0(2);
        bVar.H = false;
        return bVar;
    }

    public final String g(g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            h(gVar, f(new androidx.fragment.app.j(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new h(e, 8);
        }
    }

    public final void h(g gVar, com.google.gson.stream.b bVar) {
        int i2 = bVar.E;
        boolean z = bVar.F;
        boolean z2 = bVar.H;
        bVar.F = this.f;
        bVar.H = false;
        if (i2 == 2) {
            bVar.E = 1;
        }
        try {
            try {
                try {
                    f1.z.getClass();
                    com.google.gson.internal.bind.l.e(gVar, bVar);
                    bVar.b0(i2);
                    bVar.F = z;
                    bVar.H = z2;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new h(e2, 8);
            }
        } catch (Throwable th) {
            bVar.b0(i2);
            bVar.F = z;
            bVar.H = z2;
            throw th;
        }
    }

    public final void i(Object obj, Type type, com.google.gson.stream.b bVar) {
        m mVarE = e(new com.google.gson.reflect.a(type));
        int i2 = bVar.E;
        if (i2 == 2) {
            bVar.E = 1;
        }
        boolean z = bVar.F;
        boolean z2 = bVar.H;
        bVar.F = this.f;
        bVar.H = false;
        try {
            try {
                mVarE.c(bVar, obj);
                bVar.b0(i2);
                bVar.F = z;
                bVar.H = z2;
            } catch (IOException e) {
                throw new h(e, 8);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            bVar.b0(i2);
            bVar.F = z;
            bVar.H = z2;
            throw th;
        }
    }

    public final g j(List list) {
        if (list == null) {
            return i.e;
        }
        Type type = list.getClass();
        p pVar = new p();
        i(list, type, pVar);
        ArrayList arrayList = pVar.L;
        if (arrayList.isEmpty()) {
            return pVar.N;
        }
        com.google.firebase.platforminfo.b.k(arrayList, "Expected one JSON element but was ");
        return null;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
