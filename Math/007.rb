N,X,Y = gets.split.map(&:to_i)

puts N/X + N/Y - N/X.lcm(Y)