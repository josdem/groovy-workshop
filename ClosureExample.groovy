def multiplo(n, closure){
  closure(n)
}

println multiplo(3)  { n -> n * 6 }
