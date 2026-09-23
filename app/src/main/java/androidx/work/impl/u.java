package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.j implements kotlin.jvm.functions.t {
    public static final u e = new u(6, v.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.t
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        androidx.work.b bVar = (androidx.work.b) obj2;
        androidx.work.impl.utils.taskexecutor.a aVar = (androidx.work.impl.utils.taskexecutor.a) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        androidx.work.impl.constraints.trackers.i iVar = (androidx.work.impl.constraints.trackers.i) obj5;
        d dVar = (d) obj6;
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        workDatabase.getClass();
        iVar.getClass();
        String str = i.a;
        androidx.work.impl.background.systemjob.c cVar = new androidx.work.impl.background.systemjob.c(context, workDatabase, bVar);
        androidx.work.impl.utils.h.a(context, SystemJobService.class, true);
        androidx.work.y.e().a(i.a, "Created SystemJobScheduler and enabled SystemJobService");
        return kotlin.collections.q.k(cVar, new androidx.work.impl.background.greedy.c(context, bVar, iVar, dVar, new k(dVar, aVar), aVar));
    }
}
