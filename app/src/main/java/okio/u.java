package okio;

import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.Paths;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends t {
    public static Long d0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // okio.t, okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) {
        x xVarD;
        xVar.getClass();
        Path path = Paths.get(xVar.e.u(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = x.y;
                xVarD = com.google.android.gms.measurement.internal.b0.d(symbolicLink.toString());
            } else {
                xVarD = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lD0 = fileTimeCreationTime != null ? d0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lD1 = fileTimeLastModifiedTime != null ? d0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new androidx.constraintlayout.core.widgets.analyzer.e(zIsRegularFile, zIsDirectory, xVarD, lValueOf, lD0, lD1, fileTimeLastAccessTime != null ? d0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.t, okio.k
    public final void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        try {
            Path path = Paths.get(xVar.e.u(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(xVar2.e.u(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            kotlinx.coroutines.future.a.w("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // okio.t
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
