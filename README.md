# PandaLogger
![](https://jitpack.io/v/mrabelwahed/PandaLogger.svg)

Android Logger for common analytics services like Amplitude, MixPanel, FLurry,...etc and more

-- [Under Development , it is not ready to use]

- Setup

Add it in your root build.gradle at the end of repositories:

``` 
allprojects {

		repositories {
			
			maven { url 'https://jitpack.io' }
			
		}
	} 
```
  
- Add the core dependency

```
dependencies {

	        implementation 'com.github.mrabelwahed.PandaLogger:panda-logger:1.4'
		
}
```

- To Add Amplitude Service 
```
dependencies {

	 implementation 'com.github.mrabelwahed.PandaLogger:amplitude-analytics:1.4'
	 
	}
```
