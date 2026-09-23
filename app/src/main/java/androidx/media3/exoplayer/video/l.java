package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.i0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends HandlerThread implements Handler.Callback {
    public RuntimeException A;
    public m B;
    public androidx.media3.common.util.i e;
    public Handler y;
    public Error z;

    public final void a(int i) throws androidx.media3.common.util.j {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.e.getClass();
        androidx.media3.common.util.i iVar = this.e;
        int[] iArr = iVar.y;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        androidx.media3.common.util.b.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        androidx.media3.common.util.b.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        iVar.z = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, androidx.media3.common.util.i.D, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = i0.a;
        androidx.media3.common.util.b.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(iVar.z, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        androidx.media3.common.util.b.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        iVar.A = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = iVar.z;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            androidx.media3.common.util.b.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        androidx.media3.common.util.b.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        iVar.B = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        androidx.media3.common.util.b.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        iVar.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(iVar);
        SurfaceTexture surfaceTexture2 = this.e.C;
        surfaceTexture2.getClass();
        this.B = new m(this, surfaceTexture2, i != 0);
    }

    public final void b() {
        this.e.getClass();
        androidx.media3.common.util.i iVar = this.e;
        iVar.e.removeCallbacks(iVar);
        try {
            SurfaceTexture surfaceTexture = iVar.C;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, iVar.y, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = iVar.z;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = iVar.z;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = iVar.B;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(iVar.z, iVar.B);
            }
            EGLContext eGLContext = iVar.A;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(iVar.z, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = iVar.z;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(iVar.z);
            }
            iVar.z = null;
            iVar.A = null;
            iVar.B = null;
            iVar.C = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (androidx.media3.common.util.j e) {
                    androidx.media3.common.util.b.g("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.A = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    androidx.media3.common.util.b.g("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.z = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    androidx.media3.common.util.b.g("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.A = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        androidx.media3.common.util.b.g("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
