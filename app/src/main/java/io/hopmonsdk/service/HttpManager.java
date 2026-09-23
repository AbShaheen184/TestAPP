package io.hopmonsdk.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import androidx.compose.ui.input.pointer.util.b;
import androidx.work.impl.k;
import com.android.volley.d;
import com.android.volley.f;
import com.android.volley.toolbox.c;
import com.google.firebase.heartbeatinfo.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class HttpManager {
    private static final String TAG = "HttpManager";
    private Context mContext;
    private c mImageLoader;
    private f mRequestQueue = getRequestQueue();

    public HttpManager(Context context) {
        this.mContext = context;
        new Object() { // from class: io.hopmonsdk.service.HttpManager.1
            private final LruCache<String, Bitmap> cache = new LruCache<>(20);

            public Bitmap getBitmap(String str) {
                return this.cache.get(str);
            }

            public void putBitmap(String str, Bitmap bitmap) {
                this.cache.put(str, bitmap);
            }
        };
        c cVar = new c();
        new HashMap();
        new HashMap();
        new Handler(Looper.getMainLooper());
        this.mImageLoader = cVar;
    }

    public <T> void addToRequestQueue(d dVar) {
        getRequestQueue().getClass();
        throw null;
    }

    public c getImageLoader() {
        return this.mImageLoader;
    }

    public f getRequestQueue() {
        if (this.mRequestQueue == null) {
            Context applicationContext = this.mContext.getApplicationContext();
            new ArrayList();
            new ArrayList(64);
            f fVar = new f(new b(new k(applicationContext.getApplicationContext(), 7)), new e(19));
            fVar.a();
            this.mRequestQueue = fVar;
        }
        return this.mRequestQueue;
    }

    public void start() {
        f fVar = this.mRequestQueue;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void stop() {
        f fVar = this.mRequestQueue;
        if (fVar != null) {
            com.android.volley.e eVar = new com.android.volley.e() { // from class: io.hopmonsdk.service.HttpManager.2
                @Override // com.android.volley.e
                public boolean apply(d dVar) {
                    return true;
                }
            };
            synchronized (fVar.a) {
                try {
                    Iterator it = fVar.a.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        if (eVar.apply(null)) {
                            throw null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mRequestQueue.b();
        }
    }
}
