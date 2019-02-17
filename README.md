[![](https://jitpack.io/v/huxaiphaer/HuxyLab.svg)](https://jitpack.io/#huxaiphaer/HuxyLab)


## HuxyApp

HuxyApp is a Library which helps android developers to come up with cool and awesome  styled toast notifications.

### Try it out today.

### Requirements Used.
1. Android.
2. Java.

##How to set up HuxyApp.

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

	         implementation 'com.github.huxaiphaer:HuxyLab:1.0.0'     
	}
```

Then "_walaaa_", you are good to go. :)

## How to use the Library.

### For a success Message.

```
HuxyApp.successToast(Context, "No internet connection please.");
```

The code above enables a developer to set the Context , Message , Position of the toast , xOffset and yOffset.

So the developer can be able to set the properties of the application. Since this is the Success Toast , it comes with a **GREEN** background color.

##### Below is an example :

```
 HuxyApp.successToast(MainActivity.this, "Logged in Successfully.")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

### For a danger Message.

Below is the Example of Danger toast, you need to specify the `dangerToast()`. By default this toast's background is **RED**.

```
HuxyApp.dangerToast(MainActivity.this, "No internet connection please.")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

### For a Warning Message.
Below is the example of a warningToast. You just need to specify the method `warningToast()`. By default this toast's background is **ORANGE**

```
HuxyApp.warningToast(MainActivity.this, "Weak password please.")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

### For a custom Toast Message.

If you want to come up with your custom message, sucg as changing the **Background** color or the **texColor** etc. you 
have to use the `customToast()`.

Below is the example :

```
 String Bg = "#000000";
        String textColor ="#ffffff";
        HuxyApp.customToast(MainActivity.this, "No internet connection please.",Bg,textColor)
                .setPositionAndOffSet(Gravity.BOTTOM,0,0);

```


*If you are happy with the library, please donate.*

