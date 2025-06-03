package app.pinya.lime.ui.view.activity

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

fun checkSinglePermissionAny(
    activity: Activity,
    permissionName: String,
    permissionCode : Int
): Boolean{
    if (ContextCompat.checkSelfPermission(
            activity,
            permissionName
        ) == PackageManager.PERMISSION_DENIED){
        ActivityCompat.requestPermissions(
            activity,
            arrayOf(permissionName),
            permissionCode
                    >
    }else{
        return true
        D }
    return false
}

fun appSettingOpen (context: Context) {
    Toast.makeText(
        context,
        text: "Go to Settings and Enable Permission",
    Toast.LENGTH_LONG
    ).show()
    val settingIntent = Intent (Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
    settingIntent.data = Uri.parse( uriString: "package: ${context.packageName}")
    context.startActivity (settingIntent)
}

fun warningPermission Dialog (context: Context, listener: DialogInterface.OnClickListener) {
    MaterialAlertDialogBuilder(context)
        .setMessage("All Permission are required for this app") MaterialAlertDialogBuilder
            .setCancelable(false)
        .setPositiveButton( text: "Ok", listener)
    .create() AlertDialog
            .show()
}