package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        androidx.core.view.c hVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                hVar = new androidx.compose.ui.scrollcapture.h(clipData, 3);
            } else {
                androidx.core.view.d dVar = new androidx.core.view.d();
                dVar.b = clipData;
                dVar.c = 3;
                hVar = dVar;
            }
            androidx.core.view.s0.i(textView, hVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        androidx.core.view.c hVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new androidx.compose.ui.scrollcapture.h(clipData, 3);
        } else {
            androidx.core.view.d dVar = new androidx.core.view.d();
            dVar.b = clipData;
            dVar.c = 3;
            hVar = dVar;
        }
        androidx.core.view.s0.i(view, hVar.build());
        return true;
    }
}
