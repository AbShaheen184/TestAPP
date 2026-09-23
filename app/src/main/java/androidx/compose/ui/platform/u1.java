package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public u1(Context context, p pVar) {
        this.a = 0;
        this.d = pVar;
        this.c = 0;
        this.e = new GestureDetector(context, new t1(this));
    }

    public static u1 b(char c) {
        return new u1(new com.google.android.material.behavior.d(new com.google.common.base.b(c)));
    }

    public static u1 c(String str) {
        _COROUTINE.a.n("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? b(str.charAt(0)) : new u1(new androidx.emoji2.text.r(str, false));
    }

    public void a(int i) {
        switch (this.a) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((androidx.appcompat.widget.z0) this.d);
                        this.b = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((androidx.work.p) this.d);
                        this.b = true;
                    }
                    break;
                }
                break;
        }
    }

    public List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itB = ((com.google.common.base.p) this.e).b(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.google.common.base.n nVar = (com.google.common.base.n) itB;
            if (!nVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) nVar.next());
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.c >= 0) {
                    sb.append(" #");
                    sb.append(this.c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(com.google.common.base.p pVar) {
        this(pVar, false, com.google.common.base.c.M, Integer.MAX_VALUE);
        this.a = 4;
    }

    public u1(androidx.fragment.app.h hVar) {
        this.a = 1;
        hVar.getClass();
        this.d = new ArrayList();
        this.c = -1;
        this.e = hVar;
    }

    public u1(SideSheetBehavior sideSheetBehavior) {
        this.a = 3;
        this.e = sideSheetBehavior;
        this.d = new androidx.work.p(this, 4);
    }

    public u1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 2;
        this.e = bottomSheetBehavior;
        this.d = new androidx.appcompat.widget.z0(this, 27);
    }

    public u1(com.google.common.base.p pVar, boolean z, kotlin.math.a aVar, int i) {
        this.a = 4;
        this.e = pVar;
        this.b = z;
        this.d = aVar;
        this.c = i;
    }
}
