package deneme.allertdialoginternetkontrol;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by PC on 15.07.2017.
 */

public class Utility {
    public static boolean hasInternetConnection(Context paramContext){

        ConnectivityManager connectivityManager=(ConnectivityManager) paramContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo internetBilgisi=connectivityManager.getActiveNetworkInfo();

        if (internetBilgisi != null && internetBilgisi.isConnectedOrConnecting()) {

            return true;
        }
        else {
            return false;
        }
    }
}
