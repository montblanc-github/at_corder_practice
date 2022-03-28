N,M,X = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)

ans = []

ans << a.select{|i| i > X}.count

ans << a.select{|i| i < X}.count

puts ans.min
