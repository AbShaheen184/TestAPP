package org.mozilla.javascript;

import org.mozilla.javascript.ast.AstNode;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Parser.Transformer, ContextAction {
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj) {
        this.e = obj;
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(Context context) {
        return JavaAdapter.lambda$runScript$1((Script) this.e, context);
    }

    @Override // org.mozilla.javascript.Parser.Transformer
    public Node transform(AstNode astNode) {
        return ((IRFactory) this.e).transform(astNode);
    }
}
