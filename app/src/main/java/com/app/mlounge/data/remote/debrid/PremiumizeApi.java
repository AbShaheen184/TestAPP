package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.d;
import retrofit2.http.c;
import retrofit2.http.e;
import retrofit2.http.f;
import retrofit2.http.o;
import retrofit2.http.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface PremiumizeApi {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
    }

    @o("transfer/directdl")
    @e
    Object a(@t("apikey") String str, @c("src") String str2, d<? super PremiumizeDirectDlResponse> dVar);

    @f("account/info")
    Object b(@t("apikey") String str, d<? super PremiumizeUserInfo> dVar);

    @o("transfer/create")
    @e
    Object c(@t("apikey") String str, @c("src") String str2, d<? super PremiumizeTransferResponse> dVar);

    @f("folder/list")
    Object d(@t("apikey") String str, @t("id") String str2, d<? super PremiumizeFolderListResponse> dVar);

    @f("transfer/list")
    Object e(@t("apikey") String str, d<? super PremiumizeTransferList> dVar);
}
