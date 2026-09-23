package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Serializable {
    public final int A;
    public final org.schabi.newpipe.extractor.i e;
    public final String y;
    public final boolean z;

    public e(String str, boolean z, org.schabi.newpipe.extractor.i iVar, int i) {
        this.y = str;
        this.z = z;
        this.e = iVar;
        this.A = i;
    }

    public static boolean a(e eVar, ArrayList arrayList) {
        if (org.schabi.newpipe.extractor.utils.g.i(arrayList)) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (eVar.b((e) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean b(e eVar) {
        org.schabi.newpipe.extractor.i iVar;
        org.schabi.newpipe.extractor.i iVar2;
        return eVar != null && (iVar = this.e) != null && (iVar2 = eVar.e) != null && iVar.e == iVar2.e && this.A == eVar.A && this.z == eVar.z;
    }
}
