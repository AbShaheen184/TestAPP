package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {Token.EXPR_RESULT}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowOperator<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChannelFlowOperator<S, T> channelFlowOperator, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = channelFlowOperator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                FlowCollector<? super T> flowCollector = (FlowCollector) this.L$0;
                ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
                this.label = 1;
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objFlowCollect == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(Flow<? extends S> flow, j jVar, int i, BufferOverflow bufferOverflow) {
        super(jVar, i, bufferOverflow);
        this.flow = flow;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[RETURN] */
    public static <S, T> Object collect$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        Object objCollect;
        int i = channelFlowOperator.capacity;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i == -3) {
            j context = dVar.getContext();
            j jVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (l.a(jVarNewCoroutineContext, context)) {
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, dVar);
                if (objFlowCollect == aVar) {
                    return objFlowCollect;
                }
            } else {
                kotlin.coroutines.e eVar = kotlin.coroutines.e.e;
                if (l.a(jVarNewCoroutineContext.get(eVar), context.get(eVar))) {
                    Object objCollectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, jVarNewCoroutineContext, dVar);
                    if (objCollectWithContextUndispatched == aVar) {
                        return objCollectWithContextUndispatched;
                    }
                } else {
                    objCollect = super.collect(flowCollector, dVar);
                    if (objCollect == aVar) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(flowCollector, dVar);
            if (objCollect == aVar) {
                return objCollect;
            }
        }
        return y.a;
    }

    public static <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, d<? super y> dVar) {
        Object objFlowCollect = channelFlowOperator.flowCollect(new SendingCollector(producerScope), dVar);
        return objFlowCollect == kotlin.coroutines.intrinsics.a.e ? objFlowCollect : y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, j jVar, d<? super y> dVar) {
        return ChannelFlowKt.withContextUndispatched$default(jVar, ChannelFlowKt.withUndispatchedContextCollector(flowCollector, dVar.getContext()), null, new AnonymousClass2(this, null), dVar, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, d<? super y> dVar) {
        return collectTo$suspendImpl(this, producerScope, dVar);
    }

    public abstract Object flowCollect(FlowCollector<? super T> flowCollector, d<? super y> dVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
