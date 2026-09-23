package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final d b;

    public c(Set set, d dVar) {
        this.a = b(set);
        this.b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.a);
            sb.append('/');
            sb.append(aVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        d dVar = this.b;
        synchronized (((HashSet) dVar.e)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) dVar.e);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) dVar.e)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) dVar.e);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
