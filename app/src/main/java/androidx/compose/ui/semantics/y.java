package androidx.compose.ui.semantics;

import androidx.compose.ui.graphics.n0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final /* synthetic */ kotlin.reflect.j[] a;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        kotlin.jvm.internal.a0.a.getClass();
        a = new kotlin.reflect.j[]{nVar, new kotlin.jvm.internal.n("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new kotlin.jvm.internal.n("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.n("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new kotlin.jvm.internal.n("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new kotlin.jvm.internal.n("fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;"), new kotlin.jvm.internal.n("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new kotlin.jvm.internal.n("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.n("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.n("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.n("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new kotlin.jvm.internal.n("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new kotlin.jvm.internal.n("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new kotlin.jvm.internal.n("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new kotlin.jvm.internal.n("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;"), new kotlin.jvm.internal.n("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        z zVar = w.a;
        z zVar2 = m.a;
    }

    public static void a(a0 a0Var, kotlin.jvm.functions.l lVar) {
        a0Var.b(m.a, new a(null, lVar));
    }

    public static void b(a0 a0Var, kotlin.jvm.functions.l lVar) {
        a0Var.b(m.h, new a(null, lVar));
    }

    public static final void c(a0 a0Var, String str) {
        z zVar = w.a;
        a0Var.b(w.a, kotlin.collections.q.j(str));
    }

    public static final void d(a0 a0Var, int i) {
        z zVar = w.y;
        kotlin.reflect.j jVar = a[14];
        a0Var.b(zVar, new j(i));
    }

    public static final void e(a0 a0Var, n0 n0Var) {
        z zVar = w.a;
        z zVar2 = w.P;
        kotlin.reflect.j jVar = a[28];
        a0Var.b(zVar2, n0Var);
    }

    public static final void f(a0 a0Var, androidx.compose.ui.state.a aVar) {
        z zVar = w.a;
        z zVar2 = w.J;
        kotlin.reflect.j jVar = a[25];
        a0Var.b(zVar2, aVar);
    }

    public static final void g(a0 a0Var) {
        z zVar = w.m;
        kotlin.reflect.j jVar = a[6];
        a0Var.b(zVar, Boolean.TRUE);
    }
}
