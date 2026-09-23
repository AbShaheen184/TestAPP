package com.app.mlounge.data.remote.trakt;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager$pushWatchlistRemove$2", f = "TraktSyncManager.kt", l = {Token.TAGGED_TEMPLATE_LITERAL}, m = "invokeSuspend", v = 2)
final class TraktSyncManager$pushWatchlistRemove$2 extends i implements p {
    final /* synthetic */ int $tmdbId;
    final /* synthetic */ String $traktType;
    int label;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$pushWatchlistRemove$2(TraktSyncManager traktSyncManager, int i, String str, d dVar) {
        super(2, dVar);
        this.this$0 = traktSyncManager;
        this.$tmdbId = i;
        this.$traktType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new TraktSyncManager$pushWatchlistRemove$2(this.this$0, this.$tmdbId, this.$traktType, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TraktSyncManager$pushWatchlistRemove$2) create((CoroutineScope) obj, (d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            a.e(obj);
            TraktManager traktManager = this.this$0.traktManager;
            int i2 = this.$tmdbId;
            String str = this.$traktType;
            this.label = 1;
            Object objP = traktManager.p(i2, str, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(obj);
        }
        return y.a;
    }
}
