package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, Integer num, Integer num2, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = a2Var;
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        z1 z1Var = new z1(this.this$0, this.$season, this.$episode, this.$mediaType, this.$tmdbId, dVar);
        z1Var.L$0 = obj;
        return z1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objSupervisorScope;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                y1 y1Var = new y1(this.this$0, this.$season, this.$episode, this.$mediaType, this.$tmdbId, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                objSupervisorScope = SupervisorKt.supervisorScope(y1Var, this);
                if (objSupervisorScope == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objSupervisorScope = obj;
            }
            ArrayList arrayList = new ArrayList();
            for (kotlin.k kVar : (List) objSupervisorScope) {
                String str = (String) kVar.e;
                com.google.gson.j jVar = (com.google.gson.j) kVar.y;
                if (jVar == null) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "VidNest", str + " result is null");
                } else {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "VidNest", str + " result keys=" + jVar.e.keySet());
                    kotlin.k kVarC = a2.c(this.this$0, jVar);
                    if (kVarC == null) {
                        com.app.mlounge.util.a.a("D", "VidNest", str + " findStreamInResponse returned null");
                    } else {
                        String str2 = (String) kVarC.e;
                        Map mapSingletonMap = (Map) kVarC.y;
                        String str3 = (!kotlin.text.k.z(str2, ".m3u8", false) && (kotlin.text.k.z(str2, ".mp4", false) || kotlin.text.k.z(str2, ".mkv", false))) ? "mp4" : "hls";
                        String str4 = "VidNest (" + str + ")";
                        if (mapSingletonMap == null) {
                            mapSingletonMap = Collections.singletonMap("Referer", "https://vidnest.fun/");
                            mapSingletonMap.getClass();
                        }
                        arrayList.add(new ChqStream(str4, str2, "Auto", str3, str3, null, mapSingletonMap, null, null, null, null, null, null, 8064));
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            Context context3 = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e.getMessage(), "E", "VidNest");
            return kotlin.collections.w.e;
        }
    }
}
