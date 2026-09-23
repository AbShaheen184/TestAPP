package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class DefiningClassLoader extends ClassLoader implements GeneratedClassLoader {
    private final ClassLoader parentLoader;

    public DefiningClassLoader() {
        this.parentLoader = getClass().getClassLoader();
    }

    @Override // org.mozilla.javascript.GeneratedClassLoader
    public Class<?> defineClass(String str, byte[] bArr) {
        return super.defineClass(str, bArr, 0, bArr.length, SecurityUtilities.getProtectionDomain(getClass()));
    }

    @Override // org.mozilla.javascript.GeneratedClassLoader
    public void linkClass(Class<?> cls) {
        resolveClass(cls);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass == null) {
            ClassLoader classLoader = this.parentLoader;
            clsFindLoadedClass = classLoader != null ? classLoader.loadClass(str) : findSystemClass(str);
        }
        if (z) {
            resolveClass(clsFindLoadedClass);
        }
        return clsFindLoadedClass;
    }

    public DefiningClassLoader(ClassLoader classLoader) {
        this.parentLoader = classLoader;
    }
}
