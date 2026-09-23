package kotlinx.coroutines.channels;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class BufferedChannel$onReceive$2 extends j implements q {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2();

    public BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        return bufferedChannel.processResultSelectReceive(obj, obj2);
    }
}
