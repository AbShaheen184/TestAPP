package com.google.firebase.platforminfo;

import android.util.Log;
import com.caverock.androidsvg.x1;
import com.google.firebase.components.e;
import com.google.firebase.components.r;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.q0;
import com.google.firebase.sessions.r0;
import com.google.gson.h;
import com.google.gson.internal.n;
import com.google.gson.internal.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e, com.google.android.datatransport.e, o {
    public final /* synthetic */ int e;

    public static /* synthetic */ void b() {
        throw new androidx.compose.ui.res.e(10);
    }

    public static /* synthetic */ void c(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void d(int i, String str, Object obj, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void i(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new h(str + ((Object) obj.toString()), 8);
    }

    public static /* synthetic */ void n(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    @Override // com.google.gson.internal.o
    public Object a() {
        switch (this.e) {
            case 8:
                return new n(true);
            case 9:
                return new LinkedHashMap();
            case 10:
                return new TreeMap();
            case 11:
                return new ConcurrentHashMap();
            case 12:
                return new ConcurrentSkipListMap();
            case 13:
                return new ArrayList();
            case 14:
                return new LinkedHashSet();
            case 15:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // com.google.android.datatransport.e
    public Object apply(Object obj) {
        String strD = r0.b.d((q0) obj);
        strD.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strD.getBytes(kotlin.text.a.a);
        bytes.getClass();
        return bytes;
    }

    @Override // com.google.firebase.components.e
    public Object g(x1 x1Var) {
        switch (this.e) {
            case 0:
                Set setD = x1Var.d(r.a(a.class));
                d dVar = d.y;
                if (dVar == null) {
                    synchronized (d.class) {
                        try {
                            dVar = d.y;
                            if (dVar == null) {
                                dVar = new d(0);
                                d.y = dVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new c(setD, dVar);
            case 3:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(x1Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(x1Var);
        }
    }

    public /* synthetic */ b(int i) {
        this.e = i;
    }
}
