[![](https://jitpack.io/v/huxaiphaer/HuxyLab.svg)](https://jitpack.io/#huxaiphaer/HuxyLab)


# Create a customized toast message with amazing features , with few lines of code Today.

## HuxyApp

HuxyApp is a Library eases creating custom and styled 
toast notifications with few lines of code.

### Try it out today.

### Requirements Used.
1. Android.
2. Java.

## How to set up HuxyApp (Toast Library).

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

Below is the sample of the Toast :

![success_toast_gif](https://user-images.githubusercontent.com/14312249/52917727-ec0f8480-32ff-11e9-8699-4e0d4f87fa33.gif)

##### Below is an example :

```
 HuxyApp.successToast(MainActivity.this, "Good Internet Connection")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

### For a danger Message.

Below is the Example of Danger toast, you need to specify the `dangerToast()`. By default this toast's background is **RED**.


```
HuxyApp.dangerToast(MainActivity.this, "Bad Internet Connection")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

This is an example of the toast message.

![dangertoast](https://user-images.githubusercontent.com/14312249/52917729-f467bf80-32ff-11e9-8783-96a6d3581337.gif)

### For a Warning Message.
Below is the example of a warningToast. You just need to specify the method `warningToast()`. By default this toast's background is **ORANGE**

```
HuxyApp.warningToast(MainActivity.this, "Slow Internet Connection")
                .setPadding(3)
                .setPositionAndOffSet(Gravity.CENTER,0,0);
```

This is an example of a warning message.

![warningtoast](https://user-images.githubusercontent.com/14312249/52917731-fb8ecd80-32ff-11e9-8984-073d575bb7fa.gif)


### For a custom Toast Message.

If you want to come up with your custom message, such as changing the **Background** color or the **texColor** etc. you 
have to use the `customToast()`.

Below is the implementation :

```
 String Bg = "#000000";
        String textColor ="#ffffff";
        HuxyApp.customToast(MainActivity.this, "No internet connection please.",Bg,textColor)
                .setPositionAndOffSet(Gravity.BOTTOM,0,20);

```

Below is a sample of the output.

![customtoast](https://user-images.githubusercontent.com/14312249/52918038-9341eb00-3303-11e9-8821-7a31f76bfc01.gif)

### Setting a custom Font Style For the Toast Message.

This library gives a capability of setting a toast message with a different font style such as Times New Roman,
Calibri, Arial etc. 

Steps to set up a custom font styled toast message.

- Step 1.

Initialize **HuxyApp** and give it an attribute called `setFontStyle(Context,FontPath)`. 

```
HuxyApp.customToast(MainActivity.this, "No internet connection please.",Bg,textColor)
                .setPositionAndOffSet(Gravity.BOTTOM,0,0)
                .setFontStyle(this,R.font.font_name);

```

- Step 2.

Download the font of your choice , you can use [Google Fonts Site](https://fonts.google.com/)

- Step 3.

Then create a folder called **font** inside the *res* folder. e.g *app/src/main/res/font*

- Step 4.

Place any font of your choice , and then run the application. The toast should appear with your font style or type.


Below is the sample of the output.

![custom_font](https://user-images.githubusercontent.com/14312249/52918043-9c32bc80-3303-11e9-9eec-170c170bb101.gif)





### Contribution to the Library.

Feel free to contribute to this Project , by raising Pull Requests (PRs), so that they are reviewed and merged. Contributors could also take the initiative of reviewing other developers PRs.





*If you are happy with the library, please donate.*



### Authors.

- Lutaaya Huzaifah Idris [Personal Profile](https://codementor.io/lutaayahuzaifahidris/)