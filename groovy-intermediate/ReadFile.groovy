def file = new File("lorem_ipsum.txt")
List lines = file.readLines()
def parrafos = []
file.splitEachLine(" ") { palabra ->
  parrafos << palabra
}

println parrafos.flatten().size()

