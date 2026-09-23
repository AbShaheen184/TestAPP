package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.internal.f;
import kotlin.text.k;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
public final class CoroutineId extends kotlin.coroutines.a implements ThreadContextElement<String> {
    public static final Key Key = new Key(null);
    private final long id;

    public CoroutineId(long j) {
        super(Key);
        this.id = j;
    }

    public static /* synthetic */ CoroutineId copy$default(CoroutineId coroutineId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineId.id;
        }
        return coroutineId.copy(j);
    }

    public final long component1() {
        return this.id;
    }

    public final CoroutineId copy(long j) {
        return new CoroutineId(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.id == ((CoroutineId) obj).id;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(j jVar, String str) {
        Thread.currentThread().setName(str);
    }

    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public String updateThreadContext(j jVar) {
        String name;
        CoroutineName coroutineName = (CoroutineName) jVar.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iL = k.L(name2, 6, " @");
        if (iL < 0) {
            iL = name2.length();
        }
        StringBuilder sb = new StringBuilder(name.length() + iL + 10);
        sb.append(name2.substring(0, iL));
        sb.append(" @");
        sb.append(name);
        sb.append('#');
        sb.append(this.id);
        threadCurrentThread.setName(sb.toString());
        return name2;
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key implements i {
        public /* synthetic */ Key(f fVar) {
            this();
        }

        private Key() {
        }
    }
}
