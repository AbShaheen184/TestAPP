package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.media3.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements View.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewGroup y;

    public /* synthetic */ e2(ViewGroup viewGroup, int i) {
        this.e = i;
        this.y = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.e) {
            case 0:
                h2 h2Var = ((Toolbar) this.y).k0;
                androidx.appcompat.view.menu.k kVar = h2Var == null ? null : h2Var.y;
                if (kVar != null) {
                    kVar.collapseActionView();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.y;
                HashMap map = trackSelectionView.D;
                boolean z = true;
                if (view == trackSelectionView.z) {
                    trackSelectionView.I = true;
                    map.clear();
                } else if (view == trackSelectionView.A) {
                    trackSelectionView.I = false;
                    map.clear();
                } else {
                    trackSelectionView.I = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    androidx.media3.ui.q0 q0Var = (androidx.media3.ui.q0) tag;
                    androidx.media3.common.b1 b1Var = q0Var.a;
                    androidx.media3.common.w0 w0Var = b1Var.b;
                    int i = q0Var.b;
                    androidx.media3.common.x0 x0Var = (androidx.media3.common.x0) map.get(w0Var);
                    if (x0Var == null) {
                        if (!trackSelectionView.F && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(w0Var, new androidx.media3.common.x0(w0Var, com.google.common.collect.h0.s(Integer.valueOf(i))));
                    } else {
                        ArrayList arrayList = new ArrayList(x0Var.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.E && b1Var.c;
                        if (!z2 && (!trackSelectionView.F || trackSelectionView.C.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i));
                            if (arrayList.isEmpty()) {
                                map.remove(w0Var);
                            } else {
                                map.put(w0Var, new androidx.media3.common.x0(w0Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i));
                                map.put(w0Var, new androidx.media3.common.x0(w0Var, arrayList));
                            } else {
                                map.put(w0Var, new androidx.media3.common.x0(w0Var, com.google.common.collect.h0.s(Integer.valueOf(i))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
