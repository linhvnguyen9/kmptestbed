interface SecurityChecker {
    fun isPinSetup(): Boolean
}

expect class SecurityCheckerImpl(): SecurityChecker