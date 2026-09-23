package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Closeable {
    public final URL e;
    public volatile Future y;
    public com.google.android.gms.tasks.s z;

    public i(URL url) {
        this.e = url;
    }

    public final Bitmap a() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.e;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            kotlinx.coroutines.future.a.w("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrJ = u.j(new com.android.volley.toolbox.b(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrJ.length + " bytes from " + url);
            }
            if (bArrJ.length > 1048576) {
                kotlinx.coroutines.future.a.w("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrJ, 0, bArrJ.length);
            if (bitmapDecodeByteArray == null) {
                kotlinx.coroutines.future.a.x(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.cancel(true);
    }
}
