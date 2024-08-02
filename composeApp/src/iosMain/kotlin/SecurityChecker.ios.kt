import kotlinx.cinterop.ExperimentalForeignApi
import platform.LocalAuthentication.LAContext
import platform.LocalAuthentication.LAPolicyDeviceOwnerAuthentication

actual class SecurityCheckerImpl actual constructor() : SecurityChecker {
    @OptIn(ExperimentalForeignApi::class)
    override fun isPinSetup(): Boolean {
        val context = LAContext()
        return context.canEvaluatePolicy(LAPolicyDeviceOwnerAuthentication, null)
    }
}