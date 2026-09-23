package kotlinx.serialization;

import androidx.compose.runtime.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final List e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, ArrayList arrayList) {
        String strN;
        str.getClass();
        if (arrayList.size() == 1) {
            strN = j.n(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strN = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(strN, null);
        this.e = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, String str, b bVar) {
        super(str, bVar);
        list.getClass();
        this.e = list;
    }
}
