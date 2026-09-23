package androidx.compose.ui.semantics;

import androidx.compose.ui.graphics.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l G;
    public static final l H;
    public static final l I;
    public static final l J;
    public static final l K;
    public static final l L;
    public static final l M;
    public static final l N;
    public static final l O;
    public static final l P;
    public static final l Q;
    public static final l R;
    public static final l S;
    public static final l T;
    public static final l z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new l(i, 0);
        A = new l(i, 1);
        B = new l(i, 2);
        C = new l(i, 3);
        D = new l(i, 4);
        E = new l(i, 5);
        F = new l(i, 6);
        G = new l(i, 7);
        H = new l(i, 8);
        I = new l(i, 9);
        J = new l(i, 10);
        K = new l(i, 11);
        L = new l(i, 12);
        M = new l(i, 13);
        N = new l(i, 14);
        O = new l(i, 15);
        P = new l(i, 16);
        Q = new l(i, 17);
        R = new l(i, 18);
        S = new l(i, 19);
        T = new l(i, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        kotlin.d dVar;
        switch (this.y) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = kotlin.collections.w.e;
                }
                return kotlin.collections.p.O(collection, list);
            case 1:
                return (androidx.compose.ui.autofill.e) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 3:
                return (androidx.compose.ui.autofill.p) obj;
            case 4:
                return (androidx.compose.ui.autofill.q) obj;
            case 5:
                return (kotlin.y) obj;
            case 6:
                return (kotlin.y) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (kotlin.y) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                j jVar = (j) obj;
                int i = ((j) obj2).a;
                return jVar;
            case 12:
                return (n0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 15:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.a) == null) {
                    str = aVar2.a;
                }
                if (aVar == null || (dVar = aVar.b) == null) {
                    dVar = aVar2.b;
                }
                return new a(str, dVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                s sVar = (s) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                n nVar = ((s) obj).d;
                z zVar = w.t;
                Object objG = nVar.e.g(zVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = sVar.d.e.g(zVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
