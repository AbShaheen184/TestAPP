package androidx.compose.runtime.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d0;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends RuntimeException {
    public final a e;

    public f(a aVar) {
        this.e = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListO = coil3.network.g.o(aVar);
        int size = arrayListO.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((b) arrayListO.get(i)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.e;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (aVar.a()) {
            kotlin.collections.builders.b bVarG = q.g();
            List list = aVar.a;
            list.getClass();
            d0 d0Var = new d0(list);
            int iB = d0Var.b();
            for (int i2 = 0; i2 < iB; i2++) {
                ((b) d0Var.get(i2)).getClass();
            }
            kotlin.collections.builders.b bVarC = q.c(bVarG);
            bVarC.getClass();
            d0 d0Var2 = new d0(bVarC);
            int iB2 = d0Var2.b();
            while (i < iB2) {
                String str = (String) d0Var2.get(i);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i++;
            }
        } else {
            ArrayList arrayListO = coil3.network.g.o(aVar);
            int size = arrayListO.size();
            while (i < size) {
                b bVar = (b) arrayListO.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(bVar.a);
                sb.append("(SourceFile:1)\n");
                i++;
            }
        }
        return sb.toString();
    }
}
