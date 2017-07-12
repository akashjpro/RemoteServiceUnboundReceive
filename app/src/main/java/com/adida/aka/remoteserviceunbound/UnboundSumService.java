package com.adida.aka.remoteserviceunbound;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Aka on 7/13/2017.
 */

public class UnboundSumService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String numA = intent.getStringExtra(Def.KEY_A);
        String numB = intent.getStringExtra(Def.KEY_B);
        int result = Integer.parseInt(numA) + Integer.parseInt(numB);
        Toast.makeText(this, "Sum: "+ result, Toast.LENGTH_SHORT).show();
        return START_NOT_STICKY;
    }
}
