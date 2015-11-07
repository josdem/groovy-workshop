//Assert siempre evalua a Groovy truth
//False es considerado 0 o null o cadena vacía
def n = 12
assert n == 12

def hola = ''
assert !hola

//Operador ternario
def z = 'hola'
x = z ? z : 'otra cosa'
println x

//Operador Elvis
def y = 'hola'
x = y ?: 'otra cosa'
println x

//Null safe
//En esta expresion valida que la variable nullSafe no sea null, si no lo es ejecuta size.
def nullSafe = null
println nullSafe?.size().toString()

