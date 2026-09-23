package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    k getReturnType();

    List getTypeParameters();

    l getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
