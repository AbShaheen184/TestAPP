package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.DebugStringsKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.block.run();
    }

    public String toString() {
        return "Task[" + DebugStringsKt.getClassSimpleName(this.block) + '@' + DebugStringsKt.getHexAddress(this.block) + ", " + this.submissionTime + ", " + TasksKt.taskContextString(this.taskContext) + ']';
    }
}
