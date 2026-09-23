package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends RuntimeException {
    public final int A;
    public final androidx.collection.j0 e;
    public final androidx.collection.j0 y;
    public final androidx.collection.y z;

    public l(androidx.collection.j0 j0Var, androidx.collection.j0 j0Var2, androidx.collection.y yVar, int i, Exception exc) {
        super(exc);
        this.e = j0Var;
        this.y = j0Var2;
        this.z = yVar;
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listJ;
        List listB0;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.A);
        sb.append(":\n            |");
        kotlin.sequences.i iVarI = kotlin.collections.builders.c.I(new k(this, null));
        if (iVarI.hasNext()) {
            Object next = iVarI.next();
            if (iVarI.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (iVarI.hasNext()) {
                    arrayList.add(iVarI.next());
                }
                listJ = arrayList;
            } else {
                listJ = kotlin.collections.q.j(next);
            }
        } else {
            listJ = kotlin.collections.w.e;
        }
        int size = listJ.size();
        if (50 >= size) {
            listB0 = kotlin.collections.p.b0(listJ);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listJ instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listJ.get(i));
                }
            } else {
                ListIterator listIterator = listJ.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listB0 = arrayList2;
        }
        sb.append(kotlin.collections.p.I(listB0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return kotlin.text.l.k(sb.toString());
    }
}
