package androidx.work.impl.constraints;

import androidx.media3.exoplayer.dash.manifest.t;
import androidx.room.coroutines.c0;
import androidx.work.impl.model.p;
import androidx.work.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final String a = y.g("WorkConstraintsTracker");

    public static final Job a(t tVar, p pVar, CoroutineDispatcher coroutineDispatcher, h hVar) {
        tVar.getClass();
        coroutineDispatcher.getClass();
        hVar.getClass();
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new c0(tVar, pVar, hVar, (kotlin.coroutines.d) null, 3), 3, null);
    }
}
