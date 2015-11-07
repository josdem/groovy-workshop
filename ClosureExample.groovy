//Un closure es un bloque de codigo, que puede ser tratado como un objeto que define una estructura de codigo con un valor de retorno.
//El pase de parametros de un closure es por referencia.
def multiplo(n, closure){
  closure(n)
}

println multiplo(3)  { n -> n * 6 }
