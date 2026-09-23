package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import androidx.compose.material3.j6;
import androidx.compose.material3.l6;
import com.app.mlounge.ui.viewmodel.p1;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new q((t) this.y, dVar, 0);
            case 1:
                return new q((j6) this.y, dVar, 1);
            case 2:
                return new q((androidx.work.impl.model.p) this.y, dVar, 2);
            case 3:
                return new q((coil3.disk.d) this.y, dVar, 3);
            case 4:
                return new q((com.app.mlounge.data.repository.a) this.y, dVar, 4);
            case 5:
                return new q((com.app.mlounge.data.repository.r) this.y, dVar, 5);
            case 6:
                return new q((androidx.compose.runtime.a1) this.y, dVar, 6);
            case 7:
                return new q((com.app.mlounge.ui.viewmodel.c) this.y, dVar, 7);
            case 8:
                return new q((com.app.mlounge.ui.screens.player.a1) this.y, dVar, 8);
            case 9:
                return new q((p1) this.y, dVar, 9);
            default:
                return new q((com.google.firebase.sessions.settings.g) this.y, dVar, 10);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                q qVar = (q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                qVar.invokeSuspend(yVar);
                return yVar;
            case 2:
                q qVar2 = (q) create((androidx.work.impl.constraints.c) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                qVar2.invokeSuspend(yVar2);
                return yVar2;
            case 3:
                return ((q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 4:
                return ((q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 5:
                return ((q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 6:
                q qVar3 = (q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar3 = kotlin.y.a;
                qVar3.invokeSuspend(yVar3);
                return yVar3;
            case 7:
                q qVar4 = (q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar4 = kotlin.y.a;
                qVar4.invokeSuspend(yVar4);
                return yVar4;
            case 8:
                q qVar5 = (q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar5 = kotlin.y.a;
                qVar5.invokeSuspend(yVar5);
                return yVar5;
            case 9:
                return ((q) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((q) create((com.google.firebase.sessions.settings.g) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str = null;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                t tVar = (t) this.y;
                TextClassifier textClassifierE = androidx.arch.core.executor.d.e(tVar.b, tVar.c);
                tVar.f = textClassifierE;
                return textClassifierE;
            case 1:
                kotlin.a.e(obj);
                ((l6) ((j6) this.y)).a();
                return kotlin.y.a;
            case 2:
                kotlin.a.e(obj);
                String str2 = androidx.work.impl.workers.g.a;
                androidx.work.impl.model.p pVar = (androidx.work.impl.model.p) this.y;
                androidx.work.y.e().a(str2, "Constraints changed for " + pVar);
                return kotlin.y.a;
            case 3:
                kotlin.a.e(obj);
                coil3.disk.d dVar = (coil3.disk.d) this.y;
                synchronized (dVar.E) {
                    if (!dVar.J || dVar.K) {
                        return kotlin.y.a;
                    }
                    try {
                        dVar.Z();
                        break;
                    } catch (IOException unused) {
                        dVar.L = true;
                    }
                    try {
                        if (dVar.G >= 2000) {
                            dVar.b0();
                        }
                        break;
                    } catch (IOException unused2) {
                        dVar.M = true;
                        dVar.H = new okio.z(new okio.d());
                    }
                    return kotlin.y.a;
                }
            case 4:
                kotlin.a.e(obj);
                int iOrdinal = ((com.app.mlounge.data.repository.a) this.y).ordinal();
                if (iOrdinal == 0) {
                    com.app.mlounge.data.providers.s.Companion.getClass();
                    return com.app.mlounge.data.providers.s.CATEGORIES;
                }
                if (iOrdinal == 1) {
                    com.app.mlounge.data.providers.q.Companion.getClass();
                    return com.app.mlounge.data.providers.q.CATEGORIES;
                }
                if (iOrdinal == 2) {
                    com.app.mlounge.data.providers.f1.Companion.getClass();
                    return com.app.mlounge.data.providers.f1.CATEGORIES;
                }
                coil3.g.a();
                return null;
            case 5:
                kotlin.a.e(obj);
                return ((com.app.mlounge.data.repository.r) this.y).k.getGenres();
            case 6:
                kotlin.a.e(obj);
                com.app.mlounge.ui.f0.c((androidx.compose.runtime.a1) this.y, false);
                return kotlin.y.a;
            case 7:
                kotlin.a.e(obj);
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.y;
                cVar.d.getClass();
                MutableStateFlow mutableStateFlow = cVar.C;
                if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                    cVar.e.setValue(kotlin.collections.w.e);
                    cVar.E = 1;
                    cVar.F = true;
                }
                mutableStateFlow.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 8:
                kotlin.a.e(obj);
                androidx.media3.exoplayer.c0 c0Var = ((com.app.mlounge.ui.screens.player.a1) this.y).i;
                if (c0Var != null) {
                    c0Var.M(false);
                }
                return kotlin.y.a;
            case 9:
                kotlin.a.e(obj);
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d("https://api.ipify.org?format=json");
                a0Var.c("GET", null);
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = ((p1) this.y).c;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                try {
                    if (g0VarE.N) {
                        String strOptString = new JSONObject(g0VarE.D.A()).optString("ip");
                        if (!kotlin.text.k.J(strOptString)) {
                            str = strOptString;
                        }
                    }
                    g0VarE.close();
                    return str;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dagger.internal.d.b(g0VarE, th);
                        throw th2;
                    }
                }
            default:
                kotlin.a.e(obj);
                return (com.google.firebase.sessions.settings.g) this.y;
        }
    }
}
