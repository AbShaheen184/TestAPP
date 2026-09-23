package org.schabi.newpipe.extractor.playlist;

import androidx.core.view.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.schabi.newpipe.extractor.e;
import org.schabi.newpipe.extractor.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public String F;
    public List G;

    public static b b(w0 w0Var, String str) {
        e eVarY;
        a aVarD = w0Var.d(w0Var.e().f(str));
        aVarD.d();
        int i = ((w0) aVarD.c).y;
        org.schabi.newpipe.extractor.linkhandler.a aVar = (org.schabi.newpipe.extractor.linkhandler.a) aVarD.d;
        b bVar = new b(i, (org.schabi.newpipe.extractor.linkhandler.b) aVar, aVarD.h());
        bVar.F = "";
        bVar.G = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        try {
            bVar.A = aVar.e;
        } catch (Exception e) {
            bVar.a(e);
        }
        try {
            aVarD.f0();
        } catch (Exception e2) {
            bVar.a(e2);
        }
        try {
            aVarD.s();
        } catch (Exception e3) {
            bVar.a(e3);
        }
        try {
            bVar.G = aVarD.Q();
        } catch (Exception e4) {
            bVar.a(e4);
        }
        try {
            aVarD.X();
        } catch (Exception e5) {
            arrayList.add(e5);
        }
        try {
            bVar.F = aVarD.V();
        } catch (Exception e6) {
            arrayList.add(e6);
        }
        try {
            aVarD.U();
        } catch (Exception e7) {
            arrayList.add(e7);
        }
        try {
            aVarD.L();
        } catch (Exception e8) {
            arrayList.add(e8);
        }
        try {
            aVarD.K();
        } catch (Exception e9) {
            arrayList.add(e9);
        }
        try {
            aVarD.J();
        } catch (Exception e10) {
            arrayList.add(e10);
        }
        try {
            List list = Collections.EMPTY_LIST;
        } catch (Exception e11) {
            bVar.a(e11);
        }
        try {
            aVarD.d0();
        } catch (Exception e12) {
            bVar.a(e12);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = bVar.C;
        if (!zIsEmpty && (!arrayList2.isEmpty() || arrayList.size() < 3)) {
            arrayList2.addAll(arrayList);
        }
        try {
            eVarY = aVarD.y();
            arrayList2.addAll(eVarY.c);
        } catch (Exception e13) {
            bVar.a(e13);
            eVarY = e.d;
        }
        bVar.D = eVarY.a;
        bVar.E = eVarY.b;
        return bVar;
    }
}
