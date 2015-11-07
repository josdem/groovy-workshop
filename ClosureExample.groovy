def multiplo(n, closure){
  closure(n)
}

println multiplo(3, { it * 6 })
