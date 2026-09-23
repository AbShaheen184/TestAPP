package kotlinx.coroutines.internal;

import kotlin.jvm.functions.l;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<l>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: computeValue, reason: avoid collision after fix types in other method */
        public l computeValue2(Class<?> cls) {
            cls.getClass();
            return ExceptionsConstructorKt.createConstructor(cls);
        }

        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ l computeValue(Class cls) {
            return computeValue2((Class<?>) cls);
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public l get(Class<? extends Throwable> cls) {
        return cache.get(cls);
    }
}
