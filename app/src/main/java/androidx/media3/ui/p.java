package androidx.media3.ui;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.recyclerview.widget.p0 {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ v x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, View view) {
        super(view);
        this.x = vVar;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_main_text);
        this.v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new h(this, 2));
    }
}
