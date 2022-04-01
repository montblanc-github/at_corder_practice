N = gets.to_i
a = gets.split.map(&:to_i)
ans = 0

while a.none?{|i| i % 2 != 0}
    a = a.map{|j| j / 2}
    ans += 1
end

puts ans