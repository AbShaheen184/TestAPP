package com.app.mlounge.ui.screens.settings;

import androidx.compose.runtime.a1;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.a {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public /* synthetic */ o(int i, File file, String str, a1 a1Var, a1 a1Var2) {
        this.y = i;
        this.B = file;
        this.z = str;
        this.A = a1Var;
        this.C = a1Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                File file = (File) this.B;
                a1 a1Var = (a1) this.C;
                if (this.y == 0) {
                    this.A.setValue(file);
                } else {
                    a1Var.setValue(new kotlin.k(file, this.z));
                }
                break;
            default:
                kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) this.B;
                TmdbEpisode tmdbEpisode = (TmdbEpisode) this.C;
                this.A.setValue(Boolean.FALSE);
                sVar.d("tv", String.valueOf(this.y), this.z, Integer.valueOf(tmdbEpisode.f()), Integer.valueOf(tmdbEpisode.a()));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o(kotlin.jvm.functions.s sVar, int i, String str, TmdbEpisode tmdbEpisode, a1 a1Var) {
        this.B = sVar;
        this.y = i;
        this.z = str;
        this.C = tmdbEpisode;
        this.A = a1Var;
    }
}
