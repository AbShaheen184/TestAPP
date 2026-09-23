package androidx.media3.ui;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.recyclerview.widget.p0 {
    public final TextView u;
    public final View v;

    public r(View view) {
        super(view);
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_text);
        this.v = view.findViewById(R.id.exo_check);
    }
}
