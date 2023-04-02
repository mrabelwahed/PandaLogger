# PandaLogger
Android Logger for common analytics services like Amplitude, MixPanel, FLurry,...etc and more[Under Development]

- Setup

Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Add the dependency

dependencies {
	        implementation 'com.github.mrabelwahed.PandaLogger:amplitude-analytics:1.2'
	}
