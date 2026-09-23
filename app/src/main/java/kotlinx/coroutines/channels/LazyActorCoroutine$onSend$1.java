package kotlinx.coroutines.channels;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;
import kotlin.y;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class LazyActorCoroutine$onSend$1 extends j implements q {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        invoke((LazyActorCoroutine<?>) obj, (SelectInstance<?>) obj2, obj3);
        return y.a;
    }

    public final void invoke(LazyActorCoroutine<?> lazyActorCoroutine, SelectInstance<?> selectInstance, Object obj) throws Throwable {
        lazyActorCoroutine.onSendRegFunction(selectInstance, obj);
    }
}
