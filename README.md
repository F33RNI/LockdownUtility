# 🔒 LockdownUtility

## ❓ About

Simple app that
calls <https://developer.android.com/reference/android/app/admin/DevicePolicyManager#lockNow()>

- You can lock device via Termux / any other terminal emulator

  ```shell
  am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or via ADB shell

  ```shell
  adb shell am start -n com.f3rni.lockdownutility/.LockActivity
  ```

- Or by pressing "Lock now" button on the main activity

  <img src="https://raw.githubusercontent.com/F33RNI/LockdownUtility/refs/heads/main/screenshot.png" height="400">

## ⬇️ Download

<https://github.com/F33RNI/LockdownUtility/releases/latest>
