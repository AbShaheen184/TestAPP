package com.google.firebase.sessions;

import android.os.Build;
import androidx.compose.runtime.s2;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.attribute.FileAttribute;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static androidx.datastore.core.z a(androidx.datastore.core.x0 x0Var, androidx.compose.ui.draw.i iVar, CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar) {
        kotlin.collections.w wVar = kotlin.collections.w.e;
        kotlin.coroutines.d dVar = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            coroutineScope.getClass();
            return new androidx.datastore.core.z(new androidx.datastore.core.d0(x0Var, new s2(coroutineScope, 6), aVar), kotlin.collections.q.j(new androidx.activity.compose.p(wVar, dVar, 24)), iVar, coroutineScope);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            coroutineScope.getClass();
            return new androidx.datastore.core.z(new androidx.datastore.core.d0(x0Var, new androidx.compose.ui.text.y(18), aVar), kotlin.collections.q.j(new androidx.activity.compose.p(wVar, dVar, 24)), iVar, coroutineScope);
        }
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.l.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            kotlinx.coroutines.future.a.x(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            kotlinx.coroutines.future.a.x(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(FileRetargetClass.toPath(parentFile), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }
}
