package kotlinx.coroutines;

import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public final String getString(String str) {
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("List{", str, "}[");
        Object next = getNext();
        next.getClass();
        boolean z = true;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !l.a(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                if (z) {
                    z = false;
                } else {
                    sbX.append(", ");
                }
                sbX.append(nextNode);
            }
        }
        sbX.append("]");
        return sbX.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this;
    }
}
