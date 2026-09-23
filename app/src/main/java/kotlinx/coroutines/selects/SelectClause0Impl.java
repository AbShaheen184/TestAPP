package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectClause0Impl implements SelectClause0 {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public SelectClause0Impl(Object obj, q qVar, q qVar2) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.onCancellationConstructor = qVar2;
        this.processResFunc = SelectKt.DUMMY_PROCESS_RESULT_FUNCTION;
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

    public /* synthetic */ SelectClause0Impl(Object obj, q qVar, q qVar2, int i, f fVar) {
        this(obj, qVar, (i & 4) != 0 ? null : qVar2);
    }
}
