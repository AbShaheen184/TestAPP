package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.gson.m {
    public static final h d = new h();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public i(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) field2.getAnnotation(com.google.gson.annotations.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.a.put(str, r4);
                    }
                }
                this.a.put(strName, r4);
                this.b.put(string, r4);
                this.c.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            kotlinx.coroutines.future.a.o(e);
            throw null;
        }
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        Enum r0 = (Enum) this.a.get(strL0);
        return r0 == null ? (Enum) this.b.get(strL0) : r0;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        bVar.h0(r3 == null ? null : (String) this.c.get(r3));
    }
}
