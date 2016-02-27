class Person {
  String name
  int age
}
def p = new Person(name:'josdem', age:35)
assert p.properties.keySet().containsAll(['name','age'])

