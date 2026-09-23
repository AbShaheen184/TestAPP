package androidx.media3.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends androidx.recyclerview.widget.v {
    public final String[] d;
    public final float[] e;
    public int f;
    public final /* synthetic */ v g;

    public n(v vVar, String[] strArr, float[] fArr) {
        this.g = vVar;
        this.d = strArr;
        this.e = fArr;
    }

    @Override // androidx.recyclerview.widget.v
    public final int a() {
        return this.d.length;
    }

    @Override // androidx.recyclerview.widget.v
    public final void c(androidx.recyclerview.widget.p0 p0Var, final int i) {
        r rVar = (r) p0Var;
        View view = rVar.v;
        View view2 = rVar.a;
        String[] strArr = this.d;
        if (i < strArr.length) {
            rVar.u.setText(strArr[i]);
        }
        if (i == this.f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                n nVar = this.e;
                v vVar = nVar.g;
                int i2 = nVar.f;
                int i3 = i;
                if (i3 != i2) {
                    vVar.setPlaybackSpeed(nVar.e[i3]);
                }
                vVar.O.dismiss();
            }
        });
    }

    @Override // androidx.recyclerview.widget.v
    public final androidx.recyclerview.widget.p0 d(ViewGroup viewGroup) {
        return new r(LayoutInflater.from(this.g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
