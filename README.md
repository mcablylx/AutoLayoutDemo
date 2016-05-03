# AutoLayoutDemo
自动适配布局.

文字出处:[Android AutoLayout全新的适配方式 堪称适配终结者][1]
Github:[AndroidAutoLayout][2]
---------
# 集成:
```
dependencies {
    compile 'com.zhy:autolayout:1.4.3'
}
```
AndroidManifest中注明设计稿的尺寸。
```
<meta-data android:name="design_width" android:value="768"/>
<meta-data android:name="design_height" android:value="1280"/>
```
让你的Activity继承自AutoLayoutActivity.

# 其他用法
如果你不希望继承AutoLayoutActivity，可以在编写布局文件时，将
 - LinearLayout -> AutoLinearLayout
 - RelativeLayout -> AutoRelativeLayout
 - FrameLayout -> AutoFrameLayout <br>
<br>
这样也可以完成适配。


---------
[1]:http://blog.csdn.net/lmj623565791/article/details/49990941
[2]:https://github.com/hongyangAndroid/AndroidAutoLayout