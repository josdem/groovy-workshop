class Equation
  attr_accessor :a, :b, :c

  def x1()
    ((-1*@b) + Math.sqrt(discriminant)) / (2*@a)
  end

  def x2()
    ((-1*@b) - Math.sqrt(discriminant)) / (2*@a)
  end

  def discriminant()
    (@b*@b) - (4*@a*@c)
  end

end
