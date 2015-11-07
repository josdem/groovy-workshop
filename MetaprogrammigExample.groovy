String.metaClass.thisMethodNotExist = { -> "Here I am"}
String s = "Hello World"

 println s.class
 println s.thisMethodNotExist()
 println s.class
