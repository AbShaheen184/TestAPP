package com.app.mlounge.ui.screens.downloads;

import com.app.mlounge.data.download.h;
import com.app.mlounge.ui.viewmodel.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ o y;
    public final /* synthetic */ com.app.mlounge.data.local.entity.a z;

    public /* synthetic */ c(o oVar, com.app.mlounge.data.local.entity.a aVar, int i) {
        this.e = i;
        this.y = oVar;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                long j = this.z.a;
                h hVar = this.y.b;
                ConcurrentHashMap concurrentHashMap = hVar.f;
                Job job = (Job) concurrentHashMap.get(Long.valueOf(j));
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                concurrentHashMap.remove(Long.valueOf(j));
                BuildersKt__Builders_commonKt.launch$default(hVar.e, null, null, new com.app.mlounge.data.download.b(hVar, j, null, 0), 3, null);
                break;
            case 1:
                long j2 = this.z.a;
                h hVar2 = this.y.b;
                ConcurrentHashMap concurrentHashMap2 = hVar2.f;
                Job job2 = (Job) concurrentHashMap2.get(Long.valueOf(j2));
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                concurrentHashMap2.remove(Long.valueOf(j2));
                BuildersKt__Builders_commonKt.launch$default(hVar2.e, null, null, new com.app.mlounge.data.download.b(hVar2, j2, null, 2), 3, null);
                break;
            case 2:
                long j3 = this.z.a;
                h hVar3 = this.y.b;
                BuildersKt__Builders_commonKt.launch$default(hVar3.e, null, null, new com.app.mlounge.data.download.b(hVar3, j3, null, 3), 3, null);
                break;
            default:
                long j4 = this.z.a;
                h hVar4 = this.y.b;
                BuildersKt__Builders_commonKt.launch$default(hVar4.e, null, null, new com.app.mlounge.data.download.b(hVar4, j4, null, 4), 3, null);
                break;
        }
        return y.a;
    }
}
