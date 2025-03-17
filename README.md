
<img src="grizzly.webp" width="50%" height="50%"/>
GrizzlyMonitor is an advanced library designed to handle ANRs (Application Not Responding) and crashes that occur due to third-party integrations, which are beyond your control. This library ensures that these exceptions are managed efficiently and prevents them from being reported to the Google Play Console. With minimal configuration, GrizzlyMonitor provides robust monitoring and handling of ANRs and crashes, making your applications more resilient and stable.

### Key Features:
- ANR Monitoring: Detects when the main thread is busy for more than the specified threshold and raises an exception.
- Crash Handling: Captures unexpected crashes and provides a customizable crash dialog.
- Firebase Crashlytics Integration: Seamlessly integrates with Firebase Crashlytics for enhanced crash reporting.
- Default Configuration: Requires minimal setup with default configurations.
- Customization: Allows customization of ticker interval, ANR threshold, crash dialog title, message, and more.

### Add Dependencies:
Add the GrizzlyMonitor dependency to your build.gradle file
```
implementation("io.github.farimarwat:grizzly:2.4.2")

```

### Setup Tutorial
#### Minimum Setup
For the minimum setup, simply build and start the GrizzlyMonitor with the default configuration.

#### Initialize GrizzlyMonitor:
In your application class, initialize and start the GrizzlyMonitor.

```kotlin
import android.app.Application
import com.farimarwat.grizzly.GrizzlyMonitorBuilder

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize and start GrizzlyMonitor with default settings
        GrizzlyMonitorBuilder(this)
            .build()
            .start()
    }
}

```
This minimal setup is sufficient to start monitoring ANRs and crashes with the default settings.

### Full Setup with Custom Configuration
To utilize all the customizable options available in GrizzlyMonitor, follow the steps below.

```kotlin
import android.app.Application
import com.farimarwat.grizzly.GrizzlyMonitorBuilder
import com.google.firebase.crashlytics.FirebaseCrashlytics

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize Firebase Crashlytics
        val firebaseCrashlytics = FirebaseCrashlytics.getInstance()

        // Initialize and start GrizzlyMonitor with custom settings
        GrizzlyMonitorBuilder(this)
            .withThreshold(3000L) // Set ANR threshold (1000-4500ms)
            .withTitle("App Error") // Set custom crash dialog title
            .withMessage("An error occurred. Please restart.") // Set custom crash dialog message
            .withFirebaseCrashLytics(firebaseCrashlytics) // Integrate with Firebase Crashlytics
            .build()
            .start()
    }
}

```

### Version History
**2.4.2**
- Removed methods:
  - withTicker
  - withNormalCrashEnabled
- Performance Improved
