package androidx.compose.ui.text.android;

import android.app.PictureInPictureUiState;
import android.os.Build;
import android.text.StaticLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static com.google.android.material.shape.f b(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new com.google.android.material.shape.f(4);
        }
        if (i < 31) {
            return new com.google.android.material.shape.f(4);
        }
        pictureInPictureUiState.isStashed();
        return new com.google.android.material.shape.f(4);
    }

    public static void c(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
