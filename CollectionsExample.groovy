def collection = [1,2,3,4,5]
collection = (1..10)
collection = ('a'..'z')

println collection

//Iterando una lista
def list = [1,2,3,4,5]
list.each { println it * 3}

//Agregando elementos a una collection
def otherList = [1,2,3]
otherList.add(4)
otherList << 5
otherList << 6 << 7
intersectList = [3,4]

println otherList
println otherList - [1,2]
println otherList.intersect(intersectList)

