package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.compose.material3.internal.r0;
import androidx.compose.material3.x2;
import androidx.room.s;
import androidx.work.z;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.v;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ f A;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ androidx.work.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.work.e eVar, f fVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = eVar;
        this.A = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e eVar = new e(this.z, this.A, dVar);
        eVar.y = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        kotlin.jvm.functions.a gVar;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.e;
        kotlin.coroutines.d dVar = null;
        if (i == 0) {
            kotlin.a.e(obj);
            ProducerScope producerScope = (ProducerScope) this.y;
            NetworkRequest networkRequestA = this.z.a();
            if (networkRequestA == null) {
                z zVar = this.z.a;
                zVar.getClass();
                if (zVar == z.e) {
                    networkRequestA = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || zVar != z.C) {
                        int iOrdinal = zVar.ordinal();
                        if (iOrdinal == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (iOrdinal == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        } else if (iOrdinal == 4) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        }
                        networkRequestA = builderRemoveCapability.build();
                    } else {
                        networkRequestA = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestA == null) {
                SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                return y.a;
            }
            r0 r0Var = new r0(9, BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new s(this.A, producerScope, dVar, 5), 3, null), producerScope);
            if (Build.VERSION.SDK_INT >= 30) {
                i iVar = i.a;
                ConnectivityManager connectivityManager = this.A.a;
                iVar.getClass();
                synchronized (i.b) {
                    try {
                        LinkedHashMap linkedHashMap = i.c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(r0Var, networkRequestA);
                        if (zIsEmpty) {
                            androidx.work.y.e().a(j.a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(iVar);
                        } else if (i.e && i.f != null) {
                            androidx.work.y.e().a(j.a, "NetworkRequestConstraintController send initial capabilities");
                            r0Var.invoke(i.a(networkRequestA, i.d) ? a.a : new b(7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gVar = new androidx.activity.compose.f(23, r0Var, connectivityManager);
            } else {
                int i2 = d.c;
                ConnectivityManager connectivityManager2 = this.A.a;
                d dVar2 = new d(r0Var);
                v vVar = new v();
                try {
                    androidx.work.y.e().a(j.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, dVar2);
                    vVar.e = true;
                } catch (RuntimeException e) {
                    if (!r.n(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    androidx.work.y.e().b(j.a, "NetworkRequestConstraintController couldn't register callback", e);
                    r0Var.invoke(new b(7));
                }
                gVar = new androidx.compose.foundation.gestures.g(8, vVar, connectivityManager2, dVar2);
            }
            x2 x2Var = new x2(3, gVar);
            this.e = 1;
            if (ProduceKt.awaitClose(producerScope, x2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return y.a;
    }
}
