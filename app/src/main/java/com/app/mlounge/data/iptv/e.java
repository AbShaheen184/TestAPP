package com.app.mlounge.data.iptv;

import android.content.Context;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $host;
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ String $password;
    final /* synthetic */ String $port;
    final /* synthetic */ String $username;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, String str, String str2, kotlin.jvm.functions.l lVar2, String str3, String str4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = lVar;
        this.$host = str;
        this.$port = str2;
        this.$onProgress = lVar2;
        this.$username = str3;
        this.$password = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e(this.this$0, this.$host, this.$port, this.$onProgress, this.$username, this.$password, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0250  */
    /* JADX WARN: Code duplicated, block: B:56:0x026f A[LOOP:1: B:54:0x0269->B:56:0x026f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:51:0x024a->B:74:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        List list;
        l lVar;
        Iterator it;
        List list2;
        int i;
        com.app.mlounge.data.local.dao.i iVar;
        ArrayList arrayList;
        Iterator it2;
        String str2 = "Uncategorized";
        String str3 = "category_id";
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) this.L$4;
                kotlin.a.e(obj);
            } else {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$7;
                lVar = (l) this.L$6;
                list2 = (List) this.L$4;
                kotlin.a.e(obj);
            }
            while (it.hasNext()) {
                List list3 = (List) it.next();
                iVar = lVar.channelDao;
                arrayList = new ArrayList(kotlin.collections.r.p(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(l.f(lVar, (IptvChannel) it2.next()));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = list2;
                this.L$5 = null;
                this.L$6 = lVar;
                this.L$7 = it;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                if (((com.app.mlounge.data.local.dao.j) iVar).b(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            kotlin.io.j.j(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "CustomIPTV", "Xtream: " + list2.size() + " channels saved to DB");
            return list2;
        }
        kotlin.a.e(obj);
        l lVar2 = this.this$0;
        String str4 = this.$host;
        String str5 = this.$port;
        lVar2.getClass();
        String strG = l.g(str4, str5);
        this.$onProgress.invoke("Connecting to server...");
        this.$onProgress.invoke("Downloading categories...");
        String strE = l.e(this.this$0, strG + "/player_api.php?username=" + this.$username + "&password=" + this.$password + "&action=get_live_categories");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONArray jSONArray = new JSONArray(strE);
            int length = jSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                str = str2;
                try {
                    String strOptString = jSONObject.optString("category_id");
                    int i4 = length;
                    String strOptString2 = jSONObject.optString("category_name");
                    strOptString.getClass();
                    if (!kotlin.text.k.J(strOptString)) {
                        if (kotlin.text.k.J(strOptString2)) {
                            strOptString2 = str;
                        }
                        linkedHashMap.put(strOptString, strOptString2);
                    }
                    i3++;
                    length = i4;
                    str2 = str;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        str = str2;
        Context context2 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "CustomIPTV", "Xtream: " + linkedHashMap.size() + " categories");
        this.$onProgress.invoke("Downloading channel list...");
        String strE2 = l.e(this.this$0, strG + "/player_api.php?username=" + this.$username + "&password=" + this.$password + "&action=get_live_streams");
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArray2 = new JSONArray(strE2);
            this.$onProgress.invoke("Parsing " + jSONArray2.length() + " channels...");
            int length2 = jSONArray2.length();
            int i5 = 0;
            while (i5 < length2) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                String strOptString3 = jSONObject2.optString("name");
                if (!kotlin.text.k.J(strOptString3)) {
                    String strOptString4 = jSONObject2.optString("stream_id");
                    if (!kotlin.text.k.J(strOptString4)) {
                        String str6 = (String) linkedHashMap.get(jSONObject2.optString(str3));
                        String str7 = str6 == null ? str : str6;
                        String strOptString5 = jSONObject2.optString("stream_icon");
                        String str8 = kotlin.text.k.J(strOptString5) ? null : strOptString5;
                        String strOptString6 = jSONObject2.optString("epg_channel_id");
                        String str9 = kotlin.text.k.J(strOptString6) ? null : strOptString6;
                        arrayList2.add(new IptvChannel(strOptString3, strG + "/live/" + this.$username + "/" + this.$password + "/" + strOptString4 + ".m3u8", str8, str7, l.SLUG, str9));
                    }
                }
                i5++;
                length2 = length2;
                str3 = str3;
            }
        } catch (Exception unused3) {
        }
        this.$onProgress.invoke("Saving " + arrayList2.size() + " channels to database...");
        com.app.mlounge.data.local.dao.i iVar2 = this.this$0.channelDao;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = arrayList2;
        this.label = 1;
        if (((com.app.mlounge.data.local.dao.j) iVar2).a(l.SLUG, this) != aVar) {
            list = arrayList2;
        }
        return aVar;
        ArrayList arrayListW = kotlin.collections.p.w(1000, list);
        lVar = this.this$0;
        it = arrayListW.iterator();
        list2 = list;
        i = 0;
        while (it.hasNext()) {
            List list4 = (List) it.next();
            iVar = lVar.channelDao;
            arrayList = new ArrayList(kotlin.collections.r.p(list4, 10));
            it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(l.f(lVar, (IptvChannel) it2.next()));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list2;
            this.L$5 = null;
            this.L$6 = lVar;
            this.L$7 = it;
            this.L$8 = null;
            this.L$9 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 2;
            if (((com.app.mlounge.data.local.dao.j) iVar).b(arrayList, this) == aVar) {
                return aVar;
            }
        }
        kotlin.io.j.j(new File(this.this$0.playlistDir, "custom_channels.json"), "{}");
        Context context3 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "CustomIPTV", "Xtream: " + list2.size() + " channels saved to DB");
        return list2;
    }
}
