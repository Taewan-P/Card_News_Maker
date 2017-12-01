<!-- Coding Guidelines -->
<!-- Welcome to the Card_News_Making_Tool wiki! -->

## Git
We prefer `merge`

Most work happens directly on the master branch. 

## Names
* Use PascalCase for `identifier` names
* Use camelCase for `method` names
* Use camelCase for `property names` and `local variables`
* Use whole words in names when possible

<!-- ## Types
---
# 같이 정해야 할듯 빼도 될 거 같다..
* Do not export `types` or `functions` unless you need to share it across multiple components
* Do not introduce new `types` or `values` to the global namespace -->

## Strings
Use only "double quotes" for strings
<!-- * All strings visible to the user need to be externalized 이게 무슨 말이래 -->

</br>
</br>
</br>

# Style
In order to keep the code consistent, please use the following conventions.

From here on `good` and `bad` are used to attribute things that would make the coding style match, or not match.

## Indentation
We use tabs, not spaces.

good:

    public class SubClass extends SuperClass {

        public void methodEx() {
            // something
        }
        // something
    }


bad:

    public class MyClass {
        public void myMethod() {
            // something
        }
        // something
    } 


if:

    if (conditional) {
        // something
    } else if (conditional) {
        // something
    } else {
        // something
    }


switch:

    switch (a) {
        case 'a':
            break;
        case 'b':
            // something
            break;
    }


for:

    for (int i = 0; i < n; i++) {
        // something
    }


while:

    while (conditional) {
        // something
    }


## Performance and Readability
It is more important to be correct than to be fast.

It is more important to be maintainable than to be fast.

## Spaces
No space before an opening parenthesis when calling methods, or indexing, like this:

    method(parameter);
    array[];
    ArrayList<>;


Do not put a space after the opening parenthesis and the closing one

good:

    myMethod(a);
    myArray[5];


bad:

    myMethod( a );
    myArray[ 10 ];


When you use `for`, please write statement inside parenthesis like this:


    for (int i = 0; i < n; i++){
        // something
    }


## Braces
Inside a code block, put the opening brace on the same line

good:

    public void methodEx() {
            // something
            // something
        }


ok:

    public void methodEx() { code (); }


bad:

    public void methodEx()
    {
        // something
        // something
    }


Use a space before an opening parenthesis when calling control blocks, like this:

good:

    if (conditional) { code(); }
    for (;;) { code(); }
    switch (a) { code(); }
    while (conditional) { code(); }


bad:

    if(conditional){code();}



## Multiline Comments
For long, multiline comments use either:

    /**
    * comment
    * Blah
    * Blah again
    */


Or:

    // Blah
    // Blah again
    // fin


## Tags
<!-- 꺽새 닫을 때 띄어쓰기 하고 안하는 것도 말하고 싶다... -->
If there is another tag inside a tag:

good:

    <LinearLayout
        // something
        // something>

        <another tag>
            <other tag
            // something />
        </another tag>
    </LinerLayout>


bad:

    <RelativeLayout
        // something
        />

    <LinearLayout // something>
    </LinearLayout>

    <LinearLayout
        // something >
    </LinearLayout>


otherwise:

good:

    <ImageView
        // something
        // something />


bad:

    <Button // something />

    <TextView
        // something>
    </TextView>

    <ImageView
        // something
        // something/> 


ok only <colo>, <dimen>, <string>, <item>:

    <color name="color">#000000</color>
    <dimen name="margin">10dp</dimen>
    <string name="string">string</string>
    <item name="item">true</item>


## Attributes
Don't use space

good:

    android:layout_width="match_parent"


bad:

    android: layout_height = "match_parent"
