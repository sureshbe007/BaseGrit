package com.example.ideaplunge.basegrit.utils;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.widget.Toast;

public class CommonUtil {

  private Context mContext;


  private static  final String TAG= CommonUtil.class.getSimpleName();

  public CommonUtil(Context mContext) {
    this.mContext = mContext;
  }


   // Network detection

  public static boolean isInternetAvailable(Context ctx) {

    ConnectivityManager connectivityManager = (ConnectivityManager) ctx.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    if (networkInfo != null && networkInfo.isConnected()) {
      return true;
    }

    return false;
  }

    @SuppressWarnings("deprecation")
  // Find Network Types
  public static int getDataConnectionType(Context ctx) {

    ConnectivityManager connectivityManager = (ConnectivityManager) ctx.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

    if (connectivityManager != null && connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE) != null) {
      if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) {
        return ConnectivityManager.TYPE_MOBILE;
      } else if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) {
        return ConnectivityManager.TYPE_WIFI;
      } else
        return -1;
    } else
      return -1;

  }

    //  Find SdCard Mound
  public static boolean isSdCardMounted() {
    String status = Environment.getExternalStorageState();

    if (status != null && status.equals(Environment.MEDIA_MOUNTED)) {
      return true;
    }

    return false;
  }


 // Get Android OS Version
  public static String getOsVersion() {
    return Build.VERSION.RELEASE;
  }


  // Get Appliucation Version
  @SuppressWarnings("deprecation")
  public static int getApplicationVersionCode(Context ctx) {

    int versionCode = 0;

    try {
      versionCode = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).versionCode;
    } catch (PackageManager.NameNotFoundException e) {
      e.printStackTrace();
    }

    return versionCode;
  }



}
