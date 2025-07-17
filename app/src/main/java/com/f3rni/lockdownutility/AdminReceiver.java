package com.f3rni.lockdownutility;

import android.content.Context;
import android.content.Intent;
import android.app.admin.DeviceAdminReceiver;
import android.os.UserHandle;

import androidx.annotation.NonNull;

public class AdminReceiver extends DeviceAdminReceiver {
    @Override
    public void onPasswordFailed(@NonNull Context context, @NonNull Intent intent, @NonNull UserHandle user) {
    }
}