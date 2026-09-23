package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.animation.b0;
import androidx.compose.runtime.j1;
import androidx.datastore.core.c0;
import androidx.datastore.core.f1;
import androidx.datastore.core.k0;
import androidx.datastore.core.v0;
import androidx.datastore.core.x0;
import androidx.datastore.core.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new h((i) this.z, (androidx.compose.foundation.text.contextmenu.provider.e) this.A, dVar, 0);
            case 1:
                return new h((androidx.compose.foundation.text.contextmenu.provider.c) this.z, (androidx.compose.foundation.text.contextmenu.provider.b) this.A, dVar, 1);
            case 2:
                return new h((androidx.compose.material3.internal.p) this.z, (kotlin.jvm.functions.q) this.A, dVar, 2);
            case 3:
                return new h((z) this.A, dVar, 3);
            default:
                return new h((c0) this.A, dVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((h) create(dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.runtime.snapshots.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.snapshots.t] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.Handler] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        e eVar;
        Throwable th;
        f1 v0Var;
        FileInputStream fileInputStream;
        Throwable th2;
        switch (this.e) {
            case 0:
                i iVar = (i) this.z;
                ?? handler = iVar.e;
                View view = iVar.a;
                int i = this.y;
                y yVar = y.a;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        f fVar = new f();
                        androidx.compose.foundation.text.contextmenu.provider.e eVar2 = (androidx.compose.foundation.text.contextmenu.provider.e) this.A;
                        e eVar3 = new e(fVar, new b(iVar, eVar2, 0), new b(iVar, eVar2, 1), view);
                        kotlin.jvm.functions.l lVar = iVar.b;
                        if (lVar != null && (eVar = (e) lVar.invoke(eVar3)) != null) {
                            eVar3 = eVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            g gVar = iVar.i;
                            if (gVar == null) {
                                gVar = new g(0, iVar, eVar3, fVar);
                                iVar.i = gVar;
                            }
                            view.post(gVar);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new o(eVar3), 1);
                            if (actionModeStartActionMode == null) {
                                return yVar;
                            }
                            iVar.h = actionModeStartActionMode;
                        }
                        this.y = 1;
                        Object objReceive = fVar.a.receive(this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objReceive != aVar) {
                            objReceive = yVar;
                        }
                        if (objReceive == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    handler.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != 0 ? handler.getLooper() : null)) {
                        Runnable lVar2 = iVar.j;
                        if (lVar2 == null) {
                            lVar2 = new androidx.activity.l(iVar, 2);
                            iVar.j = lVar2;
                        }
                        view.post(lVar2);
                    } else {
                        ActionMode actionMode = iVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    g gVar2 = iVar.i;
                    if (gVar2 != null) {
                        view.removeCallbacks(gVar2);
                    }
                    iVar.h = null;
                    return yVar;
                } catch (Throwable th3) {
                    handler.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable lVar3 = iVar.j;
                        if (lVar3 == null) {
                            lVar3 = new androidx.activity.l(iVar, 2);
                            iVar.j = lVar3;
                        }
                        view.post(lVar3);
                    } else {
                        ActionMode actionMode2 = iVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    g gVar3 = iVar.i;
                    if (gVar3 != null) {
                        view.removeCallbacks(gVar3);
                    }
                    iVar.h = null;
                    throw th3;
                }
            case 1:
                androidx.compose.foundation.text.contextmenu.provider.b bVar = (androidx.compose.foundation.text.contextmenu.provider.b) this.A;
                j1 j1Var = ((androidx.compose.foundation.text.contextmenu.provider.c) this.z).c;
                int i2 = this.y;
                y yVar2 = y.a;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        j1Var.setValue(bVar);
                        this.y = 1;
                        Object objReceive2 = bVar.b.receive(this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objReceive2 != aVar2) {
                            objReceive2 = yVar2;
                        }
                        if (objReceive2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    j1Var.setValue(null);
                    return yVar2;
                } catch (Throwable th4) {
                    j1Var.setValue(null);
                    throw th4;
                }
            case 2:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.material3.internal.p pVar = (androidx.compose.material3.internal.p) this.z;
                    androidx.compose.material3.internal.j jVar = new androidx.compose.material3.internal.j(pVar, 3);
                    b0 b0Var = new b0((kotlin.jvm.functions.q) this.A, pVar, (kotlin.coroutines.d) null, 17);
                    this.y = 1;
                    Object objE = androidx.compose.material3.internal.i.e(jVar, b0Var, this);
                    kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                    if (objE == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            case 3:
                z zVar = (z) this.A;
                int i4 = this.y;
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i4 == 0) {
                        kotlin.a.e(obj);
                        this.y = 1;
                        obj = z.h(zVar, true, this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.z;
                            kotlin.a.e(obj);
                            v0Var = new v0(th, ((Number) obj).intValue());
                            return new kotlin.k(v0Var, Boolean.TRUE);
                        }
                        kotlin.a.e(obj);
                    }
                    v0Var = (f1) obj;
                    break;
                } catch (Throwable th5) {
                    k0 k0VarI = zVar.i();
                    this.z = th5;
                    this.y = 2;
                    Object objC = k0VarI.c(this);
                    if (objC == aVar4) {
                        return aVar4;
                    }
                    th = th5;
                    obj = objC;
                }
                return new kotlin.k(v0Var, Boolean.TRUE);
            default:
                c0 c0Var = (c0) this.A;
                ?? r1 = this.y;
                kotlin.coroutines.intrinsics.a aVar5 = kotlin.coroutines.intrinsics.a.e;
                try {
                    try {
                        try {
                            if (r1 == 0) {
                                kotlin.a.e(obj);
                                FileInputStream fileInputStream2 = new FileInputStream(c0Var.a);
                                x0 x0Var = c0Var.b;
                                this.z = fileInputStream2;
                                this.y = 1;
                                obj = x0Var.b(fileInputStream2);
                                r1 = fileInputStream2;
                                if (obj == aVar5) {
                                    return aVar5;
                                }
                            } else {
                                if (r1 != 1) {
                                    if (r1 != 2) {
                                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    fileInputStream = (FileInputStream) this.z;
                                    try {
                                        kotlin.a.e(obj);
                                        dagger.internal.d.b(fileInputStream, null);
                                        return obj;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        try {
                                            throw th2;
                                        } catch (Throwable th7) {
                                            dagger.internal.d.b(fileInputStream, th2);
                                            throw th7;
                                        }
                                    }
                                }
                                FileInputStream fileInputStream3 = (FileInputStream) this.z;
                                kotlin.a.e(obj);
                                r1 = fileInputStream3;
                            }
                            dagger.internal.d.b(r1, null);
                        } catch (Exception e) {
                            if (e instanceof FileNotFoundException) {
                                throw com.imsdk.a.E(c0Var.a.getParent(), (FileNotFoundException) e);
                            }
                            throw e;
                        }
                        break;
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            dagger.internal.d.b(r1, th8);
                            throw th9;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    File file = c0Var.a;
                    x0 x0Var2 = c0Var.b;
                    if (file.exists()) {
                        FileInputStream fileInputStream4 = new FileInputStream(c0Var.a);
                        try {
                            this.z = fileInputStream4;
                            this.y = 2;
                            Object objB = x0Var2.b(fileInputStream4);
                            if (objB == aVar5) {
                                return aVar5;
                            }
                            fileInputStream = fileInputStream4;
                            obj = objB;
                            dagger.internal.d.b(fileInputStream, null);
                        } catch (Throwable th10) {
                            fileInputStream = fileInputStream4;
                            th2 = th10;
                            throw th2;
                        }
                    } else {
                        obj = x0Var2.a();
                    }
                    return obj;
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.A = obj;
    }
}
