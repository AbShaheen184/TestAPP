package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j, Serializable {
    public final j e;
    public final h y;

    public c(j jVar, h hVar) {
        jVar.getClass();
        hVar.getClass();
        this.e = jVar;
        this.y = hVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                j jVar = cVar2.e;
                cVar2 = jVar instanceof c ? (c) jVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                j jVar2 = cVar3.e;
                cVar3 = jVar2 instanceof c ? (c) jVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                c cVar4 = this;
                while (true) {
                    h hVar = cVar4.y;
                    if (!kotlin.jvm.internal.l.a(cVar.get(hVar.getKey()), hVar)) {
                        zA = false;
                        break;
                    }
                    j jVar3 = cVar4.e;
                    if (!(jVar3 instanceof c)) {
                        jVar3.getClass();
                        h hVar2 = (h) jVar3;
                        zA = kotlin.jvm.internal.l.a(cVar.get(hVar2.getKey()), hVar2);
                        break;
                    }
                    cVar4 = (c) jVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.j
    public final Object fold(Object obj, p pVar) {
        pVar.getClass();
        return pVar.invoke(this.e.fold(obj, pVar), this.y);
    }

    @Override // kotlin.coroutines.j
    public final h get(i iVar) {
        iVar.getClass();
        c cVar = this;
        while (true) {
            h hVar = cVar.y.get(iVar);
            if (hVar != null) {
                return hVar;
            }
            j jVar = cVar.e;
            if (!(jVar instanceof c)) {
                return jVar.get(iVar);
            }
            cVar = (c) jVar;
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + this.e.hashCode();
    }

    @Override // kotlin.coroutines.j
    public final j minusKey(i iVar) {
        iVar.getClass();
        h hVar = this.y;
        h hVar2 = hVar.get(iVar);
        j jVar = this.e;
        if (hVar2 != null) {
            return jVar;
        }
        j jVarMinusKey = jVar.minusKey(iVar);
        if (jVarMinusKey == jVar) {
            return this;
        }
        return jVarMinusKey == k.e ? hVar : new c(jVarMinusKey, hVar);
    }

    @Override // kotlin.coroutines.j
    public final j plus(j jVar) {
        jVar.getClass();
        return jVar == k.e ? this : (j) jVar.fold(this, new com.app.mlounge.ui.screens.sources.b(7));
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("["), (String) fold("", new com.app.mlounge.ui.screens.sources.b(6)), ']');
    }
}
