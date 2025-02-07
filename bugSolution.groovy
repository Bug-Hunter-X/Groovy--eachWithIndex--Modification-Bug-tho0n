```groovy
def myMethod(List<String> list) {
  // Solution 1: Using an iterator
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String element = iterator.next()
    println "Element: $element"
    if (element == 'c') {
      iterator.remove()
    }
  }

  // Solution 2: Creating a copy of the list
  List<String> copyList = new ArrayList<>(list)
  copyList.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (index == 2) {
      copyList.remove(element)
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
println myList //Observe that the original list is unchanged in solution 1 and is changed in solution 2
```