[![](https://jitpack.io/v/huxaiphaer/HuxyLab.svg)](https://jitpack.io/#huxaiphaer/HuxyLab)


## HuxyApp

This is a Library which helps developers to come up with cool and awesome toast notifications.

### Try it out today.

### Requirements Used.
1. Android.
2. Java.

## How to set up HuxyApp.

**Step 1.**
-  Add the JitPack repository to your build file as below :

```
  allprojects {
     		repositories {
     			...
     			maven { url 'https://jitpack.io' }
     		}
     	}
``` 

**Step 2.**

- Add the dependency

```
dependencies {
	        implementation 'com.github.huxaiphaer:HuxyLab:Tag'
	}
```

Then "_walaaa_", you are good to go. :)

## How to use the Library.

### For a success Message.

```HuxyApp.successToast(Context,Message,Position,xOffset,yOffset)```

The code above enables a developer to set the Context , Message , Position of the toast , xOffset and yOffset.

So the developer can be able to set the properties of the application. Since this is the Success Toast , it comes with a **GREEN** background color.

##### Below is an example :

```HuxyApp.successToast(MainActivity.this,"Hello world , how are you doing.",Gravity.BOTTOM,0,0)```

### For a danger Message.

Below is the Example of Danger toast, you need to specify the `dangerToast()`. By default this toast's background is **RED**.

```HuxyApp.dangerToast(MainActivity.this,"Hello world , how are you doing.",Gravity.BOTTOM,0,0)```

### For a Warning Message.
Below is the example of a warningToast. You just need to specify the method `warningToast()`. By default this toast's background is **ORANGE**

```HuxyApp.warningToast(MainActivity.this,"Hello world , how are you doing.",Gravity.BOTTOM,0,0)```


If you are happy with the library, please donate.

