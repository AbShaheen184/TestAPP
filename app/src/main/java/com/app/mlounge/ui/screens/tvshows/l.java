package com.app.mlounge.ui.screens.tvshows;

import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.q0;
import com.app.mlounge.ui.viewmodel.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ b2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b2 b2Var, int i, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.z = b2Var;
        this.y = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l(this.z, this.y, dVar);
            case 1:
                return new l(this.z, dVar, 1);
            default:
                return new l(this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                l lVar = (l) create(coroutineScope, dVar);
                y yVar = y.a;
                lVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((l) create(coroutineScope, dVar)).invokeSuspend(y.a);
            default:
                return ((l) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Exception exc;
        Throwable th2;
        String message;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                int i = this.y;
                b2 b2Var = this.z;
                BuildersKt__Builders_commonKt.launch$default(m0.g(b2Var), null, null, new z1(b2Var, i, null, 1), 3, null);
                return y.a;
            case 1:
                b2 b2Var2 = this.z;
                MutableStateFlow mutableStateFlow = b2Var2.m;
                MutableStateFlow mutableStateFlow2 = b2Var2.s;
                int i2 = this.y;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        j0 j0Var = b2Var2.b;
                        int i3 = b2Var2.T + 1;
                        String str = (String) b2Var2.y.getValue();
                        TmdbGenre tmdbGenre = (TmdbGenre) b2Var2.w.getValue();
                        String strValueOf = tmdbGenre != null ? String.valueOf(tmdbGenre.a()) : null;
                        Integer num = (Integer) b2Var2.A.getValue();
                        boolean zE = b2.e(b2Var2);
                        this.y = 1;
                        obj = j0Var.a.discoverTvShows(i3, str, strValueOf, num, zE, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    Set setP = kotlin.sequences.k.P(new kotlin.sequences.n(kotlin.collections.p.u((Iterable) mutableStateFlow.getValue()), new q0(1), 1));
                    List listB = ((TmdbPagedResponse) obj).b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listB) {
                        if (!setP.contains(new Integer(((TmdbTvShow) obj2).b()))) {
                            arrayList.add(obj2);
                        }
                    }
                    mutableStateFlow.setValue(kotlin.collections.p.O((Collection) mutableStateFlow.getValue(), arrayList));
                    b2Var2.T++;
                    break;
                } catch (Exception unused) {
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return y.a;
            default:
                b2 b2Var3 = this.z;
                MutableStateFlow mutableStateFlow3 = b2Var3.u;
                MutableStateFlow mutableStateFlow4 = b2Var3.q;
                int i4 = this.y;
                try {
                    if (i4 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow3.setValue(null);
                        try {
                            j0 j0Var2 = b2Var3.b;
                            String str2 = (String) b2Var3.y.getValue();
                            TmdbGenre tmdbGenre2 = (TmdbGenre) b2Var3.w.getValue();
                            String strValueOf2 = tmdbGenre2 != null ? String.valueOf(tmdbGenre2.a()) : null;
                            Integer num2 = (Integer) b2Var3.A.getValue();
                            boolean zE2 = b2.e(b2Var3);
                            this.y = 1;
                            try {
                                obj = j0Var2.a.discoverTvShows(1, str2, strValueOf2, num2, zE2, this);
                                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                message = exc.getMessage();
                                if (message == null) {
                                    message = "Failed to load TV shows";
                                }
                                mutableStateFlow3.setValue(message);
                                mutableStateFlow4.setValue(Boolean.FALSE);
                                return y.a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                mutableStateFlow4.setValue(Boolean.FALSE);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } else {
                        if (i4 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    try {
                        try {
                            TmdbPagedResponse tmdbPagedResponse = (TmdbPagedResponse) obj;
                            b2Var3.m.setValue(tmdbPagedResponse.b());
                            b2Var3.U = tmdbPagedResponse.c();
                        } catch (Throwable th5) {
                            th2 = th5;
                            th = th2;
                            mutableStateFlow4.setValue(Boolean.FALSE);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "Failed to load TV shows";
                        }
                        mutableStateFlow3.setValue(message);
                    }
                    break;
                } catch (Exception e4) {
                    exc = e4;
                } catch (Throwable th6) {
                    th = th6;
                    mutableStateFlow4.setValue(Boolean.FALSE);
                    throw th;
                }
                mutableStateFlow4.setValue(Boolean.FALSE);
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b2 b2Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = b2Var;
    }
}
