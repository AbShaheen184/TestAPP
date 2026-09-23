package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public SelectClause2Impl(Object obj, q qVar, q qVar2, q qVar3) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.processResFunc = qVar2;
        this.onCancellationConstructor = qVar3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause2Impl(Object obj, q qVar, q qVar2, q qVar3, int i, f fVar) {
        this(obj, qVar, qVar2, (i & 8) != 0 ? null : qVar3);
    }
}
