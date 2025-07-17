# 🔒 LockdownUtility

## ❓ About

Simple app that
calls <https://developer.android.com/reference/android/devicelock/DeviceLockManager#lockDevice(java.util.concurrent.Executor,%20android.os.OutcomeReceiver%3Cjava.lang.Void,java.lang.Exception%3E)>

- You can lock device via Termux / any other terminal emulator

  ```shell
  am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or via ADB shell

  ```shell
  adb shell am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or by pressing "Lock now" button on the main activity

  <div style="height:400px;width:auto;text-align:left;">
      <p align="center" style="height:400px;width:auto;text-align:left;">
          <img src="https://raw.githubusercontent.com/F33RNI/LockdownUtility/refs/heads/main/screenshot.png" >
      </p>
  </div>

## ⬇️ Download

<https://github.com/F33RNI/LockdownUtility/releases/latest>
