package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends j implements q {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((OnTimeout) obj, (SelectInstance<?>) obj2, obj3);
        return y.a;
    }

    public final void invoke(OnTimeout onTimeout, SelectInstance<?> selectInstance, Object obj) {
        onTimeout.register(selectInstance, obj);
    }
}
