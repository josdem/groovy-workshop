//Groovy deja un método a todos sus clases que se llama metaClass
String.metaClass.thisMethodNotExist = { -> "Here I am"}
String s = "Hello World"

 println s.class
 println s.thisMethodNotExist()
 println s.class
