
#Mytracker
-keep class com.my.tracker.** { *; }
-dontwarn com.my.tracker.**
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient {
    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info getAdvertisingIdInfo(android.content.Context);
}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient$Info {
    java.lang.String getId();
    boolean isLimitAdTrackingEnabled();
}
-keep class com.android.installreferrer.** { *; }
-keep class com.android.vending.billing.** { *; }
-keep class com.android.billingclient.api.** { *; }



# Retrofit
-keep class com.google.gson.** { *; }
-keep public class com.google.gson.** {public private protected *;}
-keep class com.google.inject.** { *; }
-keep class org.apache.http.** { *; }
-keep class retrofit.** { *; }
-keepattributes *Annotation*
-keepattributes Signature
-dontwarn com.squareup.okhttp.*

#Onesignal
-dontwarn com.onesignal.**
-keep class com.onesignal.ActivityLifecycleListenerCompat** {*;}

#Coroutines
-keep class kotlinx.coroutines.**
-dontwarn kotlinx.coroutines.**


# Facebook
-keep class com.facebook.** {
   *;
}

# OkHttp
-keep class com.squareup.okhttp.** { *; }
-dontwarn com.squareup.okhttp.**
-dontwarn okhttp3.**
#AppsFlyer
-keep class com.appsflyer.** { *; }
-keep public class com.android.installreferrer.** { *; }

-keep class com.mvffg.** { *; }
-dontwarn okio.**
-keepclassmembers class * {
    @com.squareup.moshi.FromJson <methods>;
    @com.squareup.moshi.ToJson <methods>;
}
-keep class com.example.models.data.** {*;}

-keepclasseswithmembers class * {
    @com.squareup.moshi.* <methods>;
}
-keep @com.squareup.moshi.JsonQualifier interface *
-keepclassmembers class kotlin.Metadata {
    public <methods>;
}

-keepnames @kotlin.Metadata class com.myapp.packagename.model.**
-keep class com.myapp.packagnename.model.** { *; }
-keepclassmembers class com.myapp.packagename.model.** { *; }
-keep class com.squareup.moshi.** { *; }
