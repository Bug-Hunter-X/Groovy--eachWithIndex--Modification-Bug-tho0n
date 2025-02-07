```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (index == 2) {
      list.remove(element)
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```