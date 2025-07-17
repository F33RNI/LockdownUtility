# 🔒 LockdownUtility

## ❓ About

Simple app that
calls <https://developer.android.com/reference/android/devicelock/DeviceLockManager#lockDevice(java.util.concurrent.Executor,%20android.os.OutcomeReceiver%3Cjava.lang.Void,java.lang.Exception%3E)>

- You can lock device via Termux / any other terminal emulator

  ```shell
  $ am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or via ADB shell

  ```shell
  $ adb shell am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or by pressing "Lock now" button on the main activity

![Screenshot](https://github.com/F33RNI/LockdownUtility/screenshot.png)

## ⬇️ Download

<https://github.com/F33RNI/LockdownUtility/releases/latest>
