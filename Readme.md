#Demo project to show how Intellij Idea fails to use editorconfig

This project is created to demonstrate, that Intellij Idea 
does not use preferences provided in .editorconfig
and uses internal preferences instead.

There are 3 properties in .editorconfig file

```
root=true
[*]
ij_formatter_off_tag = @formatter:off
ij_formatter_on_tag = @formatter:on
ij_formatter_tags_enabled = true
```

Those properties are supposed to activate __Enable formatter markers in comments__
feature. This feature allows to turn off auto formatting for a group of
successive lines.

So auto formatted shouldn't do anything to a code like that
``` java
    public static void main(String[] args) {
        String properlyIndentedString = "properly indented string";
        //@formatter:off
            String badlyIndentedString = "badly indented string";
        //@formatter:on
    }
```

But auto formatter always changes the indentation of badly indented string

To be more formal

## Steps to reproduce

1. Make sure EditorConfig support is enabled
2. Reformat Code in org.example.EditoryConfigFailDemo
   You can either left mouse click on the class or 
   press Ctrl + Alt + L , both ways reporduce the issue.

## Expected result

Nothing is changed and badly indented string on line 7 keeps it's 
indentation.

## Actual result

Baldy indented string changes it's indentation to the same as 
properly indented string.