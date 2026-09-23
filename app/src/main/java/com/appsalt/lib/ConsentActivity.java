package com.appsalt.lib;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.appsalt.internal.z;
import com.appsalt.ui.ConsentUiActivity;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ConsentActivity extends Activity {
    public z e;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        SharedPreferences.Editor editorEdit;
        boolean z;
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                z zVar = this.e;
                editorEdit = (zVar != null ? zVar : null).a.edit();
                z = false;
            }
            finish();
        }
        z zVar2 = this.e;
        editorEdit = (zVar2 != null ? zVar2 : null).a.edit();
        z = true;
        editorEdit.putBoolean("didConsent", z).apply();
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = new z(getApplicationContext(), 0);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) ConsentUiActivity.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i = extras.getInt("backgroundColor", -1);
            if (i != -1) {
                intent.putExtra("backgroundColor", i);
            }
            int i2 = extras.getInt("textColor", -1);
            if (i2 != -1) {
                intent.putExtra("textColor", i2);
            }
            int i3 = extras.getInt("buttonTextColor", -1);
            if (i3 != -1) {
                intent.putExtra("buttonTextColor", i3);
            }
            int i4 = extras.getInt("linksColor", -1);
            if (i4 != -1) {
                intent.putExtra("linksColor", i4);
            }
            int i5 = extras.getInt("buttonBackgroundRes", -1);
            if (i5 != -1) {
                intent.putExtra("buttonBackgroundRes", i5);
            }
        }
        startActivityForResult(intent, 11);
    }
}
