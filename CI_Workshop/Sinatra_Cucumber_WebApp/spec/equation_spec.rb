require 'equation'

RSpec.describe Equation do
  it "obtains th two solutions of x^2 + 4x + 4" do
    equation = Equation.new
    equation.a = 1
    equation.b = 4
    equation.c = 4

    expect(equation.x1).to eq(-2)
    expect(equation.x2).to eq(-2)
  end

  context 'equations with solutions' do
    data = [
      { :inputs => { :a => 1, :b => 4, :c => 4 }, :expected => { :x1 => -2, :x2 => -2} },
      { :inputs => { :a => 1, :b => 8, :c => 16}, :expected => { :x1 => -4, :x2 => -4} },
      { :inputs => { :a => 1, :b => 6, :c => 9 }, :expected => { :x1 => -3, :x2 => -3} }
    ]

    data.each do | equation |
      inputs = equation[:inputs]
      expected = equation[:expected]
      it "The solutions of equation #{inputs[:a]}x^2 + #{inputs[:b]}x + #{inputs[:c]} are X1=#{equation[:expected][:x1]} and X2=#{equation[:expected][:x2]}" do
        equation = Equation.new
        equation.a = inputs[:a]
        equation.b = inputs[:b]
        equation.c = inputs[:c]

        expect(equation.x1).to eq(expected[:x1])
        expect(equation.x2).to eq(expected[:x2])
      end
    end
  end
end

