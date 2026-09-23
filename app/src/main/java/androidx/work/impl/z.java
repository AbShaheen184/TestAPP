package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.z0;
import com.appsalt.internal.a1;
import com.appsalt.internal.e3;
import com.appsalt.internal.f1;
import com.appsalt.internal.g1;
import com.appsalt.internal.g4;
import com.appsalt.internal.k1;
import com.appsalt.internal.m3;
import com.appsalt.internal.n1;
import com.appsalt.internal.n4;
import com.appsalt.internal.q0;
import com.appsalt.internal.r1;
import com.appsalt.internal.s0;
import com.appsalt.internal.t4;
import com.appsalt.internal.v1;
import com.appsalt.internal.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements s0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public z(com.appsalt.internal.c cVar, g4 g4Var) {
        String[] strArr = m3.c;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        f1 f1Var = new f1(listAsList);
        k kVar = com.appsalt.internal.a0.a;
        e3 e3Var = new e3(new k((com.appsalt.internal.x) kVar));
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.a = f1Var;
        this.b = kVar;
        this.c = e3Var;
        this.d = cVar;
        this.e = CoroutineScope;
        this.f = g4Var;
        this.g = CoroutineScopeKt.plus(CoroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
    }

    public static final v1 d(String str) {
        int i;
        q0 q0VarA = com.appsalt.internal.b0.d.a();
        int iE = androidx.constraintlayout.core.g.e(q0VarA.f);
        if (iE != 0) {
            i = 1;
            if (iE != 1) {
                if (iE == 2) {
                    i = 9;
                } else {
                    if (iE != 3) {
                        coil3.g.a();
                        return null;
                    }
                    i = 255;
                }
            }
        } else {
            i = 0;
        }
        byte b = (byte) i;
        Integer num = q0VarA.g;
        byte bIntValue = (byte) (num != null ? num.intValue() : 0);
        Boolean bool = q0VarA.d;
        Boolean bool2 = Boolean.TRUE;
        boolean zA = kotlin.jvm.internal.l.a(bool, bool2);
        boolean zA2 = kotlin.jvm.internal.l.a(q0VarA.e, bool2);
        Integer num2 = q0VarA.b;
        return new v1(str, b, bIntValue, zA, zA2, num2 != null ? num2.intValue() : -1, q0VarA.a, kotlin.jvm.internal.l.a(q0VarA.c, bool2));
    }

    @Override // com.appsalt.internal.s0
    public void a() {
        f();
    }

    @Override // com.appsalt.internal.s0
    public void b(boolean z) {
        if (!z) {
            g4 g4Var = (g4) this.f;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(4, "stop");
            }
        }
        g();
        try {
            CoroutineScopeKt.cancel$default((CoroutineScope) this.g, null, 1, null);
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsalt.internal.s0
    public void c(String str, boolean z) {
        x2 x2Var = com.appsalt.internal.b0.d;
        x2Var.getClass();
        if (!kotlin.text.k.J(str)) {
            x2Var.a.o(str);
            x2Var.b.b = str;
        }
        if (!z) {
            g4 g4Var = (g4) this.f;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(4, "Starting session: ".concat(com.appsalt.internal.b0.d.b.a));
            }
        }
        try {
            CoroutineScopeKt.cancel$default((CoroutineScope) this.g, null, 1, null);
        } catch (Throwable unused) {
        }
        this.g = CoroutineScopeKt.plus((CoroutineScope) this.e, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        f();
    }

    public void e(n4 n4Var) {
        ((g4) this.f).getClass();
        n4 n4Var2 = (n4) this.h;
        if (n4Var2 == null || !n4Var2.equals(n4Var)) {
            return;
        }
        g();
        BuildersKt__BuildersKt.runBlocking$default(null, new t4(this, null, 0), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    public void f() {
        String str;
        Object lVar;
        com.app.mlounge.ui.viewmodel.q0 q0Var = a1.a;
        g4 g4Var = (g4) this.f;
        n4 n4Var = (n4) q0Var.invoke(g4Var);
        this.h = n4Var;
        f1 f1Var = (f1) this.a;
        k kVar = f1Var.c;
        if (kVar == null) {
            ArrayList arrayListM = kotlin.collections.p.M(f1Var.a, f1Var.b);
            kotlin.random.a aVar = kotlin.random.d.e;
            str = (String) kotlin.collections.p.Q(arrayListM);
            if (str == null) {
                str = f1Var.b;
            }
        } else if (kotlin.time.a.e(kotlin.time.f.a(((kotlin.time.f) kVar.y).e), f1.d) <= 0) {
            ArrayList arrayListM2 = kotlin.collections.p.M((ArrayList) kVar.z, f1Var.b);
            kotlin.random.a aVar2 = kotlin.random.d.e;
            str = (String) kotlin.collections.p.Q(arrayListM2);
            if (str == null) {
                str = f1Var.b;
            }
        } else {
            f1Var.c = null;
            ArrayList arrayListM3 = kotlin.collections.p.M(f1Var.a, f1Var.b);
            kotlin.random.a aVar3 = kotlin.random.d.e;
            str = (String) kotlin.collections.p.Q(arrayListM3);
            if (str == null) {
                str = f1Var.b;
            }
        }
        f1Var.b = str;
        g4Var.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            n4Var.e = n4Var.g.b(new okhttp3.b0(a0Var), n4Var);
            lVar = kotlin.y.a;
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        if (kotlin.m.a(lVar) != null) {
            if (g4.b) {
                g4Var.a(1, "Unable to connect to server");
            }
            e(n4Var);
            return;
        }
        if (!(lVar instanceof kotlin.l)) {
        }
        com.appsalt.internal.n nVar = com.appsalt.internal.b0.d.b;
        nVar.getClass();
        String str2 = nVar.a;
        g1 g1Var = new g1(nVar.d, nVar.e);
        String str3 = Build.VERSION.RELEASE;
        r1 r1Var = new r1(str2, g1Var, new n1(), new k1(nVar.b, nVar.c));
        a1.b.getClass();
        n4Var.i.mo28trySendJP2dKIU(com.appsalt.internal.j.a(r1Var));
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.g, null, null, new z0(this, n4Var, (kotlin.coroutines.d) null), 3, null);
    }

    public void g() {
        n4 n4Var = (n4) this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        kotlin.coroutines.d dVar = null;
        this.h = null;
        try {
            e3 e3Var = (e3) this.c;
            SendChannel.DefaultImpls.close$default(e3Var.h, null, 1, null);
            BuildersKt__Builders_commonKt.launch$default(e3Var.c, null, null, new z0(e3Var, dVar, 11), 3, null);
        } catch (Throwable unused) {
        }
    }

    public z(Context context, androidx.work.b bVar, androidx.work.impl.utils.taskexecutor.c cVar, d dVar, WorkDatabase workDatabase, androidx.work.impl.model.p pVar, ArrayList arrayList) {
        context.getClass();
        dVar.getClass();
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
        this.d = workDatabase;
        this.e = pVar;
        this.f = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.g = applicationContext;
        this.h = new c2(26);
    }
}
