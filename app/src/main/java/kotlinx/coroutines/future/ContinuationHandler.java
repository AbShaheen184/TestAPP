package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.coroutines.d;
import kotlin.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, y> {
    public volatile d<? super T> cont;

    public ContinuationHandler(d<? super T> dVar) {
        this.cont = dVar;
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t, Throwable th) {
        Throwable cause;
        d<? super T> dVar = this.cont;
        if (dVar == null) {
            return;
        }
        if (th == null) {
            dVar.resumeWith(t);
            return;
        }
        CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        dVar.resumeWith(new l(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ y apply(Object obj, Throwable th) {
        apply2(obj, th);
        return y.a;
    }
}
