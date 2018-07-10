## [Kotlin Android Extensions](https://kotlinlang.org/docs/tutorials/android-plugin.html)

### View Binding

##### Configuring the Dependency

All you need is to enable the Android Extensions Gradle plugin in your module's build.gradle file:

```java
apply plugin: 'kotlin-android-extensions'
```

##### Importing synthetic properties

It is convenient to import all widget properties for a specific layout in one go:

```java
import kotlinx.android.synthetic.main.<layout>.*
```

If we want to call the synthetic properties on View, if your class extends from View or subclasses, we should also import

```java
kotlinx.android.synthetic.main.activity_main.view.*
```

##### XMl

布局文件

```xml
<TextView
    android:id="@+id/hello"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"/>
```

##### 在activity中设值

There will be a property named hello

```java
activity.hello.text = "Hello World!"
```
