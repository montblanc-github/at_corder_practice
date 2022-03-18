N = gets.to_i

X = (N/1.08).ceil

puts (X*1.08).floor == N ? X : ":("