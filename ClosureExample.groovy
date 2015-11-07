//Un closure es un bloque de codigo, que puede ser tratado como un objeto que define una estructura de codigo con un valor de retorno.
def multiplo(n, closure){
  closure(n)
}

println multiplo(3)  { n -> n * 6 }
